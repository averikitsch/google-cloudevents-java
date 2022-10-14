// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/firebasealerts/v1/cloud_event_payload.proto

package google.events.firebase.firebasealerts.v1;

/**
 * <pre>
 * Basic information of the Crashlytics issue
 * </pre>
 *
 * Protobuf type {@code google.events.firebase.firebasealerts.v1.CrashlyticsIssue}
 */
public final class CrashlyticsIssue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.events.firebase.firebasealerts.v1.CrashlyticsIssue)
    CrashlyticsIssueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CrashlyticsIssue.newBuilder() to construct.
  private CrashlyticsIssue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CrashlyticsIssue() {
    id_ = "";
    title_ = "";
    subtitle_ = "";
    appVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CrashlyticsIssue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return google.events.firebase.firebasealerts.v1.CloudEventPayload.internal_static_google_events_firebase_firebasealerts_v1_CrashlyticsIssue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return google.events.firebase.firebasealerts.v1.CloudEventPayload.internal_static_google_events_firebase_firebasealerts_v1_CrashlyticsIssue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            google.events.firebase.firebasealerts.v1.CrashlyticsIssue.class, google.events.firebase.firebasealerts.v1.CrashlyticsIssue.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 2;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBTITLE_FIELD_NUMBER = 3;
  private volatile java.lang.Object subtitle_;
  /**
   * <code>string subtitle = 3;</code>
   * @return The subtitle.
   */
  @java.lang.Override
  public java.lang.String getSubtitle() {
    java.lang.Object ref = subtitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subtitle_ = s;
      return s;
    }
  }
  /**
   * <code>string subtitle = 3;</code>
   * @return The bytes for subtitle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubtitleBytes() {
    java.lang.Object ref = subtitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subtitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APP_VERSION_FIELD_NUMBER = 4;
  private volatile java.lang.Object appVersion_;
  /**
   * <code>string app_version = 4;</code>
   * @return The appVersion.
   */
  @java.lang.Override
  public java.lang.String getAppVersion() {
    java.lang.Object ref = appVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      appVersion_ = s;
      return s;
    }
  }
  /**
   * <code>string app_version = 4;</code>
   * @return The bytes for appVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAppVersionBytes() {
    java.lang.Object ref = appVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      appVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subtitle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, subtitle_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(appVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, appVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subtitle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, subtitle_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(appVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, appVersion_);
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
    if (!(obj instanceof google.events.firebase.firebasealerts.v1.CrashlyticsIssue)) {
      return super.equals(obj);
    }
    google.events.firebase.firebasealerts.v1.CrashlyticsIssue other = (google.events.firebase.firebasealerts.v1.CrashlyticsIssue) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getSubtitle()
        .equals(other.getSubtitle())) return false;
    if (!getAppVersion()
        .equals(other.getAppVersion())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + SUBTITLE_FIELD_NUMBER;
    hash = (53 * hash) + getSubtitle().hashCode();
    hash = (37 * hash) + APP_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getAppVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static google.events.firebase.firebasealerts.v1.CrashlyticsIssue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsIssue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsIssue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsIssue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsIssue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsIssue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsIssue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsIssue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsIssue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsIssue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsIssue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static google.events.firebase.firebasealerts.v1.CrashlyticsIssue parseFrom(
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
  public static Builder newBuilder(google.events.firebase.firebasealerts.v1.CrashlyticsIssue prototype) {
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
   * <pre>
   * Basic information of the Crashlytics issue
   * </pre>
   *
   * Protobuf type {@code google.events.firebase.firebasealerts.v1.CrashlyticsIssue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.events.firebase.firebasealerts.v1.CrashlyticsIssue)
      google.events.firebase.firebasealerts.v1.CrashlyticsIssueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return google.events.firebase.firebasealerts.v1.CloudEventPayload.internal_static_google_events_firebase_firebasealerts_v1_CrashlyticsIssue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.events.firebase.firebasealerts.v1.CloudEventPayload.internal_static_google_events_firebase_firebasealerts_v1_CrashlyticsIssue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.events.firebase.firebasealerts.v1.CrashlyticsIssue.class, google.events.firebase.firebasealerts.v1.CrashlyticsIssue.Builder.class);
    }

    // Construct using google.events.firebase.firebasealerts.v1.CrashlyticsIssue.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      title_ = "";

      subtitle_ = "";

      appVersion_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return google.events.firebase.firebasealerts.v1.CloudEventPayload.internal_static_google_events_firebase_firebasealerts_v1_CrashlyticsIssue_descriptor;
    }

    @java.lang.Override
    public google.events.firebase.firebasealerts.v1.CrashlyticsIssue getDefaultInstanceForType() {
      return google.events.firebase.firebasealerts.v1.CrashlyticsIssue.getDefaultInstance();
    }

    @java.lang.Override
    public google.events.firebase.firebasealerts.v1.CrashlyticsIssue build() {
      google.events.firebase.firebasealerts.v1.CrashlyticsIssue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public google.events.firebase.firebasealerts.v1.CrashlyticsIssue buildPartial() {
      google.events.firebase.firebasealerts.v1.CrashlyticsIssue result = new google.events.firebase.firebasealerts.v1.CrashlyticsIssue(this);
      result.id_ = id_;
      result.title_ = title_;
      result.subtitle_ = subtitle_;
      result.appVersion_ = appVersion_;
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
      if (other instanceof google.events.firebase.firebasealerts.v1.CrashlyticsIssue) {
        return mergeFrom((google.events.firebase.firebasealerts.v1.CrashlyticsIssue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(google.events.firebase.firebasealerts.v1.CrashlyticsIssue other) {
      if (other == google.events.firebase.firebasealerts.v1.CrashlyticsIssue.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (!other.getSubtitle().isEmpty()) {
        subtitle_ = other.subtitle_;
        onChanged();
      }
      if (!other.getAppVersion().isEmpty()) {
        appVersion_ = other.appVersion_;
        onChanged();
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
              id_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              title_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              subtitle_ = input.readStringRequireUtf8();

              break;
            } // case 26
            case 34: {
              appVersion_ = input.readStringRequireUtf8();

              break;
            } // case 34
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

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 2;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object subtitle_ = "";
    /**
     * <code>string subtitle = 3;</code>
     * @return The subtitle.
     */
    public java.lang.String getSubtitle() {
      java.lang.Object ref = subtitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subtitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string subtitle = 3;</code>
     * @return The bytes for subtitle.
     */
    public com.google.protobuf.ByteString
        getSubtitleBytes() {
      java.lang.Object ref = subtitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subtitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string subtitle = 3;</code>
     * @param value The subtitle to set.
     * @return This builder for chaining.
     */
    public Builder setSubtitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subtitle_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string subtitle = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubtitle() {
      
      subtitle_ = getDefaultInstance().getSubtitle();
      onChanged();
      return this;
    }
    /**
     * <code>string subtitle = 3;</code>
     * @param value The bytes for subtitle to set.
     * @return This builder for chaining.
     */
    public Builder setSubtitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subtitle_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object appVersion_ = "";
    /**
     * <code>string app_version = 4;</code>
     * @return The appVersion.
     */
    public java.lang.String getAppVersion() {
      java.lang.Object ref = appVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string app_version = 4;</code>
     * @return The bytes for appVersion.
     */
    public com.google.protobuf.ByteString
        getAppVersionBytes() {
      java.lang.Object ref = appVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string app_version = 4;</code>
     * @param value The appVersion to set.
     * @return This builder for chaining.
     */
    public Builder setAppVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      appVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string app_version = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAppVersion() {
      
      appVersion_ = getDefaultInstance().getAppVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string app_version = 4;</code>
     * @param value The bytes for appVersion to set.
     * @return This builder for chaining.
     */
    public Builder setAppVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      appVersion_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.events.firebase.firebasealerts.v1.CrashlyticsIssue)
  }

  // @@protoc_insertion_point(class_scope:google.events.firebase.firebasealerts.v1.CrashlyticsIssue)
  private static final google.events.firebase.firebasealerts.v1.CrashlyticsIssue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new google.events.firebase.firebasealerts.v1.CrashlyticsIssue();
  }

  public static google.events.firebase.firebasealerts.v1.CrashlyticsIssue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CrashlyticsIssue>
      PARSER = new com.google.protobuf.AbstractParser<CrashlyticsIssue>() {
    @java.lang.Override
    public CrashlyticsIssue parsePartialFrom(
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

  public static com.google.protobuf.Parser<CrashlyticsIssue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CrashlyticsIssue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public google.events.firebase.firebasealerts.v1.CrashlyticsIssue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

