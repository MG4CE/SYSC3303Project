// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: elevator.proto

package elevatorCommands;

/**
 * <pre>
 * Dispatch sent from scheduler to elevator
 * </pre>
 *
 * Protobuf type {@code elevatorCommands.SchedulerDispatchMessage}
 */
public final class SchedulerDispatchMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:elevatorCommands.SchedulerDispatchMessage)
    SchedulerDispatchMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SchedulerDispatchMessage.newBuilder() to construct.
  private SchedulerDispatchMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SchedulerDispatchMessage() {
    timeStamp_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SchedulerDispatchMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SchedulerDispatchMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            elevatorID_ = input.readUInt32();
            break;
          }
          case 16: {

            destFloor_ = input.readUInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            timeStamp_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return elevatorCommands.ElevatorCommandProtos.internal_static_elevatorCommands_SchedulerDispatchMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return elevatorCommands.ElevatorCommandProtos.internal_static_elevatorCommands_SchedulerDispatchMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            elevatorCommands.SchedulerDispatchMessage.class, elevatorCommands.SchedulerDispatchMessage.Builder.class);
  }

  public static final int ELEVATORID_FIELD_NUMBER = 1;
  private int elevatorID_;
  /**
   * <code>uint32 elevatorID = 1;</code>
   * @return The elevatorID.
   */
  @java.lang.Override
  public int getElevatorID() {
    return elevatorID_;
  }

  public static final int DESTFLOOR_FIELD_NUMBER = 2;
  private int destFloor_;
  /**
   * <code>uint32 destFloor = 2;</code>
   * @return The destFloor.
   */
  @java.lang.Override
  public int getDestFloor() {
    return destFloor_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  private volatile java.lang.Object timeStamp_;
  /**
   * <code>string timeStamp = 3;</code>
   * @return The timeStamp.
   */
  @java.lang.Override
  public java.lang.String getTimeStamp() {
    java.lang.Object ref = timeStamp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timeStamp_ = s;
      return s;
    }
  }
  /**
   * <code>string timeStamp = 3;</code>
   * @return The bytes for timeStamp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTimeStampBytes() {
    java.lang.Object ref = timeStamp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      timeStamp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (elevatorID_ != 0) {
      output.writeUInt32(1, elevatorID_);
    }
    if (destFloor_ != 0) {
      output.writeUInt32(2, destFloor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeStamp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, timeStamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (elevatorID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, elevatorID_);
    }
    if (destFloor_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, destFloor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeStamp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, timeStamp_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof elevatorCommands.SchedulerDispatchMessage)) {
      return super.equals(obj);
    }
    elevatorCommands.SchedulerDispatchMessage other = (elevatorCommands.SchedulerDispatchMessage) obj;

    if (getElevatorID()
        != other.getElevatorID()) return false;
    if (getDestFloor()
        != other.getDestFloor()) return false;
    if (!getTimeStamp()
        .equals(other.getTimeStamp())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ELEVATORID_FIELD_NUMBER;
    hash = (53 * hash) + getElevatorID();
    hash = (37 * hash) + DESTFLOOR_FIELD_NUMBER;
    hash = (53 * hash) + getDestFloor();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getTimeStamp().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static elevatorCommands.SchedulerDispatchMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static elevatorCommands.SchedulerDispatchMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static elevatorCommands.SchedulerDispatchMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static elevatorCommands.SchedulerDispatchMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static elevatorCommands.SchedulerDispatchMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static elevatorCommands.SchedulerDispatchMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static elevatorCommands.SchedulerDispatchMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static elevatorCommands.SchedulerDispatchMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static elevatorCommands.SchedulerDispatchMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static elevatorCommands.SchedulerDispatchMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static elevatorCommands.SchedulerDispatchMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static elevatorCommands.SchedulerDispatchMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(elevatorCommands.SchedulerDispatchMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Dispatch sent from scheduler to elevator
   * </pre>
   *
   * Protobuf type {@code elevatorCommands.SchedulerDispatchMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:elevatorCommands.SchedulerDispatchMessage)
      elevatorCommands.SchedulerDispatchMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return elevatorCommands.ElevatorCommandProtos.internal_static_elevatorCommands_SchedulerDispatchMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return elevatorCommands.ElevatorCommandProtos.internal_static_elevatorCommands_SchedulerDispatchMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              elevatorCommands.SchedulerDispatchMessage.class, elevatorCommands.SchedulerDispatchMessage.Builder.class);
    }

    // Construct using elevatorCommands.SchedulerDispatchMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      elevatorID_ = 0;

      destFloor_ = 0;

      timeStamp_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return elevatorCommands.ElevatorCommandProtos.internal_static_elevatorCommands_SchedulerDispatchMessage_descriptor;
    }

    @java.lang.Override
    public elevatorCommands.SchedulerDispatchMessage getDefaultInstanceForType() {
      return elevatorCommands.SchedulerDispatchMessage.getDefaultInstance();
    }

    @java.lang.Override
    public elevatorCommands.SchedulerDispatchMessage build() {
      elevatorCommands.SchedulerDispatchMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public elevatorCommands.SchedulerDispatchMessage buildPartial() {
      elevatorCommands.SchedulerDispatchMessage result = new elevatorCommands.SchedulerDispatchMessage(this);
      result.elevatorID_ = elevatorID_;
      result.destFloor_ = destFloor_;
      result.timeStamp_ = timeStamp_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof elevatorCommands.SchedulerDispatchMessage) {
        return mergeFrom((elevatorCommands.SchedulerDispatchMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(elevatorCommands.SchedulerDispatchMessage other) {
      if (other == elevatorCommands.SchedulerDispatchMessage.getDefaultInstance()) return this;
      if (other.getElevatorID() != 0) {
        setElevatorID(other.getElevatorID());
      }
      if (other.getDestFloor() != 0) {
        setDestFloor(other.getDestFloor());
      }
      if (!other.getTimeStamp().isEmpty()) {
        timeStamp_ = other.timeStamp_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      elevatorCommands.SchedulerDispatchMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (elevatorCommands.SchedulerDispatchMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int elevatorID_ ;
    /**
     * <code>uint32 elevatorID = 1;</code>
     * @return The elevatorID.
     */
    @java.lang.Override
    public int getElevatorID() {
      return elevatorID_;
    }
    /**
     * <code>uint32 elevatorID = 1;</code>
     * @param value The elevatorID to set.
     * @return This builder for chaining.
     */
    public Builder setElevatorID(int value) {
      
      elevatorID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 elevatorID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearElevatorID() {
      
      elevatorID_ = 0;
      onChanged();
      return this;
    }

    private int destFloor_ ;
    /**
     * <code>uint32 destFloor = 2;</code>
     * @return The destFloor.
     */
    @java.lang.Override
    public int getDestFloor() {
      return destFloor_;
    }
    /**
     * <code>uint32 destFloor = 2;</code>
     * @param value The destFloor to set.
     * @return This builder for chaining.
     */
    public Builder setDestFloor(int value) {
      
      destFloor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 destFloor = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDestFloor() {
      
      destFloor_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object timeStamp_ = "";
    /**
     * <code>string timeStamp = 3;</code>
     * @return The timeStamp.
     */
    public java.lang.String getTimeStamp() {
      java.lang.Object ref = timeStamp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timeStamp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string timeStamp = 3;</code>
     * @return The bytes for timeStamp.
     */
    public com.google.protobuf.ByteString
        getTimeStampBytes() {
      java.lang.Object ref = timeStamp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timeStamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string timeStamp = 3;</code>
     * @param value The timeStamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimeStamp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      timeStamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string timeStamp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeStamp() {
      
      timeStamp_ = getDefaultInstance().getTimeStamp();
      onChanged();
      return this;
    }
    /**
     * <code>string timeStamp = 3;</code>
     * @param value The bytes for timeStamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimeStampBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      timeStamp_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:elevatorCommands.SchedulerDispatchMessage)
  }

  // @@protoc_insertion_point(class_scope:elevatorCommands.SchedulerDispatchMessage)
  private static final elevatorCommands.SchedulerDispatchMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new elevatorCommands.SchedulerDispatchMessage();
  }

  public static elevatorCommands.SchedulerDispatchMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SchedulerDispatchMessage>
      PARSER = new com.google.protobuf.AbstractParser<SchedulerDispatchMessage>() {
    @java.lang.Override
    public SchedulerDispatchMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SchedulerDispatchMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SchedulerDispatchMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SchedulerDispatchMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public elevatorCommands.SchedulerDispatchMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

