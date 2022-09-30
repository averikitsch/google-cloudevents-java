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
 * A step in the build pipeline.
 */
@lombok.Data
public class BuildStep {
    private List<String> args;
    private String dir;
    private String entrypoint;
    private List<String> env;
    private String id;
    private String name;
    private PullTiming pullTiming;
    private List<String> secretEnv;
    private Status status;
    private String timeout;
    private StepTiming timing;
    private List<Volume> volumes;
    private List<String> waitFor;
}
