package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.util.Arrays;
import java.util.UUID;
import o.C9322nR;

/* loaded from: classes5.dex */
public class UUIDDeserializer extends FromStringDeserializer<UUID> {
    static final int[] e;
    private static final long serialVersionUID = 1;

    static {
        int[] iArr = new int[127];
        e = iArr;
        Arrays.fill(iArr, -1);
        for (int i = 0; i < 10; i++) {
            e[i + 48] = i;
        }
        for (int i2 = 0; i2 < 6; i2++) {
            int[] iArr2 = e;
            int i3 = i2 + 10;
            iArr2[i2 + 97] = i3;
            iArr2[i2 + 65] = i3;
        }
    }

    public UUIDDeserializer() {
        super(UUID.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    /* renamed from: b */
    public UUID d(String str, DeserializationContext deserializationContext) {
        if (str.length() != 36) {
            if (str.length() == 24) {
                return b(C9322nR.e().c(str), deserializationContext);
            }
            return c(str, deserializationContext);
        }
        if (str.charAt(8) != '-' || str.charAt(13) != '-' || str.charAt(18) != '-' || str.charAt(23) != '-') {
            c(str, deserializationContext);
        }
        int e2 = e(str, 19, deserializationContext);
        return new UUID((c(str, 0, deserializationContext) << 32) + ((e(str, 9, deserializationContext) << 16) | e(str, 14, deserializationContext)), ((c(str, 28, deserializationContext) << 32) >>> 32) | ((e(str, 24, deserializationContext) | (e2 << 16)) << 32));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    /* renamed from: a */
    public UUID b(Object obj, DeserializationContext deserializationContext) {
        if (obj instanceof byte[]) {
            return b((byte[]) obj, deserializationContext);
        }
        super.b(obj, deserializationContext);
        return null;
    }

    private UUID c(String str, DeserializationContext deserializationContext) {
        return (UUID) deserializationContext.b(c(), str, "UUID has to be represented by standard 36-char representation", new Object[0]);
    }

    int c(String str, int i, DeserializationContext deserializationContext) {
        return (d(str, i, deserializationContext) << 24) + (d(str, i + 2, deserializationContext) << 16) + (d(str, i + 4, deserializationContext) << 8) + d(str, i + 6, deserializationContext);
    }

    int e(String str, int i, DeserializationContext deserializationContext) {
        return (d(str, i, deserializationContext) << 8) + d(str, i + 2, deserializationContext);
    }

    int d(String str, int i, DeserializationContext deserializationContext) {
        char charAt = str.charAt(i);
        int i2 = i + 1;
        char charAt2 = str.charAt(i2);
        if (charAt <= 127 && charAt2 <= 127) {
            int[] iArr = e;
            int i3 = iArr[charAt2] | (iArr[charAt] << 4);
            if (i3 >= 0) {
                return i3;
            }
        }
        if (charAt > 127 || e[charAt] < 0) {
            return b(str, i, deserializationContext, charAt);
        }
        return b(str, i2, deserializationContext, charAt2);
    }

    int b(String str, int i, DeserializationContext deserializationContext, char c) {
        throw deserializationContext.c(str, c(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(c), Integer.toHexString(c)));
    }

    private UUID b(byte[] bArr, DeserializationContext deserializationContext) {
        if (bArr.length != 16) {
            JsonParser m = deserializationContext.m();
            throw InvalidFormatException.c(m, "Can only construct UUIDs from byte[16]; got " + bArr.length + " bytes", bArr, c());
        }
        return new UUID(d(bArr, 0), d(bArr, 8));
    }

    private static long d(byte[] bArr, int i) {
        return ((a(bArr, i + 4) << 32) >>> 32) | (a(bArr, i) << 32);
    }

    private static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
