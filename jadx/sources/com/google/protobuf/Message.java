package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.MessageLite;

/* loaded from: classes2.dex */
public interface Message extends MessageLite, MessageOrBuilder {

    /* loaded from: classes2.dex */
    public interface Builder extends MessageLite.Builder, MessageOrBuilder {
        Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        Message build();

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        Message buildPartial();

        Descriptors.Descriptor getDescriptorForType();

        Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor);

        Builder mergeFrom(ByteString byteString);

        Builder mergeFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite);

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        Builder mergeFrom(Message message);

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        Builder mergeFrom(byte[] bArr);

        Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor);

        Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        Builder setUnknownFields(UnknownFieldSet unknownFieldSet);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    Builder newBuilderForType();

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    Builder toBuilder();
}
