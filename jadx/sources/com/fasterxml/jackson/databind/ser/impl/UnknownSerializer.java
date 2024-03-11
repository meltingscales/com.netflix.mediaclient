package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.lang.reflect.Type;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9478qO;

/* loaded from: classes5.dex */
public class UnknownSerializer extends StdSerializer<Object> {
    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        return null;
    }

    @Override // o.AbstractC9453pq
    public boolean c(AbstractC9459pw abstractC9459pw, Object obj) {
        return true;
    }

    public UnknownSerializer() {
        super(Object.class);
    }

    public UnknownSerializer(Class<?> cls) {
        super(cls, false);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (abstractC9459pw.d(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            a(abstractC9459pw, obj);
        }
        jsonGenerator.a(obj, 0);
        jsonGenerator.o();
    }

    @Override // o.AbstractC9453pq
    public final void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        if (abstractC9459pw.d(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            a(abstractC9459pw, obj);
        }
        abstractC9544rb.c(jsonGenerator, abstractC9544rb.b(jsonGenerator, abstractC9544rb.d(obj, JsonToken.START_OBJECT)));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        interfaceC9478qO.a(javaType);
    }

    protected void a(AbstractC9459pw abstractC9459pw, Object obj) {
        abstractC9459pw.c(c(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", obj.getClass().getName()));
    }
}
