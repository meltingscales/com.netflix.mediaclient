package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import java.util.UUID;
import o.AbstractC9459pw;
import o.C9542rZ;
import o.InterfaceC9478qO;

/* loaded from: classes5.dex */
public class UUIDSerializer extends StdScalarSerializer<UUID> {
    static final char[] c = "0123456789abcdef".toCharArray();

    public UUIDSerializer() {
        super(UUID.class);
    }

    @Override // o.AbstractC9453pq
    /* renamed from: e */
    public boolean c(AbstractC9459pw abstractC9459pw, UUID uuid) {
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: d */
    public void e(UUID uuid, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (jsonGenerator.b() && !(jsonGenerator instanceof C9542rZ)) {
            jsonGenerator.a(e(uuid));
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits = uuid.getMostSignificantBits();
        b((int) (mostSignificantBits >> 32), cArr, 0);
        cArr[8] = '-';
        int i = (int) mostSignificantBits;
        d(i >>> 16, cArr, 9);
        cArr[13] = '-';
        d(i, cArr, 14);
        cArr[18] = '-';
        long leastSignificantBits = uuid.getLeastSignificantBits();
        d((int) (leastSignificantBits >>> 48), cArr, 19);
        cArr[23] = '-';
        d((int) (leastSignificantBits >>> 32), cArr, 24);
        b((int) leastSignificantBits, cArr, 28);
        jsonGenerator.d(cArr, 0, 36);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        e(interfaceC9478qO, javaType, JsonValueFormat.UUID);
    }

    private static void b(int i, char[] cArr, int i2) {
        d(i >> 16, cArr, i2);
        d(i, cArr, i2 + 4);
    }

    private static void d(int i, char[] cArr, int i2) {
        char[] cArr2 = c;
        cArr[i2] = cArr2[(i >> 12) & 15];
        cArr[i2 + 1] = cArr2[(i >> 8) & 15];
        cArr[i2 + 2] = cArr2[(i >> 4) & 15];
        cArr[i2 + 3] = cArr2[i & 15];
    }

    private static final byte[] e(UUID uuid) {
        byte[] bArr = new byte[16];
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        c((int) (mostSignificantBits >> 32), bArr, 0);
        c((int) mostSignificantBits, bArr, 4);
        c((int) (leastSignificantBits >> 32), bArr, 8);
        c((int) leastSignificantBits, bArr, 12);
        return bArr;
    }

    private static final void c(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }
}
