package androidx.datastore.preferences.protobuf;

/* loaded from: classes2.dex */
interface SchemaFactory {
    <T> Schema<T> createSchema(Class<T> cls);
}
