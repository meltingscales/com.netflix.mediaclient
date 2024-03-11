package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import java.lang.reflect.Type;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9458pv;
import o.InterfaceC9476qM;
import o.InterfaceC9478qO;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class ByteArraySerializer extends StdSerializer<byte[]> {
    private static final long serialVersionUID = 1;

    public ByteArraySerializer() {
        super(byte[].class);
    }

    @Override // o.AbstractC9453pq
    /* renamed from: e */
    public boolean c(AbstractC9459pw abstractC9459pw, byte[] bArr) {
        return bArr.length == 0;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void e(byte[] bArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.e(abstractC9459pw.c().i(), bArr, 0, bArr.length);
    }

    @Override // o.AbstractC9453pq
    /* renamed from: a */
    public void c(byte[] bArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        WritableTypeId b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.d(bArr, JsonToken.VALUE_EMBEDDED_OBJECT));
        jsonGenerator.e(abstractC9459pw.c().i(), bArr, 0, bArr.length);
        abstractC9544rb.c(jsonGenerator, b);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        return d("array", true).c("items", e("byte"));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        InterfaceC9476qM b = interfaceC9478qO.b(javaType);
        if (b != null) {
            b.d(JsonFormatTypes.INTEGER);
        }
    }
}
