package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9523rG;
import o.AbstractC9544rb;
import o.InterfaceC9327nW;
import o.InterfaceC9478qO;
import o.InterfaceC9480qQ;

/* loaded from: classes5.dex */
public class UnwrappingBeanPropertyWriter extends BeanPropertyWriter implements Serializable {
    private static final long serialVersionUID = 1;
    protected final NameTransformer x;

    public UnwrappingBeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, NameTransformer nameTransformer) {
        super(beanPropertyWriter);
        this.x = nameTransformer;
    }

    protected UnwrappingBeanPropertyWriter(UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter, NameTransformer nameTransformer, SerializedString serializedString) {
        super(unwrappingBeanPropertyWriter, serializedString);
        this.x = nameTransformer;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    /* renamed from: c */
    public UnwrappingBeanPropertyWriter a(NameTransformer nameTransformer) {
        return c(NameTransformer.b(nameTransformer, this.x), new SerializedString(nameTransformer.c(this.f13109o.b())));
    }

    protected UnwrappingBeanPropertyWriter c(NameTransformer nameTransformer, SerializedString serializedString) {
        return new UnwrappingBeanPropertyWriter(this, nameTransformer, serializedString);
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
    public void d(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        Object b = b(obj);
        if (b == null) {
            return;
        }
        AbstractC9453pq<?> abstractC9453pq = this.t;
        if (abstractC9453pq == null) {
            Class<?> cls = b.getClass();
            AbstractC9523rG abstractC9523rG = this.i;
            AbstractC9453pq<?> c = abstractC9523rG.c(cls);
            abstractC9453pq = c == null ? e(abstractC9523rG, cls, abstractC9459pw) : c;
        }
        Object obj2 = this.q;
        if (obj2 != null) {
            if (BeanPropertyWriter.a == obj2) {
                if (abstractC9453pq.c(abstractC9459pw, b)) {
                    return;
                }
            } else if (obj2.equals(b)) {
                return;
            }
        }
        if (b == obj && b(obj, jsonGenerator, abstractC9459pw, abstractC9453pq)) {
            return;
        }
        if (!abstractC9453pq.e()) {
            jsonGenerator.d((InterfaceC9327nW) this.f13109o);
        }
        AbstractC9544rb abstractC9544rb = this.r;
        if (abstractC9544rb == null) {
            abstractC9453pq.e(b, jsonGenerator, abstractC9459pw);
        } else {
            abstractC9453pq.c(b, jsonGenerator, abstractC9459pw, abstractC9544rb);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public void d(AbstractC9453pq<Object> abstractC9453pq) {
        if (abstractC9453pq != null) {
            NameTransformer nameTransformer = this.x;
            if (abstractC9453pq.e() && (abstractC9453pq instanceof UnwrappingBeanSerializer)) {
                nameTransformer = NameTransformer.b(nameTransformer, ((UnwrappingBeanSerializer) abstractC9453pq).a);
            }
            abstractC9453pq = abstractC9453pq.a(nameTransformer);
        }
        super.d(abstractC9453pq);
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public void d(final InterfaceC9480qQ interfaceC9480qQ, AbstractC9459pw abstractC9459pw) {
        AbstractC9453pq<Object> a = abstractC9459pw.d(d(), this).a(this.x);
        if (a.e()) {
            a.d(new InterfaceC9478qO.b(abstractC9459pw) { // from class: com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.1
                @Override // o.InterfaceC9478qO.b, o.InterfaceC9478qO
                public InterfaceC9480qQ i(JavaType javaType) {
                    return interfaceC9480qQ;
                }
            }, d());
        } else {
            super.d(interfaceC9480qQ, abstractC9459pw);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public void b(ObjectNode objectNode, AbstractC9454pr abstractC9454pr) {
        AbstractC9454pr a = abstractC9454pr.a("properties");
        if (a != null) {
            Iterator<Map.Entry<String, AbstractC9454pr>> k = a.k();
            while (k.hasNext()) {
                Map.Entry<String, AbstractC9454pr> next = k.next();
                String key = next.getKey();
                NameTransformer nameTransformer = this.x;
                if (nameTransformer != null) {
                    key = nameTransformer.c(key);
                }
                objectNode.c(key, next.getValue());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public AbstractC9453pq<Object> e(AbstractC9523rG abstractC9523rG, Class<?> cls, AbstractC9459pw abstractC9459pw) {
        AbstractC9453pq<Object> d;
        JavaType javaType = this.n;
        if (javaType != null) {
            d = abstractC9459pw.d(abstractC9459pw.b(javaType, cls), this);
        } else {
            d = abstractC9459pw.d(cls, this);
        }
        NameTransformer nameTransformer = this.x;
        if (d.e() && (d instanceof UnwrappingBeanSerializer)) {
            nameTransformer = NameTransformer.b(nameTransformer, ((UnwrappingBeanSerializer) d).a);
        }
        AbstractC9453pq<Object> a = d.a(nameTransformer);
        this.i = this.i.d(cls, a);
        return a;
    }
}
