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

import java.time.OffsetDateTime;

/**
 * The most recent device configuration, which is eventually sent from Cloud IoT Core to the
 * device. If not present on creation, the configuration will be initialized with an empty
 * payload and version value of `1`. To update this field after creation, use the
 * `DeviceManager.ModifyCloudToDeviceConfig` method.
 *
 * The device configuration. Eventually delivered to devices.
 */
@lombok.Data
public class Config {
    private String binaryData;
    private OffsetDateTime cloudUpdateTime;
    private OffsetDateTime deviceAckTime;
    private Long version;
}
