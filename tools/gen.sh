#!/bin/bash

# Copyright 2020 Google LLC.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -e

# Delete current types (not tests)
# rm -rf src/main

# # Generate new types
# export ENUM_AS_STRING=true
# qt \
# --in=../../samples/google-cloudevents/jsonschema/ \
# --out=./java \
# --l=java

#  --array-type list
#  --[no-]just-types                                 Plain types only (off by default)         
#  --acronym-style original|pascal|camel|lowerCase
#  --package NAME
#  --[no-]lombok 

# Move types to correct directory
mkdir -p src2/main/java/com/google
mv java/ src2/main/java/com/google

# Get all generated type files
PATHS=$(grep -r "package com.google.events;" src)

# For each path, fix the package.
#
# Example:
# PATH: src/main/java/com/google/google/events/cloud/audit/v1/AuditLog.java
# i.e. IN: "package com.google.events;" – default generated package
# i.e. OUT: "package com.google.google.events.cloud.audit.v1;" – desired package
while IFS= read -r PATHS; do
    FILE=$(echo $PATHS | cut -f1 -d:)
    # Generator defaults string to: package com.google.events;
    IO_QUICKTYPE_STRING=$(echo $PATHS | cut -f2 -d:)

    # Remove the prefix (path)
    # IN: src/main/java/com/google/google/events/cloud/pubsub/v1/MessagePublishedData.java
    # OUT: com/google/google/events/cloud/pubsub/v1/MessagePublishedData.java
    FILE_PREFIX="src/main/java/"
    FILE_WITHOUT_PREFIX=${FILE#"$FILE_PREFIX"}

    # Remove suffix (all characters after last "/")
    # From: https://askubuntu.com/a/1010311
    # IN: com/google/google/events/cloud/pubsub/v1/MessagePublishedData.java
    # OUT: com/google/google/events/cloud/pubsub/v1
    FILE_WITHOUT_PREFIX_OR_SUFFIX=$(echo $FILE_WITHOUT_PREFIX | sed 's|\(.*\)/.*|\1|')

    # Replace "/" with "."
    PACKAGE=$(echo $FILE_WITHOUT_PREFIX_OR_SUFFIX | tr / .)
    # Get correct package string. Like "package com.google.google.events.cloud.audit.v1;"
    PACKAGE_STRING="package $PACKAGE;"

    # Replace bad package string with good package string.
    sed -i '' "s/package com.google.events;/${PACKAGE_STRING}/" $FILE
done <<< "$PATHS"



# export SRC="../../../samples/google-cloudevents/jsonschema"

# quicktype \
# --lang java \
# --array-type list \
# --acronym-style camel \
# --package com.google.events \
# --lombok \
# -s schema \
# --out . \
#  --alphabetize-properties \
#  --just-types \
# $SRC/google/events/firebase/database/v1/ReferenceEventData.json \
# $SRC/google/events/firebase/auth/v1/AuthEventData.json \
# $SRC/google/events/firebase/testlab/v1/TestMatrixEventData.json \
# $SRC/google/events/firebase/remoteconfig/v1/RemoteConfigEventData.json \
# $SRC/google/events/firebase/firebasealerts/v1/AlertData.json \
# $SRC/google/events/firebase/analytics/v1/AnalyticsLogData.json \
# $SRC/google/events/cloud/firestore/v1/DocumentEventData.json \
# $SRC/google/events/cloud/cloudbuild/v1/BuildEventData.json \
# $SRC/google/events/cloud/scheduler/v1/SchedulerJobData.json \
# $SRC/google/events/cloud/storage/v1/StorageObjectData.json \
# $SRC/google/events/cloud/iot/v1/RegistryEventData.json \
# $SRC/google/events/cloud/iot/v1/DeviceEventData.json \
# $SRC/google/events/cloud/audit/v1/LogEntryData.json \
# $SRC/google/events/cloud/pubsub/v1/MessagePublishedData.json
 
#  --debug all
      
# <!-- --- -->
#  --[no-]lombok-copy-annotations
#  --no-maps
#  --no-enums \
#  --no-combine-classes \
#   --no-ignore-json-refs \
#   --no-boolean-strings \
#  <!-- ---- -->


#  --datetime-provider java8|legacy                  Date time provider type      

# --no-enums
#  --no-date-times
#   --no-integer-strings
#  --no-integer-strings                                          Don't convert stringified integers to integers.                         
                         
                                            
#  -S, --additional-schema FILE                                  Register the $id's of additional JSON Schema files.                                                


