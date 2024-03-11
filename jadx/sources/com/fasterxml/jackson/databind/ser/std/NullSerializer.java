package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Type;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9458pv;
import o.InterfaceC9478qO;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class NullSerializer extends StdSerializer<Object> {
    public static final NullSerializer b = new NullSerializer();

    private NullSerializer() {
        super(Object.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.k();
    }

    @Override // o.AbstractC9453pq
    public void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        jsonGenerator.k();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        return e("null");
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        interfaceC9478qO.h(javaType);
    }
}
