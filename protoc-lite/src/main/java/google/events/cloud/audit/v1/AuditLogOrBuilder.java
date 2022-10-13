// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/audit/v1/data.proto

package google.events.cloud.audit.v1;

public interface AuditLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.audit.v1.AuditLog)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The name of the API service performing the operation. For example,
   * `"datastore.googleapis.com"`.
   * </pre>
   *
   * <code>string service_name = 7;</code>
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   * <pre>
   * The name of the API service performing the operation. For example,
   * `"datastore.googleapis.com"`.
   * </pre>
   *
   * <code>string service_name = 7;</code>
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <pre>
   * The name of the service method or operation.
   * For API calls, this should be the name of the API method.
   * For example,
   *     "google.datastore.v1.Datastore.RunQuery"
   *     "google.logging.v1.LoggingService.DeleteLog"
   * </pre>
   *
   * <code>string method_name = 8;</code>
   * @return The methodName.
   */
  java.lang.String getMethodName();
  /**
   * <pre>
   * The name of the service method or operation.
   * For API calls, this should be the name of the API method.
   * For example,
   *     "google.datastore.v1.Datastore.RunQuery"
   *     "google.logging.v1.LoggingService.DeleteLog"
   * </pre>
   *
   * <code>string method_name = 8;</code>
   * @return The bytes for methodName.
   */
  com.google.protobuf.ByteString
      getMethodNameBytes();

  /**
   * <pre>
   * The resource or collection that is the target of the operation.
   * The name is a scheme-less URI, not including the API service name.
   * For example:
   *     "shelves/SHELF_ID/books"
   *     "shelves/SHELF_ID/books/BOOK_ID"
   * </pre>
   *
   * <code>string resource_name = 11;</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource or collection that is the target of the operation.
   * The name is a scheme-less URI, not including the API service name.
   * For example:
   *     "shelves/SHELF_ID/books"
   *     "shelves/SHELF_ID/books/BOOK_ID"
   * </pre>
   *
   * <code>string resource_name = 11;</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The resource location information.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.ResourceLocation resource_location = 20;</code>
   * @return Whether the resourceLocation field is set.
   */
  boolean hasResourceLocation();
  /**
   * <pre>
   * The resource location information.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.ResourceLocation resource_location = 20;</code>
   * @return The resourceLocation.
   */
  google.events.cloud.audit.v1.ResourceLocation getResourceLocation();

  /**
   * <pre>
   * The resource's original state before mutation. Present only for
   * operations which have successfully modified the targeted resource(s).
   * In general, this field should contain all changed fields, except those
   * that are already been included in `request`, `response`, `metadata` or
   * `service_data` fields.
   * When the JSON object represented here has a proto equivalent,
   * the proto name will be indicated in the `&#64;type` property.
   * </pre>
   *
   * <code>.google.protobuf.Struct resource_original_state = 19;</code>
   * @return Whether the resourceOriginalState field is set.
   */
  boolean hasResourceOriginalState();
  /**
   * <pre>
   * The resource's original state before mutation. Present only for
   * operations which have successfully modified the targeted resource(s).
   * In general, this field should contain all changed fields, except those
   * that are already been included in `request`, `response`, `metadata` or
   * `service_data` fields.
   * When the JSON object represented here has a proto equivalent,
   * the proto name will be indicated in the `&#64;type` property.
   * </pre>
   *
   * <code>.google.protobuf.Struct resource_original_state = 19;</code>
   * @return The resourceOriginalState.
   */
  com.google.protobuf.Struct getResourceOriginalState();

  /**
   * <pre>
   * The number of items returned from a List or Query API method,
   * if applicable.
   * </pre>
   *
   * <code>int64 num_response_items = 12;</code>
   * @return The numResponseItems.
   */
  long getNumResponseItems();

  /**
   * <pre>
   * The status of the overall operation.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * The status of the overall operation.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   * @return The status.
   */
  com.google.rpc.Status getStatus();

  /**
   * <pre>
   * Authentication information.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.AuthenticationInfo authentication_info = 3;</code>
   * @return Whether the authenticationInfo field is set.
   */
  boolean hasAuthenticationInfo();
  /**
   * <pre>
   * Authentication information.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.AuthenticationInfo authentication_info = 3;</code>
   * @return The authenticationInfo.
   */
  google.events.cloud.audit.v1.AuthenticationInfo getAuthenticationInfo();

  /**
   * <pre>
   * Authorization information. If there are multiple
   * resources or permissions involved, then there is
   * one AuthorizationInfo element for each {resource, permission} tuple.
   * </pre>
   *
   * <code>repeated .google.events.cloud.audit.v1.AuthorizationInfo authorization_info = 9;</code>
   */
  java.util.List<google.events.cloud.audit.v1.AuthorizationInfo> 
      getAuthorizationInfoList();
  /**
   * <pre>
   * Authorization information. If there are multiple
   * resources or permissions involved, then there is
   * one AuthorizationInfo element for each {resource, permission} tuple.
   * </pre>
   *
   * <code>repeated .google.events.cloud.audit.v1.AuthorizationInfo authorization_info = 9;</code>
   */
  google.events.cloud.audit.v1.AuthorizationInfo getAuthorizationInfo(int index);
  /**
   * <pre>
   * Authorization information. If there are multiple
   * resources or permissions involved, then there is
   * one AuthorizationInfo element for each {resource, permission} tuple.
   * </pre>
   *
   * <code>repeated .google.events.cloud.audit.v1.AuthorizationInfo authorization_info = 9;</code>
   */
  int getAuthorizationInfoCount();

  /**
   * <pre>
   * Metadata about the operation.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.RequestMetadata request_metadata = 4;</code>
   * @return Whether the requestMetadata field is set.
   */
  boolean hasRequestMetadata();
  /**
   * <pre>
   * Metadata about the operation.
   * </pre>
   *
   * <code>.google.events.cloud.audit.v1.RequestMetadata request_metadata = 4;</code>
   * @return The requestMetadata.
   */
  google.events.cloud.audit.v1.RequestMetadata getRequestMetadata();

  /**
   * <pre>
   * The operation request. This may not include all request parameters,
   * such as those that are too large, privacy-sensitive, or duplicated
   * elsewhere in the log record.
   * It should never include user-generated data, such as file contents.
   * When the JSON object represented here has a proto equivalent, the proto
   * name will be indicated in the `&#64;type` property.
   * </pre>
   *
   * <code>.google.protobuf.Struct request = 16;</code>
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   * <pre>
   * The operation request. This may not include all request parameters,
   * such as those that are too large, privacy-sensitive, or duplicated
   * elsewhere in the log record.
   * It should never include user-generated data, such as file contents.
   * When the JSON object represented here has a proto equivalent, the proto
   * name will be indicated in the `&#64;type` property.
   * </pre>
   *
   * <code>.google.protobuf.Struct request = 16;</code>
   * @return The request.
   */
  com.google.protobuf.Struct getRequest();

  /**
   * <pre>
   * The operation response. This may not include all response elements,
   * such as those that are too large, privacy-sensitive, or duplicated
   * elsewhere in the log record.
   * It should never include user-generated data, such as file contents.
   * When the JSON object represented here has a proto equivalent, the proto
   * name will be indicated in the `&#64;type` property.
   * </pre>
   *
   * <code>.google.protobuf.Struct response = 17;</code>
   * @return Whether the response field is set.
   */
  boolean hasResponse();
  /**
   * <pre>
   * The operation response. This may not include all response elements,
   * such as those that are too large, privacy-sensitive, or duplicated
   * elsewhere in the log record.
   * It should never include user-generated data, such as file contents.
   * When the JSON object represented here has a proto equivalent, the proto
   * name will be indicated in the `&#64;type` property.
   * </pre>
   *
   * <code>.google.protobuf.Struct response = 17;</code>
   * @return The response.
   */
  com.google.protobuf.Struct getResponse();

  /**
   * <pre>
   * Other service-specific data about the request, response, and other
   * information associated with the current audited event.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 18;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Other service-specific data about the request, response, and other
   * information associated with the current audited event.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 18;</code>
   * @return The metadata.
   */
  com.google.protobuf.Struct getMetadata();

  /**
   * <pre>
   * Deprecated: Use `metadata` field instead.
   * Other service-specific data about the request, response, and other
   * activities.
   * When the JSON object represented here has a proto equivalent, the proto
   * name will be indicated in the `&#64;type` property.
   * </pre>
   *
   * <code>.google.protobuf.Struct service_data = 15;</code>
   * @return Whether the serviceData field is set.
   */
  boolean hasServiceData();
  /**
   * <pre>
   * Deprecated: Use `metadata` field instead.
   * Other service-specific data about the request, response, and other
   * activities.
   * When the JSON object represented here has a proto equivalent, the proto
   * name will be indicated in the `&#64;type` property.
   * </pre>
   *
   * <code>.google.protobuf.Struct service_data = 15;</code>
   * @return The serviceData.
   */
  com.google.protobuf.Struct getServiceData();
}