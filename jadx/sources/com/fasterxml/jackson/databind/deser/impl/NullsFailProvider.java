package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.exc.InvalidNullException;
import java.io.Serializable;
import o.InterfaceC9428pR;

/* loaded from: classes5.dex */
public class NullsFailProvider implements InterfaceC9428pR, Serializable {
    private static final long serialVersionUID = 1;
    protected final PropertyName c;
    protected final JavaType d;

    protected NullsFailProvider(PropertyName propertyName, JavaType javaType) {
        this.c = propertyName;
        this.d = javaType;
    }

    public static NullsFailProvider a(BeanProperty beanProperty) {
        return new NullsFailProvider(beanProperty.b(), beanProperty.d());
    }

    public static NullsFailProvider a(JavaType javaType) {
        return new NullsFailProvider(null, javaType);
    }

    @Override // o.InterfaceC9428pR
    public Object c(DeserializationContext deserializationContext) {
        throw InvalidNullException.d(deserializationContext, this.c, this.d);
    }
}
