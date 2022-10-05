rm -r google/
gradle installDist

export PROTO_SRC="/Users/akitsch/code/samples/google-cloudevents/proto/"
export THIRD_P="/Users/akitsch/code/samples/google-cloudevents/third_party/googleapis/"

protoc --plugin=protoc-gen-java-snowpea=build/install/protoc-gen-java-snowpea/bin/protoc-gen-java-snowpea \
-I $PROTO_SRC \
-I $THIRD_P \
--java-snowpea_out . \
$(find $PROTO_SRC/google/events/cloud/pubsub/ -name "*.proto")
# # $PROTO_SRC/google/events/cloud/pubsub/v1/data.proto 


# protoc --plugin=protoc-gen-example=../../../test_projects/protoc-plugin-in-java/build/install/myplugin/bin/myplugin \
# -I $PROTO_SRC \
# -I $THIRD_P \
# --example_out . \
# $(find $PROTO_SRC/google/events/cloud/pubsub/ -name "*.proto")
# $PROTO_SRC/google/events/cloud/pubsub/v1/data.proto 