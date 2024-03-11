package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9451po;
import o.InterfaceC9458pv;
import o.InterfaceC9478qO;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class SerializableSerializer extends StdSerializer<InterfaceC9451po> {
    public static final SerializableSerializer b = new SerializableSerializer();

    protected SerializableSerializer() {
        super(InterfaceC9451po.class);
    }

    @Override // o.AbstractC9453pq
    public boolean c(AbstractC9459pw abstractC9459pw, InterfaceC9451po interfaceC9451po) {
        if (interfaceC9451po instanceof InterfaceC9451po.b) {
            return ((InterfaceC9451po.b) interfaceC9451po).e(abstractC9459pw);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: b */
    public void e(InterfaceC9451po interfaceC9451po, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        interfaceC9451po.a(jsonGenerator, abstractC9459pw);
    }

    @Override // o.AbstractC9453pq
    /* renamed from: d */
    public final void c(InterfaceC9451po interfaceC9451po, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        interfaceC9451po.b(jsonGenerator, abstractC9459pw, abstractC9544rb);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        interfaceC9478qO.a(javaType);
    }
}
