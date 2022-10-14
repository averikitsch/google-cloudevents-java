
export PROTOC_OUT="./src/main/java/"
rm -r $PROTOC_OUT
mkdir -p $PROTOC_OUT
export TEST_GEN_OUT="./src/test/java/"
rm -r $TEST_GEN_OUT
mkdir -p $TEST_GEN_OUT

# "Checkout" google-cloudevents
export PROTOBUF_SRC="/Users/akitsch/code/samples/google-cloudevents/proto"
export THIRDPARTY="/Users/akitsch/code/samples/google-cloudevents/third_party/googleapis"
export current=$(pwd)
cd /Users/akitsch/code/samples/google-cloudevents
git restore --staged $PROTOBUF_SRC $THIRDPARTY
git restore $PROTOBUF_SRC $THIRDPARTY
git clean -f
cd $current

# Setup monitored resource proto
echo "\noption java_multiple_files = true;\noption java_outer_classname = \"MonitoredResourceProto\";\noption java_package = \"com.google.api\";" >> $(find $THIRDPARTY -name "monitored_resource.proto")

# Run protoc on protos
for file in $(find $PROTOBUF_SRC -name "*.proto")
do
    if [[ ($file != *"events.proto"*) && ($file != *"cloudevent.proto"*) ]]; then
        sed -i '.bak' 's/option java/\/\/option java/' $file
        echo "\noption java_multiple_files = true;" >> $file
        # sed -i '.bak' 's/google.api.MonitoredResource/com.google.api.MonitoredResource/' $file
        # sed -i '.bak' 's/google.events/com.google.events/' $file

        protoc -I=$PROTOBUF_SRC -I=$THIRDPARTY \
        --java_out=$PROTOC_OUT \
        $file
    
    fi
done

# for file in $(find $PROTOC_OUT -name "*.java")
# do
#     sed -i '.bak' 's/google\.events\./com\.google\.events\./g' $file 
#     sed -i '.bak' 's|google\/events\/|com/google/events/|g' $file 
#     sed -i '.bak' 's/google_events_/com_google_events_/g' $file 
#     # may need better regex for safety
# done
# Format generated code
# mvn net.revelc.code.formatter:formatter-maven-plugin:2.19.0:format

# Generate Tests
cd protoc-gen-java-snowpea
gradle installDist
cd $current

protoc --plugin=protoc-gen-java-snowpea=protoc-gen-java-snowpea/build/install/protoc-gen-java-snowpea/bin/protoc-gen-java-snowpea \
-I $PROTOBUF_SRC \
-I $THIRDPARTY \
--java-snowpea_out $TEST_GEN_OUT \
--experimental_allow_proto3_optional \
$(find $PROTOBUF_SRC/ -name "*.proto")