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
public class Split {
    private Long index;
    private Long totalSplits;
    private String uid;

    /**
     * The index of this LogEntry in the sequence of split logs. LogEntries are given |index|
     * values 0, 1, ..., n-1 for a sequence of n entries.
     */
    public Long getIndex() { return index; }
    public void setIndex(Long value) { this.index = value; }

    /**
     * The total number of logs that the original LogEntry was split into.
     */
    public Long getTotalSplits() { return totalSplits; }
    public void setTotalSplits(Long value) { this.totalSplits = value; }

    /**
     * A globally unique identifier for all LogEntries in a sequence of split logs. All
     * LogEntries with the same |LogSplit.uid| are assumed to be part of the same sequence of
     * split logs.
     */
    public String getUid() { return uid; }
    public void setUid(String value) { this.uid = value; }
}
