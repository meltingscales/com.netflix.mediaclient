package com.google.protobuf;

import androidx.appcompat.widget.ActivityChooserModel;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.linphone.core.Privacy;

/* loaded from: classes2.dex */
public final class DescriptorProtos {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n google/protobuf/descriptor.proto\u0012\u000fgoogle.protobuf\"M\n\u0011FileDescriptorSet\u00128\n\u0004file\u0018\u0001 \u0003(\u000b2$.google.protobuf.FileDescriptorProtoR\u0004file\"\u0098\u0005\n\u0013FileDescriptorProto\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012\u0018\n\u0007package\u0018\u0002 \u0001(\tR\u0007package\u0012\u001e\n\ndependency\u0018\u0003 \u0003(\tR\ndependency\u0012+\n\u0011public_dependency\u0018\n \u0003(\u0005R\u0010publicDependency\u0012'\n\u000fweak_dependency\u0018\u000b \u0003(\u0005R\u000eweakDependency\u0012C\n\fmessage_type\u0018\u0004 \u0003(\u000b2 .google.protobuf.DescriptorProtoR\u000bmessageType\u0012A\n\tenum_type\u0018\u0005 \u0003(\u000b2$.google.protobuf.EnumDescriptorProtoR\benumType\u0012A\n\u0007service\u0018\u0006 \u0003(\u000b2'.google.protobuf.ServiceDescriptorProtoR\u0007service\u0012C\n\textension\u0018\u0007 \u0003(\u000b2%.google.protobuf.FieldDescriptorProtoR\textension\u00126\n\u0007options\u0018\b \u0001(\u000b2\u001c.google.protobuf.FileOptionsR\u0007options\u0012I\n\u0010source_code_info\u0018\t \u0001(\u000b2\u001f.google.protobuf.SourceCodeInfoR\u000esourceCodeInfo\u0012\u0016\n\u0006syntax\u0018\f \u0001(\tR\u0006syntax\u00122\n\u0007edition\u0018\u000e \u0001(\u000e2\u0018.google.protobuf.EditionR\u0007edition\"¹\u0006\n\u000fDescriptorProto\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012;\n\u0005field\u0018\u0002 \u0003(\u000b2%.google.protobuf.FieldDescriptorProtoR\u0005field\u0012C\n\textension\u0018\u0006 \u0003(\u000b2%.google.protobuf.FieldDescriptorProtoR\textension\u0012A\n\u000bnested_type\u0018\u0003 \u0003(\u000b2 .google.protobuf.DescriptorProtoR\nnestedType\u0012A\n\tenum_type\u0018\u0004 \u0003(\u000b2$.google.protobuf.EnumDescriptorProtoR\benumType\u0012X\n\u000fextension_range\u0018\u0005 \u0003(\u000b2/.google.protobuf.DescriptorProto.ExtensionRangeR\u000eextensionRange\u0012D\n\noneof_decl\u0018\b \u0003(\u000b2%.google.protobuf.OneofDescriptorProtoR\toneofDecl\u00129\n\u0007options\u0018\u0007 \u0001(\u000b2\u001f.google.protobuf.MessageOptionsR\u0007options\u0012U\n\u000ereserved_range\u0018\t \u0003(\u000b2..google.protobuf.DescriptorProto.ReservedRangeR\rreservedRange\u0012#\n\rreserved_name\u0018\n \u0003(\tR\freservedName\u001az\n\u000eExtensionRange\u0012\u0014\n\u0005start\u0018\u0001 \u0001(\u0005R\u0005start\u0012\u0010\n\u0003end\u0018\u0002 \u0001(\u0005R\u0003end\u0012@\n\u0007options\u0018\u0003 \u0001(\u000b2&.google.protobuf.ExtensionRangeOptionsR\u0007options\u001a7\n\rReservedRange\u0012\u0014\n\u0005start\u0018\u0001 \u0001(\u0005R\u0005start\u0012\u0010\n\u0003end\u0018\u0002 \u0001(\u0005R\u0003end\"Ç\u0004\n\u0015ExtensionRangeOptions\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption\u0012Y\n\u000bdeclaration\u0018\u0002 \u0003(\u000b22.google.protobuf.ExtensionRangeOptions.DeclarationB\u0003\u0088\u0001\u0002R\u000bdeclaration\u00127\n\bfeatures\u00182 \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012h\n\fverification\u0018\u0003 \u0001(\u000e28.google.protobuf.ExtensionRangeOptions.VerificationState:\nUNVERIFIEDR\fverification\u001a\u0094\u0001\n\u000bDeclaration\u0012\u0016\n\u0006number\u0018\u0001 \u0001(\u0005R\u0006number\u0012\u001b\n\tfull_name\u0018\u0002 \u0001(\tR\bfullName\u0012\u0012\n\u0004type\u0018\u0003 \u0001(\tR\u0004type\u0012\u001a\n\breserved\u0018\u0005 \u0001(\bR\breserved\u0012\u001a\n\brepeated\u0018\u0006 \u0001(\bR\brepeatedJ\u0004\b\u0004\u0010\u0005\"4\n\u0011VerificationState\u0012\u000f\n\u000bDECLARATION\u0010\u0000\u0012\u000e\n\nUNVERIFIED\u0010\u0001*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"Á\u0006\n\u0014FieldDescriptorProto\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012\u0016\n\u0006number\u0018\u0003 \u0001(\u0005R\u0006number\u0012A\n\u0005label\u0018\u0004 \u0001(\u000e2+.google.protobuf.FieldDescriptorProto.LabelR\u0005label\u0012>\n\u0004type\u0018\u0005 \u0001(\u000e2*.google.protobuf.FieldDescriptorProto.TypeR\u0004type\u0012\u001b\n\ttype_name\u0018\u0006 \u0001(\tR\btypeName\u0012\u001a\n\bextendee\u0018\u0002 \u0001(\tR\bextendee\u0012#\n\rdefault_value\u0018\u0007 \u0001(\tR\fdefaultValue\u0012\u001f\n\u000boneof_index\u0018\t \u0001(\u0005R\noneofIndex\u0012\u001b\n\tjson_name\u0018\n \u0001(\tR\bjsonName\u00127\n\u0007options\u0018\b \u0001(\u000b2\u001d.google.protobuf.FieldOptionsR\u0007options\u0012'\n\u000fproto3_optional\u0018\u0011 \u0001(\bR\u000eproto3Optional\"¶\u0002\n\u0004Type\u0012\u000f\n\u000bTYPE_DOUBLE\u0010\u0001\u0012\u000e\n\nTYPE_FLOAT\u0010\u0002\u0012\u000e\n\nTYPE_INT64\u0010\u0003\u0012\u000f\n\u000bTYPE_UINT64\u0010\u0004\u0012\u000e\n\nTYPE_INT32\u0010\u0005\u0012\u0010\n\fTYPE_FIXED64\u0010\u0006\u0012\u0010\n\fTYPE_FIXED32\u0010\u0007\u0012\r\n\tTYPE_BOOL\u0010\b\u0012\u000f\n\u000bTYPE_STRING\u0010\t\u0012\u000e\n\nTYPE_GROUP\u0010\n\u0012\u0010\n\fTYPE_MESSAGE\u0010\u000b\u0012\u000e\n\nTYPE_BYTES\u0010\f\u0012\u000f\n\u000bTYPE_UINT32\u0010\r\u0012\r\n\tTYPE_ENUM\u0010\u000e\u0012\u0011\n\rTYPE_SFIXED32\u0010\u000f\u0012\u0011\n\rTYPE_SFIXED64\u0010\u0010\u0012\u000f\n\u000bTYPE_SINT32\u0010\u0011\u0012\u000f\n\u000bTYPE_SINT64\u0010\u0012\"C\n\u0005Label\u0012\u0012\n\u000eLABEL_OPTIONAL\u0010\u0001\u0012\u0012\n\u000eLABEL_REPEATED\u0010\u0003\u0012\u0012\n\u000eLABEL_REQUIRED\u0010\u0002\"c\n\u0014OneofDescriptorProto\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u00127\n\u0007options\u0018\u0002 \u0001(\u000b2\u001d.google.protobuf.OneofOptionsR\u0007options\"ã\u0002\n\u0013EnumDescriptorProto\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012?\n\u0005value\u0018\u0002 \u0003(\u000b2).google.protobuf.EnumValueDescriptorProtoR\u0005value\u00126\n\u0007options\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.EnumOptionsR\u0007options\u0012]\n\u000ereserved_range\u0018\u0004 \u0003(\u000b26.google.protobuf.EnumDescriptorProto.EnumReservedRangeR\rreservedRange\u0012#\n\rreserved_name\u0018\u0005 \u0003(\tR\freservedName\u001a;\n\u0011EnumReservedRange\u0012\u0014\n\u0005start\u0018\u0001 \u0001(\u0005R\u0005start\u0012\u0010\n\u0003end\u0018\u0002 \u0001(\u0005R\u0003end\"\u0083\u0001\n\u0018EnumValueDescriptorProto\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012\u0016\n\u0006number\u0018\u0002 \u0001(\u0005R\u0006number\u0012;\n\u0007options\u0018\u0003 \u0001(\u000b2!.google.protobuf.EnumValueOptionsR\u0007options\"§\u0001\n\u0016ServiceDescriptorProto\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012>\n\u0006method\u0018\u0002 \u0003(\u000b2&.google.protobuf.MethodDescriptorProtoR\u0006method\u00129\n\u0007options\u0018\u0003 \u0001(\u000b2\u001f.google.protobuf.ServiceOptionsR\u0007options\"\u0089\u0002\n\u0015MethodDescriptorProto\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012\u001d\n\ninput_type\u0018\u0002 \u0001(\tR\tinputType\u0012\u001f\n\u000boutput_type\u0018\u0003 \u0001(\tR\noutputType\u00128\n\u0007options\u0018\u0004 \u0001(\u000b2\u001e.google.protobuf.MethodOptionsR\u0007options\u00120\n\u0010client_streaming\u0018\u0005 \u0001(\b:\u0005falseR\u000fclientStreaming\u00120\n\u0010server_streaming\u0018\u0006 \u0001(\b:\u0005falseR\u000fserverStreaming\"Ê\t\n\u000bFileOptions\u0012!\n\fjava_package\u0018\u0001 \u0001(\tR\u000bjavaPackage\u00120\n\u0014java_outer_classname\u0018\b \u0001(\tR\u0012javaOuterClassname\u00125\n\u0013java_multiple_files\u0018\n \u0001(\b:\u0005falseR\u0011javaMultipleFiles\u0012D\n\u001djava_generate_equals_and_hash\u0018\u0014 \u0001(\bB\u0002\u0018\u0001R\u0019javaGenerateEqualsAndHash\u0012:\n\u0016java_string_check_utf8\u0018\u001b \u0001(\b:\u0005falseR\u0013javaStringCheckUtf8\u0012S\n\foptimize_for\u0018\t \u0001(\u000e2).google.protobuf.FileOptions.OptimizeMode:\u0005SPEEDR\u000boptimizeFor\u0012\u001d\n\ngo_package\u0018\u000b \u0001(\tR\tgoPackage\u00125\n\u0013cc_generic_services\u0018\u0010 \u0001(\b:\u0005falseR\u0011ccGenericServices\u00129\n\u0015java_generic_services\u0018\u0011 \u0001(\b:\u0005falseR\u0013javaGenericServices\u00125\n\u0013py_generic_services\u0018\u0012 \u0001(\b:\u0005falseR\u0011pyGenericServices\u00127\n\u0014php_generic_services\u0018* \u0001(\b:\u0005falseR\u0012phpGenericServices\u0012%\n\ndeprecated\u0018\u0017 \u0001(\b:\u0005falseR\ndeprecated\u0012.\n\u0010cc_enable_arenas\u0018\u001f \u0001(\b:\u0004trueR\u000eccEnableArenas\u0012*\n\u0011objc_class_prefix\u0018$ \u0001(\tR\u000fobjcClassPrefix\u0012)\n\u0010csharp_namespace\u0018% \u0001(\tR\u000fcsharpNamespace\u0012!\n\fswift_prefix\u0018' \u0001(\tR\u000bswiftPrefix\u0012(\n\u0010php_class_prefix\u0018( \u0001(\tR\u000ephpClassPrefix\u0012#\n\rphp_namespace\u0018) \u0001(\tR\fphpNamespace\u00124\n\u0016php_metadata_namespace\u0018, \u0001(\tR\u0014phpMetadataNamespace\u0012!\n\fruby_package\u0018- \u0001(\tR\u000brubyPackage\u00127\n\bfeatures\u00182 \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption\":\n\fOptimizeMode\u0012\t\n\u0005SPEED\u0010\u0001\u0012\r\n\tCODE_SIZE\u0010\u0002\u0012\u0010\n\fLITE_RUNTIME\u0010\u0003*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b&\u0010'\"ô\u0003\n\u000eMessageOptions\u0012<\n\u0017message_set_wire_format\u0018\u0001 \u0001(\b:\u0005falseR\u0014messageSetWireFormat\u0012L\n\u001fno_standard_descriptor_accessor\u0018\u0002 \u0001(\b:\u0005falseR\u001cnoStandardDescriptorAccessor\u0012%\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005falseR\ndeprecated\u0012\u001b\n\tmap_entry\u0018\u0007 \u0001(\bR\bmapEntry\u0012V\n&deprecated_legacy_json_field_conflicts\u0018\u000b \u0001(\bB\u0002\u0018\u0001R\"deprecatedLegacyJsonFieldConflicts\u00127\n\bfeatures\u0018\f \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\u0004\u0010\u0005J\u0004\b\u0005\u0010\u0006J\u0004\b\u0006\u0010\u0007J\u0004\b\b\u0010\tJ\u0004\b\t\u0010\n\"\u00ad\n\n\fFieldOptions\u0012A\n\u0005ctype\u0018\u0001 \u0001(\u000e2#.google.protobuf.FieldOptions.CType:\u0006STRINGR\u0005ctype\u0012\u0016\n\u0006packed\u0018\u0002 \u0001(\bR\u0006packed\u0012G\n\u0006jstype\u0018\u0006 \u0001(\u000e2$.google.protobuf.FieldOptions.JSType:\tJS_NORMALR\u0006jstype\u0012\u0019\n\u0004lazy\u0018\u0005 \u0001(\b:\u0005falseR\u0004lazy\u0012.\n\u000funverified_lazy\u0018\u000f \u0001(\b:\u0005falseR\u000eunverifiedLazy\u0012%\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005falseR\ndeprecated\u0012\u0019\n\u0004weak\u0018\n \u0001(\b:\u0005falseR\u0004weak\u0012(\n\fdebug_redact\u0018\u0010 \u0001(\b:\u0005falseR\u000bdebugRedact\u0012K\n\tretention\u0018\u0011 \u0001(\u000e2-.google.protobuf.FieldOptions.OptionRetentionR\tretention\u0012H\n\u0007targets\u0018\u0013 \u0003(\u000e2..google.protobuf.FieldOptions.OptionTargetTypeR\u0007targets\u0012W\n\u0010edition_defaults\u0018\u0014 \u0003(\u000b2,.google.protobuf.FieldOptions.EditionDefaultR\u000feditionDefaults\u00127\n\bfeatures\u0018\u0015 \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption\u001aZ\n\u000eEditionDefault\u00122\n\u0007edition\u0018\u0003 \u0001(\u000e2\u0018.google.protobuf.EditionR\u0007edition\u0012\u0014\n\u0005value\u0018\u0002 \u0001(\tR\u0005value\"/\n\u0005CType\u0012\n\n\u0006STRING\u0010\u0000\u0012\b\n\u0004CORD\u0010\u0001\u0012\u0010\n\fSTRING_PIECE\u0010\u0002\"5\n\u0006JSType\u0012\r\n\tJS_NORMAL\u0010\u0000\u0012\r\n\tJS_STRING\u0010\u0001\u0012\r\n\tJS_NUMBER\u0010\u0002\"U\n\u000fOptionRetention\u0012\u0015\n\u0011RETENTION_UNKNOWN\u0010\u0000\u0012\u0015\n\u0011RETENTION_RUNTIME\u0010\u0001\u0012\u0014\n\u0010RETENTION_SOURCE\u0010\u0002\"\u008c\u0002\n\u0010OptionTargetType\u0012\u0017\n\u0013TARGET_TYPE_UNKNOWN\u0010\u0000\u0012\u0014\n\u0010TARGET_TYPE_FILE\u0010\u0001\u0012\u001f\n\u001bTARGET_TYPE_EXTENSION_RANGE\u0010\u0002\u0012\u0017\n\u0013TARGET_TYPE_MESSAGE\u0010\u0003\u0012\u0015\n\u0011TARGET_TYPE_FIELD\u0010\u0004\u0012\u0015\n\u0011TARGET_TYPE_ONEOF\u0010\u0005\u0012\u0014\n\u0010TARGET_TYPE_ENUM\u0010\u0006\u0012\u001a\n\u0016TARGET_TYPE_ENUM_ENTRY\u0010\u0007\u0012\u0017\n\u0013TARGET_TYPE_SERVICE\u0010\b\u0012\u0016\n\u0012TARGET_TYPE_METHOD\u0010\t*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\u0004\u0010\u0005J\u0004\b\u0012\u0010\u0013\"¬\u0001\n\fOneofOptions\u00127\n\bfeatures\u0018\u0001 \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"Ñ\u0002\n\u000bEnumOptions\u0012\u001f\n\u000ballow_alias\u0018\u0002 \u0001(\bR\nallowAlias\u0012%\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005falseR\ndeprecated\u0012V\n&deprecated_legacy_json_field_conflicts\u0018\u0006 \u0001(\bB\u0002\u0018\u0001R\"deprecatedLegacyJsonFieldConflicts\u00127\n\bfeatures\u0018\u0007 \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\u0005\u0010\u0006\"\u0081\u0002\n\u0010EnumValueOptions\u0012%\n\ndeprecated\u0018\u0001 \u0001(\b:\u0005falseR\ndeprecated\u00127\n\bfeatures\u0018\u0002 \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012(\n\fdebug_redact\u0018\u0003 \u0001(\b:\u0005falseR\u000bdebugRedact\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"Õ\u0001\n\u000eServiceOptions\u00127\n\bfeatures\u0018\" \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012%\n\ndeprecated\u0018! \u0001(\b:\u0005falseR\ndeprecated\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u0099\u0003\n\rMethodOptions\u0012%\n\ndeprecated\u0018! \u0001(\b:\u0005falseR\ndeprecated\u0012q\n\u0011idempotency_level\u0018\" \u0001(\u000e2/.google.protobuf.MethodOptions.IdempotencyLevel:\u0013IDEMPOTENCY_UNKNOWNR\u0010idempotencyLevel\u00127\n\bfeatures\u0018# \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption\"P\n\u0010IdempotencyLevel\u0012\u0017\n\u0013IDEMPOTENCY_UNKNOWN\u0010\u0000\u0012\u0013\n\u000fNO_SIDE_EFFECTS\u0010\u0001\u0012\u000e\n\nIDEMPOTENT\u0010\u0002*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u009a\u0003\n\u0013UninterpretedOption\u0012A\n\u0004name\u0018\u0002 \u0003(\u000b2-.google.protobuf.UninterpretedOption.NamePartR\u0004name\u0012)\n\u0010identifier_value\u0018\u0003 \u0001(\tR\u000fidentifierValue\u0012,\n\u0012positive_int_value\u0018\u0004 \u0001(\u0004R\u0010positiveIntValue\u0012,\n\u0012negative_int_value\u0018\u0005 \u0001(\u0003R\u0010negativeIntValue\u0012!\n\fdouble_value\u0018\u0006 \u0001(\u0001R\u000bdoubleValue\u0012!\n\fstring_value\u0018\u0007 \u0001(\fR\u000bstringValue\u0012'\n\u000faggregate_value\u0018\b \u0001(\tR\u000eaggregateValue\u001aJ\n\bNamePart\u0012\u001b\n\tname_part\u0018\u0001 \u0002(\tR\bnamePart\u0012!\n\fis_extension\u0018\u0002 \u0002(\bR\u000bisExtension\"ü\t\n\nFeatureSet\u0012\u008b\u0001\n\u000efield_presence\u0018\u0001 \u0001(\u000e2).google.protobuf.FeatureSet.FieldPresenceB9\u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001¢\u0001\r\u0012\bEXPLICIT\u0018æ\u0007¢\u0001\r\u0012\bIMPLICIT\u0018ç\u0007¢\u0001\r\u0012\bEXPLICIT\u0018è\u0007R\rfieldPresence\u0012f\n\tenum_type\u0018\u0002 \u0001(\u000e2$.google.protobuf.FeatureSet.EnumTypeB#\u0088\u0001\u0001\u0098\u0001\u0006\u0098\u0001\u0001¢\u0001\u000b\u0012\u0006CLOSED\u0018æ\u0007¢\u0001\t\u0012\u0004OPEN\u0018ç\u0007R\benumType\u0012\u0092\u0001\n\u0017repeated_field_encoding\u0018\u0003 \u0001(\u000e21.google.protobuf.FeatureSet.RepeatedFieldEncodingB'\u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001¢\u0001\r\u0012\bEXPANDED\u0018æ\u0007¢\u0001\u000b\u0012\u0006PACKED\u0018ç\u0007R\u0015repeatedFieldEncoding\u0012x\n\u000futf8_validation\u0018\u0004 \u0001(\u000e2*.google.protobuf.FeatureSet.Utf8ValidationB#\u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001¢\u0001\t\u0012\u0004NONE\u0018æ\u0007¢\u0001\u000b\u0012\u0006VERIFY\u0018ç\u0007R\u000eutf8Validation\u0012x\n\u0010message_encoding\u0018\u0005 \u0001(\u000e2+.google.protobuf.FeatureSet.MessageEncodingB \u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001¢\u0001\u0014\u0012\u000fLENGTH_PREFIXED\u0018æ\u0007R\u000fmessageEncoding\u0012|\n\u000bjson_format\u0018\u0006 \u0001(\u000e2&.google.protobuf.FeatureSet.JsonFormatB3\u0088\u0001\u0001\u0098\u0001\u0003\u0098\u0001\u0006\u0098\u0001\u0001¢\u0001\u0017\u0012\u0012LEGACY_BEST_EFFORT\u0018æ\u0007¢\u0001\n\u0012\u0005ALLOW\u0018ç\u0007R\njsonFormat\"\\\n\rFieldPresence\u0012\u001a\n\u0016FIELD_PRESENCE_UNKNOWN\u0010\u0000\u0012\f\n\bEXPLICIT\u0010\u0001\u0012\f\n\bIMPLICIT\u0010\u0002\u0012\u0013\n\u000fLEGACY_REQUIRED\u0010\u0003\"7\n\bEnumType\u0012\u0015\n\u0011ENUM_TYPE_UNKNOWN\u0010\u0000\u0012\b\n\u0004OPEN\u0010\u0001\u0012\n\n\u0006CLOSED\u0010\u0002\"V\n\u0015RepeatedFieldEncoding\u0012#\n\u001fREPEATED_FIELD_ENCODING_UNKNOWN\u0010\u0000\u0012\n\n\u0006PACKED\u0010\u0001\u0012\f\n\bEXPANDED\u0010\u0002\"C\n\u000eUtf8Validation\u0012\u001b\n\u0017UTF8_VALIDATION_UNKNOWN\u0010\u0000\u0012\b\n\u0004NONE\u0010\u0001\u0012\n\n\u0006VERIFY\u0010\u0002\"S\n\u000fMessageEncoding\u0012\u001c\n\u0018MESSAGE_ENCODING_UNKNOWN\u0010\u0000\u0012\u0013\n\u000fLENGTH_PREFIXED\u0010\u0001\u0012\r\n\tDELIMITED\u0010\u0002\"H\n\nJsonFormat\u0012\u0017\n\u0013JSON_FORMAT_UNKNOWN\u0010\u0000\u0012\t\n\u0005ALLOW\u0010\u0001\u0012\u0016\n\u0012LEGACY_BEST_EFFORT\u0010\u0002*\u0006\bè\u0007\u0010é\u0007*\u0006\bé\u0007\u0010ê\u0007*\u0006\b\u008bN\u0010\u0090NJ\u0006\bç\u0007\u0010è\u0007\"þ\u0002\n\u0012FeatureSetDefaults\u0012X\n\bdefaults\u0018\u0001 \u0003(\u000b2<.google.protobuf.FeatureSetDefaults.FeatureSetEditionDefaultR\bdefaults\u0012A\n\u000fminimum_edition\u0018\u0004 \u0001(\u000e2\u0018.google.protobuf.EditionR\u000eminimumEdition\u0012A\n\u000fmaximum_edition\u0018\u0005 \u0001(\u000e2\u0018.google.protobuf.EditionR\u000emaximumEdition\u001a\u0087\u0001\n\u0018FeatureSetEditionDefault\u00122\n\u0007edition\u0018\u0003 \u0001(\u000e2\u0018.google.protobuf.EditionR\u0007edition\u00127\n\bfeatures\u0018\u0002 \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\"§\u0002\n\u000eSourceCodeInfo\u0012D\n\blocation\u0018\u0001 \u0003(\u000b2(.google.protobuf.SourceCodeInfo.LocationR\blocation\u001aÎ\u0001\n\bLocation\u0012\u0016\n\u0004path\u0018\u0001 \u0003(\u0005B\u0002\u0010\u0001R\u0004path\u0012\u0016\n\u0004span\u0018\u0002 \u0003(\u0005B\u0002\u0010\u0001R\u0004span\u0012)\n\u0010leading_comments\u0018\u0003 \u0001(\tR\u000fleadingComments\u0012+\n\u0011trailing_comments\u0018\u0004 \u0001(\tR\u0010trailingComments\u0012:\n\u0019leading_detached_comments\u0018\u0006 \u0003(\tR\u0017leadingDetachedComments\"Ð\u0002\n\u0011GeneratedCodeInfo\u0012M\n\nannotation\u0018\u0001 \u0003(\u000b2-.google.protobuf.GeneratedCodeInfo.AnnotationR\nannotation\u001aë\u0001\n\nAnnotation\u0012\u0016\n\u0004path\u0018\u0001 \u0003(\u0005B\u0002\u0010\u0001R\u0004path\u0012\u001f\n\u000bsource_file\u0018\u0002 \u0001(\tR\nsourceFile\u0012\u0014\n\u0005begin\u0018\u0003 \u0001(\u0005R\u0005begin\u0012\u0010\n\u0003end\u0018\u0004 \u0001(\u0005R\u0003end\u0012R\n\bsemantic\u0018\u0005 \u0001(\u000e26.google.protobuf.GeneratedCodeInfo.Annotation.SemanticR\bsemantic\"(\n\bSemantic\u0012\b\n\u0004NONE\u0010\u0000\u0012\u0007\n\u0003SET\u0010\u0001\u0012\t\n\u0005ALIAS\u0010\u0002*ê\u0001\n\u0007Edition\u0012\u0013\n\u000fEDITION_UNKNOWN\u0010\u0000\u0012\u0013\n\u000eEDITION_PROTO2\u0010æ\u0007\u0012\u0013\n\u000eEDITION_PROTO3\u0010ç\u0007\u0012\u0011\n\fEDITION_2023\u0010è\u0007\u0012\u0017\n\u0013EDITION_1_TEST_ONLY\u0010\u0001\u0012\u0017\n\u0013EDITION_2_TEST_ONLY\u0010\u0002\u0012\u001d\n\u0017EDITION_99997_TEST_ONLY\u0010\u009d\u008d\u0006\u0012\u001d\n\u0017EDITION_99998_TEST_ONLY\u0010\u009e\u008d\u0006\u0012\u001d\n\u0017EDITION_99999_TEST_ONLY\u0010\u009f\u008d\u0006B~\n\u0013com.google.protobufB\u0010DescriptorProtosH\u0001Z-google.golang.org/protobuf/types/descriptorpbø\u0001\u0001¢\u0002\u0003GPBª\u0002\u001aGoogle.Protobuf.Reflection"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_google_protobuf_DescriptorProto_ExtensionRange_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_DescriptorProto_ExtensionRange_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_DescriptorProto_ReservedRange_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_DescriptorProto_ReservedRange_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_DescriptorProto_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_DescriptorProto_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_EnumDescriptorProto_EnumReservedRange_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_EnumDescriptorProto_EnumReservedRange_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_EnumDescriptorProto_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_EnumDescriptorProto_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_EnumOptions_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_EnumOptions_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_EnumValueDescriptorProto_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_EnumValueDescriptorProto_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_EnumValueOptions_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_EnumValueOptions_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_ExtensionRangeOptions_Declaration_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_ExtensionRangeOptions_Declaration_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_ExtensionRangeOptions_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_ExtensionRangeOptions_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_FeatureSetDefaults_FeatureSetEditionDefault_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_FeatureSetDefaults_FeatureSetEditionDefault_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_FeatureSetDefaults_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_FeatureSetDefaults_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_FeatureSet_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_FeatureSet_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_FieldDescriptorProto_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_FieldDescriptorProto_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_FieldOptions_EditionDefault_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_FieldOptions_EditionDefault_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_FieldOptions_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_FieldOptions_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_FileDescriptorProto_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_FileDescriptorProto_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_FileDescriptorSet_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_FileDescriptorSet_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_FileOptions_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_FileOptions_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_GeneratedCodeInfo_Annotation_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_GeneratedCodeInfo_Annotation_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_GeneratedCodeInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_GeneratedCodeInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_MessageOptions_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_MessageOptions_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_MethodDescriptorProto_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_MethodDescriptorProto_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_MethodOptions_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_MethodOptions_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_OneofDescriptorProto_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_OneofDescriptorProto_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_OneofOptions_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_OneofOptions_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_ServiceDescriptorProto_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_ServiceDescriptorProto_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_ServiceOptions_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_ServiceOptions_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_SourceCodeInfo_Location_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_SourceCodeInfo_Location_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_SourceCodeInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_SourceCodeInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_UninterpretedOption_NamePart_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_UninterpretedOption_NamePart_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_google_protobuf_UninterpretedOption_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_UninterpretedOption_fieldAccessorTable;

    /* loaded from: classes2.dex */
    public interface DescriptorProtoOrBuilder extends MessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface EnumDescriptorProtoOrBuilder extends MessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface EnumOptionsOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface EnumValueDescriptorProtoOrBuilder extends MessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface EnumValueOptionsOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface ExtensionRangeOptionsOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface FeatureSetOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface FieldDescriptorProtoOrBuilder extends MessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface FieldOptionsOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface FileDescriptorProtoOrBuilder extends MessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface FileOptionsOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface MessageOptionsOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface MethodDescriptorProtoOrBuilder extends MessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface MethodOptionsOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface OneofDescriptorProtoOrBuilder extends MessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface OneofOptionsOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface ServiceDescriptorProtoOrBuilder extends MessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface ServiceOptionsOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface SourceCodeInfoOrBuilder extends MessageOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface UninterpretedOptionOrBuilder extends MessageOrBuilder {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    /* loaded from: classes2.dex */
    public enum Edition implements ProtocolMessageEnum {
        EDITION_UNKNOWN(0),
        EDITION_PROTO2(998),
        EDITION_PROTO3(999),
        EDITION_2023(1000),
        EDITION_1_TEST_ONLY(1),
        EDITION_2_TEST_ONLY(2),
        EDITION_99997_TEST_ONLY(99997),
        EDITION_99998_TEST_ONLY(99998),
        EDITION_99999_TEST_ONLY(99999);
        
        private final int value;
        private static final Internal.EnumLiteMap<Edition> internalValueMap = new Internal.EnumLiteMap<Edition>() { // from class: com.google.protobuf.DescriptorProtos.Edition.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Edition findValueByNumber(int i) {
                return Edition.forNumber(i);
            }
        };
        private static final Edition[] VALUES = values();

        public static Edition forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        switch (i) {
                            case 998:
                                return EDITION_PROTO2;
                            case 999:
                                return EDITION_PROTO3;
                            case 1000:
                                return EDITION_2023;
                            default:
                                switch (i) {
                                    case 99997:
                                        return EDITION_99997_TEST_ONLY;
                                    case 99998:
                                        return EDITION_99998_TEST_ONLY;
                                    case 99999:
                                        return EDITION_99999_TEST_ONLY;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return EDITION_2_TEST_ONLY;
                }
                return EDITION_1_TEST_ONLY;
            }
            return EDITION_UNKNOWN;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        Edition(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes2.dex */
    public static final class FileDescriptorProto extends GeneratedMessageV3 implements FileDescriptorProtoOrBuilder {
        private static final FileDescriptorProto DEFAULT_INSTANCE = new FileDescriptorProto();
        @Deprecated
        public static final Parser<FileDescriptorProto> PARSER = new AbstractParser<FileDescriptorProto>() { // from class: com.google.protobuf.DescriptorProtos.FileDescriptorProto.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public FileDescriptorProto parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = FileDescriptorProto.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LazyStringArrayList dependency_;
        private int edition_;
        private List<EnumDescriptorProto> enumType_;
        private List<FieldDescriptorProto> extension_;
        private byte memoizedIsInitialized;
        private List<DescriptorProto> messageType_;
        private volatile Object name_;
        private FileOptions options_;
        private volatile Object package_;
        private Internal.IntList publicDependency_;
        private List<ServiceDescriptorProto> service_;
        private SourceCodeInfo sourceCodeInfo_;
        private volatile Object syntax_;
        private Internal.IntList weakDependency_;

        public static FileDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FileDescriptorProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public ProtocolStringList getDependencyList() {
            return this.dependency_;
        }

        public List<EnumDescriptorProto> getEnumTypeList() {
            return this.enumType_;
        }

        public List<FieldDescriptorProto> getExtensionList() {
            return this.extension_;
        }

        public List<DescriptorProto> getMessageTypeList() {
            return this.messageType_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<FileDescriptorProto> getParserForType() {
            return PARSER;
        }

        public List<Integer> getPublicDependencyList() {
            return this.publicDependency_;
        }

        public List<ServiceDescriptorProto> getServiceList() {
            return this.service_;
        }

        public List<Integer> getWeakDependencyList() {
            return this.weakDependency_;
        }

        public boolean hasEdition() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPackage() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSourceCodeInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasSyntax() {
            return (this.bitField0_ & 16) != 0;
        }

        static /* synthetic */ int access$2476(FileDescriptorProto fileDescriptorProto, int i) {
            int i2 = i | fileDescriptorProto.bitField0_;
            fileDescriptorProto.bitField0_ = i2;
            return i2;
        }

        private FileDescriptorProto(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.name_ = "";
            this.package_ = "";
            this.dependency_ = LazyStringArrayList.emptyList();
            this.publicDependency_ = GeneratedMessageV3.emptyIntList();
            this.weakDependency_ = GeneratedMessageV3.emptyIntList();
            this.syntax_ = "";
            this.edition_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        private FileDescriptorProto() {
            this.name_ = "";
            this.package_ = "";
            this.dependency_ = LazyStringArrayList.emptyList();
            this.publicDependency_ = GeneratedMessageV3.emptyIntList();
            this.weakDependency_ = GeneratedMessageV3.emptyIntList();
            this.syntax_ = "";
            this.edition_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.package_ = "";
            this.dependency_ = LazyStringArrayList.emptyList();
            this.publicDependency_ = GeneratedMessageV3.emptyIntList();
            this.weakDependency_ = GeneratedMessageV3.emptyIntList();
            this.messageType_ = Collections.emptyList();
            this.enumType_ = Collections.emptyList();
            this.service_ = Collections.emptyList();
            this.extension_ = Collections.emptyList();
            this.syntax_ = "";
            this.edition_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new FileDescriptorProto();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_FileDescriptorProto_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_FileDescriptorProto_fieldAccessorTable.ensureFieldAccessorsInitialized(FileDescriptorProto.class, Builder.class);
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        public String getPackage() {
            Object obj = this.package_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.package_ = stringUtf8;
            }
            return stringUtf8;
        }

        public int getDependencyCount() {
            return this.dependency_.size();
        }

        public String getDependency(int i) {
            return this.dependency_.get(i);
        }

        public int getPublicDependencyCount() {
            return this.publicDependency_.size();
        }

        public int getPublicDependency(int i) {
            return this.publicDependency_.getInt(i);
        }

        public int getWeakDependencyCount() {
            return this.weakDependency_.size();
        }

        public int getMessageTypeCount() {
            return this.messageType_.size();
        }

        public DescriptorProto getMessageType(int i) {
            return this.messageType_.get(i);
        }

        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        public EnumDescriptorProto getEnumType(int i) {
            return this.enumType_.get(i);
        }

        public int getServiceCount() {
            return this.service_.size();
        }

        public ServiceDescriptorProto getService(int i) {
            return this.service_.get(i);
        }

        public int getExtensionCount() {
            return this.extension_.size();
        }

        public FieldDescriptorProto getExtension(int i) {
            return this.extension_.get(i);
        }

        public FileOptions getOptions() {
            FileOptions fileOptions = this.options_;
            return fileOptions == null ? FileOptions.getDefaultInstance() : fileOptions;
        }

        public SourceCodeInfo getSourceCodeInfo() {
            SourceCodeInfo sourceCodeInfo = this.sourceCodeInfo_;
            return sourceCodeInfo == null ? SourceCodeInfo.getDefaultInstance() : sourceCodeInfo;
        }

        public String getSyntax() {
            Object obj = this.syntax_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.syntax_ = stringUtf8;
            }
            return stringUtf8;
        }

        public Edition getEdition() {
            Edition forNumber = Edition.forNumber(this.edition_);
            return forNumber == null ? Edition.EDITION_UNKNOWN : forNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getMessageTypeCount(); i++) {
                if (!getMessageType(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getEnumTypeCount(); i2++) {
                if (!getEnumType(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getServiceCount(); i3++) {
                if (!getService(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < getExtensionCount(); i4++) {
                if (!getExtension(i4).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.package_);
            }
            for (int i = 0; i < this.dependency_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.dependency_.getRaw(i));
            }
            for (int i2 = 0; i2 < this.messageType_.size(); i2++) {
                codedOutputStream.writeMessage(4, this.messageType_.get(i2));
            }
            for (int i3 = 0; i3 < this.enumType_.size(); i3++) {
                codedOutputStream.writeMessage(5, this.enumType_.get(i3));
            }
            for (int i4 = 0; i4 < this.service_.size(); i4++) {
                codedOutputStream.writeMessage(6, this.service_.get(i4));
            }
            for (int i5 = 0; i5 < this.extension_.size(); i5++) {
                codedOutputStream.writeMessage(7, this.extension_.get(i5));
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(8, getOptions());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(9, getSourceCodeInfo());
            }
            for (int i6 = 0; i6 < this.publicDependency_.size(); i6++) {
                codedOutputStream.writeInt32(10, this.publicDependency_.getInt(i6));
            }
            for (int i7 = 0; i7 < this.weakDependency_.size(); i7++) {
                codedOutputStream.writeInt32(11, this.weakDependency_.getInt(i7));
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.syntax_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeEnum(14, this.edition_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                computeStringSize += GeneratedMessageV3.computeStringSize(2, this.package_);
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.dependency_.size(); i3++) {
                i2 += GeneratedMessageV3.computeStringSizeNoTag(this.dependency_.getRaw(i3));
            }
            int size = computeStringSize + i2 + getDependencyList().size();
            for (int i4 = 0; i4 < this.messageType_.size(); i4++) {
                size += CodedOutputStream.computeMessageSize(4, this.messageType_.get(i4));
            }
            for (int i5 = 0; i5 < this.enumType_.size(); i5++) {
                size += CodedOutputStream.computeMessageSize(5, this.enumType_.get(i5));
            }
            for (int i6 = 0; i6 < this.service_.size(); i6++) {
                size += CodedOutputStream.computeMessageSize(6, this.service_.get(i6));
            }
            for (int i7 = 0; i7 < this.extension_.size(); i7++) {
                size += CodedOutputStream.computeMessageSize(7, this.extension_.get(i7));
            }
            if ((this.bitField0_ & 4) != 0) {
                size += CodedOutputStream.computeMessageSize(8, getOptions());
            }
            if ((this.bitField0_ & 8) != 0) {
                size += CodedOutputStream.computeMessageSize(9, getSourceCodeInfo());
            }
            int i8 = 0;
            for (int i9 = 0; i9 < this.publicDependency_.size(); i9++) {
                i8 += CodedOutputStream.computeInt32SizeNoTag(this.publicDependency_.getInt(i9));
            }
            int size2 = getPublicDependencyList().size();
            int i10 = 0;
            for (int i11 = 0; i11 < this.weakDependency_.size(); i11++) {
                i10 += CodedOutputStream.computeInt32SizeNoTag(this.weakDependency_.getInt(i11));
            }
            int size3 = size + i8 + size2 + i10 + getWeakDependencyList().size();
            if ((this.bitField0_ & 16) != 0) {
                size3 += GeneratedMessageV3.computeStringSize(12, this.syntax_);
            }
            if ((this.bitField0_ & 32) != 0) {
                size3 += CodedOutputStream.computeEnumSize(14, this.edition_);
            }
            int serializedSize = size3 + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileDescriptorProto)) {
                return super.equals(obj);
            }
            FileDescriptorProto fileDescriptorProto = (FileDescriptorProto) obj;
            if (hasName() != fileDescriptorProto.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(fileDescriptorProto.getName())) && hasPackage() == fileDescriptorProto.hasPackage()) {
                if ((!hasPackage() || getPackage().equals(fileDescriptorProto.getPackage())) && getDependencyList().equals(fileDescriptorProto.getDependencyList()) && getPublicDependencyList().equals(fileDescriptorProto.getPublicDependencyList()) && getWeakDependencyList().equals(fileDescriptorProto.getWeakDependencyList()) && getMessageTypeList().equals(fileDescriptorProto.getMessageTypeList()) && getEnumTypeList().equals(fileDescriptorProto.getEnumTypeList()) && getServiceList().equals(fileDescriptorProto.getServiceList()) && getExtensionList().equals(fileDescriptorProto.getExtensionList()) && hasOptions() == fileDescriptorProto.hasOptions()) {
                    if ((!hasOptions() || getOptions().equals(fileDescriptorProto.getOptions())) && hasSourceCodeInfo() == fileDescriptorProto.hasSourceCodeInfo()) {
                        if ((!hasSourceCodeInfo() || getSourceCodeInfo().equals(fileDescriptorProto.getSourceCodeInfo())) && hasSyntax() == fileDescriptorProto.hasSyntax()) {
                            if ((!hasSyntax() || getSyntax().equals(fileDescriptorProto.getSyntax())) && hasEdition() == fileDescriptorProto.hasEdition()) {
                                return (!hasEdition() || this.edition_ == fileDescriptorProto.edition_) && getUnknownFields().equals(fileDescriptorProto.getUnknownFields());
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasName()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (hasPackage()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getPackage().hashCode();
            }
            if (getDependencyCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + getDependencyList().hashCode();
            }
            if (getPublicDependencyCount() > 0) {
                hashCode = (((hashCode * 37) + 10) * 53) + getPublicDependencyList().hashCode();
            }
            if (getWeakDependencyCount() > 0) {
                hashCode = (((hashCode * 37) + 11) * 53) + getWeakDependencyList().hashCode();
            }
            if (getMessageTypeCount() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + getMessageTypeList().hashCode();
            }
            if (getEnumTypeCount() > 0) {
                hashCode = (((hashCode * 37) + 5) * 53) + getEnumTypeList().hashCode();
            }
            if (getServiceCount() > 0) {
                hashCode = (((hashCode * 37) + 6) * 53) + getServiceList().hashCode();
            }
            if (getExtensionCount() > 0) {
                hashCode = (((hashCode * 37) + 7) * 53) + getExtensionList().hashCode();
            }
            if (hasOptions()) {
                hashCode = (((hashCode * 37) + 8) * 53) + getOptions().hashCode();
            }
            if (hasSourceCodeInfo()) {
                hashCode = (((hashCode * 37) + 9) * 53) + getSourceCodeInfo().hashCode();
            }
            if (hasSyntax()) {
                hashCode = (((hashCode * 37) + 12) * 53) + getSyntax().hashCode();
            }
            if (hasEdition()) {
                hashCode = (((hashCode * 37) + 14) * 53) + this.edition_;
            }
            int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static FileDescriptorProto parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FileDescriptorProtoOrBuilder {
            private int bitField0_;
            private LazyStringArrayList dependency_;
            private int edition_;
            private RepeatedFieldBuilderV3<EnumDescriptorProto, EnumDescriptorProto.Builder, EnumDescriptorProtoOrBuilder> enumTypeBuilder_;
            private List<EnumDescriptorProto> enumType_;
            private RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> extensionBuilder_;
            private List<FieldDescriptorProto> extension_;
            private RepeatedFieldBuilderV3<DescriptorProto, DescriptorProto.Builder, DescriptorProtoOrBuilder> messageTypeBuilder_;
            private List<DescriptorProto> messageType_;
            private Object name_;
            private SingleFieldBuilderV3<FileOptions, FileOptions.Builder, FileOptionsOrBuilder> optionsBuilder_;
            private FileOptions options_;
            private Object package_;
            private Internal.IntList publicDependency_;
            private RepeatedFieldBuilderV3<ServiceDescriptorProto, ServiceDescriptorProto.Builder, ServiceDescriptorProtoOrBuilder> serviceBuilder_;
            private List<ServiceDescriptorProto> service_;
            private SingleFieldBuilderV3<SourceCodeInfo, SourceCodeInfo.Builder, SourceCodeInfoOrBuilder> sourceCodeInfoBuilder_;
            private SourceCodeInfo sourceCodeInfo_;
            private Object syntax_;
            private Internal.IntList weakDependency_;

            public boolean hasOptions() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_FileDescriptorProto_fieldAccessorTable.ensureFieldAccessorsInitialized(FileDescriptorProto.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.package_ = "";
                this.dependency_ = LazyStringArrayList.emptyList();
                this.publicDependency_ = GeneratedMessageV3.emptyIntList();
                this.weakDependency_ = GeneratedMessageV3.emptyIntList();
                this.messageType_ = Collections.emptyList();
                this.enumType_ = Collections.emptyList();
                this.service_ = Collections.emptyList();
                this.extension_ = Collections.emptyList();
                this.syntax_ = "";
                this.edition_ = 0;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.package_ = "";
                this.dependency_ = LazyStringArrayList.emptyList();
                this.publicDependency_ = GeneratedMessageV3.emptyIntList();
                this.weakDependency_ = GeneratedMessageV3.emptyIntList();
                this.messageType_ = Collections.emptyList();
                this.enumType_ = Collections.emptyList();
                this.service_ = Collections.emptyList();
                this.extension_ = Collections.emptyList();
                this.syntax_ = "";
                this.edition_ = 0;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getMessageTypeFieldBuilder();
                    getEnumTypeFieldBuilder();
                    getServiceFieldBuilder();
                    getExtensionFieldBuilder();
                    getOptionsFieldBuilder();
                    getSourceCodeInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_FileDescriptorProto_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FileDescriptorProto getDefaultInstanceForType() {
                return FileDescriptorProto.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileDescriptorProto build() {
                FileDescriptorProto buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileDescriptorProto buildPartial() {
                FileDescriptorProto fileDescriptorProto = new FileDescriptorProto(this);
                buildPartialRepeatedFields(fileDescriptorProto);
                if (this.bitField0_ != 0) {
                    buildPartial0(fileDescriptorProto);
                }
                onBuilt();
                return fileDescriptorProto;
            }

            private void buildPartialRepeatedFields(FileDescriptorProto fileDescriptorProto) {
                RepeatedFieldBuilderV3<DescriptorProto, DescriptorProto.Builder, DescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.messageTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 32) != 0) {
                        this.messageType_ = Collections.unmodifiableList(this.messageType_);
                        this.bitField0_ &= -33;
                    }
                    fileDescriptorProto.messageType_ = this.messageType_;
                } else {
                    fileDescriptorProto.messageType_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<EnumDescriptorProto, EnumDescriptorProto.Builder, EnumDescriptorProtoOrBuilder> repeatedFieldBuilderV32 = this.enumTypeBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    if ((this.bitField0_ & 64) != 0) {
                        this.enumType_ = Collections.unmodifiableList(this.enumType_);
                        this.bitField0_ &= -65;
                    }
                    fileDescriptorProto.enumType_ = this.enumType_;
                } else {
                    fileDescriptorProto.enumType_ = repeatedFieldBuilderV32.build();
                }
                RepeatedFieldBuilderV3<ServiceDescriptorProto, ServiceDescriptorProto.Builder, ServiceDescriptorProtoOrBuilder> repeatedFieldBuilderV33 = this.serviceBuilder_;
                if (repeatedFieldBuilderV33 == null) {
                    if ((this.bitField0_ & 128) != 0) {
                        this.service_ = Collections.unmodifiableList(this.service_);
                        this.bitField0_ &= -129;
                    }
                    fileDescriptorProto.service_ = this.service_;
                } else {
                    fileDescriptorProto.service_ = repeatedFieldBuilderV33.build();
                }
                RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> repeatedFieldBuilderV34 = this.extensionBuilder_;
                if (repeatedFieldBuilderV34 == null) {
                    if ((this.bitField0_ & JSONzip.end) != 0) {
                        this.extension_ = Collections.unmodifiableList(this.extension_);
                        this.bitField0_ &= -257;
                    }
                    fileDescriptorProto.extension_ = this.extension_;
                    return;
                }
                fileDescriptorProto.extension_ = repeatedFieldBuilderV34.build();
            }

            private void buildPartial0(FileDescriptorProto fileDescriptorProto) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    fileDescriptorProto.name_ = this.name_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    fileDescriptorProto.package_ = this.package_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    this.dependency_.makeImmutable();
                    fileDescriptorProto.dependency_ = this.dependency_;
                }
                if ((i2 & 8) != 0) {
                    this.publicDependency_.makeImmutable();
                    fileDescriptorProto.publicDependency_ = this.publicDependency_;
                }
                if ((i2 & 16) != 0) {
                    this.weakDependency_.makeImmutable();
                    fileDescriptorProto.weakDependency_ = this.weakDependency_;
                }
                if ((i2 & 512) != 0) {
                    SingleFieldBuilderV3<FileOptions, FileOptions.Builder, FileOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                    fileDescriptorProto.options_ = singleFieldBuilderV3 == null ? this.options_ : singleFieldBuilderV3.build();
                    i |= 4;
                }
                if ((i2 & 1024) != 0) {
                    SingleFieldBuilderV3<SourceCodeInfo, SourceCodeInfo.Builder, SourceCodeInfoOrBuilder> singleFieldBuilderV32 = this.sourceCodeInfoBuilder_;
                    fileDescriptorProto.sourceCodeInfo_ = singleFieldBuilderV32 == null ? this.sourceCodeInfo_ : singleFieldBuilderV32.build();
                    i |= 8;
                }
                if ((i2 & 2048) != 0) {
                    fileDescriptorProto.syntax_ = this.syntax_;
                    i |= 16;
                }
                if ((i2 & 4096) != 0) {
                    fileDescriptorProto.edition_ = this.edition_;
                    i |= 32;
                }
                FileDescriptorProto.access$2476(fileDescriptorProto, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FileDescriptorProto) {
                    return mergeFrom((FileDescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FileDescriptorProto fileDescriptorProto) {
                if (fileDescriptorProto == FileDescriptorProto.getDefaultInstance()) {
                    return this;
                }
                if (fileDescriptorProto.hasName()) {
                    this.name_ = fileDescriptorProto.name_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (fileDescriptorProto.hasPackage()) {
                    this.package_ = fileDescriptorProto.package_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!fileDescriptorProto.dependency_.isEmpty()) {
                    if (this.dependency_.isEmpty()) {
                        this.dependency_ = fileDescriptorProto.dependency_;
                        this.bitField0_ |= 4;
                    } else {
                        ensureDependencyIsMutable();
                        this.dependency_.addAll(fileDescriptorProto.dependency_);
                    }
                    onChanged();
                }
                if (!fileDescriptorProto.publicDependency_.isEmpty()) {
                    if (this.publicDependency_.isEmpty()) {
                        Internal.IntList intList = fileDescriptorProto.publicDependency_;
                        this.publicDependency_ = intList;
                        intList.makeImmutable();
                        this.bitField0_ |= 8;
                    } else {
                        ensurePublicDependencyIsMutable();
                        this.publicDependency_.addAll(fileDescriptorProto.publicDependency_);
                    }
                    onChanged();
                }
                if (!fileDescriptorProto.weakDependency_.isEmpty()) {
                    if (this.weakDependency_.isEmpty()) {
                        Internal.IntList intList2 = fileDescriptorProto.weakDependency_;
                        this.weakDependency_ = intList2;
                        intList2.makeImmutable();
                        this.bitField0_ |= 16;
                    } else {
                        ensureWeakDependencyIsMutable();
                        this.weakDependency_.addAll(fileDescriptorProto.weakDependency_);
                    }
                    onChanged();
                }
                if (this.messageTypeBuilder_ == null) {
                    if (!fileDescriptorProto.messageType_.isEmpty()) {
                        if (this.messageType_.isEmpty()) {
                            this.messageType_ = fileDescriptorProto.messageType_;
                            this.bitField0_ &= -33;
                        } else {
                            ensureMessageTypeIsMutable();
                            this.messageType_.addAll(fileDescriptorProto.messageType_);
                        }
                        onChanged();
                    }
                } else if (!fileDescriptorProto.messageType_.isEmpty()) {
                    if (!this.messageTypeBuilder_.isEmpty()) {
                        this.messageTypeBuilder_.addAllMessages(fileDescriptorProto.messageType_);
                    } else {
                        this.messageTypeBuilder_.dispose();
                        this.messageTypeBuilder_ = null;
                        this.messageType_ = fileDescriptorProto.messageType_;
                        this.bitField0_ &= -33;
                        this.messageTypeBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getMessageTypeFieldBuilder() : null;
                    }
                }
                if (this.enumTypeBuilder_ == null) {
                    if (!fileDescriptorProto.enumType_.isEmpty()) {
                        if (this.enumType_.isEmpty()) {
                            this.enumType_ = fileDescriptorProto.enumType_;
                            this.bitField0_ &= -65;
                        } else {
                            ensureEnumTypeIsMutable();
                            this.enumType_.addAll(fileDescriptorProto.enumType_);
                        }
                        onChanged();
                    }
                } else if (!fileDescriptorProto.enumType_.isEmpty()) {
                    if (!this.enumTypeBuilder_.isEmpty()) {
                        this.enumTypeBuilder_.addAllMessages(fileDescriptorProto.enumType_);
                    } else {
                        this.enumTypeBuilder_.dispose();
                        this.enumTypeBuilder_ = null;
                        this.enumType_ = fileDescriptorProto.enumType_;
                        this.bitField0_ &= -65;
                        this.enumTypeBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getEnumTypeFieldBuilder() : null;
                    }
                }
                if (this.serviceBuilder_ == null) {
                    if (!fileDescriptorProto.service_.isEmpty()) {
                        if (this.service_.isEmpty()) {
                            this.service_ = fileDescriptorProto.service_;
                            this.bitField0_ &= -129;
                        } else {
                            ensureServiceIsMutable();
                            this.service_.addAll(fileDescriptorProto.service_);
                        }
                        onChanged();
                    }
                } else if (!fileDescriptorProto.service_.isEmpty()) {
                    if (!this.serviceBuilder_.isEmpty()) {
                        this.serviceBuilder_.addAllMessages(fileDescriptorProto.service_);
                    } else {
                        this.serviceBuilder_.dispose();
                        this.serviceBuilder_ = null;
                        this.service_ = fileDescriptorProto.service_;
                        this.bitField0_ &= -129;
                        this.serviceBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getServiceFieldBuilder() : null;
                    }
                }
                if (this.extensionBuilder_ == null) {
                    if (!fileDescriptorProto.extension_.isEmpty()) {
                        if (this.extension_.isEmpty()) {
                            this.extension_ = fileDescriptorProto.extension_;
                            this.bitField0_ &= -257;
                        } else {
                            ensureExtensionIsMutable();
                            this.extension_.addAll(fileDescriptorProto.extension_);
                        }
                        onChanged();
                    }
                } else if (!fileDescriptorProto.extension_.isEmpty()) {
                    if (!this.extensionBuilder_.isEmpty()) {
                        this.extensionBuilder_.addAllMessages(fileDescriptorProto.extension_);
                    } else {
                        this.extensionBuilder_.dispose();
                        this.extensionBuilder_ = null;
                        this.extension_ = fileDescriptorProto.extension_;
                        this.bitField0_ &= -257;
                        this.extensionBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getExtensionFieldBuilder() : null;
                    }
                }
                if (fileDescriptorProto.hasOptions()) {
                    mergeOptions(fileDescriptorProto.getOptions());
                }
                if (fileDescriptorProto.hasSourceCodeInfo()) {
                    mergeSourceCodeInfo(fileDescriptorProto.getSourceCodeInfo());
                }
                if (fileDescriptorProto.hasSyntax()) {
                    this.syntax_ = fileDescriptorProto.syntax_;
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                if (fileDescriptorProto.hasEdition()) {
                    setEdition(fileDescriptorProto.getEdition());
                }
                mergeUnknownFields(fileDescriptorProto.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getMessageTypeCount(); i++) {
                    if (!getMessageType(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getEnumTypeCount(); i2++) {
                    if (!getEnumType(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getServiceCount(); i3++) {
                    if (!getService(i3).isInitialized()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < getExtensionCount(); i4++) {
                    if (!getExtension(i4).isInitialized()) {
                        return false;
                    }
                }
                return !hasOptions() || getOptions().isInitialized();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            switch (readTag) {
                                case 0:
                                    break;
                                case 10:
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    this.package_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    ByteString readBytes = codedInputStream.readBytes();
                                    ensureDependencyIsMutable();
                                    this.dependency_.add(readBytes);
                                    continue;
                                case 34:
                                    DescriptorProto descriptorProto = (DescriptorProto) codedInputStream.readMessage(DescriptorProto.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<DescriptorProto, DescriptorProto.Builder, DescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.messageTypeBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureMessageTypeIsMutable();
                                        this.messageType_.add(descriptorProto);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(descriptorProto);
                                        continue;
                                    }
                                case 42:
                                    EnumDescriptorProto enumDescriptorProto = (EnumDescriptorProto) codedInputStream.readMessage(EnumDescriptorProto.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<EnumDescriptorProto, EnumDescriptorProto.Builder, EnumDescriptorProtoOrBuilder> repeatedFieldBuilderV32 = this.enumTypeBuilder_;
                                    if (repeatedFieldBuilderV32 == null) {
                                        ensureEnumTypeIsMutable();
                                        this.enumType_.add(enumDescriptorProto);
                                    } else {
                                        repeatedFieldBuilderV32.addMessage(enumDescriptorProto);
                                        continue;
                                    }
                                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                                    ServiceDescriptorProto serviceDescriptorProto = (ServiceDescriptorProto) codedInputStream.readMessage(ServiceDescriptorProto.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ServiceDescriptorProto, ServiceDescriptorProto.Builder, ServiceDescriptorProtoOrBuilder> repeatedFieldBuilderV33 = this.serviceBuilder_;
                                    if (repeatedFieldBuilderV33 == null) {
                                        ensureServiceIsMutable();
                                        this.service_.add(serviceDescriptorProto);
                                    } else {
                                        repeatedFieldBuilderV33.addMessage(serviceDescriptorProto);
                                        continue;
                                    }
                                case 58:
                                    FieldDescriptorProto fieldDescriptorProto = (FieldDescriptorProto) codedInputStream.readMessage(FieldDescriptorProto.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> repeatedFieldBuilderV34 = this.extensionBuilder_;
                                    if (repeatedFieldBuilderV34 == null) {
                                        ensureExtensionIsMutable();
                                        this.extension_.add(fieldDescriptorProto);
                                    } else {
                                        repeatedFieldBuilderV34.addMessage(fieldDescriptorProto);
                                        continue;
                                    }
                                case 66:
                                    codedInputStream.readMessage(getOptionsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getSourceCodeInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 80:
                                    int readInt32 = codedInputStream.readInt32();
                                    ensurePublicDependencyIsMutable();
                                    this.publicDependency_.addInt(readInt32);
                                    continue;
                                case 82:
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensurePublicDependencyIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.publicDependency_.addInt(codedInputStream.readInt32());
                                    }
                                    codedInputStream.popLimit(pushLimit);
                                    continue;
                                case 88:
                                    int readInt322 = codedInputStream.readInt32();
                                    ensureWeakDependencyIsMutable();
                                    this.weakDependency_.addInt(readInt322);
                                    continue;
                                case 90:
                                    int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureWeakDependencyIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.weakDependency_.addInt(codedInputStream.readInt32());
                                    }
                                    codedInputStream.popLimit(pushLimit2);
                                    continue;
                                case 98:
                                    this.syntax_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 112:
                                    int readEnum = codedInputStream.readEnum();
                                    if (Edition.forNumber(readEnum) == null) {
                                        mergeUnknownVarintField(14, readEnum);
                                    } else {
                                        this.edition_ = readEnum;
                                        this.bitField0_ |= 4096;
                                        continue;
                                    }
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPackage(String str) {
                str.getClass();
                this.package_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private void ensureDependencyIsMutable() {
                if (!this.dependency_.isModifiable()) {
                    this.dependency_ = new LazyStringArrayList(this.dependency_);
                }
                this.bitField0_ |= 4;
            }

            private void ensurePublicDependencyIsMutable() {
                if (!this.publicDependency_.isModifiable()) {
                    this.publicDependency_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.publicDependency_);
                }
                this.bitField0_ |= 8;
            }

            private void ensureWeakDependencyIsMutable() {
                if (!this.weakDependency_.isModifiable()) {
                    this.weakDependency_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.weakDependency_);
                }
                this.bitField0_ |= 16;
            }

            private void ensureMessageTypeIsMutable() {
                if ((this.bitField0_ & 32) == 0) {
                    this.messageType_ = new ArrayList(this.messageType_);
                    this.bitField0_ |= 32;
                }
            }

            public int getMessageTypeCount() {
                RepeatedFieldBuilderV3<DescriptorProto, DescriptorProto.Builder, DescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.messageTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.messageType_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public DescriptorProto getMessageType(int i) {
                RepeatedFieldBuilderV3<DescriptorProto, DescriptorProto.Builder, DescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.messageTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.messageType_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder addMessageType(DescriptorProto descriptorProto) {
                RepeatedFieldBuilderV3<DescriptorProto, DescriptorProto.Builder, DescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.messageTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    descriptorProto.getClass();
                    ensureMessageTypeIsMutable();
                    this.messageType_.add(descriptorProto);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(descriptorProto);
                }
                return this;
            }

            private RepeatedFieldBuilderV3<DescriptorProto, DescriptorProto.Builder, DescriptorProtoOrBuilder> getMessageTypeFieldBuilder() {
                if (this.messageTypeBuilder_ == null) {
                    this.messageTypeBuilder_ = new RepeatedFieldBuilderV3<>(this.messageType_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
                    this.messageType_ = null;
                }
                return this.messageTypeBuilder_;
            }

            private void ensureEnumTypeIsMutable() {
                if ((this.bitField0_ & 64) == 0) {
                    this.enumType_ = new ArrayList(this.enumType_);
                    this.bitField0_ |= 64;
                }
            }

            public int getEnumTypeCount() {
                RepeatedFieldBuilderV3<EnumDescriptorProto, EnumDescriptorProto.Builder, EnumDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.enumTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.enumType_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public EnumDescriptorProto getEnumType(int i) {
                RepeatedFieldBuilderV3<EnumDescriptorProto, EnumDescriptorProto.Builder, EnumDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.enumTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.enumType_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<EnumDescriptorProto, EnumDescriptorProto.Builder, EnumDescriptorProtoOrBuilder> getEnumTypeFieldBuilder() {
                if (this.enumTypeBuilder_ == null) {
                    this.enumTypeBuilder_ = new RepeatedFieldBuilderV3<>(this.enumType_, (this.bitField0_ & 64) != 0, getParentForChildren(), isClean());
                    this.enumType_ = null;
                }
                return this.enumTypeBuilder_;
            }

            private void ensureServiceIsMutable() {
                if ((this.bitField0_ & 128) == 0) {
                    this.service_ = new ArrayList(this.service_);
                    this.bitField0_ |= 128;
                }
            }

            public int getServiceCount() {
                RepeatedFieldBuilderV3<ServiceDescriptorProto, ServiceDescriptorProto.Builder, ServiceDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.serviceBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.service_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public ServiceDescriptorProto getService(int i) {
                RepeatedFieldBuilderV3<ServiceDescriptorProto, ServiceDescriptorProto.Builder, ServiceDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.serviceBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.service_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<ServiceDescriptorProto, ServiceDescriptorProto.Builder, ServiceDescriptorProtoOrBuilder> getServiceFieldBuilder() {
                if (this.serviceBuilder_ == null) {
                    this.serviceBuilder_ = new RepeatedFieldBuilderV3<>(this.service_, (this.bitField0_ & 128) != 0, getParentForChildren(), isClean());
                    this.service_ = null;
                }
                return this.serviceBuilder_;
            }

            private void ensureExtensionIsMutable() {
                if ((this.bitField0_ & JSONzip.end) == 0) {
                    this.extension_ = new ArrayList(this.extension_);
                    this.bitField0_ |= JSONzip.end;
                }
            }

            public int getExtensionCount() {
                RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.extensionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extension_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public FieldDescriptorProto getExtension(int i) {
                RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.extensionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extension_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> getExtensionFieldBuilder() {
                if (this.extensionBuilder_ == null) {
                    this.extensionBuilder_ = new RepeatedFieldBuilderV3<>(this.extension_, (this.bitField0_ & JSONzip.end) != 0, getParentForChildren(), isClean());
                    this.extension_ = null;
                }
                return this.extensionBuilder_;
            }

            public FileOptions getOptions() {
                SingleFieldBuilderV3<FileOptions, FileOptions.Builder, FileOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    FileOptions fileOptions = this.options_;
                    return fileOptions == null ? FileOptions.getDefaultInstance() : fileOptions;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeOptions(FileOptions fileOptions) {
                FileOptions fileOptions2;
                SingleFieldBuilderV3<FileOptions, FileOptions.Builder, FileOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 512) == 0 || (fileOptions2 = this.options_) == null || fileOptions2 == FileOptions.getDefaultInstance()) {
                        this.options_ = fileOptions;
                    } else {
                        getOptionsBuilder().mergeFrom(fileOptions);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(fileOptions);
                }
                if (this.options_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public FileOptions.Builder getOptionsBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return getOptionsFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<FileOptions, FileOptions.Builder, FileOptionsOrBuilder> getOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new SingleFieldBuilderV3<>(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }

            public SourceCodeInfo getSourceCodeInfo() {
                SingleFieldBuilderV3<SourceCodeInfo, SourceCodeInfo.Builder, SourceCodeInfoOrBuilder> singleFieldBuilderV3 = this.sourceCodeInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    SourceCodeInfo sourceCodeInfo = this.sourceCodeInfo_;
                    return sourceCodeInfo == null ? SourceCodeInfo.getDefaultInstance() : sourceCodeInfo;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
                SourceCodeInfo sourceCodeInfo2;
                SingleFieldBuilderV3<SourceCodeInfo, SourceCodeInfo.Builder, SourceCodeInfoOrBuilder> singleFieldBuilderV3 = this.sourceCodeInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1024) == 0 || (sourceCodeInfo2 = this.sourceCodeInfo_) == null || sourceCodeInfo2 == SourceCodeInfo.getDefaultInstance()) {
                        this.sourceCodeInfo_ = sourceCodeInfo;
                    } else {
                        getSourceCodeInfoBuilder().mergeFrom(sourceCodeInfo);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(sourceCodeInfo);
                }
                if (this.sourceCodeInfo_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public SourceCodeInfo.Builder getSourceCodeInfoBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return getSourceCodeInfoFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<SourceCodeInfo, SourceCodeInfo.Builder, SourceCodeInfoOrBuilder> getSourceCodeInfoFieldBuilder() {
                if (this.sourceCodeInfoBuilder_ == null) {
                    this.sourceCodeInfoBuilder_ = new SingleFieldBuilderV3<>(getSourceCodeInfo(), getParentForChildren(), isClean());
                    this.sourceCodeInfo_ = null;
                }
                return this.sourceCodeInfoBuilder_;
            }

            public Builder setEdition(Edition edition) {
                edition.getClass();
                this.bitField0_ |= 4096;
                this.edition_ = edition.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class DescriptorProto extends GeneratedMessageV3 implements DescriptorProtoOrBuilder {
        private static final DescriptorProto DEFAULT_INSTANCE = new DescriptorProto();
        @Deprecated
        public static final Parser<DescriptorProto> PARSER = new AbstractParser<DescriptorProto>() { // from class: com.google.protobuf.DescriptorProtos.DescriptorProto.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public DescriptorProto parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = DescriptorProto.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<EnumDescriptorProto> enumType_;
        private List<ExtensionRange> extensionRange_;
        private List<FieldDescriptorProto> extension_;
        private List<FieldDescriptorProto> field_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private List<DescriptorProto> nestedType_;
        private List<OneofDescriptorProto> oneofDecl_;
        private MessageOptions options_;
        private LazyStringArrayList reservedName_;
        private List<ReservedRange> reservedRange_;

        /* loaded from: classes2.dex */
        public interface ExtensionRangeOrBuilder extends MessageOrBuilder {
        }

        /* loaded from: classes2.dex */
        public interface ReservedRangeOrBuilder extends MessageOrBuilder {
        }

        public static DescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DescriptorProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public List<EnumDescriptorProto> getEnumTypeList() {
            return this.enumType_;
        }

        public List<FieldDescriptorProto> getExtensionList() {
            return this.extension_;
        }

        public List<ExtensionRange> getExtensionRangeList() {
            return this.extensionRange_;
        }

        public List<FieldDescriptorProto> getFieldList() {
            return this.field_;
        }

        public List<DescriptorProto> getNestedTypeList() {
            return this.nestedType_;
        }

        public List<OneofDescriptorProto> getOneofDeclList() {
            return this.oneofDecl_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<DescriptorProto> getParserForType() {
            return PARSER;
        }

        public ProtocolStringList getReservedNameList() {
            return this.reservedName_;
        }

        public List<ReservedRange> getReservedRangeList() {
            return this.reservedRange_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        static /* synthetic */ int access$5776(DescriptorProto descriptorProto, int i) {
            int i2 = i | descriptorProto.bitField0_;
            descriptorProto.bitField0_ = i2;
            return i2;
        }

        private DescriptorProto(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.name_ = "";
            this.reservedName_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
        }

        private DescriptorProto() {
            this.name_ = "";
            this.reservedName_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.field_ = Collections.emptyList();
            this.extension_ = Collections.emptyList();
            this.nestedType_ = Collections.emptyList();
            this.enumType_ = Collections.emptyList();
            this.extensionRange_ = Collections.emptyList();
            this.oneofDecl_ = Collections.emptyList();
            this.reservedRange_ = Collections.emptyList();
            this.reservedName_ = LazyStringArrayList.emptyList();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new DescriptorProto();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_DescriptorProto_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_DescriptorProto_fieldAccessorTable.ensureFieldAccessorsInitialized(DescriptorProto.class, Builder.class);
        }

        /* loaded from: classes2.dex */
        public static final class ExtensionRange extends GeneratedMessageV3 implements ExtensionRangeOrBuilder {
            private static final ExtensionRange DEFAULT_INSTANCE = new ExtensionRange();
            @Deprecated
            public static final Parser<ExtensionRange> PARSER = new AbstractParser<ExtensionRange>() { // from class: com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.1
                @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
                public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return super.parseFrom(byteString, extensionRegistryLite);
                }

                @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                    return super.parseFrom(bArr);
                }

                @Override // com.google.protobuf.Parser
                public ExtensionRange parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    Builder newBuilder = ExtensionRange.newBuilder();
                    try {
                        newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                        return newBuilder.buildPartial();
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(newBuilder.buildPartial());
                    } catch (UninitializedMessageException e2) {
                        throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                    }
                }
            };
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized;
            private ExtensionRangeOptions options_;
            private int start_;

            public static ExtensionRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ExtensionRange getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
            public Parser<ExtensionRange> getParserForType() {
                return PARSER;
            }

            public int getStart() {
                return this.start_;
            }

            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasOptions() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            static /* synthetic */ int access$3576(ExtensionRange extensionRange, int i) {
                int i2 = i | extensionRange.bitField0_;
                extensionRange.bitField0_ = i2;
                return i2;
            }

            private ExtensionRange(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.start_ = 0;
                this.end_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            private ExtensionRange() {
                this.start_ = 0;
                this.end_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new ExtensionRange();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_DescriptorProto_ExtensionRange_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_DescriptorProto_ExtensionRange_fieldAccessorTable.ensureFieldAccessorsInitialized(ExtensionRange.class, Builder.class);
            }

            public ExtensionRangeOptions getOptions() {
                ExtensionRangeOptions extensionRangeOptions = this.options_;
                return extensionRangeOptions == null ? ExtensionRangeOptions.getDefaultInstance() : extensionRangeOptions;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasOptions() || getOptions().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeInt32(1, this.start_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeInt32(2, this.end_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeMessage(3, getOptions());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int computeInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeInt32Size(1, this.start_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    computeInt32Size += CodedOutputStream.computeInt32Size(2, this.end_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    computeInt32Size += CodedOutputStream.computeMessageSize(3, getOptions());
                }
                int serializedSize = computeInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ExtensionRange)) {
                    return super.equals(obj);
                }
                ExtensionRange extensionRange = (ExtensionRange) obj;
                if (hasStart() != extensionRange.hasStart()) {
                    return false;
                }
                if ((!hasStart() || getStart() == extensionRange.getStart()) && hasEnd() == extensionRange.hasEnd()) {
                    if ((!hasEnd() || getEnd() == extensionRange.getEnd()) && hasOptions() == extensionRange.hasOptions()) {
                        return (!hasOptions() || getOptions().equals(extensionRange.getOptions())) && getUnknownFields().equals(extensionRange.getUnknownFields());
                    }
                    return false;
                }
                return false;
            }

            @Override // com.google.protobuf.AbstractMessage
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = getDescriptor().hashCode() + 779;
                if (hasStart()) {
                    hashCode = (((hashCode * 37) + 1) * 53) + getStart();
                }
                if (hasEnd()) {
                    hashCode = (((hashCode * 37) + 2) * 53) + getEnd();
                }
                if (hasOptions()) {
                    hashCode = (((hashCode * 37) + 3) * 53) + getOptions().hashCode();
                }
                int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            /* loaded from: classes2.dex */
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExtensionRangeOrBuilder {
                private int bitField0_;
                private int end_;
                private SingleFieldBuilderV3<ExtensionRangeOptions, ExtensionRangeOptions.Builder, ExtensionRangeOptionsOrBuilder> optionsBuilder_;
                private ExtensionRangeOptions options_;
                private int start_;

                public boolean hasOptions() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return DescriptorProtos.internal_static_google_protobuf_DescriptorProto_ExtensionRange_fieldAccessorTable.ensureFieldAccessorsInitialized(ExtensionRange.class, Builder.class);
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getOptionsFieldBuilder();
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return DescriptorProtos.internal_static_google_protobuf_DescriptorProto_ExtensionRange_descriptor;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public ExtensionRange getDefaultInstanceForType() {
                    return ExtensionRange.getDefaultInstance();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ExtensionRange build() {
                    ExtensionRange buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ExtensionRange buildPartial() {
                    ExtensionRange extensionRange = new ExtensionRange(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(extensionRange);
                    }
                    onBuilt();
                    return extensionRange;
                }

                private void buildPartial0(ExtensionRange extensionRange) {
                    int i;
                    int i2 = this.bitField0_;
                    if ((i2 & 1) != 0) {
                        extensionRange.start_ = this.start_;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if ((i2 & 2) != 0) {
                        extensionRange.end_ = this.end_;
                        i |= 2;
                    }
                    if ((i2 & 4) != 0) {
                        SingleFieldBuilderV3<ExtensionRangeOptions, ExtensionRangeOptions.Builder, ExtensionRangeOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                        extensionRange.options_ = singleFieldBuilderV3 == null ? this.options_ : singleFieldBuilderV3.build();
                        i |= 4;
                    }
                    ExtensionRange.access$3576(extensionRange, i);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public Builder mo2781clone() {
                    return (Builder) super.mo2781clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof ExtensionRange) {
                        return mergeFrom((ExtensionRange) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(ExtensionRange extensionRange) {
                    if (extensionRange == ExtensionRange.getDefaultInstance()) {
                        return this;
                    }
                    if (extensionRange.hasStart()) {
                        setStart(extensionRange.getStart());
                    }
                    if (extensionRange.hasEnd()) {
                        setEnd(extensionRange.getEnd());
                    }
                    if (extensionRange.hasOptions()) {
                        mergeOptions(extensionRange.getOptions());
                    }
                    mergeUnknownFields(extensionRange.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return !hasOptions() || getOptions().isInitialized();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z = false;
                    while (!z) {
                        try {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 8) {
                                        this.start_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 1;
                                    } else if (readTag == 16) {
                                        this.end_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 2;
                                    } else if (readTag == 26) {
                                        codedInputStream.readMessage(getOptionsFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.bitField0_ |= 4;
                                    } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.unwrapIOException();
                            }
                        } finally {
                            onChanged();
                        }
                    }
                    return this;
                }

                public Builder setStart(int i) {
                    this.start_ = i;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setEnd(int i) {
                    this.end_ = i;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public ExtensionRangeOptions getOptions() {
                    SingleFieldBuilderV3<ExtensionRangeOptions, ExtensionRangeOptions.Builder, ExtensionRangeOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        ExtensionRangeOptions extensionRangeOptions = this.options_;
                        return extensionRangeOptions == null ? ExtensionRangeOptions.getDefaultInstance() : extensionRangeOptions;
                    }
                    return singleFieldBuilderV3.getMessage();
                }

                public Builder mergeOptions(ExtensionRangeOptions extensionRangeOptions) {
                    ExtensionRangeOptions extensionRangeOptions2;
                    SingleFieldBuilderV3<ExtensionRangeOptions, ExtensionRangeOptions.Builder, ExtensionRangeOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 4) == 0 || (extensionRangeOptions2 = this.options_) == null || extensionRangeOptions2 == ExtensionRangeOptions.getDefaultInstance()) {
                            this.options_ = extensionRangeOptions;
                        } else {
                            getOptionsBuilder().mergeFrom(extensionRangeOptions);
                        }
                    } else {
                        singleFieldBuilderV3.mergeFrom(extensionRangeOptions);
                    }
                    if (this.options_ != null) {
                        this.bitField0_ |= 4;
                        onChanged();
                    }
                    return this;
                }

                public ExtensionRangeOptions.Builder getOptionsBuilder() {
                    this.bitField0_ |= 4;
                    onChanged();
                    return getOptionsFieldBuilder().getBuilder();
                }

                private SingleFieldBuilderV3<ExtensionRangeOptions, ExtensionRangeOptions.Builder, ExtensionRangeOptionsOrBuilder> getOptionsFieldBuilder() {
                    if (this.optionsBuilder_ == null) {
                        this.optionsBuilder_ = new SingleFieldBuilderV3<>(getOptions(), getParentForChildren(), isClean());
                        this.options_ = null;
                    }
                    return this.optionsBuilder_;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }
        }

        /* loaded from: classes2.dex */
        public static final class ReservedRange extends GeneratedMessageV3 implements ReservedRangeOrBuilder {
            private static final ReservedRange DEFAULT_INSTANCE = new ReservedRange();
            @Deprecated
            public static final Parser<ReservedRange> PARSER = new AbstractParser<ReservedRange>() { // from class: com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.1
                @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
                public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return super.parseFrom(byteString, extensionRegistryLite);
                }

                @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                    return super.parseFrom(bArr);
                }

                @Override // com.google.protobuf.Parser
                public ReservedRange parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    Builder newBuilder = ReservedRange.newBuilder();
                    try {
                        newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                        return newBuilder.buildPartial();
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(newBuilder.buildPartial());
                    } catch (UninitializedMessageException e2) {
                        throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                    }
                }
            };
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized;
            private int start_;

            public static ReservedRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ReservedRange getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
            public Parser<ReservedRange> getParserForType() {
                return PARSER;
            }

            public int getStart() {
                return this.start_;
            }

            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            static /* synthetic */ int access$4376(ReservedRange reservedRange, int i) {
                int i2 = i | reservedRange.bitField0_;
                reservedRange.bitField0_ = i2;
                return i2;
            }

            private ReservedRange(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.start_ = 0;
                this.end_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            private ReservedRange() {
                this.start_ = 0;
                this.end_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new ReservedRange();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_DescriptorProto_ReservedRange_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_DescriptorProto_ReservedRange_fieldAccessorTable.ensureFieldAccessorsInitialized(ReservedRange.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeInt32(1, this.start_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeInt32(2, this.end_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int computeInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeInt32Size(1, this.start_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    computeInt32Size += CodedOutputStream.computeInt32Size(2, this.end_);
                }
                int serializedSize = computeInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ReservedRange)) {
                    return super.equals(obj);
                }
                ReservedRange reservedRange = (ReservedRange) obj;
                if (hasStart() != reservedRange.hasStart()) {
                    return false;
                }
                if ((!hasStart() || getStart() == reservedRange.getStart()) && hasEnd() == reservedRange.hasEnd()) {
                    return (!hasEnd() || getEnd() == reservedRange.getEnd()) && getUnknownFields().equals(reservedRange.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.AbstractMessage
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = getDescriptor().hashCode() + 779;
                if (hasStart()) {
                    hashCode = (((hashCode * 37) + 1) * 53) + getStart();
                }
                if (hasEnd()) {
                    hashCode = (((hashCode * 37) + 2) * 53) + getEnd();
                }
                int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            /* loaded from: classes2.dex */
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ReservedRangeOrBuilder {
                private int bitField0_;
                private int end_;
                private int start_;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return DescriptorProtos.internal_static_google_protobuf_DescriptorProto_ReservedRange_fieldAccessorTable.ensureFieldAccessorsInitialized(ReservedRange.class, Builder.class);
                }

                private Builder() {
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return DescriptorProtos.internal_static_google_protobuf_DescriptorProto_ReservedRange_descriptor;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public ReservedRange getDefaultInstanceForType() {
                    return ReservedRange.getDefaultInstance();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ReservedRange build() {
                    ReservedRange buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ReservedRange buildPartial() {
                    ReservedRange reservedRange = new ReservedRange(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(reservedRange);
                    }
                    onBuilt();
                    return reservedRange;
                }

                private void buildPartial0(ReservedRange reservedRange) {
                    int i;
                    int i2 = this.bitField0_;
                    if ((i2 & 1) != 0) {
                        reservedRange.start_ = this.start_;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if ((i2 & 2) != 0) {
                        reservedRange.end_ = this.end_;
                        i |= 2;
                    }
                    ReservedRange.access$4376(reservedRange, i);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public Builder mo2781clone() {
                    return (Builder) super.mo2781clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof ReservedRange) {
                        return mergeFrom((ReservedRange) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(ReservedRange reservedRange) {
                    if (reservedRange == ReservedRange.getDefaultInstance()) {
                        return this;
                    }
                    if (reservedRange.hasStart()) {
                        setStart(reservedRange.getStart());
                    }
                    if (reservedRange.hasEnd()) {
                        setEnd(reservedRange.getEnd());
                    }
                    mergeUnknownFields(reservedRange.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z = false;
                    while (!z) {
                        try {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 8) {
                                        this.start_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 1;
                                    } else if (readTag == 16) {
                                        this.end_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 2;
                                    } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.unwrapIOException();
                            }
                        } finally {
                            onChanged();
                        }
                    }
                    return this;
                }

                public Builder setStart(int i) {
                    this.start_ = i;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setEnd(int i) {
                    this.end_ = i;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        public int getFieldCount() {
            return this.field_.size();
        }

        public FieldDescriptorProto getField(int i) {
            return this.field_.get(i);
        }

        public int getExtensionCount() {
            return this.extension_.size();
        }

        public FieldDescriptorProto getExtension(int i) {
            return this.extension_.get(i);
        }

        public int getNestedTypeCount() {
            return this.nestedType_.size();
        }

        public DescriptorProto getNestedType(int i) {
            return this.nestedType_.get(i);
        }

        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        public EnumDescriptorProto getEnumType(int i) {
            return this.enumType_.get(i);
        }

        public int getExtensionRangeCount() {
            return this.extensionRange_.size();
        }

        public ExtensionRange getExtensionRange(int i) {
            return this.extensionRange_.get(i);
        }

        public int getOneofDeclCount() {
            return this.oneofDecl_.size();
        }

        public OneofDescriptorProto getOneofDecl(int i) {
            return this.oneofDecl_.get(i);
        }

        public MessageOptions getOptions() {
            MessageOptions messageOptions = this.options_;
            return messageOptions == null ? MessageOptions.getDefaultInstance() : messageOptions;
        }

        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getFieldCount(); i++) {
                if (!getField(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getExtensionCount(); i2++) {
                if (!getExtension(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getNestedTypeCount(); i3++) {
                if (!getNestedType(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < getEnumTypeCount(); i4++) {
                if (!getEnumType(i4).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < getExtensionRangeCount(); i5++) {
                if (!getExtensionRange(i5).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getOneofDeclCount(); i6++) {
                if (!getOneofDecl(i6).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            for (int i = 0; i < this.field_.size(); i++) {
                codedOutputStream.writeMessage(2, this.field_.get(i));
            }
            for (int i2 = 0; i2 < this.nestedType_.size(); i2++) {
                codedOutputStream.writeMessage(3, this.nestedType_.get(i2));
            }
            for (int i3 = 0; i3 < this.enumType_.size(); i3++) {
                codedOutputStream.writeMessage(4, this.enumType_.get(i3));
            }
            for (int i4 = 0; i4 < this.extensionRange_.size(); i4++) {
                codedOutputStream.writeMessage(5, this.extensionRange_.get(i4));
            }
            for (int i5 = 0; i5 < this.extension_.size(); i5++) {
                codedOutputStream.writeMessage(6, this.extension_.get(i5));
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(7, getOptions());
            }
            for (int i6 = 0; i6 < this.oneofDecl_.size(); i6++) {
                codedOutputStream.writeMessage(8, this.oneofDecl_.get(i6));
            }
            for (int i7 = 0; i7 < this.reservedRange_.size(); i7++) {
                codedOutputStream.writeMessage(9, this.reservedRange_.get(i7));
            }
            for (int i8 = 0; i8 < this.reservedName_.size(); i8++) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.reservedName_.getRaw(i8));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            for (int i2 = 0; i2 < this.field_.size(); i2++) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, this.field_.get(i2));
            }
            for (int i3 = 0; i3 < this.nestedType_.size(); i3++) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, this.nestedType_.get(i3));
            }
            for (int i4 = 0; i4 < this.enumType_.size(); i4++) {
                computeStringSize += CodedOutputStream.computeMessageSize(4, this.enumType_.get(i4));
            }
            for (int i5 = 0; i5 < this.extensionRange_.size(); i5++) {
                computeStringSize += CodedOutputStream.computeMessageSize(5, this.extensionRange_.get(i5));
            }
            for (int i6 = 0; i6 < this.extension_.size(); i6++) {
                computeStringSize += CodedOutputStream.computeMessageSize(6, this.extension_.get(i6));
            }
            if ((this.bitField0_ & 2) != 0) {
                computeStringSize += CodedOutputStream.computeMessageSize(7, getOptions());
            }
            for (int i7 = 0; i7 < this.oneofDecl_.size(); i7++) {
                computeStringSize += CodedOutputStream.computeMessageSize(8, this.oneofDecl_.get(i7));
            }
            for (int i8 = 0; i8 < this.reservedRange_.size(); i8++) {
                computeStringSize += CodedOutputStream.computeMessageSize(9, this.reservedRange_.get(i8));
            }
            int i9 = 0;
            for (int i10 = 0; i10 < this.reservedName_.size(); i10++) {
                i9 += GeneratedMessageV3.computeStringSizeNoTag(this.reservedName_.getRaw(i10));
            }
            int size = computeStringSize + i9 + getReservedNameList().size() + getUnknownFields().getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DescriptorProto)) {
                return super.equals(obj);
            }
            DescriptorProto descriptorProto = (DescriptorProto) obj;
            if (hasName() != descriptorProto.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(descriptorProto.getName())) && getFieldList().equals(descriptorProto.getFieldList()) && getExtensionList().equals(descriptorProto.getExtensionList()) && getNestedTypeList().equals(descriptorProto.getNestedTypeList()) && getEnumTypeList().equals(descriptorProto.getEnumTypeList()) && getExtensionRangeList().equals(descriptorProto.getExtensionRangeList()) && getOneofDeclList().equals(descriptorProto.getOneofDeclList()) && hasOptions() == descriptorProto.hasOptions()) {
                return (!hasOptions() || getOptions().equals(descriptorProto.getOptions())) && getReservedRangeList().equals(descriptorProto.getReservedRangeList()) && getReservedNameList().equals(descriptorProto.getReservedNameList()) && getUnknownFields().equals(descriptorProto.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasName()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (getFieldCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getFieldList().hashCode();
            }
            if (getExtensionCount() > 0) {
                hashCode = (((hashCode * 37) + 6) * 53) + getExtensionList().hashCode();
            }
            if (getNestedTypeCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + getNestedTypeList().hashCode();
            }
            if (getEnumTypeCount() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + getEnumTypeList().hashCode();
            }
            if (getExtensionRangeCount() > 0) {
                hashCode = (((hashCode * 37) + 5) * 53) + getExtensionRangeList().hashCode();
            }
            if (getOneofDeclCount() > 0) {
                hashCode = (((hashCode * 37) + 8) * 53) + getOneofDeclList().hashCode();
            }
            if (hasOptions()) {
                hashCode = (((hashCode * 37) + 7) * 53) + getOptions().hashCode();
            }
            if (getReservedRangeCount() > 0) {
                hashCode = (((hashCode * 37) + 9) * 53) + getReservedRangeList().hashCode();
            }
            if (getReservedNameCount() > 0) {
                hashCode = (((hashCode * 37) + 10) * 53) + getReservedNameList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DescriptorProtoOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<EnumDescriptorProto, EnumDescriptorProto.Builder, EnumDescriptorProtoOrBuilder> enumTypeBuilder_;
            private List<EnumDescriptorProto> enumType_;
            private RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> extensionBuilder_;
            private RepeatedFieldBuilderV3<ExtensionRange, ExtensionRange.Builder, ExtensionRangeOrBuilder> extensionRangeBuilder_;
            private List<ExtensionRange> extensionRange_;
            private List<FieldDescriptorProto> extension_;
            private RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> fieldBuilder_;
            private List<FieldDescriptorProto> field_;
            private Object name_;
            private RepeatedFieldBuilderV3<DescriptorProto, Builder, DescriptorProtoOrBuilder> nestedTypeBuilder_;
            private List<DescriptorProto> nestedType_;
            private RepeatedFieldBuilderV3<OneofDescriptorProto, OneofDescriptorProto.Builder, OneofDescriptorProtoOrBuilder> oneofDeclBuilder_;
            private List<OneofDescriptorProto> oneofDecl_;
            private SingleFieldBuilderV3<MessageOptions, MessageOptions.Builder, MessageOptionsOrBuilder> optionsBuilder_;
            private MessageOptions options_;
            private LazyStringArrayList reservedName_;
            private RepeatedFieldBuilderV3<ReservedRange, ReservedRange.Builder, ReservedRangeOrBuilder> reservedRangeBuilder_;
            private List<ReservedRange> reservedRange_;

            public boolean hasOptions() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_DescriptorProto_fieldAccessorTable.ensureFieldAccessorsInitialized(DescriptorProto.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.field_ = Collections.emptyList();
                this.extension_ = Collections.emptyList();
                this.nestedType_ = Collections.emptyList();
                this.enumType_ = Collections.emptyList();
                this.extensionRange_ = Collections.emptyList();
                this.oneofDecl_ = Collections.emptyList();
                this.reservedRange_ = Collections.emptyList();
                this.reservedName_ = LazyStringArrayList.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.field_ = Collections.emptyList();
                this.extension_ = Collections.emptyList();
                this.nestedType_ = Collections.emptyList();
                this.enumType_ = Collections.emptyList();
                this.extensionRange_ = Collections.emptyList();
                this.oneofDecl_ = Collections.emptyList();
                this.reservedRange_ = Collections.emptyList();
                this.reservedName_ = LazyStringArrayList.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getFieldFieldBuilder();
                    getExtensionFieldBuilder();
                    getNestedTypeFieldBuilder();
                    getEnumTypeFieldBuilder();
                    getExtensionRangeFieldBuilder();
                    getOneofDeclFieldBuilder();
                    getOptionsFieldBuilder();
                    getReservedRangeFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_DescriptorProto_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DescriptorProto getDefaultInstanceForType() {
                return DescriptorProto.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DescriptorProto build() {
                DescriptorProto buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DescriptorProto buildPartial() {
                DescriptorProto descriptorProto = new DescriptorProto(this);
                buildPartialRepeatedFields(descriptorProto);
                if (this.bitField0_ != 0) {
                    buildPartial0(descriptorProto);
                }
                onBuilt();
                return descriptorProto;
            }

            private void buildPartialRepeatedFields(DescriptorProto descriptorProto) {
                RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.fieldBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.field_ = Collections.unmodifiableList(this.field_);
                        this.bitField0_ &= -3;
                    }
                    descriptorProto.field_ = this.field_;
                } else {
                    descriptorProto.field_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> repeatedFieldBuilderV32 = this.extensionBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    if ((this.bitField0_ & 4) != 0) {
                        this.extension_ = Collections.unmodifiableList(this.extension_);
                        this.bitField0_ &= -5;
                    }
                    descriptorProto.extension_ = this.extension_;
                } else {
                    descriptorProto.extension_ = repeatedFieldBuilderV32.build();
                }
                RepeatedFieldBuilderV3<DescriptorProto, Builder, DescriptorProtoOrBuilder> repeatedFieldBuilderV33 = this.nestedTypeBuilder_;
                if (repeatedFieldBuilderV33 == null) {
                    if ((this.bitField0_ & 8) != 0) {
                        this.nestedType_ = Collections.unmodifiableList(this.nestedType_);
                        this.bitField0_ &= -9;
                    }
                    descriptorProto.nestedType_ = this.nestedType_;
                } else {
                    descriptorProto.nestedType_ = repeatedFieldBuilderV33.build();
                }
                RepeatedFieldBuilderV3<EnumDescriptorProto, EnumDescriptorProto.Builder, EnumDescriptorProtoOrBuilder> repeatedFieldBuilderV34 = this.enumTypeBuilder_;
                if (repeatedFieldBuilderV34 == null) {
                    if ((this.bitField0_ & 16) != 0) {
                        this.enumType_ = Collections.unmodifiableList(this.enumType_);
                        this.bitField0_ &= -17;
                    }
                    descriptorProto.enumType_ = this.enumType_;
                } else {
                    descriptorProto.enumType_ = repeatedFieldBuilderV34.build();
                }
                RepeatedFieldBuilderV3<ExtensionRange, ExtensionRange.Builder, ExtensionRangeOrBuilder> repeatedFieldBuilderV35 = this.extensionRangeBuilder_;
                if (repeatedFieldBuilderV35 == null) {
                    if ((this.bitField0_ & 32) != 0) {
                        this.extensionRange_ = Collections.unmodifiableList(this.extensionRange_);
                        this.bitField0_ &= -33;
                    }
                    descriptorProto.extensionRange_ = this.extensionRange_;
                } else {
                    descriptorProto.extensionRange_ = repeatedFieldBuilderV35.build();
                }
                RepeatedFieldBuilderV3<OneofDescriptorProto, OneofDescriptorProto.Builder, OneofDescriptorProtoOrBuilder> repeatedFieldBuilderV36 = this.oneofDeclBuilder_;
                if (repeatedFieldBuilderV36 == null) {
                    if ((this.bitField0_ & 64) != 0) {
                        this.oneofDecl_ = Collections.unmodifiableList(this.oneofDecl_);
                        this.bitField0_ &= -65;
                    }
                    descriptorProto.oneofDecl_ = this.oneofDecl_;
                } else {
                    descriptorProto.oneofDecl_ = repeatedFieldBuilderV36.build();
                }
                RepeatedFieldBuilderV3<ReservedRange, ReservedRange.Builder, ReservedRangeOrBuilder> repeatedFieldBuilderV37 = this.reservedRangeBuilder_;
                if (repeatedFieldBuilderV37 == null) {
                    if ((this.bitField0_ & JSONzip.end) != 0) {
                        this.reservedRange_ = Collections.unmodifiableList(this.reservedRange_);
                        this.bitField0_ &= -257;
                    }
                    descriptorProto.reservedRange_ = this.reservedRange_;
                    return;
                }
                descriptorProto.reservedRange_ = repeatedFieldBuilderV37.build();
            }

            private void buildPartial0(DescriptorProto descriptorProto) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    descriptorProto.name_ = this.name_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 128) != 0) {
                    SingleFieldBuilderV3<MessageOptions, MessageOptions.Builder, MessageOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                    descriptorProto.options_ = singleFieldBuilderV3 == null ? this.options_ : singleFieldBuilderV3.build();
                    i |= 2;
                }
                if ((i2 & 512) != 0) {
                    this.reservedName_.makeImmutable();
                    descriptorProto.reservedName_ = this.reservedName_;
                }
                DescriptorProto.access$5776(descriptorProto, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DescriptorProto) {
                    return mergeFrom((DescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DescriptorProto descriptorProto) {
                if (descriptorProto == DescriptorProto.getDefaultInstance()) {
                    return this;
                }
                if (descriptorProto.hasName()) {
                    this.name_ = descriptorProto.name_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (this.fieldBuilder_ == null) {
                    if (!descriptorProto.field_.isEmpty()) {
                        if (this.field_.isEmpty()) {
                            this.field_ = descriptorProto.field_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureFieldIsMutable();
                            this.field_.addAll(descriptorProto.field_);
                        }
                        onChanged();
                    }
                } else if (!descriptorProto.field_.isEmpty()) {
                    if (!this.fieldBuilder_.isEmpty()) {
                        this.fieldBuilder_.addAllMessages(descriptorProto.field_);
                    } else {
                        this.fieldBuilder_.dispose();
                        this.fieldBuilder_ = null;
                        this.field_ = descriptorProto.field_;
                        this.bitField0_ &= -3;
                        this.fieldBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getFieldFieldBuilder() : null;
                    }
                }
                if (this.extensionBuilder_ == null) {
                    if (!descriptorProto.extension_.isEmpty()) {
                        if (this.extension_.isEmpty()) {
                            this.extension_ = descriptorProto.extension_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureExtensionIsMutable();
                            this.extension_.addAll(descriptorProto.extension_);
                        }
                        onChanged();
                    }
                } else if (!descriptorProto.extension_.isEmpty()) {
                    if (!this.extensionBuilder_.isEmpty()) {
                        this.extensionBuilder_.addAllMessages(descriptorProto.extension_);
                    } else {
                        this.extensionBuilder_.dispose();
                        this.extensionBuilder_ = null;
                        this.extension_ = descriptorProto.extension_;
                        this.bitField0_ &= -5;
                        this.extensionBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getExtensionFieldBuilder() : null;
                    }
                }
                if (this.nestedTypeBuilder_ == null) {
                    if (!descriptorProto.nestedType_.isEmpty()) {
                        if (this.nestedType_.isEmpty()) {
                            this.nestedType_ = descriptorProto.nestedType_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureNestedTypeIsMutable();
                            this.nestedType_.addAll(descriptorProto.nestedType_);
                        }
                        onChanged();
                    }
                } else if (!descriptorProto.nestedType_.isEmpty()) {
                    if (!this.nestedTypeBuilder_.isEmpty()) {
                        this.nestedTypeBuilder_.addAllMessages(descriptorProto.nestedType_);
                    } else {
                        this.nestedTypeBuilder_.dispose();
                        this.nestedTypeBuilder_ = null;
                        this.nestedType_ = descriptorProto.nestedType_;
                        this.bitField0_ &= -9;
                        this.nestedTypeBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getNestedTypeFieldBuilder() : null;
                    }
                }
                if (this.enumTypeBuilder_ == null) {
                    if (!descriptorProto.enumType_.isEmpty()) {
                        if (this.enumType_.isEmpty()) {
                            this.enumType_ = descriptorProto.enumType_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureEnumTypeIsMutable();
                            this.enumType_.addAll(descriptorProto.enumType_);
                        }
                        onChanged();
                    }
                } else if (!descriptorProto.enumType_.isEmpty()) {
                    if (!this.enumTypeBuilder_.isEmpty()) {
                        this.enumTypeBuilder_.addAllMessages(descriptorProto.enumType_);
                    } else {
                        this.enumTypeBuilder_.dispose();
                        this.enumTypeBuilder_ = null;
                        this.enumType_ = descriptorProto.enumType_;
                        this.bitField0_ &= -17;
                        this.enumTypeBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getEnumTypeFieldBuilder() : null;
                    }
                }
                if (this.extensionRangeBuilder_ == null) {
                    if (!descriptorProto.extensionRange_.isEmpty()) {
                        if (this.extensionRange_.isEmpty()) {
                            this.extensionRange_ = descriptorProto.extensionRange_;
                            this.bitField0_ &= -33;
                        } else {
                            ensureExtensionRangeIsMutable();
                            this.extensionRange_.addAll(descriptorProto.extensionRange_);
                        }
                        onChanged();
                    }
                } else if (!descriptorProto.extensionRange_.isEmpty()) {
                    if (!this.extensionRangeBuilder_.isEmpty()) {
                        this.extensionRangeBuilder_.addAllMessages(descriptorProto.extensionRange_);
                    } else {
                        this.extensionRangeBuilder_.dispose();
                        this.extensionRangeBuilder_ = null;
                        this.extensionRange_ = descriptorProto.extensionRange_;
                        this.bitField0_ &= -33;
                        this.extensionRangeBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getExtensionRangeFieldBuilder() : null;
                    }
                }
                if (this.oneofDeclBuilder_ == null) {
                    if (!descriptorProto.oneofDecl_.isEmpty()) {
                        if (this.oneofDecl_.isEmpty()) {
                            this.oneofDecl_ = descriptorProto.oneofDecl_;
                            this.bitField0_ &= -65;
                        } else {
                            ensureOneofDeclIsMutable();
                            this.oneofDecl_.addAll(descriptorProto.oneofDecl_);
                        }
                        onChanged();
                    }
                } else if (!descriptorProto.oneofDecl_.isEmpty()) {
                    if (!this.oneofDeclBuilder_.isEmpty()) {
                        this.oneofDeclBuilder_.addAllMessages(descriptorProto.oneofDecl_);
                    } else {
                        this.oneofDeclBuilder_.dispose();
                        this.oneofDeclBuilder_ = null;
                        this.oneofDecl_ = descriptorProto.oneofDecl_;
                        this.bitField0_ &= -65;
                        this.oneofDeclBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getOneofDeclFieldBuilder() : null;
                    }
                }
                if (descriptorProto.hasOptions()) {
                    mergeOptions(descriptorProto.getOptions());
                }
                if (this.reservedRangeBuilder_ == null) {
                    if (!descriptorProto.reservedRange_.isEmpty()) {
                        if (this.reservedRange_.isEmpty()) {
                            this.reservedRange_ = descriptorProto.reservedRange_;
                            this.bitField0_ &= -257;
                        } else {
                            ensureReservedRangeIsMutable();
                            this.reservedRange_.addAll(descriptorProto.reservedRange_);
                        }
                        onChanged();
                    }
                } else if (!descriptorProto.reservedRange_.isEmpty()) {
                    if (!this.reservedRangeBuilder_.isEmpty()) {
                        this.reservedRangeBuilder_.addAllMessages(descriptorProto.reservedRange_);
                    } else {
                        this.reservedRangeBuilder_.dispose();
                        this.reservedRangeBuilder_ = null;
                        this.reservedRange_ = descriptorProto.reservedRange_;
                        this.bitField0_ &= -257;
                        this.reservedRangeBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getReservedRangeFieldBuilder() : null;
                    }
                }
                if (!descriptorProto.reservedName_.isEmpty()) {
                    if (this.reservedName_.isEmpty()) {
                        this.reservedName_ = descriptorProto.reservedName_;
                        this.bitField0_ |= 512;
                    } else {
                        ensureReservedNameIsMutable();
                        this.reservedName_.addAll(descriptorProto.reservedName_);
                    }
                    onChanged();
                }
                mergeUnknownFields(descriptorProto.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getFieldCount(); i++) {
                    if (!getField(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getExtensionCount(); i2++) {
                    if (!getExtension(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getNestedTypeCount(); i3++) {
                    if (!getNestedType(i3).isInitialized()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < getEnumTypeCount(); i4++) {
                    if (!getEnumType(i4).isInitialized()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < getExtensionRangeCount(); i5++) {
                    if (!getExtensionRange(i5).isInitialized()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < getOneofDeclCount(); i6++) {
                    if (!getOneofDecl(i6).isInitialized()) {
                        return false;
                    }
                }
                return !hasOptions() || getOptions().isInitialized();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            switch (readTag) {
                                case 0:
                                    break;
                                case 10:
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    FieldDescriptorProto fieldDescriptorProto = (FieldDescriptorProto) codedInputStream.readMessage(FieldDescriptorProto.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.fieldBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureFieldIsMutable();
                                        this.field_.add(fieldDescriptorProto);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(fieldDescriptorProto);
                                        continue;
                                    }
                                case 26:
                                    DescriptorProto descriptorProto = (DescriptorProto) codedInputStream.readMessage(DescriptorProto.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<DescriptorProto, Builder, DescriptorProtoOrBuilder> repeatedFieldBuilderV32 = this.nestedTypeBuilder_;
                                    if (repeatedFieldBuilderV32 == null) {
                                        ensureNestedTypeIsMutable();
                                        this.nestedType_.add(descriptorProto);
                                    } else {
                                        repeatedFieldBuilderV32.addMessage(descriptorProto);
                                        continue;
                                    }
                                case 34:
                                    EnumDescriptorProto enumDescriptorProto = (EnumDescriptorProto) codedInputStream.readMessage(EnumDescriptorProto.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<EnumDescriptorProto, EnumDescriptorProto.Builder, EnumDescriptorProtoOrBuilder> repeatedFieldBuilderV33 = this.enumTypeBuilder_;
                                    if (repeatedFieldBuilderV33 == null) {
                                        ensureEnumTypeIsMutable();
                                        this.enumType_.add(enumDescriptorProto);
                                    } else {
                                        repeatedFieldBuilderV33.addMessage(enumDescriptorProto);
                                        continue;
                                    }
                                case 42:
                                    ExtensionRange extensionRange = (ExtensionRange) codedInputStream.readMessage(ExtensionRange.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ExtensionRange, ExtensionRange.Builder, ExtensionRangeOrBuilder> repeatedFieldBuilderV34 = this.extensionRangeBuilder_;
                                    if (repeatedFieldBuilderV34 == null) {
                                        ensureExtensionRangeIsMutable();
                                        this.extensionRange_.add(extensionRange);
                                    } else {
                                        repeatedFieldBuilderV34.addMessage(extensionRange);
                                        continue;
                                    }
                                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                                    FieldDescriptorProto fieldDescriptorProto2 = (FieldDescriptorProto) codedInputStream.readMessage(FieldDescriptorProto.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> repeatedFieldBuilderV35 = this.extensionBuilder_;
                                    if (repeatedFieldBuilderV35 == null) {
                                        ensureExtensionIsMutable();
                                        this.extension_.add(fieldDescriptorProto2);
                                    } else {
                                        repeatedFieldBuilderV35.addMessage(fieldDescriptorProto2);
                                        continue;
                                    }
                                case 58:
                                    codedInputStream.readMessage(getOptionsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 66:
                                    OneofDescriptorProto oneofDescriptorProto = (OneofDescriptorProto) codedInputStream.readMessage(OneofDescriptorProto.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<OneofDescriptorProto, OneofDescriptorProto.Builder, OneofDescriptorProtoOrBuilder> repeatedFieldBuilderV36 = this.oneofDeclBuilder_;
                                    if (repeatedFieldBuilderV36 == null) {
                                        ensureOneofDeclIsMutable();
                                        this.oneofDecl_.add(oneofDescriptorProto);
                                    } else {
                                        repeatedFieldBuilderV36.addMessage(oneofDescriptorProto);
                                        continue;
                                    }
                                case 74:
                                    ReservedRange reservedRange = (ReservedRange) codedInputStream.readMessage(ReservedRange.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ReservedRange, ReservedRange.Builder, ReservedRangeOrBuilder> repeatedFieldBuilderV37 = this.reservedRangeBuilder_;
                                    if (repeatedFieldBuilderV37 == null) {
                                        ensureReservedRangeIsMutable();
                                        this.reservedRange_.add(reservedRange);
                                    } else {
                                        repeatedFieldBuilderV37.addMessage(reservedRange);
                                        continue;
                                    }
                                case 82:
                                    ByteString readBytes = codedInputStream.readBytes();
                                    ensureReservedNameIsMutable();
                                    this.reservedName_.add(readBytes);
                                    continue;
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private void ensureFieldIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.field_ = new ArrayList(this.field_);
                    this.bitField0_ |= 2;
                }
            }

            public int getFieldCount() {
                RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.fieldBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.field_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public FieldDescriptorProto getField(int i) {
                RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.fieldBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.field_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> getFieldFieldBuilder() {
                if (this.fieldBuilder_ == null) {
                    this.fieldBuilder_ = new RepeatedFieldBuilderV3<>(this.field_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.field_ = null;
                }
                return this.fieldBuilder_;
            }

            private void ensureExtensionIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.extension_ = new ArrayList(this.extension_);
                    this.bitField0_ |= 4;
                }
            }

            public int getExtensionCount() {
                RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.extensionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extension_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public FieldDescriptorProto getExtension(int i) {
                RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.extensionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extension_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<FieldDescriptorProto, FieldDescriptorProto.Builder, FieldDescriptorProtoOrBuilder> getExtensionFieldBuilder() {
                if (this.extensionBuilder_ == null) {
                    this.extensionBuilder_ = new RepeatedFieldBuilderV3<>(this.extension_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.extension_ = null;
                }
                return this.extensionBuilder_;
            }

            private void ensureNestedTypeIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.nestedType_ = new ArrayList(this.nestedType_);
                    this.bitField0_ |= 8;
                }
            }

            public int getNestedTypeCount() {
                RepeatedFieldBuilderV3<DescriptorProto, Builder, DescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.nestedTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.nestedType_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public DescriptorProto getNestedType(int i) {
                RepeatedFieldBuilderV3<DescriptorProto, Builder, DescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.nestedTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.nestedType_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<DescriptorProto, Builder, DescriptorProtoOrBuilder> getNestedTypeFieldBuilder() {
                if (this.nestedTypeBuilder_ == null) {
                    this.nestedTypeBuilder_ = new RepeatedFieldBuilderV3<>(this.nestedType_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.nestedType_ = null;
                }
                return this.nestedTypeBuilder_;
            }

            private void ensureEnumTypeIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.enumType_ = new ArrayList(this.enumType_);
                    this.bitField0_ |= 16;
                }
            }

            public int getEnumTypeCount() {
                RepeatedFieldBuilderV3<EnumDescriptorProto, EnumDescriptorProto.Builder, EnumDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.enumTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.enumType_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public EnumDescriptorProto getEnumType(int i) {
                RepeatedFieldBuilderV3<EnumDescriptorProto, EnumDescriptorProto.Builder, EnumDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.enumTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.enumType_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<EnumDescriptorProto, EnumDescriptorProto.Builder, EnumDescriptorProtoOrBuilder> getEnumTypeFieldBuilder() {
                if (this.enumTypeBuilder_ == null) {
                    this.enumTypeBuilder_ = new RepeatedFieldBuilderV3<>(this.enumType_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.enumType_ = null;
                }
                return this.enumTypeBuilder_;
            }

            private void ensureExtensionRangeIsMutable() {
                if ((this.bitField0_ & 32) == 0) {
                    this.extensionRange_ = new ArrayList(this.extensionRange_);
                    this.bitField0_ |= 32;
                }
            }

            public int getExtensionRangeCount() {
                RepeatedFieldBuilderV3<ExtensionRange, ExtensionRange.Builder, ExtensionRangeOrBuilder> repeatedFieldBuilderV3 = this.extensionRangeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extensionRange_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public ExtensionRange getExtensionRange(int i) {
                RepeatedFieldBuilderV3<ExtensionRange, ExtensionRange.Builder, ExtensionRangeOrBuilder> repeatedFieldBuilderV3 = this.extensionRangeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extensionRange_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder addExtensionRange(ExtensionRange extensionRange) {
                RepeatedFieldBuilderV3<ExtensionRange, ExtensionRange.Builder, ExtensionRangeOrBuilder> repeatedFieldBuilderV3 = this.extensionRangeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    extensionRange.getClass();
                    ensureExtensionRangeIsMutable();
                    this.extensionRange_.add(extensionRange);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(extensionRange);
                }
                return this;
            }

            private RepeatedFieldBuilderV3<ExtensionRange, ExtensionRange.Builder, ExtensionRangeOrBuilder> getExtensionRangeFieldBuilder() {
                if (this.extensionRangeBuilder_ == null) {
                    this.extensionRangeBuilder_ = new RepeatedFieldBuilderV3<>(this.extensionRange_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
                    this.extensionRange_ = null;
                }
                return this.extensionRangeBuilder_;
            }

            private void ensureOneofDeclIsMutable() {
                if ((this.bitField0_ & 64) == 0) {
                    this.oneofDecl_ = new ArrayList(this.oneofDecl_);
                    this.bitField0_ |= 64;
                }
            }

            public int getOneofDeclCount() {
                RepeatedFieldBuilderV3<OneofDescriptorProto, OneofDescriptorProto.Builder, OneofDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.oneofDeclBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.oneofDecl_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public OneofDescriptorProto getOneofDecl(int i) {
                RepeatedFieldBuilderV3<OneofDescriptorProto, OneofDescriptorProto.Builder, OneofDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.oneofDeclBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.oneofDecl_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<OneofDescriptorProto, OneofDescriptorProto.Builder, OneofDescriptorProtoOrBuilder> getOneofDeclFieldBuilder() {
                if (this.oneofDeclBuilder_ == null) {
                    this.oneofDeclBuilder_ = new RepeatedFieldBuilderV3<>(this.oneofDecl_, (this.bitField0_ & 64) != 0, getParentForChildren(), isClean());
                    this.oneofDecl_ = null;
                }
                return this.oneofDeclBuilder_;
            }

            public MessageOptions getOptions() {
                SingleFieldBuilderV3<MessageOptions, MessageOptions.Builder, MessageOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    MessageOptions messageOptions = this.options_;
                    return messageOptions == null ? MessageOptions.getDefaultInstance() : messageOptions;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeOptions(MessageOptions messageOptions) {
                MessageOptions messageOptions2;
                SingleFieldBuilderV3<MessageOptions, MessageOptions.Builder, MessageOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 128) == 0 || (messageOptions2 = this.options_) == null || messageOptions2 == MessageOptions.getDefaultInstance()) {
                        this.options_ = messageOptions;
                    } else {
                        getOptionsBuilder().mergeFrom(messageOptions);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(messageOptions);
                }
                if (this.options_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public MessageOptions.Builder getOptionsBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return getOptionsFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<MessageOptions, MessageOptions.Builder, MessageOptionsOrBuilder> getOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new SingleFieldBuilderV3<>(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }

            private void ensureReservedRangeIsMutable() {
                if ((this.bitField0_ & JSONzip.end) == 0) {
                    this.reservedRange_ = new ArrayList(this.reservedRange_);
                    this.bitField0_ |= JSONzip.end;
                }
            }

            private RepeatedFieldBuilderV3<ReservedRange, ReservedRange.Builder, ReservedRangeOrBuilder> getReservedRangeFieldBuilder() {
                if (this.reservedRangeBuilder_ == null) {
                    this.reservedRangeBuilder_ = new RepeatedFieldBuilderV3<>(this.reservedRange_, (this.bitField0_ & JSONzip.end) != 0, getParentForChildren(), isClean());
                    this.reservedRange_ = null;
                }
                return this.reservedRangeBuilder_;
            }

            private void ensureReservedNameIsMutable() {
                if (!this.reservedName_.isModifiable()) {
                    this.reservedName_ = new LazyStringArrayList(this.reservedName_);
                }
                this.bitField0_ |= 512;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class ExtensionRangeOptions extends GeneratedMessageV3.ExtendableMessage<ExtensionRangeOptions> implements ExtensionRangeOptionsOrBuilder {
        private static final ExtensionRangeOptions DEFAULT_INSTANCE = new ExtensionRangeOptions();
        @Deprecated
        public static final Parser<ExtensionRangeOptions> PARSER = new AbstractParser<ExtensionRangeOptions>() { // from class: com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public ExtensionRangeOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = ExtensionRangeOptions.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<Declaration> declaration_;
        private FeatureSet features_;
        private byte memoizedIsInitialized;
        private List<UninterpretedOption> uninterpretedOption_;
        private int verification_;

        /* loaded from: classes2.dex */
        public interface DeclarationOrBuilder extends MessageOrBuilder {
        }

        public static ExtensionRangeOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public List<Declaration> getDeclarationList() {
            return this.declaration_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ExtensionRangeOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<ExtensionRangeOptions> getParserForType() {
            return PARSER;
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public boolean hasFeatures() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasVerification() {
            return (this.bitField0_ & 2) != 0;
        }

        static /* synthetic */ int access$7876(ExtensionRangeOptions extensionRangeOptions, int i) {
            int i2 = i | extensionRangeOptions.bitField0_;
            extensionRangeOptions.bitField0_ = i2;
            return i2;
        }

        private ExtensionRangeOptions(GeneratedMessageV3.ExtendableBuilder<ExtensionRangeOptions, ?> extendableBuilder) {
            super(extendableBuilder);
            this.verification_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        private ExtensionRangeOptions() {
            this.verification_ = 1;
            this.memoizedIsInitialized = (byte) -1;
            this.uninterpretedOption_ = Collections.emptyList();
            this.declaration_ = Collections.emptyList();
            this.verification_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new ExtensionRangeOptions();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_ExtensionRangeOptions_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_ExtensionRangeOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(ExtensionRangeOptions.class, Builder.class);
        }

        /* loaded from: classes2.dex */
        public enum VerificationState implements ProtocolMessageEnum {
            DECLARATION(0),
            UNVERIFIED(1);
            
            private final int value;
            private static final Internal.EnumLiteMap<VerificationState> internalValueMap = new Internal.EnumLiteMap<VerificationState>() { // from class: com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.VerificationState.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public VerificationState findValueByNumber(int i) {
                    return VerificationState.forNumber(i);
                }
            };
            private static final VerificationState[] VALUES = values();

            public static VerificationState forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        return null;
                    }
                    return UNVERIFIED;
                }
                return DECLARATION;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            VerificationState(int i) {
                this.value = i;
            }
        }

        /* loaded from: classes2.dex */
        public static final class Declaration extends GeneratedMessageV3 implements DeclarationOrBuilder {
            private static final Declaration DEFAULT_INSTANCE = new Declaration();
            @Deprecated
            public static final Parser<Declaration> PARSER = new AbstractParser<Declaration>() { // from class: com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Declaration.1
                @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
                public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return super.parseFrom(byteString, extensionRegistryLite);
                }

                @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                    return super.parseFrom(bArr);
                }

                @Override // com.google.protobuf.Parser
                public Declaration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    Builder newBuilder = Declaration.newBuilder();
                    try {
                        newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                        return newBuilder.buildPartial();
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(newBuilder.buildPartial());
                    } catch (UninitializedMessageException e2) {
                        throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                    }
                }
            };
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private volatile Object fullName_;
            private byte memoizedIsInitialized;
            private int number_;
            private boolean repeated_;
            private boolean reserved_;
            private volatile Object type_;

            public static Declaration getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Declaration getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public int getNumber() {
                return this.number_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
            public Parser<Declaration> getParserForType() {
                return PARSER;
            }

            public boolean getRepeated() {
                return this.repeated_;
            }

            public boolean getReserved() {
                return this.reserved_;
            }

            public boolean hasFullName() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasNumber() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasRepeated() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasReserved() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            static /* synthetic */ int access$7076(Declaration declaration, int i) {
                int i2 = i | declaration.bitField0_;
                declaration.bitField0_ = i2;
                return i2;
            }

            private Declaration(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.number_ = 0;
                this.fullName_ = "";
                this.type_ = "";
                this.reserved_ = false;
                this.repeated_ = false;
                this.memoizedIsInitialized = (byte) -1;
            }

            private Declaration() {
                this.number_ = 0;
                this.fullName_ = "";
                this.type_ = "";
                this.reserved_ = false;
                this.repeated_ = false;
                this.memoizedIsInitialized = (byte) -1;
                this.fullName_ = "";
                this.type_ = "";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Declaration();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_ExtensionRangeOptions_Declaration_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_ExtensionRangeOptions_Declaration_fieldAccessorTable.ensureFieldAccessorsInitialized(Declaration.class, Builder.class);
            }

            public String getFullName() {
                Object obj = this.fullName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.fullName_ = stringUtf8;
                }
                return stringUtf8;
            }

            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.type_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeInt32(1, this.number_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.fullName_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.type_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    codedOutputStream.writeBool(5, this.reserved_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    codedOutputStream.writeBool(6, this.repeated_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int computeInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeInt32Size(1, this.number_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    computeInt32Size += GeneratedMessageV3.computeStringSize(2, this.fullName_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    computeInt32Size += GeneratedMessageV3.computeStringSize(3, this.type_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    computeInt32Size += CodedOutputStream.computeBoolSize(5, this.reserved_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    computeInt32Size += CodedOutputStream.computeBoolSize(6, this.repeated_);
                }
                int serializedSize = computeInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Declaration)) {
                    return super.equals(obj);
                }
                Declaration declaration = (Declaration) obj;
                if (hasNumber() != declaration.hasNumber()) {
                    return false;
                }
                if ((!hasNumber() || getNumber() == declaration.getNumber()) && hasFullName() == declaration.hasFullName()) {
                    if ((!hasFullName() || getFullName().equals(declaration.getFullName())) && hasType() == declaration.hasType()) {
                        if ((!hasType() || getType().equals(declaration.getType())) && hasReserved() == declaration.hasReserved()) {
                            if ((!hasReserved() || getReserved() == declaration.getReserved()) && hasRepeated() == declaration.hasRepeated()) {
                                return (!hasRepeated() || getRepeated() == declaration.getRepeated()) && getUnknownFields().equals(declaration.getUnknownFields());
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }

            @Override // com.google.protobuf.AbstractMessage
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = getDescriptor().hashCode() + 779;
                if (hasNumber()) {
                    hashCode = (((hashCode * 37) + 1) * 53) + getNumber();
                }
                if (hasFullName()) {
                    hashCode = (((hashCode * 37) + 2) * 53) + getFullName().hashCode();
                }
                if (hasType()) {
                    hashCode = (((hashCode * 37) + 3) * 53) + getType().hashCode();
                }
                if (hasReserved()) {
                    hashCode = (((hashCode * 37) + 5) * 53) + Internal.hashBoolean(getReserved());
                }
                if (hasRepeated()) {
                    hashCode = (((hashCode * 37) + 6) * 53) + Internal.hashBoolean(getRepeated());
                }
                int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            /* loaded from: classes2.dex */
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeclarationOrBuilder {
                private int bitField0_;
                private Object fullName_;
                private int number_;
                private boolean repeated_;
                private boolean reserved_;
                private Object type_;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return DescriptorProtos.internal_static_google_protobuf_ExtensionRangeOptions_Declaration_fieldAccessorTable.ensureFieldAccessorsInitialized(Declaration.class, Builder.class);
                }

                private Builder() {
                    this.fullName_ = "";
                    this.type_ = "";
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.fullName_ = "";
                    this.type_ = "";
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return DescriptorProtos.internal_static_google_protobuf_ExtensionRangeOptions_Declaration_descriptor;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public Declaration getDefaultInstanceForType() {
                    return Declaration.getDefaultInstance();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Declaration build() {
                    Declaration buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Declaration buildPartial() {
                    Declaration declaration = new Declaration(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(declaration);
                    }
                    onBuilt();
                    return declaration;
                }

                private void buildPartial0(Declaration declaration) {
                    int i;
                    int i2 = this.bitField0_;
                    if ((i2 & 1) != 0) {
                        declaration.number_ = this.number_;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if ((i2 & 2) != 0) {
                        declaration.fullName_ = this.fullName_;
                        i |= 2;
                    }
                    if ((i2 & 4) != 0) {
                        declaration.type_ = this.type_;
                        i |= 4;
                    }
                    if ((i2 & 8) != 0) {
                        declaration.reserved_ = this.reserved_;
                        i |= 8;
                    }
                    if ((i2 & 16) != 0) {
                        declaration.repeated_ = this.repeated_;
                        i |= 16;
                    }
                    Declaration.access$7076(declaration, i);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public Builder mo2781clone() {
                    return (Builder) super.mo2781clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Declaration) {
                        return mergeFrom((Declaration) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Declaration declaration) {
                    if (declaration == Declaration.getDefaultInstance()) {
                        return this;
                    }
                    if (declaration.hasNumber()) {
                        setNumber(declaration.getNumber());
                    }
                    if (declaration.hasFullName()) {
                        this.fullName_ = declaration.fullName_;
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    if (declaration.hasType()) {
                        this.type_ = declaration.type_;
                        this.bitField0_ |= 4;
                        onChanged();
                    }
                    if (declaration.hasReserved()) {
                        setReserved(declaration.getReserved());
                    }
                    if (declaration.hasRepeated()) {
                        setRepeated(declaration.getRepeated());
                    }
                    mergeUnknownFields(declaration.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z = false;
                    while (!z) {
                        try {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 8) {
                                        this.number_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 1;
                                    } else if (readTag == 18) {
                                        this.fullName_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 2;
                                    } else if (readTag == 26) {
                                        this.type_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 4;
                                    } else if (readTag == 40) {
                                        this.reserved_ = codedInputStream.readBool();
                                        this.bitField0_ |= 8;
                                    } else if (readTag == 48) {
                                        this.repeated_ = codedInputStream.readBool();
                                        this.bitField0_ |= 16;
                                    } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.unwrapIOException();
                            }
                        } finally {
                            onChanged();
                        }
                    }
                    return this;
                }

                public Builder setNumber(int i) {
                    this.number_ = i;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setReserved(boolean z) {
                    this.reserved_ = z;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setRepeated(boolean z) {
                    this.repeated_ = z;
                    this.bitField0_ |= 16;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getDeclarationCount() {
            return this.declaration_.size();
        }

        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
        }

        public VerificationState getVerification() {
            VerificationState forNumber = VerificationState.forNumber(this.verification_);
            return forNumber == null ? VerificationState.UNVERIFIED : forNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasFeatures() && !getFeatures().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            for (int i = 0; i < this.declaration_.size(); i++) {
                codedOutputStream.writeMessage(2, this.declaration_.get(i));
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(3, this.verification_);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(50, getFeatures());
            }
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                codedOutputStream.writeMessage(999, this.uninterpretedOption_.get(i2));
            }
            newExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.declaration_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(2, this.declaration_.get(i3));
            }
            if ((this.bitField0_ & 2) != 0) {
                i2 += CodedOutputStream.computeEnumSize(3, this.verification_);
            }
            if ((this.bitField0_ & 1) != 0) {
                i2 += CodedOutputStream.computeMessageSize(50, getFeatures());
            }
            for (int i4 = 0; i4 < this.uninterpretedOption_.size(); i4++) {
                i2 += CodedOutputStream.computeMessageSize(999, this.uninterpretedOption_.get(i4));
            }
            int extensionsSerializedSize = i2 + extensionsSerializedSize() + getUnknownFields().getSerializedSize();
            this.memoizedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExtensionRangeOptions)) {
                return super.equals(obj);
            }
            ExtensionRangeOptions extensionRangeOptions = (ExtensionRangeOptions) obj;
            if (getUninterpretedOptionList().equals(extensionRangeOptions.getUninterpretedOptionList()) && getDeclarationList().equals(extensionRangeOptions.getDeclarationList()) && hasFeatures() == extensionRangeOptions.hasFeatures()) {
                if ((!hasFeatures() || getFeatures().equals(extensionRangeOptions.getFeatures())) && hasVerification() == extensionRangeOptions.hasVerification()) {
                    return (!hasVerification() || this.verification_ == extensionRangeOptions.verification_) && getUnknownFields().equals(extensionRangeOptions.getUnknownFields()) && getExtensionFields().equals(extensionRangeOptions.getExtensionFields());
                }
                return false;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (getUninterpretedOptionCount() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            if (getDeclarationCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getDeclarationList().hashCode();
            }
            if (hasFeatures()) {
                hashCode = (((hashCode * 37) + 50) * 53) + getFeatures().hashCode();
            }
            if (hasVerification()) {
                hashCode = (((hashCode * 37) + 3) * 53) + this.verification_;
            }
            int hashFields = (AbstractMessage.hashFields(hashCode, getExtensionFields()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<ExtensionRangeOptions, Builder> implements ExtensionRangeOptionsOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<Declaration, Declaration.Builder, DeclarationOrBuilder> declarationBuilder_;
            private List<Declaration> declaration_;
            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> featuresBuilder_;
            private FeatureSet features_;
            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> uninterpretedOptionBuilder_;
            private List<UninterpretedOption> uninterpretedOption_;
            private int verification_;

            public boolean hasFeatures() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_ExtensionRangeOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(ExtensionRangeOptions.class, Builder.class);
            }

            private Builder() {
                this.uninterpretedOption_ = Collections.emptyList();
                this.declaration_ = Collections.emptyList();
                this.verification_ = 1;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.uninterpretedOption_ = Collections.emptyList();
                this.declaration_ = Collections.emptyList();
                this.verification_ = 1;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getUninterpretedOptionFieldBuilder();
                    getDeclarationFieldBuilder();
                    getFeaturesFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_ExtensionRangeOptions_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ExtensionRangeOptions getDefaultInstanceForType() {
                return ExtensionRangeOptions.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ExtensionRangeOptions build() {
                ExtensionRangeOptions buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ExtensionRangeOptions buildPartial() {
                ExtensionRangeOptions extensionRangeOptions = new ExtensionRangeOptions(this);
                buildPartialRepeatedFields(extensionRangeOptions);
                if (this.bitField0_ != 0) {
                    buildPartial0(extensionRangeOptions);
                }
                onBuilt();
                return extensionRangeOptions;
            }

            private void buildPartialRepeatedFields(ExtensionRangeOptions extensionRangeOptions) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                        this.bitField0_ &= -2;
                    }
                    extensionRangeOptions.uninterpretedOption_ = this.uninterpretedOption_;
                } else {
                    extensionRangeOptions.uninterpretedOption_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Declaration, Declaration.Builder, DeclarationOrBuilder> repeatedFieldBuilderV32 = this.declarationBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.declaration_ = Collections.unmodifiableList(this.declaration_);
                        this.bitField0_ &= -3;
                    }
                    extensionRangeOptions.declaration_ = this.declaration_;
                    return;
                }
                extensionRangeOptions.declaration_ = repeatedFieldBuilderV32.build();
            }

            private void buildPartial0(ExtensionRangeOptions extensionRangeOptions) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 4) != 0) {
                    SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                    extensionRangeOptions.features_ = singleFieldBuilderV3 == null ? this.features_ : singleFieldBuilderV3.build();
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 8) != 0) {
                    extensionRangeOptions.verification_ = this.verification_;
                    i |= 2;
                }
                ExtensionRangeOptions.access$7876(extensionRangeOptions, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ExtensionRangeOptions) {
                    return mergeFrom((ExtensionRangeOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ExtensionRangeOptions extensionRangeOptions) {
                if (extensionRangeOptions == ExtensionRangeOptions.getDefaultInstance()) {
                    return this;
                }
                if (this.uninterpretedOptionBuilder_ == null) {
                    if (!extensionRangeOptions.uninterpretedOption_.isEmpty()) {
                        if (this.uninterpretedOption_.isEmpty()) {
                            this.uninterpretedOption_ = extensionRangeOptions.uninterpretedOption_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureUninterpretedOptionIsMutable();
                            this.uninterpretedOption_.addAll(extensionRangeOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!extensionRangeOptions.uninterpretedOption_.isEmpty()) {
                    if (!this.uninterpretedOptionBuilder_.isEmpty()) {
                        this.uninterpretedOptionBuilder_.addAllMessages(extensionRangeOptions.uninterpretedOption_);
                    } else {
                        this.uninterpretedOptionBuilder_.dispose();
                        this.uninterpretedOptionBuilder_ = null;
                        this.uninterpretedOption_ = extensionRangeOptions.uninterpretedOption_;
                        this.bitField0_ &= -2;
                        this.uninterpretedOptionBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getUninterpretedOptionFieldBuilder() : null;
                    }
                }
                if (this.declarationBuilder_ == null) {
                    if (!extensionRangeOptions.declaration_.isEmpty()) {
                        if (this.declaration_.isEmpty()) {
                            this.declaration_ = extensionRangeOptions.declaration_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureDeclarationIsMutable();
                            this.declaration_.addAll(extensionRangeOptions.declaration_);
                        }
                        onChanged();
                    }
                } else if (!extensionRangeOptions.declaration_.isEmpty()) {
                    if (!this.declarationBuilder_.isEmpty()) {
                        this.declarationBuilder_.addAllMessages(extensionRangeOptions.declaration_);
                    } else {
                        this.declarationBuilder_.dispose();
                        this.declarationBuilder_ = null;
                        this.declaration_ = extensionRangeOptions.declaration_;
                        this.bitField0_ &= -3;
                        this.declarationBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getDeclarationFieldBuilder() : null;
                    }
                }
                if (extensionRangeOptions.hasFeatures()) {
                    mergeFeatures(extensionRangeOptions.getFeatures());
                }
                if (extensionRangeOptions.hasVerification()) {
                    setVerification(extensionRangeOptions.getVerification());
                }
                mergeExtensionFields(extensionRangeOptions);
                mergeUnknownFields(extensionRangeOptions.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                    if (!getUninterpretedOption(i).isInitialized()) {
                        return false;
                    }
                }
                return (!hasFeatures() || getFeatures().isInitialized()) && extensionsAreInitialized();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 18) {
                                    Declaration declaration = (Declaration) codedInputStream.readMessage(Declaration.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Declaration, Declaration.Builder, DeclarationOrBuilder> repeatedFieldBuilderV3 = this.declarationBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureDeclarationIsMutable();
                                        this.declaration_.add(declaration);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(declaration);
                                    }
                                } else if (readTag == 24) {
                                    int readEnum = codedInputStream.readEnum();
                                    if (VerificationState.forNumber(readEnum) == null) {
                                        mergeUnknownVarintField(3, readEnum);
                                    } else {
                                        this.verification_ = readEnum;
                                        this.bitField0_ |= 8;
                                    }
                                } else if (readTag == 402) {
                                    codedInputStream.readMessage(getFeaturesFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (readTag == 7994) {
                                    UninterpretedOption uninterpretedOption = (UninterpretedOption) codedInputStream.readMessage(UninterpretedOption.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV32 = this.uninterpretedOptionBuilder_;
                                    if (repeatedFieldBuilderV32 == null) {
                                        ensureUninterpretedOptionIsMutable();
                                        this.uninterpretedOption_.add(uninterpretedOption);
                                    } else {
                                        repeatedFieldBuilderV32.addMessage(uninterpretedOption);
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            private void ensureUninterpretedOptionIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                    this.bitField0_ |= 1;
                }
            }

            public int getUninterpretedOptionCount() {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> getUninterpretedOptionFieldBuilder() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOptionBuilder_ = new RepeatedFieldBuilderV3<>(this.uninterpretedOption_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.uninterpretedOption_ = null;
                }
                return this.uninterpretedOptionBuilder_;
            }

            private void ensureDeclarationIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.declaration_ = new ArrayList(this.declaration_);
                    this.bitField0_ |= 2;
                }
            }

            private RepeatedFieldBuilderV3<Declaration, Declaration.Builder, DeclarationOrBuilder> getDeclarationFieldBuilder() {
                if (this.declarationBuilder_ == null) {
                    this.declarationBuilder_ = new RepeatedFieldBuilderV3<>(this.declaration_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.declaration_ = null;
                }
                return this.declarationBuilder_;
            }

            public FeatureSet getFeatures() {
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    FeatureSet featureSet = this.features_;
                    return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                FeatureSet featureSet2;
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) == 0 || (featureSet2 = this.features_) == null || featureSet2 == FeatureSet.getDefaultInstance()) {
                        this.features_ = featureSet;
                    } else {
                        getFeaturesBuilder().mergeFrom(featureSet);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(featureSet);
                }
                if (this.features_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public FeatureSet.Builder getFeaturesBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return getFeaturesFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> getFeaturesFieldBuilder() {
                if (this.featuresBuilder_ == null) {
                    this.featuresBuilder_ = new SingleFieldBuilderV3<>(getFeatures(), getParentForChildren(), isClean());
                    this.features_ = null;
                }
                return this.featuresBuilder_;
            }

            public Builder setVerification(VerificationState verificationState) {
                verificationState.getClass();
                this.bitField0_ |= 8;
                this.verification_ = verificationState.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class FieldDescriptorProto extends GeneratedMessageV3 implements FieldDescriptorProtoOrBuilder {
        private static final FieldDescriptorProto DEFAULT_INSTANCE = new FieldDescriptorProto();
        @Deprecated
        public static final Parser<FieldDescriptorProto> PARSER = new AbstractParser<FieldDescriptorProto>() { // from class: com.google.protobuf.DescriptorProtos.FieldDescriptorProto.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public FieldDescriptorProto parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = FieldDescriptorProto.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object defaultValue_;
        private volatile Object extendee_;
        private volatile Object jsonName_;
        private int label_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private int number_;
        private int oneofIndex_;
        private FieldOptions options_;
        private boolean proto3Optional_;
        private volatile Object typeName_;
        private int type_;

        public static FieldDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FieldDescriptorProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public int getNumber() {
            return this.number_;
        }

        public int getOneofIndex() {
            return this.oneofIndex_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<FieldDescriptorProto> getParserForType() {
            return PARSER;
        }

        public boolean getProto3Optional() {
            return this.proto3Optional_;
        }

        public boolean hasDefaultValue() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasExtendee() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasJsonName() {
            return (this.bitField0_ & JSONzip.end) != 0;
        }

        public boolean hasLabel() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasOneofIndex() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasProto3Optional() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasTypeName() {
            return (this.bitField0_ & 16) != 0;
        }

        static /* synthetic */ int access$9576(FieldDescriptorProto fieldDescriptorProto, int i) {
            int i2 = i | fieldDescriptorProto.bitField0_;
            fieldDescriptorProto.bitField0_ = i2;
            return i2;
        }

        private FieldDescriptorProto(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.name_ = "";
            this.number_ = 0;
            this.label_ = 1;
            this.type_ = 1;
            this.typeName_ = "";
            this.extendee_ = "";
            this.defaultValue_ = "";
            this.oneofIndex_ = 0;
            this.jsonName_ = "";
            this.proto3Optional_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        private FieldDescriptorProto() {
            this.name_ = "";
            this.number_ = 0;
            this.label_ = 1;
            this.type_ = 1;
            this.typeName_ = "";
            this.extendee_ = "";
            this.defaultValue_ = "";
            this.oneofIndex_ = 0;
            this.jsonName_ = "";
            this.proto3Optional_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.label_ = 1;
            this.type_ = 1;
            this.typeName_ = "";
            this.extendee_ = "";
            this.defaultValue_ = "";
            this.jsonName_ = "";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new FieldDescriptorProto();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_FieldDescriptorProto_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_FieldDescriptorProto_fieldAccessorTable.ensureFieldAccessorsInitialized(FieldDescriptorProto.class, Builder.class);
        }

        /* loaded from: classes2.dex */
        public enum Type implements ProtocolMessageEnum {
            TYPE_DOUBLE(1),
            TYPE_FLOAT(2),
            TYPE_INT64(3),
            TYPE_UINT64(4),
            TYPE_INT32(5),
            TYPE_FIXED64(6),
            TYPE_FIXED32(7),
            TYPE_BOOL(8),
            TYPE_STRING(9),
            TYPE_GROUP(10),
            TYPE_MESSAGE(11),
            TYPE_BYTES(12),
            TYPE_UINT32(13),
            TYPE_ENUM(14),
            TYPE_SFIXED32(15),
            TYPE_SFIXED64(16),
            TYPE_SINT32(17),
            TYPE_SINT64(18);
            
            private final int value;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            private static final Type[] VALUES = values();

            public static Type forNumber(int i) {
                switch (i) {
                    case 1:
                        return TYPE_DOUBLE;
                    case 2:
                        return TYPE_FLOAT;
                    case 3:
                        return TYPE_INT64;
                    case 4:
                        return TYPE_UINT64;
                    case 5:
                        return TYPE_INT32;
                    case 6:
                        return TYPE_FIXED64;
                    case 7:
                        return TYPE_FIXED32;
                    case 8:
                        return TYPE_BOOL;
                    case 9:
                        return TYPE_STRING;
                    case 10:
                        return TYPE_GROUP;
                    case 11:
                        return TYPE_MESSAGE;
                    case 12:
                        return TYPE_BYTES;
                    case 13:
                        return TYPE_UINT32;
                    case 14:
                        return TYPE_ENUM;
                    case 15:
                        return TYPE_SFIXED32;
                    case 16:
                        return TYPE_SFIXED64;
                    case 17:
                        return TYPE_SINT32;
                    case 18:
                        return TYPE_SINT64;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            Type(int i) {
                this.value = i;
            }
        }

        /* loaded from: classes2.dex */
        public enum Label implements ProtocolMessageEnum {
            LABEL_OPTIONAL(1),
            LABEL_REPEATED(3),
            LABEL_REQUIRED(2);
            
            private final int value;
            private static final Internal.EnumLiteMap<Label> internalValueMap = new Internal.EnumLiteMap<Label>() { // from class: com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Label findValueByNumber(int i) {
                    return Label.forNumber(i);
                }
            };
            private static final Label[] VALUES = values();

            public static Label forNumber(int i) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return LABEL_REPEATED;
                    }
                    return LABEL_REQUIRED;
                }
                return LABEL_OPTIONAL;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            Label(int i) {
                this.value = i;
            }
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        public Label getLabel() {
            Label forNumber = Label.forNumber(this.label_);
            return forNumber == null ? Label.LABEL_OPTIONAL : forNumber;
        }

        public Type getType() {
            Type forNumber = Type.forNumber(this.type_);
            return forNumber == null ? Type.TYPE_DOUBLE : forNumber;
        }

        public String getTypeName() {
            Object obj = this.typeName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.typeName_ = stringUtf8;
            }
            return stringUtf8;
        }

        public String getExtendee() {
            Object obj = this.extendee_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.extendee_ = stringUtf8;
            }
            return stringUtf8;
        }

        public String getDefaultValue() {
            Object obj = this.defaultValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.defaultValue_ = stringUtf8;
            }
            return stringUtf8;
        }

        public String getJsonName() {
            Object obj = this.jsonName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.jsonName_ = stringUtf8;
            }
            return stringUtf8;
        }

        public FieldOptions getOptions() {
            FieldOptions fieldOptions = this.options_;
            return fieldOptions == null ? FieldOptions.getDefaultInstance() : fieldOptions;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.extendee_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeInt32(3, this.number_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(4, this.label_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(5, this.type_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.typeName_);
            }
            if ((this.bitField0_ & 64) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.defaultValue_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(8, getOptions());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeInt32(9, this.oneofIndex_);
            }
            if ((this.bitField0_ & JSONzip.end) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.jsonName_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeBool(17, this.proto3Optional_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            if ((this.bitField0_ & 32) != 0) {
                computeStringSize += GeneratedMessageV3.computeStringSize(2, this.extendee_);
            }
            if ((this.bitField0_ & 2) != 0) {
                computeStringSize += CodedOutputStream.computeInt32Size(3, this.number_);
            }
            if ((this.bitField0_ & 4) != 0) {
                computeStringSize += CodedOutputStream.computeEnumSize(4, this.label_);
            }
            if ((this.bitField0_ & 8) != 0) {
                computeStringSize += CodedOutputStream.computeEnumSize(5, this.type_);
            }
            if ((this.bitField0_ & 16) != 0) {
                computeStringSize += GeneratedMessageV3.computeStringSize(6, this.typeName_);
            }
            if ((this.bitField0_ & 64) != 0) {
                computeStringSize += GeneratedMessageV3.computeStringSize(7, this.defaultValue_);
            }
            if ((this.bitField0_ & 512) != 0) {
                computeStringSize += CodedOutputStream.computeMessageSize(8, getOptions());
            }
            if ((this.bitField0_ & 128) != 0) {
                computeStringSize += CodedOutputStream.computeInt32Size(9, this.oneofIndex_);
            }
            if ((this.bitField0_ & JSONzip.end) != 0) {
                computeStringSize += GeneratedMessageV3.computeStringSize(10, this.jsonName_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                computeStringSize += CodedOutputStream.computeBoolSize(17, this.proto3Optional_);
            }
            int serializedSize = computeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldDescriptorProto)) {
                return super.equals(obj);
            }
            FieldDescriptorProto fieldDescriptorProto = (FieldDescriptorProto) obj;
            if (hasName() != fieldDescriptorProto.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(fieldDescriptorProto.getName())) && hasNumber() == fieldDescriptorProto.hasNumber()) {
                if ((!hasNumber() || getNumber() == fieldDescriptorProto.getNumber()) && hasLabel() == fieldDescriptorProto.hasLabel()) {
                    if ((!hasLabel() || this.label_ == fieldDescriptorProto.label_) && hasType() == fieldDescriptorProto.hasType()) {
                        if ((!hasType() || this.type_ == fieldDescriptorProto.type_) && hasTypeName() == fieldDescriptorProto.hasTypeName()) {
                            if ((!hasTypeName() || getTypeName().equals(fieldDescriptorProto.getTypeName())) && hasExtendee() == fieldDescriptorProto.hasExtendee()) {
                                if ((!hasExtendee() || getExtendee().equals(fieldDescriptorProto.getExtendee())) && hasDefaultValue() == fieldDescriptorProto.hasDefaultValue()) {
                                    if ((!hasDefaultValue() || getDefaultValue().equals(fieldDescriptorProto.getDefaultValue())) && hasOneofIndex() == fieldDescriptorProto.hasOneofIndex()) {
                                        if ((!hasOneofIndex() || getOneofIndex() == fieldDescriptorProto.getOneofIndex()) && hasJsonName() == fieldDescriptorProto.hasJsonName()) {
                                            if ((!hasJsonName() || getJsonName().equals(fieldDescriptorProto.getJsonName())) && hasOptions() == fieldDescriptorProto.hasOptions()) {
                                                if ((!hasOptions() || getOptions().equals(fieldDescriptorProto.getOptions())) && hasProto3Optional() == fieldDescriptorProto.hasProto3Optional()) {
                                                    return (!hasProto3Optional() || getProto3Optional() == fieldDescriptorProto.getProto3Optional()) && getUnknownFields().equals(fieldDescriptorProto.getUnknownFields());
                                                }
                                                return false;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasName()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (hasNumber()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getNumber();
            }
            if (hasLabel()) {
                hashCode = (((hashCode * 37) + 4) * 53) + this.label_;
            }
            if (hasType()) {
                hashCode = (((hashCode * 37) + 5) * 53) + this.type_;
            }
            if (hasTypeName()) {
                hashCode = (((hashCode * 37) + 6) * 53) + getTypeName().hashCode();
            }
            if (hasExtendee()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getExtendee().hashCode();
            }
            if (hasDefaultValue()) {
                hashCode = (((hashCode * 37) + 7) * 53) + getDefaultValue().hashCode();
            }
            if (hasOneofIndex()) {
                hashCode = (((hashCode * 37) + 9) * 53) + getOneofIndex();
            }
            if (hasJsonName()) {
                hashCode = (((hashCode * 37) + 10) * 53) + getJsonName().hashCode();
            }
            if (hasOptions()) {
                hashCode = (((hashCode * 37) + 8) * 53) + getOptions().hashCode();
            }
            if (hasProto3Optional()) {
                hashCode = (((hashCode * 37) + 17) * 53) + Internal.hashBoolean(getProto3Optional());
            }
            int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FieldDescriptorProtoOrBuilder {
            private int bitField0_;
            private Object defaultValue_;
            private Object extendee_;
            private Object jsonName_;
            private int label_;
            private Object name_;
            private int number_;
            private int oneofIndex_;
            private SingleFieldBuilderV3<FieldOptions, FieldOptions.Builder, FieldOptionsOrBuilder> optionsBuilder_;
            private FieldOptions options_;
            private boolean proto3Optional_;
            private Object typeName_;
            private int type_;

            public boolean hasOptions() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_FieldDescriptorProto_fieldAccessorTable.ensureFieldAccessorsInitialized(FieldDescriptorProto.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.label_ = 1;
                this.type_ = 1;
                this.typeName_ = "";
                this.extendee_ = "";
                this.defaultValue_ = "";
                this.jsonName_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.label_ = 1;
                this.type_ = 1;
                this.typeName_ = "";
                this.extendee_ = "";
                this.defaultValue_ = "";
                this.jsonName_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getOptionsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_FieldDescriptorProto_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FieldDescriptorProto getDefaultInstanceForType() {
                return FieldDescriptorProto.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FieldDescriptorProto build() {
                FieldDescriptorProto buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FieldDescriptorProto buildPartial() {
                FieldDescriptorProto fieldDescriptorProto = new FieldDescriptorProto(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(fieldDescriptorProto);
                }
                onBuilt();
                return fieldDescriptorProto;
            }

            private void buildPartial0(FieldDescriptorProto fieldDescriptorProto) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    fieldDescriptorProto.name_ = this.name_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    fieldDescriptorProto.number_ = this.number_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    fieldDescriptorProto.label_ = this.label_;
                    i |= 4;
                }
                if ((i2 & 8) != 0) {
                    fieldDescriptorProto.type_ = this.type_;
                    i |= 8;
                }
                if ((i2 & 16) != 0) {
                    fieldDescriptorProto.typeName_ = this.typeName_;
                    i |= 16;
                }
                if ((i2 & 32) != 0) {
                    fieldDescriptorProto.extendee_ = this.extendee_;
                    i |= 32;
                }
                if ((i2 & 64) != 0) {
                    fieldDescriptorProto.defaultValue_ = this.defaultValue_;
                    i |= 64;
                }
                if ((i2 & 128) != 0) {
                    fieldDescriptorProto.oneofIndex_ = this.oneofIndex_;
                    i |= 128;
                }
                if ((i2 & JSONzip.end) != 0) {
                    fieldDescriptorProto.jsonName_ = this.jsonName_;
                    i |= JSONzip.end;
                }
                if ((i2 & 512) != 0) {
                    SingleFieldBuilderV3<FieldOptions, FieldOptions.Builder, FieldOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                    fieldDescriptorProto.options_ = singleFieldBuilderV3 == null ? this.options_ : singleFieldBuilderV3.build();
                    i |= 512;
                }
                if ((i2 & 1024) != 0) {
                    fieldDescriptorProto.proto3Optional_ = this.proto3Optional_;
                    i |= 1024;
                }
                FieldDescriptorProto.access$9576(fieldDescriptorProto, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FieldDescriptorProto) {
                    return mergeFrom((FieldDescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FieldDescriptorProto fieldDescriptorProto) {
                if (fieldDescriptorProto == FieldDescriptorProto.getDefaultInstance()) {
                    return this;
                }
                if (fieldDescriptorProto.hasName()) {
                    this.name_ = fieldDescriptorProto.name_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (fieldDescriptorProto.hasNumber()) {
                    setNumber(fieldDescriptorProto.getNumber());
                }
                if (fieldDescriptorProto.hasLabel()) {
                    setLabel(fieldDescriptorProto.getLabel());
                }
                if (fieldDescriptorProto.hasType()) {
                    setType(fieldDescriptorProto.getType());
                }
                if (fieldDescriptorProto.hasTypeName()) {
                    this.typeName_ = fieldDescriptorProto.typeName_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (fieldDescriptorProto.hasExtendee()) {
                    this.extendee_ = fieldDescriptorProto.extendee_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (fieldDescriptorProto.hasDefaultValue()) {
                    this.defaultValue_ = fieldDescriptorProto.defaultValue_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (fieldDescriptorProto.hasOneofIndex()) {
                    setOneofIndex(fieldDescriptorProto.getOneofIndex());
                }
                if (fieldDescriptorProto.hasJsonName()) {
                    this.jsonName_ = fieldDescriptorProto.jsonName_;
                    this.bitField0_ |= JSONzip.end;
                    onChanged();
                }
                if (fieldDescriptorProto.hasOptions()) {
                    mergeOptions(fieldDescriptorProto.getOptions());
                }
                if (fieldDescriptorProto.hasProto3Optional()) {
                    setProto3Optional(fieldDescriptorProto.getProto3Optional());
                }
                mergeUnknownFields(fieldDescriptorProto.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasOptions() || getOptions().isInitialized();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            switch (readTag) {
                                case 0:
                                    break;
                                case 10:
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    this.extendee_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 24:
                                    this.number_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 32:
                                    int readEnum = codedInputStream.readEnum();
                                    if (Label.forNumber(readEnum) == null) {
                                        mergeUnknownVarintField(4, readEnum);
                                    } else {
                                        this.label_ = readEnum;
                                        this.bitField0_ |= 4;
                                        continue;
                                    }
                                case JSONzip.substringLimit /* 40 */:
                                    int readEnum2 = codedInputStream.readEnum();
                                    if (Type.forNumber(readEnum2) == null) {
                                        mergeUnknownVarintField(5, readEnum2);
                                    } else {
                                        this.type_ = readEnum2;
                                        this.bitField0_ |= 8;
                                        continue;
                                    }
                                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                                    this.typeName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 58:
                                    this.defaultValue_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getOptionsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 72:
                                    this.oneofIndex_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 82:
                                    this.jsonName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= JSONzip.end;
                                    continue;
                                case 136:
                                    this.proto3Optional_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1024;
                                    continue;
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            public Builder setNumber(int i) {
                this.number_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setLabel(Label label) {
                label.getClass();
                this.bitField0_ |= 4;
                this.label_ = label.getNumber();
                onChanged();
                return this;
            }

            public Builder setType(Type type) {
                type.getClass();
                this.bitField0_ |= 8;
                this.type_ = type.getNumber();
                onChanged();
                return this;
            }

            public Builder setOneofIndex(int i) {
                this.oneofIndex_ = i;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public FieldOptions getOptions() {
                SingleFieldBuilderV3<FieldOptions, FieldOptions.Builder, FieldOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    FieldOptions fieldOptions = this.options_;
                    return fieldOptions == null ? FieldOptions.getDefaultInstance() : fieldOptions;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeOptions(FieldOptions fieldOptions) {
                FieldOptions fieldOptions2;
                SingleFieldBuilderV3<FieldOptions, FieldOptions.Builder, FieldOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 512) == 0 || (fieldOptions2 = this.options_) == null || fieldOptions2 == FieldOptions.getDefaultInstance()) {
                        this.options_ = fieldOptions;
                    } else {
                        getOptionsBuilder().mergeFrom(fieldOptions);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(fieldOptions);
                }
                if (this.options_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public FieldOptions.Builder getOptionsBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return getOptionsFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<FieldOptions, FieldOptions.Builder, FieldOptionsOrBuilder> getOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new SingleFieldBuilderV3<>(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }

            public Builder setProto3Optional(boolean z) {
                this.proto3Optional_ = z;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class OneofDescriptorProto extends GeneratedMessageV3 implements OneofDescriptorProtoOrBuilder {
        private static final OneofDescriptorProto DEFAULT_INSTANCE = new OneofDescriptorProto();
        @Deprecated
        public static final Parser<OneofDescriptorProto> PARSER = new AbstractParser<OneofDescriptorProto>() { // from class: com.google.protobuf.DescriptorProtos.OneofDescriptorProto.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public OneofDescriptorProto parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = OneofDescriptorProto.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private OneofOptions options_;

        public static OneofDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OneofDescriptorProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<OneofDescriptorProto> getParserForType() {
            return PARSER;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        static /* synthetic */ int access$10376(OneofDescriptorProto oneofDescriptorProto, int i) {
            int i2 = i | oneofDescriptorProto.bitField0_;
            oneofDescriptorProto.bitField0_ = i2;
            return i2;
        }

        private OneofDescriptorProto(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        private OneofDescriptorProto() {
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new OneofDescriptorProto();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_OneofDescriptorProto_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_OneofDescriptorProto_fieldAccessorTable.ensureFieldAccessorsInitialized(OneofDescriptorProto.class, Builder.class);
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        public OneofOptions getOptions() {
            OneofOptions oneofOptions = this.options_;
            return oneofOptions == null ? OneofOptions.getDefaultInstance() : oneofOptions;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getOptions());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, getOptions());
            }
            int serializedSize = computeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OneofDescriptorProto)) {
                return super.equals(obj);
            }
            OneofDescriptorProto oneofDescriptorProto = (OneofDescriptorProto) obj;
            if (hasName() != oneofDescriptorProto.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(oneofDescriptorProto.getName())) && hasOptions() == oneofDescriptorProto.hasOptions()) {
                return (!hasOptions() || getOptions().equals(oneofDescriptorProto.getOptions())) && getUnknownFields().equals(oneofDescriptorProto.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasName()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (hasOptions()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getOptions().hashCode();
            }
            int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OneofDescriptorProtoOrBuilder {
            private int bitField0_;
            private Object name_;
            private SingleFieldBuilderV3<OneofOptions, OneofOptions.Builder, OneofOptionsOrBuilder> optionsBuilder_;
            private OneofOptions options_;

            public boolean hasOptions() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_OneofDescriptorProto_fieldAccessorTable.ensureFieldAccessorsInitialized(OneofDescriptorProto.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getOptionsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_OneofDescriptorProto_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public OneofDescriptorProto getDefaultInstanceForType() {
                return OneofDescriptorProto.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OneofDescriptorProto build() {
                OneofDescriptorProto buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OneofDescriptorProto buildPartial() {
                OneofDescriptorProto oneofDescriptorProto = new OneofDescriptorProto(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(oneofDescriptorProto);
                }
                onBuilt();
                return oneofDescriptorProto;
            }

            private void buildPartial0(OneofDescriptorProto oneofDescriptorProto) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    oneofDescriptorProto.name_ = this.name_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    SingleFieldBuilderV3<OneofOptions, OneofOptions.Builder, OneofOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                    oneofDescriptorProto.options_ = singleFieldBuilderV3 == null ? this.options_ : singleFieldBuilderV3.build();
                    i |= 2;
                }
                OneofDescriptorProto.access$10376(oneofDescriptorProto, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof OneofDescriptorProto) {
                    return mergeFrom((OneofDescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(OneofDescriptorProto oneofDescriptorProto) {
                if (oneofDescriptorProto == OneofDescriptorProto.getDefaultInstance()) {
                    return this;
                }
                if (oneofDescriptorProto.hasName()) {
                    this.name_ = oneofDescriptorProto.name_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (oneofDescriptorProto.hasOptions()) {
                    mergeOptions(oneofDescriptorProto.getOptions());
                }
                mergeUnknownFields(oneofDescriptorProto.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasOptions() || getOptions().isInitialized();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (readTag == 18) {
                                    codedInputStream.readMessage(getOptionsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            public OneofOptions getOptions() {
                SingleFieldBuilderV3<OneofOptions, OneofOptions.Builder, OneofOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    OneofOptions oneofOptions = this.options_;
                    return oneofOptions == null ? OneofOptions.getDefaultInstance() : oneofOptions;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeOptions(OneofOptions oneofOptions) {
                OneofOptions oneofOptions2;
                SingleFieldBuilderV3<OneofOptions, OneofOptions.Builder, OneofOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) == 0 || (oneofOptions2 = this.options_) == null || oneofOptions2 == OneofOptions.getDefaultInstance()) {
                        this.options_ = oneofOptions;
                    } else {
                        getOptionsBuilder().mergeFrom(oneofOptions);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(oneofOptions);
                }
                if (this.options_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public OneofOptions.Builder getOptionsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return getOptionsFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<OneofOptions, OneofOptions.Builder, OneofOptionsOrBuilder> getOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new SingleFieldBuilderV3<>(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class EnumDescriptorProto extends GeneratedMessageV3 implements EnumDescriptorProtoOrBuilder {
        private static final EnumDescriptorProto DEFAULT_INSTANCE = new EnumDescriptorProto();
        @Deprecated
        public static final Parser<EnumDescriptorProto> PARSER = new AbstractParser<EnumDescriptorProto>() { // from class: com.google.protobuf.DescriptorProtos.EnumDescriptorProto.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public EnumDescriptorProto parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = EnumDescriptorProto.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private EnumOptions options_;
        private LazyStringArrayList reservedName_;
        private List<EnumReservedRange> reservedRange_;
        private List<EnumValueDescriptorProto> value_;

        /* loaded from: classes2.dex */
        public interface EnumReservedRangeOrBuilder extends MessageOrBuilder {
        }

        public static EnumDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EnumDescriptorProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<EnumDescriptorProto> getParserForType() {
            return PARSER;
        }

        public ProtocolStringList getReservedNameList() {
            return this.reservedName_;
        }

        public List<EnumReservedRange> getReservedRangeList() {
            return this.reservedRange_;
        }

        public List<EnumValueDescriptorProto> getValueList() {
            return this.value_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        static /* synthetic */ int access$12276(EnumDescriptorProto enumDescriptorProto, int i) {
            int i2 = i | enumDescriptorProto.bitField0_;
            enumDescriptorProto.bitField0_ = i2;
            return i2;
        }

        private EnumDescriptorProto(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.name_ = "";
            this.reservedName_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
        }

        private EnumDescriptorProto() {
            this.name_ = "";
            this.reservedName_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.value_ = Collections.emptyList();
            this.reservedRange_ = Collections.emptyList();
            this.reservedName_ = LazyStringArrayList.emptyList();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new EnumDescriptorProto();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_EnumDescriptorProto_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_EnumDescriptorProto_fieldAccessorTable.ensureFieldAccessorsInitialized(EnumDescriptorProto.class, Builder.class);
        }

        /* loaded from: classes2.dex */
        public static final class EnumReservedRange extends GeneratedMessageV3 implements EnumReservedRangeOrBuilder {
            private static final EnumReservedRange DEFAULT_INSTANCE = new EnumReservedRange();
            @Deprecated
            public static final Parser<EnumReservedRange> PARSER = new AbstractParser<EnumReservedRange>() { // from class: com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.1
                @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
                public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return super.parseFrom(byteString, extensionRegistryLite);
                }

                @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                    return super.parseFrom(bArr);
                }

                @Override // com.google.protobuf.Parser
                public EnumReservedRange parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    Builder newBuilder = EnumReservedRange.newBuilder();
                    try {
                        newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                        return newBuilder.buildPartial();
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(newBuilder.buildPartial());
                    } catch (UninitializedMessageException e2) {
                        throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                    }
                }
            };
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized;
            private int start_;

            public static EnumReservedRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EnumReservedRange getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
            public Parser<EnumReservedRange> getParserForType() {
                return PARSER;
            }

            public int getStart() {
                return this.start_;
            }

            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            static /* synthetic */ int access$11376(EnumReservedRange enumReservedRange, int i) {
                int i2 = i | enumReservedRange.bitField0_;
                enumReservedRange.bitField0_ = i2;
                return i2;
            }

            private EnumReservedRange(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.start_ = 0;
                this.end_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            private EnumReservedRange() {
                this.start_ = 0;
                this.end_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new EnumReservedRange();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_EnumDescriptorProto_EnumReservedRange_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_EnumDescriptorProto_EnumReservedRange_fieldAccessorTable.ensureFieldAccessorsInitialized(EnumReservedRange.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeInt32(1, this.start_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeInt32(2, this.end_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int computeInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeInt32Size(1, this.start_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    computeInt32Size += CodedOutputStream.computeInt32Size(2, this.end_);
                }
                int serializedSize = computeInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof EnumReservedRange)) {
                    return super.equals(obj);
                }
                EnumReservedRange enumReservedRange = (EnumReservedRange) obj;
                if (hasStart() != enumReservedRange.hasStart()) {
                    return false;
                }
                if ((!hasStart() || getStart() == enumReservedRange.getStart()) && hasEnd() == enumReservedRange.hasEnd()) {
                    return (!hasEnd() || getEnd() == enumReservedRange.getEnd()) && getUnknownFields().equals(enumReservedRange.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.AbstractMessage
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = getDescriptor().hashCode() + 779;
                if (hasStart()) {
                    hashCode = (((hashCode * 37) + 1) * 53) + getStart();
                }
                if (hasEnd()) {
                    hashCode = (((hashCode * 37) + 2) * 53) + getEnd();
                }
                int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            /* loaded from: classes2.dex */
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnumReservedRangeOrBuilder {
                private int bitField0_;
                private int end_;
                private int start_;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return DescriptorProtos.internal_static_google_protobuf_EnumDescriptorProto_EnumReservedRange_fieldAccessorTable.ensureFieldAccessorsInitialized(EnumReservedRange.class, Builder.class);
                }

                private Builder() {
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return DescriptorProtos.internal_static_google_protobuf_EnumDescriptorProto_EnumReservedRange_descriptor;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public EnumReservedRange getDefaultInstanceForType() {
                    return EnumReservedRange.getDefaultInstance();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public EnumReservedRange build() {
                    EnumReservedRange buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public EnumReservedRange buildPartial() {
                    EnumReservedRange enumReservedRange = new EnumReservedRange(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(enumReservedRange);
                    }
                    onBuilt();
                    return enumReservedRange;
                }

                private void buildPartial0(EnumReservedRange enumReservedRange) {
                    int i;
                    int i2 = this.bitField0_;
                    if ((i2 & 1) != 0) {
                        enumReservedRange.start_ = this.start_;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if ((i2 & 2) != 0) {
                        enumReservedRange.end_ = this.end_;
                        i |= 2;
                    }
                    EnumReservedRange.access$11376(enumReservedRange, i);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public Builder mo2781clone() {
                    return (Builder) super.mo2781clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof EnumReservedRange) {
                        return mergeFrom((EnumReservedRange) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(EnumReservedRange enumReservedRange) {
                    if (enumReservedRange == EnumReservedRange.getDefaultInstance()) {
                        return this;
                    }
                    if (enumReservedRange.hasStart()) {
                        setStart(enumReservedRange.getStart());
                    }
                    if (enumReservedRange.hasEnd()) {
                        setEnd(enumReservedRange.getEnd());
                    }
                    mergeUnknownFields(enumReservedRange.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z = false;
                    while (!z) {
                        try {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 8) {
                                        this.start_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 1;
                                    } else if (readTag == 16) {
                                        this.end_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 2;
                                    } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.unwrapIOException();
                            }
                        } finally {
                            onChanged();
                        }
                    }
                    return this;
                }

                public Builder setStart(int i) {
                    this.start_ = i;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setEnd(int i) {
                    this.end_ = i;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        public int getValueCount() {
            return this.value_.size();
        }

        public EnumValueDescriptorProto getValue(int i) {
            return this.value_.get(i);
        }

        public EnumOptions getOptions() {
            EnumOptions enumOptions = this.options_;
            return enumOptions == null ? EnumOptions.getDefaultInstance() : enumOptions;
        }

        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getValueCount(); i++) {
                if (!getValue(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            for (int i = 0; i < this.value_.size(); i++) {
                codedOutputStream.writeMessage(2, this.value_.get(i));
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(3, getOptions());
            }
            for (int i2 = 0; i2 < this.reservedRange_.size(); i2++) {
                codedOutputStream.writeMessage(4, this.reservedRange_.get(i2));
            }
            for (int i3 = 0; i3 < this.reservedName_.size(); i3++) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.reservedName_.getRaw(i3));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            for (int i2 = 0; i2 < this.value_.size(); i2++) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, this.value_.get(i2));
            }
            if ((this.bitField0_ & 2) != 0) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, getOptions());
            }
            for (int i3 = 0; i3 < this.reservedRange_.size(); i3++) {
                computeStringSize += CodedOutputStream.computeMessageSize(4, this.reservedRange_.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.reservedName_.size(); i5++) {
                i4 += GeneratedMessageV3.computeStringSizeNoTag(this.reservedName_.getRaw(i5));
            }
            int size = computeStringSize + i4 + getReservedNameList().size() + getUnknownFields().getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnumDescriptorProto)) {
                return super.equals(obj);
            }
            EnumDescriptorProto enumDescriptorProto = (EnumDescriptorProto) obj;
            if (hasName() != enumDescriptorProto.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(enumDescriptorProto.getName())) && getValueList().equals(enumDescriptorProto.getValueList()) && hasOptions() == enumDescriptorProto.hasOptions()) {
                return (!hasOptions() || getOptions().equals(enumDescriptorProto.getOptions())) && getReservedRangeList().equals(enumDescriptorProto.getReservedRangeList()) && getReservedNameList().equals(enumDescriptorProto.getReservedNameList()) && getUnknownFields().equals(enumDescriptorProto.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasName()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (getValueCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getValueList().hashCode();
            }
            if (hasOptions()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getOptions().hashCode();
            }
            if (getReservedRangeCount() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + getReservedRangeList().hashCode();
            }
            if (getReservedNameCount() > 0) {
                hashCode = (((hashCode * 37) + 5) * 53) + getReservedNameList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnumDescriptorProtoOrBuilder {
            private int bitField0_;
            private Object name_;
            private SingleFieldBuilderV3<EnumOptions, EnumOptions.Builder, EnumOptionsOrBuilder> optionsBuilder_;
            private EnumOptions options_;
            private LazyStringArrayList reservedName_;
            private RepeatedFieldBuilderV3<EnumReservedRange, EnumReservedRange.Builder, EnumReservedRangeOrBuilder> reservedRangeBuilder_;
            private List<EnumReservedRange> reservedRange_;
            private RepeatedFieldBuilderV3<EnumValueDescriptorProto, EnumValueDescriptorProto.Builder, EnumValueDescriptorProtoOrBuilder> valueBuilder_;
            private List<EnumValueDescriptorProto> value_;

            public boolean hasOptions() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_EnumDescriptorProto_fieldAccessorTable.ensureFieldAccessorsInitialized(EnumDescriptorProto.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.value_ = Collections.emptyList();
                this.reservedRange_ = Collections.emptyList();
                this.reservedName_ = LazyStringArrayList.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.value_ = Collections.emptyList();
                this.reservedRange_ = Collections.emptyList();
                this.reservedName_ = LazyStringArrayList.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getValueFieldBuilder();
                    getOptionsFieldBuilder();
                    getReservedRangeFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_EnumDescriptorProto_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EnumDescriptorProto getDefaultInstanceForType() {
                return EnumDescriptorProto.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnumDescriptorProto build() {
                EnumDescriptorProto buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnumDescriptorProto buildPartial() {
                EnumDescriptorProto enumDescriptorProto = new EnumDescriptorProto(this);
                buildPartialRepeatedFields(enumDescriptorProto);
                if (this.bitField0_ != 0) {
                    buildPartial0(enumDescriptorProto);
                }
                onBuilt();
                return enumDescriptorProto;
            }

            private void buildPartialRepeatedFields(EnumDescriptorProto enumDescriptorProto) {
                RepeatedFieldBuilderV3<EnumValueDescriptorProto, EnumValueDescriptorProto.Builder, EnumValueDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.valueBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.value_ = Collections.unmodifiableList(this.value_);
                        this.bitField0_ &= -3;
                    }
                    enumDescriptorProto.value_ = this.value_;
                } else {
                    enumDescriptorProto.value_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<EnumReservedRange, EnumReservedRange.Builder, EnumReservedRangeOrBuilder> repeatedFieldBuilderV32 = this.reservedRangeBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    if ((this.bitField0_ & 8) != 0) {
                        this.reservedRange_ = Collections.unmodifiableList(this.reservedRange_);
                        this.bitField0_ &= -9;
                    }
                    enumDescriptorProto.reservedRange_ = this.reservedRange_;
                    return;
                }
                enumDescriptorProto.reservedRange_ = repeatedFieldBuilderV32.build();
            }

            private void buildPartial0(EnumDescriptorProto enumDescriptorProto) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    enumDescriptorProto.name_ = this.name_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 4) != 0) {
                    SingleFieldBuilderV3<EnumOptions, EnumOptions.Builder, EnumOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                    enumDescriptorProto.options_ = singleFieldBuilderV3 == null ? this.options_ : singleFieldBuilderV3.build();
                    i |= 2;
                }
                if ((i2 & 16) != 0) {
                    this.reservedName_.makeImmutable();
                    enumDescriptorProto.reservedName_ = this.reservedName_;
                }
                EnumDescriptorProto.access$12276(enumDescriptorProto, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EnumDescriptorProto) {
                    return mergeFrom((EnumDescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EnumDescriptorProto enumDescriptorProto) {
                if (enumDescriptorProto == EnumDescriptorProto.getDefaultInstance()) {
                    return this;
                }
                if (enumDescriptorProto.hasName()) {
                    this.name_ = enumDescriptorProto.name_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (this.valueBuilder_ == null) {
                    if (!enumDescriptorProto.value_.isEmpty()) {
                        if (this.value_.isEmpty()) {
                            this.value_ = enumDescriptorProto.value_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureValueIsMutable();
                            this.value_.addAll(enumDescriptorProto.value_);
                        }
                        onChanged();
                    }
                } else if (!enumDescriptorProto.value_.isEmpty()) {
                    if (!this.valueBuilder_.isEmpty()) {
                        this.valueBuilder_.addAllMessages(enumDescriptorProto.value_);
                    } else {
                        this.valueBuilder_.dispose();
                        this.valueBuilder_ = null;
                        this.value_ = enumDescriptorProto.value_;
                        this.bitField0_ &= -3;
                        this.valueBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getValueFieldBuilder() : null;
                    }
                }
                if (enumDescriptorProto.hasOptions()) {
                    mergeOptions(enumDescriptorProto.getOptions());
                }
                if (this.reservedRangeBuilder_ == null) {
                    if (!enumDescriptorProto.reservedRange_.isEmpty()) {
                        if (this.reservedRange_.isEmpty()) {
                            this.reservedRange_ = enumDescriptorProto.reservedRange_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureReservedRangeIsMutable();
                            this.reservedRange_.addAll(enumDescriptorProto.reservedRange_);
                        }
                        onChanged();
                    }
                } else if (!enumDescriptorProto.reservedRange_.isEmpty()) {
                    if (!this.reservedRangeBuilder_.isEmpty()) {
                        this.reservedRangeBuilder_.addAllMessages(enumDescriptorProto.reservedRange_);
                    } else {
                        this.reservedRangeBuilder_.dispose();
                        this.reservedRangeBuilder_ = null;
                        this.reservedRange_ = enumDescriptorProto.reservedRange_;
                        this.bitField0_ &= -9;
                        this.reservedRangeBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getReservedRangeFieldBuilder() : null;
                    }
                }
                if (!enumDescriptorProto.reservedName_.isEmpty()) {
                    if (this.reservedName_.isEmpty()) {
                        this.reservedName_ = enumDescriptorProto.reservedName_;
                        this.bitField0_ |= 16;
                    } else {
                        ensureReservedNameIsMutable();
                        this.reservedName_.addAll(enumDescriptorProto.reservedName_);
                    }
                    onChanged();
                }
                mergeUnknownFields(enumDescriptorProto.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getValueCount(); i++) {
                    if (!getValue(i).isInitialized()) {
                        return false;
                    }
                }
                return !hasOptions() || getOptions().isInitialized();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (readTag == 18) {
                                    EnumValueDescriptorProto enumValueDescriptorProto = (EnumValueDescriptorProto) codedInputStream.readMessage(EnumValueDescriptorProto.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<EnumValueDescriptorProto, EnumValueDescriptorProto.Builder, EnumValueDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.valueBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureValueIsMutable();
                                        this.value_.add(enumValueDescriptorProto);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(enumValueDescriptorProto);
                                    }
                                } else if (readTag == 26) {
                                    codedInputStream.readMessage(getOptionsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (readTag == 34) {
                                    EnumReservedRange enumReservedRange = (EnumReservedRange) codedInputStream.readMessage(EnumReservedRange.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<EnumReservedRange, EnumReservedRange.Builder, EnumReservedRangeOrBuilder> repeatedFieldBuilderV32 = this.reservedRangeBuilder_;
                                    if (repeatedFieldBuilderV32 == null) {
                                        ensureReservedRangeIsMutable();
                                        this.reservedRange_.add(enumReservedRange);
                                    } else {
                                        repeatedFieldBuilderV32.addMessage(enumReservedRange);
                                    }
                                } else if (readTag == 42) {
                                    ByteString readBytes = codedInputStream.readBytes();
                                    ensureReservedNameIsMutable();
                                    this.reservedName_.add(readBytes);
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            private void ensureValueIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.value_ = new ArrayList(this.value_);
                    this.bitField0_ |= 2;
                }
            }

            public int getValueCount() {
                RepeatedFieldBuilderV3<EnumValueDescriptorProto, EnumValueDescriptorProto.Builder, EnumValueDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.valueBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.value_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public EnumValueDescriptorProto getValue(int i) {
                RepeatedFieldBuilderV3<EnumValueDescriptorProto, EnumValueDescriptorProto.Builder, EnumValueDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.valueBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.value_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<EnumValueDescriptorProto, EnumValueDescriptorProto.Builder, EnumValueDescriptorProtoOrBuilder> getValueFieldBuilder() {
                if (this.valueBuilder_ == null) {
                    this.valueBuilder_ = new RepeatedFieldBuilderV3<>(this.value_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.value_ = null;
                }
                return this.valueBuilder_;
            }

            public EnumOptions getOptions() {
                SingleFieldBuilderV3<EnumOptions, EnumOptions.Builder, EnumOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    EnumOptions enumOptions = this.options_;
                    return enumOptions == null ? EnumOptions.getDefaultInstance() : enumOptions;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeOptions(EnumOptions enumOptions) {
                EnumOptions enumOptions2;
                SingleFieldBuilderV3<EnumOptions, EnumOptions.Builder, EnumOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) == 0 || (enumOptions2 = this.options_) == null || enumOptions2 == EnumOptions.getDefaultInstance()) {
                        this.options_ = enumOptions;
                    } else {
                        getOptionsBuilder().mergeFrom(enumOptions);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(enumOptions);
                }
                if (this.options_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public EnumOptions.Builder getOptionsBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return getOptionsFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<EnumOptions, EnumOptions.Builder, EnumOptionsOrBuilder> getOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new SingleFieldBuilderV3<>(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }

            private void ensureReservedRangeIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.reservedRange_ = new ArrayList(this.reservedRange_);
                    this.bitField0_ |= 8;
                }
            }

            private RepeatedFieldBuilderV3<EnumReservedRange, EnumReservedRange.Builder, EnumReservedRangeOrBuilder> getReservedRangeFieldBuilder() {
                if (this.reservedRangeBuilder_ == null) {
                    this.reservedRangeBuilder_ = new RepeatedFieldBuilderV3<>(this.reservedRange_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.reservedRange_ = null;
                }
                return this.reservedRangeBuilder_;
            }

            private void ensureReservedNameIsMutable() {
                if (!this.reservedName_.isModifiable()) {
                    this.reservedName_ = new LazyStringArrayList(this.reservedName_);
                }
                this.bitField0_ |= 16;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class EnumValueDescriptorProto extends GeneratedMessageV3 implements EnumValueDescriptorProtoOrBuilder {
        private static final EnumValueDescriptorProto DEFAULT_INSTANCE = new EnumValueDescriptorProto();
        @Deprecated
        public static final Parser<EnumValueDescriptorProto> PARSER = new AbstractParser<EnumValueDescriptorProto>() { // from class: com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public EnumValueDescriptorProto parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = EnumValueDescriptorProto.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private int number_;
        private EnumValueOptions options_;

        public static EnumValueDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EnumValueDescriptorProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<EnumValueDescriptorProto> getParserForType() {
            return PARSER;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        static /* synthetic */ int access$13176(EnumValueDescriptorProto enumValueDescriptorProto, int i) {
            int i2 = i | enumValueDescriptorProto.bitField0_;
            enumValueDescriptorProto.bitField0_ = i2;
            return i2;
        }

        private EnumValueDescriptorProto(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.name_ = "";
            this.number_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        private EnumValueDescriptorProto() {
            this.name_ = "";
            this.number_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new EnumValueDescriptorProto();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_EnumValueDescriptorProto_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_EnumValueDescriptorProto_fieldAccessorTable.ensureFieldAccessorsInitialized(EnumValueDescriptorProto.class, Builder.class);
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        public EnumValueOptions getOptions() {
            EnumValueOptions enumValueOptions = this.options_;
            return enumValueOptions == null ? EnumValueOptions.getDefaultInstance() : enumValueOptions;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeInt32(2, this.number_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getOptions());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                computeStringSize += CodedOutputStream.computeInt32Size(2, this.number_);
            }
            if ((this.bitField0_ & 4) != 0) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, getOptions());
            }
            int serializedSize = computeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnumValueDescriptorProto)) {
                return super.equals(obj);
            }
            EnumValueDescriptorProto enumValueDescriptorProto = (EnumValueDescriptorProto) obj;
            if (hasName() != enumValueDescriptorProto.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(enumValueDescriptorProto.getName())) && hasNumber() == enumValueDescriptorProto.hasNumber()) {
                if ((!hasNumber() || getNumber() == enumValueDescriptorProto.getNumber()) && hasOptions() == enumValueDescriptorProto.hasOptions()) {
                    return (!hasOptions() || getOptions().equals(enumValueDescriptorProto.getOptions())) && getUnknownFields().equals(enumValueDescriptorProto.getUnknownFields());
                }
                return false;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasName()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (hasNumber()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getNumber();
            }
            if (hasOptions()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getOptions().hashCode();
            }
            int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnumValueDescriptorProtoOrBuilder {
            private int bitField0_;
            private Object name_;
            private int number_;
            private SingleFieldBuilderV3<EnumValueOptions, EnumValueOptions.Builder, EnumValueOptionsOrBuilder> optionsBuilder_;
            private EnumValueOptions options_;

            public boolean hasOptions() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_EnumValueDescriptorProto_fieldAccessorTable.ensureFieldAccessorsInitialized(EnumValueDescriptorProto.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getOptionsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_EnumValueDescriptorProto_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EnumValueDescriptorProto getDefaultInstanceForType() {
                return EnumValueDescriptorProto.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnumValueDescriptorProto build() {
                EnumValueDescriptorProto buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnumValueDescriptorProto buildPartial() {
                EnumValueDescriptorProto enumValueDescriptorProto = new EnumValueDescriptorProto(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(enumValueDescriptorProto);
                }
                onBuilt();
                return enumValueDescriptorProto;
            }

            private void buildPartial0(EnumValueDescriptorProto enumValueDescriptorProto) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    enumValueDescriptorProto.name_ = this.name_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    enumValueDescriptorProto.number_ = this.number_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    SingleFieldBuilderV3<EnumValueOptions, EnumValueOptions.Builder, EnumValueOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                    enumValueDescriptorProto.options_ = singleFieldBuilderV3 == null ? this.options_ : singleFieldBuilderV3.build();
                    i |= 4;
                }
                EnumValueDescriptorProto.access$13176(enumValueDescriptorProto, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EnumValueDescriptorProto) {
                    return mergeFrom((EnumValueDescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EnumValueDescriptorProto enumValueDescriptorProto) {
                if (enumValueDescriptorProto == EnumValueDescriptorProto.getDefaultInstance()) {
                    return this;
                }
                if (enumValueDescriptorProto.hasName()) {
                    this.name_ = enumValueDescriptorProto.name_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (enumValueDescriptorProto.hasNumber()) {
                    setNumber(enumValueDescriptorProto.getNumber());
                }
                if (enumValueDescriptorProto.hasOptions()) {
                    mergeOptions(enumValueDescriptorProto.getOptions());
                }
                mergeUnknownFields(enumValueDescriptorProto.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasOptions() || getOptions().isInitialized();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (readTag == 16) {
                                    this.number_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2;
                                } else if (readTag == 26) {
                                    codedInputStream.readMessage(getOptionsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setNumber(int i) {
                this.number_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public EnumValueOptions getOptions() {
                SingleFieldBuilderV3<EnumValueOptions, EnumValueOptions.Builder, EnumValueOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    EnumValueOptions enumValueOptions = this.options_;
                    return enumValueOptions == null ? EnumValueOptions.getDefaultInstance() : enumValueOptions;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeOptions(EnumValueOptions enumValueOptions) {
                EnumValueOptions enumValueOptions2;
                SingleFieldBuilderV3<EnumValueOptions, EnumValueOptions.Builder, EnumValueOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) == 0 || (enumValueOptions2 = this.options_) == null || enumValueOptions2 == EnumValueOptions.getDefaultInstance()) {
                        this.options_ = enumValueOptions;
                    } else {
                        getOptionsBuilder().mergeFrom(enumValueOptions);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(enumValueOptions);
                }
                if (this.options_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public EnumValueOptions.Builder getOptionsBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return getOptionsFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<EnumValueOptions, EnumValueOptions.Builder, EnumValueOptionsOrBuilder> getOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new SingleFieldBuilderV3<>(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class ServiceDescriptorProto extends GeneratedMessageV3 implements ServiceDescriptorProtoOrBuilder {
        private static final ServiceDescriptorProto DEFAULT_INSTANCE = new ServiceDescriptorProto();
        @Deprecated
        public static final Parser<ServiceDescriptorProto> PARSER = new AbstractParser<ServiceDescriptorProto>() { // from class: com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public ServiceDescriptorProto parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = ServiceDescriptorProto.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private List<MethodDescriptorProto> method_;
        private volatile Object name_;
        private ServiceOptions options_;

        public static ServiceDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ServiceDescriptorProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public List<MethodDescriptorProto> getMethodList() {
            return this.method_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<ServiceDescriptorProto> getParserForType() {
            return PARSER;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        static /* synthetic */ int access$14076(ServiceDescriptorProto serviceDescriptorProto, int i) {
            int i2 = i | serviceDescriptorProto.bitField0_;
            serviceDescriptorProto.bitField0_ = i2;
            return i2;
        }

        private ServiceDescriptorProto(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        private ServiceDescriptorProto() {
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.method_ = Collections.emptyList();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new ServiceDescriptorProto();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_ServiceDescriptorProto_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_ServiceDescriptorProto_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceDescriptorProto.class, Builder.class);
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        public int getMethodCount() {
            return this.method_.size();
        }

        public MethodDescriptorProto getMethod(int i) {
            return this.method_.get(i);
        }

        public ServiceOptions getOptions() {
            ServiceOptions serviceOptions = this.options_;
            return serviceOptions == null ? ServiceOptions.getDefaultInstance() : serviceOptions;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getMethodCount(); i++) {
                if (!getMethod(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            for (int i = 0; i < this.method_.size(); i++) {
                codedOutputStream.writeMessage(2, this.method_.get(i));
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(3, getOptions());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            for (int i2 = 0; i2 < this.method_.size(); i2++) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, this.method_.get(i2));
            }
            if ((this.bitField0_ & 2) != 0) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, getOptions());
            }
            int serializedSize = computeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ServiceDescriptorProto)) {
                return super.equals(obj);
            }
            ServiceDescriptorProto serviceDescriptorProto = (ServiceDescriptorProto) obj;
            if (hasName() != serviceDescriptorProto.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(serviceDescriptorProto.getName())) && getMethodList().equals(serviceDescriptorProto.getMethodList()) && hasOptions() == serviceDescriptorProto.hasOptions()) {
                return (!hasOptions() || getOptions().equals(serviceDescriptorProto.getOptions())) && getUnknownFields().equals(serviceDescriptorProto.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasName()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (getMethodCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getMethodList().hashCode();
            }
            if (hasOptions()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getOptions().hashCode();
            }
            int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceDescriptorProtoOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<MethodDescriptorProto, MethodDescriptorProto.Builder, MethodDescriptorProtoOrBuilder> methodBuilder_;
            private List<MethodDescriptorProto> method_;
            private Object name_;
            private SingleFieldBuilderV3<ServiceOptions, ServiceOptions.Builder, ServiceOptionsOrBuilder> optionsBuilder_;
            private ServiceOptions options_;

            public boolean hasOptions() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_ServiceDescriptorProto_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceDescriptorProto.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.method_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.method_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getMethodFieldBuilder();
                    getOptionsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_ServiceDescriptorProto_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ServiceDescriptorProto getDefaultInstanceForType() {
                return ServiceDescriptorProto.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ServiceDescriptorProto build() {
                ServiceDescriptorProto buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ServiceDescriptorProto buildPartial() {
                ServiceDescriptorProto serviceDescriptorProto = new ServiceDescriptorProto(this);
                buildPartialRepeatedFields(serviceDescriptorProto);
                if (this.bitField0_ != 0) {
                    buildPartial0(serviceDescriptorProto);
                }
                onBuilt();
                return serviceDescriptorProto;
            }

            private void buildPartialRepeatedFields(ServiceDescriptorProto serviceDescriptorProto) {
                RepeatedFieldBuilderV3<MethodDescriptorProto, MethodDescriptorProto.Builder, MethodDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.methodBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.method_ = Collections.unmodifiableList(this.method_);
                        this.bitField0_ &= -3;
                    }
                    serviceDescriptorProto.method_ = this.method_;
                    return;
                }
                serviceDescriptorProto.method_ = repeatedFieldBuilderV3.build();
            }

            private void buildPartial0(ServiceDescriptorProto serviceDescriptorProto) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    serviceDescriptorProto.name_ = this.name_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 4) != 0) {
                    SingleFieldBuilderV3<ServiceOptions, ServiceOptions.Builder, ServiceOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                    serviceDescriptorProto.options_ = singleFieldBuilderV3 == null ? this.options_ : singleFieldBuilderV3.build();
                    i |= 2;
                }
                ServiceDescriptorProto.access$14076(serviceDescriptorProto, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ServiceDescriptorProto) {
                    return mergeFrom((ServiceDescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ServiceDescriptorProto serviceDescriptorProto) {
                if (serviceDescriptorProto == ServiceDescriptorProto.getDefaultInstance()) {
                    return this;
                }
                if (serviceDescriptorProto.hasName()) {
                    this.name_ = serviceDescriptorProto.name_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (this.methodBuilder_ == null) {
                    if (!serviceDescriptorProto.method_.isEmpty()) {
                        if (this.method_.isEmpty()) {
                            this.method_ = serviceDescriptorProto.method_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureMethodIsMutable();
                            this.method_.addAll(serviceDescriptorProto.method_);
                        }
                        onChanged();
                    }
                } else if (!serviceDescriptorProto.method_.isEmpty()) {
                    if (!this.methodBuilder_.isEmpty()) {
                        this.methodBuilder_.addAllMessages(serviceDescriptorProto.method_);
                    } else {
                        this.methodBuilder_.dispose();
                        this.methodBuilder_ = null;
                        this.method_ = serviceDescriptorProto.method_;
                        this.bitField0_ &= -3;
                        this.methodBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getMethodFieldBuilder() : null;
                    }
                }
                if (serviceDescriptorProto.hasOptions()) {
                    mergeOptions(serviceDescriptorProto.getOptions());
                }
                mergeUnknownFields(serviceDescriptorProto.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getMethodCount(); i++) {
                    if (!getMethod(i).isInitialized()) {
                        return false;
                    }
                }
                return !hasOptions() || getOptions().isInitialized();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (readTag == 18) {
                                    MethodDescriptorProto methodDescriptorProto = (MethodDescriptorProto) codedInputStream.readMessage(MethodDescriptorProto.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<MethodDescriptorProto, MethodDescriptorProto.Builder, MethodDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.methodBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureMethodIsMutable();
                                        this.method_.add(methodDescriptorProto);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(methodDescriptorProto);
                                    }
                                } else if (readTag == 26) {
                                    codedInputStream.readMessage(getOptionsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            private void ensureMethodIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.method_ = new ArrayList(this.method_);
                    this.bitField0_ |= 2;
                }
            }

            public int getMethodCount() {
                RepeatedFieldBuilderV3<MethodDescriptorProto, MethodDescriptorProto.Builder, MethodDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.methodBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.method_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public MethodDescriptorProto getMethod(int i) {
                RepeatedFieldBuilderV3<MethodDescriptorProto, MethodDescriptorProto.Builder, MethodDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = this.methodBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.method_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<MethodDescriptorProto, MethodDescriptorProto.Builder, MethodDescriptorProtoOrBuilder> getMethodFieldBuilder() {
                if (this.methodBuilder_ == null) {
                    this.methodBuilder_ = new RepeatedFieldBuilderV3<>(this.method_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.method_ = null;
                }
                return this.methodBuilder_;
            }

            public ServiceOptions getOptions() {
                SingleFieldBuilderV3<ServiceOptions, ServiceOptions.Builder, ServiceOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    ServiceOptions serviceOptions = this.options_;
                    return serviceOptions == null ? ServiceOptions.getDefaultInstance() : serviceOptions;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeOptions(ServiceOptions serviceOptions) {
                ServiceOptions serviceOptions2;
                SingleFieldBuilderV3<ServiceOptions, ServiceOptions.Builder, ServiceOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) == 0 || (serviceOptions2 = this.options_) == null || serviceOptions2 == ServiceOptions.getDefaultInstance()) {
                        this.options_ = serviceOptions;
                    } else {
                        getOptionsBuilder().mergeFrom(serviceOptions);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(serviceOptions);
                }
                if (this.options_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public ServiceOptions.Builder getOptionsBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return getOptionsFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<ServiceOptions, ServiceOptions.Builder, ServiceOptionsOrBuilder> getOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new SingleFieldBuilderV3<>(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class MethodDescriptorProto extends GeneratedMessageV3 implements MethodDescriptorProtoOrBuilder {
        private static final MethodDescriptorProto DEFAULT_INSTANCE = new MethodDescriptorProto();
        @Deprecated
        public static final Parser<MethodDescriptorProto> PARSER = new AbstractParser<MethodDescriptorProto>() { // from class: com.google.protobuf.DescriptorProtos.MethodDescriptorProto.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public MethodDescriptorProto parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = MethodDescriptorProto.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean clientStreaming_;
        private volatile Object inputType_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private MethodOptions options_;
        private volatile Object outputType_;
        private boolean serverStreaming_;

        public static MethodDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean getClientStreaming() {
            return this.clientStreaming_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MethodDescriptorProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<MethodDescriptorProto> getParserForType() {
            return PARSER;
        }

        public boolean getServerStreaming() {
            return this.serverStreaming_;
        }

        public boolean hasClientStreaming() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasInputType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasOutputType() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasServerStreaming() {
            return (this.bitField0_ & 32) != 0;
        }

        static /* synthetic */ int access$15276(MethodDescriptorProto methodDescriptorProto, int i) {
            int i2 = i | methodDescriptorProto.bitField0_;
            methodDescriptorProto.bitField0_ = i2;
            return i2;
        }

        private MethodDescriptorProto(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.name_ = "";
            this.inputType_ = "";
            this.outputType_ = "";
            this.clientStreaming_ = false;
            this.serverStreaming_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        private MethodDescriptorProto() {
            this.name_ = "";
            this.inputType_ = "";
            this.outputType_ = "";
            this.clientStreaming_ = false;
            this.serverStreaming_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.inputType_ = "";
            this.outputType_ = "";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MethodDescriptorProto();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_MethodDescriptorProto_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_MethodDescriptorProto_fieldAccessorTable.ensureFieldAccessorsInitialized(MethodDescriptorProto.class, Builder.class);
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        public String getInputType() {
            Object obj = this.inputType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.inputType_ = stringUtf8;
            }
            return stringUtf8;
        }

        public String getOutputType() {
            Object obj = this.outputType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.outputType_ = stringUtf8;
            }
            return stringUtf8;
        }

        public MethodOptions getOptions() {
            MethodOptions methodOptions = this.options_;
            return methodOptions == null ? MethodOptions.getDefaultInstance() : methodOptions;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasOptions() || getOptions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.inputType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.outputType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getOptions());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.clientStreaming_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(6, this.serverStreaming_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                computeStringSize += GeneratedMessageV3.computeStringSize(2, this.inputType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                computeStringSize += GeneratedMessageV3.computeStringSize(3, this.outputType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                computeStringSize += CodedOutputStream.computeMessageSize(4, getOptions());
            }
            if ((this.bitField0_ & 16) != 0) {
                computeStringSize += CodedOutputStream.computeBoolSize(5, this.clientStreaming_);
            }
            if ((this.bitField0_ & 32) != 0) {
                computeStringSize += CodedOutputStream.computeBoolSize(6, this.serverStreaming_);
            }
            int serializedSize = computeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MethodDescriptorProto)) {
                return super.equals(obj);
            }
            MethodDescriptorProto methodDescriptorProto = (MethodDescriptorProto) obj;
            if (hasName() != methodDescriptorProto.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(methodDescriptorProto.getName())) && hasInputType() == methodDescriptorProto.hasInputType()) {
                if ((!hasInputType() || getInputType().equals(methodDescriptorProto.getInputType())) && hasOutputType() == methodDescriptorProto.hasOutputType()) {
                    if ((!hasOutputType() || getOutputType().equals(methodDescriptorProto.getOutputType())) && hasOptions() == methodDescriptorProto.hasOptions()) {
                        if ((!hasOptions() || getOptions().equals(methodDescriptorProto.getOptions())) && hasClientStreaming() == methodDescriptorProto.hasClientStreaming()) {
                            if ((!hasClientStreaming() || getClientStreaming() == methodDescriptorProto.getClientStreaming()) && hasServerStreaming() == methodDescriptorProto.hasServerStreaming()) {
                                return (!hasServerStreaming() || getServerStreaming() == methodDescriptorProto.getServerStreaming()) && getUnknownFields().equals(methodDescriptorProto.getUnknownFields());
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasName()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (hasInputType()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getInputType().hashCode();
            }
            if (hasOutputType()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getOutputType().hashCode();
            }
            if (hasOptions()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getOptions().hashCode();
            }
            if (hasClientStreaming()) {
                hashCode = (((hashCode * 37) + 5) * 53) + Internal.hashBoolean(getClientStreaming());
            }
            if (hasServerStreaming()) {
                hashCode = (((hashCode * 37) + 6) * 53) + Internal.hashBoolean(getServerStreaming());
            }
            int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MethodDescriptorProtoOrBuilder {
            private int bitField0_;
            private boolean clientStreaming_;
            private Object inputType_;
            private Object name_;
            private SingleFieldBuilderV3<MethodOptions, MethodOptions.Builder, MethodOptionsOrBuilder> optionsBuilder_;
            private MethodOptions options_;
            private Object outputType_;
            private boolean serverStreaming_;

            public boolean hasOptions() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_MethodDescriptorProto_fieldAccessorTable.ensureFieldAccessorsInitialized(MethodDescriptorProto.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.inputType_ = "";
                this.outputType_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.inputType_ = "";
                this.outputType_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getOptionsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_MethodDescriptorProto_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MethodDescriptorProto getDefaultInstanceForType() {
                return MethodDescriptorProto.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MethodDescriptorProto build() {
                MethodDescriptorProto buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MethodDescriptorProto buildPartial() {
                MethodDescriptorProto methodDescriptorProto = new MethodDescriptorProto(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(methodDescriptorProto);
                }
                onBuilt();
                return methodDescriptorProto;
            }

            private void buildPartial0(MethodDescriptorProto methodDescriptorProto) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    methodDescriptorProto.name_ = this.name_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    methodDescriptorProto.inputType_ = this.inputType_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    methodDescriptorProto.outputType_ = this.outputType_;
                    i |= 4;
                }
                if ((i2 & 8) != 0) {
                    SingleFieldBuilderV3<MethodOptions, MethodOptions.Builder, MethodOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                    methodDescriptorProto.options_ = singleFieldBuilderV3 == null ? this.options_ : singleFieldBuilderV3.build();
                    i |= 8;
                }
                if ((i2 & 16) != 0) {
                    methodDescriptorProto.clientStreaming_ = this.clientStreaming_;
                    i |= 16;
                }
                if ((i2 & 32) != 0) {
                    methodDescriptorProto.serverStreaming_ = this.serverStreaming_;
                    i |= 32;
                }
                MethodDescriptorProto.access$15276(methodDescriptorProto, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MethodDescriptorProto) {
                    return mergeFrom((MethodDescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MethodDescriptorProto methodDescriptorProto) {
                if (methodDescriptorProto == MethodDescriptorProto.getDefaultInstance()) {
                    return this;
                }
                if (methodDescriptorProto.hasName()) {
                    this.name_ = methodDescriptorProto.name_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (methodDescriptorProto.hasInputType()) {
                    this.inputType_ = methodDescriptorProto.inputType_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (methodDescriptorProto.hasOutputType()) {
                    this.outputType_ = methodDescriptorProto.outputType_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (methodDescriptorProto.hasOptions()) {
                    mergeOptions(methodDescriptorProto.getOptions());
                }
                if (methodDescriptorProto.hasClientStreaming()) {
                    setClientStreaming(methodDescriptorProto.getClientStreaming());
                }
                if (methodDescriptorProto.hasServerStreaming()) {
                    setServerStreaming(methodDescriptorProto.getServerStreaming());
                }
                mergeUnknownFields(methodDescriptorProto.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasOptions() || getOptions().isInitialized();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (readTag == 18) {
                                    this.inputType_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (readTag == 26) {
                                    this.outputType_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (readTag == 34) {
                                    codedInputStream.readMessage(getOptionsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (readTag == 40) {
                                    this.clientStreaming_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16;
                                } else if (readTag == 48) {
                                    this.serverStreaming_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            public MethodOptions getOptions() {
                SingleFieldBuilderV3<MethodOptions, MethodOptions.Builder, MethodOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    MethodOptions methodOptions = this.options_;
                    return methodOptions == null ? MethodOptions.getDefaultInstance() : methodOptions;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeOptions(MethodOptions methodOptions) {
                MethodOptions methodOptions2;
                SingleFieldBuilderV3<MethodOptions, MethodOptions.Builder, MethodOptionsOrBuilder> singleFieldBuilderV3 = this.optionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) == 0 || (methodOptions2 = this.options_) == null || methodOptions2 == MethodOptions.getDefaultInstance()) {
                        this.options_ = methodOptions;
                    } else {
                        getOptionsBuilder().mergeFrom(methodOptions);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(methodOptions);
                }
                if (this.options_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public MethodOptions.Builder getOptionsBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return getOptionsFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<MethodOptions, MethodOptions.Builder, MethodOptionsOrBuilder> getOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new SingleFieldBuilderV3<>(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }

            public Builder setClientStreaming(boolean z) {
                this.clientStreaming_ = z;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setServerStreaming(boolean z) {
                this.serverStreaming_ = z;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class FileOptions extends GeneratedMessageV3.ExtendableMessage<FileOptions> implements FileOptionsOrBuilder {
        private static final FileOptions DEFAULT_INSTANCE = new FileOptions();
        @Deprecated
        public static final Parser<FileOptions> PARSER = new AbstractParser<FileOptions>() { // from class: com.google.protobuf.DescriptorProtos.FileOptions.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public FileOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = FileOptions.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean ccEnableArenas_;
        private boolean ccGenericServices_;
        private volatile Object csharpNamespace_;
        private boolean deprecated_;
        private FeatureSet features_;
        private volatile Object goPackage_;
        private boolean javaGenerateEqualsAndHash_;
        private boolean javaGenericServices_;
        private boolean javaMultipleFiles_;
        private volatile Object javaOuterClassname_;
        private volatile Object javaPackage_;
        private boolean javaStringCheckUtf8_;
        private byte memoizedIsInitialized;
        private volatile Object objcClassPrefix_;
        private int optimizeFor_;
        private volatile Object phpClassPrefix_;
        private boolean phpGenericServices_;
        private volatile Object phpMetadataNamespace_;
        private volatile Object phpNamespace_;
        private boolean pyGenericServices_;
        private volatile Object rubyPackage_;
        private volatile Object swiftPrefix_;
        private List<UninterpretedOption> uninterpretedOption_;

        public static FileOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean getCcEnableArenas() {
            return this.ccEnableArenas_;
        }

        public boolean getCcGenericServices() {
            return this.ccGenericServices_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FileOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Deprecated
        public boolean getJavaGenerateEqualsAndHash() {
            return this.javaGenerateEqualsAndHash_;
        }

        public boolean getJavaGenericServices() {
            return this.javaGenericServices_;
        }

        public boolean getJavaMultipleFiles() {
            return this.javaMultipleFiles_;
        }

        public boolean getJavaStringCheckUtf8() {
            return this.javaStringCheckUtf8_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<FileOptions> getParserForType() {
            return PARSER;
        }

        public boolean getPhpGenericServices() {
            return this.phpGenericServices_;
        }

        public boolean getPyGenericServices() {
            return this.pyGenericServices_;
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public boolean hasCcEnableArenas() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasCcGenericServices() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasCsharpNamespace() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasFeatures() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public boolean hasGoPackage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Deprecated
        public boolean hasJavaGenerateEqualsAndHash() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasJavaGenericServices() {
            return (this.bitField0_ & JSONzip.end) != 0;
        }

        public boolean hasJavaMultipleFiles() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasJavaOuterClassname() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasJavaPackage() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasJavaStringCheckUtf8() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasObjcClassPrefix() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasOptimizeFor() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasPhpClassPrefix() {
            return (this.bitField0_ & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0;
        }

        public boolean hasPhpGenericServices() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasPhpMetadataNamespace() {
            return (this.bitField0_ & 262144) != 0;
        }

        public boolean hasPhpNamespace() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasPyGenericServices() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasRubyPackage() {
            return (this.bitField0_ & 524288) != 0;
        }

        public boolean hasSwiftPrefix() {
            return (this.bitField0_ & Privacy.DEFAULT) != 0;
        }

        static /* synthetic */ int access$18076(FileOptions fileOptions, int i) {
            int i2 = i | fileOptions.bitField0_;
            fileOptions.bitField0_ = i2;
            return i2;
        }

        private FileOptions(GeneratedMessageV3.ExtendableBuilder<FileOptions, ?> extendableBuilder) {
            super(extendableBuilder);
            this.javaPackage_ = "";
            this.javaOuterClassname_ = "";
            this.javaMultipleFiles_ = false;
            this.javaGenerateEqualsAndHash_ = false;
            this.javaStringCheckUtf8_ = false;
            this.optimizeFor_ = 1;
            this.goPackage_ = "";
            this.ccGenericServices_ = false;
            this.javaGenericServices_ = false;
            this.pyGenericServices_ = false;
            this.phpGenericServices_ = false;
            this.deprecated_ = false;
            this.ccEnableArenas_ = true;
            this.objcClassPrefix_ = "";
            this.csharpNamespace_ = "";
            this.swiftPrefix_ = "";
            this.phpClassPrefix_ = "";
            this.phpNamespace_ = "";
            this.phpMetadataNamespace_ = "";
            this.rubyPackage_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        private FileOptions() {
            this.javaPackage_ = "";
            this.javaOuterClassname_ = "";
            this.javaMultipleFiles_ = false;
            this.javaGenerateEqualsAndHash_ = false;
            this.javaStringCheckUtf8_ = false;
            this.optimizeFor_ = 1;
            this.goPackage_ = "";
            this.ccGenericServices_ = false;
            this.javaGenericServices_ = false;
            this.pyGenericServices_ = false;
            this.phpGenericServices_ = false;
            this.deprecated_ = false;
            this.ccEnableArenas_ = true;
            this.objcClassPrefix_ = "";
            this.csharpNamespace_ = "";
            this.swiftPrefix_ = "";
            this.phpClassPrefix_ = "";
            this.phpNamespace_ = "";
            this.phpMetadataNamespace_ = "";
            this.rubyPackage_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.javaPackage_ = "";
            this.javaOuterClassname_ = "";
            this.optimizeFor_ = 1;
            this.goPackage_ = "";
            this.ccEnableArenas_ = true;
            this.objcClassPrefix_ = "";
            this.csharpNamespace_ = "";
            this.swiftPrefix_ = "";
            this.phpClassPrefix_ = "";
            this.phpNamespace_ = "";
            this.phpMetadataNamespace_ = "";
            this.rubyPackage_ = "";
            this.uninterpretedOption_ = Collections.emptyList();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new FileOptions();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_FileOptions_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_FileOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(FileOptions.class, Builder.class);
        }

        /* loaded from: classes2.dex */
        public enum OptimizeMode implements ProtocolMessageEnum {
            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);
            
            private final int value;
            private static final Internal.EnumLiteMap<OptimizeMode> internalValueMap = new Internal.EnumLiteMap<OptimizeMode>() { // from class: com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public OptimizeMode findValueByNumber(int i) {
                    return OptimizeMode.forNumber(i);
                }
            };
            private static final OptimizeMode[] VALUES = values();

            public static OptimizeMode forNumber(int i) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return LITE_RUNTIME;
                    }
                    return CODE_SIZE;
                }
                return SPEED;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            OptimizeMode(int i) {
                this.value = i;
            }
        }

        public String getJavaPackage() {
            Object obj = this.javaPackage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.javaPackage_ = stringUtf8;
            }
            return stringUtf8;
        }

        public String getJavaOuterClassname() {
            Object obj = this.javaOuterClassname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.javaOuterClassname_ = stringUtf8;
            }
            return stringUtf8;
        }

        public OptimizeMode getOptimizeFor() {
            OptimizeMode forNumber = OptimizeMode.forNumber(this.optimizeFor_);
            return forNumber == null ? OptimizeMode.SPEED : forNumber;
        }

        public String getGoPackage() {
            Object obj = this.goPackage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.goPackage_ = stringUtf8;
            }
            return stringUtf8;
        }

        public String getObjcClassPrefix() {
            Object obj = this.objcClassPrefix_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.objcClassPrefix_ = stringUtf8;
            }
            return stringUtf8;
        }

        public String getCsharpNamespace() {
            Object obj = this.csharpNamespace_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.csharpNamespace_ = stringUtf8;
            }
            return stringUtf8;
        }

        public String getSwiftPrefix() {
            Object obj = this.swiftPrefix_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.swiftPrefix_ = stringUtf8;
            }
            return stringUtf8;
        }

        public String getPhpClassPrefix() {
            Object obj = this.phpClassPrefix_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.phpClassPrefix_ = stringUtf8;
            }
            return stringUtf8;
        }

        public String getPhpNamespace() {
            Object obj = this.phpNamespace_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.phpNamespace_ = stringUtf8;
            }
            return stringUtf8;
        }

        public String getPhpMetadataNamespace() {
            Object obj = this.phpMetadataNamespace_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.phpMetadataNamespace_ = stringUtf8;
            }
            return stringUtf8;
        }

        public String getRubyPackage() {
            Object obj = this.rubyPackage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.rubyPackage_ = stringUtf8;
            }
            return stringUtf8;
        }

        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasFeatures() && !getFeatures().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.javaPackage_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.javaOuterClassname_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeEnum(9, this.optimizeFor_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(10, this.javaMultipleFiles_);
            }
            if ((this.bitField0_ & 64) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.goPackage_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeBool(16, this.ccGenericServices_);
            }
            if ((this.bitField0_ & JSONzip.end) != 0) {
                codedOutputStream.writeBool(17, this.javaGenericServices_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeBool(18, this.pyGenericServices_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(20, this.javaGenerateEqualsAndHash_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeBool(23, this.deprecated_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(27, this.javaStringCheckUtf8_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeBool(31, this.ccEnableArenas_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 36, this.objcClassPrefix_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 37, this.csharpNamespace_);
            }
            if ((this.bitField0_ & Privacy.DEFAULT) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 39, this.swiftPrefix_);
            }
            if ((this.bitField0_ & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 40, this.phpClassPrefix_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 41, this.phpNamespace_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeBool(42, this.phpGenericServices_);
            }
            if ((this.bitField0_ & 262144) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 44, this.phpMetadataNamespace_);
            }
            if ((this.bitField0_ & 524288) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 45, this.rubyPackage_);
            }
            if ((this.bitField0_ & 1048576) != 0) {
                codedOutputStream.writeMessage(50, getFeatures());
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.writeMessage(999, this.uninterpretedOption_.get(i));
            }
            newExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.javaPackage_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                computeStringSize += GeneratedMessageV3.computeStringSize(8, this.javaOuterClassname_);
            }
            if ((this.bitField0_ & 32) != 0) {
                computeStringSize += CodedOutputStream.computeEnumSize(9, this.optimizeFor_);
            }
            if ((this.bitField0_ & 4) != 0) {
                computeStringSize += CodedOutputStream.computeBoolSize(10, this.javaMultipleFiles_);
            }
            if ((this.bitField0_ & 64) != 0) {
                computeStringSize += GeneratedMessageV3.computeStringSize(11, this.goPackage_);
            }
            if ((this.bitField0_ & 128) != 0) {
                computeStringSize += CodedOutputStream.computeBoolSize(16, this.ccGenericServices_);
            }
            if ((this.bitField0_ & JSONzip.end) != 0) {
                computeStringSize += CodedOutputStream.computeBoolSize(17, this.javaGenericServices_);
            }
            if ((this.bitField0_ & 512) != 0) {
                computeStringSize += CodedOutputStream.computeBoolSize(18, this.pyGenericServices_);
            }
            if ((this.bitField0_ & 8) != 0) {
                computeStringSize += CodedOutputStream.computeBoolSize(20, this.javaGenerateEqualsAndHash_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                computeStringSize += CodedOutputStream.computeBoolSize(23, this.deprecated_);
            }
            if ((this.bitField0_ & 16) != 0) {
                computeStringSize += CodedOutputStream.computeBoolSize(27, this.javaStringCheckUtf8_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                computeStringSize += CodedOutputStream.computeBoolSize(31, this.ccEnableArenas_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                computeStringSize += GeneratedMessageV3.computeStringSize(36, this.objcClassPrefix_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                computeStringSize += GeneratedMessageV3.computeStringSize(37, this.csharpNamespace_);
            }
            if ((this.bitField0_ & Privacy.DEFAULT) != 0) {
                computeStringSize += GeneratedMessageV3.computeStringSize(39, this.swiftPrefix_);
            }
            if ((this.bitField0_ & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0) {
                computeStringSize += GeneratedMessageV3.computeStringSize(40, this.phpClassPrefix_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                computeStringSize += GeneratedMessageV3.computeStringSize(41, this.phpNamespace_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                computeStringSize += CodedOutputStream.computeBoolSize(42, this.phpGenericServices_);
            }
            if ((this.bitField0_ & 262144) != 0) {
                computeStringSize += GeneratedMessageV3.computeStringSize(44, this.phpMetadataNamespace_);
            }
            if ((this.bitField0_ & 524288) != 0) {
                computeStringSize += GeneratedMessageV3.computeStringSize(45, this.rubyPackage_);
            }
            if ((this.bitField0_ & 1048576) != 0) {
                computeStringSize += CodedOutputStream.computeMessageSize(50, getFeatures());
            }
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                computeStringSize += CodedOutputStream.computeMessageSize(999, this.uninterpretedOption_.get(i2));
            }
            int extensionsSerializedSize = computeStringSize + extensionsSerializedSize() + getUnknownFields().getSerializedSize();
            this.memoizedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileOptions)) {
                return super.equals(obj);
            }
            FileOptions fileOptions = (FileOptions) obj;
            if (hasJavaPackage() != fileOptions.hasJavaPackage()) {
                return false;
            }
            if ((!hasJavaPackage() || getJavaPackage().equals(fileOptions.getJavaPackage())) && hasJavaOuterClassname() == fileOptions.hasJavaOuterClassname()) {
                if ((!hasJavaOuterClassname() || getJavaOuterClassname().equals(fileOptions.getJavaOuterClassname())) && hasJavaMultipleFiles() == fileOptions.hasJavaMultipleFiles()) {
                    if ((!hasJavaMultipleFiles() || getJavaMultipleFiles() == fileOptions.getJavaMultipleFiles()) && hasJavaGenerateEqualsAndHash() == fileOptions.hasJavaGenerateEqualsAndHash()) {
                        if ((!hasJavaGenerateEqualsAndHash() || getJavaGenerateEqualsAndHash() == fileOptions.getJavaGenerateEqualsAndHash()) && hasJavaStringCheckUtf8() == fileOptions.hasJavaStringCheckUtf8()) {
                            if ((!hasJavaStringCheckUtf8() || getJavaStringCheckUtf8() == fileOptions.getJavaStringCheckUtf8()) && hasOptimizeFor() == fileOptions.hasOptimizeFor()) {
                                if ((!hasOptimizeFor() || this.optimizeFor_ == fileOptions.optimizeFor_) && hasGoPackage() == fileOptions.hasGoPackage()) {
                                    if ((!hasGoPackage() || getGoPackage().equals(fileOptions.getGoPackage())) && hasCcGenericServices() == fileOptions.hasCcGenericServices()) {
                                        if ((!hasCcGenericServices() || getCcGenericServices() == fileOptions.getCcGenericServices()) && hasJavaGenericServices() == fileOptions.hasJavaGenericServices()) {
                                            if ((!hasJavaGenericServices() || getJavaGenericServices() == fileOptions.getJavaGenericServices()) && hasPyGenericServices() == fileOptions.hasPyGenericServices()) {
                                                if ((!hasPyGenericServices() || getPyGenericServices() == fileOptions.getPyGenericServices()) && hasPhpGenericServices() == fileOptions.hasPhpGenericServices()) {
                                                    if ((!hasPhpGenericServices() || getPhpGenericServices() == fileOptions.getPhpGenericServices()) && hasDeprecated() == fileOptions.hasDeprecated()) {
                                                        if ((!hasDeprecated() || getDeprecated() == fileOptions.getDeprecated()) && hasCcEnableArenas() == fileOptions.hasCcEnableArenas()) {
                                                            if ((!hasCcEnableArenas() || getCcEnableArenas() == fileOptions.getCcEnableArenas()) && hasObjcClassPrefix() == fileOptions.hasObjcClassPrefix()) {
                                                                if ((!hasObjcClassPrefix() || getObjcClassPrefix().equals(fileOptions.getObjcClassPrefix())) && hasCsharpNamespace() == fileOptions.hasCsharpNamespace()) {
                                                                    if ((!hasCsharpNamespace() || getCsharpNamespace().equals(fileOptions.getCsharpNamespace())) && hasSwiftPrefix() == fileOptions.hasSwiftPrefix()) {
                                                                        if ((!hasSwiftPrefix() || getSwiftPrefix().equals(fileOptions.getSwiftPrefix())) && hasPhpClassPrefix() == fileOptions.hasPhpClassPrefix()) {
                                                                            if ((!hasPhpClassPrefix() || getPhpClassPrefix().equals(fileOptions.getPhpClassPrefix())) && hasPhpNamespace() == fileOptions.hasPhpNamespace()) {
                                                                                if ((!hasPhpNamespace() || getPhpNamespace().equals(fileOptions.getPhpNamespace())) && hasPhpMetadataNamespace() == fileOptions.hasPhpMetadataNamespace()) {
                                                                                    if ((!hasPhpMetadataNamespace() || getPhpMetadataNamespace().equals(fileOptions.getPhpMetadataNamespace())) && hasRubyPackage() == fileOptions.hasRubyPackage()) {
                                                                                        if ((!hasRubyPackage() || getRubyPackage().equals(fileOptions.getRubyPackage())) && hasFeatures() == fileOptions.hasFeatures()) {
                                                                                            return (!hasFeatures() || getFeatures().equals(fileOptions.getFeatures())) && getUninterpretedOptionList().equals(fileOptions.getUninterpretedOptionList()) && getUnknownFields().equals(fileOptions.getUnknownFields()) && getExtensionFields().equals(fileOptions.getExtensionFields());
                                                                                        }
                                                                                        return false;
                                                                                    }
                                                                                    return false;
                                                                                }
                                                                                return false;
                                                                            }
                                                                            return false;
                                                                        }
                                                                        return false;
                                                                    }
                                                                    return false;
                                                                }
                                                                return false;
                                                            }
                                                            return false;
                                                        }
                                                        return false;
                                                    }
                                                    return false;
                                                }
                                                return false;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasJavaPackage()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getJavaPackage().hashCode();
            }
            if (hasJavaOuterClassname()) {
                hashCode = (((hashCode * 37) + 8) * 53) + getJavaOuterClassname().hashCode();
            }
            if (hasJavaMultipleFiles()) {
                hashCode = (((hashCode * 37) + 10) * 53) + Internal.hashBoolean(getJavaMultipleFiles());
            }
            if (hasJavaGenerateEqualsAndHash()) {
                hashCode = (((hashCode * 37) + 20) * 53) + Internal.hashBoolean(getJavaGenerateEqualsAndHash());
            }
            if (hasJavaStringCheckUtf8()) {
                hashCode = (((hashCode * 37) + 27) * 53) + Internal.hashBoolean(getJavaStringCheckUtf8());
            }
            if (hasOptimizeFor()) {
                hashCode = (((hashCode * 37) + 9) * 53) + this.optimizeFor_;
            }
            if (hasGoPackage()) {
                hashCode = (((hashCode * 37) + 11) * 53) + getGoPackage().hashCode();
            }
            if (hasCcGenericServices()) {
                hashCode = (((hashCode * 37) + 16) * 53) + Internal.hashBoolean(getCcGenericServices());
            }
            if (hasJavaGenericServices()) {
                hashCode = (((hashCode * 37) + 17) * 53) + Internal.hashBoolean(getJavaGenericServices());
            }
            if (hasPyGenericServices()) {
                hashCode = (((hashCode * 37) + 18) * 53) + Internal.hashBoolean(getPyGenericServices());
            }
            if (hasPhpGenericServices()) {
                hashCode = (((hashCode * 37) + 42) * 53) + Internal.hashBoolean(getPhpGenericServices());
            }
            if (hasDeprecated()) {
                hashCode = (((hashCode * 37) + 23) * 53) + Internal.hashBoolean(getDeprecated());
            }
            if (hasCcEnableArenas()) {
                hashCode = (((hashCode * 37) + 31) * 53) + Internal.hashBoolean(getCcEnableArenas());
            }
            if (hasObjcClassPrefix()) {
                hashCode = (((hashCode * 37) + 36) * 53) + getObjcClassPrefix().hashCode();
            }
            if (hasCsharpNamespace()) {
                hashCode = (((hashCode * 37) + 37) * 53) + getCsharpNamespace().hashCode();
            }
            if (hasSwiftPrefix()) {
                hashCode = (((hashCode * 37) + 39) * 53) + getSwiftPrefix().hashCode();
            }
            if (hasPhpClassPrefix()) {
                hashCode = (((hashCode * 37) + 40) * 53) + getPhpClassPrefix().hashCode();
            }
            if (hasPhpNamespace()) {
                hashCode = (((hashCode * 37) + 41) * 53) + getPhpNamespace().hashCode();
            }
            if (hasPhpMetadataNamespace()) {
                hashCode = (((hashCode * 37) + 44) * 53) + getPhpMetadataNamespace().hashCode();
            }
            if (hasRubyPackage()) {
                hashCode = (((hashCode * 37) + 45) * 53) + getRubyPackage().hashCode();
            }
            if (hasFeatures()) {
                hashCode = (((hashCode * 37) + 50) * 53) + getFeatures().hashCode();
            }
            if (getUninterpretedOptionCount() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int hashFields = (AbstractMessage.hashFields(hashCode, getExtensionFields()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<FileOptions, Builder> implements FileOptionsOrBuilder {
            private int bitField0_;
            private boolean ccEnableArenas_;
            private boolean ccGenericServices_;
            private Object csharpNamespace_;
            private boolean deprecated_;
            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> featuresBuilder_;
            private FeatureSet features_;
            private Object goPackage_;
            private boolean javaGenerateEqualsAndHash_;
            private boolean javaGenericServices_;
            private boolean javaMultipleFiles_;
            private Object javaOuterClassname_;
            private Object javaPackage_;
            private boolean javaStringCheckUtf8_;
            private Object objcClassPrefix_;
            private int optimizeFor_;
            private Object phpClassPrefix_;
            private boolean phpGenericServices_;
            private Object phpMetadataNamespace_;
            private Object phpNamespace_;
            private boolean pyGenericServices_;
            private Object rubyPackage_;
            private Object swiftPrefix_;
            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> uninterpretedOptionBuilder_;
            private List<UninterpretedOption> uninterpretedOption_;

            public boolean hasFeatures() {
                return (this.bitField0_ & 1048576) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_FileOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(FileOptions.class, Builder.class);
            }

            private Builder() {
                this.javaPackage_ = "";
                this.javaOuterClassname_ = "";
                this.optimizeFor_ = 1;
                this.goPackage_ = "";
                this.ccEnableArenas_ = true;
                this.objcClassPrefix_ = "";
                this.csharpNamespace_ = "";
                this.swiftPrefix_ = "";
                this.phpClassPrefix_ = "";
                this.phpNamespace_ = "";
                this.phpMetadataNamespace_ = "";
                this.rubyPackage_ = "";
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.javaPackage_ = "";
                this.javaOuterClassname_ = "";
                this.optimizeFor_ = 1;
                this.goPackage_ = "";
                this.ccEnableArenas_ = true;
                this.objcClassPrefix_ = "";
                this.csharpNamespace_ = "";
                this.swiftPrefix_ = "";
                this.phpClassPrefix_ = "";
                this.phpNamespace_ = "";
                this.phpMetadataNamespace_ = "";
                this.rubyPackage_ = "";
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getFeaturesFieldBuilder();
                    getUninterpretedOptionFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_FileOptions_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FileOptions getDefaultInstanceForType() {
                return FileOptions.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileOptions build() {
                FileOptions buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileOptions buildPartial() {
                FileOptions fileOptions = new FileOptions(this);
                buildPartialRepeatedFields(fileOptions);
                if (this.bitField0_ != 0) {
                    buildPartial0(fileOptions);
                }
                onBuilt();
                return fileOptions;
            }

            private void buildPartialRepeatedFields(FileOptions fileOptions) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2097152) != 0) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                        this.bitField0_ &= -2097153;
                    }
                    fileOptions.uninterpretedOption_ = this.uninterpretedOption_;
                    return;
                }
                fileOptions.uninterpretedOption_ = repeatedFieldBuilderV3.build();
            }

            private void buildPartial0(FileOptions fileOptions) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    fileOptions.javaPackage_ = this.javaPackage_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    fileOptions.javaOuterClassname_ = this.javaOuterClassname_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    fileOptions.javaMultipleFiles_ = this.javaMultipleFiles_;
                    i |= 4;
                }
                if ((i2 & 8) != 0) {
                    fileOptions.javaGenerateEqualsAndHash_ = this.javaGenerateEqualsAndHash_;
                    i |= 8;
                }
                if ((i2 & 16) != 0) {
                    fileOptions.javaStringCheckUtf8_ = this.javaStringCheckUtf8_;
                    i |= 16;
                }
                if ((i2 & 32) != 0) {
                    fileOptions.optimizeFor_ = this.optimizeFor_;
                    i |= 32;
                }
                if ((i2 & 64) != 0) {
                    fileOptions.goPackage_ = this.goPackage_;
                    i |= 64;
                }
                if ((i2 & 128) != 0) {
                    fileOptions.ccGenericServices_ = this.ccGenericServices_;
                    i |= 128;
                }
                if ((i2 & JSONzip.end) != 0) {
                    fileOptions.javaGenericServices_ = this.javaGenericServices_;
                    i |= JSONzip.end;
                }
                if ((i2 & 512) != 0) {
                    fileOptions.pyGenericServices_ = this.pyGenericServices_;
                    i |= 512;
                }
                if ((i2 & 1024) != 0) {
                    fileOptions.phpGenericServices_ = this.phpGenericServices_;
                    i |= 1024;
                }
                if ((i2 & 2048) != 0) {
                    fileOptions.deprecated_ = this.deprecated_;
                    i |= 2048;
                }
                if ((i2 & 4096) != 0) {
                    fileOptions.ccEnableArenas_ = this.ccEnableArenas_;
                    i |= 4096;
                }
                if ((i2 & 8192) != 0) {
                    fileOptions.objcClassPrefix_ = this.objcClassPrefix_;
                    i |= 8192;
                }
                if ((i2 & 16384) != 0) {
                    fileOptions.csharpNamespace_ = this.csharpNamespace_;
                    i |= 16384;
                }
                if ((i2 & Privacy.DEFAULT) != 0) {
                    fileOptions.swiftPrefix_ = this.swiftPrefix_;
                    i |= Privacy.DEFAULT;
                }
                if ((i2 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0) {
                    fileOptions.phpClassPrefix_ = this.phpClassPrefix_;
                    i |= AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
                }
                if ((i2 & 131072) != 0) {
                    fileOptions.phpNamespace_ = this.phpNamespace_;
                    i |= 131072;
                }
                if ((i2 & 262144) != 0) {
                    fileOptions.phpMetadataNamespace_ = this.phpMetadataNamespace_;
                    i |= 262144;
                }
                if ((i2 & 524288) != 0) {
                    fileOptions.rubyPackage_ = this.rubyPackage_;
                    i |= 524288;
                }
                if ((i2 & 1048576) != 0) {
                    SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                    fileOptions.features_ = singleFieldBuilderV3 == null ? this.features_ : singleFieldBuilderV3.build();
                    i |= 1048576;
                }
                FileOptions.access$18076(fileOptions, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FileOptions) {
                    return mergeFrom((FileOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FileOptions fileOptions) {
                if (fileOptions == FileOptions.getDefaultInstance()) {
                    return this;
                }
                if (fileOptions.hasJavaPackage()) {
                    this.javaPackage_ = fileOptions.javaPackage_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (fileOptions.hasJavaOuterClassname()) {
                    this.javaOuterClassname_ = fileOptions.javaOuterClassname_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (fileOptions.hasJavaMultipleFiles()) {
                    setJavaMultipleFiles(fileOptions.getJavaMultipleFiles());
                }
                if (fileOptions.hasJavaGenerateEqualsAndHash()) {
                    setJavaGenerateEqualsAndHash(fileOptions.getJavaGenerateEqualsAndHash());
                }
                if (fileOptions.hasJavaStringCheckUtf8()) {
                    setJavaStringCheckUtf8(fileOptions.getJavaStringCheckUtf8());
                }
                if (fileOptions.hasOptimizeFor()) {
                    setOptimizeFor(fileOptions.getOptimizeFor());
                }
                if (fileOptions.hasGoPackage()) {
                    this.goPackage_ = fileOptions.goPackage_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (fileOptions.hasCcGenericServices()) {
                    setCcGenericServices(fileOptions.getCcGenericServices());
                }
                if (fileOptions.hasJavaGenericServices()) {
                    setJavaGenericServices(fileOptions.getJavaGenericServices());
                }
                if (fileOptions.hasPyGenericServices()) {
                    setPyGenericServices(fileOptions.getPyGenericServices());
                }
                if (fileOptions.hasPhpGenericServices()) {
                    setPhpGenericServices(fileOptions.getPhpGenericServices());
                }
                if (fileOptions.hasDeprecated()) {
                    setDeprecated(fileOptions.getDeprecated());
                }
                if (fileOptions.hasCcEnableArenas()) {
                    setCcEnableArenas(fileOptions.getCcEnableArenas());
                }
                if (fileOptions.hasObjcClassPrefix()) {
                    this.objcClassPrefix_ = fileOptions.objcClassPrefix_;
                    this.bitField0_ |= 8192;
                    onChanged();
                }
                if (fileOptions.hasCsharpNamespace()) {
                    this.csharpNamespace_ = fileOptions.csharpNamespace_;
                    this.bitField0_ |= 16384;
                    onChanged();
                }
                if (fileOptions.hasSwiftPrefix()) {
                    this.swiftPrefix_ = fileOptions.swiftPrefix_;
                    this.bitField0_ |= Privacy.DEFAULT;
                    onChanged();
                }
                if (fileOptions.hasPhpClassPrefix()) {
                    this.phpClassPrefix_ = fileOptions.phpClassPrefix_;
                    this.bitField0_ |= AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
                    onChanged();
                }
                if (fileOptions.hasPhpNamespace()) {
                    this.phpNamespace_ = fileOptions.phpNamespace_;
                    this.bitField0_ |= 131072;
                    onChanged();
                }
                if (fileOptions.hasPhpMetadataNamespace()) {
                    this.phpMetadataNamespace_ = fileOptions.phpMetadataNamespace_;
                    this.bitField0_ |= 262144;
                    onChanged();
                }
                if (fileOptions.hasRubyPackage()) {
                    this.rubyPackage_ = fileOptions.rubyPackage_;
                    this.bitField0_ |= 524288;
                    onChanged();
                }
                if (fileOptions.hasFeatures()) {
                    mergeFeatures(fileOptions.getFeatures());
                }
                if (this.uninterpretedOptionBuilder_ == null) {
                    if (!fileOptions.uninterpretedOption_.isEmpty()) {
                        if (this.uninterpretedOption_.isEmpty()) {
                            this.uninterpretedOption_ = fileOptions.uninterpretedOption_;
                            this.bitField0_ &= -2097153;
                        } else {
                            ensureUninterpretedOptionIsMutable();
                            this.uninterpretedOption_.addAll(fileOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!fileOptions.uninterpretedOption_.isEmpty()) {
                    if (!this.uninterpretedOptionBuilder_.isEmpty()) {
                        this.uninterpretedOptionBuilder_.addAllMessages(fileOptions.uninterpretedOption_);
                    } else {
                        this.uninterpretedOptionBuilder_.dispose();
                        this.uninterpretedOptionBuilder_ = null;
                        this.uninterpretedOption_ = fileOptions.uninterpretedOption_;
                        this.bitField0_ = (-2097153) & this.bitField0_;
                        this.uninterpretedOptionBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getUninterpretedOptionFieldBuilder() : null;
                    }
                }
                mergeExtensionFields(fileOptions);
                mergeUnknownFields(fileOptions.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFeatures() || getFeatures().isInitialized()) {
                    for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                        if (!getUninterpretedOption(i).isInitialized()) {
                            return false;
                        }
                    }
                    return extensionsAreInitialized();
                }
                return false;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            switch (readTag) {
                                case 0:
                                    break;
                                case 10:
                                    this.javaPackage_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 66:
                                    this.javaOuterClassname_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 72:
                                    int readEnum = codedInputStream.readEnum();
                                    if (OptimizeMode.forNumber(readEnum) == null) {
                                        mergeUnknownVarintField(9, readEnum);
                                    } else {
                                        this.optimizeFor_ = readEnum;
                                        this.bitField0_ |= 32;
                                        continue;
                                    }
                                case 80:
                                    this.javaMultipleFiles_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 90:
                                    this.goPackage_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 128:
                                    this.ccGenericServices_ = codedInputStream.readBool();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 136:
                                    this.javaGenericServices_ = codedInputStream.readBool();
                                    this.bitField0_ |= JSONzip.end;
                                    continue;
                                case 144:
                                    this.pyGenericServices_ = codedInputStream.readBool();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 160:
                                    this.javaGenerateEqualsAndHash_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 184:
                                    this.deprecated_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 216:
                                    this.javaStringCheckUtf8_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 248:
                                    this.ccEnableArenas_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 290:
                                    this.objcClassPrefix_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 298:
                                    this.csharpNamespace_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16384;
                                    continue;
                                case 314:
                                    this.swiftPrefix_ = codedInputStream.readBytes();
                                    this.bitField0_ |= Privacy.DEFAULT;
                                    continue;
                                case 322:
                                    this.phpClassPrefix_ = codedInputStream.readBytes();
                                    this.bitField0_ |= AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
                                    continue;
                                case 330:
                                    this.phpNamespace_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 131072;
                                    continue;
                                case 336:
                                    this.phpGenericServices_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 354:
                                    this.phpMetadataNamespace_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 262144;
                                    continue;
                                case 362:
                                    this.rubyPackage_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 524288;
                                    continue;
                                case 402:
                                    codedInputStream.readMessage(getFeaturesFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1048576;
                                    continue;
                                case 7994:
                                    UninterpretedOption uninterpretedOption = (UninterpretedOption) codedInputStream.readMessage(UninterpretedOption.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureUninterpretedOptionIsMutable();
                                        this.uninterpretedOption_.add(uninterpretedOption);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(uninterpretedOption);
                                        continue;
                                    }
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            public Builder setJavaMultipleFiles(boolean z) {
                this.javaMultipleFiles_ = z;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Deprecated
            public Builder setJavaGenerateEqualsAndHash(boolean z) {
                this.javaGenerateEqualsAndHash_ = z;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setJavaStringCheckUtf8(boolean z) {
                this.javaStringCheckUtf8_ = z;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setOptimizeFor(OptimizeMode optimizeMode) {
                optimizeMode.getClass();
                this.bitField0_ |= 32;
                this.optimizeFor_ = optimizeMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setCcGenericServices(boolean z) {
                this.ccGenericServices_ = z;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setJavaGenericServices(boolean z) {
                this.javaGenericServices_ = z;
                this.bitField0_ |= JSONzip.end;
                onChanged();
                return this;
            }

            public Builder setPyGenericServices(boolean z) {
                this.pyGenericServices_ = z;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setPhpGenericServices(boolean z) {
                this.phpGenericServices_ = z;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setDeprecated(boolean z) {
                this.deprecated_ = z;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setCcEnableArenas(boolean z) {
                this.ccEnableArenas_ = z;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public FeatureSet getFeatures() {
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    FeatureSet featureSet = this.features_;
                    return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                FeatureSet featureSet2;
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1048576) == 0 || (featureSet2 = this.features_) == null || featureSet2 == FeatureSet.getDefaultInstance()) {
                        this.features_ = featureSet;
                    } else {
                        getFeaturesBuilder().mergeFrom(featureSet);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(featureSet);
                }
                if (this.features_ != null) {
                    this.bitField0_ |= 1048576;
                    onChanged();
                }
                return this;
            }

            public FeatureSet.Builder getFeaturesBuilder() {
                this.bitField0_ |= 1048576;
                onChanged();
                return getFeaturesFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> getFeaturesFieldBuilder() {
                if (this.featuresBuilder_ == null) {
                    this.featuresBuilder_ = new SingleFieldBuilderV3<>(getFeatures(), getParentForChildren(), isClean());
                    this.features_ = null;
                }
                return this.featuresBuilder_;
            }

            private void ensureUninterpretedOptionIsMutable() {
                if ((this.bitField0_ & 2097152) == 0) {
                    this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                    this.bitField0_ |= 2097152;
                }
            }

            public int getUninterpretedOptionCount() {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> getUninterpretedOptionFieldBuilder() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOptionBuilder_ = new RepeatedFieldBuilderV3<>(this.uninterpretedOption_, (this.bitField0_ & 2097152) != 0, getParentForChildren(), isClean());
                    this.uninterpretedOption_ = null;
                }
                return this.uninterpretedOptionBuilder_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class MessageOptions extends GeneratedMessageV3.ExtendableMessage<MessageOptions> implements MessageOptionsOrBuilder {
        private static final MessageOptions DEFAULT_INSTANCE = new MessageOptions();
        @Deprecated
        public static final Parser<MessageOptions> PARSER = new AbstractParser<MessageOptions>() { // from class: com.google.protobuf.DescriptorProtos.MessageOptions.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public MessageOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = MessageOptions.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean deprecatedLegacyJsonFieldConflicts_;
        private boolean deprecated_;
        private FeatureSet features_;
        private boolean mapEntry_;
        private byte memoizedIsInitialized;
        private boolean messageSetWireFormat_;
        private boolean noStandardDescriptorAccessor_;
        private List<UninterpretedOption> uninterpretedOption_;

        public static MessageOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MessageOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts() {
            return this.deprecatedLegacyJsonFieldConflicts_;
        }

        public boolean getMapEntry() {
            return this.mapEntry_;
        }

        public boolean getMessageSetWireFormat() {
            return this.messageSetWireFormat_;
        }

        public boolean getNoStandardDescriptorAccessor() {
            return this.noStandardDescriptorAccessor_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<MessageOptions> getParserForType() {
            return PARSER;
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 4) != 0;
        }

        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasFeatures() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasMapEntry() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasMessageSetWireFormat() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasNoStandardDescriptorAccessor() {
            return (this.bitField0_ & 2) != 0;
        }

        static /* synthetic */ int access$19376(MessageOptions messageOptions, int i) {
            int i2 = i | messageOptions.bitField0_;
            messageOptions.bitField0_ = i2;
            return i2;
        }

        private MessageOptions(GeneratedMessageV3.ExtendableBuilder<MessageOptions, ?> extendableBuilder) {
            super(extendableBuilder);
            this.messageSetWireFormat_ = false;
            this.noStandardDescriptorAccessor_ = false;
            this.deprecated_ = false;
            this.mapEntry_ = false;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        private MessageOptions() {
            this.messageSetWireFormat_ = false;
            this.noStandardDescriptorAccessor_ = false;
            this.deprecated_ = false;
            this.mapEntry_ = false;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MessageOptions();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_MessageOptions_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_MessageOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageOptions.class, Builder.class);
        }

        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasFeatures() && !getFeatures().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.messageSetWireFormat_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.noStandardDescriptorAccessor_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.deprecated_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(7, this.mapEntry_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(11, this.deprecatedLegacyJsonFieldConflicts_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(12, getFeatures());
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.writeMessage(999, this.uninterpretedOption_.get(i));
            }
            newExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.messageSetWireFormat_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                computeBoolSize += CodedOutputStream.computeBoolSize(2, this.noStandardDescriptorAccessor_);
            }
            if ((this.bitField0_ & 4) != 0) {
                computeBoolSize += CodedOutputStream.computeBoolSize(3, this.deprecated_);
            }
            if ((this.bitField0_ & 8) != 0) {
                computeBoolSize += CodedOutputStream.computeBoolSize(7, this.mapEntry_);
            }
            if ((this.bitField0_ & 16) != 0) {
                computeBoolSize += CodedOutputStream.computeBoolSize(11, this.deprecatedLegacyJsonFieldConflicts_);
            }
            if ((this.bitField0_ & 32) != 0) {
                computeBoolSize += CodedOutputStream.computeMessageSize(12, getFeatures());
            }
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                computeBoolSize += CodedOutputStream.computeMessageSize(999, this.uninterpretedOption_.get(i2));
            }
            int extensionsSerializedSize = computeBoolSize + extensionsSerializedSize() + getUnknownFields().getSerializedSize();
            this.memoizedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MessageOptions)) {
                return super.equals(obj);
            }
            MessageOptions messageOptions = (MessageOptions) obj;
            if (hasMessageSetWireFormat() != messageOptions.hasMessageSetWireFormat()) {
                return false;
            }
            if ((!hasMessageSetWireFormat() || getMessageSetWireFormat() == messageOptions.getMessageSetWireFormat()) && hasNoStandardDescriptorAccessor() == messageOptions.hasNoStandardDescriptorAccessor()) {
                if ((!hasNoStandardDescriptorAccessor() || getNoStandardDescriptorAccessor() == messageOptions.getNoStandardDescriptorAccessor()) && hasDeprecated() == messageOptions.hasDeprecated()) {
                    if ((!hasDeprecated() || getDeprecated() == messageOptions.getDeprecated()) && hasMapEntry() == messageOptions.hasMapEntry()) {
                        if ((!hasMapEntry() || getMapEntry() == messageOptions.getMapEntry()) && hasDeprecatedLegacyJsonFieldConflicts() == messageOptions.hasDeprecatedLegacyJsonFieldConflicts()) {
                            if ((!hasDeprecatedLegacyJsonFieldConflicts() || getDeprecatedLegacyJsonFieldConflicts() == messageOptions.getDeprecatedLegacyJsonFieldConflicts()) && hasFeatures() == messageOptions.hasFeatures()) {
                                return (!hasFeatures() || getFeatures().equals(messageOptions.getFeatures())) && getUninterpretedOptionList().equals(messageOptions.getUninterpretedOptionList()) && getUnknownFields().equals(messageOptions.getUnknownFields()) && getExtensionFields().equals(messageOptions.getExtensionFields());
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasMessageSetWireFormat()) {
                hashCode = (((hashCode * 37) + 1) * 53) + Internal.hashBoolean(getMessageSetWireFormat());
            }
            if (hasNoStandardDescriptorAccessor()) {
                hashCode = (((hashCode * 37) + 2) * 53) + Internal.hashBoolean(getNoStandardDescriptorAccessor());
            }
            if (hasDeprecated()) {
                hashCode = (((hashCode * 37) + 3) * 53) + Internal.hashBoolean(getDeprecated());
            }
            if (hasMapEntry()) {
                hashCode = (((hashCode * 37) + 7) * 53) + Internal.hashBoolean(getMapEntry());
            }
            if (hasDeprecatedLegacyJsonFieldConflicts()) {
                hashCode = (((hashCode * 37) + 11) * 53) + Internal.hashBoolean(getDeprecatedLegacyJsonFieldConflicts());
            }
            if (hasFeatures()) {
                hashCode = (((hashCode * 37) + 12) * 53) + getFeatures().hashCode();
            }
            if (getUninterpretedOptionCount() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int hashFields = (AbstractMessage.hashFields(hashCode, getExtensionFields()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<MessageOptions, Builder> implements MessageOptionsOrBuilder {
            private int bitField0_;
            private boolean deprecatedLegacyJsonFieldConflicts_;
            private boolean deprecated_;
            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> featuresBuilder_;
            private FeatureSet features_;
            private boolean mapEntry_;
            private boolean messageSetWireFormat_;
            private boolean noStandardDescriptorAccessor_;
            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> uninterpretedOptionBuilder_;
            private List<UninterpretedOption> uninterpretedOption_;

            public boolean hasFeatures() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_MessageOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageOptions.class, Builder.class);
            }

            private Builder() {
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getFeaturesFieldBuilder();
                    getUninterpretedOptionFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_MessageOptions_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MessageOptions getDefaultInstanceForType() {
                return MessageOptions.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MessageOptions build() {
                MessageOptions buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MessageOptions buildPartial() {
                MessageOptions messageOptions = new MessageOptions(this);
                buildPartialRepeatedFields(messageOptions);
                if (this.bitField0_ != 0) {
                    buildPartial0(messageOptions);
                }
                onBuilt();
                return messageOptions;
            }

            private void buildPartialRepeatedFields(MessageOptions messageOptions) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 64) != 0) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                        this.bitField0_ &= -65;
                    }
                    messageOptions.uninterpretedOption_ = this.uninterpretedOption_;
                    return;
                }
                messageOptions.uninterpretedOption_ = repeatedFieldBuilderV3.build();
            }

            private void buildPartial0(MessageOptions messageOptions) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    messageOptions.messageSetWireFormat_ = this.messageSetWireFormat_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    messageOptions.noStandardDescriptorAccessor_ = this.noStandardDescriptorAccessor_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    messageOptions.deprecated_ = this.deprecated_;
                    i |= 4;
                }
                if ((i2 & 8) != 0) {
                    messageOptions.mapEntry_ = this.mapEntry_;
                    i |= 8;
                }
                if ((i2 & 16) != 0) {
                    messageOptions.deprecatedLegacyJsonFieldConflicts_ = this.deprecatedLegacyJsonFieldConflicts_;
                    i |= 16;
                }
                if ((i2 & 32) != 0) {
                    SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                    messageOptions.features_ = singleFieldBuilderV3 == null ? this.features_ : singleFieldBuilderV3.build();
                    i |= 32;
                }
                MessageOptions.access$19376(messageOptions, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MessageOptions) {
                    return mergeFrom((MessageOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MessageOptions messageOptions) {
                if (messageOptions == MessageOptions.getDefaultInstance()) {
                    return this;
                }
                if (messageOptions.hasMessageSetWireFormat()) {
                    setMessageSetWireFormat(messageOptions.getMessageSetWireFormat());
                }
                if (messageOptions.hasNoStandardDescriptorAccessor()) {
                    setNoStandardDescriptorAccessor(messageOptions.getNoStandardDescriptorAccessor());
                }
                if (messageOptions.hasDeprecated()) {
                    setDeprecated(messageOptions.getDeprecated());
                }
                if (messageOptions.hasMapEntry()) {
                    setMapEntry(messageOptions.getMapEntry());
                }
                if (messageOptions.hasDeprecatedLegacyJsonFieldConflicts()) {
                    setDeprecatedLegacyJsonFieldConflicts(messageOptions.getDeprecatedLegacyJsonFieldConflicts());
                }
                if (messageOptions.hasFeatures()) {
                    mergeFeatures(messageOptions.getFeatures());
                }
                if (this.uninterpretedOptionBuilder_ == null) {
                    if (!messageOptions.uninterpretedOption_.isEmpty()) {
                        if (this.uninterpretedOption_.isEmpty()) {
                            this.uninterpretedOption_ = messageOptions.uninterpretedOption_;
                            this.bitField0_ &= -65;
                        } else {
                            ensureUninterpretedOptionIsMutable();
                            this.uninterpretedOption_.addAll(messageOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!messageOptions.uninterpretedOption_.isEmpty()) {
                    if (!this.uninterpretedOptionBuilder_.isEmpty()) {
                        this.uninterpretedOptionBuilder_.addAllMessages(messageOptions.uninterpretedOption_);
                    } else {
                        this.uninterpretedOptionBuilder_.dispose();
                        this.uninterpretedOptionBuilder_ = null;
                        this.uninterpretedOption_ = messageOptions.uninterpretedOption_;
                        this.bitField0_ &= -65;
                        this.uninterpretedOptionBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getUninterpretedOptionFieldBuilder() : null;
                    }
                }
                mergeExtensionFields(messageOptions);
                mergeUnknownFields(messageOptions.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFeatures() || getFeatures().isInitialized()) {
                    for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                        if (!getUninterpretedOption(i).isInitialized()) {
                            return false;
                        }
                    }
                    return extensionsAreInitialized();
                }
                return false;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.messageSetWireFormat_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (readTag == 16) {
                                    this.noStandardDescriptorAccessor_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (readTag == 24) {
                                    this.deprecated_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (readTag == 56) {
                                    this.mapEntry_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                } else if (readTag == 88) {
                                    this.deprecatedLegacyJsonFieldConflicts_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16;
                                } else if (readTag == 98) {
                                    codedInputStream.readMessage(getFeaturesFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (readTag == 7994) {
                                    UninterpretedOption uninterpretedOption = (UninterpretedOption) codedInputStream.readMessage(UninterpretedOption.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureUninterpretedOptionIsMutable();
                                        this.uninterpretedOption_.add(uninterpretedOption);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(uninterpretedOption);
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            public Builder setMessageSetWireFormat(boolean z) {
                this.messageSetWireFormat_ = z;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setNoStandardDescriptorAccessor(boolean z) {
                this.noStandardDescriptorAccessor_ = z;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setDeprecated(boolean z) {
                this.deprecated_ = z;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMapEntry(boolean z) {
                this.mapEntry_ = z;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Deprecated
            public Builder setDeprecatedLegacyJsonFieldConflicts(boolean z) {
                this.deprecatedLegacyJsonFieldConflicts_ = z;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public FeatureSet getFeatures() {
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    FeatureSet featureSet = this.features_;
                    return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                FeatureSet featureSet2;
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 32) == 0 || (featureSet2 = this.features_) == null || featureSet2 == FeatureSet.getDefaultInstance()) {
                        this.features_ = featureSet;
                    } else {
                        getFeaturesBuilder().mergeFrom(featureSet);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(featureSet);
                }
                if (this.features_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public FeatureSet.Builder getFeaturesBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return getFeaturesFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> getFeaturesFieldBuilder() {
                if (this.featuresBuilder_ == null) {
                    this.featuresBuilder_ = new SingleFieldBuilderV3<>(getFeatures(), getParentForChildren(), isClean());
                    this.features_ = null;
                }
                return this.featuresBuilder_;
            }

            private void ensureUninterpretedOptionIsMutable() {
                if ((this.bitField0_ & 64) == 0) {
                    this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                    this.bitField0_ |= 64;
                }
            }

            public int getUninterpretedOptionCount() {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> getUninterpretedOptionFieldBuilder() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOptionBuilder_ = new RepeatedFieldBuilderV3<>(this.uninterpretedOption_, (this.bitField0_ & 64) != 0, getParentForChildren(), isClean());
                    this.uninterpretedOption_ = null;
                }
                return this.uninterpretedOptionBuilder_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class FieldOptions extends GeneratedMessageV3.ExtendableMessage<FieldOptions> implements FieldOptionsOrBuilder {
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int ctype_;
        private boolean debugRedact_;
        private boolean deprecated_;
        private List<EditionDefault> editionDefaults_;
        private FeatureSet features_;
        private int jstype_;
        private boolean lazy_;
        private byte memoizedIsInitialized;
        private boolean packed_;
        private int retention_;
        private List<Integer> targets_;
        private List<UninterpretedOption> uninterpretedOption_;
        private boolean unverifiedLazy_;
        private boolean weak_;
        private static final Internal.ListAdapter.Converter<Integer, OptionTargetType> targets_converter_ = new Internal.ListAdapter.Converter<Integer, OptionTargetType>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public OptionTargetType convert(Integer num) {
                OptionTargetType forNumber = OptionTargetType.forNumber(num.intValue());
                return forNumber == null ? OptionTargetType.TARGET_TYPE_UNKNOWN : forNumber;
            }
        };
        private static final FieldOptions DEFAULT_INSTANCE = new FieldOptions();
        @Deprecated
        public static final Parser<FieldOptions> PARSER = new AbstractParser<FieldOptions>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.2
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public FieldOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = FieldOptions.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };

        /* loaded from: classes2.dex */
        public interface EditionDefaultOrBuilder extends MessageOrBuilder {
        }

        public static FieldOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean getDebugRedact() {
            return this.debugRedact_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FieldOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        public List<EditionDefault> getEditionDefaultsList() {
            return this.editionDefaults_;
        }

        public boolean getLazy() {
            return this.lazy_;
        }

        public boolean getPacked() {
            return this.packed_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<FieldOptions> getParserForType() {
            return PARSER;
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public boolean getUnverifiedLazy() {
            return this.unverifiedLazy_;
        }

        public boolean getWeak() {
            return this.weak_;
        }

        public boolean hasCtype() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasDebugRedact() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasFeatures() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasJstype() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLazy() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasPacked() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasRetention() {
            return (this.bitField0_ & JSONzip.end) != 0;
        }

        public boolean hasUnverifiedLazy() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasWeak() {
            return (this.bitField0_ & 64) != 0;
        }

        static /* synthetic */ int access$22076(FieldOptions fieldOptions, int i) {
            int i2 = i | fieldOptions.bitField0_;
            fieldOptions.bitField0_ = i2;
            return i2;
        }

        private FieldOptions(GeneratedMessageV3.ExtendableBuilder<FieldOptions, ?> extendableBuilder) {
            super(extendableBuilder);
            this.ctype_ = 0;
            this.packed_ = false;
            this.jstype_ = 0;
            this.lazy_ = false;
            this.unverifiedLazy_ = false;
            this.deprecated_ = false;
            this.weak_ = false;
            this.debugRedact_ = false;
            this.retention_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        private FieldOptions() {
            this.packed_ = false;
            this.lazy_ = false;
            this.unverifiedLazy_ = false;
            this.deprecated_ = false;
            this.weak_ = false;
            this.debugRedact_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.ctype_ = 0;
            this.jstype_ = 0;
            this.retention_ = 0;
            this.targets_ = Collections.emptyList();
            this.editionDefaults_ = Collections.emptyList();
            this.uninterpretedOption_ = Collections.emptyList();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new FieldOptions();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_FieldOptions_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_FieldOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(FieldOptions.class, Builder.class);
        }

        /* loaded from: classes2.dex */
        public enum CType implements ProtocolMessageEnum {
            STRING(0),
            CORD(1),
            STRING_PIECE(2);
            
            private final int value;
            private static final Internal.EnumLiteMap<CType> internalValueMap = new Internal.EnumLiteMap<CType>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.CType.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public CType findValueByNumber(int i) {
                    return CType.forNumber(i);
                }
            };
            private static final CType[] VALUES = values();

            public static CType forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return STRING_PIECE;
                    }
                    return CORD;
                }
                return STRING;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            CType(int i) {
                this.value = i;
            }
        }

        /* loaded from: classes2.dex */
        public enum JSType implements ProtocolMessageEnum {
            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);
            
            private final int value;
            private static final Internal.EnumLiteMap<JSType> internalValueMap = new Internal.EnumLiteMap<JSType>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.JSType.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public JSType findValueByNumber(int i) {
                    return JSType.forNumber(i);
                }
            };
            private static final JSType[] VALUES = values();

            public static JSType forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return JS_NUMBER;
                    }
                    return JS_STRING;
                }
                return JS_NORMAL;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            JSType(int i) {
                this.value = i;
            }
        }

        /* loaded from: classes2.dex */
        public enum OptionRetention implements ProtocolMessageEnum {
            RETENTION_UNKNOWN(0),
            RETENTION_RUNTIME(1),
            RETENTION_SOURCE(2);
            
            private final int value;
            private static final Internal.EnumLiteMap<OptionRetention> internalValueMap = new Internal.EnumLiteMap<OptionRetention>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.OptionRetention.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public OptionRetention findValueByNumber(int i) {
                    return OptionRetention.forNumber(i);
                }
            };
            private static final OptionRetention[] VALUES = values();

            public static OptionRetention forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return RETENTION_SOURCE;
                    }
                    return RETENTION_RUNTIME;
                }
                return RETENTION_UNKNOWN;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            OptionRetention(int i) {
                this.value = i;
            }
        }

        /* loaded from: classes2.dex */
        public enum OptionTargetType implements ProtocolMessageEnum {
            TARGET_TYPE_UNKNOWN(0),
            TARGET_TYPE_FILE(1),
            TARGET_TYPE_EXTENSION_RANGE(2),
            TARGET_TYPE_MESSAGE(3),
            TARGET_TYPE_FIELD(4),
            TARGET_TYPE_ONEOF(5),
            TARGET_TYPE_ENUM(6),
            TARGET_TYPE_ENUM_ENTRY(7),
            TARGET_TYPE_SERVICE(8),
            TARGET_TYPE_METHOD(9);
            
            private final int value;
            private static final Internal.EnumLiteMap<OptionTargetType> internalValueMap = new Internal.EnumLiteMap<OptionTargetType>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.OptionTargetType.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public OptionTargetType findValueByNumber(int i) {
                    return OptionTargetType.forNumber(i);
                }
            };
            private static final OptionTargetType[] VALUES = values();

            public static OptionTargetType forNumber(int i) {
                switch (i) {
                    case 0:
                        return TARGET_TYPE_UNKNOWN;
                    case 1:
                        return TARGET_TYPE_FILE;
                    case 2:
                        return TARGET_TYPE_EXTENSION_RANGE;
                    case 3:
                        return TARGET_TYPE_MESSAGE;
                    case 4:
                        return TARGET_TYPE_FIELD;
                    case 5:
                        return TARGET_TYPE_ONEOF;
                    case 6:
                        return TARGET_TYPE_ENUM;
                    case 7:
                        return TARGET_TYPE_ENUM_ENTRY;
                    case 8:
                        return TARGET_TYPE_SERVICE;
                    case 9:
                        return TARGET_TYPE_METHOD;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            OptionTargetType(int i) {
                this.value = i;
            }
        }

        /* loaded from: classes2.dex */
        public static final class EditionDefault extends GeneratedMessageV3 implements EditionDefaultOrBuilder {
            private static final EditionDefault DEFAULT_INSTANCE = new EditionDefault();
            @Deprecated
            public static final Parser<EditionDefault> PARSER = new AbstractParser<EditionDefault>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.EditionDefault.1
                @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
                public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return super.parseFrom(byteString, extensionRegistryLite);
                }

                @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                    return super.parseFrom(bArr);
                }

                @Override // com.google.protobuf.Parser
                public EditionDefault parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    Builder newBuilder = EditionDefault.newBuilder();
                    try {
                        newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                        return newBuilder.buildPartial();
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(newBuilder.buildPartial());
                    } catch (UninitializedMessageException e2) {
                        throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                    }
                }
            };
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private int edition_;
            private byte memoizedIsInitialized;
            private volatile Object value_;

            public static EditionDefault getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EditionDefault getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
            public Parser<EditionDefault> getParserForType() {
                return PARSER;
            }

            public boolean hasEdition() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasValue() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            static /* synthetic */ int access$20376(EditionDefault editionDefault, int i) {
                int i2 = i | editionDefault.bitField0_;
                editionDefault.bitField0_ = i2;
                return i2;
            }

            private EditionDefault(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.edition_ = 0;
                this.value_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            private EditionDefault() {
                this.edition_ = 0;
                this.value_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.edition_ = 0;
                this.value_ = "";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new EditionDefault();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_FieldOptions_EditionDefault_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_FieldOptions_EditionDefault_fieldAccessorTable.ensureFieldAccessorsInitialized(EditionDefault.class, Builder.class);
            }

            public Edition getEdition() {
                Edition forNumber = Edition.forNumber(this.edition_);
                return forNumber == null ? Edition.EDITION_UNKNOWN : forNumber;
            }

            public String getValue() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.value_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 2) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.value_);
                }
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeEnum(3, this.edition_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int computeStringSize = (this.bitField0_ & 2) != 0 ? GeneratedMessageV3.computeStringSize(2, this.value_) : 0;
                if ((this.bitField0_ & 1) != 0) {
                    computeStringSize += CodedOutputStream.computeEnumSize(3, this.edition_);
                }
                int serializedSize = computeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof EditionDefault)) {
                    return super.equals(obj);
                }
                EditionDefault editionDefault = (EditionDefault) obj;
                if (hasEdition() != editionDefault.hasEdition()) {
                    return false;
                }
                if ((!hasEdition() || this.edition_ == editionDefault.edition_) && hasValue() == editionDefault.hasValue()) {
                    return (!hasValue() || getValue().equals(editionDefault.getValue())) && getUnknownFields().equals(editionDefault.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.AbstractMessage
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = getDescriptor().hashCode() + 779;
                if (hasEdition()) {
                    hashCode = (((hashCode * 37) + 3) * 53) + this.edition_;
                }
                if (hasValue()) {
                    hashCode = (((hashCode * 37) + 2) * 53) + getValue().hashCode();
                }
                int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            /* loaded from: classes2.dex */
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EditionDefaultOrBuilder {
                private int bitField0_;
                private int edition_;
                private Object value_;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return DescriptorProtos.internal_static_google_protobuf_FieldOptions_EditionDefault_fieldAccessorTable.ensureFieldAccessorsInitialized(EditionDefault.class, Builder.class);
                }

                private Builder() {
                    this.edition_ = 0;
                    this.value_ = "";
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.edition_ = 0;
                    this.value_ = "";
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return DescriptorProtos.internal_static_google_protobuf_FieldOptions_EditionDefault_descriptor;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public EditionDefault getDefaultInstanceForType() {
                    return EditionDefault.getDefaultInstance();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public EditionDefault build() {
                    EditionDefault buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public EditionDefault buildPartial() {
                    EditionDefault editionDefault = new EditionDefault(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(editionDefault);
                    }
                    onBuilt();
                    return editionDefault;
                }

                private void buildPartial0(EditionDefault editionDefault) {
                    int i;
                    int i2 = this.bitField0_;
                    if ((i2 & 1) != 0) {
                        editionDefault.edition_ = this.edition_;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if ((i2 & 2) != 0) {
                        editionDefault.value_ = this.value_;
                        i |= 2;
                    }
                    EditionDefault.access$20376(editionDefault, i);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public Builder mo2781clone() {
                    return (Builder) super.mo2781clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof EditionDefault) {
                        return mergeFrom((EditionDefault) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(EditionDefault editionDefault) {
                    if (editionDefault == EditionDefault.getDefaultInstance()) {
                        return this;
                    }
                    if (editionDefault.hasEdition()) {
                        setEdition(editionDefault.getEdition());
                    }
                    if (editionDefault.hasValue()) {
                        this.value_ = editionDefault.value_;
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    mergeUnknownFields(editionDefault.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z = false;
                    while (!z) {
                        try {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 18) {
                                        this.value_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 2;
                                    } else if (readTag == 24) {
                                        int readEnum = codedInputStream.readEnum();
                                        if (Edition.forNumber(readEnum) == null) {
                                            mergeUnknownVarintField(3, readEnum);
                                        } else {
                                            this.edition_ = readEnum;
                                            this.bitField0_ |= 1;
                                        }
                                    } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.unwrapIOException();
                            }
                        } finally {
                            onChanged();
                        }
                    }
                    return this;
                }

                public Builder setEdition(Edition edition) {
                    edition.getClass();
                    this.bitField0_ |= 1;
                    this.edition_ = edition.getNumber();
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }
        }

        public CType getCtype() {
            CType forNumber = CType.forNumber(this.ctype_);
            return forNumber == null ? CType.STRING : forNumber;
        }

        public JSType getJstype() {
            JSType forNumber = JSType.forNumber(this.jstype_);
            return forNumber == null ? JSType.JS_NORMAL : forNumber;
        }

        public OptionRetention getRetention() {
            OptionRetention forNumber = OptionRetention.forNumber(this.retention_);
            return forNumber == null ? OptionRetention.RETENTION_UNKNOWN : forNumber;
        }

        public int getTargetsCount() {
            return this.targets_.size();
        }

        public int getEditionDefaultsCount() {
            return this.editionDefaults_.size();
        }

        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasFeatures() && !getFeatures().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.ctype_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.packed_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(3, this.deprecated_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(5, this.lazy_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(6, this.jstype_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBool(10, this.weak_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(15, this.unverifiedLazy_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeBool(16, this.debugRedact_);
            }
            if ((this.bitField0_ & JSONzip.end) != 0) {
                codedOutputStream.writeEnum(17, this.retention_);
            }
            for (int i = 0; i < this.targets_.size(); i++) {
                codedOutputStream.writeEnum(19, this.targets_.get(i).intValue());
            }
            for (int i2 = 0; i2 < this.editionDefaults_.size(); i2++) {
                codedOutputStream.writeMessage(20, this.editionDefaults_.get(i2));
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(21, getFeatures());
            }
            for (int i3 = 0; i3 < this.uninterpretedOption_.size(); i3++) {
                codedOutputStream.writeMessage(999, this.uninterpretedOption_.get(i3));
            }
            newExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.ctype_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                computeEnumSize += CodedOutputStream.computeBoolSize(2, this.packed_);
            }
            if ((this.bitField0_ & 32) != 0) {
                computeEnumSize += CodedOutputStream.computeBoolSize(3, this.deprecated_);
            }
            if ((this.bitField0_ & 8) != 0) {
                computeEnumSize += CodedOutputStream.computeBoolSize(5, this.lazy_);
            }
            if ((this.bitField0_ & 4) != 0) {
                computeEnumSize += CodedOutputStream.computeEnumSize(6, this.jstype_);
            }
            if ((this.bitField0_ & 64) != 0) {
                computeEnumSize += CodedOutputStream.computeBoolSize(10, this.weak_);
            }
            if ((this.bitField0_ & 16) != 0) {
                computeEnumSize += CodedOutputStream.computeBoolSize(15, this.unverifiedLazy_);
            }
            if ((this.bitField0_ & 128) != 0) {
                computeEnumSize += CodedOutputStream.computeBoolSize(16, this.debugRedact_);
            }
            if ((this.bitField0_ & JSONzip.end) != 0) {
                computeEnumSize += CodedOutputStream.computeEnumSize(17, this.retention_);
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.targets_.size(); i3++) {
                i2 += CodedOutputStream.computeEnumSizeNoTag(this.targets_.get(i3).intValue());
            }
            int size = computeEnumSize + i2 + (this.targets_.size() * 2);
            for (int i4 = 0; i4 < this.editionDefaults_.size(); i4++) {
                size += CodedOutputStream.computeMessageSize(20, this.editionDefaults_.get(i4));
            }
            if ((this.bitField0_ & 512) != 0) {
                size += CodedOutputStream.computeMessageSize(21, getFeatures());
            }
            for (int i5 = 0; i5 < this.uninterpretedOption_.size(); i5++) {
                size += CodedOutputStream.computeMessageSize(999, this.uninterpretedOption_.get(i5));
            }
            int extensionsSerializedSize = size + extensionsSerializedSize() + getUnknownFields().getSerializedSize();
            this.memoizedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldOptions)) {
                return super.equals(obj);
            }
            FieldOptions fieldOptions = (FieldOptions) obj;
            if (hasCtype() != fieldOptions.hasCtype()) {
                return false;
            }
            if ((!hasCtype() || this.ctype_ == fieldOptions.ctype_) && hasPacked() == fieldOptions.hasPacked()) {
                if ((!hasPacked() || getPacked() == fieldOptions.getPacked()) && hasJstype() == fieldOptions.hasJstype()) {
                    if ((!hasJstype() || this.jstype_ == fieldOptions.jstype_) && hasLazy() == fieldOptions.hasLazy()) {
                        if ((!hasLazy() || getLazy() == fieldOptions.getLazy()) && hasUnverifiedLazy() == fieldOptions.hasUnverifiedLazy()) {
                            if ((!hasUnverifiedLazy() || getUnverifiedLazy() == fieldOptions.getUnverifiedLazy()) && hasDeprecated() == fieldOptions.hasDeprecated()) {
                                if ((!hasDeprecated() || getDeprecated() == fieldOptions.getDeprecated()) && hasWeak() == fieldOptions.hasWeak()) {
                                    if ((!hasWeak() || getWeak() == fieldOptions.getWeak()) && hasDebugRedact() == fieldOptions.hasDebugRedact()) {
                                        if ((!hasDebugRedact() || getDebugRedact() == fieldOptions.getDebugRedact()) && hasRetention() == fieldOptions.hasRetention()) {
                                            if ((!hasRetention() || this.retention_ == fieldOptions.retention_) && this.targets_.equals(fieldOptions.targets_) && getEditionDefaultsList().equals(fieldOptions.getEditionDefaultsList()) && hasFeatures() == fieldOptions.hasFeatures()) {
                                                return (!hasFeatures() || getFeatures().equals(fieldOptions.getFeatures())) && getUninterpretedOptionList().equals(fieldOptions.getUninterpretedOptionList()) && getUnknownFields().equals(fieldOptions.getUnknownFields()) && getExtensionFields().equals(fieldOptions.getExtensionFields());
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasCtype()) {
                hashCode = (((hashCode * 37) + 1) * 53) + this.ctype_;
            }
            if (hasPacked()) {
                hashCode = (((hashCode * 37) + 2) * 53) + Internal.hashBoolean(getPacked());
            }
            if (hasJstype()) {
                hashCode = (((hashCode * 37) + 6) * 53) + this.jstype_;
            }
            if (hasLazy()) {
                hashCode = (((hashCode * 37) + 5) * 53) + Internal.hashBoolean(getLazy());
            }
            if (hasUnverifiedLazy()) {
                hashCode = (((hashCode * 37) + 15) * 53) + Internal.hashBoolean(getUnverifiedLazy());
            }
            if (hasDeprecated()) {
                hashCode = (((hashCode * 37) + 3) * 53) + Internal.hashBoolean(getDeprecated());
            }
            if (hasWeak()) {
                hashCode = (((hashCode * 37) + 10) * 53) + Internal.hashBoolean(getWeak());
            }
            if (hasDebugRedact()) {
                hashCode = (((hashCode * 37) + 16) * 53) + Internal.hashBoolean(getDebugRedact());
            }
            if (hasRetention()) {
                hashCode = (((hashCode * 37) + 17) * 53) + this.retention_;
            }
            if (getTargetsCount() > 0) {
                hashCode = (((hashCode * 37) + 19) * 53) + this.targets_.hashCode();
            }
            if (getEditionDefaultsCount() > 0) {
                hashCode = (((hashCode * 37) + 20) * 53) + getEditionDefaultsList().hashCode();
            }
            if (hasFeatures()) {
                hashCode = (((hashCode * 37) + 21) * 53) + getFeatures().hashCode();
            }
            if (getUninterpretedOptionCount() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int hashFields = (AbstractMessage.hashFields(hashCode, getExtensionFields()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<FieldOptions, Builder> implements FieldOptionsOrBuilder {
            private int bitField0_;
            private int ctype_;
            private boolean debugRedact_;
            private boolean deprecated_;
            private RepeatedFieldBuilderV3<EditionDefault, EditionDefault.Builder, EditionDefaultOrBuilder> editionDefaultsBuilder_;
            private List<EditionDefault> editionDefaults_;
            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> featuresBuilder_;
            private FeatureSet features_;
            private int jstype_;
            private boolean lazy_;
            private boolean packed_;
            private int retention_;
            private List<Integer> targets_;
            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> uninterpretedOptionBuilder_;
            private List<UninterpretedOption> uninterpretedOption_;
            private boolean unverifiedLazy_;
            private boolean weak_;

            public boolean hasFeatures() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_FieldOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(FieldOptions.class, Builder.class);
            }

            private Builder() {
                this.ctype_ = 0;
                this.jstype_ = 0;
                this.retention_ = 0;
                this.targets_ = Collections.emptyList();
                this.editionDefaults_ = Collections.emptyList();
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.ctype_ = 0;
                this.jstype_ = 0;
                this.retention_ = 0;
                this.targets_ = Collections.emptyList();
                this.editionDefaults_ = Collections.emptyList();
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getEditionDefaultsFieldBuilder();
                    getFeaturesFieldBuilder();
                    getUninterpretedOptionFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_FieldOptions_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FieldOptions getDefaultInstanceForType() {
                return FieldOptions.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FieldOptions build() {
                FieldOptions buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FieldOptions buildPartial() {
                FieldOptions fieldOptions = new FieldOptions(this);
                buildPartialRepeatedFields(fieldOptions);
                if (this.bitField0_ != 0) {
                    buildPartial0(fieldOptions);
                }
                onBuilt();
                return fieldOptions;
            }

            private void buildPartialRepeatedFields(FieldOptions fieldOptions) {
                if ((this.bitField0_ & 512) != 0) {
                    this.targets_ = Collections.unmodifiableList(this.targets_);
                    this.bitField0_ &= -513;
                }
                fieldOptions.targets_ = this.targets_;
                RepeatedFieldBuilderV3<EditionDefault, EditionDefault.Builder, EditionDefaultOrBuilder> repeatedFieldBuilderV3 = this.editionDefaultsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1024) != 0) {
                        this.editionDefaults_ = Collections.unmodifiableList(this.editionDefaults_);
                        this.bitField0_ &= -1025;
                    }
                    fieldOptions.editionDefaults_ = this.editionDefaults_;
                } else {
                    fieldOptions.editionDefaults_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV32 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    if ((this.bitField0_ & 4096) != 0) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                        this.bitField0_ &= -4097;
                    }
                    fieldOptions.uninterpretedOption_ = this.uninterpretedOption_;
                    return;
                }
                fieldOptions.uninterpretedOption_ = repeatedFieldBuilderV32.build();
            }

            private void buildPartial0(FieldOptions fieldOptions) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    fieldOptions.ctype_ = this.ctype_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    fieldOptions.packed_ = this.packed_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    fieldOptions.jstype_ = this.jstype_;
                    i |= 4;
                }
                if ((i2 & 8) != 0) {
                    fieldOptions.lazy_ = this.lazy_;
                    i |= 8;
                }
                if ((i2 & 16) != 0) {
                    fieldOptions.unverifiedLazy_ = this.unverifiedLazy_;
                    i |= 16;
                }
                if ((i2 & 32) != 0) {
                    fieldOptions.deprecated_ = this.deprecated_;
                    i |= 32;
                }
                if ((i2 & 64) != 0) {
                    fieldOptions.weak_ = this.weak_;
                    i |= 64;
                }
                if ((i2 & 128) != 0) {
                    fieldOptions.debugRedact_ = this.debugRedact_;
                    i |= 128;
                }
                if ((i2 & JSONzip.end) != 0) {
                    fieldOptions.retention_ = this.retention_;
                    i |= JSONzip.end;
                }
                if ((i2 & 2048) != 0) {
                    SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                    fieldOptions.features_ = singleFieldBuilderV3 == null ? this.features_ : singleFieldBuilderV3.build();
                    i |= 512;
                }
                FieldOptions.access$22076(fieldOptions, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FieldOptions) {
                    return mergeFrom((FieldOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FieldOptions fieldOptions) {
                if (fieldOptions == FieldOptions.getDefaultInstance()) {
                    return this;
                }
                if (fieldOptions.hasCtype()) {
                    setCtype(fieldOptions.getCtype());
                }
                if (fieldOptions.hasPacked()) {
                    setPacked(fieldOptions.getPacked());
                }
                if (fieldOptions.hasJstype()) {
                    setJstype(fieldOptions.getJstype());
                }
                if (fieldOptions.hasLazy()) {
                    setLazy(fieldOptions.getLazy());
                }
                if (fieldOptions.hasUnverifiedLazy()) {
                    setUnverifiedLazy(fieldOptions.getUnverifiedLazy());
                }
                if (fieldOptions.hasDeprecated()) {
                    setDeprecated(fieldOptions.getDeprecated());
                }
                if (fieldOptions.hasWeak()) {
                    setWeak(fieldOptions.getWeak());
                }
                if (fieldOptions.hasDebugRedact()) {
                    setDebugRedact(fieldOptions.getDebugRedact());
                }
                if (fieldOptions.hasRetention()) {
                    setRetention(fieldOptions.getRetention());
                }
                if (!fieldOptions.targets_.isEmpty()) {
                    if (this.targets_.isEmpty()) {
                        this.targets_ = fieldOptions.targets_;
                        this.bitField0_ &= -513;
                    } else {
                        ensureTargetsIsMutable();
                        this.targets_.addAll(fieldOptions.targets_);
                    }
                    onChanged();
                }
                if (this.editionDefaultsBuilder_ == null) {
                    if (!fieldOptions.editionDefaults_.isEmpty()) {
                        if (this.editionDefaults_.isEmpty()) {
                            this.editionDefaults_ = fieldOptions.editionDefaults_;
                            this.bitField0_ &= -1025;
                        } else {
                            ensureEditionDefaultsIsMutable();
                            this.editionDefaults_.addAll(fieldOptions.editionDefaults_);
                        }
                        onChanged();
                    }
                } else if (!fieldOptions.editionDefaults_.isEmpty()) {
                    if (!this.editionDefaultsBuilder_.isEmpty()) {
                        this.editionDefaultsBuilder_.addAllMessages(fieldOptions.editionDefaults_);
                    } else {
                        this.editionDefaultsBuilder_.dispose();
                        this.editionDefaultsBuilder_ = null;
                        this.editionDefaults_ = fieldOptions.editionDefaults_;
                        this.bitField0_ &= -1025;
                        this.editionDefaultsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getEditionDefaultsFieldBuilder() : null;
                    }
                }
                if (fieldOptions.hasFeatures()) {
                    mergeFeatures(fieldOptions.getFeatures());
                }
                if (this.uninterpretedOptionBuilder_ == null) {
                    if (!fieldOptions.uninterpretedOption_.isEmpty()) {
                        if (this.uninterpretedOption_.isEmpty()) {
                            this.uninterpretedOption_ = fieldOptions.uninterpretedOption_;
                            this.bitField0_ &= -4097;
                        } else {
                            ensureUninterpretedOptionIsMutable();
                            this.uninterpretedOption_.addAll(fieldOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!fieldOptions.uninterpretedOption_.isEmpty()) {
                    if (!this.uninterpretedOptionBuilder_.isEmpty()) {
                        this.uninterpretedOptionBuilder_.addAllMessages(fieldOptions.uninterpretedOption_);
                    } else {
                        this.uninterpretedOptionBuilder_.dispose();
                        this.uninterpretedOptionBuilder_ = null;
                        this.uninterpretedOption_ = fieldOptions.uninterpretedOption_;
                        this.bitField0_ &= -4097;
                        this.uninterpretedOptionBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getUninterpretedOptionFieldBuilder() : null;
                    }
                }
                mergeExtensionFields(fieldOptions);
                mergeUnknownFields(fieldOptions.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFeatures() || getFeatures().isInitialized()) {
                    for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                        if (!getUninterpretedOption(i).isInitialized()) {
                            return false;
                        }
                    }
                    return extensionsAreInitialized();
                }
                return false;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            switch (readTag) {
                                case 0:
                                    break;
                                case 8:
                                    int readEnum = codedInputStream.readEnum();
                                    if (CType.forNumber(readEnum) == null) {
                                        mergeUnknownVarintField(1, readEnum);
                                    } else {
                                        this.ctype_ = readEnum;
                                        this.bitField0_ |= 1;
                                        continue;
                                    }
                                case 16:
                                    this.packed_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    this.deprecated_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32;
                                    continue;
                                case JSONzip.substringLimit /* 40 */:
                                    this.lazy_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 48:
                                    int readEnum2 = codedInputStream.readEnum();
                                    if (JSType.forNumber(readEnum2) == null) {
                                        mergeUnknownVarintField(6, readEnum2);
                                    } else {
                                        this.jstype_ = readEnum2;
                                        this.bitField0_ |= 4;
                                        continue;
                                    }
                                case 80:
                                    this.weak_ = codedInputStream.readBool();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 120:
                                    this.unverifiedLazy_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 128:
                                    this.debugRedact_ = codedInputStream.readBool();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 136:
                                    int readEnum3 = codedInputStream.readEnum();
                                    if (OptionRetention.forNumber(readEnum3) == null) {
                                        mergeUnknownVarintField(17, readEnum3);
                                    } else {
                                        this.retention_ = readEnum3;
                                        this.bitField0_ |= JSONzip.end;
                                        continue;
                                    }
                                case 152:
                                    int readEnum4 = codedInputStream.readEnum();
                                    if (OptionTargetType.forNumber(readEnum4) == null) {
                                        mergeUnknownVarintField(19, readEnum4);
                                    } else {
                                        ensureTargetsIsMutable();
                                        this.targets_.add(Integer.valueOf(readEnum4));
                                        continue;
                                    }
                                case 154:
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int readEnum5 = codedInputStream.readEnum();
                                        if (OptionTargetType.forNumber(readEnum5) == null) {
                                            mergeUnknownVarintField(19, readEnum5);
                                        } else {
                                            ensureTargetsIsMutable();
                                            this.targets_.add(Integer.valueOf(readEnum5));
                                        }
                                    }
                                    codedInputStream.popLimit(pushLimit);
                                    continue;
                                case 162:
                                    EditionDefault editionDefault = (EditionDefault) codedInputStream.readMessage(EditionDefault.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<EditionDefault, EditionDefault.Builder, EditionDefaultOrBuilder> repeatedFieldBuilderV3 = this.editionDefaultsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureEditionDefaultsIsMutable();
                                        this.editionDefaults_.add(editionDefault);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(editionDefault);
                                        continue;
                                    }
                                case 170:
                                    codedInputStream.readMessage(getFeaturesFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 7994:
                                    UninterpretedOption uninterpretedOption = (UninterpretedOption) codedInputStream.readMessage(UninterpretedOption.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV32 = this.uninterpretedOptionBuilder_;
                                    if (repeatedFieldBuilderV32 == null) {
                                        ensureUninterpretedOptionIsMutable();
                                        this.uninterpretedOption_.add(uninterpretedOption);
                                    } else {
                                        repeatedFieldBuilderV32.addMessage(uninterpretedOption);
                                        continue;
                                    }
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            public Builder setCtype(CType cType) {
                cType.getClass();
                this.bitField0_ |= 1;
                this.ctype_ = cType.getNumber();
                onChanged();
                return this;
            }

            public Builder setPacked(boolean z) {
                this.packed_ = z;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setJstype(JSType jSType) {
                jSType.getClass();
                this.bitField0_ |= 4;
                this.jstype_ = jSType.getNumber();
                onChanged();
                return this;
            }

            public Builder setLazy(boolean z) {
                this.lazy_ = z;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setUnverifiedLazy(boolean z) {
                this.unverifiedLazy_ = z;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDeprecated(boolean z) {
                this.deprecated_ = z;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setWeak(boolean z) {
                this.weak_ = z;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setDebugRedact(boolean z) {
                this.debugRedact_ = z;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setRetention(OptionRetention optionRetention) {
                optionRetention.getClass();
                this.bitField0_ |= JSONzip.end;
                this.retention_ = optionRetention.getNumber();
                onChanged();
                return this;
            }

            private void ensureTargetsIsMutable() {
                if ((this.bitField0_ & 512) == 0) {
                    this.targets_ = new ArrayList(this.targets_);
                    this.bitField0_ |= 512;
                }
            }

            private void ensureEditionDefaultsIsMutable() {
                if ((this.bitField0_ & 1024) == 0) {
                    this.editionDefaults_ = new ArrayList(this.editionDefaults_);
                    this.bitField0_ |= 1024;
                }
            }

            private RepeatedFieldBuilderV3<EditionDefault, EditionDefault.Builder, EditionDefaultOrBuilder> getEditionDefaultsFieldBuilder() {
                if (this.editionDefaultsBuilder_ == null) {
                    this.editionDefaultsBuilder_ = new RepeatedFieldBuilderV3<>(this.editionDefaults_, (this.bitField0_ & 1024) != 0, getParentForChildren(), isClean());
                    this.editionDefaults_ = null;
                }
                return this.editionDefaultsBuilder_;
            }

            public FeatureSet getFeatures() {
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    FeatureSet featureSet = this.features_;
                    return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                FeatureSet featureSet2;
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2048) == 0 || (featureSet2 = this.features_) == null || featureSet2 == FeatureSet.getDefaultInstance()) {
                        this.features_ = featureSet;
                    } else {
                        getFeaturesBuilder().mergeFrom(featureSet);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(featureSet);
                }
                if (this.features_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public FeatureSet.Builder getFeaturesBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return getFeaturesFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> getFeaturesFieldBuilder() {
                if (this.featuresBuilder_ == null) {
                    this.featuresBuilder_ = new SingleFieldBuilderV3<>(getFeatures(), getParentForChildren(), isClean());
                    this.features_ = null;
                }
                return this.featuresBuilder_;
            }

            private void ensureUninterpretedOptionIsMutable() {
                if ((this.bitField0_ & 4096) == 0) {
                    this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                    this.bitField0_ |= 4096;
                }
            }

            public int getUninterpretedOptionCount() {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> getUninterpretedOptionFieldBuilder() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOptionBuilder_ = new RepeatedFieldBuilderV3<>(this.uninterpretedOption_, (this.bitField0_ & 4096) != 0, getParentForChildren(), isClean());
                    this.uninterpretedOption_ = null;
                }
                return this.uninterpretedOptionBuilder_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class OneofOptions extends GeneratedMessageV3.ExtendableMessage<OneofOptions> implements OneofOptionsOrBuilder {
        private static final OneofOptions DEFAULT_INSTANCE = new OneofOptions();
        @Deprecated
        public static final Parser<OneofOptions> PARSER = new AbstractParser<OneofOptions>() { // from class: com.google.protobuf.DescriptorProtos.OneofOptions.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public OneofOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = OneofOptions.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private FeatureSet features_;
        private byte memoizedIsInitialized;
        private List<UninterpretedOption> uninterpretedOption_;

        public static OneofOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OneofOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<OneofOptions> getParserForType() {
            return PARSER;
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public boolean hasFeatures() {
            return (this.bitField0_ & 1) != 0;
        }

        static /* synthetic */ int access$22976(OneofOptions oneofOptions, int i) {
            int i2 = i | oneofOptions.bitField0_;
            oneofOptions.bitField0_ = i2;
            return i2;
        }

        private OneofOptions(GeneratedMessageV3.ExtendableBuilder<OneofOptions, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private OneofOptions() {
            this.memoizedIsInitialized = (byte) -1;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new OneofOptions();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_OneofOptions_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_OneofOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(OneofOptions.class, Builder.class);
        }

        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasFeatures() && !getFeatures().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getFeatures());
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.writeMessage(999, this.uninterpretedOption_.get(i));
            }
            newExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getFeatures()) : 0;
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                computeMessageSize += CodedOutputStream.computeMessageSize(999, this.uninterpretedOption_.get(i2));
            }
            int extensionsSerializedSize = computeMessageSize + extensionsSerializedSize() + getUnknownFields().getSerializedSize();
            this.memoizedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OneofOptions)) {
                return super.equals(obj);
            }
            OneofOptions oneofOptions = (OneofOptions) obj;
            if (hasFeatures() != oneofOptions.hasFeatures()) {
                return false;
            }
            return (!hasFeatures() || getFeatures().equals(oneofOptions.getFeatures())) && getUninterpretedOptionList().equals(oneofOptions.getUninterpretedOptionList()) && getUnknownFields().equals(oneofOptions.getUnknownFields()) && getExtensionFields().equals(oneofOptions.getExtensionFields());
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasFeatures()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getFeatures().hashCode();
            }
            if (getUninterpretedOptionCount() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int hashFields = (AbstractMessage.hashFields(hashCode, getExtensionFields()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<OneofOptions, Builder> implements OneofOptionsOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> featuresBuilder_;
            private FeatureSet features_;
            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> uninterpretedOptionBuilder_;
            private List<UninterpretedOption> uninterpretedOption_;

            public boolean hasFeatures() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_OneofOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(OneofOptions.class, Builder.class);
            }

            private Builder() {
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getFeaturesFieldBuilder();
                    getUninterpretedOptionFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_OneofOptions_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public OneofOptions getDefaultInstanceForType() {
                return OneofOptions.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OneofOptions build() {
                OneofOptions buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OneofOptions buildPartial() {
                OneofOptions oneofOptions = new OneofOptions(this);
                buildPartialRepeatedFields(oneofOptions);
                if (this.bitField0_ != 0) {
                    buildPartial0(oneofOptions);
                }
                onBuilt();
                return oneofOptions;
            }

            private void buildPartialRepeatedFields(OneofOptions oneofOptions) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                        this.bitField0_ &= -3;
                    }
                    oneofOptions.uninterpretedOption_ = this.uninterpretedOption_;
                    return;
                }
                oneofOptions.uninterpretedOption_ = repeatedFieldBuilderV3.build();
            }

            private void buildPartial0(OneofOptions oneofOptions) {
                int i = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                    oneofOptions.features_ = singleFieldBuilderV3 == null ? this.features_ : singleFieldBuilderV3.build();
                } else {
                    i = 0;
                }
                OneofOptions.access$22976(oneofOptions, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof OneofOptions) {
                    return mergeFrom((OneofOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(OneofOptions oneofOptions) {
                if (oneofOptions == OneofOptions.getDefaultInstance()) {
                    return this;
                }
                if (oneofOptions.hasFeatures()) {
                    mergeFeatures(oneofOptions.getFeatures());
                }
                if (this.uninterpretedOptionBuilder_ == null) {
                    if (!oneofOptions.uninterpretedOption_.isEmpty()) {
                        if (this.uninterpretedOption_.isEmpty()) {
                            this.uninterpretedOption_ = oneofOptions.uninterpretedOption_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureUninterpretedOptionIsMutable();
                            this.uninterpretedOption_.addAll(oneofOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!oneofOptions.uninterpretedOption_.isEmpty()) {
                    if (!this.uninterpretedOptionBuilder_.isEmpty()) {
                        this.uninterpretedOptionBuilder_.addAllMessages(oneofOptions.uninterpretedOption_);
                    } else {
                        this.uninterpretedOptionBuilder_.dispose();
                        this.uninterpretedOptionBuilder_ = null;
                        this.uninterpretedOption_ = oneofOptions.uninterpretedOption_;
                        this.bitField0_ &= -3;
                        this.uninterpretedOptionBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getUninterpretedOptionFieldBuilder() : null;
                    }
                }
                mergeExtensionFields(oneofOptions);
                mergeUnknownFields(oneofOptions.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFeatures() || getFeatures().isInitialized()) {
                    for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                        if (!getUninterpretedOption(i).isInitialized()) {
                            return false;
                        }
                    }
                    return extensionsAreInitialized();
                }
                return false;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    codedInputStream.readMessage(getFeaturesFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (readTag == 7994) {
                                    UninterpretedOption uninterpretedOption = (UninterpretedOption) codedInputStream.readMessage(UninterpretedOption.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureUninterpretedOptionIsMutable();
                                        this.uninterpretedOption_.add(uninterpretedOption);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(uninterpretedOption);
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            public FeatureSet getFeatures() {
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    FeatureSet featureSet = this.features_;
                    return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                FeatureSet featureSet2;
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) == 0 || (featureSet2 = this.features_) == null || featureSet2 == FeatureSet.getDefaultInstance()) {
                        this.features_ = featureSet;
                    } else {
                        getFeaturesBuilder().mergeFrom(featureSet);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(featureSet);
                }
                if (this.features_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public FeatureSet.Builder getFeaturesBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return getFeaturesFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> getFeaturesFieldBuilder() {
                if (this.featuresBuilder_ == null) {
                    this.featuresBuilder_ = new SingleFieldBuilderV3<>(getFeatures(), getParentForChildren(), isClean());
                    this.features_ = null;
                }
                return this.featuresBuilder_;
            }

            private void ensureUninterpretedOptionIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                    this.bitField0_ |= 2;
                }
            }

            public int getUninterpretedOptionCount() {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> getUninterpretedOptionFieldBuilder() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOptionBuilder_ = new RepeatedFieldBuilderV3<>(this.uninterpretedOption_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.uninterpretedOption_ = null;
                }
                return this.uninterpretedOptionBuilder_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class EnumOptions extends GeneratedMessageV3.ExtendableMessage<EnumOptions> implements EnumOptionsOrBuilder {
        private static final EnumOptions DEFAULT_INSTANCE = new EnumOptions();
        @Deprecated
        public static final Parser<EnumOptions> PARSER = new AbstractParser<EnumOptions>() { // from class: com.google.protobuf.DescriptorProtos.EnumOptions.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public EnumOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = EnumOptions.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private boolean allowAlias_;
        private int bitField0_;
        private boolean deprecatedLegacyJsonFieldConflicts_;
        private boolean deprecated_;
        private FeatureSet features_;
        private byte memoizedIsInitialized;
        private List<UninterpretedOption> uninterpretedOption_;

        public static EnumOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean getAllowAlias() {
            return this.allowAlias_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EnumOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts() {
            return this.deprecatedLegacyJsonFieldConflicts_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<EnumOptions> getParserForType() {
            return PARSER;
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public boolean hasAllowAlias() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasFeatures() {
            return (this.bitField0_ & 8) != 0;
        }

        static /* synthetic */ int access$24076(EnumOptions enumOptions, int i) {
            int i2 = i | enumOptions.bitField0_;
            enumOptions.bitField0_ = i2;
            return i2;
        }

        private EnumOptions(GeneratedMessageV3.ExtendableBuilder<EnumOptions, ?> extendableBuilder) {
            super(extendableBuilder);
            this.allowAlias_ = false;
            this.deprecated_ = false;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        private EnumOptions() {
            this.allowAlias_ = false;
            this.deprecated_ = false;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new EnumOptions();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_EnumOptions_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_EnumOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(EnumOptions.class, Builder.class);
        }

        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasFeatures() && !getFeatures().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(2, this.allowAlias_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(3, this.deprecated_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(6, this.deprecatedLegacyJsonFieldConflicts_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(7, getFeatures());
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.writeMessage(999, this.uninterpretedOption_.get(i));
            }
            newExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(2, this.allowAlias_) : 0;
            if ((2 & this.bitField0_) != 0) {
                computeBoolSize += CodedOutputStream.computeBoolSize(3, this.deprecated_);
            }
            if ((this.bitField0_ & 4) != 0) {
                computeBoolSize += CodedOutputStream.computeBoolSize(6, this.deprecatedLegacyJsonFieldConflicts_);
            }
            if ((this.bitField0_ & 8) != 0) {
                computeBoolSize += CodedOutputStream.computeMessageSize(7, getFeatures());
            }
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                computeBoolSize += CodedOutputStream.computeMessageSize(999, this.uninterpretedOption_.get(i2));
            }
            int extensionsSerializedSize = computeBoolSize + extensionsSerializedSize() + getUnknownFields().getSerializedSize();
            this.memoizedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnumOptions)) {
                return super.equals(obj);
            }
            EnumOptions enumOptions = (EnumOptions) obj;
            if (hasAllowAlias() != enumOptions.hasAllowAlias()) {
                return false;
            }
            if ((!hasAllowAlias() || getAllowAlias() == enumOptions.getAllowAlias()) && hasDeprecated() == enumOptions.hasDeprecated()) {
                if ((!hasDeprecated() || getDeprecated() == enumOptions.getDeprecated()) && hasDeprecatedLegacyJsonFieldConflicts() == enumOptions.hasDeprecatedLegacyJsonFieldConflicts()) {
                    if ((!hasDeprecatedLegacyJsonFieldConflicts() || getDeprecatedLegacyJsonFieldConflicts() == enumOptions.getDeprecatedLegacyJsonFieldConflicts()) && hasFeatures() == enumOptions.hasFeatures()) {
                        return (!hasFeatures() || getFeatures().equals(enumOptions.getFeatures())) && getUninterpretedOptionList().equals(enumOptions.getUninterpretedOptionList()) && getUnknownFields().equals(enumOptions.getUnknownFields()) && getExtensionFields().equals(enumOptions.getExtensionFields());
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasAllowAlias()) {
                hashCode = (((hashCode * 37) + 2) * 53) + Internal.hashBoolean(getAllowAlias());
            }
            if (hasDeprecated()) {
                hashCode = (((hashCode * 37) + 3) * 53) + Internal.hashBoolean(getDeprecated());
            }
            if (hasDeprecatedLegacyJsonFieldConflicts()) {
                hashCode = (((hashCode * 37) + 6) * 53) + Internal.hashBoolean(getDeprecatedLegacyJsonFieldConflicts());
            }
            if (hasFeatures()) {
                hashCode = (((hashCode * 37) + 7) * 53) + getFeatures().hashCode();
            }
            if (getUninterpretedOptionCount() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int hashFields = (AbstractMessage.hashFields(hashCode, getExtensionFields()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<EnumOptions, Builder> implements EnumOptionsOrBuilder {
            private boolean allowAlias_;
            private int bitField0_;
            private boolean deprecatedLegacyJsonFieldConflicts_;
            private boolean deprecated_;
            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> featuresBuilder_;
            private FeatureSet features_;
            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> uninterpretedOptionBuilder_;
            private List<UninterpretedOption> uninterpretedOption_;

            public boolean hasFeatures() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_EnumOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(EnumOptions.class, Builder.class);
            }

            private Builder() {
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getFeaturesFieldBuilder();
                    getUninterpretedOptionFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_EnumOptions_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EnumOptions getDefaultInstanceForType() {
                return EnumOptions.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnumOptions build() {
                EnumOptions buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnumOptions buildPartial() {
                EnumOptions enumOptions = new EnumOptions(this);
                buildPartialRepeatedFields(enumOptions);
                if (this.bitField0_ != 0) {
                    buildPartial0(enumOptions);
                }
                onBuilt();
                return enumOptions;
            }

            private void buildPartialRepeatedFields(EnumOptions enumOptions) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 16) != 0) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                        this.bitField0_ &= -17;
                    }
                    enumOptions.uninterpretedOption_ = this.uninterpretedOption_;
                    return;
                }
                enumOptions.uninterpretedOption_ = repeatedFieldBuilderV3.build();
            }

            private void buildPartial0(EnumOptions enumOptions) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    enumOptions.allowAlias_ = this.allowAlias_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    enumOptions.deprecated_ = this.deprecated_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    enumOptions.deprecatedLegacyJsonFieldConflicts_ = this.deprecatedLegacyJsonFieldConflicts_;
                    i |= 4;
                }
                if ((i2 & 8) != 0) {
                    SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                    enumOptions.features_ = singleFieldBuilderV3 == null ? this.features_ : singleFieldBuilderV3.build();
                    i |= 8;
                }
                EnumOptions.access$24076(enumOptions, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EnumOptions) {
                    return mergeFrom((EnumOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EnumOptions enumOptions) {
                if (enumOptions == EnumOptions.getDefaultInstance()) {
                    return this;
                }
                if (enumOptions.hasAllowAlias()) {
                    setAllowAlias(enumOptions.getAllowAlias());
                }
                if (enumOptions.hasDeprecated()) {
                    setDeprecated(enumOptions.getDeprecated());
                }
                if (enumOptions.hasDeprecatedLegacyJsonFieldConflicts()) {
                    setDeprecatedLegacyJsonFieldConflicts(enumOptions.getDeprecatedLegacyJsonFieldConflicts());
                }
                if (enumOptions.hasFeatures()) {
                    mergeFeatures(enumOptions.getFeatures());
                }
                if (this.uninterpretedOptionBuilder_ == null) {
                    if (!enumOptions.uninterpretedOption_.isEmpty()) {
                        if (this.uninterpretedOption_.isEmpty()) {
                            this.uninterpretedOption_ = enumOptions.uninterpretedOption_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureUninterpretedOptionIsMutable();
                            this.uninterpretedOption_.addAll(enumOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!enumOptions.uninterpretedOption_.isEmpty()) {
                    if (!this.uninterpretedOptionBuilder_.isEmpty()) {
                        this.uninterpretedOptionBuilder_.addAllMessages(enumOptions.uninterpretedOption_);
                    } else {
                        this.uninterpretedOptionBuilder_.dispose();
                        this.uninterpretedOptionBuilder_ = null;
                        this.uninterpretedOption_ = enumOptions.uninterpretedOption_;
                        this.bitField0_ &= -17;
                        this.uninterpretedOptionBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getUninterpretedOptionFieldBuilder() : null;
                    }
                }
                mergeExtensionFields(enumOptions);
                mergeUnknownFields(enumOptions.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFeatures() || getFeatures().isInitialized()) {
                    for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                        if (!getUninterpretedOption(i).isInitialized()) {
                            return false;
                        }
                    }
                    return extensionsAreInitialized();
                }
                return false;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 16) {
                                    this.allowAlias_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (readTag == 24) {
                                    this.deprecated_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (readTag == 48) {
                                    this.deprecatedLegacyJsonFieldConflicts_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (readTag == 58) {
                                    codedInputStream.readMessage(getFeaturesFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (readTag == 7994) {
                                    UninterpretedOption uninterpretedOption = (UninterpretedOption) codedInputStream.readMessage(UninterpretedOption.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureUninterpretedOptionIsMutable();
                                        this.uninterpretedOption_.add(uninterpretedOption);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(uninterpretedOption);
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            public Builder setAllowAlias(boolean z) {
                this.allowAlias_ = z;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDeprecated(boolean z) {
                this.deprecated_ = z;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Deprecated
            public Builder setDeprecatedLegacyJsonFieldConflicts(boolean z) {
                this.deprecatedLegacyJsonFieldConflicts_ = z;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public FeatureSet getFeatures() {
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    FeatureSet featureSet = this.features_;
                    return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                FeatureSet featureSet2;
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) == 0 || (featureSet2 = this.features_) == null || featureSet2 == FeatureSet.getDefaultInstance()) {
                        this.features_ = featureSet;
                    } else {
                        getFeaturesBuilder().mergeFrom(featureSet);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(featureSet);
                }
                if (this.features_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public FeatureSet.Builder getFeaturesBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return getFeaturesFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> getFeaturesFieldBuilder() {
                if (this.featuresBuilder_ == null) {
                    this.featuresBuilder_ = new SingleFieldBuilderV3<>(getFeatures(), getParentForChildren(), isClean());
                    this.features_ = null;
                }
                return this.featuresBuilder_;
            }

            private void ensureUninterpretedOptionIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                    this.bitField0_ |= 16;
                }
            }

            public int getUninterpretedOptionCount() {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> getUninterpretedOptionFieldBuilder() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOptionBuilder_ = new RepeatedFieldBuilderV3<>(this.uninterpretedOption_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.uninterpretedOption_ = null;
                }
                return this.uninterpretedOptionBuilder_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class EnumValueOptions extends GeneratedMessageV3.ExtendableMessage<EnumValueOptions> implements EnumValueOptionsOrBuilder {
        private static final EnumValueOptions DEFAULT_INSTANCE = new EnumValueOptions();
        @Deprecated
        public static final Parser<EnumValueOptions> PARSER = new AbstractParser<EnumValueOptions>() { // from class: com.google.protobuf.DescriptorProtos.EnumValueOptions.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public EnumValueOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = EnumValueOptions.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean debugRedact_;
        private boolean deprecated_;
        private FeatureSet features_;
        private byte memoizedIsInitialized;
        private List<UninterpretedOption> uninterpretedOption_;

        public static EnumValueOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean getDebugRedact() {
            return this.debugRedact_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EnumValueOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<EnumValueOptions> getParserForType() {
            return PARSER;
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public boolean hasDebugRedact() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasFeatures() {
            return (this.bitField0_ & 2) != 0;
        }

        static /* synthetic */ int access$25076(EnumValueOptions enumValueOptions, int i) {
            int i2 = i | enumValueOptions.bitField0_;
            enumValueOptions.bitField0_ = i2;
            return i2;
        }

        private EnumValueOptions(GeneratedMessageV3.ExtendableBuilder<EnumValueOptions, ?> extendableBuilder) {
            super(extendableBuilder);
            this.deprecated_ = false;
            this.debugRedact_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        private EnumValueOptions() {
            this.deprecated_ = false;
            this.debugRedact_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new EnumValueOptions();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_EnumValueOptions_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_EnumValueOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(EnumValueOptions.class, Builder.class);
        }

        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasFeatures() && !getFeatures().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.deprecated_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getFeatures());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.debugRedact_);
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.writeMessage(999, this.uninterpretedOption_.get(i));
            }
            newExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.deprecated_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                computeBoolSize += CodedOutputStream.computeMessageSize(2, getFeatures());
            }
            if ((this.bitField0_ & 4) != 0) {
                computeBoolSize += CodedOutputStream.computeBoolSize(3, this.debugRedact_);
            }
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                computeBoolSize += CodedOutputStream.computeMessageSize(999, this.uninterpretedOption_.get(i2));
            }
            int extensionsSerializedSize = computeBoolSize + extensionsSerializedSize() + getUnknownFields().getSerializedSize();
            this.memoizedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnumValueOptions)) {
                return super.equals(obj);
            }
            EnumValueOptions enumValueOptions = (EnumValueOptions) obj;
            if (hasDeprecated() != enumValueOptions.hasDeprecated()) {
                return false;
            }
            if ((!hasDeprecated() || getDeprecated() == enumValueOptions.getDeprecated()) && hasFeatures() == enumValueOptions.hasFeatures()) {
                if ((!hasFeatures() || getFeatures().equals(enumValueOptions.getFeatures())) && hasDebugRedact() == enumValueOptions.hasDebugRedact()) {
                    return (!hasDebugRedact() || getDebugRedact() == enumValueOptions.getDebugRedact()) && getUninterpretedOptionList().equals(enumValueOptions.getUninterpretedOptionList()) && getUnknownFields().equals(enumValueOptions.getUnknownFields()) && getExtensionFields().equals(enumValueOptions.getExtensionFields());
                }
                return false;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasDeprecated()) {
                hashCode = (((hashCode * 37) + 1) * 53) + Internal.hashBoolean(getDeprecated());
            }
            if (hasFeatures()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getFeatures().hashCode();
            }
            if (hasDebugRedact()) {
                hashCode = (((hashCode * 37) + 3) * 53) + Internal.hashBoolean(getDebugRedact());
            }
            if (getUninterpretedOptionCount() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int hashFields = (AbstractMessage.hashFields(hashCode, getExtensionFields()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<EnumValueOptions, Builder> implements EnumValueOptionsOrBuilder {
            private int bitField0_;
            private boolean debugRedact_;
            private boolean deprecated_;
            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> featuresBuilder_;
            private FeatureSet features_;
            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> uninterpretedOptionBuilder_;
            private List<UninterpretedOption> uninterpretedOption_;

            public boolean hasFeatures() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_EnumValueOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(EnumValueOptions.class, Builder.class);
            }

            private Builder() {
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getFeaturesFieldBuilder();
                    getUninterpretedOptionFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_EnumValueOptions_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EnumValueOptions getDefaultInstanceForType() {
                return EnumValueOptions.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnumValueOptions build() {
                EnumValueOptions buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnumValueOptions buildPartial() {
                EnumValueOptions enumValueOptions = new EnumValueOptions(this);
                buildPartialRepeatedFields(enumValueOptions);
                if (this.bitField0_ != 0) {
                    buildPartial0(enumValueOptions);
                }
                onBuilt();
                return enumValueOptions;
            }

            private void buildPartialRepeatedFields(EnumValueOptions enumValueOptions) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) != 0) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                        this.bitField0_ &= -9;
                    }
                    enumValueOptions.uninterpretedOption_ = this.uninterpretedOption_;
                    return;
                }
                enumValueOptions.uninterpretedOption_ = repeatedFieldBuilderV3.build();
            }

            private void buildPartial0(EnumValueOptions enumValueOptions) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    enumValueOptions.deprecated_ = this.deprecated_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                    enumValueOptions.features_ = singleFieldBuilderV3 == null ? this.features_ : singleFieldBuilderV3.build();
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    enumValueOptions.debugRedact_ = this.debugRedact_;
                    i |= 4;
                }
                EnumValueOptions.access$25076(enumValueOptions, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EnumValueOptions) {
                    return mergeFrom((EnumValueOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EnumValueOptions enumValueOptions) {
                if (enumValueOptions == EnumValueOptions.getDefaultInstance()) {
                    return this;
                }
                if (enumValueOptions.hasDeprecated()) {
                    setDeprecated(enumValueOptions.getDeprecated());
                }
                if (enumValueOptions.hasFeatures()) {
                    mergeFeatures(enumValueOptions.getFeatures());
                }
                if (enumValueOptions.hasDebugRedact()) {
                    setDebugRedact(enumValueOptions.getDebugRedact());
                }
                if (this.uninterpretedOptionBuilder_ == null) {
                    if (!enumValueOptions.uninterpretedOption_.isEmpty()) {
                        if (this.uninterpretedOption_.isEmpty()) {
                            this.uninterpretedOption_ = enumValueOptions.uninterpretedOption_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureUninterpretedOptionIsMutable();
                            this.uninterpretedOption_.addAll(enumValueOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!enumValueOptions.uninterpretedOption_.isEmpty()) {
                    if (!this.uninterpretedOptionBuilder_.isEmpty()) {
                        this.uninterpretedOptionBuilder_.addAllMessages(enumValueOptions.uninterpretedOption_);
                    } else {
                        this.uninterpretedOptionBuilder_.dispose();
                        this.uninterpretedOptionBuilder_ = null;
                        this.uninterpretedOption_ = enumValueOptions.uninterpretedOption_;
                        this.bitField0_ &= -9;
                        this.uninterpretedOptionBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getUninterpretedOptionFieldBuilder() : null;
                    }
                }
                mergeExtensionFields(enumValueOptions);
                mergeUnknownFields(enumValueOptions.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFeatures() || getFeatures().isInitialized()) {
                    for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                        if (!getUninterpretedOption(i).isInitialized()) {
                            return false;
                        }
                    }
                    return extensionsAreInitialized();
                }
                return false;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.deprecated_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (readTag == 18) {
                                    codedInputStream.readMessage(getFeaturesFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (readTag == 24) {
                                    this.debugRedact_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (readTag == 7994) {
                                    UninterpretedOption uninterpretedOption = (UninterpretedOption) codedInputStream.readMessage(UninterpretedOption.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureUninterpretedOptionIsMutable();
                                        this.uninterpretedOption_.add(uninterpretedOption);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(uninterpretedOption);
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            public Builder setDeprecated(boolean z) {
                this.deprecated_ = z;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public FeatureSet getFeatures() {
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    FeatureSet featureSet = this.features_;
                    return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                FeatureSet featureSet2;
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) == 0 || (featureSet2 = this.features_) == null || featureSet2 == FeatureSet.getDefaultInstance()) {
                        this.features_ = featureSet;
                    } else {
                        getFeaturesBuilder().mergeFrom(featureSet);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(featureSet);
                }
                if (this.features_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public FeatureSet.Builder getFeaturesBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return getFeaturesFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> getFeaturesFieldBuilder() {
                if (this.featuresBuilder_ == null) {
                    this.featuresBuilder_ = new SingleFieldBuilderV3<>(getFeatures(), getParentForChildren(), isClean());
                    this.features_ = null;
                }
                return this.featuresBuilder_;
            }

            public Builder setDebugRedact(boolean z) {
                this.debugRedact_ = z;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            private void ensureUninterpretedOptionIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                    this.bitField0_ |= 8;
                }
            }

            public int getUninterpretedOptionCount() {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> getUninterpretedOptionFieldBuilder() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOptionBuilder_ = new RepeatedFieldBuilderV3<>(this.uninterpretedOption_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.uninterpretedOption_ = null;
                }
                return this.uninterpretedOptionBuilder_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class ServiceOptions extends GeneratedMessageV3.ExtendableMessage<ServiceOptions> implements ServiceOptionsOrBuilder {
        private static final ServiceOptions DEFAULT_INSTANCE = new ServiceOptions();
        @Deprecated
        public static final Parser<ServiceOptions> PARSER = new AbstractParser<ServiceOptions>() { // from class: com.google.protobuf.DescriptorProtos.ServiceOptions.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public ServiceOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = ServiceOptions.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean deprecated_;
        private FeatureSet features_;
        private byte memoizedIsInitialized;
        private List<UninterpretedOption> uninterpretedOption_;

        public static ServiceOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ServiceOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<ServiceOptions> getParserForType() {
            return PARSER;
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasFeatures() {
            return (this.bitField0_ & 1) != 0;
        }

        static /* synthetic */ int access$25976(ServiceOptions serviceOptions, int i) {
            int i2 = i | serviceOptions.bitField0_;
            serviceOptions.bitField0_ = i2;
            return i2;
        }

        private ServiceOptions(GeneratedMessageV3.ExtendableBuilder<ServiceOptions, ?> extendableBuilder) {
            super(extendableBuilder);
            this.deprecated_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        private ServiceOptions() {
            this.deprecated_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new ServiceOptions();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_ServiceOptions_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_ServiceOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceOptions.class, Builder.class);
        }

        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasFeatures() && !getFeatures().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(33, this.deprecated_);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(34, getFeatures());
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.writeMessage(999, this.uninterpretedOption_.get(i));
            }
            newExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeBoolSize = (this.bitField0_ & 2) != 0 ? CodedOutputStream.computeBoolSize(33, this.deprecated_) : 0;
            if ((this.bitField0_ & 1) != 0) {
                computeBoolSize += CodedOutputStream.computeMessageSize(34, getFeatures());
            }
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                computeBoolSize += CodedOutputStream.computeMessageSize(999, this.uninterpretedOption_.get(i2));
            }
            int extensionsSerializedSize = computeBoolSize + extensionsSerializedSize() + getUnknownFields().getSerializedSize();
            this.memoizedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ServiceOptions)) {
                return super.equals(obj);
            }
            ServiceOptions serviceOptions = (ServiceOptions) obj;
            if (hasFeatures() != serviceOptions.hasFeatures()) {
                return false;
            }
            if ((!hasFeatures() || getFeatures().equals(serviceOptions.getFeatures())) && hasDeprecated() == serviceOptions.hasDeprecated()) {
                return (!hasDeprecated() || getDeprecated() == serviceOptions.getDeprecated()) && getUninterpretedOptionList().equals(serviceOptions.getUninterpretedOptionList()) && getUnknownFields().equals(serviceOptions.getUnknownFields()) && getExtensionFields().equals(serviceOptions.getExtensionFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasFeatures()) {
                hashCode = (((hashCode * 37) + 34) * 53) + getFeatures().hashCode();
            }
            if (hasDeprecated()) {
                hashCode = (((hashCode * 37) + 33) * 53) + Internal.hashBoolean(getDeprecated());
            }
            if (getUninterpretedOptionCount() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int hashFields = (AbstractMessage.hashFields(hashCode, getExtensionFields()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<ServiceOptions, Builder> implements ServiceOptionsOrBuilder {
            private int bitField0_;
            private boolean deprecated_;
            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> featuresBuilder_;
            private FeatureSet features_;
            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> uninterpretedOptionBuilder_;
            private List<UninterpretedOption> uninterpretedOption_;

            public boolean hasFeatures() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_ServiceOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceOptions.class, Builder.class);
            }

            private Builder() {
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getFeaturesFieldBuilder();
                    getUninterpretedOptionFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_ServiceOptions_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ServiceOptions getDefaultInstanceForType() {
                return ServiceOptions.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ServiceOptions build() {
                ServiceOptions buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ServiceOptions buildPartial() {
                ServiceOptions serviceOptions = new ServiceOptions(this);
                buildPartialRepeatedFields(serviceOptions);
                if (this.bitField0_ != 0) {
                    buildPartial0(serviceOptions);
                }
                onBuilt();
                return serviceOptions;
            }

            private void buildPartialRepeatedFields(ServiceOptions serviceOptions) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) != 0) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                        this.bitField0_ &= -5;
                    }
                    serviceOptions.uninterpretedOption_ = this.uninterpretedOption_;
                    return;
                }
                serviceOptions.uninterpretedOption_ = repeatedFieldBuilderV3.build();
            }

            private void buildPartial0(ServiceOptions serviceOptions) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                    serviceOptions.features_ = singleFieldBuilderV3 == null ? this.features_ : singleFieldBuilderV3.build();
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    serviceOptions.deprecated_ = this.deprecated_;
                    i |= 2;
                }
                ServiceOptions.access$25976(serviceOptions, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ServiceOptions) {
                    return mergeFrom((ServiceOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ServiceOptions serviceOptions) {
                if (serviceOptions == ServiceOptions.getDefaultInstance()) {
                    return this;
                }
                if (serviceOptions.hasFeatures()) {
                    mergeFeatures(serviceOptions.getFeatures());
                }
                if (serviceOptions.hasDeprecated()) {
                    setDeprecated(serviceOptions.getDeprecated());
                }
                if (this.uninterpretedOptionBuilder_ == null) {
                    if (!serviceOptions.uninterpretedOption_.isEmpty()) {
                        if (this.uninterpretedOption_.isEmpty()) {
                            this.uninterpretedOption_ = serviceOptions.uninterpretedOption_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureUninterpretedOptionIsMutable();
                            this.uninterpretedOption_.addAll(serviceOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!serviceOptions.uninterpretedOption_.isEmpty()) {
                    if (!this.uninterpretedOptionBuilder_.isEmpty()) {
                        this.uninterpretedOptionBuilder_.addAllMessages(serviceOptions.uninterpretedOption_);
                    } else {
                        this.uninterpretedOptionBuilder_.dispose();
                        this.uninterpretedOptionBuilder_ = null;
                        this.uninterpretedOption_ = serviceOptions.uninterpretedOption_;
                        this.bitField0_ &= -5;
                        this.uninterpretedOptionBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getUninterpretedOptionFieldBuilder() : null;
                    }
                }
                mergeExtensionFields(serviceOptions);
                mergeUnknownFields(serviceOptions.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFeatures() || getFeatures().isInitialized()) {
                    for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                        if (!getUninterpretedOption(i).isInitialized()) {
                            return false;
                        }
                    }
                    return extensionsAreInitialized();
                }
                return false;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 264) {
                                    this.deprecated_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (readTag == 274) {
                                    codedInputStream.readMessage(getFeaturesFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (readTag == 7994) {
                                    UninterpretedOption uninterpretedOption = (UninterpretedOption) codedInputStream.readMessage(UninterpretedOption.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureUninterpretedOptionIsMutable();
                                        this.uninterpretedOption_.add(uninterpretedOption);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(uninterpretedOption);
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            public FeatureSet getFeatures() {
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    FeatureSet featureSet = this.features_;
                    return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                FeatureSet featureSet2;
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) == 0 || (featureSet2 = this.features_) == null || featureSet2 == FeatureSet.getDefaultInstance()) {
                        this.features_ = featureSet;
                    } else {
                        getFeaturesBuilder().mergeFrom(featureSet);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(featureSet);
                }
                if (this.features_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public FeatureSet.Builder getFeaturesBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return getFeaturesFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> getFeaturesFieldBuilder() {
                if (this.featuresBuilder_ == null) {
                    this.featuresBuilder_ = new SingleFieldBuilderV3<>(getFeatures(), getParentForChildren(), isClean());
                    this.features_ = null;
                }
                return this.featuresBuilder_;
            }

            public Builder setDeprecated(boolean z) {
                this.deprecated_ = z;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private void ensureUninterpretedOptionIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                    this.bitField0_ |= 4;
                }
            }

            public int getUninterpretedOptionCount() {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> getUninterpretedOptionFieldBuilder() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOptionBuilder_ = new RepeatedFieldBuilderV3<>(this.uninterpretedOption_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.uninterpretedOption_ = null;
                }
                return this.uninterpretedOptionBuilder_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class MethodOptions extends GeneratedMessageV3.ExtendableMessage<MethodOptions> implements MethodOptionsOrBuilder {
        private static final MethodOptions DEFAULT_INSTANCE = new MethodOptions();
        @Deprecated
        public static final Parser<MethodOptions> PARSER = new AbstractParser<MethodOptions>() { // from class: com.google.protobuf.DescriptorProtos.MethodOptions.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public MethodOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = MethodOptions.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean deprecated_;
        private FeatureSet features_;
        private int idempotencyLevel_;
        private byte memoizedIsInitialized;
        private List<UninterpretedOption> uninterpretedOption_;

        public static MethodOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MethodOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<MethodOptions> getParserForType() {
            return PARSER;
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasFeatures() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasIdempotencyLevel() {
            return (this.bitField0_ & 2) != 0;
        }

        static /* synthetic */ int access$26976(MethodOptions methodOptions, int i) {
            int i2 = i | methodOptions.bitField0_;
            methodOptions.bitField0_ = i2;
            return i2;
        }

        private MethodOptions(GeneratedMessageV3.ExtendableBuilder<MethodOptions, ?> extendableBuilder) {
            super(extendableBuilder);
            this.deprecated_ = false;
            this.idempotencyLevel_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        private MethodOptions() {
            this.deprecated_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.idempotencyLevel_ = 0;
            this.uninterpretedOption_ = Collections.emptyList();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MethodOptions();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_MethodOptions_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_MethodOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(MethodOptions.class, Builder.class);
        }

        /* loaded from: classes2.dex */
        public enum IdempotencyLevel implements ProtocolMessageEnum {
            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);
            
            private final int value;
            private static final Internal.EnumLiteMap<IdempotencyLevel> internalValueMap = new Internal.EnumLiteMap<IdempotencyLevel>() { // from class: com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public IdempotencyLevel findValueByNumber(int i) {
                    return IdempotencyLevel.forNumber(i);
                }
            };
            private static final IdempotencyLevel[] VALUES = values();

            public static IdempotencyLevel forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return IDEMPOTENT;
                    }
                    return NO_SIDE_EFFECTS;
                }
                return IDEMPOTENCY_UNKNOWN;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            IdempotencyLevel(int i) {
                this.value = i;
            }
        }

        public IdempotencyLevel getIdempotencyLevel() {
            IdempotencyLevel forNumber = IdempotencyLevel.forNumber(this.idempotencyLevel_);
            return forNumber == null ? IdempotencyLevel.IDEMPOTENCY_UNKNOWN : forNumber;
        }

        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasFeatures() && !getFeatures().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                if (!getUninterpretedOption(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(33, this.deprecated_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(34, this.idempotencyLevel_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(35, getFeatures());
            }
            for (int i = 0; i < this.uninterpretedOption_.size(); i++) {
                codedOutputStream.writeMessage(999, this.uninterpretedOption_.get(i));
            }
            newExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(33, this.deprecated_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                computeBoolSize += CodedOutputStream.computeEnumSize(34, this.idempotencyLevel_);
            }
            if ((this.bitField0_ & 4) != 0) {
                computeBoolSize += CodedOutputStream.computeMessageSize(35, getFeatures());
            }
            for (int i2 = 0; i2 < this.uninterpretedOption_.size(); i2++) {
                computeBoolSize += CodedOutputStream.computeMessageSize(999, this.uninterpretedOption_.get(i2));
            }
            int extensionsSerializedSize = computeBoolSize + extensionsSerializedSize() + getUnknownFields().getSerializedSize();
            this.memoizedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MethodOptions)) {
                return super.equals(obj);
            }
            MethodOptions methodOptions = (MethodOptions) obj;
            if (hasDeprecated() != methodOptions.hasDeprecated()) {
                return false;
            }
            if ((!hasDeprecated() || getDeprecated() == methodOptions.getDeprecated()) && hasIdempotencyLevel() == methodOptions.hasIdempotencyLevel()) {
                if ((!hasIdempotencyLevel() || this.idempotencyLevel_ == methodOptions.idempotencyLevel_) && hasFeatures() == methodOptions.hasFeatures()) {
                    return (!hasFeatures() || getFeatures().equals(methodOptions.getFeatures())) && getUninterpretedOptionList().equals(methodOptions.getUninterpretedOptionList()) && getUnknownFields().equals(methodOptions.getUnknownFields()) && getExtensionFields().equals(methodOptions.getExtensionFields());
                }
                return false;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasDeprecated()) {
                hashCode = (((hashCode * 37) + 33) * 53) + Internal.hashBoolean(getDeprecated());
            }
            if (hasIdempotencyLevel()) {
                hashCode = (((hashCode * 37) + 34) * 53) + this.idempotencyLevel_;
            }
            if (hasFeatures()) {
                hashCode = (((hashCode * 37) + 35) * 53) + getFeatures().hashCode();
            }
            if (getUninterpretedOptionCount() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + getUninterpretedOptionList().hashCode();
            }
            int hashFields = (AbstractMessage.hashFields(hashCode, getExtensionFields()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<MethodOptions, Builder> implements MethodOptionsOrBuilder {
            private int bitField0_;
            private boolean deprecated_;
            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> featuresBuilder_;
            private FeatureSet features_;
            private int idempotencyLevel_;
            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> uninterpretedOptionBuilder_;
            private List<UninterpretedOption> uninterpretedOption_;

            public boolean hasFeatures() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_MethodOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(MethodOptions.class, Builder.class);
            }

            private Builder() {
                this.idempotencyLevel_ = 0;
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.idempotencyLevel_ = 0;
                this.uninterpretedOption_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getFeaturesFieldBuilder();
                    getUninterpretedOptionFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_MethodOptions_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MethodOptions getDefaultInstanceForType() {
                return MethodOptions.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MethodOptions build() {
                MethodOptions buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MethodOptions buildPartial() {
                MethodOptions methodOptions = new MethodOptions(this);
                buildPartialRepeatedFields(methodOptions);
                if (this.bitField0_ != 0) {
                    buildPartial0(methodOptions);
                }
                onBuilt();
                return methodOptions;
            }

            private void buildPartialRepeatedFields(MethodOptions methodOptions) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) != 0) {
                        this.uninterpretedOption_ = Collections.unmodifiableList(this.uninterpretedOption_);
                        this.bitField0_ &= -9;
                    }
                    methodOptions.uninterpretedOption_ = this.uninterpretedOption_;
                    return;
                }
                methodOptions.uninterpretedOption_ = repeatedFieldBuilderV3.build();
            }

            private void buildPartial0(MethodOptions methodOptions) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    methodOptions.deprecated_ = this.deprecated_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    methodOptions.idempotencyLevel_ = this.idempotencyLevel_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                    methodOptions.features_ = singleFieldBuilderV3 == null ? this.features_ : singleFieldBuilderV3.build();
                    i |= 4;
                }
                MethodOptions.access$26976(methodOptions, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MethodOptions) {
                    return mergeFrom((MethodOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MethodOptions methodOptions) {
                if (methodOptions == MethodOptions.getDefaultInstance()) {
                    return this;
                }
                if (methodOptions.hasDeprecated()) {
                    setDeprecated(methodOptions.getDeprecated());
                }
                if (methodOptions.hasIdempotencyLevel()) {
                    setIdempotencyLevel(methodOptions.getIdempotencyLevel());
                }
                if (methodOptions.hasFeatures()) {
                    mergeFeatures(methodOptions.getFeatures());
                }
                if (this.uninterpretedOptionBuilder_ == null) {
                    if (!methodOptions.uninterpretedOption_.isEmpty()) {
                        if (this.uninterpretedOption_.isEmpty()) {
                            this.uninterpretedOption_ = methodOptions.uninterpretedOption_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureUninterpretedOptionIsMutable();
                            this.uninterpretedOption_.addAll(methodOptions.uninterpretedOption_);
                        }
                        onChanged();
                    }
                } else if (!methodOptions.uninterpretedOption_.isEmpty()) {
                    if (!this.uninterpretedOptionBuilder_.isEmpty()) {
                        this.uninterpretedOptionBuilder_.addAllMessages(methodOptions.uninterpretedOption_);
                    } else {
                        this.uninterpretedOptionBuilder_.dispose();
                        this.uninterpretedOptionBuilder_ = null;
                        this.uninterpretedOption_ = methodOptions.uninterpretedOption_;
                        this.bitField0_ &= -9;
                        this.uninterpretedOptionBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getUninterpretedOptionFieldBuilder() : null;
                    }
                }
                mergeExtensionFields(methodOptions);
                mergeUnknownFields(methodOptions.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFeatures() || getFeatures().isInitialized()) {
                    for (int i = 0; i < getUninterpretedOptionCount(); i++) {
                        if (!getUninterpretedOption(i).isInitialized()) {
                            return false;
                        }
                    }
                    return extensionsAreInitialized();
                }
                return false;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 264) {
                                    this.deprecated_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (readTag == 272) {
                                    int readEnum = codedInputStream.readEnum();
                                    if (IdempotencyLevel.forNumber(readEnum) == null) {
                                        mergeUnknownVarintField(34, readEnum);
                                    } else {
                                        this.idempotencyLevel_ = readEnum;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (readTag == 282) {
                                    codedInputStream.readMessage(getFeaturesFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (readTag == 7994) {
                                    UninterpretedOption uninterpretedOption = (UninterpretedOption) codedInputStream.readMessage(UninterpretedOption.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureUninterpretedOptionIsMutable();
                                        this.uninterpretedOption_.add(uninterpretedOption);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(uninterpretedOption);
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            public Builder setDeprecated(boolean z) {
                this.deprecated_ = z;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIdempotencyLevel(IdempotencyLevel idempotencyLevel) {
                idempotencyLevel.getClass();
                this.bitField0_ |= 2;
                this.idempotencyLevel_ = idempotencyLevel.getNumber();
                onChanged();
                return this;
            }

            public FeatureSet getFeatures() {
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    FeatureSet featureSet = this.features_;
                    return featureSet == null ? FeatureSet.getDefaultInstance() : featureSet;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                FeatureSet featureSet2;
                SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> singleFieldBuilderV3 = this.featuresBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) == 0 || (featureSet2 = this.features_) == null || featureSet2 == FeatureSet.getDefaultInstance()) {
                        this.features_ = featureSet;
                    } else {
                        getFeaturesBuilder().mergeFrom(featureSet);
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(featureSet);
                }
                if (this.features_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public FeatureSet.Builder getFeaturesBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return getFeaturesFieldBuilder().getBuilder();
            }

            private SingleFieldBuilderV3<FeatureSet, FeatureSet.Builder, FeatureSetOrBuilder> getFeaturesFieldBuilder() {
                if (this.featuresBuilder_ == null) {
                    this.featuresBuilder_ = new SingleFieldBuilderV3<>(getFeatures(), getParentForChildren(), isClean());
                    this.features_ = null;
                }
                return this.featuresBuilder_;
            }

            private void ensureUninterpretedOptionIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.uninterpretedOption_ = new ArrayList(this.uninterpretedOption_);
                    this.bitField0_ |= 8;
                }
            }

            public int getUninterpretedOptionCount() {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> repeatedFieldBuilderV3 = this.uninterpretedOptionBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.uninterpretedOption_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<UninterpretedOption, UninterpretedOption.Builder, UninterpretedOptionOrBuilder> getUninterpretedOptionFieldBuilder() {
                if (this.uninterpretedOptionBuilder_ == null) {
                    this.uninterpretedOptionBuilder_ = new RepeatedFieldBuilderV3<>(this.uninterpretedOption_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.uninterpretedOption_ = null;
                }
                return this.uninterpretedOptionBuilder_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class UninterpretedOption extends GeneratedMessageV3 implements UninterpretedOptionOrBuilder {
        private static final UninterpretedOption DEFAULT_INSTANCE = new UninterpretedOption();
        @Deprecated
        public static final Parser<UninterpretedOption> PARSER = new AbstractParser<UninterpretedOption>() { // from class: com.google.protobuf.DescriptorProtos.UninterpretedOption.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public UninterpretedOption parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = UninterpretedOption.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private volatile Object aggregateValue_;
        private int bitField0_;
        private double doubleValue_;
        private volatile Object identifierValue_;
        private byte memoizedIsInitialized;
        private List<NamePart> name_;
        private long negativeIntValue_;
        private long positiveIntValue_;
        private ByteString stringValue_;

        /* loaded from: classes2.dex */
        public interface NamePartOrBuilder extends MessageOrBuilder {
        }

        public static UninterpretedOption getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UninterpretedOption getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public double getDoubleValue() {
            return this.doubleValue_;
        }

        public List<NamePart> getNameList() {
            return this.name_;
        }

        public long getNegativeIntValue() {
            return this.negativeIntValue_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<UninterpretedOption> getParserForType() {
            return PARSER;
        }

        public long getPositiveIntValue() {
            return this.positiveIntValue_;
        }

        public ByteString getStringValue() {
            return this.stringValue_;
        }

        public boolean hasAggregateValue() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasDoubleValue() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasIdentifierValue() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasNegativeIntValue() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPositiveIntValue() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasStringValue() {
            return (this.bitField0_ & 16) != 0;
        }

        static /* synthetic */ int access$29076(UninterpretedOption uninterpretedOption, int i) {
            int i2 = i | uninterpretedOption.bitField0_;
            uninterpretedOption.bitField0_ = i2;
            return i2;
        }

        private UninterpretedOption(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.identifierValue_ = "";
            this.positiveIntValue_ = 0L;
            this.negativeIntValue_ = 0L;
            this.doubleValue_ = 0.0d;
            this.stringValue_ = ByteString.EMPTY;
            this.aggregateValue_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        private UninterpretedOption() {
            this.identifierValue_ = "";
            this.positiveIntValue_ = 0L;
            this.negativeIntValue_ = 0L;
            this.doubleValue_ = 0.0d;
            ByteString byteString = ByteString.EMPTY;
            this.stringValue_ = byteString;
            this.aggregateValue_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = Collections.emptyList();
            this.identifierValue_ = "";
            this.stringValue_ = byteString;
            this.aggregateValue_ = "";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new UninterpretedOption();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_UninterpretedOption_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_UninterpretedOption_fieldAccessorTable.ensureFieldAccessorsInitialized(UninterpretedOption.class, Builder.class);
        }

        /* loaded from: classes2.dex */
        public static final class NamePart extends GeneratedMessageV3 implements NamePartOrBuilder {
            private static final NamePart DEFAULT_INSTANCE = new NamePart();
            @Deprecated
            public static final Parser<NamePart> PARSER = new AbstractParser<NamePart>() { // from class: com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.1
                @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
                public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return super.parseFrom(byteString, extensionRegistryLite);
                }

                @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                    return super.parseFrom(bArr);
                }

                @Override // com.google.protobuf.Parser
                public NamePart parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    Builder newBuilder = NamePart.newBuilder();
                    try {
                        newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                        return newBuilder.buildPartial();
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(newBuilder.buildPartial());
                    } catch (UninitializedMessageException e2) {
                        throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                    }
                }
            };
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private boolean isExtension_;
            private byte memoizedIsInitialized;
            private volatile Object namePart_;

            public static NamePart getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public NamePart getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public boolean getIsExtension() {
                return this.isExtension_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
            public Parser<NamePart> getParserForType() {
                return PARSER;
            }

            public boolean hasIsExtension() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasNamePart() {
                return (this.bitField0_ & 1) != 0;
            }

            static /* synthetic */ int access$27976(NamePart namePart, int i) {
                int i2 = i | namePart.bitField0_;
                namePart.bitField0_ = i2;
                return i2;
            }

            private NamePart(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.namePart_ = "";
                this.isExtension_ = false;
                this.memoizedIsInitialized = (byte) -1;
            }

            private NamePart() {
                this.namePart_ = "";
                this.isExtension_ = false;
                this.memoizedIsInitialized = (byte) -1;
                this.namePart_ = "";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new NamePart();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_UninterpretedOption_NamePart_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_UninterpretedOption_NamePart_fieldAccessorTable.ensureFieldAccessorsInitialized(NamePart.class, Builder.class);
            }

            public String getNamePart() {
                Object obj = this.namePart_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.namePart_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasNamePart()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                } else if (hasIsExtension()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                } else {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.namePart_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeBool(2, this.isExtension_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int computeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.namePart_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    computeStringSize += CodedOutputStream.computeBoolSize(2, this.isExtension_);
                }
                int serializedSize = computeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof NamePart)) {
                    return super.equals(obj);
                }
                NamePart namePart = (NamePart) obj;
                if (hasNamePart() != namePart.hasNamePart()) {
                    return false;
                }
                if ((!hasNamePart() || getNamePart().equals(namePart.getNamePart())) && hasIsExtension() == namePart.hasIsExtension()) {
                    return (!hasIsExtension() || getIsExtension() == namePart.getIsExtension()) && getUnknownFields().equals(namePart.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.AbstractMessage
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = getDescriptor().hashCode() + 779;
                if (hasNamePart()) {
                    hashCode = (((hashCode * 37) + 1) * 53) + getNamePart().hashCode();
                }
                if (hasIsExtension()) {
                    hashCode = (((hashCode * 37) + 2) * 53) + Internal.hashBoolean(getIsExtension());
                }
                int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            /* loaded from: classes2.dex */
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NamePartOrBuilder {
                private int bitField0_;
                private boolean isExtension_;
                private Object namePart_;

                public boolean hasIsExtension() {
                    return (this.bitField0_ & 2) != 0;
                }

                public boolean hasNamePart() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return DescriptorProtos.internal_static_google_protobuf_UninterpretedOption_NamePart_fieldAccessorTable.ensureFieldAccessorsInitialized(NamePart.class, Builder.class);
                }

                private Builder() {
                    this.namePart_ = "";
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.namePart_ = "";
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return DescriptorProtos.internal_static_google_protobuf_UninterpretedOption_NamePart_descriptor;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public NamePart getDefaultInstanceForType() {
                    return NamePart.getDefaultInstance();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public NamePart build() {
                    NamePart buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public NamePart buildPartial() {
                    NamePart namePart = new NamePart(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(namePart);
                    }
                    onBuilt();
                    return namePart;
                }

                private void buildPartial0(NamePart namePart) {
                    int i;
                    int i2 = this.bitField0_;
                    if ((i2 & 1) != 0) {
                        namePart.namePart_ = this.namePart_;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if ((i2 & 2) != 0) {
                        namePart.isExtension_ = this.isExtension_;
                        i |= 2;
                    }
                    NamePart.access$27976(namePart, i);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public Builder mo2781clone() {
                    return (Builder) super.mo2781clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof NamePart) {
                        return mergeFrom((NamePart) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(NamePart namePart) {
                    if (namePart == NamePart.getDefaultInstance()) {
                        return this;
                    }
                    if (namePart.hasNamePart()) {
                        this.namePart_ = namePart.namePart_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (namePart.hasIsExtension()) {
                        setIsExtension(namePart.getIsExtension());
                    }
                    mergeUnknownFields(namePart.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasNamePart() && hasIsExtension();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z = false;
                    while (!z) {
                        try {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 10) {
                                        this.namePart_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 1;
                                    } else if (readTag == 16) {
                                        this.isExtension_ = codedInputStream.readBool();
                                        this.bitField0_ |= 2;
                                    } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.unwrapIOException();
                            }
                        } finally {
                            onChanged();
                        }
                    }
                    return this;
                }

                public Builder setIsExtension(boolean z) {
                    this.isExtension_ = z;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }
        }

        public int getNameCount() {
            return this.name_.size();
        }

        public NamePart getName(int i) {
            return this.name_.get(i);
        }

        public String getIdentifierValue() {
            Object obj = this.identifierValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.identifierValue_ = stringUtf8;
            }
            return stringUtf8;
        }

        public String getAggregateValue() {
            Object obj = this.aggregateValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.aggregateValue_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getNameCount(); i++) {
                if (!getName(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i = 0; i < this.name_.size(); i++) {
                codedOutputStream.writeMessage(2, this.name_.get(i));
            }
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.identifierValue_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt64(4, this.positiveIntValue_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeInt64(5, this.negativeIntValue_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeDouble(6, this.doubleValue_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBytes(7, this.stringValue_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.aggregateValue_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.name_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(2, this.name_.get(i3));
            }
            if ((this.bitField0_ & 1) != 0) {
                i2 += GeneratedMessageV3.computeStringSize(3, this.identifierValue_);
            }
            if ((this.bitField0_ & 2) != 0) {
                i2 += CodedOutputStream.computeUInt64Size(4, this.positiveIntValue_);
            }
            if ((this.bitField0_ & 4) != 0) {
                i2 += CodedOutputStream.computeInt64Size(5, this.negativeIntValue_);
            }
            if ((this.bitField0_ & 8) != 0) {
                i2 += CodedOutputStream.computeDoubleSize(6, this.doubleValue_);
            }
            if ((this.bitField0_ & 16) != 0) {
                i2 += CodedOutputStream.computeBytesSize(7, this.stringValue_);
            }
            if ((this.bitField0_ & 32) != 0) {
                i2 += GeneratedMessageV3.computeStringSize(8, this.aggregateValue_);
            }
            int serializedSize = i2 + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UninterpretedOption)) {
                return super.equals(obj);
            }
            UninterpretedOption uninterpretedOption = (UninterpretedOption) obj;
            if (getNameList().equals(uninterpretedOption.getNameList()) && hasIdentifierValue() == uninterpretedOption.hasIdentifierValue()) {
                if ((!hasIdentifierValue() || getIdentifierValue().equals(uninterpretedOption.getIdentifierValue())) && hasPositiveIntValue() == uninterpretedOption.hasPositiveIntValue()) {
                    if ((!hasPositiveIntValue() || getPositiveIntValue() == uninterpretedOption.getPositiveIntValue()) && hasNegativeIntValue() == uninterpretedOption.hasNegativeIntValue()) {
                        if ((!hasNegativeIntValue() || getNegativeIntValue() == uninterpretedOption.getNegativeIntValue()) && hasDoubleValue() == uninterpretedOption.hasDoubleValue()) {
                            if ((!hasDoubleValue() || Double.doubleToLongBits(getDoubleValue()) == Double.doubleToLongBits(uninterpretedOption.getDoubleValue())) && hasStringValue() == uninterpretedOption.hasStringValue()) {
                                if ((!hasStringValue() || getStringValue().equals(uninterpretedOption.getStringValue())) && hasAggregateValue() == uninterpretedOption.hasAggregateValue()) {
                                    return (!hasAggregateValue() || getAggregateValue().equals(uninterpretedOption.getAggregateValue())) && getUnknownFields().equals(uninterpretedOption.getUnknownFields());
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (getNameCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getNameList().hashCode();
            }
            if (hasIdentifierValue()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getIdentifierValue().hashCode();
            }
            if (hasPositiveIntValue()) {
                hashCode = (((hashCode * 37) + 4) * 53) + Internal.hashLong(getPositiveIntValue());
            }
            if (hasNegativeIntValue()) {
                hashCode = (((hashCode * 37) + 5) * 53) + Internal.hashLong(getNegativeIntValue());
            }
            if (hasDoubleValue()) {
                hashCode = (((hashCode * 37) + 6) * 53) + Internal.hashLong(Double.doubleToLongBits(getDoubleValue()));
            }
            if (hasStringValue()) {
                hashCode = (((hashCode * 37) + 7) * 53) + getStringValue().hashCode();
            }
            if (hasAggregateValue()) {
                hashCode = (((hashCode * 37) + 8) * 53) + getAggregateValue().hashCode();
            }
            int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UninterpretedOptionOrBuilder {
            private Object aggregateValue_;
            private int bitField0_;
            private double doubleValue_;
            private Object identifierValue_;
            private RepeatedFieldBuilderV3<NamePart, NamePart.Builder, NamePartOrBuilder> nameBuilder_;
            private List<NamePart> name_;
            private long negativeIntValue_;
            private long positiveIntValue_;
            private ByteString stringValue_;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_UninterpretedOption_fieldAccessorTable.ensureFieldAccessorsInitialized(UninterpretedOption.class, Builder.class);
            }

            private Builder() {
                this.name_ = Collections.emptyList();
                this.identifierValue_ = "";
                this.stringValue_ = ByteString.EMPTY;
                this.aggregateValue_ = "";
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = Collections.emptyList();
                this.identifierValue_ = "";
                this.stringValue_ = ByteString.EMPTY;
                this.aggregateValue_ = "";
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_UninterpretedOption_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UninterpretedOption getDefaultInstanceForType() {
                return UninterpretedOption.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UninterpretedOption build() {
                UninterpretedOption buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UninterpretedOption buildPartial() {
                UninterpretedOption uninterpretedOption = new UninterpretedOption(this);
                buildPartialRepeatedFields(uninterpretedOption);
                if (this.bitField0_ != 0) {
                    buildPartial0(uninterpretedOption);
                }
                onBuilt();
                return uninterpretedOption;
            }

            private void buildPartialRepeatedFields(UninterpretedOption uninterpretedOption) {
                RepeatedFieldBuilderV3<NamePart, NamePart.Builder, NamePartOrBuilder> repeatedFieldBuilderV3 = this.nameBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.name_ = Collections.unmodifiableList(this.name_);
                        this.bitField0_ &= -2;
                    }
                    uninterpretedOption.name_ = this.name_;
                    return;
                }
                uninterpretedOption.name_ = repeatedFieldBuilderV3.build();
            }

            private void buildPartial0(UninterpretedOption uninterpretedOption) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 2) != 0) {
                    uninterpretedOption.identifierValue_ = this.identifierValue_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 4) != 0) {
                    uninterpretedOption.positiveIntValue_ = this.positiveIntValue_;
                    i |= 2;
                }
                if ((i2 & 8) != 0) {
                    uninterpretedOption.negativeIntValue_ = this.negativeIntValue_;
                    i |= 4;
                }
                if ((i2 & 16) != 0) {
                    uninterpretedOption.doubleValue_ = this.doubleValue_;
                    i |= 8;
                }
                if ((i2 & 32) != 0) {
                    uninterpretedOption.stringValue_ = this.stringValue_;
                    i |= 16;
                }
                if ((i2 & 64) != 0) {
                    uninterpretedOption.aggregateValue_ = this.aggregateValue_;
                    i |= 32;
                }
                UninterpretedOption.access$29076(uninterpretedOption, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UninterpretedOption) {
                    return mergeFrom((UninterpretedOption) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UninterpretedOption uninterpretedOption) {
                if (uninterpretedOption == UninterpretedOption.getDefaultInstance()) {
                    return this;
                }
                if (this.nameBuilder_ == null) {
                    if (!uninterpretedOption.name_.isEmpty()) {
                        if (this.name_.isEmpty()) {
                            this.name_ = uninterpretedOption.name_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureNameIsMutable();
                            this.name_.addAll(uninterpretedOption.name_);
                        }
                        onChanged();
                    }
                } else if (!uninterpretedOption.name_.isEmpty()) {
                    if (!this.nameBuilder_.isEmpty()) {
                        this.nameBuilder_.addAllMessages(uninterpretedOption.name_);
                    } else {
                        this.nameBuilder_.dispose();
                        this.nameBuilder_ = null;
                        this.name_ = uninterpretedOption.name_;
                        this.bitField0_ &= -2;
                        this.nameBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getNameFieldBuilder() : null;
                    }
                }
                if (uninterpretedOption.hasIdentifierValue()) {
                    this.identifierValue_ = uninterpretedOption.identifierValue_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (uninterpretedOption.hasPositiveIntValue()) {
                    setPositiveIntValue(uninterpretedOption.getPositiveIntValue());
                }
                if (uninterpretedOption.hasNegativeIntValue()) {
                    setNegativeIntValue(uninterpretedOption.getNegativeIntValue());
                }
                if (uninterpretedOption.hasDoubleValue()) {
                    setDoubleValue(uninterpretedOption.getDoubleValue());
                }
                if (uninterpretedOption.hasStringValue()) {
                    setStringValue(uninterpretedOption.getStringValue());
                }
                if (uninterpretedOption.hasAggregateValue()) {
                    this.aggregateValue_ = uninterpretedOption.aggregateValue_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                mergeUnknownFields(uninterpretedOption.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getNameCount(); i++) {
                    if (!getName(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 18) {
                                    NamePart namePart = (NamePart) codedInputStream.readMessage(NamePart.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<NamePart, NamePart.Builder, NamePartOrBuilder> repeatedFieldBuilderV3 = this.nameBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureNameIsMutable();
                                        this.name_.add(namePart);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(namePart);
                                    }
                                } else if (readTag == 26) {
                                    this.identifierValue_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (readTag == 32) {
                                    this.positiveIntValue_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 4;
                                } else if (readTag == 40) {
                                    this.negativeIntValue_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 8;
                                } else if (readTag == 49) {
                                    this.doubleValue_ = codedInputStream.readDouble();
                                    this.bitField0_ |= 16;
                                } else if (readTag == 58) {
                                    this.stringValue_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                } else if (readTag == 66) {
                                    this.aggregateValue_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 64;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            private void ensureNameIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.name_ = new ArrayList(this.name_);
                    this.bitField0_ |= 1;
                }
            }

            public int getNameCount() {
                RepeatedFieldBuilderV3<NamePart, NamePart.Builder, NamePartOrBuilder> repeatedFieldBuilderV3 = this.nameBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.name_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public NamePart getName(int i) {
                RepeatedFieldBuilderV3<NamePart, NamePart.Builder, NamePartOrBuilder> repeatedFieldBuilderV3 = this.nameBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.name_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            private RepeatedFieldBuilderV3<NamePart, NamePart.Builder, NamePartOrBuilder> getNameFieldBuilder() {
                if (this.nameBuilder_ == null) {
                    this.nameBuilder_ = new RepeatedFieldBuilderV3<>(this.name_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.name_ = null;
                }
                return this.nameBuilder_;
            }

            public Builder setPositiveIntValue(long j) {
                this.positiveIntValue_ = j;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setNegativeIntValue(long j) {
                this.negativeIntValue_ = j;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDoubleValue(double d) {
                this.doubleValue_ = d;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setStringValue(ByteString byteString) {
                byteString.getClass();
                this.stringValue_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class FeatureSet extends GeneratedMessageV3.ExtendableMessage<FeatureSet> implements FeatureSetOrBuilder {
        private static final FeatureSet DEFAULT_INSTANCE = new FeatureSet();
        @Deprecated
        public static final Parser<FeatureSet> PARSER = new AbstractParser<FeatureSet>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public FeatureSet parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = FeatureSet.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int enumType_;
        private int fieldPresence_;
        private int jsonFormat_;
        private byte memoizedIsInitialized;
        private int messageEncoding_;
        private int repeatedFieldEncoding_;
        private int utf8Validation_;

        public static FeatureSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FeatureSet getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<FeatureSet> getParserForType() {
            return PARSER;
        }

        public boolean hasEnumType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasFieldPresence() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasJsonFormat() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasMessageEncoding() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasRepeatedFieldEncoding() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasUtf8Validation() {
            return (this.bitField0_ & 8) != 0;
        }

        static /* synthetic */ int access$30276(FeatureSet featureSet, int i) {
            int i2 = i | featureSet.bitField0_;
            featureSet.bitField0_ = i2;
            return i2;
        }

        private FeatureSet(GeneratedMessageV3.ExtendableBuilder<FeatureSet, ?> extendableBuilder) {
            super(extendableBuilder);
            this.fieldPresence_ = 0;
            this.enumType_ = 0;
            this.repeatedFieldEncoding_ = 0;
            this.utf8Validation_ = 0;
            this.messageEncoding_ = 0;
            this.jsonFormat_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        private FeatureSet() {
            this.memoizedIsInitialized = (byte) -1;
            this.fieldPresence_ = 0;
            this.enumType_ = 0;
            this.repeatedFieldEncoding_ = 0;
            this.utf8Validation_ = 0;
            this.messageEncoding_ = 0;
            this.jsonFormat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new FeatureSet();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_FeatureSet_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_FeatureSet_fieldAccessorTable.ensureFieldAccessorsInitialized(FeatureSet.class, Builder.class);
        }

        /* loaded from: classes2.dex */
        public enum FieldPresence implements ProtocolMessageEnum {
            FIELD_PRESENCE_UNKNOWN(0),
            EXPLICIT(1),
            IMPLICIT(2),
            LEGACY_REQUIRED(3);
            
            private final int value;
            private static final Internal.EnumLiteMap<FieldPresence> internalValueMap = new Internal.EnumLiteMap<FieldPresence>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.FieldPresence.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public FieldPresence findValueByNumber(int i) {
                    return FieldPresence.forNumber(i);
                }
            };
            private static final FieldPresence[] VALUES = values();

            public static FieldPresence forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return null;
                            }
                            return LEGACY_REQUIRED;
                        }
                        return IMPLICIT;
                    }
                    return EXPLICIT;
                }
                return FIELD_PRESENCE_UNKNOWN;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            FieldPresence(int i) {
                this.value = i;
            }
        }

        /* loaded from: classes2.dex */
        public enum EnumType implements ProtocolMessageEnum {
            ENUM_TYPE_UNKNOWN(0),
            OPEN(1),
            CLOSED(2);
            
            private final int value;
            private static final Internal.EnumLiteMap<EnumType> internalValueMap = new Internal.EnumLiteMap<EnumType>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.EnumType.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public EnumType findValueByNumber(int i) {
                    return EnumType.forNumber(i);
                }
            };
            private static final EnumType[] VALUES = values();

            public static EnumType forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return CLOSED;
                    }
                    return OPEN;
                }
                return ENUM_TYPE_UNKNOWN;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            EnumType(int i) {
                this.value = i;
            }
        }

        /* loaded from: classes2.dex */
        public enum RepeatedFieldEncoding implements ProtocolMessageEnum {
            REPEATED_FIELD_ENCODING_UNKNOWN(0),
            PACKED(1),
            EXPANDED(2);
            
            private final int value;
            private static final Internal.EnumLiteMap<RepeatedFieldEncoding> internalValueMap = new Internal.EnumLiteMap<RepeatedFieldEncoding>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.RepeatedFieldEncoding.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public RepeatedFieldEncoding findValueByNumber(int i) {
                    return RepeatedFieldEncoding.forNumber(i);
                }
            };
            private static final RepeatedFieldEncoding[] VALUES = values();

            public static RepeatedFieldEncoding forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return EXPANDED;
                    }
                    return PACKED;
                }
                return REPEATED_FIELD_ENCODING_UNKNOWN;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            RepeatedFieldEncoding(int i) {
                this.value = i;
            }
        }

        /* loaded from: classes2.dex */
        public enum Utf8Validation implements ProtocolMessageEnum {
            UTF8_VALIDATION_UNKNOWN(0),
            NONE(1),
            VERIFY(2);
            
            private final int value;
            private static final Internal.EnumLiteMap<Utf8Validation> internalValueMap = new Internal.EnumLiteMap<Utf8Validation>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.Utf8Validation.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Utf8Validation findValueByNumber(int i) {
                    return Utf8Validation.forNumber(i);
                }
            };
            private static final Utf8Validation[] VALUES = values();

            public static Utf8Validation forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return VERIFY;
                    }
                    return NONE;
                }
                return UTF8_VALIDATION_UNKNOWN;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            Utf8Validation(int i) {
                this.value = i;
            }
        }

        /* loaded from: classes2.dex */
        public enum MessageEncoding implements ProtocolMessageEnum {
            MESSAGE_ENCODING_UNKNOWN(0),
            LENGTH_PREFIXED(1),
            DELIMITED(2);
            
            private final int value;
            private static final Internal.EnumLiteMap<MessageEncoding> internalValueMap = new Internal.EnumLiteMap<MessageEncoding>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.MessageEncoding.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public MessageEncoding findValueByNumber(int i) {
                    return MessageEncoding.forNumber(i);
                }
            };
            private static final MessageEncoding[] VALUES = values();

            public static MessageEncoding forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return DELIMITED;
                    }
                    return LENGTH_PREFIXED;
                }
                return MESSAGE_ENCODING_UNKNOWN;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            MessageEncoding(int i) {
                this.value = i;
            }
        }

        /* loaded from: classes2.dex */
        public enum JsonFormat implements ProtocolMessageEnum {
            JSON_FORMAT_UNKNOWN(0),
            ALLOW(1),
            LEGACY_BEST_EFFORT(2);
            
            private final int value;
            private static final Internal.EnumLiteMap<JsonFormat> internalValueMap = new Internal.EnumLiteMap<JsonFormat>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.JsonFormat.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public JsonFormat findValueByNumber(int i) {
                    return JsonFormat.forNumber(i);
                }
            };
            private static final JsonFormat[] VALUES = values();

            public static JsonFormat forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return LEGACY_BEST_EFFORT;
                    }
                    return ALLOW;
                }
                return JSON_FORMAT_UNKNOWN;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            JsonFormat(int i) {
                this.value = i;
            }
        }

        public FieldPresence getFieldPresence() {
            FieldPresence forNumber = FieldPresence.forNumber(this.fieldPresence_);
            return forNumber == null ? FieldPresence.FIELD_PRESENCE_UNKNOWN : forNumber;
        }

        public EnumType getEnumType() {
            EnumType forNumber = EnumType.forNumber(this.enumType_);
            return forNumber == null ? EnumType.ENUM_TYPE_UNKNOWN : forNumber;
        }

        public RepeatedFieldEncoding getRepeatedFieldEncoding() {
            RepeatedFieldEncoding forNumber = RepeatedFieldEncoding.forNumber(this.repeatedFieldEncoding_);
            return forNumber == null ? RepeatedFieldEncoding.REPEATED_FIELD_ENCODING_UNKNOWN : forNumber;
        }

        public Utf8Validation getUtf8Validation() {
            Utf8Validation forNumber = Utf8Validation.forNumber(this.utf8Validation_);
            return forNumber == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : forNumber;
        }

        public MessageEncoding getMessageEncoding() {
            MessageEncoding forNumber = MessageEncoding.forNumber(this.messageEncoding_);
            return forNumber == null ? MessageEncoding.MESSAGE_ENCODING_UNKNOWN : forNumber;
        }

        public JsonFormat getJsonFormat() {
            JsonFormat forNumber = JsonFormat.forNumber(this.jsonFormat_);
            return forNumber == null ? JsonFormat.JSON_FORMAT_UNKNOWN : forNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.fieldPresence_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.enumType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.repeatedFieldEncoding_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.utf8Validation_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeEnum(5, this.messageEncoding_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeEnum(6, this.jsonFormat_);
            }
            newExtensionWriter.writeUntil(10000, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.fieldPresence_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                computeEnumSize += CodedOutputStream.computeEnumSize(2, this.enumType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                computeEnumSize += CodedOutputStream.computeEnumSize(3, this.repeatedFieldEncoding_);
            }
            if ((this.bitField0_ & 8) != 0) {
                computeEnumSize += CodedOutputStream.computeEnumSize(4, this.utf8Validation_);
            }
            if ((this.bitField0_ & 16) != 0) {
                computeEnumSize += CodedOutputStream.computeEnumSize(5, this.messageEncoding_);
            }
            if ((this.bitField0_ & 32) != 0) {
                computeEnumSize += CodedOutputStream.computeEnumSize(6, this.jsonFormat_);
            }
            int extensionsSerializedSize = computeEnumSize + extensionsSerializedSize() + getUnknownFields().getSerializedSize();
            this.memoizedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FeatureSet)) {
                return super.equals(obj);
            }
            FeatureSet featureSet = (FeatureSet) obj;
            if (hasFieldPresence() != featureSet.hasFieldPresence()) {
                return false;
            }
            if ((!hasFieldPresence() || this.fieldPresence_ == featureSet.fieldPresence_) && hasEnumType() == featureSet.hasEnumType()) {
                if ((!hasEnumType() || this.enumType_ == featureSet.enumType_) && hasRepeatedFieldEncoding() == featureSet.hasRepeatedFieldEncoding()) {
                    if ((!hasRepeatedFieldEncoding() || this.repeatedFieldEncoding_ == featureSet.repeatedFieldEncoding_) && hasUtf8Validation() == featureSet.hasUtf8Validation()) {
                        if ((!hasUtf8Validation() || this.utf8Validation_ == featureSet.utf8Validation_) && hasMessageEncoding() == featureSet.hasMessageEncoding()) {
                            if ((!hasMessageEncoding() || this.messageEncoding_ == featureSet.messageEncoding_) && hasJsonFormat() == featureSet.hasJsonFormat()) {
                                return (!hasJsonFormat() || this.jsonFormat_ == featureSet.jsonFormat_) && getUnknownFields().equals(featureSet.getUnknownFields()) && getExtensionFields().equals(featureSet.getExtensionFields());
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasFieldPresence()) {
                hashCode = (((hashCode * 37) + 1) * 53) + this.fieldPresence_;
            }
            if (hasEnumType()) {
                hashCode = (((hashCode * 37) + 2) * 53) + this.enumType_;
            }
            if (hasRepeatedFieldEncoding()) {
                hashCode = (((hashCode * 37) + 3) * 53) + this.repeatedFieldEncoding_;
            }
            if (hasUtf8Validation()) {
                hashCode = (((hashCode * 37) + 4) * 53) + this.utf8Validation_;
            }
            if (hasMessageEncoding()) {
                hashCode = (((hashCode * 37) + 5) * 53) + this.messageEncoding_;
            }
            if (hasJsonFormat()) {
                hashCode = (((hashCode * 37) + 6) * 53) + this.jsonFormat_;
            }
            int hashFields = (AbstractMessage.hashFields(hashCode, getExtensionFields()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<FeatureSet, Builder> implements FeatureSetOrBuilder {
            private int bitField0_;
            private int enumType_;
            private int fieldPresence_;
            private int jsonFormat_;
            private int messageEncoding_;
            private int repeatedFieldEncoding_;
            private int utf8Validation_;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_FeatureSet_fieldAccessorTable.ensureFieldAccessorsInitialized(FeatureSet.class, Builder.class);
            }

            private Builder() {
                this.fieldPresence_ = 0;
                this.enumType_ = 0;
                this.repeatedFieldEncoding_ = 0;
                this.utf8Validation_ = 0;
                this.messageEncoding_ = 0;
                this.jsonFormat_ = 0;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.fieldPresence_ = 0;
                this.enumType_ = 0;
                this.repeatedFieldEncoding_ = 0;
                this.utf8Validation_ = 0;
                this.messageEncoding_ = 0;
                this.jsonFormat_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_FeatureSet_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FeatureSet getDefaultInstanceForType() {
                return FeatureSet.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FeatureSet build() {
                FeatureSet buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FeatureSet buildPartial() {
                FeatureSet featureSet = new FeatureSet(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(featureSet);
                }
                onBuilt();
                return featureSet;
            }

            private void buildPartial0(FeatureSet featureSet) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    featureSet.fieldPresence_ = this.fieldPresence_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    featureSet.enumType_ = this.enumType_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    featureSet.repeatedFieldEncoding_ = this.repeatedFieldEncoding_;
                    i |= 4;
                }
                if ((i2 & 8) != 0) {
                    featureSet.utf8Validation_ = this.utf8Validation_;
                    i |= 8;
                }
                if ((i2 & 16) != 0) {
                    featureSet.messageEncoding_ = this.messageEncoding_;
                    i |= 16;
                }
                if ((i2 & 32) != 0) {
                    featureSet.jsonFormat_ = this.jsonFormat_;
                    i |= 32;
                }
                FeatureSet.access$30276(featureSet, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FeatureSet) {
                    return mergeFrom((FeatureSet) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FeatureSet featureSet) {
                if (featureSet == FeatureSet.getDefaultInstance()) {
                    return this;
                }
                if (featureSet.hasFieldPresence()) {
                    setFieldPresence(featureSet.getFieldPresence());
                }
                if (featureSet.hasEnumType()) {
                    setEnumType(featureSet.getEnumType());
                }
                if (featureSet.hasRepeatedFieldEncoding()) {
                    setRepeatedFieldEncoding(featureSet.getRepeatedFieldEncoding());
                }
                if (featureSet.hasUtf8Validation()) {
                    setUtf8Validation(featureSet.getUtf8Validation());
                }
                if (featureSet.hasMessageEncoding()) {
                    setMessageEncoding(featureSet.getMessageEncoding());
                }
                if (featureSet.hasJsonFormat()) {
                    setJsonFormat(featureSet.getJsonFormat());
                }
                mergeExtensionFields(featureSet);
                mergeUnknownFields(featureSet.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return extensionsAreInitialized();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    int readEnum = codedInputStream.readEnum();
                                    if (FieldPresence.forNumber(readEnum) == null) {
                                        mergeUnknownVarintField(1, readEnum);
                                    } else {
                                        this.fieldPresence_ = readEnum;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (readTag == 16) {
                                    int readEnum2 = codedInputStream.readEnum();
                                    if (EnumType.forNumber(readEnum2) == null) {
                                        mergeUnknownVarintField(2, readEnum2);
                                    } else {
                                        this.enumType_ = readEnum2;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (readTag == 24) {
                                    int readEnum3 = codedInputStream.readEnum();
                                    if (RepeatedFieldEncoding.forNumber(readEnum3) == null) {
                                        mergeUnknownVarintField(3, readEnum3);
                                    } else {
                                        this.repeatedFieldEncoding_ = readEnum3;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (readTag == 32) {
                                    int readEnum4 = codedInputStream.readEnum();
                                    if (Utf8Validation.forNumber(readEnum4) == null) {
                                        mergeUnknownVarintField(4, readEnum4);
                                    } else {
                                        this.utf8Validation_ = readEnum4;
                                        this.bitField0_ |= 8;
                                    }
                                } else if (readTag == 40) {
                                    int readEnum5 = codedInputStream.readEnum();
                                    if (MessageEncoding.forNumber(readEnum5) == null) {
                                        mergeUnknownVarintField(5, readEnum5);
                                    } else {
                                        this.messageEncoding_ = readEnum5;
                                        this.bitField0_ |= 16;
                                    }
                                } else if (readTag == 48) {
                                    int readEnum6 = codedInputStream.readEnum();
                                    if (JsonFormat.forNumber(readEnum6) == null) {
                                        mergeUnknownVarintField(6, readEnum6);
                                    } else {
                                        this.jsonFormat_ = readEnum6;
                                        this.bitField0_ |= 32;
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            public Builder setFieldPresence(FieldPresence fieldPresence) {
                fieldPresence.getClass();
                this.bitField0_ |= 1;
                this.fieldPresence_ = fieldPresence.getNumber();
                onChanged();
                return this;
            }

            public Builder setEnumType(EnumType enumType) {
                enumType.getClass();
                this.bitField0_ |= 2;
                this.enumType_ = enumType.getNumber();
                onChanged();
                return this;
            }

            public Builder setRepeatedFieldEncoding(RepeatedFieldEncoding repeatedFieldEncoding) {
                repeatedFieldEncoding.getClass();
                this.bitField0_ |= 4;
                this.repeatedFieldEncoding_ = repeatedFieldEncoding.getNumber();
                onChanged();
                return this;
            }

            public Builder setUtf8Validation(Utf8Validation utf8Validation) {
                utf8Validation.getClass();
                this.bitField0_ |= 8;
                this.utf8Validation_ = utf8Validation.getNumber();
                onChanged();
                return this;
            }

            public Builder setMessageEncoding(MessageEncoding messageEncoding) {
                messageEncoding.getClass();
                this.bitField0_ |= 16;
                this.messageEncoding_ = messageEncoding.getNumber();
                onChanged();
                return this;
            }

            public Builder setJsonFormat(JsonFormat jsonFormat) {
                jsonFormat.getClass();
                this.bitField0_ |= 32;
                this.jsonFormat_ = jsonFormat.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class SourceCodeInfo extends GeneratedMessageV3 implements SourceCodeInfoOrBuilder {
        private static final SourceCodeInfo DEFAULT_INSTANCE = new SourceCodeInfo();
        @Deprecated
        public static final Parser<SourceCodeInfo> PARSER = new AbstractParser<SourceCodeInfo>() { // from class: com.google.protobuf.DescriptorProtos.SourceCodeInfo.1
            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return super.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.Parser
            public SourceCodeInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Builder newBuilder = SourceCodeInfo.newBuilder();
                try {
                    newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return newBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(newBuilder.buildPartial());
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private List<Location> location_;
        private byte memoizedIsInitialized;

        /* loaded from: classes2.dex */
        public interface LocationOrBuilder extends MessageOrBuilder {
        }

        public static SourceCodeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SourceCodeInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public List<Location> getLocationList() {
            return this.location_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
        public Parser<SourceCodeInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        private SourceCodeInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private SourceCodeInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.location_ = Collections.emptyList();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new SourceCodeInfo();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.internal_static_google_protobuf_SourceCodeInfo_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DescriptorProtos.internal_static_google_protobuf_SourceCodeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SourceCodeInfo.class, Builder.class);
        }

        /* loaded from: classes2.dex */
        public static final class Location extends GeneratedMessageV3 implements LocationOrBuilder {
            private static final Location DEFAULT_INSTANCE = new Location();
            @Deprecated
            public static final Parser<Location> PARSER = new AbstractParser<Location>() { // from class: com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.1
                @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
                public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return super.parseFrom(byteString, extensionRegistryLite);
                }

                @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                    return super.parseFrom(bArr);
                }

                @Override // com.google.protobuf.Parser
                public Location parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    Builder newBuilder = Location.newBuilder();
                    try {
                        newBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                        return newBuilder.buildPartial();
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(newBuilder.buildPartial());
                    } catch (UninitializedMessageException e2) {
                        throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(newBuilder.buildPartial());
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(newBuilder.buildPartial());
                    }
                }
            };
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private volatile Object leadingComments_;
            private LazyStringArrayList leadingDetachedComments_;
            private byte memoizedIsInitialized;
            private int pathMemoizedSerializedSize;
            private Internal.IntList path_;
            private int spanMemoizedSerializedSize;
            private Internal.IntList span_;
            private volatile Object trailingComments_;

            public static Location getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Location getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public ProtocolStringList getLeadingDetachedCommentsList() {
                return this.leadingDetachedComments_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite
            public Parser<Location> getParserForType() {
                return PARSER;
            }

            public List<Integer> getPathList() {
                return this.path_;
            }

            public List<Integer> getSpanList() {
                return this.span_;
            }

            public boolean hasLeadingComments() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasTrailingComments() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            static /* synthetic */ int access$33276(Location location, int i) {
                int i2 = i | location.bitField0_;
                location.bitField0_ = i2;
                return i2;
            }

            private Location(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.path_ = GeneratedMessageV3.emptyIntList();
                this.pathMemoizedSerializedSize = -1;
                this.span_ = GeneratedMessageV3.emptyIntList();
                this.spanMemoizedSerializedSize = -1;
                this.leadingComments_ = "";
                this.trailingComments_ = "";
                this.leadingDetachedComments_ = LazyStringArrayList.emptyList();
                this.memoizedIsInitialized = (byte) -1;
            }

            private Location() {
                this.path_ = GeneratedMessageV3.emptyIntList();
                this.pathMemoizedSerializedSize = -1;
                this.span_ = GeneratedMessageV3.emptyIntList();
                this.spanMemoizedSerializedSize = -1;
                this.leadingComments_ = "";
                this.trailingComments_ = "";
                this.leadingDetachedComments_ = LazyStringArrayList.emptyList();
                this.memoizedIsInitialized = (byte) -1;
                this.path_ = GeneratedMessageV3.emptyIntList();
                this.span_ = GeneratedMessageV3.emptyIntList();
                this.leadingComments_ = "";
                this.trailingComments_ = "";
                this.leadingDetachedComments_ = LazyStringArrayList.emptyList();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Location();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DescriptorProtos.internal_static_google_protobuf_SourceCodeInfo_Location_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_SourceCodeInfo_Location_fieldAccessorTable.ensureFieldAccessorsInitialized(Location.class, Builder.class);
            }

            public int getPathCount() {
                return this.path_.size();
            }

            public int getSpanCount() {
                return this.span_.size();
            }

            public String getLeadingComments() {
                Object obj = this.leadingComments_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.leadingComments_ = stringUtf8;
                }
                return stringUtf8;
            }

            public String getTrailingComments() {
                Object obj = this.trailingComments_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.trailingComments_ = stringUtf8;
                }
                return stringUtf8;
            }

            public int getLeadingDetachedCommentsCount() {
                return this.leadingDetachedComments_.size();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if (getPathList().size() > 0) {
                    codedOutputStream.writeUInt32NoTag(10);
                    codedOutputStream.writeUInt32NoTag(this.pathMemoizedSerializedSize);
                }
                for (int i = 0; i < this.path_.size(); i++) {
                    codedOutputStream.writeInt32NoTag(this.path_.getInt(i));
                }
                if (getSpanList().size() > 0) {
                    codedOutputStream.writeUInt32NoTag(18);
                    codedOutputStream.writeUInt32NoTag(this.spanMemoizedSerializedSize);
                }
                for (int i2 = 0; i2 < this.span_.size(); i2++) {
                    codedOutputStream.writeInt32NoTag(this.span_.getInt(i2));
                }
                if ((this.bitField0_ & 1) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.leadingComments_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.trailingComments_);
                }
                for (int i3 = 0; i3 < this.leadingDetachedComments_.size(); i3++) {
                    GeneratedMessageV3.writeString(codedOutputStream, 6, this.leadingDetachedComments_.getRaw(i3));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                for (int i3 = 0; i3 < this.path_.size(); i3++) {
                    i2 += CodedOutputStream.computeInt32SizeNoTag(this.path_.getInt(i3));
                }
                int computeInt32SizeNoTag = !getPathList().isEmpty() ? i2 + 1 + CodedOutputStream.computeInt32SizeNoTag(i2) : i2;
                this.pathMemoizedSerializedSize = i2;
                int i4 = 0;
                for (int i5 = 0; i5 < this.span_.size(); i5++) {
                    i4 += CodedOutputStream.computeInt32SizeNoTag(this.span_.getInt(i5));
                }
                int i6 = computeInt32SizeNoTag + i4;
                if (!getSpanList().isEmpty()) {
                    i6 = i6 + 1 + CodedOutputStream.computeInt32SizeNoTag(i4);
                }
                this.spanMemoizedSerializedSize = i4;
                if ((this.bitField0_ & 1) != 0) {
                    i6 += GeneratedMessageV3.computeStringSize(3, this.leadingComments_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    i6 += GeneratedMessageV3.computeStringSize(4, this.trailingComments_);
                }
                int i7 = 0;
                for (int i8 = 0; i8 < this.leadingDetachedComments_.size(); i8++) {
                    i7 += GeneratedMessageV3.computeStringSizeNoTag(this.leadingDetachedComments_.getRaw(i8));
                }
                int size = i6 + i7 + getLeadingDetachedCommentsList().size() + getUnknownFields().getSerializedSize();
                this.memoizedSize = size;
                return size;
            }

            @Override // com.google.protobuf.AbstractMessage
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Location)) {
                    return super.equals(obj);
                }
                Location location = (Location) obj;
                if (getPathList().equals(location.getPathList()) && getSpanList().equals(location.getSpanList()) && hasLeadingComments() == location.hasLeadingComments()) {
                    if ((!hasLeadingComments() || getLeadingComments().equals(location.getLeadingComments())) && hasTrailingComments() == location.hasTrailingComments()) {
                        return (!hasTrailingComments() || getTrailingComments().equals(location.getTrailingComments())) && getLeadingDetachedCommentsList().equals(location.getLeadingDetachedCommentsList()) && getUnknownFields().equals(location.getUnknownFields());
                    }
                    return false;
                }
                return false;
            }

            @Override // com.google.protobuf.AbstractMessage
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = getDescriptor().hashCode() + 779;
                if (getPathCount() > 0) {
                    hashCode = (((hashCode * 37) + 1) * 53) + getPathList().hashCode();
                }
                if (getSpanCount() > 0) {
                    hashCode = (((hashCode * 37) + 2) * 53) + getSpanList().hashCode();
                }
                if (hasLeadingComments()) {
                    hashCode = (((hashCode * 37) + 3) * 53) + getLeadingComments().hashCode();
                }
                if (hasTrailingComments()) {
                    hashCode = (((hashCode * 37) + 4) * 53) + getTrailingComments().hashCode();
                }
                if (getLeadingDetachedCommentsCount() > 0) {
                    hashCode = (((hashCode * 37) + 6) * 53) + getLeadingDetachedCommentsList().hashCode();
                }
                int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            /* loaded from: classes2.dex */
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LocationOrBuilder {
                private int bitField0_;
                private Object leadingComments_;
                private LazyStringArrayList leadingDetachedComments_;
                private Internal.IntList path_;
                private Internal.IntList span_;
                private Object trailingComments_;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return DescriptorProtos.internal_static_google_protobuf_SourceCodeInfo_Location_fieldAccessorTable.ensureFieldAccessorsInitialized(Location.class, Builder.class);
                }

                private Builder() {
                    this.path_ = GeneratedMessageV3.emptyIntList();
                    this.span_ = GeneratedMessageV3.emptyIntList();
                    this.leadingComments_ = "";
                    this.trailingComments_ = "";
                    this.leadingDetachedComments_ = LazyStringArrayList.emptyList();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.path_ = GeneratedMessageV3.emptyIntList();
                    this.span_ = GeneratedMessageV3.emptyIntList();
                    this.leadingComments_ = "";
                    this.trailingComments_ = "";
                    this.leadingDetachedComments_ = LazyStringArrayList.emptyList();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return DescriptorProtos.internal_static_google_protobuf_SourceCodeInfo_Location_descriptor;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public Location getDefaultInstanceForType() {
                    return Location.getDefaultInstance();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Location build() {
                    Location buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Location buildPartial() {
                    Location location = new Location(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(location);
                    }
                    onBuilt();
                    return location;
                }

                private void buildPartial0(Location location) {
                    int i;
                    int i2 = this.bitField0_;
                    if ((i2 & 1) != 0) {
                        this.path_.makeImmutable();
                        location.path_ = this.path_;
                    }
                    if ((i2 & 2) != 0) {
                        this.span_.makeImmutable();
                        location.span_ = this.span_;
                    }
                    if ((i2 & 4) != 0) {
                        location.leadingComments_ = this.leadingComments_;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if ((i2 & 8) != 0) {
                        location.trailingComments_ = this.trailingComments_;
                        i |= 2;
                    }
                    if ((i2 & 16) != 0) {
                        this.leadingDetachedComments_.makeImmutable();
                        location.leadingDetachedComments_ = this.leadingDetachedComments_;
                    }
                    Location.access$33276(location, i);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public Builder mo2781clone() {
                    return (Builder) super.mo2781clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Location) {
                        return mergeFrom((Location) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Location location) {
                    if (location == Location.getDefaultInstance()) {
                        return this;
                    }
                    if (!location.path_.isEmpty()) {
                        if (this.path_.isEmpty()) {
                            Internal.IntList intList = location.path_;
                            this.path_ = intList;
                            intList.makeImmutable();
                            this.bitField0_ |= 1;
                        } else {
                            ensurePathIsMutable();
                            this.path_.addAll(location.path_);
                        }
                        onChanged();
                    }
                    if (!location.span_.isEmpty()) {
                        if (this.span_.isEmpty()) {
                            Internal.IntList intList2 = location.span_;
                            this.span_ = intList2;
                            intList2.makeImmutable();
                            this.bitField0_ |= 2;
                        } else {
                            ensureSpanIsMutable();
                            this.span_.addAll(location.span_);
                        }
                        onChanged();
                    }
                    if (location.hasLeadingComments()) {
                        this.leadingComments_ = location.leadingComments_;
                        this.bitField0_ |= 4;
                        onChanged();
                    }
                    if (location.hasTrailingComments()) {
                        this.trailingComments_ = location.trailingComments_;
                        this.bitField0_ |= 8;
                        onChanged();
                    }
                    if (!location.leadingDetachedComments_.isEmpty()) {
                        if (this.leadingDetachedComments_.isEmpty()) {
                            this.leadingDetachedComments_ = location.leadingDetachedComments_;
                            this.bitField0_ |= 16;
                        } else {
                            ensureLeadingDetachedCommentsIsMutable();
                            this.leadingDetachedComments_.addAll(location.leadingDetachedComments_);
                        }
                        onChanged();
                    }
                    mergeUnknownFields(location.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z = false;
                    while (!z) {
                        try {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 8) {
                                        int readInt32 = codedInputStream.readInt32();
                                        ensurePathIsMutable();
                                        this.path_.addInt(readInt32);
                                    } else if (readTag == 10) {
                                        int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                        ensurePathIsMutable();
                                        while (codedInputStream.getBytesUntilLimit() > 0) {
                                            this.path_.addInt(codedInputStream.readInt32());
                                        }
                                        codedInputStream.popLimit(pushLimit);
                                    } else if (readTag == 16) {
                                        int readInt322 = codedInputStream.readInt32();
                                        ensureSpanIsMutable();
                                        this.span_.addInt(readInt322);
                                    } else if (readTag == 18) {
                                        int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                        ensureSpanIsMutable();
                                        while (codedInputStream.getBytesUntilLimit() > 0) {
                                            this.span_.addInt(codedInputStream.readInt32());
                                        }
                                        codedInputStream.popLimit(pushLimit2);
                                    } else if (readTag == 26) {
                                        this.leadingComments_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 4;
                                    } else if (readTag == 34) {
                                        this.trailingComments_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 8;
                                    } else if (readTag == 50) {
                                        ByteString readBytes = codedInputStream.readBytes();
                                        ensureLeadingDetachedCommentsIsMutable();
                                        this.leadingDetachedComments_.add(readBytes);
                                    } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.unwrapIOException();
                            }
                        } finally {
                            onChanged();
                        }
                    }
                    return this;
                }

                private void ensurePathIsMutable() {
                    if (!this.path_.isModifiable()) {
                        this.path_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.path_);
                    }
                    this.bitField0_ |= 1;
                }

                private void ensureSpanIsMutable() {
                    if (!this.span_.isModifiable()) {
                        this.span_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.span_);
                    }
                    this.bitField0_ |= 2;
                }

                private void ensureLeadingDetachedCommentsIsMutable() {
                    if (!this.leadingDetachedComments_.isModifiable()) {
                        this.leadingDetachedComments_ = new LazyStringArrayList(this.leadingDetachedComments_);
                    }
                    this.bitField0_ |= 16;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }
        }

        public int getLocationCount() {
            return this.location_.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i = 0; i < this.location_.size(); i++) {
                codedOutputStream.writeMessage(1, this.location_.get(i));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.location_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.location_.get(i3));
            }
            int serializedSize = i2 + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SourceCodeInfo)) {
                return super.equals(obj);
            }
            SourceCodeInfo sourceCodeInfo = (SourceCodeInfo) obj;
            return getLocationList().equals(sourceCodeInfo.getLocationList()) && getUnknownFields().equals(sourceCodeInfo.getUnknownFields());
        }

        @Override // com.google.protobuf.AbstractMessage
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (getLocationCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getLocationList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SourceCodeInfoOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> locationBuilder_;
            private List<Location> location_;

            private void buildPartial0(SourceCodeInfo sourceCodeInfo) {
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DescriptorProtos.internal_static_google_protobuf_SourceCodeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SourceCodeInfo.class, Builder.class);
            }

            private Builder() {
                this.location_ = Collections.emptyList();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.location_ = Collections.emptyList();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.internal_static_google_protobuf_SourceCodeInfo_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SourceCodeInfo getDefaultInstanceForType() {
                return SourceCodeInfo.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SourceCodeInfo build() {
                SourceCodeInfo buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SourceCodeInfo buildPartial() {
                SourceCodeInfo sourceCodeInfo = new SourceCodeInfo(this);
                buildPartialRepeatedFields(sourceCodeInfo);
                if (this.bitField0_ != 0) {
                    buildPartial0(sourceCodeInfo);
                }
                onBuilt();
                return sourceCodeInfo;
            }

            private void buildPartialRepeatedFields(SourceCodeInfo sourceCodeInfo) {
                RepeatedFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> repeatedFieldBuilderV3 = this.locationBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.location_ = Collections.unmodifiableList(this.location_);
                        this.bitField0_ &= -2;
                    }
                    sourceCodeInfo.location_ = this.location_;
                    return;
                }
                sourceCodeInfo.location_ = repeatedFieldBuilderV3.build();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo2781clone() {
                return (Builder) super.mo2781clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SourceCodeInfo) {
                    return mergeFrom((SourceCodeInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SourceCodeInfo sourceCodeInfo) {
                if (sourceCodeInfo == SourceCodeInfo.getDefaultInstance()) {
                    return this;
                }
                if (this.locationBuilder_ == null) {
                    if (!sourceCodeInfo.location_.isEmpty()) {
                        if (this.location_.isEmpty()) {
                            this.location_ = sourceCodeInfo.location_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureLocationIsMutable();
                            this.location_.addAll(sourceCodeInfo.location_);
                        }
                        onChanged();
                    }
                } else if (!sourceCodeInfo.location_.isEmpty()) {
                    if (!this.locationBuilder_.isEmpty()) {
                        this.locationBuilder_.addAllMessages(sourceCodeInfo.location_);
                    } else {
                        this.locationBuilder_.dispose();
                        this.locationBuilder_ = null;
                        this.location_ = sourceCodeInfo.location_;
                        this.bitField0_ &= -2;
                        this.locationBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getLocationFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(sourceCodeInfo.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    Location location = (Location) codedInputStream.readMessage(Location.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> repeatedFieldBuilderV3 = this.locationBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureLocationIsMutable();
                                        this.location_.add(location);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(location);
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }

            private void ensureLocationIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.location_ = new ArrayList(this.location_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> getLocationFieldBuilder() {
                if (this.locationBuilder_ == null) {
                    this.locationBuilder_ = new RepeatedFieldBuilderV3<>(this.location_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.location_ = null;
                }
                return this.locationBuilder_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_protobuf_FileDescriptorSet_descriptor = descriptor2;
        internal_static_google_protobuf_FileDescriptorSet_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"File"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_google_protobuf_FileDescriptorProto_descriptor = descriptor3;
        internal_static_google_protobuf_FileDescriptorProto_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Name", "Package", "Dependency", "PublicDependency", "WeakDependency", "MessageType", "EnumType", "Service", "Extension", "Options", "SourceCodeInfo", "Syntax", "Edition"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_google_protobuf_DescriptorProto_descriptor = descriptor4;
        internal_static_google_protobuf_DescriptorProto_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Name", "Field", "Extension", "NestedType", "EnumType", "ExtensionRange", "OneofDecl", "Options", "ReservedRange", "ReservedName"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        internal_static_google_protobuf_DescriptorProto_ExtensionRange_descriptor = descriptor5;
        internal_static_google_protobuf_DescriptorProto_ExtensionRange_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Start", "End", "Options"});
        Descriptors.Descriptor descriptor6 = descriptor4.getNestedTypes().get(1);
        internal_static_google_protobuf_DescriptorProto_ReservedRange_descriptor = descriptor6;
        internal_static_google_protobuf_DescriptorProto_ReservedRange_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Start", "End"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(3);
        internal_static_google_protobuf_ExtensionRangeOptions_descriptor = descriptor7;
        internal_static_google_protobuf_ExtensionRangeOptions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"UninterpretedOption", "Declaration", "Features", "Verification"});
        Descriptors.Descriptor descriptor8 = descriptor7.getNestedTypes().get(0);
        internal_static_google_protobuf_ExtensionRangeOptions_Declaration_descriptor = descriptor8;
        internal_static_google_protobuf_ExtensionRangeOptions_Declaration_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Number", "FullName", "Type", "Reserved", "Repeated"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(4);
        internal_static_google_protobuf_FieldDescriptorProto_descriptor = descriptor9;
        internal_static_google_protobuf_FieldDescriptorProto_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Name", "Number", "Label", "Type", "TypeName", "Extendee", "DefaultValue", "OneofIndex", "JsonName", "Options", "Proto3Optional"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(5);
        internal_static_google_protobuf_OneofDescriptorProto_descriptor = descriptor10;
        internal_static_google_protobuf_OneofDescriptorProto_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Name", "Options"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(6);
        internal_static_google_protobuf_EnumDescriptorProto_descriptor = descriptor11;
        internal_static_google_protobuf_EnumDescriptorProto_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Name", "Value", "Options", "ReservedRange", "ReservedName"});
        Descriptors.Descriptor descriptor12 = descriptor11.getNestedTypes().get(0);
        internal_static_google_protobuf_EnumDescriptorProto_EnumReservedRange_descriptor = descriptor12;
        internal_static_google_protobuf_EnumDescriptorProto_EnumReservedRange_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Start", "End"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(7);
        internal_static_google_protobuf_EnumValueDescriptorProto_descriptor = descriptor13;
        internal_static_google_protobuf_EnumValueDescriptorProto_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Name", "Number", "Options"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(8);
        internal_static_google_protobuf_ServiceDescriptorProto_descriptor = descriptor14;
        internal_static_google_protobuf_ServiceDescriptorProto_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Name", "Method", "Options"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(9);
        internal_static_google_protobuf_MethodDescriptorProto_descriptor = descriptor15;
        internal_static_google_protobuf_MethodDescriptorProto_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Name", "InputType", "OutputType", "Options", "ClientStreaming", "ServerStreaming"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(10);
        internal_static_google_protobuf_FileOptions_descriptor = descriptor16;
        internal_static_google_protobuf_FileOptions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"JavaPackage", "JavaOuterClassname", "JavaMultipleFiles", "JavaGenerateEqualsAndHash", "JavaStringCheckUtf8", "OptimizeFor", "GoPackage", "CcGenericServices", "JavaGenericServices", "PyGenericServices", "PhpGenericServices", "Deprecated", "CcEnableArenas", "ObjcClassPrefix", "CsharpNamespace", "SwiftPrefix", "PhpClassPrefix", "PhpNamespace", "PhpMetadataNamespace", "RubyPackage", "Features", "UninterpretedOption"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(11);
        internal_static_google_protobuf_MessageOptions_descriptor = descriptor17;
        internal_static_google_protobuf_MessageOptions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"MessageSetWireFormat", "NoStandardDescriptorAccessor", "Deprecated", "MapEntry", "DeprecatedLegacyJsonFieldConflicts", "Features", "UninterpretedOption"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(12);
        internal_static_google_protobuf_FieldOptions_descriptor = descriptor18;
        internal_static_google_protobuf_FieldOptions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"Ctype", "Packed", "Jstype", "Lazy", "UnverifiedLazy", "Deprecated", "Weak", "DebugRedact", "Retention", "Targets", "EditionDefaults", "Features", "UninterpretedOption"});
        Descriptors.Descriptor descriptor19 = descriptor18.getNestedTypes().get(0);
        internal_static_google_protobuf_FieldOptions_EditionDefault_descriptor = descriptor19;
        internal_static_google_protobuf_FieldOptions_EditionDefault_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Edition", "Value"});
        Descriptors.Descriptor descriptor20 = getDescriptor().getMessageTypes().get(13);
        internal_static_google_protobuf_OneofOptions_descriptor = descriptor20;
        internal_static_google_protobuf_OneofOptions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"Features", "UninterpretedOption"});
        Descriptors.Descriptor descriptor21 = getDescriptor().getMessageTypes().get(14);
        internal_static_google_protobuf_EnumOptions_descriptor = descriptor21;
        internal_static_google_protobuf_EnumOptions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"AllowAlias", "Deprecated", "DeprecatedLegacyJsonFieldConflicts", "Features", "UninterpretedOption"});
        Descriptors.Descriptor descriptor22 = getDescriptor().getMessageTypes().get(15);
        internal_static_google_protobuf_EnumValueOptions_descriptor = descriptor22;
        internal_static_google_protobuf_EnumValueOptions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"Deprecated", "Features", "DebugRedact", "UninterpretedOption"});
        Descriptors.Descriptor descriptor23 = getDescriptor().getMessageTypes().get(16);
        internal_static_google_protobuf_ServiceOptions_descriptor = descriptor23;
        internal_static_google_protobuf_ServiceOptions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[]{"Features", "Deprecated", "UninterpretedOption"});
        Descriptors.Descriptor descriptor24 = getDescriptor().getMessageTypes().get(17);
        internal_static_google_protobuf_MethodOptions_descriptor = descriptor24;
        internal_static_google_protobuf_MethodOptions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[]{"Deprecated", "IdempotencyLevel", "Features", "UninterpretedOption"});
        Descriptors.Descriptor descriptor25 = getDescriptor().getMessageTypes().get(18);
        internal_static_google_protobuf_UninterpretedOption_descriptor = descriptor25;
        internal_static_google_protobuf_UninterpretedOption_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor25, new String[]{"Name", "IdentifierValue", "PositiveIntValue", "NegativeIntValue", "DoubleValue", "StringValue", "AggregateValue"});
        Descriptors.Descriptor descriptor26 = descriptor25.getNestedTypes().get(0);
        internal_static_google_protobuf_UninterpretedOption_NamePart_descriptor = descriptor26;
        internal_static_google_protobuf_UninterpretedOption_NamePart_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor26, new String[]{"NamePart", "IsExtension"});
        Descriptors.Descriptor descriptor27 = getDescriptor().getMessageTypes().get(19);
        internal_static_google_protobuf_FeatureSet_descriptor = descriptor27;
        internal_static_google_protobuf_FeatureSet_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor27, new String[]{"FieldPresence", "EnumType", "RepeatedFieldEncoding", "Utf8Validation", "MessageEncoding", "JsonFormat"});
        Descriptors.Descriptor descriptor28 = getDescriptor().getMessageTypes().get(20);
        internal_static_google_protobuf_FeatureSetDefaults_descriptor = descriptor28;
        internal_static_google_protobuf_FeatureSetDefaults_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor28, new String[]{"Defaults", "MinimumEdition", "MaximumEdition"});
        Descriptors.Descriptor descriptor29 = descriptor28.getNestedTypes().get(0);
        internal_static_google_protobuf_FeatureSetDefaults_FeatureSetEditionDefault_descriptor = descriptor29;
        internal_static_google_protobuf_FeatureSetDefaults_FeatureSetEditionDefault_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor29, new String[]{"Edition", "Features"});
        Descriptors.Descriptor descriptor30 = getDescriptor().getMessageTypes().get(21);
        internal_static_google_protobuf_SourceCodeInfo_descriptor = descriptor30;
        internal_static_google_protobuf_SourceCodeInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor30, new String[]{"Location"});
        Descriptors.Descriptor descriptor31 = descriptor30.getNestedTypes().get(0);
        internal_static_google_protobuf_SourceCodeInfo_Location_descriptor = descriptor31;
        internal_static_google_protobuf_SourceCodeInfo_Location_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor31, new String[]{"Path", "Span", "LeadingComments", "TrailingComments", "LeadingDetachedComments"});
        Descriptors.Descriptor descriptor32 = getDescriptor().getMessageTypes().get(22);
        internal_static_google_protobuf_GeneratedCodeInfo_descriptor = descriptor32;
        internal_static_google_protobuf_GeneratedCodeInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor32, new String[]{"Annotation"});
        Descriptors.Descriptor descriptor33 = descriptor32.getNestedTypes().get(0);
        internal_static_google_protobuf_GeneratedCodeInfo_Annotation_descriptor = descriptor33;
        internal_static_google_protobuf_GeneratedCodeInfo_Annotation_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor33, new String[]{"Path", "SourceFile", "Begin", "End", "Semantic"});
    }
}
