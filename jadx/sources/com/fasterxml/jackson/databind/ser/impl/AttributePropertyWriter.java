package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import o.AbstractC9459pw;
import o.AbstractC9465qB;
import o.C9508qs;
import o.InterfaceC9532rP;

/* loaded from: classes5.dex */
public class AttributePropertyWriter extends VirtualBeanPropertyWriter {
    private static final long serialVersionUID = 1;
    protected final String u;

    protected AttributePropertyWriter(String str, AbstractC9465qB abstractC9465qB, InterfaceC9532rP interfaceC9532rP, JavaType javaType) {
        this(str, abstractC9465qB, interfaceC9532rP, javaType, abstractC9465qB.d());
    }

    protected AttributePropertyWriter(String str, AbstractC9465qB abstractC9465qB, InterfaceC9532rP interfaceC9532rP, JavaType javaType, JsonInclude.Value value) {
        super(abstractC9465qB, interfaceC9532rP, javaType, null, null, null, value, null);
        this.u = str;
    }

    public static AttributePropertyWriter b(String str, AbstractC9465qB abstractC9465qB, InterfaceC9532rP interfaceC9532rP, JavaType javaType) {
        return new AttributePropertyWriter(str, abstractC9465qB, interfaceC9532rP, javaType);
    }

    @Override // com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter
    public VirtualBeanPropertyWriter d(MapperConfig<?> mapperConfig, C9508qs c9508qs, AbstractC9465qB abstractC9465qB, JavaType javaType) {
        throw new IllegalStateException("Should not be called on this type");
    }

    @Override // com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter
    public Object c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        return abstractC9459pw.e(this.u);
    }
}
