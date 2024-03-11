package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9480qQ;

/* loaded from: classes5.dex */
public class MapProperty extends PropertyWriter {
    private static final BeanProperty h = new BeanProperty.c();
    private static final long serialVersionUID = 1;
    protected final BeanProperty a;
    protected AbstractC9453pq<Object> b;
    protected Object d;
    protected Object f;
    protected final AbstractC9544rb g;
    protected AbstractC9453pq<Object> i;

    public void b(Object obj, Object obj2, AbstractC9453pq<Object> abstractC9453pq, AbstractC9453pq<Object> abstractC9453pq2) {
        this.d = obj;
        this.f = obj2;
        this.b = abstractC9453pq;
        this.i = abstractC9453pq2;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    @Deprecated
    public void e(ObjectNode objectNode, AbstractC9459pw abstractC9459pw) {
    }

    public MapProperty(AbstractC9544rb abstractC9544rb, BeanProperty beanProperty) {
        super(beanProperty == null ? PropertyMetadata.c : beanProperty.c());
        this.g = abstractC9544rb;
        this.a = beanProperty == null ? h : beanProperty;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty, o.InterfaceC9539rW
    public String a() {
        Object obj = this.d;
        if (obj instanceof String) {
            return (String) obj;
        }
        return String.valueOf(obj);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public PropertyName b() {
        return new PropertyName(a());
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void d(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        this.b.e(this.d, jsonGenerator, abstractC9459pw);
        AbstractC9544rb abstractC9544rb = this.g;
        if (abstractC9544rb == null) {
            this.i.e(this.f, jsonGenerator, abstractC9459pw);
        } else {
            this.i.c(this.f, jsonGenerator, abstractC9459pw, abstractC9544rb);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (jsonGenerator.d()) {
            return;
        }
        jsonGenerator.e(a());
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public void d(InterfaceC9480qQ interfaceC9480qQ, AbstractC9459pw abstractC9459pw) {
        this.a.d(interfaceC9480qQ, abstractC9459pw);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JavaType d() {
        return this.a.d();
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember e() {
        return this.a.e();
    }
}
