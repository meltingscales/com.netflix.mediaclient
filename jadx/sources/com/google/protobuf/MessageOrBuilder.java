package com.google.protobuf;

import com.google.protobuf.Descriptors;
import java.util.Map;

/* loaded from: classes2.dex */
public interface MessageOrBuilder extends MessageLiteOrBuilder {
    Map<Descriptors.FieldDescriptor, Object> getAllFields();

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    Message getDefaultInstanceForType();

    Descriptors.Descriptor getDescriptorForType();

    Object getField(Descriptors.FieldDescriptor fieldDescriptor);

    UnknownFieldSet getUnknownFields();

    boolean hasField(Descriptors.FieldDescriptor fieldDescriptor);
}
