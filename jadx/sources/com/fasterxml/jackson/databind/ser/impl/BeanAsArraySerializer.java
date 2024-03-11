package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Set;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.C9520rD;

/* loaded from: classes5.dex */
public class BeanAsArraySerializer extends BeanSerializerBase {
    private static final long serialVersionUID = 1;
    protected final BeanSerializerBase e;

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase a() {
        return this;
    }

    @Override // o.AbstractC9453pq
    public boolean e() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public /* synthetic */ BeanSerializerBase e(Set set) {
        return d((Set<String>) set);
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase) {
        super(beanSerializerBase, (C9520rD) null);
        this.e = beanSerializerBase;
    }

    protected BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, Set<String> set) {
        super(beanSerializerBase, set);
        this.e = beanSerializerBase;
    }

    protected BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, C9520rD c9520rD, Object obj) {
        super(beanSerializerBase, c9520rD, obj);
        this.e = beanSerializerBase;
    }

    @Override // o.AbstractC9453pq
    public AbstractC9453pq<Object> a(NameTransformer nameTransformer) {
        return this.e.a(nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase b(C9520rD c9520rD) {
        return this.e.b(c9520rD);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase b(Object obj) {
        return new BeanAsArraySerializer(this, this.f, obj);
    }

    protected BeanAsArraySerializer d(Set<String> set) {
        return new BeanAsArraySerializer(this, set);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, o.AbstractC9453pq
    public void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        if (this.f != null) {
            a(obj, jsonGenerator, abstractC9459pw, abstractC9544rb);
            return;
        }
        WritableTypeId d = d(abstractC9544rb, obj, JsonToken.START_ARRAY);
        abstractC9544rb.b(jsonGenerator, d);
        jsonGenerator.e(obj);
        a(obj, jsonGenerator, abstractC9459pw);
        abstractC9544rb.c(jsonGenerator, d);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public final void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (abstractC9459pw.d(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && d(abstractC9459pw)) {
            a(obj, jsonGenerator, abstractC9459pw);
            return;
        }
        jsonGenerator.g(obj);
        a(obj, jsonGenerator, abstractC9459pw);
        jsonGenerator.i();
    }

    private boolean d(AbstractC9459pw abstractC9459pw) {
        return ((this.g == null || abstractC9459pw.a() == null) ? this.i : this.g).length == 1;
    }

    protected final void a(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        BeanPropertyWriter[] beanPropertyWriterArr = (this.g == null || abstractC9459pw.a() == null) ? this.i : this.g;
        int i = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter == null) {
                    jsonGenerator.k();
                } else {
                    beanPropertyWriter.b(obj, jsonGenerator, abstractC9459pw);
                }
                i++;
            }
        } catch (Exception e) {
            d(abstractC9459pw, e, obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].a() : "[anySetter]");
        } catch (StackOverflowError e2) {
            JsonMappingException a = JsonMappingException.a(jsonGenerator, "Infinite recursion (StackOverflowError)", e2);
            a.c(new JsonMappingException.Reference(obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].a() : "[anySetter]"));
            throw a;
        }
    }

    public String toString() {
        return "BeanAsArraySerializer for " + c().getName();
    }
}
