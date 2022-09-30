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

import java.util.List;

/**
 * Special options for this build.
 *
 * Optional arguments to enable specific features of builds.
 */
@lombok.Data
public class Options {
    private Long diskSizeGb;
    private List<String> env;
    private LoggingMode logging;
    private LogStreamingOption logStreamingOption;
    private MachineType machineType;
    private VerifyOption requestedVerifyOption;
    private List<String> secretEnv;
    private List<SourceProvenanceHashEnum> sourceProvenanceHash;
    private SubstitutionOption substitutionOption;
    private List<Volume> volumes;
    private String workerPool;
}
