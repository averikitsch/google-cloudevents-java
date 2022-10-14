// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/cloudbuild/v1/data.proto

package google.events.cloud.cloudbuild.v1;

public interface FileHashesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.cloudbuild.v1.FileHashes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Collection of file hashes.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
   */
  java.util.List<google.events.cloud.cloudbuild.v1.Hash> 
      getFileHashList();
  /**
   * <pre>
   * Collection of file hashes.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
   */
  google.events.cloud.cloudbuild.v1.Hash getFileHash(int index);
  /**
   * <pre>
   * Collection of file hashes.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
   */
  int getFileHashCount();
  /**
   * <pre>
   * Collection of file hashes.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
   */
  java.util.List<? extends google.events.cloud.cloudbuild.v1.HashOrBuilder> 
      getFileHashOrBuilderList();
  /**
   * <pre>
   * Collection of file hashes.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Hash file_hash = 1;</code>
   */
  google.events.cloud.cloudbuild.v1.HashOrBuilder getFileHashOrBuilder(
      int index);
}