// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/firebasealerts/v1/cloud_event_payload.proto

package google.events.firebase.firebasealerts.v1;

/**
 * Protobuf type {@code google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload}
 */
public  final class AppDistroInAppFeedbackPayload extends
    com.google.protobuf.GeneratedMessageLite<
        AppDistroInAppFeedbackPayload, AppDistroInAppFeedbackPayload.Builder> implements
    // @@protoc_insertion_point(message_implements:google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload)
    AppDistroInAppFeedbackPayloadOrBuilder {
  private AppDistroInAppFeedbackPayload() {
    feedbackReport_ = "";
    feedbackConsoleUri_ = "";
    testerName_ = "";
    testerEmail_ = "";
    appVersion_ = "";
    text_ = "";
    screenshotUri_ = "";
  }
  public static final int FEEDBACK_REPORT_FIELD_NUMBER = 1;
  private java.lang.String feedbackReport_;
  /**
   * <pre>
   * Resource name. Format:
   * projects/{project_number}/apps/{app_id}/releases/{release_id}/feedbackReports/{feedback_id}
   * </pre>
   *
   * <code>string feedback_report = 1;</code>
   * @return The feedbackReport.
   */
  @java.lang.Override
  public java.lang.String getFeedbackReport() {
    return feedbackReport_;
  }
  /**
   * <pre>
   * Resource name. Format:
   * projects/{project_number}/apps/{app_id}/releases/{release_id}/feedbackReports/{feedback_id}
   * </pre>
   *
   * <code>string feedback_report = 1;</code>
   * @return The bytes for feedbackReport.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFeedbackReportBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(feedbackReport_);
  }
  /**
   * <pre>
   * Resource name. Format:
   * projects/{project_number}/apps/{app_id}/releases/{release_id}/feedbackReports/{feedback_id}
   * </pre>
   *
   * <code>string feedback_report = 1;</code>
   * @param value The feedbackReport to set.
   */
  private void setFeedbackReport(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    feedbackReport_ = value;
  }
  /**
   * <pre>
   * Resource name. Format:
   * projects/{project_number}/apps/{app_id}/releases/{release_id}/feedbackReports/{feedback_id}
   * </pre>
   *
   * <code>string feedback_report = 1;</code>
   */
  private void clearFeedbackReport() {
    
    feedbackReport_ = getDefaultInstance().getFeedbackReport();
  }
  /**
   * <pre>
   * Resource name. Format:
   * projects/{project_number}/apps/{app_id}/releases/{release_id}/feedbackReports/{feedback_id}
   * </pre>
   *
   * <code>string feedback_report = 1;</code>
   * @param value The bytes for feedbackReport to set.
   */
  private void setFeedbackReportBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    feedbackReport_ = value.toStringUtf8();
    
  }

  public static final int FEEDBACK_CONSOLE_URI_FIELD_NUMBER = 8;
  private java.lang.String feedbackConsoleUri_;
  /**
   * <pre>
   * Deep link back to the Firebase console.
   * </pre>
   *
   * <code>string feedback_console_uri = 8;</code>
   * @return The feedbackConsoleUri.
   */
  @java.lang.Override
  public java.lang.String getFeedbackConsoleUri() {
    return feedbackConsoleUri_;
  }
  /**
   * <pre>
   * Deep link back to the Firebase console.
   * </pre>
   *
   * <code>string feedback_console_uri = 8;</code>
   * @return The bytes for feedbackConsoleUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFeedbackConsoleUriBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(feedbackConsoleUri_);
  }
  /**
   * <pre>
   * Deep link back to the Firebase console.
   * </pre>
   *
   * <code>string feedback_console_uri = 8;</code>
   * @param value The feedbackConsoleUri to set.
   */
  private void setFeedbackConsoleUri(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    feedbackConsoleUri_ = value;
  }
  /**
   * <pre>
   * Deep link back to the Firebase console.
   * </pre>
   *
   * <code>string feedback_console_uri = 8;</code>
   */
  private void clearFeedbackConsoleUri() {
    
    feedbackConsoleUri_ = getDefaultInstance().getFeedbackConsoleUri();
  }
  /**
   * <pre>
   * Deep link back to the Firebase console.
   * </pre>
   *
   * <code>string feedback_console_uri = 8;</code>
   * @param value The bytes for feedbackConsoleUri to set.
   */
  private void setFeedbackConsoleUriBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    feedbackConsoleUri_ = value.toStringUtf8();
    
  }

  public static final int TESTER_NAME_FIELD_NUMBER = 2;
  private java.lang.String testerName_;
  /**
   * <pre>
   * Name of the tester.
   * </pre>
   *
   * <code>string tester_name = 2;</code>
   * @return The testerName.
   */
  @java.lang.Override
  public java.lang.String getTesterName() {
    return testerName_;
  }
  /**
   * <pre>
   * Name of the tester.
   * </pre>
   *
   * <code>string tester_name = 2;</code>
   * @return The bytes for testerName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTesterNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(testerName_);
  }
  /**
   * <pre>
   * Name of the tester.
   * </pre>
   *
   * <code>string tester_name = 2;</code>
   * @param value The testerName to set.
   */
  private void setTesterName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    testerName_ = value;
  }
  /**
   * <pre>
   * Name of the tester.
   * </pre>
   *
   * <code>string tester_name = 2;</code>
   */
  private void clearTesterName() {
    
    testerName_ = getDefaultInstance().getTesterName();
  }
  /**
   * <pre>
   * Name of the tester.
   * </pre>
   *
   * <code>string tester_name = 2;</code>
   * @param value The bytes for testerName to set.
   */
  private void setTesterNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    testerName_ = value.toStringUtf8();
    
  }

  public static final int TESTER_EMAIL_FIELD_NUMBER = 3;
  private java.lang.String testerEmail_;
  /**
   * <pre>
   * Email address of the tester.
   * </pre>
   *
   * <code>string tester_email = 3;</code>
   * @return The testerEmail.
   */
  @java.lang.Override
  public java.lang.String getTesterEmail() {
    return testerEmail_;
  }
  /**
   * <pre>
   * Email address of the tester.
   * </pre>
   *
   * <code>string tester_email = 3;</code>
   * @return The bytes for testerEmail.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTesterEmailBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(testerEmail_);
  }
  /**
   * <pre>
   * Email address of the tester.
   * </pre>
   *
   * <code>string tester_email = 3;</code>
   * @param value The testerEmail to set.
   */
  private void setTesterEmail(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    testerEmail_ = value;
  }
  /**
   * <pre>
   * Email address of the tester.
   * </pre>
   *
   * <code>string tester_email = 3;</code>
   */
  private void clearTesterEmail() {
    
    testerEmail_ = getDefaultInstance().getTesterEmail();
  }
  /**
   * <pre>
   * Email address of the tester.
   * </pre>
   *
   * <code>string tester_email = 3;</code>
   * @param value The bytes for testerEmail to set.
   */
  private void setTesterEmailBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    testerEmail_ = value.toStringUtf8();
    
  }

  public static final int APP_VERSION_FIELD_NUMBER = 9;
  private java.lang.String appVersion_;
  /**
   * <pre>
   * Version consisting of `versionName` and `versionCode` for Android and
   * `CFBundleShortVersionString` and `CFBundleVersion` for iOS.
   * </pre>
   *
   * <code>string app_version = 9;</code>
   * @return The appVersion.
   */
  @java.lang.Override
  public java.lang.String getAppVersion() {
    return appVersion_;
  }
  /**
   * <pre>
   * Version consisting of `versionName` and `versionCode` for Android and
   * `CFBundleShortVersionString` and `CFBundleVersion` for iOS.
   * </pre>
   *
   * <code>string app_version = 9;</code>
   * @return The bytes for appVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAppVersionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(appVersion_);
  }
  /**
   * <pre>
   * Version consisting of `versionName` and `versionCode` for Android and
   * `CFBundleShortVersionString` and `CFBundleVersion` for iOS.
   * </pre>
   *
   * <code>string app_version = 9;</code>
   * @param value The appVersion to set.
   */
  private void setAppVersion(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    appVersion_ = value;
  }
  /**
   * <pre>
   * Version consisting of `versionName` and `versionCode` for Android and
   * `CFBundleShortVersionString` and `CFBundleVersion` for iOS.
   * </pre>
   *
   * <code>string app_version = 9;</code>
   */
  private void clearAppVersion() {
    
    appVersion_ = getDefaultInstance().getAppVersion();
  }
  /**
   * <pre>
   * Version consisting of `versionName` and `versionCode` for Android and
   * `CFBundleShortVersionString` and `CFBundleVersion` for iOS.
   * </pre>
   *
   * <code>string app_version = 9;</code>
   * @param value The bytes for appVersion to set.
   */
  private void setAppVersionBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    appVersion_ = value.toStringUtf8();
    
  }

  public static final int TEXT_FIELD_NUMBER = 6;
  private java.lang.String text_;
  /**
   * <pre>
   * Text entered by the tester.
   * </pre>
   *
   * <code>string text = 6;</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    return text_;
  }
  /**
   * <pre>
   * Text entered by the tester.
   * </pre>
   *
   * <code>string text = 6;</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(text_);
  }
  /**
   * <pre>
   * Text entered by the tester.
   * </pre>
   *
   * <code>string text = 6;</code>
   * @param value The text to set.
   */
  private void setText(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    text_ = value;
  }
  /**
   * <pre>
   * Text entered by the tester.
   * </pre>
   *
   * <code>string text = 6;</code>
   */
  private void clearText() {
    
    text_ = getDefaultInstance().getText();
  }
  /**
   * <pre>
   * Text entered by the tester.
   * </pre>
   *
   * <code>string text = 6;</code>
   * @param value The bytes for text to set.
   */
  private void setTextBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    text_ = value.toStringUtf8();
    
  }

  public static final int SCREENSHOT_URI_FIELD_NUMBER = 7;
  private java.lang.String screenshotUri_;
  /**
   * <pre>
   * URI to download screenshot.  This URI is fast expiring.
   * </pre>
   *
   * <code>string screenshot_uri = 7;</code>
   * @return The screenshotUri.
   */
  @java.lang.Override
  public java.lang.String getScreenshotUri() {
    return screenshotUri_;
  }
  /**
   * <pre>
   * URI to download screenshot.  This URI is fast expiring.
   * </pre>
   *
   * <code>string screenshot_uri = 7;</code>
   * @return The bytes for screenshotUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getScreenshotUriBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(screenshotUri_);
  }
  /**
   * <pre>
   * URI to download screenshot.  This URI is fast expiring.
   * </pre>
   *
   * <code>string screenshot_uri = 7;</code>
   * @param value The screenshotUri to set.
   */
  private void setScreenshotUri(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    screenshotUri_ = value;
  }
  /**
   * <pre>
   * URI to download screenshot.  This URI is fast expiring.
   * </pre>
   *
   * <code>string screenshot_uri = 7;</code>
   */
  private void clearScreenshotUri() {
    
    screenshotUri_ = getDefaultInstance().getScreenshotUri();
  }
  /**
   * <pre>
   * URI to download screenshot.  This URI is fast expiring.
   * </pre>
   *
   * <code>string screenshot_uri = 7;</code>
   * @param value The bytes for screenshotUri to set.
   */
  private void setScreenshotUriBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    screenshotUri_ = value.toStringUtf8();
    
  }

  public static google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload)
      google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayloadOrBuilder {
    // Construct using google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Resource name. Format:
     * projects/{project_number}/apps/{app_id}/releases/{release_id}/feedbackReports/{feedback_id}
     * </pre>
     *
     * <code>string feedback_report = 1;</code>
     * @return The feedbackReport.
     */
    @java.lang.Override
    public java.lang.String getFeedbackReport() {
      return instance.getFeedbackReport();
    }
    /**
     * <pre>
     * Resource name. Format:
     * projects/{project_number}/apps/{app_id}/releases/{release_id}/feedbackReports/{feedback_id}
     * </pre>
     *
     * <code>string feedback_report = 1;</code>
     * @return The bytes for feedbackReport.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFeedbackReportBytes() {
      return instance.getFeedbackReportBytes();
    }
    /**
     * <pre>
     * Resource name. Format:
     * projects/{project_number}/apps/{app_id}/releases/{release_id}/feedbackReports/{feedback_id}
     * </pre>
     *
     * <code>string feedback_report = 1;</code>
     * @param value The feedbackReport to set.
     * @return This builder for chaining.
     */
    public Builder setFeedbackReport(
        java.lang.String value) {
      copyOnWrite();
      instance.setFeedbackReport(value);
      return this;
    }
    /**
     * <pre>
     * Resource name. Format:
     * projects/{project_number}/apps/{app_id}/releases/{release_id}/feedbackReports/{feedback_id}
     * </pre>
     *
     * <code>string feedback_report = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFeedbackReport() {
      copyOnWrite();
      instance.clearFeedbackReport();
      return this;
    }
    /**
     * <pre>
     * Resource name. Format:
     * projects/{project_number}/apps/{app_id}/releases/{release_id}/feedbackReports/{feedback_id}
     * </pre>
     *
     * <code>string feedback_report = 1;</code>
     * @param value The bytes for feedbackReport to set.
     * @return This builder for chaining.
     */
    public Builder setFeedbackReportBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setFeedbackReportBytes(value);
      return this;
    }

    /**
     * <pre>
     * Deep link back to the Firebase console.
     * </pre>
     *
     * <code>string feedback_console_uri = 8;</code>
     * @return The feedbackConsoleUri.
     */
    @java.lang.Override
    public java.lang.String getFeedbackConsoleUri() {
      return instance.getFeedbackConsoleUri();
    }
    /**
     * <pre>
     * Deep link back to the Firebase console.
     * </pre>
     *
     * <code>string feedback_console_uri = 8;</code>
     * @return The bytes for feedbackConsoleUri.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFeedbackConsoleUriBytes() {
      return instance.getFeedbackConsoleUriBytes();
    }
    /**
     * <pre>
     * Deep link back to the Firebase console.
     * </pre>
     *
     * <code>string feedback_console_uri = 8;</code>
     * @param value The feedbackConsoleUri to set.
     * @return This builder for chaining.
     */
    public Builder setFeedbackConsoleUri(
        java.lang.String value) {
      copyOnWrite();
      instance.setFeedbackConsoleUri(value);
      return this;
    }
    /**
     * <pre>
     * Deep link back to the Firebase console.
     * </pre>
     *
     * <code>string feedback_console_uri = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearFeedbackConsoleUri() {
      copyOnWrite();
      instance.clearFeedbackConsoleUri();
      return this;
    }
    /**
     * <pre>
     * Deep link back to the Firebase console.
     * </pre>
     *
     * <code>string feedback_console_uri = 8;</code>
     * @param value The bytes for feedbackConsoleUri to set.
     * @return This builder for chaining.
     */
    public Builder setFeedbackConsoleUriBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setFeedbackConsoleUriBytes(value);
      return this;
    }

    /**
     * <pre>
     * Name of the tester.
     * </pre>
     *
     * <code>string tester_name = 2;</code>
     * @return The testerName.
     */
    @java.lang.Override
    public java.lang.String getTesterName() {
      return instance.getTesterName();
    }
    /**
     * <pre>
     * Name of the tester.
     * </pre>
     *
     * <code>string tester_name = 2;</code>
     * @return The bytes for testerName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTesterNameBytes() {
      return instance.getTesterNameBytes();
    }
    /**
     * <pre>
     * Name of the tester.
     * </pre>
     *
     * <code>string tester_name = 2;</code>
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
     * <pre>
     * Name of the tester.
     * </pre>
     *
     * <code>string tester_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTesterName() {
      copyOnWrite();
      instance.clearTesterName();
      return this;
    }
    /**
     * <pre>
     * Name of the tester.
     * </pre>
     *
     * <code>string tester_name = 2;</code>
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
     * <pre>
     * Email address of the tester.
     * </pre>
     *
     * <code>string tester_email = 3;</code>
     * @return The testerEmail.
     */
    @java.lang.Override
    public java.lang.String getTesterEmail() {
      return instance.getTesterEmail();
    }
    /**
     * <pre>
     * Email address of the tester.
     * </pre>
     *
     * <code>string tester_email = 3;</code>
     * @return The bytes for testerEmail.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTesterEmailBytes() {
      return instance.getTesterEmailBytes();
    }
    /**
     * <pre>
     * Email address of the tester.
     * </pre>
     *
     * <code>string tester_email = 3;</code>
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
     * <pre>
     * Email address of the tester.
     * </pre>
     *
     * <code>string tester_email = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTesterEmail() {
      copyOnWrite();
      instance.clearTesterEmail();
      return this;
    }
    /**
     * <pre>
     * Email address of the tester.
     * </pre>
     *
     * <code>string tester_email = 3;</code>
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
     * <pre>
     * Version consisting of `versionName` and `versionCode` for Android and
     * `CFBundleShortVersionString` and `CFBundleVersion` for iOS.
     * </pre>
     *
     * <code>string app_version = 9;</code>
     * @return The appVersion.
     */
    @java.lang.Override
    public java.lang.String getAppVersion() {
      return instance.getAppVersion();
    }
    /**
     * <pre>
     * Version consisting of `versionName` and `versionCode` for Android and
     * `CFBundleShortVersionString` and `CFBundleVersion` for iOS.
     * </pre>
     *
     * <code>string app_version = 9;</code>
     * @return The bytes for appVersion.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAppVersionBytes() {
      return instance.getAppVersionBytes();
    }
    /**
     * <pre>
     * Version consisting of `versionName` and `versionCode` for Android and
     * `CFBundleShortVersionString` and `CFBundleVersion` for iOS.
     * </pre>
     *
     * <code>string app_version = 9;</code>
     * @param value The appVersion to set.
     * @return This builder for chaining.
     */
    public Builder setAppVersion(
        java.lang.String value) {
      copyOnWrite();
      instance.setAppVersion(value);
      return this;
    }
    /**
     * <pre>
     * Version consisting of `versionName` and `versionCode` for Android and
     * `CFBundleShortVersionString` and `CFBundleVersion` for iOS.
     * </pre>
     *
     * <code>string app_version = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearAppVersion() {
      copyOnWrite();
      instance.clearAppVersion();
      return this;
    }
    /**
     * <pre>
     * Version consisting of `versionName` and `versionCode` for Android and
     * `CFBundleShortVersionString` and `CFBundleVersion` for iOS.
     * </pre>
     *
     * <code>string app_version = 9;</code>
     * @param value The bytes for appVersion to set.
     * @return This builder for chaining.
     */
    public Builder setAppVersionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAppVersionBytes(value);
      return this;
    }

    /**
     * <pre>
     * Text entered by the tester.
     * </pre>
     *
     * <code>string text = 6;</code>
     * @return The text.
     */
    @java.lang.Override
    public java.lang.String getText() {
      return instance.getText();
    }
    /**
     * <pre>
     * Text entered by the tester.
     * </pre>
     *
     * <code>string text = 6;</code>
     * @return The bytes for text.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTextBytes() {
      return instance.getTextBytes();
    }
    /**
     * <pre>
     * Text entered by the tester.
     * </pre>
     *
     * <code>string text = 6;</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      copyOnWrite();
      instance.setText(value);
      return this;
    }
    /**
     * <pre>
     * Text entered by the tester.
     * </pre>
     *
     * <code>string text = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      copyOnWrite();
      instance.clearText();
      return this;
    }
    /**
     * <pre>
     * Text entered by the tester.
     * </pre>
     *
     * <code>string text = 6;</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTextBytes(value);
      return this;
    }

    /**
     * <pre>
     * URI to download screenshot.  This URI is fast expiring.
     * </pre>
     *
     * <code>string screenshot_uri = 7;</code>
     * @return The screenshotUri.
     */
    @java.lang.Override
    public java.lang.String getScreenshotUri() {
      return instance.getScreenshotUri();
    }
    /**
     * <pre>
     * URI to download screenshot.  This URI is fast expiring.
     * </pre>
     *
     * <code>string screenshot_uri = 7;</code>
     * @return The bytes for screenshotUri.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getScreenshotUriBytes() {
      return instance.getScreenshotUriBytes();
    }
    /**
     * <pre>
     * URI to download screenshot.  This URI is fast expiring.
     * </pre>
     *
     * <code>string screenshot_uri = 7;</code>
     * @param value The screenshotUri to set.
     * @return This builder for chaining.
     */
    public Builder setScreenshotUri(
        java.lang.String value) {
      copyOnWrite();
      instance.setScreenshotUri(value);
      return this;
    }
    /**
     * <pre>
     * URI to download screenshot.  This URI is fast expiring.
     * </pre>
     *
     * <code>string screenshot_uri = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearScreenshotUri() {
      copyOnWrite();
      instance.clearScreenshotUri();
      return this;
    }
    /**
     * <pre>
     * URI to download screenshot.  This URI is fast expiring.
     * </pre>
     *
     * <code>string screenshot_uri = 7;</code>
     * @param value The bytes for screenshotUri to set.
     * @return This builder for chaining.
     */
    public Builder setScreenshotUriBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setScreenshotUriBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "feedbackReport_",
            "testerName_",
            "testerEmail_",
            "text_",
            "screenshotUri_",
            "feedbackConsoleUri_",
            "appVersion_",
          };
          java.lang.String info =
              "\u0000\u0007\u0000\u0000\u0001\t\u0007\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload> parser = PARSER;
        if (parser == null) {
          synchronized (google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload>(
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


  // @@protoc_insertion_point(class_scope:google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload)
  private static final google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload DEFAULT_INSTANCE;
  static {
    AppDistroInAppFeedbackPayload defaultInstance = new AppDistroInAppFeedbackPayload();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      AppDistroInAppFeedbackPayload.class, defaultInstance);
  }

  public static google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AppDistroInAppFeedbackPayload> PARSER;

  public static com.google.protobuf.Parser<AppDistroInAppFeedbackPayload> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

