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
 * Indicates whether an MQTT connection is enabled or disabled. See the field description
 * for details.
 */
public enum MqttState {
    MQTT_DISABLED, MQTT_ENABLED, MQTT_STATE_UNSPECIFIED;

    public String toValue() {
        switch (this) {
            case MQTT_DISABLED: return "MQTT_DISABLED";
            case MQTT_ENABLED: return "MQTT_ENABLED";
            case MQTT_STATE_UNSPECIFIED: return "MQTT_STATE_UNSPECIFIED";
        }
        return null;
    }

    public static MqttState forValue(String value) throws IOException {
        if (value.equals("MQTT_DISABLED")) return MQTT_DISABLED;
        if (value.equals("MQTT_ENABLED")) return MQTT_ENABLED;
        if (value.equals("MQTT_STATE_UNSPECIFIED")) return MQTT_STATE_UNSPECIFIED;
        throw new IOException("Cannot deserialize MqttState");
    }
}
