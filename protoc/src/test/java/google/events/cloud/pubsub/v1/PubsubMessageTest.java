package google.events.cloud.pubsub.v1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
// import static io.cloudevents.core.CloudEventUtils.mapData;

// import com.fasterxml.jackson.databind.DeserializationFeature;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
// import io.cloudevents.CloudEvent;
// import io.cloudevents.core.builder.CloudEventBuilder;
// import io.cloudevents.core.data.PojoCloudEventData;
// import io.cloudevents.jackson.PojoCloudEventDataMapper;
import io.grpc.Context.Storage;
import org.junit.Before;
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
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PubsubMessageTest {
    private String decode(String data) throws UnsupportedEncodingException {
        return new String(Base64.getDecoder().decode(data), StandardCharsets.UTF_8.toString());
    }

    public static String readFileAsString(String file) throws Exception {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    public List<String> listFiles(String startDir) throws IOException {
        Stream<Path> walk = Files.walk(Paths.get(startDir));
        List<String> result = walk.filter(Files::isRegularFile).map(x -> x.toString())
                .collect(Collectors.toList());
        return result;
    }

    Gson gson;
    // ObjectMapper objectMapper;
    // ObjectMapper objectMapperStrict;
    String testData = "/Users/akitsch/code/samples/google-cloudevents/testdata/";
    List<String> files;
    List<String> schemas;

    @Before
    public void init() throws Exception {
        // Configure Gson with custom deserializer
        class DateDeserializer implements JsonDeserializer<OffsetDateTime> {
            @Override
            public OffsetDateTime deserialize(JsonElement json, Type typeOfT,
                    JsonDeserializationContext context) throws JsonParseException {
                return OffsetDateTime.parse(json.getAsString());
            }
        }
        gson = new GsonBuilder().registerTypeAdapter(OffsetDateTime.class, new DateDeserializer())
                .create();
        // Configure Jackson's Object Mapper
        // objectMapper =
        // new
        // ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
        // false).configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL,
        // true);
        // objectMapper.registerModule(new JavaTimeModule());
        // objectMapperStrict = new ObjectMapper();
        // objectMapperStrict.registerModule(new JavaTimeModule());
        files = listFiles(testData);

    }

    @Test
    public void test() throws Exception {
        for (String file : files) {
            String data = readFileAsString(file);
            if (file.contains("README")) {
                break;
            }

            // Get Event Type from filename
            int pre = file.lastIndexOf("/");
            int post = file.lastIndexOf("-");
            String type = file.substring(pre + 1, post);
            // System.out.println("Found Event Type: " + type);

            // System.out.printf(
                    // "@Test\npublic void test%s() throws Exception {\n\tfor (String file : getFiles(\"%s\")) {\n\t\tString json = readFileAsString(file);\n\t\t%s.Builder builder = %s.newBuilder();\n\t\tJsonFormat.parser().ignoringUnknownFields().merge(json, builder);\n\t\t%s data = builder.build();\n\t\tassertEquals(\"ok\", data);\n\t}\n}\n\n",
                    // type, type, type, type, type);

            // switch (type) {
            // case "MessagePublishedData":
            // MessagePublishedData messageData = gson.fromJson(data,
            // MessagePublishedData.class);
            // assertTrue(messageData != null);
            // // System.out.println(messageData);
            // // assertEquals("test message 3", decode(message.getMessage().getData()));
            // MessagePublishedData messageData2 = objectMapper.readValue(data,
            // MessagePublishedData.class);
            // // System.out.println(messageData2);
            // break;
            // case "ReferenceEventData":
            // ReferenceEventData refData = gson.fromJson(data, ReferenceEventData.class);
            // break;
            // case "AuthEventData":
            // AuthEventData authData = gson.fromJson(data, AuthEventData.class);
            // break;
            // case "RemoteConfigEventData":
            // try {
            // RemoteConfigEventData remoteData = gson.fromJson(data,
            // RemoteConfigEventData.class);
            // } catch (JsonSyntaxException e) {
            // System.out.println(data);
            // System.out.println(e.toString());
            // }
            // break;
            // case "AnalyticsLogData":
            // AnalyticsLogData analyticsData = gson.fromJson(data, AnalyticsLogData.class);
            // break;
            // case "DocumentEventData":
            // DocumentEventData docData = gson.fromJson(data, DocumentEventData.class);
            // break;
            // case "BuildEventData":
            // try {
            // BuildEventData buildData = gson.fromJson(data, BuildEventData.class);
            // } catch (JsonSyntaxException e) {
            // System.out.println(data);
            // System.out.println(e.toString());
            // }
            // break;
            // case "SchedulerJobData":
            // SchedulerJobData schData = gson.fromJson(data, SchedulerJobData.class);
            // break;
            // case "StorageObjectData":
            // StorageObjectData storage = gson.fromJson(data, StorageObjectData.class);
            // break;
            // case "LogEntryData":
            // try {
            // LogEntryData logEntry = gson.fromJson(data, LogEntryData.class);
            // LogEntryData logEntry2 = objectMapper.readValue(data, LogEntryData.class);
            // // System.out.println(logEntry2);
            // LogEntryData logEntry3 = objectMapperStrict.readValue(data,
            // LogEntryData.class);
            // } catch (Exception e) {
            // // System.out.println(data);
            // System.out.println(e.toString());
            // }
            // break;
            // case "DeviceEventData":
            // DeviceEventData devData = gson.fromJson(data, DeviceEventData.class);
            // break;
            // case "RegsitryEventData":
            // RegistryEventData regData = gson.fromJson(data, RegistryEventData.class);
            // break;
            // case "AlertData":
            // AlertData alertData = gson.fromJson(data, AlertData.class);
            // break;
            // case "TestMatrixEventData":
            // TestMatrixEventData testData = gson.fromJson(data,
            // TestMatrixEventData.class);
            // break;
            // default:
            // System.out.println("Event Type not found.");
            // break;
            // }

        }

    }

}
