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

/**
 * Device information.
 *
 * Message containing device informations.
 */
@lombok.Data
public class DeviceInfo {
    private String deviceCategory;
    private String deviceId;
    private String deviceModel;
    private Long deviceTimeZoneOffsetSeconds;
    private Boolean limitedAdTracking;
    private String mobileBrandName;
    private String mobileMarketingName;
    private String mobileModelName;
    private String platformVersion;
    private String resettableDeviceId;
    private String userDefaultLanguage;
}
