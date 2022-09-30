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

/**
 * A public key certificate used to verify the device credentials.
 *
 * A public key certificate format and data.
 */
public class PublicKeyCertificate {
    private String certificate;
    private PublicKeyCertificateFormat format;
    private Details x509Details;

    /**
     * The certificate data.
     */
    public String getCertificate() { return certificate; }
    public void setCertificate(String value) { this.certificate = value; }

    /**
     * The supported formats for the public key.
     */
    public PublicKeyCertificateFormat getFormat() { return format; }
    public void setFormat(PublicKeyCertificateFormat value) { this.format = value; }

    /**
     * [Output only] The certificate details. Used only for X.509 certificates.
     */
    public Details getX509Details() { return x509Details; }
    public void setX509Details(Details value) { this.x509Details = value; }
}
