package google.events.cloud.pubsub.v1;
public class PubsubMessage {
    BYTE_STRING data;
    .google.events.cloud.pubsub.v1.PubsubMessage.AttributesEntry attributes;
    STRING message_id;
    .google.protobuf.Timestamp publish_time;
    STRING ordering_key;
public class AttributesEntry {
    STRING key;
    STRING value;
}}