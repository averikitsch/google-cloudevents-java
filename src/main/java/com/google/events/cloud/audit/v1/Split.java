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

/**
 * Information indicating this LogEntry is part of a sequence of multiple logs split from a
 * single LogEntry.
 *
 * Additional information used to correlate multiple LogEntries. Used when a single LogEntry
 * would exceed the Google Cloud Logging size limit and is split across multiple entries.
 */
@lombok.Data
public class Split {
    private Long index;
    private Long totalSplits;
    private String uid;
}
