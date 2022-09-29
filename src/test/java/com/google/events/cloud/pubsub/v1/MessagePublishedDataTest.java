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

package com.google.events.cloud.pubsub.v1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static io.cloudevents.core.CloudEventUtils.mapData;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.events.cloud.audit.v1.LogEntryData;
import com.google.events.cloud.cloudbuild.v1.BuildEventData;
import com.google.events.cloud.firestore.v1.DocumentEventData;
import com.google.events.cloud.scheduler.v1.SchedulerJobData;
import com.google.events.cloud.storage.v1.StorageObjectData;
import com.google.events.firebase.analytics.v1.AnalyticsLogData;
import com.google.events.firebase.auth.v1.AuthEventData;
import com.google.events.firebase.database.v1.ReferenceEventData;
import com.google.events.firebase.remoteconfig.v1.RemoteConfigEventData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;

import io.cloudevents.CloudEvent;
import io.cloudevents.core.builder.CloudEventBuilder;
import io.cloudevents.core.data.PojoCloudEventData;
import io.cloudevents.jackson.PojoCloudEventDataMapper;
import io.grpc.Context.Storage;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.OffsetDateTime;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MessagePublishedDataTest {
  private String decode(String data) throws UnsupportedEncodingException {
    return new String(Base64.getDecoder().decode(data), StandardCharsets.UTF_8.toString());
  }

  // @Test
  // public void test() throws Exception {
  // ObjectMapper objectMapper = new
  // ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
  // false);
  // objectMapper.registerModule(new JavaTimeModule());
  // String file =
  // "/Users/akitsch/code/samples/google-cloudevents/testdata/google/events/cloud/pubsub/v1/MessagePublishedData-text.json";
  // String data = readFileAsString(file);
  // CloudEvent event = CloudEventBuilder.v1().withId("0")
  // .withType("google.storage.object.finalize")
  // .withSource(URI.create("https://example.com"))
  // .withData("application/json", data.getBytes()).build();
  // PojoCloudEventData<MessagePublishedData> cloudEventData = mapData(event,
  // PojoCloudEventDataMapper.from(objectMapper, MessagePublishedData.class));

  // MessagePublishedData message = cloudEventData.getValue();
  // assertTrue(message != null);
  // assertEquals("test message 3", decode(message.getMessage().getData()));
  // }

  // @Test
  // public void test2() throws Exception {
  // class DateDeserializer implements JsonDeserializer<OffsetDateTime> {
  // @Override
  // public OffsetDateTime deserialize(
  // JsonElement json, Type typeOfT, JsonDeserializationContext context)
  // throws JsonParseException {
  // return OffsetDateTime.parse(json.getAsString());
  // }
  // }
  // // Configure Gson with custom deserializer
  // Gson gson = new GsonBuilder()
  // .registerTypeAdapter(OffsetDateTime.class, new DateDeserializer())
  // .create();

  // String file =
  // "/Users/akitsch/code/samples/google-cloudevents/testdata/google/events/cloud/pubsub/v1/MessagePublishedData-text.json";
  // String data = readFileAsString(file);

  // MessagePublishedData message = gson.fromJson(data,
  // MessagePublishedData.class);
  // assertTrue(message != null);
  // assertEquals("test message 3", decode(message.getMessage().getData()));
  // }

  public static String readFileAsString(String file) throws Exception {
    return new String(Files.readAllBytes(Paths.get(file)));
  }

  public List<String> listFiles(String startDir) throws IOException {
    Stream<Path> walk = Files.walk(Paths.get(startDir));
    // We want to find only regular files
    List<String> result = walk.filter(Files::isRegularFile)
        .map(x -> x.toString()).collect(Collectors.toList());

    // result.forEach(System.out::println);
    return result;
  }

  @Test
  public void test3() throws Exception {
    class DateDeserializer implements JsonDeserializer<OffsetDateTime> {
      @Override
      public OffsetDateTime deserialize(
          JsonElement json, Type typeOfT, JsonDeserializationContext context)
          throws JsonParseException {
        return OffsetDateTime.parse(json.getAsString());
      }
    }
    // Configure Gson with custom deserializer
    Gson gson = new GsonBuilder()
        .registerTypeAdapter(OffsetDateTime.class, new DateDeserializer())
        .create();

    ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
        false);
    objectMapper.registerModule(new JavaTimeModule());

    String startDir = "/Users/akitsch/code/samples/google-cloudevents/testdata/";
    List<String> files = listFiles(startDir);
    for (String file : files) {
      String data = readFileAsString(file);
      if (file.contains("README")) {
        break;
      }
      int pre = file.lastIndexOf("/");
      int post = file.lastIndexOf("-");
      String type = file.substring(pre + 1, post);
      System.out.println(type);

      switch (type) {
        case "MessagePublishedData":
          MessagePublishedData message = gson.fromJson(data, MessagePublishedData.class);
          assertTrue(message != null);
          // assertEquals("test message 3", decode(message.getMessage().getData()));
        case "ReferenceEventData":
          ReferenceEventData refData = gson.fromJson(data, ReferenceEventData.class);
        case "AuthEventData":
          AuthEventData authData = gson.fromJson(data, AuthEventData.class);
        case "RemoteConfigEventData":
          try {
            RemoteConfigEventData remoteData = gson.fromJson(data, RemoteConfigEventData.class);
          } catch (JsonSyntaxException e) {
            System.out.println(data);
            System.out.println(e.toString());
          }
        case "AnalyticsLogData":
          AnalyticsLogData analyticsData = gson.fromJson(data, AnalyticsLogData.class);
        case "DocumentEventData":
          DocumentEventData docData = gson.fromJson(data, DocumentEventData.class);
        case "BuildEventData":
          try {
            BuildEventData buildData = gson.fromJson(data, BuildEventData.class);
          } catch (JsonSyntaxException e) {
            System.out.println(data);
            System.out.println(e.toString());
          }
        case "SchedulerJobData":
          SchedulerJobData schData = gson.fromJson(data, SchedulerJobData.class);
        case "StorageObjectData":
          StorageObjectData storage = gson.fromJson(data, StorageObjectData.class);
        case "LogEntryData":
          try {
            LogEntryData logEntry = gson.fromJson(data, LogEntryData.class);
          } catch (JsonSyntaxException e) {
            System.out.println(data);
            System.out.println(e.toString());
          }
        default:
          // System.out.println("default");
      }

      // MessagePublishedData message = gson.fromJson(data,
      // MessagePublishedData.class);
      // assertTrue(message != null);
      // assertEquals("test message 3", decode(message.getMessage().getData()));
    }

  }

}
