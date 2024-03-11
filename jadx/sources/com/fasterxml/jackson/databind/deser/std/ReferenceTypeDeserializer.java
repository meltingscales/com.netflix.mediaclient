package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.util.AccessPattern;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.InterfaceC9420pJ;

/* loaded from: classes5.dex */
public abstract class ReferenceTypeDeserializer<T> extends StdDeserializer<T> implements InterfaceC9420pJ {
    private static final long serialVersionUID = 2;
    protected final AbstractC9543ra a;
    protected final ValueInstantiator b;
    protected final AbstractC9452pp<Object> c;
    protected final JavaType d;

    @Override // o.AbstractC9452pp, o.InterfaceC9428pR
    public abstract T c(DeserializationContext deserializationContext);

    public abstract Object c(T t);

    protected abstract ReferenceTypeDeserializer<T> e(AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp);

    public abstract T e(Object obj);

    public abstract T e(T t, Object obj);

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType g() {
        return this.d;
    }

    public ReferenceTypeDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp) {
        super(javaType);
        this.b = valueInstantiator;
        this.d = javaType;
        this.c = abstractC9452pp;
        this.a = abstractC9543ra;
    }

    @Override // o.InterfaceC9420pJ
    public AbstractC9452pp<?> c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        AbstractC9452pp<?> e;
        AbstractC9452pp<?> abstractC9452pp = this.c;
        if (abstractC9452pp == null) {
            e = deserializationContext.c(this.d.c(), beanProperty);
        } else {
            e = deserializationContext.e(abstractC9452pp, beanProperty, this.d.c());
        }
        AbstractC9543ra abstractC9543ra = this.a;
        if (abstractC9543ra != null) {
            abstractC9543ra = abstractC9543ra.d(beanProperty);
        }
        return (e == this.c && abstractC9543ra == this.a) ? this : e(abstractC9543ra, e);
    }

    @Override // o.AbstractC9452pp
    public AccessPattern a() {
        return AccessPattern.DYNAMIC;
    }

    @Override // o.AbstractC9452pp
    public Object d(DeserializationContext deserializationContext) {
        return c(deserializationContext);
    }

    @Override // o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        AbstractC9452pp<Object> abstractC9452pp = this.c;
        if (abstractC9452pp == null) {
            return null;
        }
        return abstractC9452pp.a(deserializationConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC9452pp
    public T b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object a;
        ValueInstantiator valueInstantiator = this.b;
        if (valueInstantiator != null) {
            return (T) e(jsonParser, deserializationContext, valueInstantiator.e(deserializationContext));
        }
        AbstractC9543ra abstractC9543ra = this.a;
        if (abstractC9543ra == null) {
            a = this.c.b(jsonParser, deserializationContext);
        } else {
            a = this.c.a(jsonParser, deserializationContext, abstractC9543ra);
        }
        return (T) e(a);
    }

    @Override // o.AbstractC9452pp
    public T e(JsonParser jsonParser, DeserializationContext deserializationContext, T t) {
        Object a;
        Object a2;
        if (this.c.a(deserializationContext.c()).equals(Boolean.FALSE) || this.a != null) {
            AbstractC9543ra abstractC9543ra = this.a;
            if (abstractC9543ra == null) {
                a = this.c.b(jsonParser, deserializationContext);
            } else {
                a = this.c.a(jsonParser, deserializationContext, abstractC9543ra);
            }
        } else {
            Object c = c((ReferenceTypeDeserializer<T>) t);
            if (c == null) {
                AbstractC9543ra abstractC9543ra2 = this.a;
                if (abstractC9543ra2 == null) {
                    a2 = this.c.b(jsonParser, deserializationContext);
                } else {
                    a2 = this.c.a(jsonParser, deserializationContext, abstractC9543ra2);
                }
                return e(a2);
            }
            a = this.c.e(jsonParser, deserializationContext, c);
        }
        return e((ReferenceTypeDeserializer<T>) t, a);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        if (jsonParser.a(JsonToken.VALUE_NULL)) {
            return c(deserializationContext);
        }
        AbstractC9543ra abstractC9543ra2 = this.a;
        if (abstractC9543ra2 == null) {
            return b(jsonParser, deserializationContext);
        }
        return e(abstractC9543ra2.b(jsonParser, deserializationContext));
    }
}
