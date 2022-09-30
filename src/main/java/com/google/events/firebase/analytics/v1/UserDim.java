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

package com.google.events.firebase.analytics.v1;

import java.util.Map;

/**
 * User related dimensions.
 *
 * Message containing information about the user associated with the event.
 */
@lombok.Data
public class UserDim {
    private AppInfo appInfo;
    private BundleInfo bundleInfo;
    private DeviceInfo deviceInfo;
    private Long firstOpenTimestampMicros;
    private GeoInfo geoInfo;
    private LtvInfo ltvInfo;
    private TrafficSource trafficSource;
    private String userId;
    private Map<String, UserPropertyValue> userProperties;
}
