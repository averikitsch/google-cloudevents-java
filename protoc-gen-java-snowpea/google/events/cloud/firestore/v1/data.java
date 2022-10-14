|- DocumentEventData(value: Document, old_value: Document, update_mask: DocumentMask)
|- DocumentMask(field_paths: List<STRING>)
|- Document(name: STRING, fields: List<FieldsEntry>, create_time: Timestamp, update_time: Timestamp)
   |- FieldsEntry(key: STRING, value: Value)
   |- Value(null_value: ENUM, boolean_value: BOOL, integer_value: INT64, double_value: DOUBLE, timestamp_value: Timestamp, string_value: STRING, bytes_value: BYTES, reference_value: STRING, geo_point_value: LatLng, array_value: ArrayValue, map_value: MapValue)
|- ArrayValue(values: List<Value>)
|- MapValue(fields: List<FieldsEntry>)
   |- FieldsEntry(key: STRING, value: Value)
   