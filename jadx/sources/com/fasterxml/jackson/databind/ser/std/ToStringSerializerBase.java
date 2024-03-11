package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Type;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9478qO;

/* loaded from: classes5.dex */
public abstract class ToStringSerializerBase extends StdSerializer<Object> {
    public abstract String e(Object obj);

    public ToStringSerializerBase(Class<?> cls) {
        super(cls, false);
    }

    @Override // o.AbstractC9453pq
    public boolean c(AbstractC9459pw abstractC9459pw, Object obj) {
        return e(obj).isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.i(e(obj));
    }

    @Override // o.AbstractC9453pq
    public void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        WritableTypeId b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.d(obj, JsonToken.VALUE_STRING));
        e(obj, jsonGenerator, abstractC9459pw);
        abstractC9544rb.c(jsonGenerator, b);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        return d("string", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        e(interfaceC9478qO, javaType);
    }
}
