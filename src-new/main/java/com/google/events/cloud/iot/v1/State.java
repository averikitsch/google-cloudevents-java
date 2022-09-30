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
 * [Output only] The state most recently received from the device. If no state has been
 * reported, this field is not present.
 *
 * The device state, as reported by the device.
 */
public class State {
    private String binaryData;
    private OffsetDateTime updateTime;

    /**
     * The device state data.
     */
    public String getBinaryData() { return binaryData; }
    public void setBinaryData(String value) { this.binaryData = value; }

    /**
     * [Output only] The time at which this state version was updated in Cloud IoT Core.
     */
    public OffsetDateTime getUpdateTime() { return updateTime; }
    public void setUpdateTime(OffsetDateTime value) { this.updateTime = value; }
}
