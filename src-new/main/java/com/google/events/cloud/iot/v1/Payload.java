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

    /**
     * If a device is blocked, connections or requests from this device will fail. Can be used
     * to temporarily prevent the device from connecting if, for example, the sensor is
     * generating bad data and needs maintenance.
     */
    public Boolean getBlocked() { return blocked; }
    public void setBlocked(Boolean value) { this.blocked = value; }

    /**
     * The most recent device configuration, which is eventually sent from Cloud IoT Core to the
     * device. If not present on creation, the configuration will be initialized with an empty
     * payload and version value of `1`. To update this field after creation, use the
     * `DeviceManager.ModifyCloudToDeviceConfig` method.
     */
    public Config getConfig() { return config; }
    public void setConfig(Config value) { this.config = value; }

    /**
     * The credentials used to authenticate this device. To allow credential rotation without
     * interruption, multiple device credentials can be bound to this device. No more than 3
     * credentials can be bound to a single device at a time. When new credentials are added to
     * a device, they are verified against the registry credentials. For details, see the
     * description of the `DeviceRegistry.credentials` field.
     */
    public List<DeviceCredential> getCredentials() { return credentials; }
    public void setCredentials(List<DeviceCredential> value) { this.credentials = value; }

    /**
     * Gateway-related configuration and state.
     */
    public GatewayConfig getGatewayConfig() { return gatewayConfig; }
    public void setGatewayConfig(GatewayConfig value) { this.gatewayConfig = value; }

    /**
     * The user-defined device identifier. The device ID must be unique within a device registry.
     */
    public String getId() { return id; }
    public void setId(String value) { this.id = value; }

    /**
     * [Output only] The last time a cloud-to-device config version acknowledgment was received
     * from the device. This field is only for configurations sent through MQTT.
     */
    public OffsetDateTime getLastConfigAckTime() { return lastConfigAckTime; }
    public void setLastConfigAckTime(OffsetDateTime value) { this.lastConfigAckTime = value; }

    /**
     * [Output only] The last time a cloud-to-device config version was sent to the device.
     */
    public OffsetDateTime getLastConfigSendTime() { return lastConfigSendTime; }
    public void setLastConfigSendTime(OffsetDateTime value) { this.lastConfigSendTime = value; }

    /**
     * [Output only] The error message of the most recent error, such as a failure to publish to
     * Cloud Pub/Sub. 'last_error_time' is the timestamp of this field. If no errors have
     * occurred, this field has an empty message and the status code 0 == OK. Otherwise, this
     * field is expected to have a status code other than OK.
     */
    public Status getLastErrorStatus() { return lastErrorStatus; }
    public void setLastErrorStatus(Status value) { this.lastErrorStatus = value; }

    /**
     * [Output only] The time the most recent error occurred, such as a failure to publish to
     * Cloud Pub/Sub. This field is the timestamp of 'last_error_status'.
     */
    public OffsetDateTime getLastErrorTime() { return lastErrorTime; }
    public void setLastErrorTime(OffsetDateTime value) { this.lastErrorTime = value; }

    /**
     * [Output only] The last time a telemetry event was received. Timestamps are periodically
     * collected and written to storage; they may be stale by a few minutes.
     */
    public OffsetDateTime getLastEventTime() { return lastEventTime; }
    public void setLastEventTime(OffsetDateTime value) { this.lastEventTime = value; }

    /**
     * [Output only] The last time an MQTT `PINGREQ` was received. This field applies only to
     * devices connecting through MQTT. MQTT clients usually only send `PINGREQ` messages if the
     * connection is idle, and no other messages have been sent. Timestamps are periodically
     * collected and written to storage; they may be stale by a few minutes.
     */
    public OffsetDateTime getLastHeartbeatTime() { return lastHeartbeatTime; }
    public void setLastHeartbeatTime(OffsetDateTime value) { this.lastHeartbeatTime = value; }

    /**
     * [Output only] The last time a state event was received. Timestamps are periodically
     * collected and written to storage; they may be stale by a few minutes.
     */
    public OffsetDateTime getLastStateTime() { return lastStateTime; }
    public void setLastStateTime(OffsetDateTime value) { this.lastStateTime = value; }

    /**
     * **Beta Feature** The logging verbosity for device activity. Specifies which events should
     * be written to logs. For example, if the LogLevel is ERROR, only events that terminate in
     * errors will be logged. LogLevel is inclusive; enabling INFO logging will also enable
     * ERROR logging.
     */
    public LogLevel getLogLevel() { return logLevel; }
    public void setLogLevel(LogLevel value) { this.logLevel = value; }

    /**
     * The metadata key-value pairs assigned to the device. This metadata is not interpreted or
     * indexed by Cloud IoT Core. It can be used to add contextual information for the device.
     * Keys must conform to the regular expression [a-zA-Z][a-zA-Z0-9-_.+~%]+ and be less than
     * 128 bytes in length. Values are free-form strings. Each value must be less than or equal
     * to 32 KB in size. The total size of all keys and values must be less than 256 KB, and the
     * maximum number of key-value pairs is 500.
     */
    public Map<String, String> getMetadata() { return metadata; }
    public void setMetadata(Map<String, String> value) { this.metadata = value; }

    /**
     * The resource path name. For example,
     * `projects/p1/locations/us-central1/registries/registry0/devices/dev0` or
     * `projects/p1/locations/us-central1/registries/registry0/devices/{num_id}`. When `name` is
     * populated as a response from the service, it always ends in the device numeric ID.
     */
    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    /**
     * [Output only] A server-defined unique numeric ID for the device. This is a more compact
     * way to identify devices, and it is globally unique.
     */
    public Long getNumId() { return numId; }
    public void setNumId(Long value) { this.numId = value; }

    /**
     * [Output only] The state most recently received from the device. If no state has been
     * reported, this field is not present.
     */
    public State getState() { return state; }
    public void setState(State value) { this.state = value; }
}
