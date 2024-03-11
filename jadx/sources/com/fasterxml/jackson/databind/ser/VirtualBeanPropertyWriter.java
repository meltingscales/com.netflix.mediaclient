package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.AbstractC9465qB;
import o.AbstractC9523rG;
import o.AbstractC9544rb;
import o.C9508qs;
import o.InterfaceC9327nW;
import o.InterfaceC9532rP;

/* loaded from: classes5.dex */
public abstract class VirtualBeanPropertyWriter extends BeanPropertyWriter implements Serializable {
    private static final long serialVersionUID = 1;

    protected abstract Object c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw);

    public abstract VirtualBeanPropertyWriter d(MapperConfig<?> mapperConfig, C9508qs c9508qs, AbstractC9465qB abstractC9465qB, JavaType javaType);

    protected VirtualBeanPropertyWriter() {
    }

    public VirtualBeanPropertyWriter(AbstractC9465qB abstractC9465qB, InterfaceC9532rP interfaceC9532rP, JavaType javaType, AbstractC9453pq<?> abstractC9453pq, AbstractC9544rb abstractC9544rb, JavaType javaType2, JsonInclude.Value value, Class<?>[] clsArr) {
        super(abstractC9465qB, abstractC9465qB.s(), interfaceC9532rP, javaType, abstractC9453pq, abstractC9544rb, javaType2, c(value), a(value), clsArr);
    }

    protected static boolean c(JsonInclude.Value value) {
        JsonInclude.Include d;
        return (value == null || (d = value.d()) == JsonInclude.Include.ALWAYS || d == JsonInclude.Include.USE_DEFAULTS) ? false : true;
    }

    protected static Object a(JsonInclude.Value value) {
        if (value == null) {
            return Boolean.FALSE;
        }
        JsonInclude.Include d = value.d();
        if (d == JsonInclude.Include.ALWAYS || d == JsonInclude.Include.NON_NULL || d == JsonInclude.Include.USE_DEFAULTS) {
            return null;
        }
        return BeanPropertyWriter.a;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
    public void d(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        Object c = c(obj, jsonGenerator, abstractC9459pw);
        if (c == null) {
            if (this.m != null) {
                jsonGenerator.d((InterfaceC9327nW) this.f13109o);
                this.m.e(null, jsonGenerator, abstractC9459pw);
                return;
            }
            return;
        }
        AbstractC9453pq<?> abstractC9453pq = this.t;
        if (abstractC9453pq == null) {
            Class<?> cls = c.getClass();
            AbstractC9523rG abstractC9523rG = this.i;
            AbstractC9453pq<?> c2 = abstractC9523rG.c(cls);
            abstractC9453pq = c2 == null ? e(abstractC9523rG, cls, abstractC9459pw) : c2;
        }
        Object obj2 = this.q;
        if (obj2 != null) {
            if (BeanPropertyWriter.a == obj2) {
                if (abstractC9453pq.c(abstractC9459pw, c)) {
                    return;
                }
            } else if (obj2.equals(c)) {
                return;
            }
        }
        if (c == obj && b(obj, jsonGenerator, abstractC9459pw, abstractC9453pq)) {
            return;
        }
        jsonGenerator.d((InterfaceC9327nW) this.f13109o);
        AbstractC9544rb abstractC9544rb = this.r;
        if (abstractC9544rb == null) {
            abstractC9453pq.e(c, jsonGenerator, abstractC9459pw);
        } else {
            abstractC9453pq.c(c, jsonGenerator, abstractC9459pw, abstractC9544rb);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public void b(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        Object c = c(obj, jsonGenerator, abstractC9459pw);
        if (c == null) {
            AbstractC9453pq<Object> abstractC9453pq = this.m;
            if (abstractC9453pq != null) {
                abstractC9453pq.e(null, jsonGenerator, abstractC9459pw);
                return;
            } else {
                jsonGenerator.k();
                return;
            }
        }
        AbstractC9453pq<?> abstractC9453pq2 = this.t;
        if (abstractC9453pq2 == null) {
            Class<?> cls = c.getClass();
            AbstractC9523rG abstractC9523rG = this.i;
            AbstractC9453pq<?> c2 = abstractC9523rG.c(cls);
            abstractC9453pq2 = c2 == null ? e(abstractC9523rG, cls, abstractC9459pw) : c2;
        }
        Object obj2 = this.q;
        if (obj2 != null) {
            if (BeanPropertyWriter.a == obj2) {
                if (abstractC9453pq2.c(abstractC9459pw, c)) {
                    a(obj, jsonGenerator, abstractC9459pw);
                    return;
                }
            } else if (obj2.equals(c)) {
                a(obj, jsonGenerator, abstractC9459pw);
                return;
            }
        }
        if (c == obj && b(obj, jsonGenerator, abstractC9459pw, abstractC9453pq2)) {
            return;
        }
        AbstractC9544rb abstractC9544rb = this.r;
        if (abstractC9544rb == null) {
            abstractC9453pq2.e(c, jsonGenerator, abstractC9459pw);
        } else {
            abstractC9453pq2.c(c, jsonGenerator, abstractC9459pw, abstractC9544rb);
        }
    }
}
