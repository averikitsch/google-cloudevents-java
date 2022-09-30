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

package com.google.events.cloud.audit.v1;

import java.util.List;
import java.util.Map;

/**
 * The log entry payload, which is always an AuditLog for Cloud Audit Log events.
 *
 * Common audit log format for Google Cloud Platform API operations. Copied from
 * https://github.com/googleapis/googleapis/blob/master/google/cloud/audit/audit_log.proto,
 * but changing service_data from Any to Struct.
 */
@lombok.Data
public class ProtoPayload {
    private AuthenticationInfo authenticationInfo;
    private List<AuthorizationInfo> authorizationInfo;
    private Map<String, Object> metadata;
    private String methodName;
    private Long numResponseItems;
    private Map<String, Object> request;
    private RequestMetadata requestMetadata;
    private ResourceLocation resourceLocation;
    private String resourceName;
    private Map<String, Object> resourceOriginalState;
    private Map<String, Object> response;
    private Map<String, Object> serviceData;
    private String serviceName;
    private Status status;
}
