package com.google.protobuf;

import com.google.protobuf.MessageLite;

/* loaded from: classes2.dex */
public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {
    private static final ExtensionRegistryLite EMPTY_REGISTRY = ExtensionRegistryLite.getEmptyRegistry();

    private UninitializedMessageException newUninitializedMessageException(MessageType messagetype) {
        if (messagetype instanceof AbstractMessageLite) {
            return ((AbstractMessageLite) messagetype).newUninitializedMessageException();
        }
        return new UninitializedMessageException(messagetype);
    }

    private MessageType checkMessageInitialized(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw newUninitializedMessageException(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    public MessageType parsePartialFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        CodedInputStream newCodedInput = byteString.newCodedInput();
        MessageType messagetype = (MessageType) parsePartialFrom(newCodedInput, extensionRegistryLite);
        try {
            newCodedInput.checkLastTagWas(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return checkMessageInitialized(parsePartialFrom(byteString, extensionRegistryLite));
    }

    public MessageType parsePartialFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) {
        CodedInputStream newInstance = CodedInputStream.newInstance(bArr, i, i2);
        MessageType messagetype = (MessageType) parsePartialFrom(newInstance, extensionRegistryLite);
        try {
            newInstance.checkLastTagWas(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        }
    }

    public MessageType parseFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) {
        return checkMessageInitialized(parsePartialFrom(bArr, i, i2, extensionRegistryLite));
    }

    public MessageType parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return parseFrom(bArr, 0, bArr.length, extensionRegistryLite);
    }

    @Override // com.google.protobuf.Parser
    public MessageType parseFrom(byte[] bArr) {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }
}
