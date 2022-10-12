// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/firebasealerts/v1/cloud_event_payload.proto

package google.events.firebase.firebasealerts.v1;

public interface AppDistroInAppFeedbackPayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.events.firebase.firebasealerts.v1.AppDistroInAppFeedbackPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name. Format:
   * projects/{project_number}/apps/{app_id}/releases/{release_id}/feedbackReports/{feedback_id}
   * </pre>
   *
   * <code>string feedback_report = 1;</code>
   * @return The feedbackReport.
   */
  java.lang.String getFeedbackReport();
  /**
   * <pre>
   * Resource name. Format:
   * projects/{project_number}/apps/{app_id}/releases/{release_id}/feedbackReports/{feedback_id}
   * </pre>
   *
   * <code>string feedback_report = 1;</code>
   * @return The bytes for feedbackReport.
   */
  com.google.protobuf.ByteString
      getFeedbackReportBytes();

  /**
   * <pre>
   * Deep link back to the Firebase console.
   * </pre>
   *
   * <code>string feedback_console_uri = 8;</code>
   * @return The feedbackConsoleUri.
   */
  java.lang.String getFeedbackConsoleUri();
  /**
   * <pre>
   * Deep link back to the Firebase console.
   * </pre>
   *
   * <code>string feedback_console_uri = 8;</code>
   * @return The bytes for feedbackConsoleUri.
   */
  com.google.protobuf.ByteString
      getFeedbackConsoleUriBytes();

  /**
   * <pre>
   * Name of the tester.
   * </pre>
   *
   * <code>string tester_name = 2;</code>
   * @return The testerName.
   */
  java.lang.String getTesterName();
  /**
   * <pre>
   * Name of the tester.
   * </pre>
   *
   * <code>string tester_name = 2;</code>
   * @return The bytes for testerName.
   */
  com.google.protobuf.ByteString
      getTesterNameBytes();

  /**
   * <pre>
   * Email address of the tester.
   * </pre>
   *
   * <code>string tester_email = 3;</code>
   * @return The testerEmail.
   */
  java.lang.String getTesterEmail();
  /**
   * <pre>
   * Email address of the tester.
   * </pre>
   *
   * <code>string tester_email = 3;</code>
   * @return The bytes for testerEmail.
   */
  com.google.protobuf.ByteString
      getTesterEmailBytes();

  /**
   * <pre>
   * Version consisting of `versionName` and `versionCode` for Android and
   * `CFBundleShortVersionString` and `CFBundleVersion` for iOS.
   * </pre>
   *
   * <code>string app_version = 9;</code>
   * @return The appVersion.
   */
  java.lang.String getAppVersion();
  /**
   * <pre>
   * Version consisting of `versionName` and `versionCode` for Android and
   * `CFBundleShortVersionString` and `CFBundleVersion` for iOS.
   * </pre>
   *
   * <code>string app_version = 9;</code>
   * @return The bytes for appVersion.
   */
  com.google.protobuf.ByteString
      getAppVersionBytes();

  /**
   * <pre>
   * Text entered by the tester.
   * </pre>
   *
   * <code>string text = 6;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * Text entered by the tester.
   * </pre>
   *
   * <code>string text = 6;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * URI to download screenshot.  This URI is fast expiring.
   * </pre>
   *
   * <code>string screenshot_uri = 7;</code>
   * @return The screenshotUri.
   */
  java.lang.String getScreenshotUri();
  /**
   * <pre>
   * URI to download screenshot.  This URI is fast expiring.
   * </pre>
   *
   * <code>string screenshot_uri = 7;</code>
   * @return The bytes for screenshotUri.
   */
  com.google.protobuf.ByteString
      getScreenshotUriBytes();
}
