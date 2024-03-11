package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.C9537rU;
import o.InterfaceC9420pJ;
import o.InterfaceC9429pS;
import o.InterfaceC9535rS;

/* loaded from: classes5.dex */
public class StdDelegatingDeserializer<T> extends StdDeserializer<T> implements InterfaceC9420pJ, InterfaceC9429pS {
    private static final long serialVersionUID = 1;
    protected final InterfaceC9535rS<Object, T> b;
    protected final JavaType c;
    protected final AbstractC9452pp<Object> d;

    public StdDelegatingDeserializer(InterfaceC9535rS<?, T> interfaceC9535rS) {
        super(Object.class);
        this.b = interfaceC9535rS;
        this.c = null;
        this.d = null;
    }

    public StdDelegatingDeserializer(InterfaceC9535rS<Object, T> interfaceC9535rS, JavaType javaType, AbstractC9452pp<?> abstractC9452pp) {
        super(javaType);
        this.b = interfaceC9535rS;
        this.c = javaType;
        this.d = abstractC9452pp;
    }

    protected StdDelegatingDeserializer<T> c(InterfaceC9535rS<Object, T> interfaceC9535rS, JavaType javaType, AbstractC9452pp<?> abstractC9452pp) {
        C9537rU.c(StdDelegatingDeserializer.class, this, "withDelegate");
        return new StdDelegatingDeserializer<>(interfaceC9535rS, javaType, abstractC9452pp);
    }

    @Override // o.InterfaceC9429pS
    public void b(DeserializationContext deserializationContext) {
        AbstractC9452pp<Object> abstractC9452pp = this.d;
        if (abstractC9452pp == null || !(abstractC9452pp instanceof InterfaceC9429pS)) {
            return;
        }
        ((InterfaceC9429pS) abstractC9452pp).b(deserializationContext);
    }

    @Override // o.InterfaceC9420pJ
    public AbstractC9452pp<?> c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        AbstractC9452pp<?> abstractC9452pp = this.d;
        if (abstractC9452pp != null) {
            AbstractC9452pp<?> e = deserializationContext.e(abstractC9452pp, beanProperty, this.c);
            return e != this.d ? c(this.b, this.c, e) : this;
        }
        JavaType d = this.b.d(deserializationContext.e());
        return c(this.b, d, deserializationContext.c(d, beanProperty));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Class<?> c() {
        return this.d.c();
    }

    @Override // o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        return this.d.a(deserializationConfig);
    }

    @Override // o.AbstractC9452pp
    public T b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object b = this.d.b(jsonParser, deserializationContext);
        if (b == null) {
            return null;
        }
        return b(b);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        Object b = this.d.b(jsonParser, deserializationContext);
        if (b == null) {
            return null;
        }
        return b(b);
    }

    @Override // o.AbstractC9452pp
    public T e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        if (this.c.h().isAssignableFrom(obj.getClass())) {
            return (T) this.d.e(jsonParser, deserializationContext, obj);
        }
        return (T) c(jsonParser, deserializationContext, obj);
    }

    protected Object c(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        throw new UnsupportedOperationException(String.format("Cannot update object of type %s (using deserializer for type %s)" + obj.getClass().getName(), this.c));
    }

    protected T b(Object obj) {
        return this.b.d((InterfaceC9535rS<Object, T>) obj);
    }
}
