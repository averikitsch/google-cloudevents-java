// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/firebasealerts/v1/cloud_event_payload.proto

package google.events.firebase.firebasealerts.v1;

public interface CrashlyticsNewNonfatalIssuePayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.events.firebase.firebasealerts.v1.CrashlyticsNewNonfatalIssuePayload)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Basic information of the Crashlytics issue
   * </pre>
   *
   * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 1;</code>
   * @return Whether the issue field is set.
   */
  boolean hasIssue();
  /**
   * <pre>
   * Basic information of the Crashlytics issue
   * </pre>
   *
   * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 1;</code>
   * @return The issue.
   */
  google.events.firebase.firebasealerts.v1.CrashlyticsIssue getIssue();
}
