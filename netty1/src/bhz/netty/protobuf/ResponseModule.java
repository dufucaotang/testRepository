// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/response.proto

package bhz.netty.protobuf;

public final class ResponseModule {
  private ResponseModule() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string id = 1;
    /**
     * <code>required string id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>required string id = 1;</code>
     */
    java.lang.String getId();
    /**
     * <code>required string id = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdBytes();

    // required int32 code = 2;
    /**
     * <code>required int32 code = 2;</code>
     */
    boolean hasCode();
    /**
     * <code>required int32 code = 2;</code>
     */
    int getCode();

    // required string name = 3;
    /**
     * <code>required string name = 3;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 3;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 3;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    // repeated string tags = 4;
    /**
     * <code>repeated string tags = 4;</code>
     */
    java.util.List<java.lang.String>
    getTagsList();
    /**
     * <code>repeated string tags = 4;</code>
     */
    int getTagsCount();
    /**
     * <code>repeated string tags = 4;</code>
     */
    java.lang.String getTags(int index);
    /**
     * <code>repeated string tags = 4;</code>
     */
    com.google.protobuf.ByteString
        getTagsBytes(int index);
  }
  /**
   * Protobuf type {@code Response}
   */
  public static final class Response extends
      com.google.protobuf.GeneratedMessage
      implements ResponseOrBuilder {
    // Use Response.newBuilder() to construct.
    private Response(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Response(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Response defaultInstance;
    public static Response getDefaultInstance() {
      return defaultInstance;
    }

    public Response getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Response(
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
              id_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              code_ = input.readInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              name_ = input.readBytes();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                tags_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000008;
              }
              tags_.add(input.readBytes());
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
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          tags_ = new com.google.protobuf.UnmodifiableLazyStringList(tags_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bhz.netty.protobuf.ResponseModule.internal_static_Response_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bhz.netty.protobuf.ResponseModule.internal_static_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bhz.netty.protobuf.ResponseModule.Response.class, bhz.netty.protobuf.ResponseModule.Response.Builder.class);
    }

    public static com.google.protobuf.Parser<Response> PARSER =
        new com.google.protobuf.AbstractParser<Response>() {
      public Response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Response(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Response> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private java.lang.Object id_;
    /**
     * <code>required string id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          id_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required int32 code = 2;
    public static final int CODE_FIELD_NUMBER = 2;
    private int code_;
    /**
     * <code>required int32 code = 2;</code>
     */
    public boolean hasCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 code = 2;</code>
     */
    public int getCode() {
      return code_;
    }

    // required string name = 3;
    public static final int NAME_FIELD_NUMBER = 3;
    private java.lang.Object name_;
    /**
     * <code>required string name = 3;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string name = 3;</code>
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
     * <code>required string name = 3;</code>
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

    // repeated string tags = 4;
    public static final int TAGS_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList tags_;
    /**
     * <code>repeated string tags = 4;</code>
     */
    public java.util.List<java.lang.String>
        getTagsList() {
      return tags_;
    }
    /**
     * <code>repeated string tags = 4;</code>
     */
    public int getTagsCount() {
      return tags_.size();
    }
    /**
     * <code>repeated string tags = 4;</code>
     */
    public java.lang.String getTags(int index) {
      return tags_.get(index);
    }
    /**
     * <code>repeated string tags = 4;</code>
     */
    public com.google.protobuf.ByteString
        getTagsBytes(int index) {
      return tags_.getByteString(index);
    }

    private void initFields() {
      id_ = "";
      code_ = 0;
      name_ = "";
      tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasName()) {
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
        output.writeBytes(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, code_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getNameBytes());
      }
      for (int i = 0; i < tags_.size(); i++) {
        output.writeBytes(4, tags_.getByteString(i));
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
          .computeBytesSize(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, code_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getNameBytes());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < tags_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(tags_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getTagsList().size();
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

    public static bhz.netty.protobuf.ResponseModule.Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static bhz.netty.protobuf.ResponseModule.Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static bhz.netty.protobuf.ResponseModule.Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static bhz.netty.protobuf.ResponseModule.Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static bhz.netty.protobuf.ResponseModule.Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static bhz.netty.protobuf.ResponseModule.Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static bhz.netty.protobuf.ResponseModule.Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static bhz.netty.protobuf.ResponseModule.Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static bhz.netty.protobuf.ResponseModule.Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static bhz.netty.protobuf.ResponseModule.Response parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(bhz.netty.protobuf.ResponseModule.Response prototype) {
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
     * Protobuf type {@code Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements bhz.netty.protobuf.ResponseModule.ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return bhz.netty.protobuf.ResponseModule.internal_static_Response_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return bhz.netty.protobuf.ResponseModule.internal_static_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                bhz.netty.protobuf.ResponseModule.Response.class, bhz.netty.protobuf.ResponseModule.Response.Builder.class);
      }

      // Construct using bhz.netty.protobuf.ResponseModule.Response.newBuilder()
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
        id_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        code_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return bhz.netty.protobuf.ResponseModule.internal_static_Response_descriptor;
      }

      public bhz.netty.protobuf.ResponseModule.Response getDefaultInstanceForType() {
        return bhz.netty.protobuf.ResponseModule.Response.getDefaultInstance();
      }

      public bhz.netty.protobuf.ResponseModule.Response build() {
        bhz.netty.protobuf.ResponseModule.Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public bhz.netty.protobuf.ResponseModule.Response buildPartial() {
        bhz.netty.protobuf.ResponseModule.Response result = new bhz.netty.protobuf.ResponseModule.Response(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.code_ = code_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.name_ = name_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          tags_ = new com.google.protobuf.UnmodifiableLazyStringList(
              tags_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.tags_ = tags_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof bhz.netty.protobuf.ResponseModule.Response) {
          return mergeFrom((bhz.netty.protobuf.ResponseModule.Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(bhz.netty.protobuf.ResponseModule.Response other) {
        if (other == bhz.netty.protobuf.ResponseModule.Response.getDefaultInstance()) return this;
        if (other.hasId()) {
          bitField0_ |= 0x00000001;
          id_ = other.id_;
          onChanged();
        }
        if (other.hasCode()) {
          setCode(other.getCode());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000004;
          name_ = other.name_;
          onChanged();
        }
        if (!other.tags_.isEmpty()) {
          if (tags_.isEmpty()) {
            tags_ = other.tags_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureTagsIsMutable();
            tags_.addAll(other.tags_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        if (!hasCode()) {
          
          return false;
        }
        if (!hasName()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        bhz.netty.protobuf.ResponseModule.Response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (bhz.netty.protobuf.ResponseModule.Response) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string id = 1;
      private java.lang.Object id_ = "";
      /**
       * <code>required string id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string id = 1;</code>
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string id = 1;</code>
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      /**
       * <code>required string id = 1;</code>
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }

      // required int32 code = 2;
      private int code_ ;
      /**
       * <code>required int32 code = 2;</code>
       */
      public boolean hasCode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 code = 2;</code>
       */
      public int getCode() {
        return code_;
      }
      /**
       * <code>required int32 code = 2;</code>
       */
      public Builder setCode(int value) {
        bitField0_ |= 0x00000002;
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 code = 2;</code>
       */
      public Builder clearCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        code_ = 0;
        onChanged();
        return this;
      }

      // required string name = 3;
      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 3;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string name = 3;</code>
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
       * <code>required string name = 3;</code>
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
       * <code>required string name = 3;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 3;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 3;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        name_ = value;
        onChanged();
        return this;
      }

      // repeated string tags = 4;
      private com.google.protobuf.LazyStringList tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureTagsIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          tags_ = new com.google.protobuf.LazyStringArrayList(tags_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <code>repeated string tags = 4;</code>
       */
      public java.util.List<java.lang.String>
          getTagsList() {
        return java.util.Collections.unmodifiableList(tags_);
      }
      /**
       * <code>repeated string tags = 4;</code>
       */
      public int getTagsCount() {
        return tags_.size();
      }
      /**
       * <code>repeated string tags = 4;</code>
       */
      public java.lang.String getTags(int index) {
        return tags_.get(index);
      }
      /**
       * <code>repeated string tags = 4;</code>
       */
      public com.google.protobuf.ByteString
          getTagsBytes(int index) {
        return tags_.getByteString(index);
      }
      /**
       * <code>repeated string tags = 4;</code>
       */
      public Builder setTags(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureTagsIsMutable();
        tags_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string tags = 4;</code>
       */
      public Builder addTags(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureTagsIsMutable();
        tags_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string tags = 4;</code>
       */
      public Builder addAllTags(
          java.lang.Iterable<java.lang.String> values) {
        ensureTagsIsMutable();
        super.addAll(values, tags_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string tags = 4;</code>
       */
      public Builder clearTags() {
        tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string tags = 4;</code>
       */
      public Builder addTagsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureTagsIsMutable();
        tags_.add(value);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Response)
    }

    static {
      defaultInstance = new Response(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Response)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Response_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024proto/response.proto\"@\n\010Response\022\n\n\002id" +
      "\030\001 \002(\t\022\014\n\004code\030\002 \002(\005\022\014\n\004name\030\003 \002(\t\022\014\n\004ta" +
      "gs\030\004 \003(\tB$\n\022bhz.netty.protobufB\016Response" +
      "Module"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Response_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Response_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Response_descriptor,
              new java.lang.String[] { "Id", "Code", "Name", "Tags", });
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
