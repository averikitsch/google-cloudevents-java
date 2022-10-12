// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/testlab/v1/data.proto

package google.events.firebase.testlab.v1;

/**
 * <pre>
 * Possible test states for a test matrix.
 * </pre>
 *
 * Protobuf enum {@code google.events.firebase.testlab.v1.TestState}
 */
public enum TestState
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <pre>
   * The default value. This value is used if the state is omitted.
   * </pre>
   *
   * <code>TEST_STATE_UNSPECIFIED = 0;</code>
   */
  TEST_STATE_UNSPECIFIED(0),
  /**
   * <pre>
   * The test matrix is being validated.
   * </pre>
   *
   * <code>VALIDATING = 1;</code>
   */
  VALIDATING(1),
  /**
   * <pre>
   * The test matrix is waiting for resources to become available.
   * </pre>
   *
   * <code>PENDING = 2;</code>
   */
  PENDING(2),
  /**
   * <pre>
   * The test matrix has completed normally.
   * </pre>
   *
   * <code>FINISHED = 3;</code>
   */
  FINISHED(3),
  /**
   * <pre>
   * The test matrix has completed because of an infrastructure failure.
   * </pre>
   *
   * <code>ERROR = 4;</code>
   */
  ERROR(4),
  /**
   * <pre>
   * The test matrix was not run because the provided inputs are not valid.
   * </pre>
   *
   * <code>INVALID = 5;</code>
   */
  INVALID(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The default value. This value is used if the state is omitted.
   * </pre>
   *
   * <code>TEST_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int TEST_STATE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * The test matrix is being validated.
   * </pre>
   *
   * <code>VALIDATING = 1;</code>
   */
  public static final int VALIDATING_VALUE = 1;
  /**
   * <pre>
   * The test matrix is waiting for resources to become available.
   * </pre>
   *
   * <code>PENDING = 2;</code>
   */
  public static final int PENDING_VALUE = 2;
  /**
   * <pre>
   * The test matrix has completed normally.
   * </pre>
   *
   * <code>FINISHED = 3;</code>
   */
  public static final int FINISHED_VALUE = 3;
  /**
   * <pre>
   * The test matrix has completed because of an infrastructure failure.
   * </pre>
   *
   * <code>ERROR = 4;</code>
   */
  public static final int ERROR_VALUE = 4;
  /**
   * <pre>
   * The test matrix was not run because the provided inputs are not valid.
   * </pre>
   *
   * <code>INVALID = 5;</code>
   */
  public static final int INVALID_VALUE = 5;


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
  public static TestState valueOf(int value) {
    return forNumber(value);
  }

  public static TestState forNumber(int value) {
    switch (value) {
      case 0: return TEST_STATE_UNSPECIFIED;
      case 1: return VALIDATING;
      case 2: return PENDING;
      case 3: return FINISHED;
      case 4: return ERROR;
      case 5: return INVALID;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TestState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TestState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TestState>() {
          @java.lang.Override
          public TestState findValueByNumber(int number) {
            return TestState.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return TestStateVerifier.INSTANCE;
  }

  private static final class TestStateVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new TestStateVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return TestState.forNumber(number) != null;
          }
        };

  private final int value;

  private TestState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.events.firebase.testlab.v1.TestState)
}

