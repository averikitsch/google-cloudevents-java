package com.google.events;

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

public class Plugin {

    public static void main(String[] args) throws IOException, Descriptors.DescriptorValidationException {
        // Plugin receives a serialized CodeGeneratorRequest via stdin
        CodeGeneratorRequest request = CodeGeneratorRequest.parseFrom(System.in);
        CodeGeneratorResponse.Builder response = CodeGeneratorResponse.newBuilder();
        // CodeGeneratorRequest contain FileDescriptorProtos for all the proto files we need to process
        // as well as their dependencies.  We want to convert the FileDescriptorProtos into FileDescriptor instances,
        // since they are easier to work with. We will build a map that maps file names to the corresponding file
        // descriptor.
        Map<String, Descriptors.FileDescriptor> filesByName = new HashMap<>();

        Map<String, Boolean> saved = new HashMap<>();

        for (FileDescriptorProto protoFile : request.getProtoFileList()) {
            for (DescriptorProto message : protoFile.getMessageTypeList()) {
                String content = generateFileContent(message, protoFile.getPackage());
                String fullPath = protoFile.getName().replaceAll("data",  message.getName()).replaceAll("\\.proto$", ".java");
                if (saved.get(fullPath) == null) {
                    saved.put(fullPath, true);
                    response.addFileBuilder()
                        .setName(fullPath)
                        .setContent("package " + protoFile.getPackage() + ";\n" + content);
                }
                // messagesByName.put(
                //     message.getName(),
                //     fd
                // );
            }
        }

        // Building the response
        // CodeGeneratorResponse.Builder response = CodeGeneratorResponse.newBuilder();

        // for (String fileName : request.getFileToGenerateList()) {
        //     Descriptors.FileDescriptor fd = filesByName.get(fileName);
        //     // for (DescriptorProto message : messages) {
        //         //                 String fullPath = proto.getName().replace("data", message.getName())
        //         //                         .replaceAll("\\.proto$", ".java");
        //     String content = generateFileContent(fd, fd.getPackage());
        //     // System.out.println(content);
        //     System.out.println("mee" +fd.getFullName().replaceAll("\\.proto$", ".java"));
        //     response.addFileBuilder()
        //             .setName(fd.getFullName().replaceAll("\\.proto$", ".java"))
        //             .setContent(content);
        // }

        // Serialize the response to stdout
        response.build().writeTo(System.out);
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

//     public static void main(String[] args) throws IOException {
//         CodeGeneratorRequest request = CodeGeneratorRequest.parseFrom(System.in);
//         List<FileDescriptorProto> protos = request.getProtoFileList()
//         Map<String, Boolean> saved = new HashMap<>();

//         CodeGeneratorResponse.Builder response = CodeGeneratorResponse.newBuilder();
//         for (FileDescriptorProto proto : protos) {
//             String packageName = proto.getPackage();
//             List<EnumDescriptorProto> enums = proto.getEnumTypeList();
//             // files.put(proto.getName(), proto.getMessageTypeList());
//             List<DescriptorProto> messages = proto.getMessageTypeList();
//             for (DescriptorProto message : messages) {
//                 String fullPath = proto.getName().replace("data", message.getName())
//                         .replaceAll("\\.proto$", ".java");
//                 String tmp = generateClass(message, packageName);
//                 // System.out.println(tmp);
//                 if (saved.get(fullPath) == null) {
//                     saved.put(fullPath, true);
//                     response.addFileBuilder() // uppercasae name and fix regex
//                             .setName(fullPath).setContent(tmp); //
//                 }
//             }
//             // for (EnumDescriptorProto enumProto : enums) {
//             //     String fullPath = proto.getName().replace("data", enumProto.getName())
//             //             .replaceAll("\\.proto$", ".java");
//             //     if (saved.get(fullPath) == null) {
//             //         response.addFileBuilder() // uppercasae name and fix regex
//             //                 .setName(fullPath).setContent(generateEnum(enumProto, packageName));
//             //     }
//             // }
//             // String name = message.getName();

//             // Map<FieldDescriptor, Object> fields = message.getAllFields();
//             // messages.put(name, message);

//             // }
//             // filesByName.put(
//             // proto.getName(),
//             // fd
//             // );

//         }


//         response.build().writeTo(System.out);
//     }

//     public static String generateClass(DescriptorProto message, String packageName) throws IOException {
//         return getTemplate(packageName, message.getName(), message);
//         // "package " + packageName + ";\n" + "\n" + "public class " + message.getName()
//         //         + " {\n" + "\n" + message.getAllFields().toString();
//     }

//     public static String generateEnum(EnumDescriptorProto enumP, String packageName) {
//         return "package " + packageName + ";\n" + "\n" + "public enum " + enumP.getName() + " {\n"
//                 + "\n" + enumP.getAllFields().toString();
//     }

//     public static String getFields(DescriptorProto message) {
//         Map<FieldDescriptor, Object> fields = message.getAllFields();
//         // for (fields.get(fields))
//         return "";
//     }

    
// }
