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
 * Gateway type.
 */
public enum GatewayType {
    GATEWAY, GATEWAY_TYPE_UNSPECIFIED, NON_GATEWAY;

    public String toValue() {
        switch (this) {
            case GATEWAY: return "GATEWAY";
            case GATEWAY_TYPE_UNSPECIFIED: return "GATEWAY_TYPE_UNSPECIFIED";
            case NON_GATEWAY: return "NON_GATEWAY";
        }
        return null;
    }

    public static GatewayType forValue(String value) throws IOException {
        if (value.equals("GATEWAY")) return GATEWAY;
        if (value.equals("GATEWAY_TYPE_UNSPECIFIED")) return GATEWAY_TYPE_UNSPECIFIED;
        if (value.equals("NON_GATEWAY")) return NON_GATEWAY;
        throw new IOException("Cannot deserialize GatewayType");
    }
}
