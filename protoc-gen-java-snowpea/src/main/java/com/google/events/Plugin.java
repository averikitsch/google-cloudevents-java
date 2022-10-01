package com.google.events;

import java.io.IOException;
import java.util.List;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DescriptorProtos.FileDescriptorProto;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse;

public class Plugin {
    public static void main(String[] args) throws IOException {
        CodeGeneratorRequest request = CodeGeneratorRequest.parseFrom(System.in);
        List<FileDescriptorProto>  protos = request.getProtoFileList();
        // protos.stream().forEach(System.out::println);
        // request.getFileToGenerateList();
        for (FileDescriptorProto proto : protos) {
            System.out.println("namee: " + proto.getName());
            System.out.println("packagee: " + proto.getPackage());
            // System.out.println("");
            // System.out.println("");
            System.out.println("listt: " + proto.getMessageTypeList());
        }
        // CodeGeneratorResponse.Builder response = CodeGeneratorResponse.newBuilder();
        // for (String fileName : request.getFileToGenerateList()) {

        //     response.addFileBuilder()
        //             .setName("")
        //             .setContent("");
        // }
        // response.build().writeTo(System.out);
    }
}
