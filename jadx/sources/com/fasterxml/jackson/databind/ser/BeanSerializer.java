package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Set;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.C9520rD;
import o.C9565rw;

/* loaded from: classes5.dex */
public class BeanSerializer extends BeanSerializerBase {
    private static final long serialVersionUID = 29;

    public BeanSerializer(JavaType javaType, C9565rw c9565rw, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType, c9565rw, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    protected BeanSerializer(BeanSerializerBase beanSerializerBase, C9520rD c9520rD, Object obj) {
        super(beanSerializerBase, c9520rD, obj);
    }

    protected BeanSerializer(BeanSerializerBase beanSerializerBase, Set<String> set) {
        super(beanSerializerBase, set);
    }

    public static BeanSerializer e(JavaType javaType, C9565rw c9565rw) {
        return new BeanSerializer(javaType, c9565rw, BeanSerializerBase.d, null);
    }

    @Override // o.AbstractC9453pq
    public AbstractC9453pq<Object> a(NameTransformer nameTransformer) {
        return new UnwrappingBeanSerializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase b(C9520rD c9520rD) {
        return new BeanSerializer(this, c9520rD, this.h);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase b(Object obj) {
        return new BeanSerializer(this, this.f, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase e(Set<String> set) {
        return new BeanSerializer(this, set);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase a() {
        return (this.f == null && this.b == null && this.h == null) ? new BeanAsArraySerializer(this) : this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public final void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (this.f != null) {
            jsonGenerator.e(obj);
            c(obj, jsonGenerator, abstractC9459pw, true);
            return;
        }
        jsonGenerator.i(obj);
        if (this.h != null) {
            b(obj, jsonGenerator, abstractC9459pw);
        } else {
            c(obj, jsonGenerator, abstractC9459pw);
        }
        jsonGenerator.o();
    }

    public String toString() {
        return "BeanSerializer for " + c().getName();
    }
}
