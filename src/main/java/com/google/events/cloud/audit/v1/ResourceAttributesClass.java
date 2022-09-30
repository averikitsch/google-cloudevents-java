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

import java.util.Map;

/**
 * Resource attributes used in IAM condition evaluation. This field contains resource
 * attributes like resource type and resource name. To get the whole view of the attributes
 * used in IAM condition evaluation, the user must also look into
 * `AuditLogData.request_metadata.request_attributes`.
 *
 * This message defines core attributes for a resource. A resource is an addressable (named)
 * entity provided by the destination service. For example, a file stored on a network
 * storage service.
 */
@lombok.Data
public class ResourceAttributesClass {
    private Map<String, String> labels;
    private String name;
    private String service;
    private String type;
}
