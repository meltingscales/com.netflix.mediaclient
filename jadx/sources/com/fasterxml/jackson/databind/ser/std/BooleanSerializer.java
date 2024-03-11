package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Type;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9458pv;
import o.InterfaceC9478qO;
import o.InterfaceC9562rt;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public final class BooleanSerializer extends StdScalarSerializer<Object> implements InterfaceC9562rt {
    private static final long serialVersionUID = 1;
    protected final boolean b;

    public BooleanSerializer(boolean z) {
        super(z ? Boolean.TYPE : Boolean.class, false);
        this.b = z;
    }

    @Override // o.InterfaceC9562rt
    public AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        JsonFormat.Value c = c(abstractC9459pw, beanProperty, Boolean.class);
        return (c == null || !c.a().a()) ? this : new AsNumber(this.b);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.a(Boolean.TRUE.equals(obj));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, o.AbstractC9453pq
    public final void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        jsonGenerator.a(Boolean.TRUE.equals(obj));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        return d("boolean", !this.b);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        interfaceC9478qO.c(javaType);
    }

    /* loaded from: classes5.dex */
    static final class AsNumber extends StdScalarSerializer<Object> implements InterfaceC9562rt {
        private static final long serialVersionUID = 1;
        protected final boolean e;

        public AsNumber(boolean z) {
            super(z ? Boolean.TYPE : Boolean.class, false);
            this.e = z;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            jsonGenerator.c(!Boolean.FALSE.equals(obj));
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, o.AbstractC9453pq
        public final void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
            jsonGenerator.a(Boolean.TRUE.equals(obj));
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
            c(interfaceC9478qO, javaType, JsonParser.NumberType.INT);
        }

        @Override // o.InterfaceC9562rt
        public AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
            JsonFormat.Value c = c(abstractC9459pw, beanProperty, Boolean.class);
            return (c == null || c.a().a()) ? this : new BooleanSerializer(this.e);
        }
    }
}
