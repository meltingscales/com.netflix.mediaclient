package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.util.Collection;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9458pv;
import o.InterfaceC9476qM;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class StringCollectionSerializer extends StaticListSerializerBase<Collection<String>> {
    public static final StringCollectionSerializer d = new StringCollectionSerializer();

    protected StringCollectionSerializer() {
        super(Collection.class);
    }

    protected StringCollectionSerializer(StringCollectionSerializer stringCollectionSerializer, Boolean bool) {
        super(stringCollectionSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public AbstractC9453pq<?> b(BeanProperty beanProperty, Boolean bool) {
        return new StringCollectionSerializer(this, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public AbstractC9454pr a() {
        return d("string", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public void c(InterfaceC9476qM interfaceC9476qM) {
        interfaceC9476qM.d(JsonFormatTypes.STRING);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: a */
    public void e(Collection<String> collection, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        int size = collection.size();
        if (size == 1 && ((this.e == null && abstractC9459pw.d(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.e == Boolean.TRUE)) {
            e(collection, jsonGenerator, abstractC9459pw);
            return;
        }
        jsonGenerator.e(collection, size);
        e(collection, jsonGenerator, abstractC9459pw);
        jsonGenerator.i();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase, o.AbstractC9453pq
    /* renamed from: a */
    public void c(Collection<String> collection, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        WritableTypeId b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.d(collection, JsonToken.START_ARRAY));
        jsonGenerator.e(collection);
        e(collection, jsonGenerator, abstractC9459pw);
        abstractC9544rb.c(jsonGenerator, b);
    }

    private final void e(Collection<String> collection, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        int i = 0;
        try {
            for (String str : collection) {
                if (str == null) {
                    abstractC9459pw.a(jsonGenerator);
                } else {
                    jsonGenerator.i(str);
                }
                i++;
            }
        } catch (Exception e) {
            d(abstractC9459pw, e, collection, i);
        }
    }
}
