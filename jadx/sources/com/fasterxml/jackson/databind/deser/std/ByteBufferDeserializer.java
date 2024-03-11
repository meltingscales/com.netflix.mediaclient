package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.nio.ByteBuffer;
import o.C9538rV;

/* loaded from: classes5.dex */
public class ByteBufferDeserializer extends StdScalarDeserializer<ByteBuffer> {
    private static final long serialVersionUID = 1;

    public ByteBufferDeserializer() {
        super(ByteBuffer.class);
    }

    @Override // o.AbstractC9452pp
    /* renamed from: c */
    public ByteBuffer b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ByteBuffer.wrap(jsonParser.i());
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC9452pp
    /* renamed from: a */
    public ByteBuffer e(JsonParser jsonParser, DeserializationContext deserializationContext, ByteBuffer byteBuffer) {
        C9538rV c9538rV = new C9538rV(byteBuffer);
        jsonParser.e(deserializationContext.h(), c9538rV);
        c9538rV.close();
        return byteBuffer;
    }
}
