/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package google.events.cloud.pubsub.v1;

import static org.junit.Assert.assertEquals;

import com.google.protobuf.util.JsonFormat;
import google.events.cloud.audit.v1.LogEntryData;
import google.events.cloud.cloudbuild.v1.BuildEventData;
import google.events.cloud.scheduler.v1.SchedulerJobData;
import google.events.cloud.storage.v1.StorageObjectData;
import google.events.firebase.analytics.v1.AnalyticsLogData;
import google.events.firebase.auth.v1.AuthEventData;
import google.events.firebase.database.v1.ReferenceEventData;
import google.events.firebase.remoteconfig.v1.RemoteConfigEventData;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;

public class MessagePublishedDataTest {

  String testData = "/Users/akitsch/code/samples/google-cloudevents/testdata/";
  List<String> files;

  public static String readFileAsString(String file) throws Exception {
    return new String(Files.readAllBytes(Paths.get(file)));
  }

  public List<String> listFiles(String startDir) throws IOException {
    Stream<Path> walk = Files.walk(Paths.get(startDir));
    List<String> result =
        walk.filter(Files::isRegularFile).map(x -> x.toString()).collect(Collectors.toList());
    return result;
  }

  public List<String> getFiles(String eventType) throws IOException {
    Stream<Path> walk = Files.walk(Paths.get(testData));
    List<String> result =
        walk.filter(Files::isRegularFile).map(x -> x.toString()).collect(Collectors.toList());
    return result.stream().filter(file -> file.contains(eventType)).collect(Collectors.toList());
  }

  @Test
  public void testReferenceEventData() throws Exception {
    for (String file : getFiles("ReferenceEventData")) {
      String json = readFileAsString(file);
      ReferenceEventData.Builder builder = ReferenceEventData.newBuilder();
      JsonFormat.parser().merge(json, builder);
      ReferenceEventData data = builder.build();
      assert (data.getDelta() != null);
      assert (data.getData().toString() != null);
    }
  }

  @Test
  public void testAuthEventData() throws Exception {
    for (String file : getFiles("AuthEventData")) {
      String json = readFileAsString(file);
      AuthEventData.Builder builder = AuthEventData.newBuilder();
      JsonFormat.parser().merge(json, builder);
      AuthEventData data = builder.build();
      assertEquals("test@nowhere.com", data.getEmail());
      assert (data.getMetadata().getCreateTime().toString() != null);
    }
  }

  @Test
  public void testRemoteConfigEventData() throws Exception {
    for (String file : getFiles("RemoteConfigEventData")) {
      String json = readFileAsString(file);
      RemoteConfigEventData.Builder builder = RemoteConfigEventData.newBuilder();
      JsonFormat.parser().merge(json, builder);
      RemoteConfigEventData data = builder.build();
      assert (data.getDescription() != null);
      assert (data.getUpdateType().toString() != null);
    }
  }

  @Test
  public void testAnalyticsLogData() throws Exception {
    for (String file : getFiles("AnalyticsLogData")) {
      String json = readFileAsString(file);
      AnalyticsLogData.Builder builder = AnalyticsLogData.newBuilder();
      JsonFormat.parser().merge(json, builder);
      AnalyticsLogData data = builder.build();
      assertEquals(1, data.getEventDimCount());
    }
  }

  @Test
  public void testBuildEventData() throws Exception {
    for (String file : getFiles("BuildEventData")) {
      String json = readFileAsString(file);
      BuildEventData.Builder builder = BuildEventData.newBuilder();
      JsonFormat.parser().merge(json, builder);
      BuildEventData data = builder.build();
      assertEquals("cupidatat", data.getBuildTriggerId());
      assert (data.getArtifacts().getImagesCount() >= 0);
    }
  }

  @Test
  public void testSchedulerJobData() throws Exception {
    for (String file : getFiles("SchedulerJobData")) {
      String json = readFileAsString(file);
      SchedulerJobData.Builder builder = SchedulerJobData.newBuilder();
      JsonFormat.parser().merge(json, builder);
      SchedulerJobData data = builder.build();
      assertEquals("my base64 data", data.getCustomData().toStringUtf8());
    }
  }

  @Test
  public void testStorageObjectData() throws Exception {
    for (String file : getFiles("StorageObjectData")) {
      String json = readFileAsString(file);
      StorageObjectData.Builder builder = StorageObjectData.newBuilder();
      JsonFormat.parser().merge(json, builder);
      StorageObjectData data = builder.build();
      assert (data.getBucket().contains("-bucket"));
    }
  }

  @Test
  public void testLogEntryData() throws Exception {
    for (String file : getFiles("LogEntryData")) {
      String json = readFileAsString(file);
      LogEntryData.Builder builder = LogEntryData.newBuilder();
      JsonFormat.parser().ignoringUnknownFields().merge(json, builder);
      LogEntryData data = builder.build();
      assert (data.getLogName().contains("projects/test-project/logs/cloudaudit.googleapis.com"));
      assertEquals(
          "robot@test-project.iam.gserviceaccount.com",
          data.getProtoPayload().getAuthenticationInfo().getPrincipalEmail());
    }
  }

  @Test
  public void testMessagePublishedData() throws Exception {
    for (String file : getFiles("MessagePublishedData")) {
      String json = readFileAsString(file);
      MessagePublishedData.Builder builder = MessagePublishedData.newBuilder();
      JsonFormat.parser().ignoringUnknownFields().merge(json, builder);
      MessagePublishedData data = builder.build();
      assertEquals("projects/my-project/subscriptions/my-subscription", data.getSubscription());
      assert (data.getMessage().getData().toString() != null);
    }
  }
}
