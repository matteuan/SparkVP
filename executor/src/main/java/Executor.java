import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;

import org.apache.log4j.Logger;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.SparkSession;

import tree.JoinTree;
import tree.ProtobufJoinTree;

/**
 * This class parses the JoinTree,
 * and execute the distributed Yannakakis algorithm (GYM)
 * on top of Spark .
 *
 * @author Matteo Cossu
 */
public class Executor {
	String inputFile;
	String outputDB;
	String databaseName;
	JoinTree convertedTree;
	SparkSession spark;
	SQLContext sqlContext;
	boolean onlyJoins = false;

	// skip the semi joins reductions or not
	public void setOnlyJoins(boolean onlyJoins) {
		this.onlyJoins = onlyJoins;
	}


	private static final Logger logger = Logger.getLogger(Main.class);
	
	public Executor(String inputFile, String outputFile, String databaseName){
		this.inputFile = inputFile;
		this.outputDB = outputFile;
		this.databaseName = databaseName;
		

		// initialize the Spark environment 

		spark = SparkSession
				  .builder()
				  .appName("SparkVP-Executor")
				  .getOrCreate();
		sqlContext = spark.sqlContext();
	}
	
	/*
	 * parseTree reads the input file and it transforms the JoinTree
	 * in a Spark execution plan
	 */
	public void parseTree() {
		ProtobufJoinTree.Node root = null;
		try {
			root = ProtobufJoinTree.Node.parseFrom(
					new FileInputStream(inputFile));
		} catch (FileNotFoundException e) {
			logger.error("Input File Not Found");
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		convertedTree = new JoinTree(root);
		logger.info("JoinTree correctly parsed");
	}
	
	
	/*
	 * execute performs the Spark computation and measure the time required
	 */
	public void execute() {
		if(convertedTree == null){
			logger.error("The JoinTree was not correctly parsed");
			return;
		}
		
		// use the selected Database
		sqlContext.sql("USE "+ this.databaseName);
		logger.info("USE "+ this.databaseName);
		
		
		long totalStartTime = System.currentTimeMillis();
		
		// compute the singular nodes data
		convertedTree.computeSingularNodeData(sqlContext);
		logger.info("COMPUTED singular nodes data");
		
		
		long startTime;
		long executionTime;
		if (!onlyJoins) {
			
			// compute upward semijoins
			startTime = System.currentTimeMillis();
			convertedTree.computeUpwardSemijoins(sqlContext);
			logger.info("COMPUTED upward semijoins");
			executionTime = System.currentTimeMillis() - startTime;
			logger.info("Execution upward SEMI-JOINS: "
					+ String.valueOf(executionTime));
			
			// compute downward semijoins
			startTime = System.currentTimeMillis();
			convertedTree.computeDownwardSemijoins(sqlContext);
			logger.info("COMPUTED downward semijoins");
			executionTime = System.currentTimeMillis() - startTime;
			logger.info("Execution downward SEMI-JOINS: "
					+ String.valueOf(executionTime));
		}
		
		// compute the full joins
		startTime = System.currentTimeMillis();
		Dataset<Row> results = convertedTree.computeJoins(sqlContext);
		logger.info("Joins Computed succesfully");
		
		// save results
		sqlContext.sql("CREATE DATABASE IF NOT EXISTS "+ outputDB);
		String resultsTable = outputDB + "."  + "GYMresults" + String.valueOf(startTime);
		results.write().mode("overwrite").saveAsTable(resultsTable);
		logger.info("Results saved into: " + resultsTable);
		executionTime = System.currentTimeMillis() - startTime;
		logger.info("Execution time JOINS: " + String.valueOf(executionTime));
		
		long totalExecutionTime = System.currentTimeMillis() - totalStartTime;
		logger.info("Total execution time: " + String.valueOf(totalExecutionTime));
	}

}
