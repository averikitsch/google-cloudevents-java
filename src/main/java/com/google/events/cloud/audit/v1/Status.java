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
 * The status of the overall operation.
 *
 * The `Status` type defines a logical error model that is suitable for different
 * programming environments, including REST APIs and RPC APIs. It is used by
 * [gRPC](https://github.com/grpc). Each `Status` message contains three pieces of data:
 * error code, error message, and error details. You can find out more about this error
 * model and how to work with it in the [API Design
 * Guide](https://cloud.google.com/apis/design/errors).
 */
@lombok.Data
public class Status {
    private Long code;
    private List<Any> details;
    private String message;
}
