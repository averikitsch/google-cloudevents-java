/*
 * Copyright 2021 Google LLC
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
 * The status of the overall operation.
 *
 * The `Status` type defines a logical error model that is suitable for
 * different programming environments, including REST APIs and RPC APIs. It is
 * used by [gRPC](https://github.com/grpc). Each `Status` message contains
 * three pieces of data: error code, error message, and error details.
 *
 * You can find out more about this error model and how to work with it in the
 * [API Design Guide](https://cloud.google.com/apis/design/errors).
 */
public class Status {
    private Long code;
    private Detail[] details;
    private String message;

    /**
     * The status code, which should be an enum value of [google.rpc.Code][google.rpc.Code].
     */
    public Long getCode() { return code; }
    public void setCode(Long value) { this.code = value; }

    /**
     * A list of messages that carry the error details.  There is a common set of
     * message types for APIs to use.
     */
    public Detail[] getDetails() { return details; }
    public void setDetails(Detail[] value) { this.details = value; }

    /**
     * A developer-facing error message, which should be in English. Any
     * user-facing error message should be localized and sent in the
     * [google.rpc.Status.details][google.rpc.Status.details] field, or localized by the client.
     */
    public String getMessage() { return message; }
    public void setMessage(String value) { this.message = value; }
}