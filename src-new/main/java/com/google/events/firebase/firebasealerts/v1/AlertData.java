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

package com.google.events.firebase.firebasealerts.v1;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * The data within all Firebase Alerts.
 */
public class AlertData {
    private OffsetDateTime createTime;
    private OffsetDateTime endTime;
    private Map<String, Object> payload;

    /**
     * Time that the event has created
     */
    public OffsetDateTime getCreateTime() { return createTime; }
    public void setCreateTime(OffsetDateTime value) { this.createTime = value; }

    /**
     * Time that the event has ended. Optional, only present for alertsthat are ongoing
     */
    public OffsetDateTime getEndTime() { return endTime; }
    public void setEndTime(OffsetDateTime value) { this.endTime = value; }

    /**
     * Payload of the event, which includes the details of the specific alert. It's a map of
     * keys of String type and values of various types
     */
    public Map<String, Object> getPayload() { return payload; }
    public void setPayload(Map<String, Object> value) { this.payload = value; }
}
