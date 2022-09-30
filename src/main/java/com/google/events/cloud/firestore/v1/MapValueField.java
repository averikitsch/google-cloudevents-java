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

import java.time.OffsetDateTime;

/**
 * A message that can hold any of the supported value types.
 */
@lombok.Data
public class MapValueField {
    private ArrayValue arrayValue;
    private Boolean booleanValue;
    private String bytesValue;
    private Double doubleValue;
    private GeoPointValue geoPointValue;
    private Long integerValue;
    private MapValue mapValue;
    private NullValue nullValue;
    private String referenceValue;
    private String stringValue;
    private OffsetDateTime timestampValue;
}
