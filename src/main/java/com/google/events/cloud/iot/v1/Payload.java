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
import java.util.List;
import java.util.Map;

/**
 * Optional. The Device event payload. Unset for deletion events.
 *
 * The device resource.
 */
@lombok.Data
public class Payload {
    private Boolean blocked;
    private Config config;
    private List<DeviceCredential> credentials;
    private GatewayConfig gatewayConfig;
    private String id;
    private OffsetDateTime lastConfigAckTime;
    private OffsetDateTime lastConfigSendTime;
    private Status lastErrorStatus;
    private OffsetDateTime lastErrorTime;
    private OffsetDateTime lastEventTime;
    private OffsetDateTime lastHeartbeatTime;
    private OffsetDateTime lastStateTime;
    private LogLevel logLevel;
    private Map<String, String> metadata;
    private String name;
    private Long numId;
    private State state;
}
