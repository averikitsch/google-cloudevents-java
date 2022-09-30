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
 * Gateway-related configuration and state.
 */
public class GatewayConfig {
    private GatewayAuthMethod gatewayAuthMethod;
    private GatewayType gatewayType;
    private String lastAccessedGatewayId;
    private OffsetDateTime lastAccessedGatewayTime;

    /**
     * The gateway authorization/authentication method. This setting determines how Cloud IoT
     * Core authorizes/authenticate devices to access the gateway.
     */
    public GatewayAuthMethod getGatewayAuthMethod() { return gatewayAuthMethod; }
    public void setGatewayAuthMethod(GatewayAuthMethod value) { this.gatewayAuthMethod = value; }

    /**
     * Gateway type.
     */
    public GatewayType getGatewayType() { return gatewayType; }
    public void setGatewayType(GatewayType value) { this.gatewayType = value; }

    /**
     * [Output only] The ID of the gateway the device accessed most recently.
     */
    public String getLastAccessedGatewayId() { return lastAccessedGatewayId; }
    public void setLastAccessedGatewayId(String value) { this.lastAccessedGatewayId = value; }

    /**
     * [Output only] The most recent time at which the device accessed the gateway specified in
     * `last_accessed_gateway`.
     */
    public OffsetDateTime getLastAccessedGatewayTime() { return lastAccessedGatewayTime; }
    public void setLastAccessedGatewayTime(OffsetDateTime value) { this.lastAccessedGatewayTime = value; }
}
