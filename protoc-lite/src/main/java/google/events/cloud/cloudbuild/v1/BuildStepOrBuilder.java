// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/cloudbuild/v1/data.proto

package google.events.cloud.cloudbuild.v1;

public interface BuildStepOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.cloudbuild.v1.BuildStep)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The name of the container image that will run this particular
   * build step.
   * If the image is available in the host's Docker daemon's cache, it
   * will be run directly. If not, the host will attempt to pull the image
   * first, using the builder service account's credentials if necessary.
   * The Docker daemon's cache will already have the latest versions of all of
   * the officially supported build steps
   * ([https://github.com/GoogleCloudPlatform/cloud-builders](https://github.com/GoogleCloudPlatform/cloud-builders)).
   * The Docker daemon will also have cached many of the layers for some popular
   * images, like "ubuntu", "debian", but they will be refreshed at the time you
   * attempt to use them.
   * If you built an image in a previous build step, it will be stored in the
   * host's Docker daemon's cache and is available to use as the name for a
   * later build step.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the container image that will run this particular
   * build step.
   * If the image is available in the host's Docker daemon's cache, it
   * will be run directly. If not, the host will attempt to pull the image
   * first, using the builder service account's credentials if necessary.
   * The Docker daemon's cache will already have the latest versions of all of
   * the officially supported build steps
   * ([https://github.com/GoogleCloudPlatform/cloud-builders](https://github.com/GoogleCloudPlatform/cloud-builders)).
   * The Docker daemon will also have cached many of the layers for some popular
   * images, like "ubuntu", "debian", but they will be refreshed at the time you
   * attempt to use them.
   * If you built an image in a previous build step, it will be stored in the
   * host's Docker daemon's cache and is available to use as the name for a
   * later build step.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A list of environment variable definitions to be used when running a step.
   * The elements are of the form "KEY=VALUE" for the environment variable "KEY"
   * being given the value "VALUE".
   * </pre>
   *
   * <code>repeated string env = 2;</code>
   * @return A list containing the env.
   */
  java.util.List<java.lang.String>
      getEnvList();
  /**
   * <pre>
   * A list of environment variable definitions to be used when running a step.
   * The elements are of the form "KEY=VALUE" for the environment variable "KEY"
   * being given the value "VALUE".
   * </pre>
   *
   * <code>repeated string env = 2;</code>
   * @return The count of env.
   */
  int getEnvCount();
  /**
   * <pre>
   * A list of environment variable definitions to be used when running a step.
   * The elements are of the form "KEY=VALUE" for the environment variable "KEY"
   * being given the value "VALUE".
   * </pre>
   *
   * <code>repeated string env = 2;</code>
   * @param index The index of the element to return.
   * @return The env at the given index.
   */
  java.lang.String getEnv(int index);
  /**
   * <pre>
   * A list of environment variable definitions to be used when running a step.
   * The elements are of the form "KEY=VALUE" for the environment variable "KEY"
   * being given the value "VALUE".
   * </pre>
   *
   * <code>repeated string env = 2;</code>
   * @param index The index of the element to return.
   * @return The env at the given index.
   */
  com.google.protobuf.ByteString
      getEnvBytes(int index);

  /**
   * <pre>
   * A list of arguments that will be presented to the step when it is started.
   * If the image used to run the step's container has an entrypoint, the `args`
   * are used as arguments to that entrypoint. If the image does not define
   * an entrypoint, the first element in args is used as the entrypoint,
   * and the remainder will be used as arguments.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   * @return A list containing the args.
   */
  java.util.List<java.lang.String>
      getArgsList();
  /**
   * <pre>
   * A list of arguments that will be presented to the step when it is started.
   * If the image used to run the step's container has an entrypoint, the `args`
   * are used as arguments to that entrypoint. If the image does not define
   * an entrypoint, the first element in args is used as the entrypoint,
   * and the remainder will be used as arguments.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   * @return The count of args.
   */
  int getArgsCount();
  /**
   * <pre>
   * A list of arguments that will be presented to the step when it is started.
   * If the image used to run the step's container has an entrypoint, the `args`
   * are used as arguments to that entrypoint. If the image does not define
   * an entrypoint, the first element in args is used as the entrypoint,
   * and the remainder will be used as arguments.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   * @param index The index of the element to return.
   * @return The args at the given index.
   */
  java.lang.String getArgs(int index);
  /**
   * <pre>
   * A list of arguments that will be presented to the step when it is started.
   * If the image used to run the step's container has an entrypoint, the `args`
   * are used as arguments to that entrypoint. If the image does not define
   * an entrypoint, the first element in args is used as the entrypoint,
   * and the remainder will be used as arguments.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   * @param index The index of the element to return.
   * @return The args at the given index.
   */
  com.google.protobuf.ByteString
      getArgsBytes(int index);

  /**
   * <pre>
   * Working directory to use when running this step's container.
   * If this value is a relative path, it is relative to the build's working
   * directory. If this value is absolute, it may be outside the build's working
   * directory, in which case the contents of the path may not be persisted
   * across build step executions, unless a `volume` for that path is specified.
   * If the build specifies a `RepoSource` with `dir` and a step with a `dir`,
   * which specifies an absolute path, the `RepoSource` `dir` is ignored for
   * the step's execution.
   * </pre>
   *
   * <code>string dir = 4;</code>
   * @return The dir.
   */
  java.lang.String getDir();
  /**
   * <pre>
   * Working directory to use when running this step's container.
   * If this value is a relative path, it is relative to the build's working
   * directory. If this value is absolute, it may be outside the build's working
   * directory, in which case the contents of the path may not be persisted
   * across build step executions, unless a `volume` for that path is specified.
   * If the build specifies a `RepoSource` with `dir` and a step with a `dir`,
   * which specifies an absolute path, the `RepoSource` `dir` is ignored for
   * the step's execution.
   * </pre>
   *
   * <code>string dir = 4;</code>
   * @return The bytes for dir.
   */
  com.google.protobuf.ByteString
      getDirBytes();

  /**
   * <pre>
   * Unique identifier for this build step, used in `wait_for` to
   * reference this build step as a dependency.
   * </pre>
   *
   * <code>string id = 5;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Unique identifier for this build step, used in `wait_for` to
   * reference this build step as a dependency.
   * </pre>
   *
   * <code>string id = 5;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The ID(s) of the step(s) that this build step depends on.
   * This build step will not start until all the build steps in `wait_for`
   * have completed successfully. If `wait_for` is empty, this build step will
   * start when all previous build steps in the `Build.Steps` list have
   * completed successfully.
   * </pre>
   *
   * <code>repeated string wait_for = 6;</code>
   * @return A list containing the waitFor.
   */
  java.util.List<java.lang.String>
      getWaitForList();
  /**
   * <pre>
   * The ID(s) of the step(s) that this build step depends on.
   * This build step will not start until all the build steps in `wait_for`
   * have completed successfully. If `wait_for` is empty, this build step will
   * start when all previous build steps in the `Build.Steps` list have
   * completed successfully.
   * </pre>
   *
   * <code>repeated string wait_for = 6;</code>
   * @return The count of waitFor.
   */
  int getWaitForCount();
  /**
   * <pre>
   * The ID(s) of the step(s) that this build step depends on.
   * This build step will not start until all the build steps in `wait_for`
   * have completed successfully. If `wait_for` is empty, this build step will
   * start when all previous build steps in the `Build.Steps` list have
   * completed successfully.
   * </pre>
   *
   * <code>repeated string wait_for = 6;</code>
   * @param index The index of the element to return.
   * @return The waitFor at the given index.
   */
  java.lang.String getWaitFor(int index);
  /**
   * <pre>
   * The ID(s) of the step(s) that this build step depends on.
   * This build step will not start until all the build steps in `wait_for`
   * have completed successfully. If `wait_for` is empty, this build step will
   * start when all previous build steps in the `Build.Steps` list have
   * completed successfully.
   * </pre>
   *
   * <code>repeated string wait_for = 6;</code>
   * @param index The index of the element to return.
   * @return The waitFor at the given index.
   */
  com.google.protobuf.ByteString
      getWaitForBytes(int index);

  /**
   * <pre>
   * Entrypoint to be used instead of the build step image's default entrypoint.
   * If unset, the image's default entrypoint is used.
   * </pre>
   *
   * <code>string entrypoint = 7;</code>
   * @return The entrypoint.
   */
  java.lang.String getEntrypoint();
  /**
   * <pre>
   * Entrypoint to be used instead of the build step image's default entrypoint.
   * If unset, the image's default entrypoint is used.
   * </pre>
   *
   * <code>string entrypoint = 7;</code>
   * @return The bytes for entrypoint.
   */
  com.google.protobuf.ByteString
      getEntrypointBytes();

  /**
   * <pre>
   * A list of environment variables which are encrypted using a Cloud Key
   * Management Service crypto key. These values must be specified in the
   * build's `Secret`.
   * </pre>
   *
   * <code>repeated string secret_env = 8;</code>
   * @return A list containing the secretEnv.
   */
  java.util.List<java.lang.String>
      getSecretEnvList();
  /**
   * <pre>
   * A list of environment variables which are encrypted using a Cloud Key
   * Management Service crypto key. These values must be specified in the
   * build's `Secret`.
   * </pre>
   *
   * <code>repeated string secret_env = 8;</code>
   * @return The count of secretEnv.
   */
  int getSecretEnvCount();
  /**
   * <pre>
   * A list of environment variables which are encrypted using a Cloud Key
   * Management Service crypto key. These values must be specified in the
   * build's `Secret`.
   * </pre>
   *
   * <code>repeated string secret_env = 8;</code>
   * @param index The index of the element to return.
   * @return The secretEnv at the given index.
   */
  java.lang.String getSecretEnv(int index);
  /**
   * <pre>
   * A list of environment variables which are encrypted using a Cloud Key
   * Management Service crypto key. These values must be specified in the
   * build's `Secret`.
   * </pre>
   *
   * <code>repeated string secret_env = 8;</code>
   * @param index The index of the element to return.
   * @return The secretEnv at the given index.
   */
  com.google.protobuf.ByteString
      getSecretEnvBytes(int index);

  /**
   * <pre>
   * List of volumes to mount into the build step.
   * Each volume is created as an empty volume prior to execution of the
   * build step. Upon completion of the build, volumes and their contents are
   * discarded.
   * Using a named volume in only one step is not valid as it is indicative
   * of a build request with an incorrect configuration.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Volume volumes = 9;</code>
   */
  java.util.List<google.events.cloud.cloudbuild.v1.Volume> 
      getVolumesList();
  /**
   * <pre>
   * List of volumes to mount into the build step.
   * Each volume is created as an empty volume prior to execution of the
   * build step. Upon completion of the build, volumes and their contents are
   * discarded.
   * Using a named volume in only one step is not valid as it is indicative
   * of a build request with an incorrect configuration.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Volume volumes = 9;</code>
   */
  google.events.cloud.cloudbuild.v1.Volume getVolumes(int index);
  /**
   * <pre>
   * List of volumes to mount into the build step.
   * Each volume is created as an empty volume prior to execution of the
   * build step. Upon completion of the build, volumes and their contents are
   * discarded.
   * Using a named volume in only one step is not valid as it is indicative
   * of a build request with an incorrect configuration.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Volume volumes = 9;</code>
   */
  int getVolumesCount();

  /**
   * <pre>
   * Stores timing information for executing this build step.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.TimeSpan timing = 10;</code>
   * @return Whether the timing field is set.
   */
  boolean hasTiming();
  /**
   * <pre>
   * Stores timing information for executing this build step.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.TimeSpan timing = 10;</code>
   * @return The timing.
   */
  google.events.cloud.cloudbuild.v1.TimeSpan getTiming();

  /**
   * <pre>
   * Stores timing information for pulling this build step's
   * builder image only.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.TimeSpan pull_timing = 13;</code>
   * @return Whether the pullTiming field is set.
   */
  boolean hasPullTiming();
  /**
   * <pre>
   * Stores timing information for pulling this build step's
   * builder image only.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.TimeSpan pull_timing = 13;</code>
   * @return The pullTiming.
   */
  google.events.cloud.cloudbuild.v1.TimeSpan getPullTiming();

  /**
   * <pre>
   * Time limit for executing this build step. If not defined, the step has no
   * time limit and will be allowed to continue to run until either it completes
   * or the build itself times out.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 11;</code>
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   * <pre>
   * Time limit for executing this build step. If not defined, the step has no
   * time limit and will be allowed to continue to run until either it completes
   * or the build itself times out.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 11;</code>
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();

  /**
   * <pre>
   * Status of the build step. At this time, build step status is
   * only updated on build completion; step status is not updated in real-time
   * as the build progresses.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.BuildEventData.Status status = 12;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Status of the build step. At this time, build step status is
   * only updated on build completion; step status is not updated in real-time
   * as the build progresses.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.BuildEventData.Status status = 12;</code>
   * @return The status.
   */
  google.events.cloud.cloudbuild.v1.BuildEventData.Status getStatus();
}