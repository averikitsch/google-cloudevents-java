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

/**
 * Container message for hash values.
 */
public class Hash {
    private SourceProvenanceHashEnum type;
    private String value;

    /**
     * Specifies the hash algorithm, if any.
     */
    public SourceProvenanceHashEnum getType() { return type; }
    public void setType(SourceProvenanceHashEnum value) { this.type = value; }

    /**
     * The hash value.
     */
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
}
