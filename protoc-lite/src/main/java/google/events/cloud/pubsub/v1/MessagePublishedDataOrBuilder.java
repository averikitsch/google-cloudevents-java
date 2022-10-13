// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/pubsub/v1/data.proto

package google.events.cloud.pubsub.v1;

public interface MessagePublishedDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.pubsub.v1.MessagePublishedData)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The message that was published.
   * </pre>
   *
   * <code>.google.events.cloud.pubsub.v1.PubsubMessage message = 1;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * The message that was published.
   * </pre>
   *
   * <code>.google.events.cloud.pubsub.v1.PubsubMessage message = 1;</code>
   * @return The message.
   */
  google.events.cloud.pubsub.v1.PubsubMessage getMessage();

  /**
   * <pre>
   * The resource name of the subscription for which this event was
   * generated. The format of the value is
   * `projects/{project-id}/subscriptions/{subscription-id}`.
   * </pre>
   *
   * <code>string subscription = 2;</code>
   * @return The subscription.
   */
  java.lang.String getSubscription();
  /**
   * <pre>
   * The resource name of the subscription for which this event was
   * generated. The format of the value is
   * `projects/{project-id}/subscriptions/{subscription-id}`.
   * </pre>
   *
   * <code>string subscription = 2;</code>
   * @return The bytes for subscription.
   */
  com.google.protobuf.ByteString
      getSubscriptionBytes();
}