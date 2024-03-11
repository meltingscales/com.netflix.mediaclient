package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;

/* loaded from: classes5.dex */
public class ValueInjector extends BeanProperty.Std {
    private static final long serialVersionUID = 1;
    protected final Object h;

    public ValueInjector(PropertyName propertyName, JavaType javaType, AnnotatedMember annotatedMember, Object obj) {
        super(propertyName, javaType, null, annotatedMember, PropertyMetadata.b);
        this.h = obj;
    }

    public Object a(DeserializationContext deserializationContext, Object obj) {
        return deserializationContext.c(this.h, this, obj);
    }

    public void c(DeserializationContext deserializationContext, Object obj) {
        this.b.c(obj, a(deserializationContext, obj));
    }
}
