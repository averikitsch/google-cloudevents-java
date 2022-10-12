// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/analytics/v1/data.proto

package google.events.firebase.analytics.v1;

/**
 * <pre>
 * Predefined (eg: LTV) or custom properties (eg: birthday) stored on client
 * side and associated with subsequent HitBundles.
 * </pre>
 *
 * Protobuf type {@code google.events.firebase.analytics.v1.UserPropertyValue}
 */
public  final class UserPropertyValue extends
    com.google.protobuf.GeneratedMessageLite<
        UserPropertyValue, UserPropertyValue.Builder> implements
    // @@protoc_insertion_point(message_implements:google.events.firebase.analytics.v1.UserPropertyValue)
    UserPropertyValueOrBuilder {
  private UserPropertyValue() {
  }
  public static final int VALUE_FIELD_NUMBER = 1;
  private google.events.firebase.analytics.v1.AnalyticsValue value_;
  /**
   * <pre>
   * Last set value of user property.
   * </pre>
   *
   * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
   */
  @java.lang.Override
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <pre>
   * Last set value of user property.
   * </pre>
   *
   * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
   */
  @java.lang.Override
  public google.events.firebase.analytics.v1.AnalyticsValue getValue() {
    return value_ == null ? google.events.firebase.analytics.v1.AnalyticsValue.getDefaultInstance() : value_;
  }
  /**
   * <pre>
   * Last set value of user property.
   * </pre>
   *
   * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
   */
  private void setValue(google.events.firebase.analytics.v1.AnalyticsValue value) {
    value.getClass();
  value_ = value;
    
    }
  /**
   * <pre>
   * Last set value of user property.
   * </pre>
   *
   * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeValue(google.events.firebase.analytics.v1.AnalyticsValue value) {
    value.getClass();
  if (value_ != null &&
        value_ != google.events.firebase.analytics.v1.AnalyticsValue.getDefaultInstance()) {
      value_ =
        google.events.firebase.analytics.v1.AnalyticsValue.newBuilder(value_).mergeFrom(value).buildPartial();
    } else {
      value_ = value;
    }
    
  }
  /**
   * <pre>
   * Last set value of user property.
   * </pre>
   *
   * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
   */
  private void clearValue() {  value_ = null;
    
  }

  public static final int SET_TIMESTAMP_USEC_FIELD_NUMBER = 2;
  private long setTimestampUsec_;
  /**
   * <pre>
   * UTC client time when user property was last set.
   * </pre>
   *
   * <code>int64 set_timestamp_usec = 2;</code>
   * @return The setTimestampUsec.
   */
  @java.lang.Override
  public long getSetTimestampUsec() {
    return setTimestampUsec_;
  }
  /**
   * <pre>
   * UTC client time when user property was last set.
   * </pre>
   *
   * <code>int64 set_timestamp_usec = 2;</code>
   * @param value The setTimestampUsec to set.
   */
  private void setSetTimestampUsec(long value) {
    
    setTimestampUsec_ = value;
  }
  /**
   * <pre>
   * UTC client time when user property was last set.
   * </pre>
   *
   * <code>int64 set_timestamp_usec = 2;</code>
   */
  private void clearSetTimestampUsec() {
    
    setTimestampUsec_ = 0L;
  }

  public static final int INDEX_FIELD_NUMBER = 3;
  private int index_;
  /**
   * <pre>
   * Index for user property (one-based).
   * </pre>
   *
   * <code>int32 index = 3;</code>
   * @return The index.
   */
  @java.lang.Override
  public int getIndex() {
    return index_;
  }
  /**
   * <pre>
   * Index for user property (one-based).
   * </pre>
   *
   * <code>int32 index = 3;</code>
   * @param value The index to set.
   */
  private void setIndex(int value) {
    
    index_ = value;
  }
  /**
   * <pre>
   * Index for user property (one-based).
   * </pre>
   *
   * <code>int32 index = 3;</code>
   */
  private void clearIndex() {
    
    index_ = 0;
  }

  public static google.events.firebase.analytics.v1.UserPropertyValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static google.events.firebase.analytics.v1.UserPropertyValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static google.events.firebase.analytics.v1.UserPropertyValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static google.events.firebase.analytics.v1.UserPropertyValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static google.events.firebase.analytics.v1.UserPropertyValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static google.events.firebase.analytics.v1.UserPropertyValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static google.events.firebase.analytics.v1.UserPropertyValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static google.events.firebase.analytics.v1.UserPropertyValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static google.events.firebase.analytics.v1.UserPropertyValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static google.events.firebase.analytics.v1.UserPropertyValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static google.events.firebase.analytics.v1.UserPropertyValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static google.events.firebase.analytics.v1.UserPropertyValue parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(google.events.firebase.analytics.v1.UserPropertyValue prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Predefined (eg: LTV) or custom properties (eg: birthday) stored on client
   * side and associated with subsequent HitBundles.
   * </pre>
   *
   * Protobuf type {@code google.events.firebase.analytics.v1.UserPropertyValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        google.events.firebase.analytics.v1.UserPropertyValue, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.events.firebase.analytics.v1.UserPropertyValue)
      google.events.firebase.analytics.v1.UserPropertyValueOrBuilder {
    // Construct using google.events.firebase.analytics.v1.UserPropertyValue.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Last set value of user property.
     * </pre>
     *
     * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
     */
    @java.lang.Override
    public boolean hasValue() {
      return instance.hasValue();
    }
    /**
     * <pre>
     * Last set value of user property.
     * </pre>
     *
     * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
     */
    @java.lang.Override
    public google.events.firebase.analytics.v1.AnalyticsValue getValue() {
      return instance.getValue();
    }
    /**
     * <pre>
     * Last set value of user property.
     * </pre>
     *
     * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
     */
    public Builder setValue(google.events.firebase.analytics.v1.AnalyticsValue value) {
      copyOnWrite();
      instance.setValue(value);
      return this;
      }
    /**
     * <pre>
     * Last set value of user property.
     * </pre>
     *
     * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
     */
    public Builder setValue(
        google.events.firebase.analytics.v1.AnalyticsValue.Builder builderForValue) {
      copyOnWrite();
      instance.setValue(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Last set value of user property.
     * </pre>
     *
     * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
     */
    public Builder mergeValue(google.events.firebase.analytics.v1.AnalyticsValue value) {
      copyOnWrite();
      instance.mergeValue(value);
      return this;
    }
    /**
     * <pre>
     * Last set value of user property.
     * </pre>
     *
     * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
     */
    public Builder clearValue() {  copyOnWrite();
      instance.clearValue();
      return this;
    }

    /**
     * <pre>
     * UTC client time when user property was last set.
     * </pre>
     *
     * <code>int64 set_timestamp_usec = 2;</code>
     * @return The setTimestampUsec.
     */
    @java.lang.Override
    public long getSetTimestampUsec() {
      return instance.getSetTimestampUsec();
    }
    /**
     * <pre>
     * UTC client time when user property was last set.
     * </pre>
     *
     * <code>int64 set_timestamp_usec = 2;</code>
     * @param value The setTimestampUsec to set.
     * @return This builder for chaining.
     */
    public Builder setSetTimestampUsec(long value) {
      copyOnWrite();
      instance.setSetTimestampUsec(value);
      return this;
    }
    /**
     * <pre>
     * UTC client time when user property was last set.
     * </pre>
     *
     * <code>int64 set_timestamp_usec = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSetTimestampUsec() {
      copyOnWrite();
      instance.clearSetTimestampUsec();
      return this;
    }

    /**
     * <pre>
     * Index for user property (one-based).
     * </pre>
     *
     * <code>int32 index = 3;</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return instance.getIndex();
    }
    /**
     * <pre>
     * Index for user property (one-based).
     * </pre>
     *
     * <code>int32 index = 3;</code>
     * @param value The index to set.
     * @return This builder for chaining.
     */
    public Builder setIndex(int value) {
      copyOnWrite();
      instance.setIndex(value);
      return this;
    }
    /**
     * <pre>
     * Index for user property (one-based).
     * </pre>
     *
     * <code>int32 index = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIndex() {
      copyOnWrite();
      instance.clearIndex();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.events.firebase.analytics.v1.UserPropertyValue)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new google.events.firebase.analytics.v1.UserPropertyValue();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "value_",
            "setTimestampUsec_",
            "index_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0002" +
              "\u0003\u0004";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<google.events.firebase.analytics.v1.UserPropertyValue> parser = PARSER;
        if (parser == null) {
          synchronized (google.events.firebase.analytics.v1.UserPropertyValue.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<google.events.firebase.analytics.v1.UserPropertyValue>(
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


  // @@protoc_insertion_point(class_scope:google.events.firebase.analytics.v1.UserPropertyValue)
  private static final google.events.firebase.analytics.v1.UserPropertyValue DEFAULT_INSTANCE;
  static {
    UserPropertyValue defaultInstance = new UserPropertyValue();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      UserPropertyValue.class, defaultInstance);
  }

  public static google.events.firebase.analytics.v1.UserPropertyValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UserPropertyValue> PARSER;

  public static com.google.protobuf.Parser<UserPropertyValue> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

