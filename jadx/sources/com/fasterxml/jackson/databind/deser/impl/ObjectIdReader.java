package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.Serializable;
import o.AbstractC9452pp;
import o.InterfaceC9317nM;

/* loaded from: classes5.dex */
public class ObjectIdReader implements Serializable {
    private static final long serialVersionUID = 1;
    protected final JavaType a;
    public final PropertyName b;
    protected final AbstractC9452pp<Object> c;
    public final SettableBeanProperty d;
    public final ObjectIdGenerator<?> e;
    public final InterfaceC9317nM j;

    public AbstractC9452pp<Object> b() {
        return this.c;
    }

    public JavaType e() {
        return this.a;
    }

    protected ObjectIdReader(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, AbstractC9452pp<?> abstractC9452pp, SettableBeanProperty settableBeanProperty, InterfaceC9317nM interfaceC9317nM) {
        this.a = javaType;
        this.b = propertyName;
        this.e = objectIdGenerator;
        this.j = interfaceC9317nM;
        this.c = abstractC9452pp;
        this.d = settableBeanProperty;
    }

    public static ObjectIdReader e(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, AbstractC9452pp<?> abstractC9452pp, SettableBeanProperty settableBeanProperty, InterfaceC9317nM interfaceC9317nM) {
        return new ObjectIdReader(javaType, propertyName, objectIdGenerator, abstractC9452pp, settableBeanProperty, interfaceC9317nM);
    }

    public boolean c() {
        return this.e.e();
    }

    public boolean a(String str, JsonParser jsonParser) {
        return this.e.b(str, jsonParser);
    }

    public Object c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return this.c.b(jsonParser, deserializationContext);
    }
}
