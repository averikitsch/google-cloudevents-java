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

import java.io.IOException;

/**
 * The supported formats for the public key.
 */
public enum PublicKeyCertificateFormat {
    UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT, X509_CERTIFICATE_PEM;

    public String toValue() {
        switch (this) {
            case UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT: return "UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT";
            case X509_CERTIFICATE_PEM: return "X509_CERTIFICATE_PEM";
        }
        return null;
    }

    public static PublicKeyCertificateFormat forValue(String value) throws IOException {
        if (value.equals("UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT")) return UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT;
        if (value.equals("X509_CERTIFICATE_PEM")) return X509_CERTIFICATE_PEM;
        throw new IOException("Cannot deserialize PublicKeyCertificateFormat");
    }
}
