package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class ExtensionSchema<T extends FieldSet.FieldDescriptorLite<T>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int extensionNumber(Map.Entry<?, ?> entry);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract FieldSet<T> getExtensions(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract FieldSet<T> getMutableExtensions(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean hasExtensions(MessageLite messageLite);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void makeImmutable(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <UT, UB> UB parseExtension(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void parseLengthPrefixedMessageSetItem(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void parseMessageSetItem(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void serializeExtension(Writer writer, Map.Entry<?, ?> entry);
}
