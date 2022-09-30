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
 * Artifacts produced by the build that should be uploaded upon successful completion of all
 * build steps.
 *
 * Artifacts produced by a build that should be uploaded upon successful completion of all
 * build steps.
 */
@lombok.Data
public class Artifacts {
    private List<String> images;
    private Objects objects;
}
