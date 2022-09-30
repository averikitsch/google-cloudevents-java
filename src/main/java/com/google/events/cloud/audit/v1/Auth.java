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
import java.util.Map;

/**
 * The request authentication. May be absent for unauthenticated requests. Derived from the
 * HTTP request `Authorization` header or equivalent.
 *
 * This message defines request authentication attributes. Terminology is based on the JSON
 * Web Token (JWT) standard, but the terms also correlate to concepts in other standards.
 */
@lombok.Data
public class Auth {
    private List<String> accessLevels;
    private List<String> audiences;
    private Map<String, Object> claims;
    private String presenter;
    private String principal;
}
