package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.FieldSet;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MessageReflection {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface MergeTarget {

        /* loaded from: classes2.dex */
        public enum ContainerType {
            MESSAGE,
            EXTENSION_SET
        }

        MergeTarget addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        ExtensionRegistry.ExtensionInfo findExtensionByNumber(ExtensionRegistry extensionRegistry, Descriptors.Descriptor descriptor, int i);

        ContainerType getContainerType();

        WireFormat.Utf8Validation getUtf8Validation(Descriptors.FieldDescriptor fieldDescriptor);

        boolean hasField(Descriptors.FieldDescriptor fieldDescriptor);

        void mergeGroup(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message);

        void mergeMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message);

        Object parseMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message);

        Object parseMessageFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message);

        MergeTarget setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);
    }

    MessageReflection() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void writeMessageTo(Message message, Map<Descriptors.FieldDescriptor, Object> map, CodedOutputStream codedOutputStream, boolean z) {
        boolean messageSetWireFormat = message.getDescriptorForType().getOptions().getMessageSetWireFormat();
        if (z) {
            TreeMap treeMap = new TreeMap(map);
            for (Descriptors.FieldDescriptor fieldDescriptor : message.getDescriptorForType().getFields()) {
                if (fieldDescriptor.isRequired() && !treeMap.containsKey(fieldDescriptor)) {
                    treeMap.put(fieldDescriptor, message.getField(fieldDescriptor));
                }
            }
            map = treeMap;
        }
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            if (messageSetWireFormat && key.isExtension() && key.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && !key.isRepeated()) {
                codedOutputStream.writeMessageSetExtension(key.getNumber(), (Message) value);
            } else {
                FieldSet.writeField(key, value, codedOutputStream);
            }
        }
        UnknownFieldSet unknownFields = message.getUnknownFields();
        if (messageSetWireFormat) {
            unknownFields.writeAsMessageSetTo(codedOutputStream);
        } else {
            unknownFields.writeTo(codedOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getSerializedSize(Message message, Map<Descriptors.FieldDescriptor, Object> map) {
        int serializedSize;
        int computeFieldSize;
        boolean messageSetWireFormat = message.getDescriptorForType().getOptions().getMessageSetWireFormat();
        int i = 0;
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            if (messageSetWireFormat && key.isExtension() && key.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && !key.isRepeated()) {
                computeFieldSize = CodedOutputStream.computeMessageSetExtensionSize(key.getNumber(), (Message) value);
            } else {
                computeFieldSize = FieldSet.computeFieldSize(key, value);
            }
            i += computeFieldSize;
        }
        UnknownFieldSet unknownFields = message.getUnknownFields();
        if (messageSetWireFormat) {
            serializedSize = unknownFields.getSerializedSizeAsMessageSet();
        } else {
            serializedSize = unknownFields.getSerializedSize();
        }
        return i + serializedSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isInitialized(MessageOrBuilder messageOrBuilder) {
        for (Descriptors.FieldDescriptor fieldDescriptor : messageOrBuilder.getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !messageOrBuilder.hasField(fieldDescriptor)) {
                return false;
            }
        }
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : messageOrBuilder.getAllFields().entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            if (key.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (key.isRepeated()) {
                    for (Message message : (List) entry.getValue()) {
                        if (!message.isInitialized()) {
                            return false;
                        }
                    }
                    continue;
                } else if (!((Message) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static String subMessagePrefix(String str, Descriptors.FieldDescriptor fieldDescriptor, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (fieldDescriptor.isExtension()) {
            sb.append('(');
            sb.append(fieldDescriptor.getFullName());
            sb.append(')');
        } else {
            sb.append(fieldDescriptor.getName());
        }
        if (i != -1) {
            sb.append('[');
            sb.append(i);
            sb.append(']');
        }
        sb.append('.');
        return sb.toString();
    }

    private static void findMissingFields(MessageOrBuilder messageOrBuilder, String str, List<String> list) {
        for (Descriptors.FieldDescriptor fieldDescriptor : messageOrBuilder.getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !messageOrBuilder.hasField(fieldDescriptor)) {
                list.add(str + fieldDescriptor.getName());
            }
        }
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : messageOrBuilder.getAllFields().entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            if (key.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (key.isRepeated()) {
                    int i = 0;
                    for (MessageOrBuilder messageOrBuilder2 : (List) value) {
                        findMissingFields(messageOrBuilder2, subMessagePrefix(str, key, i), list);
                        i++;
                    }
                } else if (messageOrBuilder.hasField(key)) {
                    findMissingFields((MessageOrBuilder) value, subMessagePrefix(str, key, -1), list);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> findMissingFields(MessageOrBuilder messageOrBuilder) {
        ArrayList arrayList = new ArrayList();
        findMissingFields(messageOrBuilder, "", arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class BuilderAdapter implements MergeTarget {
        private final Message.Builder builder;
        private boolean hasNestedBuilders = true;

        public BuilderAdapter(Message.Builder builder) {
            this.builder = builder;
        }

        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.builder.getField(fieldDescriptor);
        }

        private Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            if (this.hasNestedBuilders) {
                try {
                    return this.builder.getFieldBuilder(fieldDescriptor);
                } catch (UnsupportedOperationException unused) {
                    this.hasNestedBuilders = false;
                    return null;
                }
            }
            return null;
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.builder.hasField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public MergeTarget setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (!fieldDescriptor.isRepeated() && (obj instanceof MessageLite.Builder)) {
                if (obj != getFieldBuilder(fieldDescriptor)) {
                    this.builder.setField(fieldDescriptor, ((MessageLite.Builder) obj).buildPartial());
                }
                return this;
            }
            this.builder.setField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public MergeTarget addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (obj instanceof MessageLite.Builder) {
                obj = ((MessageLite.Builder) obj).buildPartial();
            }
            this.builder.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public MergeTarget.ContainerType getContainerType() {
            return MergeTarget.ContainerType.MESSAGE;
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public ExtensionRegistry.ExtensionInfo findExtensionByNumber(ExtensionRegistry extensionRegistry, Descriptors.Descriptor descriptor, int i) {
            return extensionRegistry.findImmutableExtensionByNumber(descriptor, i);
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public Object parseMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message.Builder newBuilderForField;
            Message message2;
            if (message != null) {
                newBuilderForField = message.newBuilderForType();
            } else {
                newBuilderForField = this.builder.newBuilderForField(fieldDescriptor);
            }
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) getField(fieldDescriptor)) != null) {
                newBuilderForField.mergeFrom(message2);
            }
            codedInputStream.readMessage(newBuilderForField, extensionRegistryLite);
            return newBuilderForField.buildPartial();
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public Object parseMessageFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message.Builder newBuilderForField;
            Message message2;
            if (message != null) {
                newBuilderForField = message.newBuilderForType();
            } else {
                newBuilderForField = this.builder.newBuilderForField(fieldDescriptor);
            }
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) getField(fieldDescriptor)) != null) {
                newBuilderForField.mergeFrom(message2);
            }
            newBuilderForField.mergeFrom(byteString, extensionRegistryLite);
            return newBuilderForField.buildPartial();
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public void mergeGroup(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message.Builder newMessageFieldInstance;
            if (!fieldDescriptor.isRepeated()) {
                if (hasField(fieldDescriptor)) {
                    Message.Builder fieldBuilder = getFieldBuilder(fieldDescriptor);
                    if (fieldBuilder != null) {
                        codedInputStream.readGroup(fieldDescriptor.getNumber(), fieldBuilder, extensionRegistryLite);
                        return;
                    } else {
                        newMessageFieldInstance = newMessageFieldInstance(fieldDescriptor, message);
                        newMessageFieldInstance.mergeFrom((Message) getField(fieldDescriptor));
                    }
                } else {
                    newMessageFieldInstance = newMessageFieldInstance(fieldDescriptor, message);
                }
                codedInputStream.readGroup(fieldDescriptor.getNumber(), newMessageFieldInstance, extensionRegistryLite);
                setField(fieldDescriptor, newMessageFieldInstance.buildPartial());
                return;
            }
            Message.Builder newMessageFieldInstance2 = newMessageFieldInstance(fieldDescriptor, message);
            codedInputStream.readGroup(fieldDescriptor.getNumber(), newMessageFieldInstance2, extensionRegistryLite);
            addRepeatedField(fieldDescriptor, newMessageFieldInstance2.buildPartial());
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public void mergeMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message.Builder newMessageFieldInstance;
            if (!fieldDescriptor.isRepeated()) {
                if (hasField(fieldDescriptor)) {
                    Message.Builder fieldBuilder = getFieldBuilder(fieldDescriptor);
                    if (fieldBuilder != null) {
                        codedInputStream.readMessage(fieldBuilder, extensionRegistryLite);
                        return;
                    } else {
                        newMessageFieldInstance = newMessageFieldInstance(fieldDescriptor, message);
                        newMessageFieldInstance.mergeFrom((Message) getField(fieldDescriptor));
                    }
                } else {
                    newMessageFieldInstance = newMessageFieldInstance(fieldDescriptor, message);
                }
                codedInputStream.readMessage(newMessageFieldInstance, extensionRegistryLite);
                setField(fieldDescriptor, newMessageFieldInstance.buildPartial());
                return;
            }
            Message.Builder newMessageFieldInstance2 = newMessageFieldInstance(fieldDescriptor, message);
            codedInputStream.readMessage(newMessageFieldInstance2, extensionRegistryLite);
            addRepeatedField(fieldDescriptor, newMessageFieldInstance2.buildPartial());
        }

        private Message.Builder newMessageFieldInstance(Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            if (message != null) {
                return message.newBuilderForType();
            }
            return this.builder.newBuilderForField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public WireFormat.Utf8Validation getUtf8Validation(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.needsUtf8Check()) {
                return WireFormat.Utf8Validation.STRICT;
            }
            if (!fieldDescriptor.isRepeated() && (this.builder instanceof GeneratedMessage.Builder)) {
                return WireFormat.Utf8Validation.LAZY;
            }
            return WireFormat.Utf8Validation.LOOSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class ExtensionBuilderAdapter implements MergeTarget {
        private final FieldSet.Builder<Descriptors.FieldDescriptor> extensions;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ExtensionBuilderAdapter(FieldSet.Builder<Descriptors.FieldDescriptor> builder) {
            this.extensions = builder;
        }

        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.extensions.getField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.extensions.hasField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public MergeTarget setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.extensions.setField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public MergeTarget addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.extensions.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public MergeTarget.ContainerType getContainerType() {
            return MergeTarget.ContainerType.EXTENSION_SET;
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public ExtensionRegistry.ExtensionInfo findExtensionByNumber(ExtensionRegistry extensionRegistry, Descriptors.Descriptor descriptor, int i) {
            return extensionRegistry.findImmutableExtensionByNumber(descriptor, i);
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public Object parseMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message message2;
            Message.Builder newBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) getField(fieldDescriptor)) != null) {
                newBuilderForType.mergeFrom(message2);
            }
            codedInputStream.readMessage(newBuilderForType, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public void mergeGroup(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            MessageLite.Builder builder;
            if (!fieldDescriptor.isRepeated()) {
                if (hasField(fieldDescriptor)) {
                    Object fieldAllowBuilders = this.extensions.getFieldAllowBuilders(fieldDescriptor);
                    if (fieldAllowBuilders instanceof MessageLite.Builder) {
                        builder = (MessageLite.Builder) fieldAllowBuilders;
                    } else {
                        builder = ((MessageLite) fieldAllowBuilders).toBuilder();
                        this.extensions.setField(fieldDescriptor, builder);
                    }
                    codedInputStream.readGroup(fieldDescriptor.getNumber(), builder, extensionRegistryLite);
                    return;
                }
                Message.Builder newBuilderForType = message.newBuilderForType();
                codedInputStream.readGroup(fieldDescriptor.getNumber(), newBuilderForType, extensionRegistryLite);
                setField(fieldDescriptor, newBuilderForType);
                return;
            }
            Message.Builder newBuilderForType2 = message.newBuilderForType();
            codedInputStream.readGroup(fieldDescriptor.getNumber(), newBuilderForType2, extensionRegistryLite);
            addRepeatedField(fieldDescriptor, newBuilderForType2.buildPartial());
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public void mergeMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            MessageLite.Builder builder;
            if (!fieldDescriptor.isRepeated()) {
                if (hasField(fieldDescriptor)) {
                    Object fieldAllowBuilders = this.extensions.getFieldAllowBuilders(fieldDescriptor);
                    if (fieldAllowBuilders instanceof MessageLite.Builder) {
                        builder = (MessageLite.Builder) fieldAllowBuilders;
                    } else {
                        builder = ((MessageLite) fieldAllowBuilders).toBuilder();
                        this.extensions.setField(fieldDescriptor, builder);
                    }
                    codedInputStream.readMessage(builder, extensionRegistryLite);
                    return;
                }
                Message.Builder newBuilderForType = message.newBuilderForType();
                codedInputStream.readMessage(newBuilderForType, extensionRegistryLite);
                setField(fieldDescriptor, newBuilderForType);
                return;
            }
            Message.Builder newBuilderForType2 = message.newBuilderForType();
            codedInputStream.readMessage(newBuilderForType2, extensionRegistryLite);
            addRepeatedField(fieldDescriptor, newBuilderForType2.buildPartial());
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public Object parseMessageFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message message2;
            Message.Builder newBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) getField(fieldDescriptor)) != null) {
                newBuilderForType.mergeFrom(message2);
            }
            newBuilderForType.mergeFrom(byteString, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public WireFormat.Utf8Validation getUtf8Validation(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.needsUtf8Check()) {
                return WireFormat.Utf8Validation.STRICT;
            }
            return WireFormat.Utf8Validation.LOOSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean mergeFieldFrom(com.google.protobuf.CodedInputStream r7, com.google.protobuf.UnknownFieldSet.Builder r8, com.google.protobuf.ExtensionRegistryLite r9, com.google.protobuf.Descriptors.Descriptor r10, com.google.protobuf.MessageReflection.MergeTarget r11, int r12) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageReflection.mergeFieldFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.UnknownFieldSet$Builder, com.google.protobuf.ExtensionRegistryLite, com.google.protobuf.Descriptors$Descriptor, com.google.protobuf.MessageReflection$MergeTarget, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.MessageReflection$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void mergeMessageFrom(Message.Builder builder, UnknownFieldSet.Builder builder2, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        BuilderAdapter builderAdapter = new BuilderAdapter(builder);
        Descriptors.Descriptor descriptorForType = builder.getDescriptorForType();
        do {
            readTag = codedInputStream.readTag();
            if (readTag == 0) {
                return;
            }
        } while (mergeFieldFrom(codedInputStream, builder2, extensionRegistryLite, descriptorForType, builderAdapter, readTag));
    }

    private static void mergeMessageSetExtensionFromCodedStream(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, Descriptors.Descriptor descriptor, MergeTarget mergeTarget) {
        int i = 0;
        ByteString byteString = null;
        ExtensionRegistry.ExtensionInfo extensionInfo = null;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                i = codedInputStream.readUInt32();
                if (i != 0 && (extensionRegistryLite instanceof ExtensionRegistry)) {
                    extensionInfo = mergeTarget.findExtensionByNumber((ExtensionRegistry) extensionRegistryLite, descriptor, i);
                }
            } else if (readTag == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (i != 0 && extensionInfo != null && ExtensionRegistryLite.isEagerlyParseMessageSets()) {
                    eagerlyMergeMessageSetExtension(codedInputStream, extensionInfo, extensionRegistryLite, mergeTarget);
                    byteString = null;
                } else {
                    byteString = codedInputStream.readBytes();
                }
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(WireFormat.MESSAGE_SET_ITEM_END_TAG);
        if (byteString == null || i == 0) {
            return;
        }
        if (extensionInfo != null) {
            mergeMessageSetExtensionFromBytes(byteString, extensionInfo, extensionRegistryLite, mergeTarget);
        } else if (builder != null) {
            builder.mergeField(i, UnknownFieldSet.Field.newBuilder().addLengthDelimited(byteString).build());
        }
    }

    private static void mergeMessageSetExtensionFromBytes(ByteString byteString, ExtensionRegistry.ExtensionInfo extensionInfo, ExtensionRegistryLite extensionRegistryLite, MergeTarget mergeTarget) {
        Descriptors.FieldDescriptor fieldDescriptor = extensionInfo.descriptor;
        if (mergeTarget.hasField(fieldDescriptor) || ExtensionRegistryLite.isEagerlyParseMessageSets()) {
            mergeTarget.setField(fieldDescriptor, mergeTarget.parseMessageFromBytes(byteString, extensionRegistryLite, fieldDescriptor, extensionInfo.defaultInstance));
        } else {
            mergeTarget.setField(fieldDescriptor, new LazyField(extensionInfo.defaultInstance, extensionRegistryLite, byteString));
        }
    }

    private static void eagerlyMergeMessageSetExtension(CodedInputStream codedInputStream, ExtensionRegistry.ExtensionInfo extensionInfo, ExtensionRegistryLite extensionRegistryLite, MergeTarget mergeTarget) {
        Descriptors.FieldDescriptor fieldDescriptor = extensionInfo.descriptor;
        mergeTarget.setField(fieldDescriptor, mergeTarget.parseMessage(codedInputStream, extensionRegistryLite, fieldDescriptor, extensionInfo.defaultInstance));
    }
}
