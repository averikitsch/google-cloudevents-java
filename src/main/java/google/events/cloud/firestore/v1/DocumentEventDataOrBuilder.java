// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/firestore/v1/data.proto

package google.events.cloud.firestore.v1;

public interface DocumentEventDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.firestore.v1.DocumentEventData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A Document object containing a post-operation document snapshot.
   * This is not populated for delete events.
   * </pre>
   *
   * <code>.google.events.cloud.firestore.v1.Document value = 1;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * A Document object containing a post-operation document snapshot.
   * This is not populated for delete events.
   * </pre>
   *
   * <code>.google.events.cloud.firestore.v1.Document value = 1;</code>
   * @return The value.
   */
  google.events.cloud.firestore.v1.Document getValue();
  /**
   * <pre>
   * A Document object containing a post-operation document snapshot.
   * This is not populated for delete events.
   * </pre>
   *
   * <code>.google.events.cloud.firestore.v1.Document value = 1;</code>
   */
  google.events.cloud.firestore.v1.DocumentOrBuilder getValueOrBuilder();

  /**
   * <pre>
   * A Document object containing a pre-operation document snapshot.
   * This is only populated for update and delete events.
   * </pre>
   *
   * <code>.google.events.cloud.firestore.v1.Document old_value = 2;</code>
   * @return Whether the oldValue field is set.
   */
  boolean hasOldValue();
  /**
   * <pre>
   * A Document object containing a pre-operation document snapshot.
   * This is only populated for update and delete events.
   * </pre>
   *
   * <code>.google.events.cloud.firestore.v1.Document old_value = 2;</code>
   * @return The oldValue.
   */
  google.events.cloud.firestore.v1.Document getOldValue();
  /**
   * <pre>
   * A Document object containing a pre-operation document snapshot.
   * This is only populated for update and delete events.
   * </pre>
   *
   * <code>.google.events.cloud.firestore.v1.Document old_value = 2;</code>
   */
  google.events.cloud.firestore.v1.DocumentOrBuilder getOldValueOrBuilder();

  /**
   * <pre>
   * A DocumentMask object that lists changed fields.
   * This is only populated for update events.
   * </pre>
   *
   * <code>.google.events.cloud.firestore.v1.DocumentMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * A DocumentMask object that lists changed fields.
   * This is only populated for update events.
   * </pre>
   *
   * <code>.google.events.cloud.firestore.v1.DocumentMask update_mask = 3;</code>
   * @return The updateMask.
   */
  google.events.cloud.firestore.v1.DocumentMask getUpdateMask();
  /**
   * <pre>
   * A DocumentMask object that lists changed fields.
   * This is only populated for update events.
   * </pre>
   *
   * <code>.google.events.cloud.firestore.v1.DocumentMask update_mask = 3;</code>
   */
  google.events.cloud.firestore.v1.DocumentMaskOrBuilder getUpdateMaskOrBuilder();
}
