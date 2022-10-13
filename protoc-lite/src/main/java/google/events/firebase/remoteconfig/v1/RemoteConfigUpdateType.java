// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/remoteconfig/v1/data.proto

package google.events.firebase.remoteconfig.v1;

/**
 * <pre>
 * Where the Remote Config update action originated.
 * </pre>
 *
 * Protobuf enum {@code google.events.firebase.remoteconfig.v1.RemoteConfigUpdateType}
 */
public enum RemoteConfigUpdateType
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <pre>
   * Catch-all for unrecognized enum values.
   * </pre>
   *
   * <code>REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED = 0;</code>
   */
  REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * A regular incremental update.
   * </pre>
   *
   * <code>INCREMENTAL_UPDATE = 1;</code>
   */
  INCREMENTAL_UPDATE(1),
  /**
   * <pre>
   * A forced update.
   * The ETag was specified as "*" in an UpdateRemoteConfigRequest
   * request or the "Force Update" button was pressed on the console.
   * </pre>
   *
   * <code>FORCED_UPDATE = 2;</code>
   */
  FORCED_UPDATE(2),
  /**
   * <pre>
   * A rollback to a previous Remote Config template.
   * </pre>
   *
   * <code>ROLLBACK = 3;</code>
   */
  ROLLBACK(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Catch-all for unrecognized enum values.
   * </pre>
   *
   * <code>REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * A regular incremental update.
   * </pre>
   *
   * <code>INCREMENTAL_UPDATE = 1;</code>
   */
  public static final int INCREMENTAL_UPDATE_VALUE = 1;
  /**
   * <pre>
   * A forced update.
   * The ETag was specified as "*" in an UpdateRemoteConfigRequest
   * request or the "Force Update" button was pressed on the console.
   * </pre>
   *
   * <code>FORCED_UPDATE = 2;</code>
   */
  public static final int FORCED_UPDATE_VALUE = 2;
  /**
   * <pre>
   * A rollback to a previous Remote Config template.
   * </pre>
   *
   * <code>ROLLBACK = 3;</code>
   */
  public static final int ROLLBACK_VALUE = 3;


  @java.lang.Override
  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The number of the enum to look for.
   * @return The enum associated with the given number.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static RemoteConfigUpdateType valueOf(int value) {
    return forNumber(value);
  }

  public static RemoteConfigUpdateType forNumber(int value) {
    switch (value) {
      case 0: return REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED;
      case 1: return INCREMENTAL_UPDATE;
      case 2: return FORCED_UPDATE;
      case 3: return ROLLBACK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RemoteConfigUpdateType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RemoteConfigUpdateType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RemoteConfigUpdateType>() {
          @java.lang.Override
          public RemoteConfigUpdateType findValueByNumber(int number) {
            return RemoteConfigUpdateType.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return RemoteConfigUpdateTypeVerifier.INSTANCE;
  }

  private static final class RemoteConfigUpdateTypeVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new RemoteConfigUpdateTypeVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return RemoteConfigUpdateType.forNumber(number) != null;
          }
        };

  private final int value;

  private RemoteConfigUpdateType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.events.firebase.remoteconfig.v1.RemoteConfigUpdateType)
}
