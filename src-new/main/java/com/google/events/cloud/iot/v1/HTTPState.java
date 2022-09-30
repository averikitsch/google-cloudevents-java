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
 * Indicates whether DeviceService (HTTP) is enabled or disabled for the registry. See the
 * field description for details.
 */
public enum HTTPState {
    HTTP_DISABLED, HTTP_ENABLED, HTTP_STATE_UNSPECIFIED;

    public String toValue() {
        switch (this) {
            case HTTP_DISABLED: return "HTTP_DISABLED";
            case HTTP_ENABLED: return "HTTP_ENABLED";
            case HTTP_STATE_UNSPECIFIED: return "HTTP_STATE_UNSPECIFIED";
        }
        return null;
    }

    public static HTTPState forValue(String value) throws IOException {
        if (value.equals("HTTP_DISABLED")) return HTTP_DISABLED;
        if (value.equals("HTTP_ENABLED")) return HTTP_ENABLED;
        if (value.equals("HTTP_STATE_UNSPECIFIED")) return HTTP_STATE_UNSPECIFIED;
        throw new IOException("Cannot deserialize HTTPState");
    }
}
