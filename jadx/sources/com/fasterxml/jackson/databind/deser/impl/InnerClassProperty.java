package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import java.lang.reflect.Constructor;
import o.AbstractC9543ra;
import o.C9537rU;

/* loaded from: classes5.dex */
public final class InnerClassProperty extends SettableBeanProperty.Delegating {
    private static final long serialVersionUID = 1;
    protected AnnotatedConstructor a;
    protected final transient Constructor<?> d;

    public InnerClassProperty(SettableBeanProperty settableBeanProperty, Constructor<?> constructor) {
        super(settableBeanProperty);
        this.d = constructor;
    }

    protected InnerClassProperty(SettableBeanProperty settableBeanProperty, AnnotatedConstructor annotatedConstructor) {
        super(settableBeanProperty);
        this.a = annotatedConstructor;
        Constructor<?> b = annotatedConstructor == null ? null : annotatedConstructor.b();
        this.d = b;
        if (b == null) {
            throw new IllegalArgumentException("Missing constructor (broken JDK (de)serialization?)");
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
    public SettableBeanProperty d(SettableBeanProperty settableBeanProperty) {
        return settableBeanProperty == this.b ? this : new InnerClassProperty(settableBeanProperty, this.d);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object obj2;
        Object obj3;
        if (jsonParser.f() == JsonToken.VALUE_NULL) {
            obj3 = this.p.c(deserializationContext);
        } else {
            AbstractC9543ra abstractC9543ra = this.q;
            if (abstractC9543ra != null) {
                obj3 = this.p.a(jsonParser, deserializationContext, abstractC9543ra);
            } else {
                try {
                    obj2 = this.d.newInstance(obj);
                } catch (Exception e) {
                    C9537rU.e(e, String.format("Failed to instantiate class %s, problem: %s", this.d.getDeclaringClass().getName(), e.getMessage()));
                    obj2 = null;
                }
                this.p.e(jsonParser, deserializationContext, obj2);
                obj3 = obj2;
            }
        }
        e(obj, obj3);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return c(obj, a(jsonParser, deserializationContext));
    }

    Object readResolve() {
        return new InnerClassProperty(this, this.a);
    }

    Object writeReplace() {
        return this.a == null ? new InnerClassProperty(this, new AnnotatedConstructor(null, this.d, null, null)) : this;
    }
}
