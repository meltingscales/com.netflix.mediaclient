package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.util.List;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9458pv;
import o.InterfaceC9476qM;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public final class IndexedStringListSerializer extends StaticListSerializerBase<List<String>> {
    public static final IndexedStringListSerializer d = new IndexedStringListSerializer();
    private static final long serialVersionUID = 1;

    protected IndexedStringListSerializer() {
        super(List.class);
    }

    public IndexedStringListSerializer(IndexedStringListSerializer indexedStringListSerializer, Boolean bool) {
        super(indexedStringListSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public AbstractC9453pq<?> b(BeanProperty beanProperty, Boolean bool) {
        return new IndexedStringListSerializer(this, bool);
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
    public void e(List<String> list, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        int size = list.size();
        if (size == 1 && ((this.e == null && abstractC9459pw.d(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.e == Boolean.TRUE)) {
            a(list, jsonGenerator, abstractC9459pw, 1);
            return;
        }
        jsonGenerator.e(list, size);
        a(list, jsonGenerator, abstractC9459pw, size);
        jsonGenerator.i();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase, o.AbstractC9453pq
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(List<String> list, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        WritableTypeId b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.d(list, JsonToken.START_ARRAY));
        jsonGenerator.e(list);
        a(list, jsonGenerator, abstractC9459pw, list.size());
        abstractC9544rb.c(jsonGenerator, b);
    }

    private final void a(List<String> list, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            try {
                String str = list.get(i2);
                if (str == null) {
                    abstractC9459pw.a(jsonGenerator);
                } else {
                    jsonGenerator.i(str);
                }
            } catch (Exception e) {
                d(abstractC9459pw, e, list, i2);
                return;
            }
        }
    }
}
