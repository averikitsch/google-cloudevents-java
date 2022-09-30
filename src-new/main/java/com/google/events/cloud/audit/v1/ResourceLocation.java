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

/**
 * The resource location information.
 *
 * Location information about a resource.
 */
public class ResourceLocation {
    private List<String> currentLocations;
    private List<String> originalLocations;

    /**
     * The locations of a resource after the execution of the operation. Requests to create or
     * delete a location based resource must populate the 'current_locations' field and not the
     * 'original_locations' field. For example:     "europe-west1-a"     "us-east1"     "nam3"
     */
    public List<String> getCurrentLocations() { return currentLocations; }
    public void setCurrentLocations(List<String> value) { this.currentLocations = value; }

    /**
     * The locations of a resource prior to the execution of the operation. Requests that mutate
     * the resource's location must populate both the 'original_locations' as well as the
     * 'current_locations' fields. For example:     "europe-west1-a"     "us-east1"     "nam3"
     */
    public List<String> getOriginalLocations() { return originalLocations; }
    public void setOriginalLocations(List<String> value) { this.originalLocations = value; }
}
