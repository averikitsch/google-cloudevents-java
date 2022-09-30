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

package com.google.events.cloud.firestore.v1;

import java.util.List;

/**
 * A DocumentMask object that lists changed fields. This is only populated for update
 * events.
 *
 * A set of field paths on a document.
 */
public class Mask {
    private List<String> fieldPaths;

    /**
     * The list of field paths in the mask. See
     * [Document.fields][google.cloud.firestore.v1.events.Document.fields] for a field path
     * syntax reference.
     */
    public List<String> getFieldPaths() { return fieldPaths; }
    public void setFieldPaths(List<String> value) { this.fieldPaths = value; }
}
