package com.google.protobuf;

/* loaded from: classes2.dex */
final class NewInstanceSchemas {
    private static final NewInstanceSchema FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final NewInstanceSchema LITE_SCHEMA = new NewInstanceSchemaLite();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static NewInstanceSchema full() {
        return FULL_SCHEMA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static NewInstanceSchema lite() {
        return LITE_SCHEMA;
    }

    NewInstanceSchemas() {
    }

    private static NewInstanceSchema loadSchemaForFullRuntime() {
        try {
            return (NewInstanceSchema) NewInstanceSchemaFull.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}