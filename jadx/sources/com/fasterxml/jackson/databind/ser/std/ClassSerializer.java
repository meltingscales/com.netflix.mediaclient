package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Type;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.InterfaceC9478qO;

/* loaded from: classes5.dex */
public class ClassSerializer extends StdScalarSerializer<Class<?>> {
    public ClassSerializer() {
        super(Class.class, false);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: b */
    public void e(Class<?> cls, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.i(cls.getName());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        return d("string", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        e(interfaceC9478qO, javaType);
    }
}
