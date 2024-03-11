package com.google.protobuf;

import com.google.protobuf.WireFormat;

/* loaded from: classes2.dex */
public class MapEntryLite<K, V> {
    private final Metadata<K, V> metadata;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class Metadata<K, V> {
        public final K defaultKey;
        public final V defaultValue;
        public final WireFormat.FieldType keyType;
        public final WireFormat.FieldType valueType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Metadata<K, V> getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void writeTo(CodedOutputStream codedOutputStream, Metadata<K, V> metadata, K k, V v) {
        FieldSet.writeElement(codedOutputStream, metadata.keyType, 1, k);
        FieldSet.writeElement(codedOutputStream, metadata.valueType, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int computeSerializedSize(Metadata<K, V> metadata, K k, V v) {
        return FieldSet.computeElementSize(metadata.keyType, 1, k) + FieldSet.computeElementSize(metadata.valueType, 2, v);
    }

    public int computeMessageSize(int i, K k, V v) {
        return CodedOutputStream.computeTagSize(i) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, k, v));
    }
}
