package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Type;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.C9537rU;
import o.InterfaceC9478qO;
import o.InterfaceC9487qX;
import o.InterfaceC9517rA;
import o.InterfaceC9535rS;
import o.InterfaceC9562rt;

/* loaded from: classes5.dex */
public class StdDelegatingSerializer extends StdSerializer<Object> implements InterfaceC9562rt, InterfaceC9517rA {
    protected final AbstractC9453pq<Object> b;
    protected final JavaType d;
    protected final InterfaceC9535rS<Object, ?> e;

    public StdDelegatingSerializer(InterfaceC9535rS<Object, ?> interfaceC9535rS, JavaType javaType, AbstractC9453pq<?> abstractC9453pq) {
        super(javaType);
        this.e = interfaceC9535rS;
        this.d = javaType;
        this.b = abstractC9453pq;
    }

    protected StdDelegatingSerializer e(InterfaceC9535rS<Object, ?> interfaceC9535rS, JavaType javaType, AbstractC9453pq<?> abstractC9453pq) {
        C9537rU.c(StdDelegatingSerializer.class, this, "withDelegate");
        return new StdDelegatingSerializer(interfaceC9535rS, javaType, abstractC9453pq);
    }

    @Override // o.InterfaceC9517rA
    public void a(AbstractC9459pw abstractC9459pw) {
        AbstractC9453pq<Object> abstractC9453pq = this.b;
        if (abstractC9453pq == null || !(abstractC9453pq instanceof InterfaceC9517rA)) {
            return;
        }
        ((InterfaceC9517rA) abstractC9453pq).a(abstractC9459pw);
    }

    @Override // o.InterfaceC9562rt
    public AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        AbstractC9453pq<?> abstractC9453pq = this.b;
        JavaType javaType = this.d;
        if (abstractC9453pq == null) {
            if (javaType == null) {
                javaType = this.e.a(abstractC9459pw.e());
            }
            if (!javaType.D()) {
                abstractC9453pq = abstractC9459pw.e(javaType);
            }
        }
        if (abstractC9453pq instanceof InterfaceC9562rt) {
            abstractC9453pq = abstractC9459pw.a(abstractC9453pq, beanProperty);
        }
        return (abstractC9453pq == this.b && javaType == this.d) ? this : e(this.e, javaType, abstractC9453pq);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        Object c = c(obj);
        if (c == null) {
            abstractC9459pw.a(jsonGenerator);
            return;
        }
        AbstractC9453pq<Object> abstractC9453pq = this.b;
        if (abstractC9453pq == null) {
            abstractC9453pq = a(c, abstractC9459pw);
        }
        abstractC9453pq.e(c, jsonGenerator, abstractC9459pw);
    }

    @Override // o.AbstractC9453pq
    public void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        Object c = c(obj);
        AbstractC9453pq<Object> abstractC9453pq = this.b;
        if (abstractC9453pq == null) {
            abstractC9453pq = a(obj, abstractC9459pw);
        }
        abstractC9453pq.c(c, jsonGenerator, abstractC9459pw, abstractC9544rb);
    }

    @Override // o.AbstractC9453pq
    public boolean c(AbstractC9459pw abstractC9459pw, Object obj) {
        Object c = c(obj);
        if (c == null) {
            return true;
        }
        AbstractC9453pq<Object> abstractC9453pq = this.b;
        if (abstractC9453pq == null) {
            return obj == null;
        }
        return abstractC9453pq.c(abstractC9459pw, c);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        AbstractC9453pq<Object> abstractC9453pq = this.b;
        if (abstractC9453pq instanceof InterfaceC9487qX) {
            return ((InterfaceC9487qX) abstractC9453pq).b(abstractC9459pw, type);
        }
        return super.b(abstractC9459pw, type);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    public AbstractC9454pr a(AbstractC9459pw abstractC9459pw, Type type, boolean z) {
        AbstractC9453pq<Object> abstractC9453pq = this.b;
        if (abstractC9453pq instanceof InterfaceC9487qX) {
            return ((InterfaceC9487qX) abstractC9453pq).a(abstractC9459pw, type, z);
        }
        return super.b(abstractC9459pw, type);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        AbstractC9453pq<Object> abstractC9453pq = this.b;
        if (abstractC9453pq != null) {
            abstractC9453pq.d(interfaceC9478qO, javaType);
        }
    }

    protected Object c(Object obj) {
        return this.e.d((InterfaceC9535rS<Object, ?>) obj);
    }

    protected AbstractC9453pq<Object> a(Object obj, AbstractC9459pw abstractC9459pw) {
        return abstractC9459pw.d(obj.getClass());
    }
}
