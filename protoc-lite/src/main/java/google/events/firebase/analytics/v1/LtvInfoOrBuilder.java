// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/analytics/v1/data.proto

package google.events.firebase.analytics.v1;

public interface LtvInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.events.firebase.analytics.v1.LtvInfo)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The Lifetime Value revenue of this user.
   * </pre>
   *
   * <code>double revenue = 1;</code>
   * @return The revenue.
   */
  double getRevenue();

  /**
   * <pre>
   * The currency corresponding to the revenue.
   * </pre>
   *
   * <code>string currency = 2;</code>
   * @return The currency.
   */
  java.lang.String getCurrency();
  /**
   * <pre>
   * The currency corresponding to the revenue.
   * </pre>
   *
   * <code>string currency = 2;</code>
   * @return The bytes for currency.
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();
}
