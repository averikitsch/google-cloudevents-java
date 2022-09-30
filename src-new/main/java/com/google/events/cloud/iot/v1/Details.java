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
 * [Output only] The certificate details. Used only for X.509 certificates.
 *
 * Details of an X.509 certificate. For informational purposes only.
 */
public class Details {
    private OffsetDateTime expiryTime;
    private String issuer;
    private String publicKeyType;
    private String signatureAlgorithm;
    private OffsetDateTime startTime;
    private String subject;

    /**
     * The time the certificate becomes invalid.
     */
    public OffsetDateTime getExpiryTime() { return expiryTime; }
    public void setExpiryTime(OffsetDateTime value) { this.expiryTime = value; }

    /**
     * The entity that signed the certificate.
     */
    public String getIssuer() { return issuer; }
    public void setIssuer(String value) { this.issuer = value; }

    /**
     * The type of public key in the certificate.
     */
    public String getPublicKeyType() { return publicKeyType; }
    public void setPublicKeyType(String value) { this.publicKeyType = value; }

    /**
     * The algorithm used to sign the certificate.
     */
    public String getSignatureAlgorithm() { return signatureAlgorithm; }
    public void setSignatureAlgorithm(String value) { this.signatureAlgorithm = value; }

    /**
     * The time the certificate becomes valid.
     */
    public OffsetDateTime getStartTime() { return startTime; }
    public void setStartTime(OffsetDateTime value) { this.startTime = value; }

    /**
     * The entity the certificate and public key belong to.
     */
    public String getSubject() { return subject; }
    public void setSubject(String value) { this.subject = value; }
}
