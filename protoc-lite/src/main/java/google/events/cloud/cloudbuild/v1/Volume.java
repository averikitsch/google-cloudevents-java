// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/cloudbuild/v1/data.proto

package google.events.cloud.cloudbuild.v1;

/**
 * <pre>
 * Volume describes a Docker container volume which is mounted into build steps
 * in order to persist files across build step execution.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.cloudbuild.v1.Volume}
 */
public  final class Volume extends
    com.google.protobuf.GeneratedMessageLite<
        Volume, Volume.Builder> implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.cloudbuild.v1.Volume)
    VolumeOrBuilder {
  private Volume() {
    name_ = "";
    path_ = "";
  }
  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.String name_;
  /**
   * <pre>
   * Name of the volume to mount.
   * Volume names must be unique per build step and must be valid names for
   * Docker volumes. Each named volume must be used by at least two build steps.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * Name of the volume to mount.
   * Volume names must be unique per build step and must be valid names for
   * Docker volumes. Each named volume must be used by at least two build steps.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * Name of the volume to mount.
   * Volume names must be unique per build step and must be valid names for
   * Docker volumes. Each named volume must be used by at least two build steps.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @param value The name to set.
   */
  private void setName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    name_ = value;
  }
  /**
   * <pre>
   * Name of the volume to mount.
   * Volume names must be unique per build step and must be valid names for
   * Docker volumes. Each named volume must be used by at least two build steps.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  private void clearName() {
    
    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * Name of the volume to mount.
   * Volume names must be unique per build step and must be valid names for
   * Docker volumes. Each named volume must be used by at least two build steps.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @param value The bytes for name to set.
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    name_ = value.toStringUtf8();
    
  }

  public static final int PATH_FIELD_NUMBER = 2;
  private java.lang.String path_;
  /**
   * <pre>
   * Path at which to mount the volume.
   * Paths must be absolute and cannot conflict with other volume paths on the
   * same build step or with certain reserved volume paths.
   * </pre>
   *
   * <code>string path = 2;</code>
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    return path_;
  }
  /**
   * <pre>
   * Path at which to mount the volume.
   * Paths must be absolute and cannot conflict with other volume paths on the
   * same build step or with certain reserved volume paths.
   * </pre>
   *
   * <code>string path = 2;</code>
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(path_);
  }
  /**
   * <pre>
   * Path at which to mount the volume.
   * Paths must be absolute and cannot conflict with other volume paths on the
   * same build step or with certain reserved volume paths.
   * </pre>
   *
   * <code>string path = 2;</code>
   * @param value The path to set.
   */
  private void setPath(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    path_ = value;
  }
  /**
   * <pre>
   * Path at which to mount the volume.
   * Paths must be absolute and cannot conflict with other volume paths on the
   * same build step or with certain reserved volume paths.
   * </pre>
   *
   * <code>string path = 2;</code>
   */
  private void clearPath() {
    
    path_ = getDefaultInstance().getPath();
  }
  /**
   * <pre>
   * Path at which to mount the volume.
   * Paths must be absolute and cannot conflict with other volume paths on the
   * same build step or with certain reserved volume paths.
   * </pre>
   *
   * <code>string path = 2;</code>
   * @param value The bytes for path to set.
   */
  private void setPathBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    path_ = value.toStringUtf8();
    
  }

  public static google.events.cloud.cloudbuild.v1.Volume parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static google.events.cloud.cloudbuild.v1.Volume parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static google.events.cloud.cloudbuild.v1.Volume parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static google.events.cloud.cloudbuild.v1.Volume parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static google.events.cloud.cloudbuild.v1.Volume parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static google.events.cloud.cloudbuild.v1.Volume parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static google.events.cloud.cloudbuild.v1.Volume parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static google.events.cloud.cloudbuild.v1.Volume parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static google.events.cloud.cloudbuild.v1.Volume parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static google.events.cloud.cloudbuild.v1.Volume parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static google.events.cloud.cloudbuild.v1.Volume parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static google.events.cloud.cloudbuild.v1.Volume parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(google.events.cloud.cloudbuild.v1.Volume prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Volume describes a Docker container volume which is mounted into build steps
   * in order to persist files across build step execution.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.cloudbuild.v1.Volume}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        google.events.cloud.cloudbuild.v1.Volume, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.cloudbuild.v1.Volume)
      google.events.cloud.cloudbuild.v1.VolumeOrBuilder {
    // Construct using google.events.cloud.cloudbuild.v1.Volume.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for
     * Docker volumes. Each named volume must be used by at least two build steps.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for
     * Docker volumes. Each named volume must be used by at least two build steps.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for
     * Docker volumes. Each named volume must be used by at least two build steps.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for
     * Docker volumes. Each named volume must be used by at least two build steps.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for
     * Docker volumes. Each named volume must be used by at least two build steps.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * Path at which to mount the volume.
     * Paths must be absolute and cannot conflict with other volume paths on the
     * same build step or with certain reserved volume paths.
     * </pre>
     *
     * <code>string path = 2;</code>
     * @return The path.
     */
    @java.lang.Override
    public java.lang.String getPath() {
      return instance.getPath();
    }
    /**
     * <pre>
     * Path at which to mount the volume.
     * Paths must be absolute and cannot conflict with other volume paths on the
     * same build step or with certain reserved volume paths.
     * </pre>
     *
     * <code>string path = 2;</code>
     * @return The bytes for path.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPathBytes() {
      return instance.getPathBytes();
    }
    /**
     * <pre>
     * Path at which to mount the volume.
     * Paths must be absolute and cannot conflict with other volume paths on the
     * same build step or with certain reserved volume paths.
     * </pre>
     *
     * <code>string path = 2;</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        java.lang.String value) {
      copyOnWrite();
      instance.setPath(value);
      return this;
    }
    /**
     * <pre>
     * Path at which to mount the volume.
     * Paths must be absolute and cannot conflict with other volume paths on the
     * same build step or with certain reserved volume paths.
     * </pre>
     *
     * <code>string path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      copyOnWrite();
      instance.clearPath();
      return this;
    }
    /**
     * <pre>
     * Path at which to mount the volume.
     * Paths must be absolute and cannot conflict with other volume paths on the
     * same build step or with certain reserved volume paths.
     * </pre>
     *
     * <code>string path = 2;</code>
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPathBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.events.cloud.cloudbuild.v1.Volume)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new google.events.cloud.cloudbuild.v1.Volume();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "name_",
            "path_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<google.events.cloud.cloudbuild.v1.Volume> parser = PARSER;
        if (parser == null) {
          synchronized (google.events.cloud.cloudbuild.v1.Volume.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<google.events.cloud.cloudbuild.v1.Volume>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.events.cloud.cloudbuild.v1.Volume)
  private static final google.events.cloud.cloudbuild.v1.Volume DEFAULT_INSTANCE;
  static {
    Volume defaultInstance = new Volume();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Volume.class, defaultInstance);
  }

  public static google.events.cloud.cloudbuild.v1.Volume getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Volume> PARSER;

  public static com.google.protobuf.Parser<Volume> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
