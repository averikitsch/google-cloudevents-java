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

import java.util.Map;

/**
 * If provided, get the source from this location in a Cloud Source Repository.
 *
 * Location of the source in a Google Cloud Source Repository.
 */
@lombok.Data
public class RepoSourceClass {
    private String branchName;
    private String commitSha;
    private String dir;
    private Boolean invertRegex;
    private String projectId;
    private String repoName;
    private Map<String, String> substitutions;
    private String tagName;
}
