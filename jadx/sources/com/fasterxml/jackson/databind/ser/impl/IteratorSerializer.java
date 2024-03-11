package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.util.Iterator;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.AbstractC9523rG;
import o.AbstractC9544rb;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class IteratorSerializer extends AsArraySerializerBase<Iterator<?>> {
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    /* renamed from: c */
    public boolean d(Iterator<?> it) {
        return false;
    }

    public IteratorSerializer(JavaType javaType, boolean z, AbstractC9544rb abstractC9544rb) {
        super(Iterator.class, javaType, z, abstractC9544rb, (AbstractC9453pq<Object>) null);
    }

    public IteratorSerializer(IteratorSerializer iteratorSerializer, BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, Boolean bool) {
        super(iteratorSerializer, beanProperty, abstractC9544rb, abstractC9453pq, bool);
    }

    @Override // o.AbstractC9453pq
    /* renamed from: d */
    public boolean c(AbstractC9459pw abstractC9459pw, Iterator<?> it) {
        return !it.hasNext();
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> b(AbstractC9544rb abstractC9544rb) {
        return new IteratorSerializer(this, this.b, abstractC9544rb, this.a, this.h);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* renamed from: c */
    public IteratorSerializer d(BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, Boolean bool) {
        return new IteratorSerializer(this, beanProperty, abstractC9544rb, abstractC9453pq, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public final void e(Iterator<?> it, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.g(it);
        c(it, jsonGenerator, abstractC9459pw);
        jsonGenerator.i();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* renamed from: a */
    public void c(Iterator<?> it, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (it.hasNext()) {
            AbstractC9453pq<Object> abstractC9453pq = this.a;
            if (abstractC9453pq == null) {
                c2(it, jsonGenerator, abstractC9459pw);
                return;
            }
            AbstractC9544rb abstractC9544rb = this.f;
            do {
                Object next = it.next();
                if (next == null) {
                    abstractC9459pw.a(jsonGenerator);
                } else if (abstractC9544rb == null) {
                    abstractC9453pq.e(next, jsonGenerator, abstractC9459pw);
                } else {
                    abstractC9453pq.c(next, jsonGenerator, abstractC9459pw, abstractC9544rb);
                }
            } while (it.hasNext());
        }
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    protected void c2(Iterator<?> it, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        AbstractC9453pq<Object> b;
        AbstractC9544rb abstractC9544rb = this.f;
        AbstractC9523rG abstractC9523rG = this.e;
        do {
            Object next = it.next();
            if (next == null) {
                abstractC9459pw.a(jsonGenerator);
            } else {
                Class<?> cls = next.getClass();
                AbstractC9453pq<Object> c = abstractC9523rG.c(cls);
                if (c == null) {
                    if (this.c.t()) {
                        b = c(abstractC9523rG, abstractC9459pw.b(this.c, cls), abstractC9459pw);
                    } else {
                        b = b(abstractC9523rG, cls, abstractC9459pw);
                    }
                    c = b;
                    abstractC9523rG = this.e;
                }
                if (abstractC9544rb == null) {
                    c.e(next, jsonGenerator, abstractC9459pw);
                } else {
                    c.c(next, jsonGenerator, abstractC9459pw, abstractC9544rb);
                }
            }
        } while (it.hasNext());
    }
}
