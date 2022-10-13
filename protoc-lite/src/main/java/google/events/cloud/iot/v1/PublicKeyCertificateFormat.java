// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/iot/v1/data.proto

package google.events.cloud.iot.v1;

/**
 * <pre>
 * The supported formats for the public key.
 * </pre>
 *
 * Protobuf enum {@code google.events.cloud.iot.v1.PublicKeyCertificateFormat}
 */
public enum PublicKeyCertificateFormat
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <pre>
   * The format has not been specified. This is an invalid default value and
   * must not be used.
   * </pre>
   *
   * <code>UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT = 0;</code>
   */
  UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT(0),
  /**
   * <pre>
   * An X.509v3 certificate ([RFC5280](https://www.ietf.org/rfc/rfc5280.txt)),
   * encoded in base64, and wrapped by `-----BEGIN CERTIFICATE-----` and
   * `-----END CERTIFICATE-----`.
   * </pre>
   *
   * <code>X509_CERTIFICATE_PEM = 1;</code>
   */
  X509_CERTIFICATE_PEM(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The format has not been specified. This is an invalid default value and
   * must not be used.
   * </pre>
   *
   * <code>UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT = 0;</code>
   */
  public static final int UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT_VALUE = 0;
  /**
   * <pre>
   * An X.509v3 certificate ([RFC5280](https://www.ietf.org/rfc/rfc5280.txt)),
   * encoded in base64, and wrapped by `-----BEGIN CERTIFICATE-----` and
   * `-----END CERTIFICATE-----`.
   * </pre>
   *
   * <code>X509_CERTIFICATE_PEM = 1;</code>
   */
  public static final int X509_CERTIFICATE_PEM_VALUE = 1;


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
  public static PublicKeyCertificateFormat valueOf(int value) {
    return forNumber(value);
  }

  public static PublicKeyCertificateFormat forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT;
      case 1: return X509_CERTIFICATE_PEM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PublicKeyCertificateFormat>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PublicKeyCertificateFormat> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PublicKeyCertificateFormat>() {
          @java.lang.Override
          public PublicKeyCertificateFormat findValueByNumber(int number) {
            return PublicKeyCertificateFormat.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return PublicKeyCertificateFormatVerifier.INSTANCE;
  }

  private static final class PublicKeyCertificateFormatVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new PublicKeyCertificateFormatVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return PublicKeyCertificateFormat.forNumber(number) != null;
          }
        };

  private final int value;

  private PublicKeyCertificateFormat(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.events.cloud.iot.v1.PublicKeyCertificateFormat)
}
