package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public interface Reader {
    int getFieldNumber();

    int getTag();

    <T> void mergeGroupField(T t, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite);

    <T> void mergeMessageField(T t, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite);

    boolean readBool();

    void readBoolList(List<Boolean> list);

    ByteString readBytes();

    void readBytesList(List<ByteString> list);

    double readDouble();

    void readDoubleList(List<Double> list);

    int readEnum();

    void readEnumList(List<Integer> list);

    int readFixed32();

    void readFixed32List(List<Integer> list);

    long readFixed64();

    void readFixed64List(List<Long> list);

    float readFloat();

    void readFloatList(List<Float> list);

    @Deprecated
    <T> T readGroup(Class<T> cls, ExtensionRegistryLite extensionRegistryLite);

    @Deprecated
    <T> void readGroupList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite);

    int readInt32();

    void readInt32List(List<Integer> list);

    long readInt64();

    void readInt64List(List<Long> list);

    <K, V> void readMap(Map<K, V> map, MapEntryLite.Metadata<K, V> metadata, ExtensionRegistryLite extensionRegistryLite);

    <T> T readMessage(Class<T> cls, ExtensionRegistryLite extensionRegistryLite);

    <T> void readMessageList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite);

    int readSFixed32();

    void readSFixed32List(List<Integer> list);

    long readSFixed64();

    void readSFixed64List(List<Long> list);

    int readSInt32();

    void readSInt32List(List<Integer> list);

    long readSInt64();

    void readSInt64List(List<Long> list);

    String readString();

    void readStringList(List<String> list);

    void readStringListRequireUtf8(List<String> list);

    String readStringRequireUtf8();

    int readUInt32();

    void readUInt32List(List<Integer> list);

    long readUInt64();

    void readUInt64List(List<Long> list);

    boolean shouldDiscardUnknownFields();

    boolean skipField();
}
