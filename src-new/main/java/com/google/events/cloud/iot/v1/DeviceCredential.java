/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.events.cloud.iot.v1;

import java.time.OffsetDateTime;

/**
 * A server-stored device credential used for authentication.
 */
public class DeviceCredential {
    private OffsetDateTime expirationTime;
    private PublicKey publicKey;

    /**
     * [Optional] The time at which this credential becomes invalid. This credential will be
     * ignored for new client authentication requests after this timestamp; however, it will not
     * be automatically deleted.
     */
    public OffsetDateTime getExpirationTime() { return expirationTime; }
    public void setExpirationTime(OffsetDateTime value) { this.expirationTime = value; }

    /**
     * A public key used to verify the signature of JSON Web Tokens (JWTs). When adding a new
     * device credential, either via device creation or via modifications, this public key
     * credential may be required to be signed by one of the registry level certificates. More
     * specifically, if the registry contains at least one certificate, any new device
     * credential must be signed by one of the registry certificates. As a result, when the
     * registry contains certificates, only X.509 certificates are accepted as device
     * credentials. However, if the registry does not contain a certificate, self-signed
     * certificates and public keys will be accepted. New device credentials must be different
     * from every registry-level certificate.
     */
    public PublicKey getPublicKey() { return publicKey; }
    public void setPublicKey(PublicKey value) { this.publicKey = value; }
}
