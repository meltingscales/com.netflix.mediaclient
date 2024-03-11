package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

/* loaded from: classes5.dex */
public class FailingDeserializer extends StdDeserializer<Object> {
    private static final long serialVersionUID = 1;
    protected final String b;

    public FailingDeserializer(String str) {
        super(Object.class);
        this.b = str;
    }

    @Override // o.AbstractC9452pp
    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        deserializationContext.a(this, this.b, new Object[0]);
        return null;
    }
}
