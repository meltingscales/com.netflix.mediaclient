package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import java.net.InetAddress;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9562rt;

/* loaded from: classes5.dex */
public class InetAddressSerializer extends StdScalarSerializer<InetAddress> implements InterfaceC9562rt {
    protected final boolean b;

    public InetAddressSerializer() {
        this(false);
    }

    public InetAddressSerializer(boolean z) {
        super(InetAddress.class);
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[RETURN] */
    @Override // o.InterfaceC9562rt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.AbstractC9453pq<?> e(o.AbstractC9459pw r2, com.fasterxml.jackson.databind.BeanProperty r3) {
        /*
            r1 = this;
            java.lang.Class r0 = r1.c()
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r1.c(r2, r3, r0)
            if (r2 == 0) goto L1a
            com.fasterxml.jackson.annotation.JsonFormat$Shape r2 = r2.a()
            boolean r3 = r2.a()
            if (r3 != 0) goto L18
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY
            if (r2 != r3) goto L1a
        L18:
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            boolean r3 = r1.b
            if (r2 == r3) goto L25
            com.fasterxml.jackson.databind.ser.std.InetAddressSerializer r3 = new com.fasterxml.jackson.databind.ser.std.InetAddressSerializer
            r3.<init>(r2)
            return r3
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.InetAddressSerializer.e(o.pw, com.fasterxml.jackson.databind.BeanProperty):o.pq");
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: d */
    public void e(InetAddress inetAddress, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        String trim;
        if (this.b) {
            trim = inetAddress.getHostAddress();
        } else {
            trim = inetAddress.toString().trim();
            int indexOf = trim.indexOf(47);
            if (indexOf >= 0) {
                if (indexOf == 0) {
                    trim = trim.substring(1);
                } else {
                    trim = trim.substring(0, indexOf);
                }
            }
        }
        jsonGenerator.i(trim);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, o.AbstractC9453pq
    /* renamed from: d */
    public void c(InetAddress inetAddress, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        WritableTypeId b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.b(inetAddress, InetAddress.class, JsonToken.VALUE_STRING));
        e(inetAddress, jsonGenerator, abstractC9459pw);
        abstractC9544rb.c(jsonGenerator, b);
    }
}
