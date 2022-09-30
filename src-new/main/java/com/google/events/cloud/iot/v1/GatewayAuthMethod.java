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
 * The gateway authorization/authentication method. This setting determines how Cloud IoT
 * Core authorizes/authenticate devices to access the gateway.
 */
public enum GatewayAuthMethod {
    ASSOCIATION_AND_DEVICE_AUTH_TOKEN, ASSOCIATION_ONLY, DEVICE_AUTH_TOKEN_ONLY, GATEWAY_AUTH_METHOD_UNSPECIFIED;

    public String toValue() {
        switch (this) {
            case ASSOCIATION_AND_DEVICE_AUTH_TOKEN: return "ASSOCIATION_AND_DEVICE_AUTH_TOKEN";
            case ASSOCIATION_ONLY: return "ASSOCIATION_ONLY";
            case DEVICE_AUTH_TOKEN_ONLY: return "DEVICE_AUTH_TOKEN_ONLY";
            case GATEWAY_AUTH_METHOD_UNSPECIFIED: return "GATEWAY_AUTH_METHOD_UNSPECIFIED";
        }
        return null;
    }

    public static GatewayAuthMethod forValue(String value) throws IOException {
        if (value.equals("ASSOCIATION_AND_DEVICE_AUTH_TOKEN")) return ASSOCIATION_AND_DEVICE_AUTH_TOKEN;
        if (value.equals("ASSOCIATION_ONLY")) return ASSOCIATION_ONLY;
        if (value.equals("DEVICE_AUTH_TOKEN_ONLY")) return DEVICE_AUTH_TOKEN_ONLY;
        if (value.equals("GATEWAY_AUTH_METHOD_UNSPECIFIED")) return GATEWAY_AUTH_METHOD_UNSPECIFIED;
        throw new IOException("Cannot deserialize GatewayAuthMethod");
    }
}
