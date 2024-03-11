package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9562rt;

/* loaded from: classes5.dex */
public abstract class ArraySerializerBase<T> extends ContainerSerializer<T> implements InterfaceC9562rt {
    public final Boolean a;
    protected final BeanProperty c;

    public abstract AbstractC9453pq<?> d(BeanProperty beanProperty, Boolean bool);

    protected abstract void d(T t, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw);

    public ArraySerializerBase(Class<T> cls) {
        super(cls);
        this.c = null;
        this.a = null;
    }

    public ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase, BeanProperty beanProperty, Boolean bool) {
        super(arraySerializerBase.q, false);
        this.c = beanProperty;
        this.a = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        JsonFormat.Value c;
        Boolean d;
        return (beanProperty == null || (c = c(abstractC9459pw, beanProperty, (Class<?>) c())) == null || (d = c.d(JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) == this.a) ? this : d(beanProperty, d);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void e(T t, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (b(abstractC9459pw) && d((ArraySerializerBase<T>) t)) {
            d((ArraySerializerBase<T>) t, jsonGenerator, abstractC9459pw);
            return;
        }
        jsonGenerator.g(t);
        d((ArraySerializerBase<T>) t, jsonGenerator, abstractC9459pw);
        jsonGenerator.i();
    }

    @Override // o.AbstractC9453pq
    public final void c(T t, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        WritableTypeId b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.d(t, JsonToken.START_ARRAY));
        jsonGenerator.e(t);
        d((ArraySerializerBase<T>) t, jsonGenerator, abstractC9459pw);
        abstractC9544rb.c(jsonGenerator, b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean b(AbstractC9459pw abstractC9459pw) {
        Boolean bool = this.a;
        if (bool == null) {
            return abstractC9459pw.d(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
        }
        return bool.booleanValue();
    }
}
