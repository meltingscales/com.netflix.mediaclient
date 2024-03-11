package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.util.List;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.AbstractC9523rG;
import o.AbstractC9544rb;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public final class IndexedListSerializer extends AsArraySerializerBase<List<?>> {
    private static final long serialVersionUID = 1;

    public IndexedListSerializer(JavaType javaType, boolean z, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq) {
        super(List.class, javaType, z, abstractC9544rb, abstractC9453pq);
    }

    public IndexedListSerializer(IndexedListSerializer indexedListSerializer, BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, Boolean bool) {
        super(indexedListSerializer, beanProperty, abstractC9544rb, abstractC9453pq, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* renamed from: a */
    public IndexedListSerializer d(BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, Boolean bool) {
        return new IndexedListSerializer(this, beanProperty, abstractC9544rb, abstractC9453pq, bool);
    }

    @Override // o.AbstractC9453pq
    /* renamed from: d */
    public boolean c(AbstractC9459pw abstractC9459pw, List<?> list) {
        return list.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    /* renamed from: e */
    public boolean d(List<?> list) {
        return list.size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> b(AbstractC9544rb abstractC9544rb) {
        return new IndexedListSerializer(this, this.b, abstractC9544rb, this.a, this.h);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public final void e(List<?> list, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        int size = list.size();
        if (size == 1 && ((this.h == null && abstractC9459pw.d(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.h == Boolean.TRUE)) {
            c(list, jsonGenerator, abstractC9459pw);
            return;
        }
        jsonGenerator.e(list, size);
        c(list, jsonGenerator, abstractC9459pw);
        jsonGenerator.i();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* renamed from: d */
    public void c(List<?> list, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        AbstractC9453pq<Object> b;
        AbstractC9453pq<Object> abstractC9453pq = this.a;
        if (abstractC9453pq != null) {
            b(list, jsonGenerator, abstractC9459pw, abstractC9453pq);
        } else if (this.f != null) {
            b(list, jsonGenerator, abstractC9459pw);
        } else {
            int size = list.size();
            if (size == 0) {
                return;
            }
            int i = 0;
            try {
                AbstractC9523rG abstractC9523rG = this.e;
                while (i < size) {
                    Object obj = list.get(i);
                    if (obj == null) {
                        abstractC9459pw.a(jsonGenerator);
                    } else {
                        Class<?> cls = obj.getClass();
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
                        c.e(obj, jsonGenerator, abstractC9459pw);
                    }
                    i++;
                }
            } catch (Exception e) {
                d(abstractC9459pw, e, list, i);
            }
        }
    }

    public void b(List<?> list, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9453pq<Object> abstractC9453pq) {
        int size = list.size();
        if (size == 0) {
            return;
        }
        AbstractC9544rb abstractC9544rb = this.f;
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj == null) {
                try {
                    abstractC9459pw.a(jsonGenerator);
                } catch (Exception e) {
                    d(abstractC9459pw, e, list, i);
                }
            } else if (abstractC9544rb == null) {
                abstractC9453pq.e(obj, jsonGenerator, abstractC9459pw);
            } else {
                abstractC9453pq.c(obj, jsonGenerator, abstractC9459pw, abstractC9544rb);
            }
        }
    }

    public void b(List<?> list, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        AbstractC9453pq<Object> b;
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i = 0;
        try {
            AbstractC9544rb abstractC9544rb = this.f;
            AbstractC9523rG abstractC9523rG = this.e;
            while (i < size) {
                Object obj = list.get(i);
                if (obj == null) {
                    abstractC9459pw.a(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
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
                    c.c(obj, jsonGenerator, abstractC9459pw, abstractC9544rb);
                }
                i++;
            }
        } catch (Exception e) {
            d(abstractC9459pw, e, list, i);
        }
    }
}
