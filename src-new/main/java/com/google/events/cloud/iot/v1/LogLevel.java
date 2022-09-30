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
 * **Beta Feature** The logging verbosity for device activity. Specifies which events should
 * be written to logs. For example, if the LogLevel is ERROR, only events that terminate in
 * errors will be logged. LogLevel is inclusive; enabling INFO logging will also enable
 * ERROR logging.
 */
public enum LogLevel {
    DEBUG, ERROR, INFO, LOG_LEVEL_UNSPECIFIED, NONE;

    public String toValue() {
        switch (this) {
            case DEBUG: return "DEBUG";
            case ERROR: return "ERROR";
            case INFO: return "INFO";
            case LOG_LEVEL_UNSPECIFIED: return "LOG_LEVEL_UNSPECIFIED";
            case NONE: return "NONE";
        }
        return null;
    }

    public static LogLevel forValue(String value) throws IOException {
        if (value.equals("DEBUG")) return DEBUG;
        if (value.equals("ERROR")) return ERROR;
        if (value.equals("INFO")) return INFO;
        if (value.equals("LOG_LEVEL_UNSPECIFIED")) return LOG_LEVEL_UNSPECIFIED;
        if (value.equals("NONE")) return NONE;
        throw new IOException("Cannot deserialize LogLevel");
    }
}
