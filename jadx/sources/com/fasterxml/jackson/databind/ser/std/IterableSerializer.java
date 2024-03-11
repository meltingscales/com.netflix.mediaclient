package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.util.Iterator;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class IterableSerializer extends AsArraySerializerBase<Iterable<?>> {
    public IterableSerializer(JavaType javaType, boolean z, AbstractC9544rb abstractC9544rb) {
        super(Iterable.class, javaType, z, abstractC9544rb, (AbstractC9453pq<Object>) null);
    }

    public IterableSerializer(IterableSerializer iterableSerializer, BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, Boolean bool) {
        super(iterableSerializer, beanProperty, abstractC9544rb, abstractC9453pq, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> b(AbstractC9544rb abstractC9544rb) {
        return new IterableSerializer(this, this.b, abstractC9544rb, this.a, this.h);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* renamed from: e */
    public IterableSerializer d(BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, Boolean bool) {
        return new IterableSerializer(this, beanProperty, abstractC9544rb, abstractC9453pq, bool);
    }

    @Override // o.AbstractC9453pq
    /* renamed from: e */
    public boolean c(AbstractC9459pw abstractC9459pw, Iterable<?> iterable) {
        return !iterable.iterator().hasNext();
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    /* renamed from: b */
    public boolean d(Iterable<?> iterable) {
        if (iterable != null) {
            Iterator<?> it = iterable.iterator();
            if (it.hasNext()) {
                it.next();
                return !it.hasNext();
            }
            return false;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public final void e(Iterable<?> iterable, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (((this.h == null && abstractC9459pw.d(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.h == Boolean.TRUE) && d(iterable)) {
            c(iterable, jsonGenerator, abstractC9459pw);
            return;
        }
        jsonGenerator.g(iterable);
        c(iterable, jsonGenerator, abstractC9459pw);
        jsonGenerator.i();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* renamed from: a */
    public void c(Iterable<?> iterable, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        Iterator<?> it = iterable.iterator();
        if (it.hasNext()) {
            AbstractC9544rb abstractC9544rb = this.f;
            Class<?> cls = null;
            AbstractC9453pq<Object> abstractC9453pq = null;
            do {
                Object next = it.next();
                if (next == null) {
                    abstractC9459pw.a(jsonGenerator);
                } else {
                    AbstractC9453pq<Object> abstractC9453pq2 = this.a;
                    if (abstractC9453pq2 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            abstractC9453pq = abstractC9459pw.d(cls2, this.b);
                            cls = cls2;
                        }
                        abstractC9453pq2 = abstractC9453pq;
                    }
                    if (abstractC9544rb == null) {
                        abstractC9453pq2.e(next, jsonGenerator, abstractC9459pw);
                    } else {
                        abstractC9453pq2.c(next, jsonGenerator, abstractC9459pw, abstractC9544rb);
                    }
                }
            } while (it.hasNext());
        }
    }
}
