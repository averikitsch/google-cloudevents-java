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
 * The configuration for forwarding telemetry events.
 */
public class EventNotificationConfig {
    private String pubsubTopicName;
    private String subfolderMatches;

    /**
     * A Cloud Pub/Sub topic name. For example, `projects/myProject/topics/deviceEvents`.
     */
    public String getPubsubTopicName() { return pubsubTopicName; }
    public void setPubsubTopicName(String value) { this.pubsubTopicName = value; }

    /**
     * If the subfolder name matches this string exactly, this configuration will be used. The
     * string must not include the leading '/' character. If empty, all strings are matched.
     * This field is used only for telemetry events; subfolders are not supported for state
     * changes.
     */
    public String getSubfolderMatches() { return subfolderMatches; }
    public void setSubfolderMatches(String value) { this.subfolderMatches = value; }
}
