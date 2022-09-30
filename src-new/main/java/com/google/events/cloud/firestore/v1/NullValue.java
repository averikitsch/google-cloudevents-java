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

package com.google.events.cloud.firestore.v1;

import java.io.IOException;

/**
 * `NullValue` is a singleton enumeration to represent the null value for the `Value` type
 * union.  The JSON representation for `NullValue` is JSON `null`.
 */
public enum NullValue {
    NULL_VALUE;

    public String toValue() {
        switch (this) {
            case NULL_VALUE: return "NULL_VALUE";
        }
        return null;
    }

    public static NullValue forValue(String value) throws IOException {
        if (value.equals("NULL_VALUE")) return NULL_VALUE;
        throw new IOException("Cannot deserialize NullValue");
    }
}
