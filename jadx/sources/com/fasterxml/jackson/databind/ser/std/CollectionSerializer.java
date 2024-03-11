package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.util.Collection;
import java.util.Iterator;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.AbstractC9523rG;
import o.AbstractC9544rb;

/* loaded from: classes5.dex */
public class CollectionSerializer extends AsArraySerializerBase<Collection<?>> {
    private static final long serialVersionUID = 1;

    public CollectionSerializer(JavaType javaType, boolean z, AbstractC9544rb abstractC9544rb, AbstractC9453pq<Object> abstractC9453pq) {
        super(Collection.class, javaType, z, abstractC9544rb, abstractC9453pq);
    }

    public CollectionSerializer(CollectionSerializer collectionSerializer, BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, Boolean bool) {
        super(collectionSerializer, beanProperty, abstractC9544rb, abstractC9453pq, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> b(AbstractC9544rb abstractC9544rb) {
        return new CollectionSerializer(this, this.b, abstractC9544rb, this.a, this.h);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* renamed from: a */
    public CollectionSerializer d(BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, Boolean bool) {
        return new CollectionSerializer(this, beanProperty, abstractC9544rb, abstractC9453pq, bool);
    }

    @Override // o.AbstractC9453pq
    public boolean c(AbstractC9459pw abstractC9459pw, Collection<?> collection) {
        return collection.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    /* renamed from: e */
    public boolean d(Collection<?> collection) {
        return collection.size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: a */
    public final void e(Collection<?> collection, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        int size = collection.size();
        if (size == 1 && ((this.h == null && abstractC9459pw.d(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.h == Boolean.TRUE)) {
            c(collection, jsonGenerator, abstractC9459pw);
            return;
        }
        jsonGenerator.e(collection, size);
        c(collection, jsonGenerator, abstractC9459pw);
        jsonGenerator.i();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* renamed from: e */
    public void c(Collection<?> collection, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        AbstractC9453pq<Object> b;
        jsonGenerator.e(collection);
        AbstractC9453pq<Object> abstractC9453pq = this.a;
        if (abstractC9453pq != null) {
            b(collection, jsonGenerator, abstractC9459pw, abstractC9453pq);
            return;
        }
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            AbstractC9523rG abstractC9523rG = this.e;
            AbstractC9544rb abstractC9544rb = this.f;
            int i = 0;
            do {
                try {
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
                    i++;
                } catch (Exception e) {
                    d(abstractC9459pw, e, collection, i);
                    return;
                }
            } while (it.hasNext());
        }
    }

    public void b(Collection<?> collection, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9453pq<Object> abstractC9453pq) {
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            AbstractC9544rb abstractC9544rb = this.f;
            int i = 0;
            do {
                Object next = it.next();
                if (next == null) {
                    try {
                        abstractC9459pw.a(jsonGenerator);
                    } catch (Exception e) {
                        d(abstractC9459pw, e, collection, i);
                    }
                } else if (abstractC9544rb == null) {
                    abstractC9453pq.e(next, jsonGenerator, abstractC9459pw);
                } else {
                    abstractC9453pq.c(next, jsonGenerator, abstractC9459pw, abstractC9544rb);
                }
                i++;
            } while (it.hasNext());
        }
    }
}
