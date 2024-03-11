package com.netflix.msl.client.params;

/* loaded from: classes5.dex */
public class MslBootKey {
    private final KeyType a;
    private final String c;
    private final EntityType d;
    private final int e;

    /* loaded from: classes5.dex */
    public enum EntityType {
        APPBOOT,
        SHARKBOOT,
        SHARKBOOT_TEST
    }

    /* loaded from: classes5.dex */
    public enum KeyType {
        RSA,
        ECC
    }

    public int c() {
        return this.e;
    }

    public String e() {
        return this.c;
    }

    public MslBootKey(KeyType keyType, String str, int i, EntityType entityType) {
        this.a = keyType;
        this.c = str;
        this.e = i;
        this.d = entityType;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{ ");
        stringBuffer.append("\"entity\": \"" + this.d.name() + "\", ");
        stringBuffer.append("\"algorithm\": \"" + this.a.name() + "\",  ");
        stringBuffer.append("\"pubkey\": \"" + this.c + "\", ");
        stringBuffer.append("\"keyVersion\": " + this.e + " }");
        return stringBuffer.toString();
    }
}
