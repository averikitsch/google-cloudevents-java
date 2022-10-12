// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/cloudbuild/v1/data.proto

package google.events.cloud.cloudbuild.v1;

/**
 * <pre>
 * Container message for hashes of byte content of files, used in
 * SourceProvenance messages to verify integrity of source input to the build.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.cloudbuild.v1.FileHashes}
 */
public final class FileHashes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.cloudbuild.v1.FileHashes)
    FileHashesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FileHashes.newBuilder() to construct.
  private FileHashes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileHashes() {
    fileHash_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FileHashes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return google.events.cloud.cloudbuild.v1.Data.internal_static_google_events_cloud_cloudbuild_v1_FileHashes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return google.events.cloud.cloudbuild.v1.Data.internal_static_google_events_cloud_cloudbuild_v1_FileHashes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            google.events.cloud.cloudbuild.v1.FileHashes.class, google.events.cloud.cloudbuild.v1.FileHashes.Builder.class);
  }

  public static final int FILE_HASH_FIELD_NUMBER = 1;
  private java.util.List<google.events.cloud.cloudbuild.v1.Hash> fileHash_;
  /**
   * <pre>
   * Collection of file hashes.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
   */
  @java.lang.Override
  public java.util.List<google.events.cloud.cloudbuild.v1.Hash> getFileHashList() {
    return fileHash_;
  }
  /**
   * <pre>
   * Collection of file hashes.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends google.events.cloud.cloudbuild.v1.HashOrBuilder> 
      getFileHashOrBuilderList() {
    return fileHash_;
  }
  /**
   * <pre>
   * Collection of file hashes.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
   */
  @java.lang.Override
  public int getFileHashCount() {
    return fileHash_.size();
  }
  /**
   * <pre>
   * Collection of file hashes.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
   */
  @java.lang.Override
  public google.events.cloud.cloudbuild.v1.Hash getFileHash(int index) {
    return fileHash_.get(index);
  }
  /**
   * <pre>
   * Collection of file hashes.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
   */
  @java.lang.Override
  public google.events.cloud.cloudbuild.v1.HashOrBuilder getFileHashOrBuilder(
      int index) {
    return fileHash_.get(index);
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
    for (int i = 0; i < fileHash_.size(); i++) {
      output.writeMessage(1, fileHash_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < fileHash_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, fileHash_.get(i));
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
    if (!(obj instanceof google.events.cloud.cloudbuild.v1.FileHashes)) {
      return super.equals(obj);
    }
    google.events.cloud.cloudbuild.v1.FileHashes other = (google.events.cloud.cloudbuild.v1.FileHashes) obj;

    if (!getFileHashList()
        .equals(other.getFileHashList())) return false;
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
    if (getFileHashCount() > 0) {
      hash = (37 * hash) + FILE_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getFileHashList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static google.events.cloud.cloudbuild.v1.FileHashes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.events.cloud.cloudbuild.v1.FileHashes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.events.cloud.cloudbuild.v1.FileHashes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.events.cloud.cloudbuild.v1.FileHashes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.events.cloud.cloudbuild.v1.FileHashes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.events.cloud.cloudbuild.v1.FileHashes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.events.cloud.cloudbuild.v1.FileHashes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static google.events.cloud.cloudbuild.v1.FileHashes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static google.events.cloud.cloudbuild.v1.FileHashes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static google.events.cloud.cloudbuild.v1.FileHashes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static google.events.cloud.cloudbuild.v1.FileHashes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static google.events.cloud.cloudbuild.v1.FileHashes parseFrom(
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
  public static Builder newBuilder(google.events.cloud.cloudbuild.v1.FileHashes prototype) {
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
   * Container message for hashes of byte content of files, used in
   * SourceProvenance messages to verify integrity of source input to the build.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.cloudbuild.v1.FileHashes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.cloudbuild.v1.FileHashes)
      google.events.cloud.cloudbuild.v1.FileHashesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return google.events.cloud.cloudbuild.v1.Data.internal_static_google_events_cloud_cloudbuild_v1_FileHashes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.events.cloud.cloudbuild.v1.Data.internal_static_google_events_cloud_cloudbuild_v1_FileHashes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.events.cloud.cloudbuild.v1.FileHashes.class, google.events.cloud.cloudbuild.v1.FileHashes.Builder.class);
    }

    // Construct using google.events.cloud.cloudbuild.v1.FileHashes.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (fileHashBuilder_ == null) {
        fileHash_ = java.util.Collections.emptyList();
      } else {
        fileHash_ = null;
        fileHashBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return google.events.cloud.cloudbuild.v1.Data.internal_static_google_events_cloud_cloudbuild_v1_FileHashes_descriptor;
    }

    @java.lang.Override
    public google.events.cloud.cloudbuild.v1.FileHashes getDefaultInstanceForType() {
      return google.events.cloud.cloudbuild.v1.FileHashes.getDefaultInstance();
    }

    @java.lang.Override
    public google.events.cloud.cloudbuild.v1.FileHashes build() {
      google.events.cloud.cloudbuild.v1.FileHashes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public google.events.cloud.cloudbuild.v1.FileHashes buildPartial() {
      google.events.cloud.cloudbuild.v1.FileHashes result = new google.events.cloud.cloudbuild.v1.FileHashes(this);
      int from_bitField0_ = bitField0_;
      if (fileHashBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          fileHash_ = java.util.Collections.unmodifiableList(fileHash_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fileHash_ = fileHash_;
      } else {
        result.fileHash_ = fileHashBuilder_.build();
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
      if (other instanceof google.events.cloud.cloudbuild.v1.FileHashes) {
        return mergeFrom((google.events.cloud.cloudbuild.v1.FileHashes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(google.events.cloud.cloudbuild.v1.FileHashes other) {
      if (other == google.events.cloud.cloudbuild.v1.FileHashes.getDefaultInstance()) return this;
      if (fileHashBuilder_ == null) {
        if (!other.fileHash_.isEmpty()) {
          if (fileHash_.isEmpty()) {
            fileHash_ = other.fileHash_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFileHashIsMutable();
            fileHash_.addAll(other.fileHash_);
          }
          onChanged();
        }
      } else {
        if (!other.fileHash_.isEmpty()) {
          if (fileHashBuilder_.isEmpty()) {
            fileHashBuilder_.dispose();
            fileHashBuilder_ = null;
            fileHash_ = other.fileHash_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fileHashBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFileHashFieldBuilder() : null;
          } else {
            fileHashBuilder_.addAllMessages(other.fileHash_);
          }
        }
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
              google.events.cloud.cloudbuild.v1.Hash m =
                  input.readMessage(
                      google.events.cloud.cloudbuild.v1.Hash.parser(),
                      extensionRegistry);
              if (fileHashBuilder_ == null) {
                ensureFileHashIsMutable();
                fileHash_.add(m);
              } else {
                fileHashBuilder_.addMessage(m);
              }
              break;
            } // case 10
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
    private int bitField0_;

    private java.util.List<google.events.cloud.cloudbuild.v1.Hash> fileHash_ =
      java.util.Collections.emptyList();
    private void ensureFileHashIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fileHash_ = new java.util.ArrayList<google.events.cloud.cloudbuild.v1.Hash>(fileHash_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        google.events.cloud.cloudbuild.v1.Hash, google.events.cloud.cloudbuild.v1.Hash.Builder, google.events.cloud.cloudbuild.v1.HashOrBuilder> fileHashBuilder_;

    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public java.util.List<google.events.cloud.cloudbuild.v1.Hash> getFileHashList() {
      if (fileHashBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fileHash_);
      } else {
        return fileHashBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public int getFileHashCount() {
      if (fileHashBuilder_ == null) {
        return fileHash_.size();
      } else {
        return fileHashBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public google.events.cloud.cloudbuild.v1.Hash getFileHash(int index) {
      if (fileHashBuilder_ == null) {
        return fileHash_.get(index);
      } else {
        return fileHashBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public Builder setFileHash(
        int index, google.events.cloud.cloudbuild.v1.Hash value) {
      if (fileHashBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFileHashIsMutable();
        fileHash_.set(index, value);
        onChanged();
      } else {
        fileHashBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public Builder setFileHash(
        int index, google.events.cloud.cloudbuild.v1.Hash.Builder builderForValue) {
      if (fileHashBuilder_ == null) {
        ensureFileHashIsMutable();
        fileHash_.set(index, builderForValue.build());
        onChanged();
      } else {
        fileHashBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public Builder addFileHash(google.events.cloud.cloudbuild.v1.Hash value) {
      if (fileHashBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFileHashIsMutable();
        fileHash_.add(value);
        onChanged();
      } else {
        fileHashBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public Builder addFileHash(
        int index, google.events.cloud.cloudbuild.v1.Hash value) {
      if (fileHashBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFileHashIsMutable();
        fileHash_.add(index, value);
        onChanged();
      } else {
        fileHashBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public Builder addFileHash(
        google.events.cloud.cloudbuild.v1.Hash.Builder builderForValue) {
      if (fileHashBuilder_ == null) {
        ensureFileHashIsMutable();
        fileHash_.add(builderForValue.build());
        onChanged();
      } else {
        fileHashBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public Builder addFileHash(
        int index, google.events.cloud.cloudbuild.v1.Hash.Builder builderForValue) {
      if (fileHashBuilder_ == null) {
        ensureFileHashIsMutable();
        fileHash_.add(index, builderForValue.build());
        onChanged();
      } else {
        fileHashBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public Builder addAllFileHash(
        java.lang.Iterable<? extends google.events.cloud.cloudbuild.v1.Hash> values) {
      if (fileHashBuilder_ == null) {
        ensureFileHashIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fileHash_);
        onChanged();
      } else {
        fileHashBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public Builder clearFileHash() {
      if (fileHashBuilder_ == null) {
        fileHash_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fileHashBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public Builder removeFileHash(int index) {
      if (fileHashBuilder_ == null) {
        ensureFileHashIsMutable();
        fileHash_.remove(index);
        onChanged();
      } else {
        fileHashBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public google.events.cloud.cloudbuild.v1.Hash.Builder getFileHashBuilder(
        int index) {
      return getFileHashFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public google.events.cloud.cloudbuild.v1.HashOrBuilder getFileHashOrBuilder(
        int index) {
      if (fileHashBuilder_ == null) {
        return fileHash_.get(index);  } else {
        return fileHashBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public java.util.List<? extends google.events.cloud.cloudbuild.v1.HashOrBuilder> 
         getFileHashOrBuilderList() {
      if (fileHashBuilder_ != null) {
        return fileHashBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fileHash_);
      }
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public google.events.cloud.cloudbuild.v1.Hash.Builder addFileHashBuilder() {
      return getFileHashFieldBuilder().addBuilder(
          google.events.cloud.cloudbuild.v1.Hash.getDefaultInstance());
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public google.events.cloud.cloudbuild.v1.Hash.Builder addFileHashBuilder(
        int index) {
      return getFileHashFieldBuilder().addBuilder(
          index, google.events.cloud.cloudbuild.v1.Hash.getDefaultInstance());
    }
    /**
     * <pre>
     * Collection of file hashes.
     * </pre>
     *
     * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
     */
    public java.util.List<google.events.cloud.cloudbuild.v1.Hash.Builder> 
         getFileHashBuilderList() {
      return getFileHashFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        google.events.cloud.cloudbuild.v1.Hash, google.events.cloud.cloudbuild.v1.Hash.Builder, google.events.cloud.cloudbuild.v1.HashOrBuilder> 
        getFileHashFieldBuilder() {
      if (fileHashBuilder_ == null) {
        fileHashBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            google.events.cloud.cloudbuild.v1.Hash, google.events.cloud.cloudbuild.v1.Hash.Builder, google.events.cloud.cloudbuild.v1.HashOrBuilder>(
                fileHash_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        fileHash_ = null;
      }
      return fileHashBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.events.cloud.cloudbuild.v1.FileHashes)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.cloudbuild.v1.FileHashes)
  private static final google.events.cloud.cloudbuild.v1.FileHashes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new google.events.cloud.cloudbuild.v1.FileHashes();
  }

  public static google.events.cloud.cloudbuild.v1.FileHashes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileHashes>
      PARSER = new com.google.protobuf.AbstractParser<FileHashes>() {
    @java.lang.Override
    public FileHashes parsePartialFrom(
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

  public static com.google.protobuf.Parser<FileHashes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileHashes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public google.events.cloud.cloudbuild.v1.FileHashes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

