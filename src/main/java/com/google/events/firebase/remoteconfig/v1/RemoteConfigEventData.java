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

package com.google.events.firebase.remoteconfig.v1;

import java.time.OffsetDateTime;

/**
 * The data within all Firebase Remote Config events.
 */
@lombok.Data
public class RemoteConfigEventData {
    private String description;
    private Long rollbackSource;
    private RemoteConfigUpdateOrigin updateOrigin;
    private OffsetDateTime updateTime;
    private RemoteConfigUpdateType updateType;
    private User updateUser;
    private Long versionNumber;
}
