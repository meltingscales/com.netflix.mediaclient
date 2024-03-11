package com.google.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DynamicMessage;
import com.google.protobuf.FieldSet;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.LazyField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageReflection;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.WireFormat;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class GeneratedMessageV3 extends AbstractMessage implements Serializable {
    protected static boolean alwaysUseFieldBuilders = false;
    private static final long serialVersionUID = 1;
    protected UnknownFieldSet unknownFields;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public interface BuilderParent extends AbstractMessage.BuilderParent {
    }

    /* loaded from: classes2.dex */
    public interface ExtendableMessageOrBuilder<MessageT extends ExtendableMessage<MessageT>> extends MessageOrBuilder {
        @Override // com.google.protobuf.MessageOrBuilder, com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        Message getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.MessageOrBuilder
    public UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    protected abstract FieldAccessorTable internalGetFieldAccessorTable();

    protected abstract Message.Builder newBuilderForType(BuilderParent builderParent);

    /* JADX INFO: Access modifiers changed from: protected */
    public GeneratedMessageV3() {
        this.unknownFields = UnknownFieldSet.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public GeneratedMessageV3(Builder<?> builder) {
        this.unknownFields = builder.getUnknownFields();
    }

    @Override // com.google.protobuf.MessageLite
    public Parser<? extends GeneratedMessageV3> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // com.google.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return internalGetFieldAccessorTable().descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Descriptors.FieldDescriptor, Object> getAllFieldsMutable(boolean z) {
        TreeMap treeMap = new TreeMap();
        List<Descriptors.FieldDescriptor> fields = internalGetFieldAccessorTable().descriptor.getFields();
        int i = 0;
        while (i < fields.size()) {
            Descriptors.FieldDescriptor fieldDescriptor = fields.get(i);
            Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
            if (containingOneof != null) {
                i += containingOneof.getFieldCount() - 1;
                if (hasOneof(containingOneof)) {
                    fieldDescriptor = getOneofFieldDescriptor(containingOneof);
                    if (!z && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.STRING) {
                        treeMap.put(fieldDescriptor, getFieldRaw(fieldDescriptor));
                    } else {
                        treeMap.put(fieldDescriptor, getField(fieldDescriptor));
                    }
                    i++;
                } else {
                    i++;
                }
            } else {
                if (fieldDescriptor.isRepeated()) {
                    List list = (List) getField(fieldDescriptor);
                    if (!list.isEmpty()) {
                        treeMap.put(fieldDescriptor, list);
                    }
                } else {
                    if (!hasField(fieldDescriptor)) {
                    }
                    if (!z) {
                    }
                    treeMap.put(fieldDescriptor, getField(fieldDescriptor));
                }
                i++;
            }
        }
        return treeMap;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public boolean isInitialized() {
        for (Descriptors.FieldDescriptor fieldDescriptor : getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !hasField(fieldDescriptor)) {
                return false;
            }
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (fieldDescriptor.isRepeated()) {
                    for (Message message : (List) getField(fieldDescriptor)) {
                        if (!message.isInitialized()) {
                            return false;
                        }
                    }
                    continue;
                } else if (hasField(fieldDescriptor) && !((Message) getField(fieldDescriptor)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.google.protobuf.MessageOrBuilder
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return Collections.unmodifiableMap(getAllFieldsMutable(false));
    }

    Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
        return Collections.unmodifiableMap(getAllFieldsMutable(true));
    }

    @Override // com.google.protobuf.AbstractMessage
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return internalGetFieldAccessorTable().getOneof(oneofDescriptor).has(this);
    }

    @Override // com.google.protobuf.AbstractMessage
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        return internalGetFieldAccessorTable().getOneof(oneofDescriptor).get(this);
    }

    @Override // com.google.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).has(this);
    }

    @Override // com.google.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).get(this);
    }

    Object getFieldRaw(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).getRaw(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Internal.IntList emptyIntList() {
        return IntArrayList.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <ListT extends Internal.ProtobufList<?>> ListT makeMutableCopy(ListT listt) {
        return (ListT) makeMutableCopy(listt, 0);
    }

    protected static <ListT extends Internal.ProtobufList<?>> ListT makeMutableCopy(ListT listt, int i) {
        int size = listt.size();
        if (i <= size) {
            i = size * 2;
        }
        if (i <= 0) {
            i = 10;
        }
        return (ListT) listt.mutableCopyWithCapacity(i);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        MessageReflection.writeMessageTo(this, getAllFieldsRaw(), codedOutputStream, false);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int serializedSize = MessageReflection.getSerializedSize(this, getAllFieldsRaw());
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    /* loaded from: classes2.dex */
    protected static final class UnusedPrivateParameter {
        static final UnusedPrivateParameter INSTANCE = new UnusedPrivateParameter();

        private UnusedPrivateParameter() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object newInstance(UnusedPrivateParameter unusedPrivateParameter) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    @Override // com.google.protobuf.AbstractMessage
    protected Message.Builder newBuilderForType(final AbstractMessage.BuilderParent builderParent) {
        return newBuilderForType(new BuilderParent() { // from class: com.google.protobuf.GeneratedMessageV3.1
            @Override // com.google.protobuf.AbstractMessage.BuilderParent
            public void markDirty() {
                builderParent.markDirty();
            }
        });
    }

    /* loaded from: classes2.dex */
    public static abstract class Builder<BuilderT extends Builder<BuilderT>> extends AbstractMessage.Builder<BuilderT> {
        private BuilderParent builderParent;
        private boolean isClean;
        private Builder<BuilderT>.BuilderParentImpl meAsParent;
        private Object unknownFieldsOrBuilder;

        protected abstract FieldAccessorTable internalGetFieldAccessorTable();

        /* JADX INFO: Access modifiers changed from: protected */
        public boolean isClean() {
            return this.isClean;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder
        protected void markClean() {
            this.isClean = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Builder() {
            this(null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Builder(BuilderParent builderParent) {
            this.unknownFieldsOrBuilder = UnknownFieldSet.getDefaultInstance();
            this.builderParent = builderParent;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void onBuilt() {
            if (this.builderParent != null) {
                markClean();
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public BuilderT mo2781clone() {
            BuilderT buildert = (BuilderT) getDefaultInstanceForType().newBuilderForType();
            buildert.mergeFrom(buildPartial());
            return buildert;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internalGetFieldAccessorTable().descriptor;
        }

        @Override // com.google.protobuf.MessageOrBuilder
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            return Collections.unmodifiableMap(getAllFieldsMutable());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<Descriptors.FieldDescriptor, Object> getAllFieldsMutable() {
            TreeMap treeMap = new TreeMap();
            List<Descriptors.FieldDescriptor> fields = internalGetFieldAccessorTable().descriptor.getFields();
            int i = 0;
            while (i < fields.size()) {
                Descriptors.FieldDescriptor fieldDescriptor = fields.get(i);
                Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
                if (containingOneof != null) {
                    i += containingOneof.getFieldCount() - 1;
                    if (hasOneof(containingOneof)) {
                        fieldDescriptor = getOneofFieldDescriptor(containingOneof);
                        treeMap.put(fieldDescriptor, getField(fieldDescriptor));
                        i++;
                    } else {
                        i++;
                    }
                } else {
                    if (fieldDescriptor.isRepeated()) {
                        List list = (List) getField(fieldDescriptor);
                        if (!list.isEmpty()) {
                            treeMap.put(fieldDescriptor, list);
                        }
                    } else {
                        if (!hasField(fieldDescriptor)) {
                        }
                        treeMap.put(fieldDescriptor, getField(fieldDescriptor));
                    }
                    i++;
                }
            }
            return treeMap;
        }

        @Override // com.google.protobuf.Message.Builder
        public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).newBuilder();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).getBuilder(this);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder
        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return internalGetFieldAccessorTable().getOneof(oneofDescriptor).has((Builder<?>) this);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            return internalGetFieldAccessorTable().getOneof(oneofDescriptor).get((Builder<?>) this);
        }

        @Override // com.google.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).has((Builder<?>) this);
        }

        @Override // com.google.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            Object obj = internalGetFieldAccessorTable().getField(fieldDescriptor).get((Builder<?>) this);
            return fieldDescriptor.isRepeated() ? Collections.unmodifiableList((List) obj) : obj;
        }

        public BuilderT setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            internalGetFieldAccessorTable().getField(fieldDescriptor).set(this, obj);
            return this;
        }

        public BuilderT addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            internalGetFieldAccessorTable().getField(fieldDescriptor).addRepeated(this, obj);
            return this;
        }

        private BuilderT setUnknownFieldsInternal(UnknownFieldSet unknownFieldSet) {
            this.unknownFieldsOrBuilder = unknownFieldSet;
            onChanged();
            return this;
        }

        public BuilderT setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return setUnknownFieldsInternal(unknownFieldSet);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder
        public BuilderT mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            if (UnknownFieldSet.getDefaultInstance().equals(unknownFieldSet)) {
                return this;
            }
            if (UnknownFieldSet.getDefaultInstance().equals(this.unknownFieldsOrBuilder)) {
                this.unknownFieldsOrBuilder = unknownFieldSet;
                onChanged();
                return this;
            }
            getUnknownFieldSetBuilder().mergeFrom(unknownFieldSet);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder
        public boolean isInitialized() {
            for (Descriptors.FieldDescriptor fieldDescriptor : getDescriptorForType().getFields()) {
                if (fieldDescriptor.isRequired() && !hasField(fieldDescriptor)) {
                    return false;
                }
                if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    if (fieldDescriptor.isRepeated()) {
                        for (Message message : (List) getField(fieldDescriptor)) {
                            if (!message.isInitialized()) {
                                return false;
                            }
                        }
                        continue;
                    } else if (hasField(fieldDescriptor) && !((Message) getField(fieldDescriptor)).isInitialized()) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            Object obj = this.unknownFieldsOrBuilder;
            if (obj instanceof UnknownFieldSet) {
                return (UnknownFieldSet) obj;
            }
            return ((UnknownFieldSet.Builder) obj).buildPartial();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public boolean parseUnknownField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            if (codedInputStream.shouldDiscardUnknownFields()) {
                return codedInputStream.skipField(i);
            }
            return getUnknownFieldSetBuilder().mergeFieldFrom(i, codedInputStream);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void mergeUnknownVarintField(int i, int i2) {
            getUnknownFieldSetBuilder().mergeVarintField(i, i2);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder
        protected UnknownFieldSet.Builder getUnknownFieldSetBuilder() {
            Object obj = this.unknownFieldsOrBuilder;
            if (obj instanceof UnknownFieldSet) {
                this.unknownFieldsOrBuilder = ((UnknownFieldSet) obj).toBuilder();
            }
            onChanged();
            return (UnknownFieldSet.Builder) this.unknownFieldsOrBuilder;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder
        protected void setUnknownFieldSetBuilder(UnknownFieldSet.Builder builder) {
            this.unknownFieldsOrBuilder = builder;
            onChanged();
        }

        /* loaded from: classes2.dex */
        class BuilderParentImpl implements BuilderParent {
            private BuilderParentImpl() {
            }

            @Override // com.google.protobuf.AbstractMessage.BuilderParent
            public void markDirty() {
                Builder.this.onChanged();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public BuilderParent getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new BuilderParentImpl();
            }
            return this.meAsParent;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void onChanged() {
            BuilderParent builderParent;
            if (!this.isClean || (builderParent = this.builderParent) == null) {
                return;
            }
            builderParent.markDirty();
            this.isClean = false;
        }

        protected MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
            return internalGetMapField(i);
        }

        @Deprecated
        protected MapField internalGetMapField(int i) {
            throw new IllegalArgumentException("No map fields found in " + getClass().getName());
        }

        protected MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int i) {
            return internalGetMutableMapField(i);
        }

        @Deprecated
        protected MapField internalGetMutableMapField(int i) {
            throw new IllegalArgumentException("No map fields found in " + getClass().getName());
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ExtendableMessage<MessageT extends ExtendableMessage<MessageT>> extends GeneratedMessageV3 implements ExtendableMessageOrBuilder<MessageT> {
        private static final long serialVersionUID = 1;
        final FieldSet<Descriptors.FieldDescriptor> extensions;

        /* JADX INFO: Access modifiers changed from: protected */
        public ExtendableMessage() {
            this.extensions = FieldSet.newFieldSet();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public ExtendableMessage(ExtendableBuilder<MessageT, ?> extendableBuilder) {
            super(extendableBuilder);
            this.extensions = extendableBuilder.buildExtensions();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public boolean isInitialized() {
            return super.isInitialized() && extensionsAreInitialized();
        }

        /* loaded from: classes2.dex */
        protected class ExtensionWriter {
            private final Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> iter;
            private final boolean messageSetWireFormat;
            private Map.Entry<Descriptors.FieldDescriptor, Object> next;

            private ExtensionWriter(boolean z) {
                Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> it = ExtendableMessage.this.extensions.iterator();
                this.iter = it;
                if (it.hasNext()) {
                    this.next = it.next();
                }
                this.messageSetWireFormat = z;
            }

            public void writeUntil(int i, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry<Descriptors.FieldDescriptor, Object> entry = this.next;
                    if (entry == null || entry.getKey().getNumber() >= i) {
                        return;
                    }
                    Descriptors.FieldDescriptor key = this.next.getKey();
                    if (this.messageSetWireFormat && key.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !key.isRepeated()) {
                        if (this.next instanceof LazyField.LazyEntry) {
                            codedOutputStream.writeRawMessageSetExtension(key.getNumber(), ((LazyField.LazyEntry) this.next).getField().toByteString());
                        } else {
                            codedOutputStream.writeMessageSetExtension(key.getNumber(), (Message) this.next.getValue());
                        }
                    } else {
                        FieldSet.writeField(key, this.next.getValue(), codedOutputStream);
                    }
                    this.next = this.iter.hasNext() ? this.iter.next() : null;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public ExtendableMessage<MessageT>.ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Map<Descriptors.FieldDescriptor, Object> getExtensionFields() {
            return this.extensions.getAllFields();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                return this.extensions.hasField(fieldDescriptor);
            }
            return super.hasField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                Object field = this.extensions.getField(fieldDescriptor);
                if (field == null) {
                    if (fieldDescriptor.isRepeated()) {
                        return Collections.emptyList();
                    }
                    if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                        return DynamicMessage.getDefaultInstance(fieldDescriptor.getMessageType());
                    }
                    return fieldDescriptor.getDefaultValue();
                }
                return field;
            }
            return super.getField(fieldDescriptor);
        }

        private void verifyContainingType(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ExtendableBuilder<MessageT extends ExtendableMessage<MessageT>, BuilderT extends ExtendableBuilder<MessageT, BuilderT>> extends Builder<BuilderT> implements ExtendableMessageOrBuilder<MessageT> {
        private FieldSet.Builder<Descriptors.FieldDescriptor> extensions;

        /* JADX INFO: Access modifiers changed from: protected */
        public ExtendableBuilder() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public ExtendableBuilder(BuilderParent builderParent) {
            super(builderParent);
        }

        private void ensureExtensionsIsMutable() {
            if (this.extensions == null) {
                this.extensions = FieldSet.newBuilder();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public boolean extensionsAreInitialized() {
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            return builder == null || builder.isInitialized();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FieldSet<Descriptors.FieldDescriptor> buildExtensions() {
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            if (builder == null) {
                return FieldSet.emptySet();
            }
            return builder.buildPartial();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public boolean isInitialized() {
            return super.isInitialized() && extensionsAreInitialized();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageOrBuilder
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable();
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            if (builder != null) {
                allFieldsMutable.putAll(builder.getAllFields());
            }
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
                Object field = builder == null ? null : builder.getField(fieldDescriptor);
                if (field == null) {
                    if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                        return DynamicMessage.getDefaultInstance(fieldDescriptor.getMessageType());
                    }
                    return fieldDescriptor.getDefaultValue();
                }
                return field;
            }
            return super.getField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
                }
                ensureExtensionsIsMutable();
                Object fieldAllowBuilders = this.extensions.getFieldAllowBuilders(fieldDescriptor);
                if (fieldAllowBuilders == null) {
                    DynamicMessage.Builder newBuilder = DynamicMessage.newBuilder(fieldDescriptor.getMessageType());
                    this.extensions.setField(fieldDescriptor, newBuilder);
                    onChanged();
                    return newBuilder;
                } else if (fieldAllowBuilders instanceof Message.Builder) {
                    return (Message.Builder) fieldAllowBuilders;
                } else {
                    if (fieldAllowBuilders instanceof Message) {
                        Message.Builder builder = ((Message) fieldAllowBuilders).toBuilder();
                        this.extensions.setField(fieldDescriptor, builder);
                        onChanged();
                        return builder;
                    }
                    throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
                }
            }
            return super.getFieldBuilder(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
                return builder != null && builder.hasField(fieldDescriptor);
            }
            return super.hasField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public BuilderT setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                ensureExtensionsIsMutable();
                this.extensions.setField(fieldDescriptor, obj);
                onChanged();
                return this;
            }
            return (BuilderT) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public BuilderT addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (fieldDescriptor.isExtension()) {
                verifyContainingType(fieldDescriptor);
                ensureExtensionsIsMutable();
                this.extensions.addRepeatedField(fieldDescriptor, obj);
                onChanged();
                return this;
            }
            return (BuilderT) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.isExtension()) {
                return DynamicMessage.newBuilder(fieldDescriptor.getMessageType());
            }
            return super.newBuilderForField(fieldDescriptor);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void mergeExtensionFields(ExtendableMessage<?> extendableMessage) {
            if (extendableMessage.extensions != null) {
                ensureExtensionsIsMutable();
                this.extensions.mergeFrom(extendableMessage.extensions);
                onChanged();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public boolean parseUnknownField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            ensureExtensionsIsMutable();
            return MessageReflection.mergeFieldFrom(codedInputStream, codedInputStream.shouldDiscardUnknownFields() ? null : getUnknownFieldSetBuilder(), extensionRegistryLite, getDescriptorForType(), new MessageReflection.ExtensionBuilderAdapter(this.extensions), i);
        }

        private void verifyContainingType(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method getMethodOrDie(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new IllegalStateException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
        return internalGetMapField(i);
    }

    @Deprecated
    protected MapField internalGetMapField(int i) {
        throw new IllegalArgumentException("No map fields found in " + getClass().getName());
    }

    /* loaded from: classes2.dex */
    public static final class FieldAccessorTable {
        private String[] camelCaseNames;
        private final Descriptors.Descriptor descriptor;
        private final FieldAccessor[] fields;
        private volatile boolean initialized = false;
        private final OneofAccessor[] oneofs;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public interface FieldAccessor {
            void addRepeated(Builder<?> builder, Object obj);

            Object get(Builder<?> builder);

            Object get(GeneratedMessageV3 generatedMessageV3);

            Message.Builder getBuilder(Builder<?> builder);

            Object getRaw(GeneratedMessageV3 generatedMessageV3);

            boolean has(Builder<?> builder);

            boolean has(GeneratedMessageV3 generatedMessageV3);

            Message.Builder newBuilder();

            void set(Builder<?> builder, Object obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public interface OneofAccessor {
            Descriptors.FieldDescriptor get(Builder<?> builder);

            Descriptors.FieldDescriptor get(GeneratedMessageV3 generatedMessageV3);

            boolean has(Builder<?> builder);

            boolean has(GeneratedMessageV3 generatedMessageV3);
        }

        public FieldAccessorTable(Descriptors.Descriptor descriptor, String[] strArr) {
            this.descriptor = descriptor;
            this.camelCaseNames = strArr;
            this.fields = new FieldAccessor[descriptor.getFields().size()];
            this.oneofs = new OneofAccessor[descriptor.getOneofs().size()];
        }

        public FieldAccessorTable ensureFieldAccessorsInitialized(Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2) {
            if (this.initialized) {
                return this;
            }
            synchronized (this) {
                if (this.initialized) {
                    return this;
                }
                int length = this.fields.length;
                int i = 0;
                while (true) {
                    String str = null;
                    if (i >= length) {
                        break;
                    }
                    Descriptors.FieldDescriptor fieldDescriptor = this.descriptor.getFields().get(i);
                    if (fieldDescriptor.getContainingOneof() != null) {
                        int index = fieldDescriptor.getContainingOneof().getIndex() + length;
                        String[] strArr = this.camelCaseNames;
                        if (index < strArr.length) {
                            str = strArr[index];
                        }
                    }
                    String str2 = str;
                    if (fieldDescriptor.isRepeated()) {
                        if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                            if (fieldDescriptor.isMapField()) {
                                this.fields[i] = new MapFieldAccessor(fieldDescriptor, cls);
                            } else {
                                this.fields[i] = new RepeatedMessageFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2);
                            }
                        } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                            this.fields[i] = new RepeatedEnumFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2);
                        } else {
                            this.fields[i] = new RepeatedFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2);
                        }
                    } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                        this.fields[i] = new SingularMessageFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2, str2);
                    } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                        this.fields[i] = new SingularEnumFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2, str2);
                    } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.STRING) {
                        this.fields[i] = new SingularStringFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2, str2);
                    } else {
                        this.fields[i] = new SingularFieldAccessor(fieldDescriptor, this.camelCaseNames[i], cls, cls2, str2);
                    }
                    i++;
                }
                for (int i2 = 0; i2 < this.descriptor.getOneofs().size(); i2++) {
                    if (i2 < this.descriptor.getRealOneofs().size()) {
                        this.oneofs[i2] = new RealOneofAccessor(this.descriptor, i2, this.camelCaseNames[i2 + length], cls, cls2);
                    } else {
                        this.oneofs[i2] = new SyntheticOneofAccessor(this.descriptor, i2);
                    }
                }
                this.initialized = true;
                this.camelCaseNames = null;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FieldAccessor getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != this.descriptor) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
            if (fieldDescriptor.isExtension()) {
                throw new IllegalArgumentException("This type does not have extensions.");
            }
            return this.fields[fieldDescriptor.getIndex()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OneofAccessor getOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            if (oneofDescriptor.getContainingType() != this.descriptor) {
                throw new IllegalArgumentException("OneofDescriptor does not match message type.");
            }
            return this.oneofs[oneofDescriptor.getIndex()];
        }

        /* loaded from: classes2.dex */
        static class RealOneofAccessor implements OneofAccessor {
            private final Method caseMethod;
            private final Method caseMethodBuilder;
            private final Method clearMethod;
            private final Descriptors.Descriptor descriptor;

            RealOneofAccessor(Descriptors.Descriptor descriptor, int i, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2) {
                this.descriptor = descriptor;
                this.caseMethod = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "Case", new Class[0]);
                this.caseMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Case", new Class[0]);
                StringBuilder sb = new StringBuilder();
                sb.append("clear");
                sb.append(str);
                this.clearMethod = GeneratedMessageV3.getMethodOrDie(cls2, sb.toString(), new Class[0]);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                return ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethod, generatedMessageV3, new Object[0])).getNumber() != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public boolean has(Builder<?> builder) {
                return ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, builder, new Object[0])).getNumber() != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public Descriptors.FieldDescriptor get(GeneratedMessageV3 generatedMessageV3) {
                int number = ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethod, generatedMessageV3, new Object[0])).getNumber();
                if (number > 0) {
                    return this.descriptor.findFieldByNumber(number);
                }
                return null;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public Descriptors.FieldDescriptor get(Builder<?> builder) {
                int number = ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, builder, new Object[0])).getNumber();
                if (number > 0) {
                    return this.descriptor.findFieldByNumber(number);
                }
                return null;
            }
        }

        /* loaded from: classes2.dex */
        static class SyntheticOneofAccessor implements OneofAccessor {
            private final Descriptors.FieldDescriptor fieldDescriptor;

            SyntheticOneofAccessor(Descriptors.Descriptor descriptor, int i) {
                this.fieldDescriptor = descriptor.getOneofs().get(i).getFields().get(0);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                return generatedMessageV3.hasField(this.fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public boolean has(Builder<?> builder) {
                return builder.hasField(this.fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public Descriptors.FieldDescriptor get(GeneratedMessageV3 generatedMessageV3) {
                if (generatedMessageV3.hasField(this.fieldDescriptor)) {
                    return this.fieldDescriptor;
                }
                return null;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public Descriptors.FieldDescriptor get(Builder<?> builder) {
                if (builder.hasField(this.fieldDescriptor)) {
                    return this.fieldDescriptor;
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public static class SingularFieldAccessor implements FieldAccessor {
            protected final Descriptors.FieldDescriptor field;
            protected final boolean hasHasMethod;
            protected final MethodInvoker invoker;
            protected final boolean isOneofField;
            protected final Class<?> type;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes2.dex */
            public interface MethodInvoker {
                Object get(Builder<?> builder);

                Object get(GeneratedMessageV3 generatedMessageV3);

                int getOneofFieldNumber(Builder<?> builder);

                int getOneofFieldNumber(GeneratedMessageV3 generatedMessageV3);

                boolean has(Builder<?> builder);

                boolean has(GeneratedMessageV3 generatedMessageV3);

                void set(Builder<?> builder, Object obj);
            }

            static MethodInvoker getMethodInvoker(ReflectionInvoker reflectionInvoker) {
                return reflectionInvoker;
            }

            /* loaded from: classes2.dex */
            static final class ReflectionInvoker implements MethodInvoker {
                private final Method caseMethod;
                private final Method caseMethodBuilder;
                private final Method clearMethod;
                private final Method getMethod;
                private final Method getMethodBuilder;
                private final Method hasMethod;
                private final Method hasMethodBuilder;
                private final Method setMethod;

                ReflectionInvoker(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2, String str2, boolean z, boolean z2) {
                    Method method;
                    Method method2;
                    Method method3;
                    Method methodOrDie = GeneratedMessageV3.getMethodOrDie(cls, "get" + str, new Class[0]);
                    this.getMethod = methodOrDie;
                    this.getMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str, new Class[0]);
                    this.setMethod = GeneratedMessageV3.getMethodOrDie(cls2, "set" + str, methodOrDie.getReturnType());
                    Method method4 = null;
                    if (z2) {
                        method = GeneratedMessageV3.getMethodOrDie(cls, "has" + str, new Class[0]);
                    } else {
                        method = null;
                    }
                    this.hasMethod = method;
                    if (z2) {
                        method2 = GeneratedMessageV3.getMethodOrDie(cls2, "has" + str, new Class[0]);
                    } else {
                        method2 = null;
                    }
                    this.hasMethodBuilder = method2;
                    this.clearMethod = GeneratedMessageV3.getMethodOrDie(cls2, "clear" + str, new Class[0]);
                    if (z) {
                        method3 = GeneratedMessageV3.getMethodOrDie(cls, "get" + str2 + "Case", new Class[0]);
                    } else {
                        method3 = null;
                    }
                    this.caseMethod = method3;
                    if (z) {
                        method4 = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str2 + "Case", new Class[0]);
                    }
                    this.caseMethodBuilder = method4;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public Object get(GeneratedMessageV3 generatedMessageV3) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethod, generatedMessageV3, new Object[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public Object get(Builder<?> builder) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethodBuilder, builder, new Object[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public int getOneofFieldNumber(GeneratedMessageV3 generatedMessageV3) {
                    return ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethod, generatedMessageV3, new Object[0])).getNumber();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public int getOneofFieldNumber(Builder<?> builder) {
                    return ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, builder, new Object[0])).getNumber();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public void set(Builder<?> builder, Object obj) {
                    GeneratedMessageV3.invokeOrDie(this.setMethod, builder, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public boolean has(GeneratedMessageV3 generatedMessageV3) {
                    return ((Boolean) GeneratedMessageV3.invokeOrDie(this.hasMethod, generatedMessageV3, new Object[0])).booleanValue();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public boolean has(Builder<?> builder) {
                    return ((Boolean) GeneratedMessageV3.invokeOrDie(this.hasMethodBuilder, builder, new Object[0])).booleanValue();
                }
            }

            SingularFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2, String str2) {
                boolean z = fieldDescriptor.getRealContainingOneof() != null;
                this.isOneofField = z;
                boolean z2 = (fieldDescriptor.getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.EDITIONS && fieldDescriptor.hasPresence()) || fieldDescriptor.getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO2 || fieldDescriptor.hasOptionalKeyword() || (!z && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE);
                this.hasHasMethod = z2;
                ReflectionInvoker reflectionInvoker = new ReflectionInvoker(fieldDescriptor, str, cls, cls2, str2, z, z2);
                this.field = fieldDescriptor;
                this.type = reflectionInvoker.getMethod.getReturnType();
                this.invoker = getMethodInvoker(reflectionInvoker);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(GeneratedMessageV3 generatedMessageV3) {
                return this.invoker.get(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(Builder<?> builder) {
                return this.invoker.get(builder);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRaw(GeneratedMessageV3 generatedMessageV3) {
                return get(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder<?> builder, Object obj) {
                this.invoker.set(builder, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void addRepeated(Builder<?> builder, Object obj) {
                throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                if (this.hasHasMethod) {
                    return this.invoker.has(generatedMessageV3);
                }
                if (this.isOneofField) {
                    return this.invoker.getOneofFieldNumber(generatedMessageV3) == this.field.getNumber();
                }
                return !get(generatedMessageV3).equals(this.field.getDefaultValue());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(Builder<?> builder) {
                if (this.hasHasMethod) {
                    return this.invoker.has(builder);
                }
                if (this.isOneofField) {
                    return this.invoker.getOneofFieldNumber(builder) == this.field.getNumber();
                }
                return !get(builder).equals(this.field.getDefaultValue());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getBuilder(Builder<?> builder) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public static class RepeatedFieldAccessor implements FieldAccessor {
            protected final MethodInvoker invoker;
            protected final Class<?> type;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes2.dex */
            public interface MethodInvoker {
                void addRepeated(Builder<?> builder, Object obj);

                void clear(Builder<?> builder);

                Object get(Builder<?> builder);

                Object get(GeneratedMessageV3 generatedMessageV3);

                Object getRepeated(Builder<?> builder, int i);

                Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i);

                int getRepeatedCount(Builder<?> builder);

                int getRepeatedCount(GeneratedMessageV3 generatedMessageV3);
            }

            static MethodInvoker getMethodInvoker(ReflectionInvoker reflectionInvoker) {
                return reflectionInvoker;
            }

            /* loaded from: classes2.dex */
            static final class ReflectionInvoker implements MethodInvoker {
                private final Method addRepeatedMethod;
                private final Method clearMethod;
                private final Method getCountMethod;
                private final Method getCountMethodBuilder;
                private final Method getMethod;
                private final Method getMethodBuilder;
                private final Method getRepeatedMethod;
                private final Method getRepeatedMethodBuilder;
                private final Method setRepeatedMethod;

                ReflectionInvoker(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2) {
                    this.getMethod = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "List", new Class[0]);
                    this.getMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "List", new Class[0]);
                    StringBuilder sb = new StringBuilder();
                    sb.append("get");
                    sb.append(str);
                    String sb2 = sb.toString();
                    Class cls3 = Integer.TYPE;
                    Method methodOrDie = GeneratedMessageV3.getMethodOrDie(cls, sb2, cls3);
                    this.getRepeatedMethod = methodOrDie;
                    this.getRepeatedMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str, cls3);
                    Class<?> returnType = methodOrDie.getReturnType();
                    this.setRepeatedMethod = GeneratedMessageV3.getMethodOrDie(cls2, "set" + str, cls3, returnType);
                    this.addRepeatedMethod = GeneratedMessageV3.getMethodOrDie(cls2, "add" + str, returnType);
                    this.getCountMethod = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "Count", new Class[0]);
                    this.getCountMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Count", new Class[0]);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("clear");
                    sb3.append(str);
                    this.clearMethod = GeneratedMessageV3.getMethodOrDie(cls2, sb3.toString(), new Class[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public Object get(GeneratedMessageV3 generatedMessageV3) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethod, generatedMessageV3, new Object[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public Object get(Builder<?> builder) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethodBuilder, builder, new Object[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i) {
                    return GeneratedMessageV3.invokeOrDie(this.getRepeatedMethod, generatedMessageV3, Integer.valueOf(i));
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public Object getRepeated(Builder<?> builder, int i) {
                    return GeneratedMessageV3.invokeOrDie(this.getRepeatedMethodBuilder, builder, Integer.valueOf(i));
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public void addRepeated(Builder<?> builder, Object obj) {
                    GeneratedMessageV3.invokeOrDie(this.addRepeatedMethod, builder, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public int getRepeatedCount(GeneratedMessageV3 generatedMessageV3) {
                    return ((Integer) GeneratedMessageV3.invokeOrDie(this.getCountMethod, generatedMessageV3, new Object[0])).intValue();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public int getRepeatedCount(Builder<?> builder) {
                    return ((Integer) GeneratedMessageV3.invokeOrDie(this.getCountMethodBuilder, builder, new Object[0])).intValue();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public void clear(Builder<?> builder) {
                    GeneratedMessageV3.invokeOrDie(this.clearMethod, builder, new Object[0]);
                }
            }

            RepeatedFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2) {
                ReflectionInvoker reflectionInvoker = new ReflectionInvoker(fieldDescriptor, str, cls, cls2);
                this.type = reflectionInvoker.getRepeatedMethod.getReturnType();
                this.invoker = getMethodInvoker(reflectionInvoker);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(GeneratedMessageV3 generatedMessageV3) {
                return this.invoker.get(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(Builder<?> builder) {
                return this.invoker.get(builder);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRaw(GeneratedMessageV3 generatedMessageV3) {
                return get(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder<?> builder, Object obj) {
                clear(builder);
                for (Object obj2 : (List) obj) {
                    addRepeated(builder, obj2);
                }
            }

            public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i) {
                return this.invoker.getRepeated(generatedMessageV3, i);
            }

            public Object getRepeated(Builder<?> builder, int i) {
                return this.invoker.getRepeated(builder, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void addRepeated(Builder<?> builder, Object obj) {
                this.invoker.addRepeated(builder, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(Builder<?> builder) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            public int getRepeatedCount(GeneratedMessageV3 generatedMessageV3) {
                return this.invoker.getRepeatedCount(generatedMessageV3);
            }

            public int getRepeatedCount(Builder<?> builder) {
                return this.invoker.getRepeatedCount(builder);
            }

            public void clear(Builder<?> builder) {
                this.invoker.clear(builder);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getBuilder(Builder<?> builder) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
        }

        /* loaded from: classes2.dex */
        static class MapFieldAccessor implements FieldAccessor {
            private final Descriptors.FieldDescriptor field;
            private final Message mapEntryMessageDefaultInstance;

            MapFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, Class<? extends GeneratedMessageV3> cls) {
                this.field = fieldDescriptor;
                this.mapEntryMessageDefaultInstance = getMapField((GeneratedMessageV3) GeneratedMessageV3.invokeOrDie(GeneratedMessageV3.getMethodOrDie(cls, "getDefaultInstance", new Class[0]), null, new Object[0])).getMapEntryMessageDefaultInstance();
            }

            private MapFieldReflectionAccessor getMapField(GeneratedMessageV3 generatedMessageV3) {
                return generatedMessageV3.internalGetMapFieldReflection(this.field.getNumber());
            }

            private MapFieldReflectionAccessor getMapField(Builder<?> builder) {
                return builder.internalGetMapFieldReflection(this.field.getNumber());
            }

            private MapFieldReflectionAccessor getMutableMapField(Builder<?> builder) {
                return builder.internalGetMutableMapFieldReflection(this.field.getNumber());
            }

            private Message coerceType(Message message) {
                if (message == null) {
                    return null;
                }
                return this.mapEntryMessageDefaultInstance.getClass().isInstance(message) ? message : this.mapEntryMessageDefaultInstance.toBuilder().mergeFrom(message).build();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(GeneratedMessageV3 generatedMessageV3) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < getRepeatedCount(generatedMessageV3); i++) {
                    arrayList.add(getRepeated(generatedMessageV3, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(Builder<?> builder) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < getRepeatedCount(builder); i++) {
                    arrayList.add(getRepeated(builder, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRaw(GeneratedMessageV3 generatedMessageV3) {
                return get(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder<?> builder, Object obj) {
                clear(builder);
                for (Object obj2 : (List) obj) {
                    addRepeated(builder, obj2);
                }
            }

            public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i) {
                return getMapField(generatedMessageV3).getList().get(i);
            }

            public Object getRepeated(Builder<?> builder, int i) {
                return getMapField(builder).getList().get(i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void addRepeated(Builder<?> builder, Object obj) {
                getMutableMapField(builder).getMutableList().add(coerceType((Message) obj));
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(Builder<?> builder) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            public int getRepeatedCount(GeneratedMessageV3 generatedMessageV3) {
                return getMapField(generatedMessageV3).getList().size();
            }

            public int getRepeatedCount(Builder<?> builder) {
                return getMapField(builder).getList().size();
            }

            public void clear(Builder<?> builder) {
                getMutableMapField(builder).getMutableList().clear();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder newBuilder() {
                return this.mapEntryMessageDefaultInstance.newBuilderForType();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getBuilder(Builder<?> builder) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }
        }

        /* loaded from: classes2.dex */
        static final class SingularEnumFieldAccessor extends SingularFieldAccessor {
            private final Descriptors.EnumDescriptor enumDescriptor;
            private final Method getValueDescriptorMethod;
            private Method getValueMethod;
            private Method getValueMethodBuilder;
            private Method setValueMethod;
            private final boolean supportUnknownEnumValue;
            private final Method valueOfMethod;

            SingularEnumFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.enumDescriptor = fieldDescriptor.getEnumType();
                this.valueOfMethod = GeneratedMessageV3.getMethodOrDie(this.type, "valueOf", Descriptors.EnumValueDescriptor.class);
                this.getValueDescriptorMethod = GeneratedMessageV3.getMethodOrDie(this.type, "getValueDescriptor", new Class[0]);
                boolean z = !fieldDescriptor.legacyEnumFieldTreatedAsClosed();
                this.supportUnknownEnumValue = z;
                if (z) {
                    this.getValueMethod = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "Value", new Class[0]);
                    this.getValueMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Value", new Class[0]);
                    this.setValueMethod = GeneratedMessageV3.getMethodOrDie(cls2, "set" + str + "Value", Integer.TYPE);
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(GeneratedMessageV3 generatedMessageV3) {
                if (this.supportUnknownEnumValue) {
                    return this.enumDescriptor.findValueByNumberCreatingIfUnknown(((Integer) GeneratedMessageV3.invokeOrDie(this.getValueMethod, generatedMessageV3, new Object[0])).intValue());
                }
                return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.get(generatedMessageV3), new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(Builder<?> builder) {
                if (this.supportUnknownEnumValue) {
                    return this.enumDescriptor.findValueByNumberCreatingIfUnknown(((Integer) GeneratedMessageV3.invokeOrDie(this.getValueMethodBuilder, builder, new Object[0])).intValue());
                }
                return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.get(builder), new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder<?> builder, Object obj) {
                if (this.supportUnknownEnumValue) {
                    GeneratedMessageV3.invokeOrDie(this.setValueMethod, builder, Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                } else {
                    super.set(builder, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, null, obj));
                }
            }
        }

        /* loaded from: classes2.dex */
        static final class RepeatedEnumFieldAccessor extends RepeatedFieldAccessor {
            private Method addRepeatedValueMethod;
            private final Descriptors.EnumDescriptor enumDescriptor;
            private Method getRepeatedValueMethod;
            private Method getRepeatedValueMethodBuilder;
            private final Method getValueDescriptorMethod;
            private Method setRepeatedValueMethod;
            private final boolean supportUnknownEnumValue;
            private final Method valueOfMethod;

            RepeatedEnumFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2) {
                super(fieldDescriptor, str, cls, cls2);
                this.enumDescriptor = fieldDescriptor.getEnumType();
                this.valueOfMethod = GeneratedMessageV3.getMethodOrDie(this.type, "valueOf", Descriptors.EnumValueDescriptor.class);
                this.getValueDescriptorMethod = GeneratedMessageV3.getMethodOrDie(this.type, "getValueDescriptor", new Class[0]);
                boolean z = !fieldDescriptor.legacyEnumFieldTreatedAsClosed();
                this.supportUnknownEnumValue = z;
                if (z) {
                    Class cls3 = Integer.TYPE;
                    this.getRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "Value", cls3);
                    this.getRepeatedValueMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Value", cls3);
                    this.setRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(cls2, "set" + str + "Value", cls3, cls3);
                    this.addRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(cls2, "add" + str + "Value", cls3);
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(GeneratedMessageV3 generatedMessageV3) {
                ArrayList arrayList = new ArrayList();
                int repeatedCount = getRepeatedCount(generatedMessageV3);
                for (int i = 0; i < repeatedCount; i++) {
                    arrayList.add(getRepeated(generatedMessageV3, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(Builder<?> builder) {
                ArrayList arrayList = new ArrayList();
                int repeatedCount = getRepeatedCount(builder);
                for (int i = 0; i < repeatedCount; i++) {
                    arrayList.add(getRepeated(builder, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor
            public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i) {
                if (this.supportUnknownEnumValue) {
                    return this.enumDescriptor.findValueByNumberCreatingIfUnknown(((Integer) GeneratedMessageV3.invokeOrDie(this.getRepeatedValueMethod, generatedMessageV3, Integer.valueOf(i))).intValue());
                }
                return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.getRepeated(generatedMessageV3, i), new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor
            public Object getRepeated(Builder<?> builder, int i) {
                if (this.supportUnknownEnumValue) {
                    return this.enumDescriptor.findValueByNumberCreatingIfUnknown(((Integer) GeneratedMessageV3.invokeOrDie(this.getRepeatedValueMethodBuilder, builder, Integer.valueOf(i))).intValue());
                }
                return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.getRepeated(builder, i), new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void addRepeated(Builder<?> builder, Object obj) {
                if (this.supportUnknownEnumValue) {
                    GeneratedMessageV3.invokeOrDie(this.addRepeatedValueMethod, builder, Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                } else {
                    super.addRepeated(builder, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, null, obj));
                }
            }
        }

        /* loaded from: classes2.dex */
        static final class SingularStringFieldAccessor extends SingularFieldAccessor {
            private final Method getBytesMethod;
            private final Method setBytesMethodBuilder;

            SingularStringFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.getBytesMethod = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "Bytes", new Class[0]);
                this.setBytesMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "set" + str + "Bytes", ByteString.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRaw(GeneratedMessageV3 generatedMessageV3) {
                return GeneratedMessageV3.invokeOrDie(this.getBytesMethod, generatedMessageV3, new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder<?> builder, Object obj) {
                if (obj instanceof ByteString) {
                    GeneratedMessageV3.invokeOrDie(this.setBytesMethodBuilder, builder, obj);
                } else {
                    super.set(builder, obj);
                }
            }
        }

        /* loaded from: classes2.dex */
        static final class SingularMessageFieldAccessor extends SingularFieldAccessor {
            private final Method getBuilderMethodBuilder;
            private final Method newBuilderMethod;

            SingularMessageFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.newBuilderMethod = GeneratedMessageV3.getMethodOrDie(this.type, "newBuilder", new Class[0]);
                this.getBuilderMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Builder", new Class[0]);
            }

            private Object coerceType(Object obj) {
                return this.type.isInstance(obj) ? obj : ((Message.Builder) GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, null, new Object[0])).mergeFrom((Message) obj).buildPartial();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder<?> builder, Object obj) {
                super.set(builder, coerceType(obj));
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder newBuilder() {
                return (Message.Builder) GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, null, new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getBuilder(Builder<?> builder) {
                return (Message.Builder) GeneratedMessageV3.invokeOrDie(this.getBuilderMethodBuilder, builder, new Object[0]);
            }
        }

        /* loaded from: classes2.dex */
        static final class RepeatedMessageFieldAccessor extends RepeatedFieldAccessor {
            private final Method getBuilderMethodBuilder;
            private final Method newBuilderMethod;

            RepeatedMessageFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2) {
                super(fieldDescriptor, str, cls, cls2);
                this.newBuilderMethod = GeneratedMessageV3.getMethodOrDie(this.type, "newBuilder", new Class[0]);
                this.getBuilderMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Builder", Integer.TYPE);
            }

            private Object coerceType(Object obj) {
                return this.type.isInstance(obj) ? obj : ((Message.Builder) GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, null, new Object[0])).mergeFrom((Message) obj).build();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void addRepeated(Builder<?> builder, Object obj) {
                super.addRepeated(builder, coerceType(obj));
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder newBuilder() {
                return (Message.Builder) GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, null, new Object[0]);
            }
        }
    }

    protected Object writeReplace() {
        return new GeneratedMessageLite.SerializedForm(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int computeStringSize(int i, Object obj) {
        if (obj instanceof String) {
            return CodedOutputStream.computeStringSize(i, (String) obj);
        }
        return CodedOutputStream.computeBytesSize(i, (ByteString) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int computeStringSizeNoTag(Object obj) {
        if (obj instanceof String) {
            return CodedOutputStream.computeStringSizeNoTag((String) obj);
        }
        return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void writeString(CodedOutputStream codedOutputStream, int i, Object obj) {
        if (obj instanceof String) {
            codedOutputStream.writeString(i, (String) obj);
        } else {
            codedOutputStream.writeBytes(i, (ByteString) obj);
        }
    }
}
