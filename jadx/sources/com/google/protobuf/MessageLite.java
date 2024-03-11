package com.google.protobuf;

/* loaded from: classes2.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    /* loaded from: classes2.dex */
    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite build();

        MessageLite buildPartial();

        Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        Builder mergeFrom(MessageLite messageLite);

        Builder mergeFrom(byte[] bArr);
    }

    Parser<? extends MessageLite> getParserForType();

    int getSerializedSize();

    Builder newBuilderForType();

    Builder toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeTo(CodedOutputStream codedOutputStream);
}
