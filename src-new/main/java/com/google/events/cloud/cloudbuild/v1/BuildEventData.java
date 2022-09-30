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

    /**
     * Artifacts produced by the build that should be uploaded upon successful completion of all
     * build steps.
     */
    public Artifacts getArtifacts() { return artifacts; }
    public void setArtifacts(Artifacts value) { this.artifacts = value; }

    /**
     * The ID of the `BuildTrigger` that triggered this build, if it was triggered automatically.
     */
    public String getBuildTriggerId() { return buildTriggerId; }
    public void setBuildTriggerId(String value) { this.buildTriggerId = value; }

    /**
     * Time at which the request to create the build was received.
     */
    public OffsetDateTime getCreateTime() { return createTime; }
    public void setCreateTime(OffsetDateTime value) { this.createTime = value; }

    /**
     * Time at which execution of the build was finished. The difference between finish_time and
     * start_time is the duration of the build's execution.
     */
    public OffsetDateTime getFinishTime() { return finishTime; }
    public void setFinishTime(OffsetDateTime value) { this.finishTime = value; }

    /**
     * Unique identifier of the build.
     */
    public String getId() { return id; }
    public void setId(String value) { this.id = value; }

    /**
     * A list of images to be pushed upon the successful completion of all build steps. The
     * images are pushed using the builder service account's credentials. The digests of the
     * pushed images will be stored in the `Build` resource's results field. If any of the
     * images fail to be pushed, the build status is marked `FAILURE`.
     */
    public List<String> getImages() { return images; }
    public void setImages(List<String> value) { this.images = value; }

    /**
     * Google Cloud Storage bucket where logs should be written (see [Bucket Name
     * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Logs
     * file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
     */
    public String getLogsBucket() { return logsBucket; }
    public void setLogsBucket(String value) { this.logsBucket = value; }

    /**
     * URL to logs for this build in Google Cloud Console.
     */
    public String getLogUrl() { return logUrl; }
    public void setLogUrl(String value) { this.logUrl = value; }

    /**
     * Special options for this build.
     */
    public Options getOptions() { return options; }
    public void setOptions(Options value) { this.options = value; }

    /**
     * ID of the project.
     */
    public String getProjectId() { return projectId; }
    public void setProjectId(String value) { this.projectId = value; }

    /**
     * TTL in queue for this build. If provided and the build is enqueued longer than this
     * value, the build will expire and the build status will be `EXPIRED`. The TTL starts
     * ticking from create_time.
     */
    public String getQueueTtl() { return queueTtl; }
    public void setQueueTtl(String value) { this.queueTtl = value; }

    /**
     * Results of the build.
     */
    public Results getResults() { return results; }
    public void setResults(Results value) { this.results = value; }

    /**
     * Secrets to decrypt using Cloud Key Management Service.
     */
    public List<Secret> getSecrets() { return secrets; }
    public void setSecrets(List<Secret> value) { this.secrets = value; }

    /**
     * The location of the source files to build.
     */
    public Source getSource() { return source; }
    public void setSource(Source value) { this.source = value; }

    /**
     * A permanent fixed identifier for source.
     */
    public SourceProvenance getSourceProvenance() { return sourceProvenance; }
    public void setSourceProvenance(SourceProvenance value) { this.sourceProvenance = value; }

    /**
     * Time at which execution of the build was started.
     */
    public OffsetDateTime getStartTime() { return startTime; }
    public void setStartTime(OffsetDateTime value) { this.startTime = value; }

    /**
     * Possible status of a build or build step.
     */
    public Status getStatus() { return status; }
    public void setStatus(Status value) { this.status = value; }

    /**
     * Customer-readable message about the current status.
     */
    public String getStatusDetail() { return statusDetail; }
    public void setStatusDetail(String value) { this.statusDetail = value; }

    /**
     * The operations to be performed on the workspace.
     */
    public List<BuildStep> getSteps() { return steps; }
    public void setSteps(List<BuildStep> value) { this.steps = value; }

    /**
     * Substitutions data for `Build` resource.
     */
    public Map<String, String> getSubstitutions() { return substitutions; }
    public void setSubstitutions(Map<String, String> value) { this.substitutions = value; }

    /**
     * Tags for annotation of a `Build`. These are not docker tags.
     */
    public List<String> getTags() { return tags; }
    public void setTags(List<String> value) { this.tags = value; }

    /**
     * Amount of time that this build should be allowed to run, to second granularity. If this
     * amount of time elapses, work on the build will cease and the build status will be
     * `TIMEOUT`.
     */
    public String getTimeout() { return timeout; }
    public void setTimeout(String value) { this.timeout = value; }

    /**
     * Stores timing information for phases of the build. Valid keys are: * BUILD: time to
     * execute all build steps * PUSH: time to push all specified images. * FETCHSOURCE: time to
     * fetch source. If the build does not specify source or images, these keys will not be
     * included.
     */
    public Map<String, TimeSpan> getTiming() { return timing; }
    public void setTiming(Map<String, TimeSpan> value) { this.timing = value; }
}
