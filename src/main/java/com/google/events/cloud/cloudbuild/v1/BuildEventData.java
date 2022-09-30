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

package com.google.events.cloud.cloudbuild.v1;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Build event data for Google Cloud Platform API operations.
 */
@lombok.Data
public class BuildEventData {
    private Artifacts artifacts;
    private String buildTriggerId;
    private OffsetDateTime createTime;
    private OffsetDateTime finishTime;
    private String id;
    private List<String> images;
    private String logsBucket;
    private String logUrl;
    private Options options;
    private String projectId;
    private String queueTtl;
    private Results results;
    private List<Secret> secrets;
    private Source source;
    private SourceProvenance sourceProvenance;
    private OffsetDateTime startTime;
    private Status status;
    private String statusDetail;
    private List<BuildStep> steps;
    private Map<String, String> substitutions;
    private List<String> tags;
    private String timeout;
    private Map<String, TimeSpan> timing;
}
