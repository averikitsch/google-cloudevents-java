

// package com.google.events;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DescriptorProtos.DescriptorProto;
import com.google.protobuf.DescriptorProtos.EnumDescriptorProto;
import com.google.protobuf.DescriptorProtos.FieldDescriptorProto;
import com.google.protobuf.DescriptorProtos.FileDescriptorProto;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse;

public class MyProtocPlugin {

    public static void main(String[] args) throws IOException, Descriptors.DescriptorValidationException {
        // Plugin receives a serialized CodeGeneratorRequest via stdin
        CodeGeneratorRequest request = CodeGeneratorRequest.parseFrom(System.in);
        CodeGeneratorResponse.Builder response = CodeGeneratorResponse.newBuilder();
        // CodeGeneratorRequest contain FileDescriptorProtos for all the proto files and dependencies
        // Convert the FileDescriptorProtos into FileDescriptor instances,
        // since they are easier to work with. 

        // FileDescriptor Describes a .proto file, including everything defined within. 
        // descriptors for all the messages and file descriptors for all other imported .proto files (dependencies).
        Map<String, Descriptors.FileDescriptor> filesByName = new HashMap<>();

        for (FileDescriptorProto protoFile : request.getProtoFileList()) {
            // The dependencies of fp are provided as strings, we look them up in the map as we are generating it.
            Descriptors.FileDescriptor dependencies[] =
                    protoFile.getDependencyList().stream().map(filesByName::get).toArray(Descriptors.FileDescriptor[]::new);
            // System.out.println(protoFile.getName()); // file name
            // System.out.println("");
            // System.out.println(protoFile.getPackage()); // package
            // System.out.println("deps");
            // System.out.println(protoFile.getDependencyList()); // list of dep proto files
            // System.out.println("enum");
            // System.out.println(protoFile.getEnumTypeList());
            // System.out.println("msgs");
            // System.out.println(protoFile.getMessageTypeList());
            // System.out.println("");
            
            System.out.println(protoFile.getDescriptor());
            for (Descriptors.FileDescriptor value : dependencies) {
                System.out.println(value.toString());
            }
            // Descriptors.FileDescriptor fd  = Descriptors.FileDescriptor.buildFrom(protoFile, dependencies);
            // System.out.println(fd);
            // filesByName.put(
            //         fp.getName(),
            //         fd
            // );
        }

        // Building the response

        // Serialize the response to stdout
        // response.build().writeTo(System.out);
    }
    private static String generateFileContent(DescriptorProto message, String packageName) throws IOException {
        StringBuilder sb = new StringBuilder();
        generateMessage(sb, message);

        return sb.toString();
    }
    // private static String generateFileContent(Descriptors.FileDescriptor fd, String packageName) throws IOException {
    //     StringBuilder sb = new StringBuilder();
    //     for (Descriptors.Descriptor messageType : fd.getMessageTypes()) {
    //         generateMessage(sb, messageType, packageName);
    //     }
    //     return sb.toString();
    // }
    // for (DescriptorProto message : protoFile.getMessageTypeList()) {
    //     String content = generateFileContent(message, protoFile.getPackage());
    //     String fullPath = protoFile.getName().replaceAll("data",  message.getName()).replaceAll("\\.proto$", ".java");
    //     if (saved.get(fullPath) == null) {
    //         saved.put(fullPath, true);
    //         response.addFileBuilder()
    //             .setName(fullPath)
    //             .setContent("package " + protoFile.getPackage() + ";\n" + content);
    //     }
    //     // messagesByName.put(
    //     //     message.getName(),
    //     //     fd
    //     // );
    // }

    private static String renderType(FieldDescriptorProto fd) {
        if (fd.getLabel().equals(FieldDescriptorProto.Label.LABEL_REQUIRED_VALUE)) {
            return "List<" + renderSingleType(fd) + ">";
        } else {
            return renderSingleType(fd);
        }
    }

    private static String renderSingleType(FieldDescriptorProto fd) {
        if (fd.getType() != FieldDescriptorProto.Type.TYPE_MESSAGE) {
            return Descriptors.FieldDescriptor.Type.valueOf(fd.getType()).getJavaType().toString();
        } else {
            return fd.getTypeName();
        }
    }

    private static void generateMessage(StringBuilder sb, DescriptorProto message) throws IOException {
    // private static void generateMessage(StringBuilder sb, Descriptors.Descriptor messageType, String packageName) throws IOException {
 
        String className = message.getName();

        List<String> fields = message.getFieldList()
                                .stream()
                                .map(field -> renderType(field) + " " + field.getName())
                                .collect(Collectors.toList());
      
        sb.append(getTemplate(className, fields));
        // recurse for nested messages.
        // sb.append(String.join("", Collections.nCopies(indent, " ")));
        for (DescriptorProto nestedType : message.getNestedTypeList()) {
            generateMessage(sb, nestedType);
        }
        // sb.append(getTemplate(packageName, className, fields));
        sb.append("}");
    }

    public static String getTemplate( String className, List<String> fields) throws IOException {
        String inputTemplate = "./src/main/resources/classTemplate.vm";
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.init();

        VelocityContext context = new VelocityContext();
        // context.put("packageName", packageName);
        context.put("className", className);
        context.put("fields", fields);

        StringWriter writer = new StringWriter();
        Velocity.mergeTemplate(inputTemplate, "UTF-8", context, writer);
        return writer.toString();
    }
    
}