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

package com.google.events.firebase.auth.v1;

import java.util.List;
import java.util.Map;

/**
 * The data within all Firebase Auth events.
 */
@lombok.Data
public class AuthEventData {
    private Map<String, Object> customClaims;
    private Boolean disabled;
    private String displayName;
    private String email;
    private Boolean emailVerified;
    private Metadata metadata;
    private String phoneNumber;
    private String photoUrl;
    private List<UserInfo> providerData;
    private String uid;
}
