package com.google.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.GeneratedMessageLite;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class GeneratedMessage extends AbstractMessage implements Serializable {
    private static final long serialVersionUID = 1;
    protected UnknownFieldSet unknownFields = UnknownFieldSet.getDefaultInstance();

    /* loaded from: classes2.dex */
    protected interface BuilderParent extends AbstractMessage.BuilderParent {
    }

    /* loaded from: classes2.dex */
    public interface ExtendableMessageOrBuilder<MessageType> extends MessageOrBuilder {
        @Override // com.google.protobuf.MessageOrBuilder, com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        Message getDefaultInstanceForType();
    }

    protected GeneratedMessage() {
    }

    /* loaded from: classes2.dex */
    public static abstract class Builder<BuilderType extends Builder<BuilderType>> extends AbstractMessage.Builder<BuilderType> {
        private BuilderParent builderParent;
        private UnknownFieldSet unknownFields;

        protected Builder() {
            this(null);
        }

        protected Builder(BuilderParent builderParent) {
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
            this.builderParent = builderParent;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public BuilderType mo2781clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.mergeFrom(buildPartial());
            return buildertype;
        }
    }

    protected Object writeReplace() {
        return new GeneratedMessageLite.SerializedForm(this);
    }
}
