package com.google.protobuf;

/* loaded from: classes2.dex */
public interface Parser<MessageType> {
    MessageType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite);

    MessageType parseFrom(byte[] bArr);

    MessageType parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
}
