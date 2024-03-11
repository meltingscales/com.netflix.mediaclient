package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.Serializable;
import java.util.Collection;
import o.AbstractC9452pp;
import o.AbstractC9543ra;

/* loaded from: classes5.dex */
public final class TypeWrappedDeserializer extends AbstractC9452pp<Object> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final AbstractC9452pp<Object> c;
    protected final AbstractC9543ra d;

    public TypeWrappedDeserializer(AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp) {
        this.d = abstractC9543ra;
        this.c = abstractC9452pp;
    }

    @Override // o.AbstractC9452pp
    public Class<?> c() {
        return this.c.c();
    }

    @Override // o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        return this.c.a(deserializationConfig);
    }

    @Override // o.AbstractC9452pp
    public Collection<Object> d() {
        return this.c.d();
    }

    @Override // o.AbstractC9452pp, o.InterfaceC9428pR
    public Object c(DeserializationContext deserializationContext) {
        return this.c.c(deserializationContext);
    }

    @Override // o.AbstractC9452pp
    public Object d(DeserializationContext deserializationContext) {
        return this.c.d(deserializationContext);
    }

    @Override // o.AbstractC9452pp
    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return this.c.a(jsonParser, deserializationContext, this.d);
    }

    @Override // o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    @Override // o.AbstractC9452pp
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return this.c.e(jsonParser, deserializationContext, obj);
    }
}
