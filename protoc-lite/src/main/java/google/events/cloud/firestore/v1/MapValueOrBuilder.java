// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/firestore/v1/data.proto

package google.events.cloud.firestore.v1;

public interface MapValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.firestore.v1.MapValue)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The map's fields.
   * The map keys represent field names. Field names matching the regular
   * expression `__.*__` are reserved. Reserved field names are forbidden except
   * in certain documented contexts. The map keys, represented as UTF-8, must
   * not exceed 1,500 bytes and cannot be empty.
   * </pre>
   *
   * <code>map&lt;string, .google.events.cloud.firestore.v1.Value&gt; fields = 1;</code>
   */
  int getFieldsCount();
  /**
   * <pre>
   * The map's fields.
   * The map keys represent field names. Field names matching the regular
   * expression `__.*__` are reserved. Reserved field names are forbidden except
   * in certain documented contexts. The map keys, represented as UTF-8, must
   * not exceed 1,500 bytes and cannot be empty.
   * </pre>
   *
   * <code>map&lt;string, .google.events.cloud.firestore.v1.Value&gt; fields = 1;</code>
   */
  boolean containsFields(
      java.lang.String key);
  /**
   * Use {@link #getFieldsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, google.events.cloud.firestore.v1.Value>
  getFields();
  /**
   * <pre>
   * The map's fields.
   * The map keys represent field names. Field names matching the regular
   * expression `__.*__` are reserved. Reserved field names are forbidden except
   * in certain documented contexts. The map keys, represented as UTF-8, must
   * not exceed 1,500 bytes and cannot be empty.
   * </pre>
   *
   * <code>map&lt;string, .google.events.cloud.firestore.v1.Value&gt; fields = 1;</code>
   */
  java.util.Map<java.lang.String, google.events.cloud.firestore.v1.Value>
  getFieldsMap();
  /**
   * <pre>
   * The map's fields.
   * The map keys represent field names. Field names matching the regular
   * expression `__.*__` are reserved. Reserved field names are forbidden except
   * in certain documented contexts. The map keys, represented as UTF-8, must
   * not exceed 1,500 bytes and cannot be empty.
   * </pre>
   *
   * <code>map&lt;string, .google.events.cloud.firestore.v1.Value&gt; fields = 1;</code>
   */

  /* nullable */
google.events.cloud.firestore.v1.Value getFieldsOrDefault(
      java.lang.String key,
      /* nullable */
google.events.cloud.firestore.v1.Value defaultValue);
  /**
   * <pre>
   * The map's fields.
   * The map keys represent field names. Field names matching the regular
   * expression `__.*__` are reserved. Reserved field names are forbidden except
   * in certain documented contexts. The map keys, represented as UTF-8, must
   * not exceed 1,500 bytes and cannot be empty.
   * </pre>
   *
   * <code>map&lt;string, .google.events.cloud.firestore.v1.Value&gt; fields = 1;</code>
   */

  google.events.cloud.firestore.v1.Value getFieldsOrThrow(
      java.lang.String key);
}
