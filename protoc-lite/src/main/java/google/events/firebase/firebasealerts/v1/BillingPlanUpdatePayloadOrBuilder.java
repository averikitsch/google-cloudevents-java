// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/firebasealerts/v1/cloud_event_payload.proto

package google.events.firebase.firebasealerts.v1;

public interface BillingPlanUpdatePayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.events.firebase.firebasealerts.v1.BillingPlanUpdatePayload)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * A Firebase plan
   * </pre>
   *
   * <code>string billing_plan = 1;</code>
   * @return The billingPlan.
   */
  java.lang.String getBillingPlan();
  /**
   * <pre>
   * A Firebase plan
   * </pre>
   *
   * <code>string billing_plan = 1;</code>
   * @return The bytes for billingPlan.
   */
  com.google.protobuf.ByteString
      getBillingPlanBytes();

  /**
   * <pre>
   * The email address of the person that triggered billing plan change
   * </pre>
   *
   * <code>string principal_email = 2;</code>
   * @return The principalEmail.
   */
  java.lang.String getPrincipalEmail();
  /**
   * <pre>
   * The email address of the person that triggered billing plan change
   * </pre>
   *
   * <code>string principal_email = 2;</code>
   * @return The bytes for principalEmail.
   */
  com.google.protobuf.ByteString
      getPrincipalEmailBytes();

  /**
   * <pre>
   * The type of the notification, e.g. upgrade, downgrade
   * </pre>
   *
   * <code>string notification_type = 3;</code>
   * @return The notificationType.
   */
  java.lang.String getNotificationType();
  /**
   * <pre>
   * The type of the notification, e.g. upgrade, downgrade
   * </pre>
   *
   * <code>string notification_type = 3;</code>
   * @return The bytes for notificationType.
   */
  com.google.protobuf.ByteString
      getNotificationTypeBytes();
}