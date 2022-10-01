gradle installDist

export PROTO_SRC="/Users/akitsch/code/samples/google-cloudevents/proto/"
export THIRD_P="/Users/akitsch/code/samples/google-cloudevents/third_party/googleapis/"

protoc --plugin=protoc-gen-java-snowpea=build/install/protoc-gen-java-snowpea/bin/protoc-gen-java-snowpea \
-I $PROTO_SRC \
-I $THIRD_P \
--java-snowpea_out . \
$PROTO_SRC/google/events/cloud/audit/v1/data.proto 
# $(find $PROTO_SRC -name "*.proto")