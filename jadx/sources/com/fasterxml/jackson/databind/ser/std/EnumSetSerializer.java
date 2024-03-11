package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.EnumSet;
import java.util.Iterator;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.AbstractC9544rb;

/* loaded from: classes5.dex */
public class EnumSetSerializer extends AsArraySerializerBase<EnumSet<? extends Enum<?>>> {
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    /* renamed from: d */
    public EnumSetSerializer b(AbstractC9544rb abstractC9544rb) {
        return this;
    }

    public EnumSetSerializer(JavaType javaType) {
        super((Class<?>) EnumSet.class, javaType, true, (AbstractC9544rb) null, (AbstractC9453pq<Object>) null);
    }

    public EnumSetSerializer(EnumSetSerializer enumSetSerializer, BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, Boolean bool) {
        super(enumSetSerializer, beanProperty, abstractC9544rb, abstractC9453pq, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* renamed from: a */
    public EnumSetSerializer d(BeanProperty beanProperty, AbstractC9544rb abstractC9544rb, AbstractC9453pq<?> abstractC9453pq, Boolean bool) {
        return new EnumSetSerializer(this, beanProperty, abstractC9544rb, abstractC9453pq, bool);
    }

    @Override // o.AbstractC9453pq
    /* renamed from: a */
    public boolean c(AbstractC9459pw abstractC9459pw, EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean d(EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: b */
    public final void e(EnumSet<? extends Enum<?>> enumSet, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        int size = enumSet.size();
        if (size == 1 && ((this.h == null && abstractC9459pw.d(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.h == Boolean.TRUE)) {
            c(enumSet, jsonGenerator, abstractC9459pw);
            return;
        }
        jsonGenerator.e(enumSet, size);
        c(enumSet, jsonGenerator, abstractC9459pw);
        jsonGenerator.i();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void c(EnumSet<? extends Enum<?>> enumSet, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        AbstractC9453pq<Object> abstractC9453pq = this.a;
        Iterator<E> it = enumSet.iterator();
        while (it.hasNext()) {
            Enum r1 = (Enum) it.next();
            if (abstractC9453pq == null) {
                abstractC9453pq = abstractC9459pw.d(r1.getDeclaringClass(), this.b);
            }
            abstractC9453pq.e(r1, jsonGenerator, abstractC9459pw);
        }
    }
}
