package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.util.Set;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.C9520rD;

/* loaded from: classes5.dex */
public class UnwrappingBeanSerializer extends BeanSerializerBase implements Serializable {
    private static final long serialVersionUID = 1;
    protected final NameTransformer a;

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase a() {
        return this;
    }

    @Override // o.AbstractC9453pq
    public boolean e() {
        return true;
    }

    public UnwrappingBeanSerializer(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        super(beanSerializerBase, nameTransformer);
        this.a = nameTransformer;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, C9520rD c9520rD) {
        super(unwrappingBeanSerializer, c9520rD);
        this.a = unwrappingBeanSerializer.a;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, C9520rD c9520rD, Object obj) {
        super(unwrappingBeanSerializer, c9520rD, obj);
        this.a = unwrappingBeanSerializer.a;
    }

    protected UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, Set<String> set) {
        super(unwrappingBeanSerializer, set);
        this.a = unwrappingBeanSerializer.a;
    }

    @Override // o.AbstractC9453pq
    public AbstractC9453pq<Object> a(NameTransformer nameTransformer) {
        return new UnwrappingBeanSerializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase b(C9520rD c9520rD) {
        return new UnwrappingBeanSerializer(this, c9520rD);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase b(Object obj) {
        return new UnwrappingBeanSerializer(this, this.f, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase e(Set<String> set) {
        return new UnwrappingBeanSerializer(this, set);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public final void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        jsonGenerator.e(obj);
        if (this.f != null) {
            c(obj, jsonGenerator, abstractC9459pw, false);
        } else if (this.h != null) {
            b(obj, jsonGenerator, abstractC9459pw);
        } else {
            c(obj, jsonGenerator, abstractC9459pw);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, o.AbstractC9453pq
    public void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        if (abstractC9459pw.d(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            abstractC9459pw.c(c(), "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
        }
        jsonGenerator.e(obj);
        if (this.f != null) {
            a(obj, jsonGenerator, abstractC9459pw, abstractC9544rb);
        } else if (this.h != null) {
            b(obj, jsonGenerator, abstractC9459pw);
        } else {
            c(obj, jsonGenerator, abstractC9459pw);
        }
    }

    public String toString() {
        return "UnwrappingBeanSerializer for " + c().getName();
    }
}
