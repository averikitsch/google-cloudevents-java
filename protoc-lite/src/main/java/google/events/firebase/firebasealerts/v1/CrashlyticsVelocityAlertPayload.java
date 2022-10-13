// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/firebasealerts/v1/cloud_event_payload.proto

package google.events.firebase.firebasealerts.v1;

/**
 * Protobuf type {@code google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload}
 */
public  final class CrashlyticsVelocityAlertPayload extends
    com.google.protobuf.GeneratedMessageLite<
        CrashlyticsVelocityAlertPayload, CrashlyticsVelocityAlertPayload.Builder> implements
    // @@protoc_insertion_point(message_implements:google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload)
    CrashlyticsVelocityAlertPayloadOrBuilder {
  private CrashlyticsVelocityAlertPayload() {
    firstVersion_ = "";
  }
  public static final int ISSUE_FIELD_NUMBER = 1;
  private google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue_;
  /**
   * <pre>
   * Basic information of the Crashlytics issue
   * </pre>
   *
   * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 1;</code>
   */
  @java.lang.Override
  public boolean hasIssue() {
    return issue_ != null;
  }
  /**
   * <pre>
   * Basic information of the Crashlytics issue
   * </pre>
   *
   * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 1;</code>
   */
  @java.lang.Override
  public google.events.firebase.firebasealerts.v1.CrashlyticsIssue getIssue() {
    return issue_ == null ? google.events.firebase.firebasealerts.v1.CrashlyticsIssue.getDefaultInstance() : issue_;
  }
  /**
   * <pre>
   * Basic information of the Crashlytics issue
   * </pre>
   *
   * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 1;</code>
   */
  private void setIssue(google.events.firebase.firebasealerts.v1.CrashlyticsIssue value) {
    value.getClass();
  issue_ = value;
    
    }
  /**
   * <pre>
   * Basic information of the Crashlytics issue
   * </pre>
   *
   * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeIssue(google.events.firebase.firebasealerts.v1.CrashlyticsIssue value) {
    value.getClass();
  if (issue_ != null &&
        issue_ != google.events.firebase.firebasealerts.v1.CrashlyticsIssue.getDefaultInstance()) {
      issue_ =
        google.events.firebase.firebasealerts.v1.CrashlyticsIssue.newBuilder(issue_).mergeFrom(value).buildPartial();
    } else {
      issue_ = value;
    }
    
  }
  /**
   * <pre>
   * Basic information of the Crashlytics issue
   * </pre>
   *
   * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 1;</code>
   */
  private void clearIssue() {  issue_ = null;
    
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp createTime_;
  /**
   * <pre>
   * The time that the Crashlytics issue gets created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   * <pre>
   * The time that the Crashlytics issue gets created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   * <pre>
   * The time that the Crashlytics issue gets created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  private void setCreateTime(com.google.protobuf.Timestamp value) {
    value.getClass();
  createTime_ = value;
    
    }
  /**
   * <pre>
   * The time that the Crashlytics issue gets created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeCreateTime(com.google.protobuf.Timestamp value) {
    value.getClass();
  if (createTime_ != null &&
        createTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
      createTime_ =
        com.google.protobuf.Timestamp.newBuilder(createTime_).mergeFrom(value).buildPartial();
    } else {
      createTime_ = value;
    }
    
  }
  /**
   * <pre>
   * The time that the Crashlytics issue gets created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  private void clearCreateTime() {  createTime_ = null;
    
  }

  public static final int CRASH_COUNT_FIELD_NUMBER = 3;
  private long crashCount_;
  /**
   * <pre>
   * The number of user sessions for the given app version that had this
   * specific crash issue in the time period used to trigger the velocity alert,
   * which is currently 1h
   * </pre>
   *
   * <code>int64 crash_count = 3;</code>
   * @return The crashCount.
   */
  @java.lang.Override
  public long getCrashCount() {
    return crashCount_;
  }
  /**
   * <pre>
   * The number of user sessions for the given app version that had this
   * specific crash issue in the time period used to trigger the velocity alert,
   * which is currently 1h
   * </pre>
   *
   * <code>int64 crash_count = 3;</code>
   * @param value The crashCount to set.
   */
  private void setCrashCount(long value) {
    
    crashCount_ = value;
  }
  /**
   * <pre>
   * The number of user sessions for the given app version that had this
   * specific crash issue in the time period used to trigger the velocity alert,
   * which is currently 1h
   * </pre>
   *
   * <code>int64 crash_count = 3;</code>
   */
  private void clearCrashCount() {
    
    crashCount_ = 0L;
  }

  public static final int CRASH_PERCENTAGE_FIELD_NUMBER = 4;
  private double crashPercentage_;
  /**
   * <pre>
   * The percentage of user sessions for the given app version that had this
   * specific crash issue in the time period used to trigger the velocity alert,
   * which is currently 1h
   * </pre>
   *
   * <code>double crash_percentage = 4;</code>
   * @return The crashPercentage.
   */
  @java.lang.Override
  public double getCrashPercentage() {
    return crashPercentage_;
  }
  /**
   * <pre>
   * The percentage of user sessions for the given app version that had this
   * specific crash issue in the time period used to trigger the velocity alert,
   * which is currently 1h
   * </pre>
   *
   * <code>double crash_percentage = 4;</code>
   * @param value The crashPercentage to set.
   */
  private void setCrashPercentage(double value) {
    
    crashPercentage_ = value;
  }
  /**
   * <pre>
   * The percentage of user sessions for the given app version that had this
   * specific crash issue in the time period used to trigger the velocity alert,
   * which is currently 1h
   * </pre>
   *
   * <code>double crash_percentage = 4;</code>
   */
  private void clearCrashPercentage() {
    
    crashPercentage_ = 0D;
  }

  public static final int FIRST_VERSION_FIELD_NUMBER = 5;
  private java.lang.String firstVersion_;
  /**
   * <pre>
   * The first app version where this issue was seen, and not necessarily the
   * version that has triggered the alert
   * </pre>
   *
   * <code>string first_version = 5;</code>
   * @return The firstVersion.
   */
  @java.lang.Override
  public java.lang.String getFirstVersion() {
    return firstVersion_;
  }
  /**
   * <pre>
   * The first app version where this issue was seen, and not necessarily the
   * version that has triggered the alert
   * </pre>
   *
   * <code>string first_version = 5;</code>
   * @return The bytes for firstVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFirstVersionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(firstVersion_);
  }
  /**
   * <pre>
   * The first app version where this issue was seen, and not necessarily the
   * version that has triggered the alert
   * </pre>
   *
   * <code>string first_version = 5;</code>
   * @param value The firstVersion to set.
   */
  private void setFirstVersion(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    firstVersion_ = value;
  }
  /**
   * <pre>
   * The first app version where this issue was seen, and not necessarily the
   * version that has triggered the alert
   * </pre>
   *
   * <code>string first_version = 5;</code>
   */
  private void clearFirstVersion() {
    
    firstVersion_ = getDefaultInstance().getFirstVersion();
  }
  /**
   * <pre>
   * The first app version where this issue was seen, and not necessarily the
   * version that has triggered the alert
   * </pre>
   *
   * <code>string first_version = 5;</code>
   * @param value The bytes for firstVersion to set.
   */
  private void setFirstVersionBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    firstVersion_ = value.toStringUtf8();
    
  }

  public static google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload)
      google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayloadOrBuilder {
    // Construct using google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Basic information of the Crashlytics issue
     * </pre>
     *
     * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 1;</code>
     */
    @java.lang.Override
    public boolean hasIssue() {
      return instance.hasIssue();
    }
    /**
     * <pre>
     * Basic information of the Crashlytics issue
     * </pre>
     *
     * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 1;</code>
     */
    @java.lang.Override
    public google.events.firebase.firebasealerts.v1.CrashlyticsIssue getIssue() {
      return instance.getIssue();
    }
    /**
     * <pre>
     * Basic information of the Crashlytics issue
     * </pre>
     *
     * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 1;</code>
     */
    public Builder setIssue(google.events.firebase.firebasealerts.v1.CrashlyticsIssue value) {
      copyOnWrite();
      instance.setIssue(value);
      return this;
      }
    /**
     * <pre>
     * Basic information of the Crashlytics issue
     * </pre>
     *
     * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 1;</code>
     */
    public Builder setIssue(
        google.events.firebase.firebasealerts.v1.CrashlyticsIssue.Builder builderForValue) {
      copyOnWrite();
      instance.setIssue(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Basic information of the Crashlytics issue
     * </pre>
     *
     * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 1;</code>
     */
    public Builder mergeIssue(google.events.firebase.firebasealerts.v1.CrashlyticsIssue value) {
      copyOnWrite();
      instance.mergeIssue(value);
      return this;
    }
    /**
     * <pre>
     * Basic information of the Crashlytics issue
     * </pre>
     *
     * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 1;</code>
     */
    public Builder clearIssue() {  copyOnWrite();
      instance.clearIssue();
      return this;
    }

    /**
     * <pre>
     * The time that the Crashlytics issue gets created
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    @java.lang.Override
    public boolean hasCreateTime() {
      return instance.hasCreateTime();
    }
    /**
     * <pre>
     * The time that the Crashlytics issue gets created
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getCreateTime() {
      return instance.getCreateTime();
    }
    /**
     * <pre>
     * The time that the Crashlytics issue gets created
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.setCreateTime(value);
      return this;
      }
    /**
     * <pre>
     * The time that the Crashlytics issue gets created
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder setCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      copyOnWrite();
      instance.setCreateTime(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The time that the Crashlytics issue gets created
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.mergeCreateTime(value);
      return this;
    }
    /**
     * <pre>
     * The time that the Crashlytics issue gets created
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder clearCreateTime() {  copyOnWrite();
      instance.clearCreateTime();
      return this;
    }

    /**
     * <pre>
     * The number of user sessions for the given app version that had this
     * specific crash issue in the time period used to trigger the velocity alert,
     * which is currently 1h
     * </pre>
     *
     * <code>int64 crash_count = 3;</code>
     * @return The crashCount.
     */
    @java.lang.Override
    public long getCrashCount() {
      return instance.getCrashCount();
    }
    /**
     * <pre>
     * The number of user sessions for the given app version that had this
     * specific crash issue in the time period used to trigger the velocity alert,
     * which is currently 1h
     * </pre>
     *
     * <code>int64 crash_count = 3;</code>
     * @param value The crashCount to set.
     * @return This builder for chaining.
     */
    public Builder setCrashCount(long value) {
      copyOnWrite();
      instance.setCrashCount(value);
      return this;
    }
    /**
     * <pre>
     * The number of user sessions for the given app version that had this
     * specific crash issue in the time period used to trigger the velocity alert,
     * which is currently 1h
     * </pre>
     *
     * <code>int64 crash_count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCrashCount() {
      copyOnWrite();
      instance.clearCrashCount();
      return this;
    }

    /**
     * <pre>
     * The percentage of user sessions for the given app version that had this
     * specific crash issue in the time period used to trigger the velocity alert,
     * which is currently 1h
     * </pre>
     *
     * <code>double crash_percentage = 4;</code>
     * @return The crashPercentage.
     */
    @java.lang.Override
    public double getCrashPercentage() {
      return instance.getCrashPercentage();
    }
    /**
     * <pre>
     * The percentage of user sessions for the given app version that had this
     * specific crash issue in the time period used to trigger the velocity alert,
     * which is currently 1h
     * </pre>
     *
     * <code>double crash_percentage = 4;</code>
     * @param value The crashPercentage to set.
     * @return This builder for chaining.
     */
    public Builder setCrashPercentage(double value) {
      copyOnWrite();
      instance.setCrashPercentage(value);
      return this;
    }
    /**
     * <pre>
     * The percentage of user sessions for the given app version that had this
     * specific crash issue in the time period used to trigger the velocity alert,
     * which is currently 1h
     * </pre>
     *
     * <code>double crash_percentage = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCrashPercentage() {
      copyOnWrite();
      instance.clearCrashPercentage();
      return this;
    }

    /**
     * <pre>
     * The first app version where this issue was seen, and not necessarily the
     * version that has triggered the alert
     * </pre>
     *
     * <code>string first_version = 5;</code>
     * @return The firstVersion.
     */
    @java.lang.Override
    public java.lang.String getFirstVersion() {
      return instance.getFirstVersion();
    }
    /**
     * <pre>
     * The first app version where this issue was seen, and not necessarily the
     * version that has triggered the alert
     * </pre>
     *
     * <code>string first_version = 5;</code>
     * @return The bytes for firstVersion.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFirstVersionBytes() {
      return instance.getFirstVersionBytes();
    }
    /**
     * <pre>
     * The first app version where this issue was seen, and not necessarily the
     * version that has triggered the alert
     * </pre>
     *
     * <code>string first_version = 5;</code>
     * @param value The firstVersion to set.
     * @return This builder for chaining.
     */
    public Builder setFirstVersion(
        java.lang.String value) {
      copyOnWrite();
      instance.setFirstVersion(value);
      return this;
    }
    /**
     * <pre>
     * The first app version where this issue was seen, and not necessarily the
     * version that has triggered the alert
     * </pre>
     *
     * <code>string first_version = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstVersion() {
      copyOnWrite();
      instance.clearFirstVersion();
      return this;
    }
    /**
     * <pre>
     * The first app version where this issue was seen, and not necessarily the
     * version that has triggered the alert
     * </pre>
     *
     * <code>string first_version = 5;</code>
     * @param value The bytes for firstVersion to set.
     * @return This builder for chaining.
     */
    public Builder setFirstVersionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setFirstVersionBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "issue_",
            "createTime_",
            "crashCount_",
            "crashPercentage_",
            "firstVersion_",
          };
          java.lang.String info =
              "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003" +
              "\u0002\u0004\u0000\u0005\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload> parser = PARSER;
        if (parser == null) {
          synchronized (google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload>(
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


  // @@protoc_insertion_point(class_scope:google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload)
  private static final google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload DEFAULT_INSTANCE;
  static {
    CrashlyticsVelocityAlertPayload defaultInstance = new CrashlyticsVelocityAlertPayload();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      CrashlyticsVelocityAlertPayload.class, defaultInstance);
  }

  public static google.events.firebase.firebasealerts.v1.CrashlyticsVelocityAlertPayload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CrashlyticsVelocityAlertPayload> PARSER;

  public static com.google.protobuf.Parser<CrashlyticsVelocityAlertPayload> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
