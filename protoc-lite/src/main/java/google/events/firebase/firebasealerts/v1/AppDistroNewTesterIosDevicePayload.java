// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/firebasealerts/v1/cloud_event_payload.proto

package google.events.firebase.firebasealerts.v1;

/**
 * Protobuf type {@code google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload}
 */
public  final class AppDistroNewTesterIosDevicePayload extends
    com.google.protobuf.GeneratedMessageLite<
        AppDistroNewTesterIosDevicePayload, AppDistroNewTesterIosDevicePayload.Builder> implements
    // @@protoc_insertion_point(message_implements:google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload)
    AppDistroNewTesterIosDevicePayloadOrBuilder {
  private AppDistroNewTesterIosDevicePayload() {
    testerName_ = "";
    testerEmail_ = "";
    testerDeviceModelName_ = "";
    testerDeviceIdentifier_ = "";
  }
  public static final int TESTER_NAME_FIELD_NUMBER = 1;
  private java.lang.String testerName_;
  /**
   * <code>string tester_name = 1;</code>
   * @return The testerName.
   */
  @java.lang.Override
  public java.lang.String getTesterName() {
    return testerName_;
  }
  /**
   * <code>string tester_name = 1;</code>
   * @return The bytes for testerName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTesterNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(testerName_);
  }
  /**
   * <code>string tester_name = 1;</code>
   * @param value The testerName to set.
   */
  private void setTesterName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    testerName_ = value;
  }
  /**
   * <code>string tester_name = 1;</code>
   */
  private void clearTesterName() {
    
    testerName_ = getDefaultInstance().getTesterName();
  }
  /**
   * <code>string tester_name = 1;</code>
   * @param value The bytes for testerName to set.
   */
  private void setTesterNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    testerName_ = value.toStringUtf8();
    
  }

  public static final int TESTER_EMAIL_FIELD_NUMBER = 2;
  private java.lang.String testerEmail_;
  /**
   * <code>string tester_email = 2;</code>
   * @return The testerEmail.
   */
  @java.lang.Override
  public java.lang.String getTesterEmail() {
    return testerEmail_;
  }
  /**
   * <code>string tester_email = 2;</code>
   * @return The bytes for testerEmail.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTesterEmailBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(testerEmail_);
  }
  /**
   * <code>string tester_email = 2;</code>
   * @param value The testerEmail to set.
   */
  private void setTesterEmail(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    testerEmail_ = value;
  }
  /**
   * <code>string tester_email = 2;</code>
   */
  private void clearTesterEmail() {
    
    testerEmail_ = getDefaultInstance().getTesterEmail();
  }
  /**
   * <code>string tester_email = 2;</code>
   * @param value The bytes for testerEmail to set.
   */
  private void setTesterEmailBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    testerEmail_ = value.toStringUtf8();
    
  }

  public static final int TESTER_DEVICE_MODEL_NAME_FIELD_NUMBER = 3;
  private java.lang.String testerDeviceModelName_;
  /**
   * <code>string tester_device_model_name = 3;</code>
   * @return The testerDeviceModelName.
   */
  @java.lang.Override
  public java.lang.String getTesterDeviceModelName() {
    return testerDeviceModelName_;
  }
  /**
   * <code>string tester_device_model_name = 3;</code>
   * @return The bytes for testerDeviceModelName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTesterDeviceModelNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(testerDeviceModelName_);
  }
  /**
   * <code>string tester_device_model_name = 3;</code>
   * @param value The testerDeviceModelName to set.
   */
  private void setTesterDeviceModelName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    testerDeviceModelName_ = value;
  }
  /**
   * <code>string tester_device_model_name = 3;</code>
   */
  private void clearTesterDeviceModelName() {
    
    testerDeviceModelName_ = getDefaultInstance().getTesterDeviceModelName();
  }
  /**
   * <code>string tester_device_model_name = 3;</code>
   * @param value The bytes for testerDeviceModelName to set.
   */
  private void setTesterDeviceModelNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    testerDeviceModelName_ = value.toStringUtf8();
    
  }

  public static final int TESTER_DEVICE_IDENTIFIER_FIELD_NUMBER = 4;
  private java.lang.String testerDeviceIdentifier_;
  /**
   * <code>string tester_device_identifier = 4;</code>
   * @return The testerDeviceIdentifier.
   */
  @java.lang.Override
  public java.lang.String getTesterDeviceIdentifier() {
    return testerDeviceIdentifier_;
  }
  /**
   * <code>string tester_device_identifier = 4;</code>
   * @return The bytes for testerDeviceIdentifier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTesterDeviceIdentifierBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(testerDeviceIdentifier_);
  }
  /**
   * <code>string tester_device_identifier = 4;</code>
   * @param value The testerDeviceIdentifier to set.
   */
  private void setTesterDeviceIdentifier(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    testerDeviceIdentifier_ = value;
  }
  /**
   * <code>string tester_device_identifier = 4;</code>
   */
  private void clearTesterDeviceIdentifier() {
    
    testerDeviceIdentifier_ = getDefaultInstance().getTesterDeviceIdentifier();
  }
  /**
   * <code>string tester_device_identifier = 4;</code>
   * @param value The bytes for testerDeviceIdentifier to set.
   */
  private void setTesterDeviceIdentifierBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    testerDeviceIdentifier_ = value.toStringUtf8();
    
  }

  public static google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload)
      google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayloadOrBuilder {
    // Construct using google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string tester_name = 1;</code>
     * @return The testerName.
     */
    @java.lang.Override
    public java.lang.String getTesterName() {
      return instance.getTesterName();
    }
    /**
     * <code>string tester_name = 1;</code>
     * @return The bytes for testerName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTesterNameBytes() {
      return instance.getTesterNameBytes();
    }
    /**
     * <code>string tester_name = 1;</code>
     * @param value The testerName to set.
     * @return This builder for chaining.
     */
    public Builder setTesterName(
        java.lang.String value) {
      copyOnWrite();
      instance.setTesterName(value);
      return this;
    }
    /**
     * <code>string tester_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTesterName() {
      copyOnWrite();
      instance.clearTesterName();
      return this;
    }
    /**
     * <code>string tester_name = 1;</code>
     * @param value The bytes for testerName to set.
     * @return This builder for chaining.
     */
    public Builder setTesterNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTesterNameBytes(value);
      return this;
    }

    /**
     * <code>string tester_email = 2;</code>
     * @return The testerEmail.
     */
    @java.lang.Override
    public java.lang.String getTesterEmail() {
      return instance.getTesterEmail();
    }
    /**
     * <code>string tester_email = 2;</code>
     * @return The bytes for testerEmail.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTesterEmailBytes() {
      return instance.getTesterEmailBytes();
    }
    /**
     * <code>string tester_email = 2;</code>
     * @param value The testerEmail to set.
     * @return This builder for chaining.
     */
    public Builder setTesterEmail(
        java.lang.String value) {
      copyOnWrite();
      instance.setTesterEmail(value);
      return this;
    }
    /**
     * <code>string tester_email = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTesterEmail() {
      copyOnWrite();
      instance.clearTesterEmail();
      return this;
    }
    /**
     * <code>string tester_email = 2;</code>
     * @param value The bytes for testerEmail to set.
     * @return This builder for chaining.
     */
    public Builder setTesterEmailBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTesterEmailBytes(value);
      return this;
    }

    /**
     * <code>string tester_device_model_name = 3;</code>
     * @return The testerDeviceModelName.
     */
    @java.lang.Override
    public java.lang.String getTesterDeviceModelName() {
      return instance.getTesterDeviceModelName();
    }
    /**
     * <code>string tester_device_model_name = 3;</code>
     * @return The bytes for testerDeviceModelName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTesterDeviceModelNameBytes() {
      return instance.getTesterDeviceModelNameBytes();
    }
    /**
     * <code>string tester_device_model_name = 3;</code>
     * @param value The testerDeviceModelName to set.
     * @return This builder for chaining.
     */
    public Builder setTesterDeviceModelName(
        java.lang.String value) {
      copyOnWrite();
      instance.setTesterDeviceModelName(value);
      return this;
    }
    /**
     * <code>string tester_device_model_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTesterDeviceModelName() {
      copyOnWrite();
      instance.clearTesterDeviceModelName();
      return this;
    }
    /**
     * <code>string tester_device_model_name = 3;</code>
     * @param value The bytes for testerDeviceModelName to set.
     * @return This builder for chaining.
     */
    public Builder setTesterDeviceModelNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTesterDeviceModelNameBytes(value);
      return this;
    }

    /**
     * <code>string tester_device_identifier = 4;</code>
     * @return The testerDeviceIdentifier.
     */
    @java.lang.Override
    public java.lang.String getTesterDeviceIdentifier() {
      return instance.getTesterDeviceIdentifier();
    }
    /**
     * <code>string tester_device_identifier = 4;</code>
     * @return The bytes for testerDeviceIdentifier.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTesterDeviceIdentifierBytes() {
      return instance.getTesterDeviceIdentifierBytes();
    }
    /**
     * <code>string tester_device_identifier = 4;</code>
     * @param value The testerDeviceIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setTesterDeviceIdentifier(
        java.lang.String value) {
      copyOnWrite();
      instance.setTesterDeviceIdentifier(value);
      return this;
    }
    /**
     * <code>string tester_device_identifier = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTesterDeviceIdentifier() {
      copyOnWrite();
      instance.clearTesterDeviceIdentifier();
      return this;
    }
    /**
     * <code>string tester_device_identifier = 4;</code>
     * @param value The bytes for testerDeviceIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setTesterDeviceIdentifierBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTesterDeviceIdentifierBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "testerName_",
            "testerEmail_",
            "testerDeviceModelName_",
            "testerDeviceIdentifier_",
          };
          java.lang.String info =
              "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0208\u0004\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload> parser = PARSER;
        if (parser == null) {
          synchronized (google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload)
  private static final google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload DEFAULT_INSTANCE;
  static {
    AppDistroNewTesterIosDevicePayload defaultInstance = new AppDistroNewTesterIosDevicePayload();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      AppDistroNewTesterIosDevicePayload.class, defaultInstance);
  }

  public static google.events.firebase.firebasealerts.v1.AppDistroNewTesterIosDevicePayload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AppDistroNewTesterIosDevicePayload> PARSER;

  public static com.google.protobuf.Parser<AppDistroNewTesterIosDevicePayload> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
