|- MessagePublishedData(message: PubsubMessage, subscription: STRING)
|- PubsubMessage(data: BYTES, attributes: List<AttributesEntry>, message_id: STRING, publish_time: Timestamp, ordering_key: STRING)
   |- AttributesEntry(key: STRING, value: STRING)
   