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
public enum PublicKeyFormat {
    ES256_PEM, ES256_X509_PEM, RSA_PEM, RSA_X509_PEM, UNSPECIFIED_PUBLIC_KEY_FORMAT;

    public String toValue() {
        switch (this) {
            case ES256_PEM: return "ES256_PEM";
            case ES256_X509_PEM: return "ES256_X509_PEM";
            case RSA_PEM: return "RSA_PEM";
            case RSA_X509_PEM: return "RSA_X509_PEM";
            case UNSPECIFIED_PUBLIC_KEY_FORMAT: return "UNSPECIFIED_PUBLIC_KEY_FORMAT";
        }
        return null;
    }

    public static PublicKeyFormat forValue(String value) throws IOException {
        if (value.equals("ES256_PEM")) return ES256_PEM;
        if (value.equals("ES256_X509_PEM")) return ES256_X509_PEM;
        if (value.equals("RSA_PEM")) return RSA_PEM;
        if (value.equals("RSA_X509_PEM")) return RSA_X509_PEM;
        if (value.equals("UNSPECIFIED_PUBLIC_KEY_FORMAT")) return UNSPECIFIED_PUBLIC_KEY_FORMAT;
        throw new IOException("Cannot deserialize PublicKeyFormat");
    }
}
