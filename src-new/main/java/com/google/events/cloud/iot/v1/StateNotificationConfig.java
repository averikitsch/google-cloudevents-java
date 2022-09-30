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
 * The configuration for notification of new states received from the device. State updates
 * are guaranteed to be stored in the state history, but notifications to Cloud Pub/Sub are
 * not guaranteed. For example, if permissions are misconfigured or the specified topic
 * doesn't exist, no notification will be published but the state will still be stored in
 * Cloud IoT Core.
 *
 * The configuration for notification of new states received from the device.
 */
public class StateNotificationConfig {
    private String pubsubTopicName;

    /**
     * A Cloud Pub/Sub topic name. For example, `projects/myProject/topics/deviceEvents`.
     */
    public String getPubsubTopicName() { return pubsubTopicName; }
    public void setPubsubTopicName(String value) { this.pubsubTopicName = value; }
}
