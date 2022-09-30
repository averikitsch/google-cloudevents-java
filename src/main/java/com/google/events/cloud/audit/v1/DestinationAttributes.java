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

import java.util.Map;

/**
 * The destination of a network activity, such as accepting a TCP connection. In a multi hop
 * network activity, the destination represents the receiver of the last hop. Only two
 * fields are used in this message, Peer.port and Peer.ip. These fields are optionally
 * populated by those services utilizing the IAM condition feature.
 *
 * This message defines attributes for a node that handles a network request. The node can
 * be either a service or an application that sends, forwards, or receives the request.
 * Service peers should fill in `principal` and `labels` as appropriate.
 */
@lombok.Data
public class DestinationAttributes {
    private String ip;
    private Map<String, String> labels;
    private Long port;
    private String principal;
    private String regionCode;
}
