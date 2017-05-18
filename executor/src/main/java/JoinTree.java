

public final class JoinTree {
  private JoinTree() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TripleOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .Triple.Element subject = 1;
    /**
     * <code>required .Triple.Element subject = 1;</code>
     */
    boolean hasSubject();
    /**
     * <code>required .Triple.Element subject = 1;</code>
     */
    JoinTree.Triple.Element getSubject();
    /**
     * <code>required .Triple.Element subject = 1;</code>
     */
    JoinTree.Triple.ElementOrBuilder getSubjectOrBuilder();

    // required .Triple.Element predicate = 2;
    /**
     * <code>required .Triple.Element predicate = 2;</code>
     */
    boolean hasPredicate();
    /**
     * <code>required .Triple.Element predicate = 2;</code>
     */
    JoinTree.Triple.Element getPredicate();
    /**
     * <code>required .Triple.Element predicate = 2;</code>
     */
    JoinTree.Triple.ElementOrBuilder getPredicateOrBuilder();

    // required .Triple.Element object = 3;
    /**
     * <code>required .Triple.Element object = 3;</code>
     */
    boolean hasObject();
    /**
     * <code>required .Triple.Element object = 3;</code>
     */
    JoinTree.Triple.Element getObject();
    /**
     * <code>required .Triple.Element object = 3;</code>
     */
    JoinTree.Triple.ElementOrBuilder getObjectOrBuilder();
  }
  /**
   * Protobuf type {@code Triple}
   */
  public static final class Triple extends
      com.google.protobuf.GeneratedMessage
      implements TripleOrBuilder {
    // Use Triple.newBuilder() to construct.
    private Triple(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Triple(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Triple defaultInstance;
    public static Triple getDefaultInstance() {
      return defaultInstance;
    }

    public Triple getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Triple(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              JoinTree.Triple.Element.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = subject_.toBuilder();
              }
              subject_ = input.readMessage(JoinTree.Triple.Element.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(subject_);
                subject_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              JoinTree.Triple.Element.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = predicate_.toBuilder();
              }
              predicate_ = input.readMessage(JoinTree.Triple.Element.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(predicate_);
                predicate_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 26: {
              JoinTree.Triple.Element.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = object_.toBuilder();
              }
              object_ = input.readMessage(JoinTree.Triple.Element.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(object_);
                object_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return JoinTree.internal_static_Triple_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return JoinTree.internal_static_Triple_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              JoinTree.Triple.class, JoinTree.Triple.Builder.class);
    }

    public static com.google.protobuf.Parser<Triple> PARSER =
        new com.google.protobuf.AbstractParser<Triple>() {
      public Triple parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Triple(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Triple> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code Triple.ElementType}
     */
    public enum ElementType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>VARIABLE = 0;</code>
       */
      VARIABLE(0, 0),
      /**
       * <code>CONSTANT = 1;</code>
       */
      CONSTANT(1, 1),
      ;

      /**
       * <code>VARIABLE = 0;</code>
       */
      public static final int VARIABLE_VALUE = 0;
      /**
       * <code>CONSTANT = 1;</code>
       */
      public static final int CONSTANT_VALUE = 1;


      public final int getNumber() { return value; }

      public static ElementType valueOf(int value) {
        switch (value) {
          case 0: return VARIABLE;
          case 1: return CONSTANT;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ElementType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<ElementType>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ElementType>() {
              public ElementType findValueByNumber(int number) {
                return ElementType.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return JoinTree.Triple.getDescriptor().getEnumTypes().get(0);
      }

      private static final ElementType[] VALUES = values();

      public static ElementType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private ElementType(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Triple.ElementType)
    }

    public interface ElementOrBuilder
        extends com.google.protobuf.MessageOrBuilder {

      // required string name = 1;
      /**
       * <code>required string name = 1;</code>
       */
      boolean hasName();
      /**
       * <code>required string name = 1;</code>
       */
      java.lang.String getName();
      /**
       * <code>required string name = 1;</code>
       */
      com.google.protobuf.ByteString
          getNameBytes();

      // required .Triple.ElementType type = 2;
      /**
       * <code>required .Triple.ElementType type = 2;</code>
       */
      boolean hasType();
      /**
       * <code>required .Triple.ElementType type = 2;</code>
       */
      JoinTree.Triple.ElementType getType();
    }
    /**
     * Protobuf type {@code Triple.Element}
     */
    public static final class Element extends
        com.google.protobuf.GeneratedMessage
        implements ElementOrBuilder {
      // Use Element.newBuilder() to construct.
      private Element(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }
      private Element(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

      private static final Element defaultInstance;
      public static Element getDefaultInstance() {
        return defaultInstance;
      }

      public Element getDefaultInstanceForType() {
        return defaultInstance;
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;
      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
          getUnknownFields() {
        return this.unknownFields;
      }
      private Element(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        initFields();
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(input, unknownFields,
                                       extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                bitField0_ |= 0x00000001;
                name_ = input.readBytes();
                break;
              }
              case 16: {
                int rawValue = input.readEnum();
                JoinTree.Triple.ElementType value = JoinTree.Triple.ElementType.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(2, rawValue);
                } else {
                  bitField0_ |= 0x00000002;
                  type_ = value;
                }
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return JoinTree.internal_static_Triple_Element_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return JoinTree.internal_static_Triple_Element_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                JoinTree.Triple.Element.class, JoinTree.Triple.Element.Builder.class);
      }

      public static com.google.protobuf.Parser<Element> PARSER =
          new com.google.protobuf.AbstractParser<Element>() {
        public Element parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Element(input, extensionRegistry);
        }
      };

      @java.lang.Override
      public com.google.protobuf.Parser<Element> getParserForType() {
        return PARSER;
      }

      private int bitField0_;
      // required string name = 1;
      public static final int NAME_FIELD_NUMBER = 1;
      private java.lang.Object name_;
      /**
       * <code>required string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      // required .Triple.ElementType type = 2;
      public static final int TYPE_FIELD_NUMBER = 2;
      private JoinTree.Triple.ElementType type_;
      /**
       * <code>required .Triple.ElementType type = 2;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .Triple.ElementType type = 2;</code>
       */
      public JoinTree.Triple.ElementType getType() {
        return type_;
      }

      private void initFields() {
        name_ = "";
        type_ = JoinTree.Triple.ElementType.VARIABLE;
      }
      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized != -1) return isInitialized == 1;

        if (!hasName()) {
          memoizedIsInitialized = 0;
          return false;
        }
        if (!hasType()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        getSerializedSize();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          output.writeBytes(1, getNameBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeEnum(2, type_.getNumber());
        }
        getUnknownFields().writeTo(output);
      }

      private int memoizedSerializedSize = -1;
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(1, getNameBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream
            .computeEnumSize(2, type_.getNumber());
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSerializedSize = size;
        return size;
      }

      private static final long serialVersionUID = 0L;
      @java.lang.Override
      protected java.lang.Object writeReplace()
          throws java.io.ObjectStreamException {
        return super.writeReplace();
      }

      public static JoinTree.Triple.Element parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static JoinTree.Triple.Element parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static JoinTree.Triple.Element parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static JoinTree.Triple.Element parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static JoinTree.Triple.Element parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static JoinTree.Triple.Element parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }
      public static JoinTree.Triple.Element parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }
      public static JoinTree.Triple.Element parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }
      public static JoinTree.Triple.Element parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static JoinTree.Triple.Element parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() { return Builder.create(); }
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder(JoinTree.Triple.Element prototype) {
        return newBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() { return newBuilder(this); }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code Triple.Element}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessage.Builder<Builder>
         implements JoinTree.Triple.ElementOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return JoinTree.internal_static_Triple_Element_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return JoinTree.internal_static_Triple_Element_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  JoinTree.Triple.Element.class, JoinTree.Triple.Element.Builder.class);
        }

        // Construct using JoinTree.Triple.Element.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.google.protobuf.GeneratedMessage.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          }
        }
        private static Builder create() {
          return new Builder();
        }

        public Builder clear() {
          super.clear();
          name_ = "";
          bitField0_ = (bitField0_ & ~0x00000001);
          type_ = JoinTree.Triple.ElementType.VARIABLE;
          bitField0_ = (bitField0_ & ~0x00000002);
          return this;
        }

        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return JoinTree.internal_static_Triple_Element_descriptor;
        }

        public JoinTree.Triple.Element getDefaultInstanceForType() {
          return JoinTree.Triple.Element.getDefaultInstance();
        }

        public JoinTree.Triple.Element build() {
          JoinTree.Triple.Element result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public JoinTree.Triple.Element buildPartial() {
          JoinTree.Triple.Element result = new JoinTree.Triple.Element(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.name_ = name_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.type_ = type_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof JoinTree.Triple.Element) {
            return mergeFrom((JoinTree.Triple.Element)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(JoinTree.Triple.Element other) {
          if (other == JoinTree.Triple.Element.getDefaultInstance()) return this;
          if (other.hasName()) {
            bitField0_ |= 0x00000001;
            name_ = other.name_;
            onChanged();
          }
          if (other.hasType()) {
            setType(other.getType());
          }
          this.mergeUnknownFields(other.getUnknownFields());
          return this;
        }

        public final boolean isInitialized() {
          if (!hasName()) {
            
            return false;
          }
          if (!hasType()) {
            
            return false;
          }
          return true;
        }

        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          JoinTree.Triple.Element parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (JoinTree.Triple.Element) e.getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        // required string name = 1;
        private java.lang.Object name_ = "";
        /**
         * <code>required string name = 1;</code>
         */
        public boolean hasName() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required string name = 1;</code>
         */
        public java.lang.String getName() {
          java.lang.Object ref = name_;
          if (!(ref instanceof java.lang.String)) {
            java.lang.String s = ((com.google.protobuf.ByteString) ref)
                .toStringUtf8();
            name_ = s;
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>required string name = 1;</code>
         */
        public com.google.protobuf.ByteString
            getNameBytes() {
          java.lang.Object ref = name_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            name_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>required string name = 1;</code>
         */
        public Builder setName(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
          name_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>required string name = 1;</code>
         */
        public Builder clearName() {
          bitField0_ = (bitField0_ & ~0x00000001);
          name_ = getDefaultInstance().getName();
          onChanged();
          return this;
        }
        /**
         * <code>required string name = 1;</code>
         */
        public Builder setNameBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
          name_ = value;
          onChanged();
          return this;
        }

        // required .Triple.ElementType type = 2;
        private JoinTree.Triple.ElementType type_ = JoinTree.Triple.ElementType.VARIABLE;
        /**
         * <code>required .Triple.ElementType type = 2;</code>
         */
        public boolean hasType() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required .Triple.ElementType type = 2;</code>
         */
        public JoinTree.Triple.ElementType getType() {
          return type_;
        }
        /**
         * <code>required .Triple.ElementType type = 2;</code>
         */
        public Builder setType(JoinTree.Triple.ElementType value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000002;
          type_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>required .Triple.ElementType type = 2;</code>
         */
        public Builder clearType() {
          bitField0_ = (bitField0_ & ~0x00000002);
          type_ = JoinTree.Triple.ElementType.VARIABLE;
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:Triple.Element)
      }

      static {
        defaultInstance = new Element(true);
        defaultInstance.initFields();
      }

      // @@protoc_insertion_point(class_scope:Triple.Element)
    }

    private int bitField0_;
    // required .Triple.Element subject = 1;
    public static final int SUBJECT_FIELD_NUMBER = 1;
    private JoinTree.Triple.Element subject_;
    /**
     * <code>required .Triple.Element subject = 1;</code>
     */
    public boolean hasSubject() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .Triple.Element subject = 1;</code>
     */
    public JoinTree.Triple.Element getSubject() {
      return subject_;
    }
    /**
     * <code>required .Triple.Element subject = 1;</code>
     */
    public JoinTree.Triple.ElementOrBuilder getSubjectOrBuilder() {
      return subject_;
    }

    // required .Triple.Element predicate = 2;
    public static final int PREDICATE_FIELD_NUMBER = 2;
    private JoinTree.Triple.Element predicate_;
    /**
     * <code>required .Triple.Element predicate = 2;</code>
     */
    public boolean hasPredicate() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .Triple.Element predicate = 2;</code>
     */
    public JoinTree.Triple.Element getPredicate() {
      return predicate_;
    }
    /**
     * <code>required .Triple.Element predicate = 2;</code>
     */
    public JoinTree.Triple.ElementOrBuilder getPredicateOrBuilder() {
      return predicate_;
    }

    // required .Triple.Element object = 3;
    public static final int OBJECT_FIELD_NUMBER = 3;
    private JoinTree.Triple.Element object_;
    /**
     * <code>required .Triple.Element object = 3;</code>
     */
    public boolean hasObject() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .Triple.Element object = 3;</code>
     */
    public JoinTree.Triple.Element getObject() {
      return object_;
    }
    /**
     * <code>required .Triple.Element object = 3;</code>
     */
    public JoinTree.Triple.ElementOrBuilder getObjectOrBuilder() {
      return object_;
    }

    private void initFields() {
      subject_ = JoinTree.Triple.Element.getDefaultInstance();
      predicate_ = JoinTree.Triple.Element.getDefaultInstance();
      object_ = JoinTree.Triple.Element.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSubject()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPredicate()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasObject()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getSubject().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getPredicate().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getObject().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, subject_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, predicate_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, object_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, subject_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, predicate_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, object_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static JoinTree.Triple parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static JoinTree.Triple parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static JoinTree.Triple parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static JoinTree.Triple parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static JoinTree.Triple parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static JoinTree.Triple parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static JoinTree.Triple parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static JoinTree.Triple parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static JoinTree.Triple parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static JoinTree.Triple parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(JoinTree.Triple prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Triple}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements JoinTree.TripleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return JoinTree.internal_static_Triple_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return JoinTree.internal_static_Triple_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                JoinTree.Triple.class, JoinTree.Triple.Builder.class);
      }

      // Construct using JoinTree.Triple.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getSubjectFieldBuilder();
          getPredicateFieldBuilder();
          getObjectFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (subjectBuilder_ == null) {
          subject_ = JoinTree.Triple.Element.getDefaultInstance();
        } else {
          subjectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (predicateBuilder_ == null) {
          predicate_ = JoinTree.Triple.Element.getDefaultInstance();
        } else {
          predicateBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (objectBuilder_ == null) {
          object_ = JoinTree.Triple.Element.getDefaultInstance();
        } else {
          objectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return JoinTree.internal_static_Triple_descriptor;
      }

      public JoinTree.Triple getDefaultInstanceForType() {
        return JoinTree.Triple.getDefaultInstance();
      }

      public JoinTree.Triple build() {
        JoinTree.Triple result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public JoinTree.Triple buildPartial() {
        JoinTree.Triple result = new JoinTree.Triple(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (subjectBuilder_ == null) {
          result.subject_ = subject_;
        } else {
          result.subject_ = subjectBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (predicateBuilder_ == null) {
          result.predicate_ = predicate_;
        } else {
          result.predicate_ = predicateBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (objectBuilder_ == null) {
          result.object_ = object_;
        } else {
          result.object_ = objectBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof JoinTree.Triple) {
          return mergeFrom((JoinTree.Triple)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(JoinTree.Triple other) {
        if (other == JoinTree.Triple.getDefaultInstance()) return this;
        if (other.hasSubject()) {
          mergeSubject(other.getSubject());
        }
        if (other.hasPredicate()) {
          mergePredicate(other.getPredicate());
        }
        if (other.hasObject()) {
          mergeObject(other.getObject());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSubject()) {
          
          return false;
        }
        if (!hasPredicate()) {
          
          return false;
        }
        if (!hasObject()) {
          
          return false;
        }
        if (!getSubject().isInitialized()) {
          
          return false;
        }
        if (!getPredicate().isInitialized()) {
          
          return false;
        }
        if (!getObject().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        JoinTree.Triple parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (JoinTree.Triple) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .Triple.Element subject = 1;
      private JoinTree.Triple.Element subject_ = JoinTree.Triple.Element.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          JoinTree.Triple.Element, JoinTree.Triple.Element.Builder, JoinTree.Triple.ElementOrBuilder> subjectBuilder_;
      /**
       * <code>required .Triple.Element subject = 1;</code>
       */
      public boolean hasSubject() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .Triple.Element subject = 1;</code>
       */
      public JoinTree.Triple.Element getSubject() {
        if (subjectBuilder_ == null) {
          return subject_;
        } else {
          return subjectBuilder_.getMessage();
        }
      }
      /**
       * <code>required .Triple.Element subject = 1;</code>
       */
      public Builder setSubject(JoinTree.Triple.Element value) {
        if (subjectBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          subject_ = value;
          onChanged();
        } else {
          subjectBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .Triple.Element subject = 1;</code>
       */
      public Builder setSubject(
          JoinTree.Triple.Element.Builder builderForValue) {
        if (subjectBuilder_ == null) {
          subject_ = builderForValue.build();
          onChanged();
        } else {
          subjectBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .Triple.Element subject = 1;</code>
       */
      public Builder mergeSubject(JoinTree.Triple.Element value) {
        if (subjectBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              subject_ != JoinTree.Triple.Element.getDefaultInstance()) {
            subject_ =
              JoinTree.Triple.Element.newBuilder(subject_).mergeFrom(value).buildPartial();
          } else {
            subject_ = value;
          }
          onChanged();
        } else {
          subjectBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .Triple.Element subject = 1;</code>
       */
      public Builder clearSubject() {
        if (subjectBuilder_ == null) {
          subject_ = JoinTree.Triple.Element.getDefaultInstance();
          onChanged();
        } else {
          subjectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .Triple.Element subject = 1;</code>
       */
      public JoinTree.Triple.Element.Builder getSubjectBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getSubjectFieldBuilder().getBuilder();
      }
      /**
       * <code>required .Triple.Element subject = 1;</code>
       */
      public JoinTree.Triple.ElementOrBuilder getSubjectOrBuilder() {
        if (subjectBuilder_ != null) {
          return subjectBuilder_.getMessageOrBuilder();
        } else {
          return subject_;
        }
      }
      /**
       * <code>required .Triple.Element subject = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          JoinTree.Triple.Element, JoinTree.Triple.Element.Builder, JoinTree.Triple.ElementOrBuilder> 
          getSubjectFieldBuilder() {
        if (subjectBuilder_ == null) {
          subjectBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              JoinTree.Triple.Element, JoinTree.Triple.Element.Builder, JoinTree.Triple.ElementOrBuilder>(
                  subject_,
                  getParentForChildren(),
                  isClean());
          subject_ = null;
        }
        return subjectBuilder_;
      }

      // required .Triple.Element predicate = 2;
      private JoinTree.Triple.Element predicate_ = JoinTree.Triple.Element.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          JoinTree.Triple.Element, JoinTree.Triple.Element.Builder, JoinTree.Triple.ElementOrBuilder> predicateBuilder_;
      /**
       * <code>required .Triple.Element predicate = 2;</code>
       */
      public boolean hasPredicate() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .Triple.Element predicate = 2;</code>
       */
      public JoinTree.Triple.Element getPredicate() {
        if (predicateBuilder_ == null) {
          return predicate_;
        } else {
          return predicateBuilder_.getMessage();
        }
      }
      /**
       * <code>required .Triple.Element predicate = 2;</code>
       */
      public Builder setPredicate(JoinTree.Triple.Element value) {
        if (predicateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          predicate_ = value;
          onChanged();
        } else {
          predicateBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .Triple.Element predicate = 2;</code>
       */
      public Builder setPredicate(
          JoinTree.Triple.Element.Builder builderForValue) {
        if (predicateBuilder_ == null) {
          predicate_ = builderForValue.build();
          onChanged();
        } else {
          predicateBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .Triple.Element predicate = 2;</code>
       */
      public Builder mergePredicate(JoinTree.Triple.Element value) {
        if (predicateBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              predicate_ != JoinTree.Triple.Element.getDefaultInstance()) {
            predicate_ =
              JoinTree.Triple.Element.newBuilder(predicate_).mergeFrom(value).buildPartial();
          } else {
            predicate_ = value;
          }
          onChanged();
        } else {
          predicateBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .Triple.Element predicate = 2;</code>
       */
      public Builder clearPredicate() {
        if (predicateBuilder_ == null) {
          predicate_ = JoinTree.Triple.Element.getDefaultInstance();
          onChanged();
        } else {
          predicateBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .Triple.Element predicate = 2;</code>
       */
      public JoinTree.Triple.Element.Builder getPredicateBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getPredicateFieldBuilder().getBuilder();
      }
      /**
       * <code>required .Triple.Element predicate = 2;</code>
       */
      public JoinTree.Triple.ElementOrBuilder getPredicateOrBuilder() {
        if (predicateBuilder_ != null) {
          return predicateBuilder_.getMessageOrBuilder();
        } else {
          return predicate_;
        }
      }
      /**
       * <code>required .Triple.Element predicate = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          JoinTree.Triple.Element, JoinTree.Triple.Element.Builder, JoinTree.Triple.ElementOrBuilder> 
          getPredicateFieldBuilder() {
        if (predicateBuilder_ == null) {
          predicateBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              JoinTree.Triple.Element, JoinTree.Triple.Element.Builder, JoinTree.Triple.ElementOrBuilder>(
                  predicate_,
                  getParentForChildren(),
                  isClean());
          predicate_ = null;
        }
        return predicateBuilder_;
      }

      // required .Triple.Element object = 3;
      private JoinTree.Triple.Element object_ = JoinTree.Triple.Element.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          JoinTree.Triple.Element, JoinTree.Triple.Element.Builder, JoinTree.Triple.ElementOrBuilder> objectBuilder_;
      /**
       * <code>required .Triple.Element object = 3;</code>
       */
      public boolean hasObject() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required .Triple.Element object = 3;</code>
       */
      public JoinTree.Triple.Element getObject() {
        if (objectBuilder_ == null) {
          return object_;
        } else {
          return objectBuilder_.getMessage();
        }
      }
      /**
       * <code>required .Triple.Element object = 3;</code>
       */
      public Builder setObject(JoinTree.Triple.Element value) {
        if (objectBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          object_ = value;
          onChanged();
        } else {
          objectBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .Triple.Element object = 3;</code>
       */
      public Builder setObject(
          JoinTree.Triple.Element.Builder builderForValue) {
        if (objectBuilder_ == null) {
          object_ = builderForValue.build();
          onChanged();
        } else {
          objectBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .Triple.Element object = 3;</code>
       */
      public Builder mergeObject(JoinTree.Triple.Element value) {
        if (objectBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              object_ != JoinTree.Triple.Element.getDefaultInstance()) {
            object_ =
              JoinTree.Triple.Element.newBuilder(object_).mergeFrom(value).buildPartial();
          } else {
            object_ = value;
          }
          onChanged();
        } else {
          objectBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .Triple.Element object = 3;</code>
       */
      public Builder clearObject() {
        if (objectBuilder_ == null) {
          object_ = JoinTree.Triple.Element.getDefaultInstance();
          onChanged();
        } else {
          objectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>required .Triple.Element object = 3;</code>
       */
      public JoinTree.Triple.Element.Builder getObjectBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getObjectFieldBuilder().getBuilder();
      }
      /**
       * <code>required .Triple.Element object = 3;</code>
       */
      public JoinTree.Triple.ElementOrBuilder getObjectOrBuilder() {
        if (objectBuilder_ != null) {
          return objectBuilder_.getMessageOrBuilder();
        } else {
          return object_;
        }
      }
      /**
       * <code>required .Triple.Element object = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          JoinTree.Triple.Element, JoinTree.Triple.Element.Builder, JoinTree.Triple.ElementOrBuilder> 
          getObjectFieldBuilder() {
        if (objectBuilder_ == null) {
          objectBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              JoinTree.Triple.Element, JoinTree.Triple.Element.Builder, JoinTree.Triple.ElementOrBuilder>(
                  object_,
                  getParentForChildren(),
                  isClean());
          object_ = null;
        }
        return objectBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:Triple)
    }

    static {
      defaultInstance = new Triple(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Triple)
  }

  public interface NodeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .Triple triple = 1;
    /**
     * <code>required .Triple triple = 1;</code>
     */
    boolean hasTriple();
    /**
     * <code>required .Triple triple = 1;</code>
     */
    JoinTree.Triple getTriple();
    /**
     * <code>required .Triple triple = 1;</code>
     */
    JoinTree.TripleOrBuilder getTripleOrBuilder();

    // repeated .Node children = 2;
    /**
     * <code>repeated .Node children = 2;</code>
     */
    java.util.List<JoinTree.Node> 
        getChildrenList();
    /**
     * <code>repeated .Node children = 2;</code>
     */
    JoinTree.Node getChildren(int index);
    /**
     * <code>repeated .Node children = 2;</code>
     */
    int getChildrenCount();
    /**
     * <code>repeated .Node children = 2;</code>
     */
    java.util.List<? extends JoinTree.NodeOrBuilder> 
        getChildrenOrBuilderList();
    /**
     * <code>repeated .Node children = 2;</code>
     */
    JoinTree.NodeOrBuilder getChildrenOrBuilder(
        int index);

    // repeated string projection = 3;
    /**
     * <code>repeated string projection = 3;</code>
     */
    java.util.List<java.lang.String>
    getProjectionList();
    /**
     * <code>repeated string projection = 3;</code>
     */
    int getProjectionCount();
    /**
     * <code>repeated string projection = 3;</code>
     */
    java.lang.String getProjection(int index);
    /**
     * <code>repeated string projection = 3;</code>
     */
    com.google.protobuf.ByteString
        getProjectionBytes(int index);
  }
  /**
   * Protobuf type {@code Node}
   */
  public static final class Node extends
      com.google.protobuf.GeneratedMessage
      implements NodeOrBuilder {
    // Use Node.newBuilder() to construct.
    private Node(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Node(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Node defaultInstance;
    public static Node getDefaultInstance() {
      return defaultInstance;
    }

    public Node getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Node(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              JoinTree.Triple.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = triple_.toBuilder();
              }
              triple_ = input.readMessage(JoinTree.Triple.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(triple_);
                triple_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                children_ = new java.util.ArrayList<JoinTree.Node>();
                mutable_bitField0_ |= 0x00000002;
              }
              children_.add(input.readMessage(JoinTree.Node.PARSER, extensionRegistry));
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                projection_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000004;
              }
              projection_.add(input.readBytes());
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          children_ = java.util.Collections.unmodifiableList(children_);
        }
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          projection_ = new com.google.protobuf.UnmodifiableLazyStringList(projection_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return JoinTree.internal_static_Node_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return JoinTree.internal_static_Node_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              JoinTree.Node.class, JoinTree.Node.Builder.class);
    }

    public static com.google.protobuf.Parser<Node> PARSER =
        new com.google.protobuf.AbstractParser<Node>() {
      public Node parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Node(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Node> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .Triple triple = 1;
    public static final int TRIPLE_FIELD_NUMBER = 1;
    private JoinTree.Triple triple_;
    /**
     * <code>required .Triple triple = 1;</code>
     */
    public boolean hasTriple() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .Triple triple = 1;</code>
     */
    public JoinTree.Triple getTriple() {
      return triple_;
    }
    /**
     * <code>required .Triple triple = 1;</code>
     */
    public JoinTree.TripleOrBuilder getTripleOrBuilder() {
      return triple_;
    }

    // repeated .Node children = 2;
    public static final int CHILDREN_FIELD_NUMBER = 2;
    private java.util.List<JoinTree.Node> children_;
    /**
     * <code>repeated .Node children = 2;</code>
     */
    public java.util.List<JoinTree.Node> getChildrenList() {
      return children_;
    }
    /**
     * <code>repeated .Node children = 2;</code>
     */
    public java.util.List<? extends JoinTree.NodeOrBuilder> 
        getChildrenOrBuilderList() {
      return children_;
    }
    /**
     * <code>repeated .Node children = 2;</code>
     */
    public int getChildrenCount() {
      return children_.size();
    }
    /**
     * <code>repeated .Node children = 2;</code>
     */
    public JoinTree.Node getChildren(int index) {
      return children_.get(index);
    }
    /**
     * <code>repeated .Node children = 2;</code>
     */
    public JoinTree.NodeOrBuilder getChildrenOrBuilder(
        int index) {
      return children_.get(index);
    }

    // repeated string projection = 3;
    public static final int PROJECTION_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList projection_;
    /**
     * <code>repeated string projection = 3;</code>
     */
    public java.util.List<java.lang.String>
        getProjectionList() {
      return projection_;
    }
    /**
     * <code>repeated string projection = 3;</code>
     */
    public int getProjectionCount() {
      return projection_.size();
    }
    /**
     * <code>repeated string projection = 3;</code>
     */
    public java.lang.String getProjection(int index) {
      return projection_.get(index);
    }
    /**
     * <code>repeated string projection = 3;</code>
     */
    public com.google.protobuf.ByteString
        getProjectionBytes(int index) {
      return projection_.getByteString(index);
    }

    private void initFields() {
      triple_ = JoinTree.Triple.getDefaultInstance();
      children_ = java.util.Collections.emptyList();
      projection_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasTriple()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getTriple().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getChildrenCount(); i++) {
        if (!getChildren(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, triple_);
      }
      for (int i = 0; i < children_.size(); i++) {
        output.writeMessage(2, children_.get(i));
      }
      for (int i = 0; i < projection_.size(); i++) {
        output.writeBytes(3, projection_.getByteString(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, triple_);
      }
      for (int i = 0; i < children_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, children_.get(i));
      }
      {
        int dataSize = 0;
        for (int i = 0; i < projection_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(projection_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getProjectionList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static JoinTree.Node parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static JoinTree.Node parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static JoinTree.Node parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static JoinTree.Node parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static JoinTree.Node parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static JoinTree.Node parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static JoinTree.Node parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static JoinTree.Node parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static JoinTree.Node parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static JoinTree.Node parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(JoinTree.Node prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Node}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements JoinTree.NodeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return JoinTree.internal_static_Node_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return JoinTree.internal_static_Node_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                JoinTree.Node.class, JoinTree.Node.Builder.class);
      }

      // Construct using JoinTree.Node.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getTripleFieldBuilder();
          getChildrenFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (tripleBuilder_ == null) {
          triple_ = JoinTree.Triple.getDefaultInstance();
        } else {
          tripleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (childrenBuilder_ == null) {
          children_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          childrenBuilder_.clear();
        }
        projection_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return JoinTree.internal_static_Node_descriptor;
      }

      public JoinTree.Node getDefaultInstanceForType() {
        return JoinTree.Node.getDefaultInstance();
      }

      public JoinTree.Node build() {
        JoinTree.Node result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public JoinTree.Node buildPartial() {
        JoinTree.Node result = new JoinTree.Node(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (tripleBuilder_ == null) {
          result.triple_ = triple_;
        } else {
          result.triple_ = tripleBuilder_.build();
        }
        if (childrenBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            children_ = java.util.Collections.unmodifiableList(children_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.children_ = children_;
        } else {
          result.children_ = childrenBuilder_.build();
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          projection_ = new com.google.protobuf.UnmodifiableLazyStringList(
              projection_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.projection_ = projection_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof JoinTree.Node) {
          return mergeFrom((JoinTree.Node)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(JoinTree.Node other) {
        if (other == JoinTree.Node.getDefaultInstance()) return this;
        if (other.hasTriple()) {
          mergeTriple(other.getTriple());
        }
        if (childrenBuilder_ == null) {
          if (!other.children_.isEmpty()) {
            if (children_.isEmpty()) {
              children_ = other.children_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureChildrenIsMutable();
              children_.addAll(other.children_);
            }
            onChanged();
          }
        } else {
          if (!other.children_.isEmpty()) {
            if (childrenBuilder_.isEmpty()) {
              childrenBuilder_.dispose();
              childrenBuilder_ = null;
              children_ = other.children_;
              bitField0_ = (bitField0_ & ~0x00000002);
              childrenBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getChildrenFieldBuilder() : null;
            } else {
              childrenBuilder_.addAllMessages(other.children_);
            }
          }
        }
        if (!other.projection_.isEmpty()) {
          if (projection_.isEmpty()) {
            projection_ = other.projection_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureProjectionIsMutable();
            projection_.addAll(other.projection_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTriple()) {
          
          return false;
        }
        if (!getTriple().isInitialized()) {
          
          return false;
        }
        for (int i = 0; i < getChildrenCount(); i++) {
          if (!getChildren(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        JoinTree.Node parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (JoinTree.Node) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .Triple triple = 1;
      private JoinTree.Triple triple_ = JoinTree.Triple.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          JoinTree.Triple, JoinTree.Triple.Builder, JoinTree.TripleOrBuilder> tripleBuilder_;
      /**
       * <code>required .Triple triple = 1;</code>
       */
      public boolean hasTriple() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .Triple triple = 1;</code>
       */
      public JoinTree.Triple getTriple() {
        if (tripleBuilder_ == null) {
          return triple_;
        } else {
          return tripleBuilder_.getMessage();
        }
      }
      /**
       * <code>required .Triple triple = 1;</code>
       */
      public Builder setTriple(JoinTree.Triple value) {
        if (tripleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          triple_ = value;
          onChanged();
        } else {
          tripleBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .Triple triple = 1;</code>
       */
      public Builder setTriple(
          JoinTree.Triple.Builder builderForValue) {
        if (tripleBuilder_ == null) {
          triple_ = builderForValue.build();
          onChanged();
        } else {
          tripleBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .Triple triple = 1;</code>
       */
      public Builder mergeTriple(JoinTree.Triple value) {
        if (tripleBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              triple_ != JoinTree.Triple.getDefaultInstance()) {
            triple_ =
              JoinTree.Triple.newBuilder(triple_).mergeFrom(value).buildPartial();
          } else {
            triple_ = value;
          }
          onChanged();
        } else {
          tripleBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .Triple triple = 1;</code>
       */
      public Builder clearTriple() {
        if (tripleBuilder_ == null) {
          triple_ = JoinTree.Triple.getDefaultInstance();
          onChanged();
        } else {
          tripleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .Triple triple = 1;</code>
       */
      public JoinTree.Triple.Builder getTripleBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTripleFieldBuilder().getBuilder();
      }
      /**
       * <code>required .Triple triple = 1;</code>
       */
      public JoinTree.TripleOrBuilder getTripleOrBuilder() {
        if (tripleBuilder_ != null) {
          return tripleBuilder_.getMessageOrBuilder();
        } else {
          return triple_;
        }
      }
      /**
       * <code>required .Triple triple = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          JoinTree.Triple, JoinTree.Triple.Builder, JoinTree.TripleOrBuilder> 
          getTripleFieldBuilder() {
        if (tripleBuilder_ == null) {
          tripleBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              JoinTree.Triple, JoinTree.Triple.Builder, JoinTree.TripleOrBuilder>(
                  triple_,
                  getParentForChildren(),
                  isClean());
          triple_ = null;
        }
        return tripleBuilder_;
      }

      // repeated .Node children = 2;
      private java.util.List<JoinTree.Node> children_ =
        java.util.Collections.emptyList();
      private void ensureChildrenIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          children_ = new java.util.ArrayList<JoinTree.Node>(children_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          JoinTree.Node, JoinTree.Node.Builder, JoinTree.NodeOrBuilder> childrenBuilder_;

      /**
       * <code>repeated .Node children = 2;</code>
       */
      public java.util.List<JoinTree.Node> getChildrenList() {
        if (childrenBuilder_ == null) {
          return java.util.Collections.unmodifiableList(children_);
        } else {
          return childrenBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public int getChildrenCount() {
        if (childrenBuilder_ == null) {
          return children_.size();
        } else {
          return childrenBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public JoinTree.Node getChildren(int index) {
        if (childrenBuilder_ == null) {
          return children_.get(index);
        } else {
          return childrenBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public Builder setChildren(
          int index, JoinTree.Node value) {
        if (childrenBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChildrenIsMutable();
          children_.set(index, value);
          onChanged();
        } else {
          childrenBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public Builder setChildren(
          int index, JoinTree.Node.Builder builderForValue) {
        if (childrenBuilder_ == null) {
          ensureChildrenIsMutable();
          children_.set(index, builderForValue.build());
          onChanged();
        } else {
          childrenBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public Builder addChildren(JoinTree.Node value) {
        if (childrenBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChildrenIsMutable();
          children_.add(value);
          onChanged();
        } else {
          childrenBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public Builder addChildren(
          int index, JoinTree.Node value) {
        if (childrenBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChildrenIsMutable();
          children_.add(index, value);
          onChanged();
        } else {
          childrenBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public Builder addChildren(
          JoinTree.Node.Builder builderForValue) {
        if (childrenBuilder_ == null) {
          ensureChildrenIsMutable();
          children_.add(builderForValue.build());
          onChanged();
        } else {
          childrenBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public Builder addChildren(
          int index, JoinTree.Node.Builder builderForValue) {
        if (childrenBuilder_ == null) {
          ensureChildrenIsMutable();
          children_.add(index, builderForValue.build());
          onChanged();
        } else {
          childrenBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public Builder addAllChildren(
          java.lang.Iterable<? extends JoinTree.Node> values) {
        if (childrenBuilder_ == null) {
          ensureChildrenIsMutable();
          super.addAll(values, children_);
          onChanged();
        } else {
          childrenBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public Builder clearChildren() {
        if (childrenBuilder_ == null) {
          children_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          childrenBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public Builder removeChildren(int index) {
        if (childrenBuilder_ == null) {
          ensureChildrenIsMutable();
          children_.remove(index);
          onChanged();
        } else {
          childrenBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public JoinTree.Node.Builder getChildrenBuilder(
          int index) {
        return getChildrenFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public JoinTree.NodeOrBuilder getChildrenOrBuilder(
          int index) {
        if (childrenBuilder_ == null) {
          return children_.get(index);  } else {
          return childrenBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public java.util.List<? extends JoinTree.NodeOrBuilder> 
           getChildrenOrBuilderList() {
        if (childrenBuilder_ != null) {
          return childrenBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(children_);
        }
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public JoinTree.Node.Builder addChildrenBuilder() {
        return getChildrenFieldBuilder().addBuilder(
            JoinTree.Node.getDefaultInstance());
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public JoinTree.Node.Builder addChildrenBuilder(
          int index) {
        return getChildrenFieldBuilder().addBuilder(
            index, JoinTree.Node.getDefaultInstance());
      }
      /**
       * <code>repeated .Node children = 2;</code>
       */
      public java.util.List<JoinTree.Node.Builder> 
           getChildrenBuilderList() {
        return getChildrenFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          JoinTree.Node, JoinTree.Node.Builder, JoinTree.NodeOrBuilder> 
          getChildrenFieldBuilder() {
        if (childrenBuilder_ == null) {
          childrenBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              JoinTree.Node, JoinTree.Node.Builder, JoinTree.NodeOrBuilder>(
                  children_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          children_ = null;
        }
        return childrenBuilder_;
      }

      // repeated string projection = 3;
      private com.google.protobuf.LazyStringList projection_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureProjectionIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          projection_ = new com.google.protobuf.LazyStringArrayList(projection_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated string projection = 3;</code>
       */
      public java.util.List<java.lang.String>
          getProjectionList() {
        return java.util.Collections.unmodifiableList(projection_);
      }
      /**
       * <code>repeated string projection = 3;</code>
       */
      public int getProjectionCount() {
        return projection_.size();
      }
      /**
       * <code>repeated string projection = 3;</code>
       */
      public java.lang.String getProjection(int index) {
        return projection_.get(index);
      }
      /**
       * <code>repeated string projection = 3;</code>
       */
      public com.google.protobuf.ByteString
          getProjectionBytes(int index) {
        return projection_.getByteString(index);
      }
      /**
       * <code>repeated string projection = 3;</code>
       */
      public Builder setProjection(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureProjectionIsMutable();
        projection_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string projection = 3;</code>
       */
      public Builder addProjection(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureProjectionIsMutable();
        projection_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string projection = 3;</code>
       */
      public Builder addAllProjection(
          java.lang.Iterable<java.lang.String> values) {
        ensureProjectionIsMutable();
        super.addAll(values, projection_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string projection = 3;</code>
       */
      public Builder clearProjection() {
        projection_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string projection = 3;</code>
       */
      public Builder addProjectionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureProjectionIsMutable();
        projection_.add(value);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Node)
    }

    static {
      defaultInstance = new Node(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Node)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Triple_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Triple_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Triple_Element_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Triple_Element_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Node_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Node_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016JoinTree.proto\"\326\001\n\006Triple\022 \n\007subject\030\001" +
      " \002(\0132\017.Triple.Element\022\"\n\tpredicate\030\002 \002(\013" +
      "2\017.Triple.Element\022\037\n\006object\030\003 \002(\0132\017.Trip" +
      "le.Element\032:\n\007Element\022\014\n\004name\030\001 \002(\t\022!\n\004t" +
      "ype\030\002 \002(\0162\023.Triple.ElementType\")\n\013Elemen" +
      "tType\022\014\n\010VARIABLE\020\000\022\014\n\010CONSTANT\020\001\"L\n\004Nod" +
      "e\022\027\n\006triple\030\001 \002(\0132\007.Triple\022\027\n\010children\030\002" +
      " \003(\0132\005.Node\022\022\n\nprojection\030\003 \003(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Triple_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Triple_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Triple_descriptor,
              new java.lang.String[] { "Subject", "Predicate", "Object", });
          internal_static_Triple_Element_descriptor =
            internal_static_Triple_descriptor.getNestedTypes().get(0);
          internal_static_Triple_Element_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Triple_Element_descriptor,
              new java.lang.String[] { "Name", "Type", });
          internal_static_Node_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_Node_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Node_descriptor,
              new java.lang.String[] { "Triple", "Children", "Projection", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
