// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/firebasealerts/v1/cloud_event_payload.proto

package google.events.firebase.firebasealerts.v1;

/**
 * Protobuf type {@code google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload}
 */
public final class CrashlyticsRegressionAlertPayload extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload)
    CrashlyticsRegressionAlertPayloadOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CrashlyticsRegressionAlertPayload.newBuilder() to construct.
  private CrashlyticsRegressionAlertPayload(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CrashlyticsRegressionAlertPayload() {
    type_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CrashlyticsRegressionAlertPayload();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return google.events.firebase.firebasealerts.v1.CloudEventPayload.internal_static_google_events_firebase_firebasealerts_v1_CrashlyticsRegressionAlertPayload_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return google.events.firebase.firebasealerts.v1.CloudEventPayload.internal_static_google_events_firebase_firebasealerts_v1_CrashlyticsRegressionAlertPayload_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload.class, google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object type_;
  /**
   * <pre>
   * The type of the Crashlytics issue, e.g. new fatal, new nonfatal, ANR
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The type of the Crashlytics issue, e.g. new fatal, new nonfatal, ANR
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISSUE_FIELD_NUMBER = 2;
  private google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue_;
  /**
   * <pre>
   * Basic information of the Crashlytics issue
   * </pre>
   *
   * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 2;</code>
   * @return Whether the issue field is set.
   */
  @java.lang.Override
  public boolean hasIssue() {
    return issue_ != null;
  }
  /**
   * <pre>
   * Basic information of the Crashlytics issue
   * </pre>
   *
   * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 2;</code>
   * @return The issue.
   */
  @java.lang.Override
  public google.events.firebase.firebasealerts.v1.CrashlyticsIssue getIssue() {
    return issue_ == null ? google.events.firebase.firebasealerts.v1.CrashlyticsIssue.getDefaultInstance() : issue_;
  }
  /**
   * <pre>
   * Basic information of the Crashlytics issue
   * </pre>
   *
   * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 2;</code>
   */
  @java.lang.Override
  public google.events.firebase.firebasealerts.v1.CrashlyticsIssueOrBuilder getIssueOrBuilder() {
    return getIssue();
  }

  public static final int RESOLVE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp resolveTime_;
  /**
   * <pre>
   * The time that the Crashlytics issues was most recently resolved before it
   * began to reoccur
   * </pre>
   *
   * <code>.google.protobuf.Timestamp resolve_time = 3;</code>
   * @return Whether the resolveTime field is set.
   */
  @java.lang.Override
  public boolean hasResolveTime() {
    return resolveTime_ != null;
  }
  /**
   * <pre>
   * The time that the Crashlytics issues was most recently resolved before it
   * began to reoccur
   * </pre>
   *
   * <code>.google.protobuf.Timestamp resolve_time = 3;</code>
   * @return The resolveTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getResolveTime() {
    return resolveTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : resolveTime_;
  }
  /**
   * <pre>
   * The time that the Crashlytics issues was most recently resolved before it
   * began to reoccur
   * </pre>
   *
   * <code>.google.protobuf.Timestamp resolve_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getResolveTimeOrBuilder() {
    return getResolveTime();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    if (issue_ != null) {
      output.writeMessage(2, getIssue());
    }
    if (resolveTime_ != null) {
      output.writeMessage(3, getResolveTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    if (issue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getIssue());
    }
    if (resolveTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getResolveTime());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload)) {
      return super.equals(obj);
    }
    google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload other = (google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload) obj;

    if (!getType()
        .equals(other.getType())) return false;
    if (hasIssue() != other.hasIssue()) return false;
    if (hasIssue()) {
      if (!getIssue()
          .equals(other.getIssue())) return false;
    }
    if (hasResolveTime() != other.hasResolveTime()) return false;
    if (hasResolveTime()) {
      if (!getResolveTime()
          .equals(other.getResolveTime())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    if (hasIssue()) {
      hash = (37 * hash) + ISSUE_FIELD_NUMBER;
      hash = (53 * hash) + getIssue().hashCode();
    }
    if (hasResolveTime()) {
      hash = (37 * hash) + RESOLVE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getResolveTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload)
      google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayloadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return google.events.firebase.firebasealerts.v1.CloudEventPayload.internal_static_google_events_firebase_firebasealerts_v1_CrashlyticsRegressionAlertPayload_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.events.firebase.firebasealerts.v1.CloudEventPayload.internal_static_google_events_firebase_firebasealerts_v1_CrashlyticsRegressionAlertPayload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload.class, google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload.Builder.class);
    }

    // Construct using google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = "";

      if (issueBuilder_ == null) {
        issue_ = null;
      } else {
        issue_ = null;
        issueBuilder_ = null;
      }
      if (resolveTimeBuilder_ == null) {
        resolveTime_ = null;
      } else {
        resolveTime_ = null;
        resolveTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return google.events.firebase.firebasealerts.v1.CloudEventPayload.internal_static_google_events_firebase_firebasealerts_v1_CrashlyticsRegressionAlertPayload_descriptor;
    }

    @java.lang.Override
    public google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload getDefaultInstanceForType() {
      return google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload.getDefaultInstance();
    }

    @java.lang.Override
    public google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload build() {
      google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload buildPartial() {
      google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload result = new google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload(this);
      result.type_ = type_;
      if (issueBuilder_ == null) {
        result.issue_ = issue_;
      } else {
        result.issue_ = issueBuilder_.build();
      }
      if (resolveTimeBuilder_ == null) {
        result.resolveTime_ = resolveTime_;
      } else {
        result.resolveTime_ = resolveTimeBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload) {
        return mergeFrom((google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload other) {
      if (other == google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (other.hasIssue()) {
        mergeIssue(other.getIssue());
      }
      if (other.hasResolveTime()) {
        mergeResolveTime(other.getResolveTime());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              type_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getIssueFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getResolveTimeFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * The type of the Crashlytics issue, e.g. new fatal, new nonfatal, ANR
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The type of the Crashlytics issue, e.g. new fatal, new nonfatal, ANR
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The type of the Crashlytics issue, e.g. new fatal, new nonfatal, ANR
     * </pre>
     *
     * <code>string type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the Crashlytics issue, e.g. new fatal, new nonfatal, ANR
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the Crashlytics issue, e.g. new fatal, new nonfatal, ANR
     * </pre>
     *
     * <code>string type = 1;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        google.events.firebase.firebasealerts.v1.CrashlyticsIssue, google.events.firebase.firebasealerts.v1.CrashlyticsIssue.Builder, google.events.firebase.firebasealerts.v1.CrashlyticsIssueOrBuilder> issueBuilder_;
    /**
     * <pre>
     * Basic information of the Crashlytics issue
     * </pre>
     *
     * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 2;</code>
     * @return Whether the issue field is set.
     */
    public boolean hasIssue() {
      return issueBuilder_ != null || issue_ != null;
    }
    /**
     * <pre>
     * Basic information of the Crashlytics issue
     * </pre>
     *
     * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 2;</code>
     * @return The issue.
     */
    public google.events.firebase.firebasealerts.v1.CrashlyticsIssue getIssue() {
      if (issueBuilder_ == null) {
        return issue_ == null ? google.events.firebase.firebasealerts.v1.CrashlyticsIssue.getDefaultInstance() : issue_;
      } else {
        return issueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Basic information of the Crashlytics issue
     * </pre>
     *
     * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 2;</code>
     */
    public Builder setIssue(google.events.firebase.firebasealerts.v1.CrashlyticsIssue value) {
      if (issueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        issue_ = value;
        onChanged();
      } else {
        issueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Basic information of the Crashlytics issue
     * </pre>
     *
     * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 2;</code>
     */
    public Builder setIssue(
        google.events.firebase.firebasealerts.v1.CrashlyticsIssue.Builder builderForValue) {
      if (issueBuilder_ == null) {
        issue_ = builderForValue.build();
        onChanged();
      } else {
        issueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Basic information of the Crashlytics issue
     * </pre>
     *
     * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 2;</code>
     */
    public Builder mergeIssue(google.events.firebase.firebasealerts.v1.CrashlyticsIssue value) {
      if (issueBuilder_ == null) {
        if (issue_ != null) {
          issue_ =
            google.events.firebase.firebasealerts.v1.CrashlyticsIssue.newBuilder(issue_).mergeFrom(value).buildPartial();
        } else {
          issue_ = value;
        }
        onChanged();
      } else {
        issueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Basic information of the Crashlytics issue
     * </pre>
     *
     * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 2;</code>
     */
    public Builder clearIssue() {
      if (issueBuilder_ == null) {
        issue_ = null;
        onChanged();
      } else {
        issue_ = null;
        issueBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Basic information of the Crashlytics issue
     * </pre>
     *
     * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 2;</code>
     */
    public google.events.firebase.firebasealerts.v1.CrashlyticsIssue.Builder getIssueBuilder() {
      
      onChanged();
      return getIssueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Basic information of the Crashlytics issue
     * </pre>
     *
     * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 2;</code>
     */
    public google.events.firebase.firebasealerts.v1.CrashlyticsIssueOrBuilder getIssueOrBuilder() {
      if (issueBuilder_ != null) {
        return issueBuilder_.getMessageOrBuilder();
      } else {
        return issue_ == null ?
            google.events.firebase.firebasealerts.v1.CrashlyticsIssue.getDefaultInstance() : issue_;
      }
    }
    /**
     * <pre>
     * Basic information of the Crashlytics issue
     * </pre>
     *
     * <code>.google.events.firebase.firebasealerts.v1.CrashlyticsIssue issue = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        google.events.firebase.firebasealerts.v1.CrashlyticsIssue, google.events.firebase.firebasealerts.v1.CrashlyticsIssue.Builder, google.events.firebase.firebasealerts.v1.CrashlyticsIssueOrBuilder> 
        getIssueFieldBuilder() {
      if (issueBuilder_ == null) {
        issueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            google.events.firebase.firebasealerts.v1.CrashlyticsIssue, google.events.firebase.firebasealerts.v1.CrashlyticsIssue.Builder, google.events.firebase.firebasealerts.v1.CrashlyticsIssueOrBuilder>(
                getIssue(),
                getParentForChildren(),
                isClean());
        issue_ = null;
      }
      return issueBuilder_;
    }

    private com.google.protobuf.Timestamp resolveTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> resolveTimeBuilder_;
    /**
     * <pre>
     * The time that the Crashlytics issues was most recently resolved before it
     * began to reoccur
     * </pre>
     *
     * <code>.google.protobuf.Timestamp resolve_time = 3;</code>
     * @return Whether the resolveTime field is set.
     */
    public boolean hasResolveTime() {
      return resolveTimeBuilder_ != null || resolveTime_ != null;
    }
    /**
     * <pre>
     * The time that the Crashlytics issues was most recently resolved before it
     * began to reoccur
     * </pre>
     *
     * <code>.google.protobuf.Timestamp resolve_time = 3;</code>
     * @return The resolveTime.
     */
    public com.google.protobuf.Timestamp getResolveTime() {
      if (resolveTimeBuilder_ == null) {
        return resolveTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : resolveTime_;
      } else {
        return resolveTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The time that the Crashlytics issues was most recently resolved before it
     * began to reoccur
     * </pre>
     *
     * <code>.google.protobuf.Timestamp resolve_time = 3;</code>
     */
    public Builder setResolveTime(com.google.protobuf.Timestamp value) {
      if (resolveTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resolveTime_ = value;
        onChanged();
      } else {
        resolveTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The time that the Crashlytics issues was most recently resolved before it
     * began to reoccur
     * </pre>
     *
     * <code>.google.protobuf.Timestamp resolve_time = 3;</code>
     */
    public Builder setResolveTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (resolveTimeBuilder_ == null) {
        resolveTime_ = builderForValue.build();
        onChanged();
      } else {
        resolveTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The time that the Crashlytics issues was most recently resolved before it
     * began to reoccur
     * </pre>
     *
     * <code>.google.protobuf.Timestamp resolve_time = 3;</code>
     */
    public Builder mergeResolveTime(com.google.protobuf.Timestamp value) {
      if (resolveTimeBuilder_ == null) {
        if (resolveTime_ != null) {
          resolveTime_ =
            com.google.protobuf.Timestamp.newBuilder(resolveTime_).mergeFrom(value).buildPartial();
        } else {
          resolveTime_ = value;
        }
        onChanged();
      } else {
        resolveTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The time that the Crashlytics issues was most recently resolved before it
     * began to reoccur
     * </pre>
     *
     * <code>.google.protobuf.Timestamp resolve_time = 3;</code>
     */
    public Builder clearResolveTime() {
      if (resolveTimeBuilder_ == null) {
        resolveTime_ = null;
        onChanged();
      } else {
        resolveTime_ = null;
        resolveTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The time that the Crashlytics issues was most recently resolved before it
     * began to reoccur
     * </pre>
     *
     * <code>.google.protobuf.Timestamp resolve_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getResolveTimeBuilder() {
      
      onChanged();
      return getResolveTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The time that the Crashlytics issues was most recently resolved before it
     * began to reoccur
     * </pre>
     *
     * <code>.google.protobuf.Timestamp resolve_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getResolveTimeOrBuilder() {
      if (resolveTimeBuilder_ != null) {
        return resolveTimeBuilder_.getMessageOrBuilder();
      } else {
        return resolveTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : resolveTime_;
      }
    }
    /**
     * <pre>
     * The time that the Crashlytics issues was most recently resolved before it
     * began to reoccur
     * </pre>
     *
     * <code>.google.protobuf.Timestamp resolve_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getResolveTimeFieldBuilder() {
      if (resolveTimeBuilder_ == null) {
        resolveTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getResolveTime(),
                getParentForChildren(),
                isClean());
        resolveTime_ = null;
      }
      return resolveTimeBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload)
  }

  // @@protoc_insertion_point(class_scope:google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload)
  private static final google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload();
  }

  public static google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CrashlyticsRegressionAlertPayload>
      PARSER = new com.google.protobuf.AbstractParser<CrashlyticsRegressionAlertPayload>() {
    @java.lang.Override
    public CrashlyticsRegressionAlertPayload parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CrashlyticsRegressionAlertPayload> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CrashlyticsRegressionAlertPayload> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public google.events.firebase.firebasealerts.v1.CrashlyticsRegressionAlertPayload getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
