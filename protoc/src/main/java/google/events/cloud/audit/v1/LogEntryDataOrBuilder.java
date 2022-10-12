// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/audit/v1/data.proto

package google.events.cloud.audit.v1;

public interface LogEntryDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.audit.v1.LogEntryData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the log to which this log entry belongs.
   * </pre>
   *
   * <code>string log_name = 12;</code>
   * @return The logName.
   */
  java.lang.String getLogName();
  /**
   * <pre>
   * The resource name of the log to which this log entry belongs.
   * </pre>
   *
   * <code>string log_name = 12;</code>
   * @return The bytes for logName.
   */
  com.google.protobuf.ByteString
      getLogNameBytes();

  /**
   * <pre>
   * The monitored resource that produced this log entry.
   * Example: a log entry that reports a database error would be associated with
   * the monitored resource designating the particular database that reported
   * the error.
   * </pre>
   *
   * <code>.com.google.api.MonitoredResource resource = 8;</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <pre>
   * The monitored resource that produced this log entry.
   * Example: a log entry that reports a database error would be associated with
   * the monitored resource designating the particular database that reported
   * the error.
   * </pre>
   *
   * <code>.com.google.api.MonitoredResource resource = 8;</code>
   * @return The resource.
   */
  com.google.api.MonitoredResource getResource();
  /**
   * <pre>
   * The monitored resource that produced this log entry.
   * Example: a log entry that reports a database error would be associated with
   * the monitored resource designating the particular database that reported
   * the error.
   * </pre>
   *
   * <code>.com.google.api.MonitoredResource resource = 8;</code>
   */
  com.google.api.MonitoredResourceOrBuilder getResourceOrBuilder();

  /**
   * <pre>
   * The log entry payload, which is always an AuditLog for Cloud Audit Log
   * events.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.AuditLog proto_payload = 2;</code>
   * @return Whether the protoPayload field is set.
   */
  boolean hasProtoPayload();
  /**
   * <pre>
   * The log entry payload, which is always an AuditLog for Cloud Audit Log
   * events.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.AuditLog proto_payload = 2;</code>
   * @return The protoPayload.
   */
  google.events.cloud.audit.v1.AuditLog getProtoPayload();
  /**
   * <pre>
   * The log entry payload, which is always an AuditLog for Cloud Audit Log
   * events.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.AuditLog proto_payload = 2;</code>
   */
  google.events.cloud.audit.v1.AuditLogOrBuilder getProtoPayloadOrBuilder();

  /**
   * <pre>
   * A unique identifier for the log entry.
   * </pre>
   *
   * <code>string insert_id = 4;</code>
   * @return The insertId.
   */
  java.lang.String getInsertId();
  /**
   * <pre>
   * A unique identifier for the log entry.
   * </pre>
   *
   * <code>string insert_id = 4;</code>
   * @return The bytes for insertId.
   */
  com.google.protobuf.ByteString
      getInsertIdBytes();

  /**
   * <pre>
   * A set of user-defined (key, value) data that provides additional
   * information about the log entry.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * A set of user-defined (key, value) data that provides additional
   * information about the log entry.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * A set of user-defined (key, value) data that provides additional
   * information about the log entry.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * A set of user-defined (key, value) data that provides additional
   * information about the log entry.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */

  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * A set of user-defined (key, value) data that provides additional
   * information about the log entry.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Information about an operation associated with the log entry, if
   * applicable.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.LogEntryOperation operation = 15;</code>
   * @return Whether the operation field is set.
   */
  boolean hasOperation();
  /**
   * <pre>
   * Information about an operation associated with the log entry, if
   * applicable.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.LogEntryOperation operation = 15;</code>
   * @return The operation.
   */
  google.events.cloud.audit.v1.LogEntryOperation getOperation();
  /**
   * <pre>
   * Information about an operation associated with the log entry, if
   * applicable.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.LogEntryOperation operation = 15;</code>
   */
  google.events.cloud.audit.v1.LogEntryOperationOrBuilder getOperationOrBuilder();

  /**
   * <pre>
   * The time the event described by the log entry occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 9;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * The time the event described by the log entry occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 9;</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <pre>
   * The time the event described by the log entry occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * The time the log entry was received by Logging.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp receive_timestamp = 24;</code>
   * @return Whether the receiveTimestamp field is set.
   */
  boolean hasReceiveTimestamp();
  /**
   * <pre>
   * The time the log entry was received by Logging.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp receive_timestamp = 24;</code>
   * @return The receiveTimestamp.
   */
  com.google.protobuf.Timestamp getReceiveTimestamp();
  /**
   * <pre>
   * The time the log entry was received by Logging.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp receive_timestamp = 24;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReceiveTimestampOrBuilder();

  /**
   * <pre>
   * The severity of the log entry.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.LogSeverity severity = 10;</code>
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();
  /**
   * <pre>
   * The severity of the log entry.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.LogSeverity severity = 10;</code>
   * @return The severity.
   */
  google.events.cloud.audit.v1.LogSeverity getSeverity();

  /**
   * <pre>
   * Resource name of the trace associated with the log entry, if any. If it
   * contains a relative resource name, the name is assumed to be relative to
   * `//tracing.googleapis.com`. Example:
   * `projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824`
   * </pre>
   *
   * <code>string trace = 22;</code>
   * @return The trace.
   */
  java.lang.String getTrace();
  /**
   * <pre>
   * Resource name of the trace associated with the log entry, if any. If it
   * contains a relative resource name, the name is assumed to be relative to
   * `//tracing.googleapis.com`. Example:
   * `projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824`
   * </pre>
   *
   * <code>string trace = 22;</code>
   * @return The bytes for trace.
   */
  com.google.protobuf.ByteString
      getTraceBytes();

  /**
   * <pre>
   * The span ID within the trace associated with the log entry, if any.
   * For Trace spans, this is the same format that the Trace API v2 uses: a
   * 16-character hexadecimal encoding of an 8-byte array, such as
   * `000000000000004a`.
   * </pre>
   *
   * <code>string span_id = 27;</code>
   * @return The spanId.
   */
  java.lang.String getSpanId();
  /**
   * <pre>
   * The span ID within the trace associated with the log entry, if any.
   * For Trace spans, this is the same format that the Trace API v2 uses: a
   * 16-character hexadecimal encoding of an 8-byte array, such as
   * `000000000000004a`.
   * </pre>
   *
   * <code>string span_id = 27;</code>
   * @return The bytes for spanId.
   */
  com.google.protobuf.ByteString
      getSpanIdBytes();

  /**
   * <pre>
   * Information indicating this LogEntry is part of a sequence of multiple logs
   * split from a single LogEntry.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.LogSplit split = 35;</code>
   * @return Whether the split field is set.
   */
  boolean hasSplit();
  /**
   * <pre>
   * Information indicating this LogEntry is part of a sequence of multiple logs
   * split from a single LogEntry.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.LogSplit split = 35;</code>
   * @return The split.
   */
  google.events.cloud.audit.v1.LogSplit getSplit();
  /**
   * <pre>
   * Information indicating this LogEntry is part of a sequence of multiple logs
   * split from a single LogEntry.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.LogSplit split = 35;</code>
   */
  google.events.cloud.audit.v1.LogSplitOrBuilder getSplitOrBuilder();
}
