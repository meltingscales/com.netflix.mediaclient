package androidx.datastore.preferences.protobuf;

/* loaded from: classes2.dex */
public interface Parser<MessageType> {
    MessageType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite);

    MessageType parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
}
