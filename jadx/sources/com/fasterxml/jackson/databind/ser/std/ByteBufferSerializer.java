package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import java.nio.ByteBuffer;
import o.AbstractC9459pw;
import o.C9533rQ;
import o.InterfaceC9476qM;
import o.InterfaceC9478qO;

/* loaded from: classes5.dex */
public class ByteBufferSerializer extends StdScalarSerializer<ByteBuffer> {
    public ByteBufferSerializer() {
        super(ByteBuffer.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: c */
    public void e(ByteBuffer byteBuffer, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (byteBuffer.hasArray()) {
            jsonGenerator.e(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
            return;
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (asReadOnlyBuffer.position() > 0) {
            asReadOnlyBuffer.rewind();
        }
        C9533rQ c9533rQ = new C9533rQ(asReadOnlyBuffer);
        jsonGenerator.c(c9533rQ, asReadOnlyBuffer.remaining());
        c9533rQ.close();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        InterfaceC9476qM b = interfaceC9478qO.b(javaType);
        if (b != null) {
            b.d(JsonFormatTypes.INTEGER);
        }
    }
}
