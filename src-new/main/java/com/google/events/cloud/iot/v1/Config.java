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
public class Config {
    private String binaryData;
    private OffsetDateTime cloudUpdateTime;
    private OffsetDateTime deviceAckTime;
    private Long version;

    /**
     * The device configuration data.
     */
    public String getBinaryData() { return binaryData; }
    public void setBinaryData(String value) { this.binaryData = value; }

    /**
     * [Output only] The time at which this configuration version was updated in Cloud IoT Core.
     * This timestamp is set by the server.
     */
    public OffsetDateTime getCloudUpdateTime() { return cloudUpdateTime; }
    public void setCloudUpdateTime(OffsetDateTime value) { this.cloudUpdateTime = value; }

    /**
     * [Output only] The time at which Cloud IoT Core received the acknowledgment from the
     * device, indicating that the device has received this configuration version. If this field
     * is not present, the device has not yet acknowledged that it received this version. Note
     * that when the config was sent to the device, many config versions may have been available
     * in Cloud IoT Core while the device was disconnected, and on connection, only the latest
     * version is sent to the device. Some versions may never be sent to the device, and
     * therefore are never acknowledged. This timestamp is set by Cloud IoT Core.
     */
    public OffsetDateTime getDeviceAckTime() { return deviceAckTime; }
    public void setDeviceAckTime(OffsetDateTime value) { this.deviceAckTime = value; }

    /**
     * [Output only] The version of this update. The version number is assigned by the server,
     * and is always greater than 0 after device creation. The version must be 0 on the
     * `CreateDevice` request if a `config` is specified; the response of `CreateDevice` will
     * always have a value of 1.
     */
    public Long getVersion() { return version; }
    public void setVersion(Long value) { this.version = value; }
}
