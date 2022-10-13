# rm -r protoc-out/src/main/java/
# rm -r protoc-lite/src/main/java/

# mkdir -p protoc-out/src/main/java/
# mkdir -p protoc-lite/src/main/java/
export PROTOC_SRC="./protoc/src/main/java/"
export LITE_SRC="./protoc-lite/src/main/java/"

rm -r $PROTOC_SRC
rm -r $LITE_SRC
mkdir -p $PROTOC_SRC
mkdir -p $LITE_SRC

# Generate protoc
export PROTOBUF_SRC="/Users/akitsch/code/samples/google-cloudevents/proto"
export THIRDPARTY="/Users/akitsch/code/samples/google-cloudevents/third_party/googleapis"
export current=$(pwd)
cd /Users/akitsch/code/samples/google-cloudevents
git restore --staged $PROTOBUF_SRC $THIRDPARTY
git restore $PROTOBUF_SRC $THIRDPARTY
git clean -f
cd $current

# --- RUN once
# for file in $(find $THIRDPARTY/google/api -name "*.proto")
# do
#     # sed -i '.bak' 's/option java/\/\/option java/' $file
#     echo "\noption java_multiple_files = true;" >> $file
# done

echo "\noption java_multiple_files = true;\noption java_outer_classname = \"MonitoredResourceProto\";\noption java_package = \"com.google.api\";" >> $(find $THIRDPARTY -name "monitored_resource.proto")
# option java_outer_classname = \"MonitoredResourceProto\";
# option java_package = \"com.google.api\";

# sed -i '.bak' 's/google.api/com.google.api/' $(find $THIRDPARTY -name "monitored_resource.proto")
# sed -i '.bak' 's/google.api/com.google.api/' /Users/akitsch/code/samples/google-cloudevents/proto/google/events/cloud/audit/v1/data.proto

for file in $(find $PROTOBUF_SRC -name "*.proto")
do
    if [[ ($file != *"events.proto"*) && ($file != *"cloudevent.proto"*) ]]; then
        sed -i '.bak' 's/option java/\/\/option java/' $file
        echo "\noption java_multiple_files = true;" >> $file
        # sed -i '.bak' 's/google.api.MonitoredResource/com.google.api.MonitoredResource/' $file
        # sed -i '.bak' 's/google.events/com.google.events/' $file

        protoc -I=$PROTOBUF_SRC -I=$THIRDPARTY \
        --java_out=$PROTOC_SRC \
        $file
    
    fi
done
# for file in $(find $PROTOC_SRC -name "*.java")
# do
#     sed -i '.bak' 's/google.api/com.google.api/g' $file
# done
        # echo "\noption optimize_for = LITE_RUNTIME;" >> $file

        # protoc -I=$PROTOBUF_SRC -I=$THIRDPARTY \
        # --java_out=lite:$LITE_SRC \
        # $file



# cd java-lib/
# mvn formatter:format

# option java_multiple_files = true;
# option java_outer_classname = "Foo";
# package foo.bar;
# option java_package = "com.example.foo.bar";
# option java_generic_services = false; ??