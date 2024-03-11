package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.util.AccessPattern;
import o.AbstractC9543ra;

/* loaded from: classes5.dex */
public abstract class StdScalarDeserializer<T> extends StdDeserializer<T> {
    private static final long serialVersionUID = 1;

    @Override // o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public StdScalarDeserializer(Class<?> cls) {
        super(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public StdScalarDeserializer(StdScalarDeserializer<?> stdScalarDeserializer) {
        super(stdScalarDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        return abstractC9543ra.e(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC9452pp
    public T e(JsonParser jsonParser, DeserializationContext deserializationContext, T t) {
        deserializationContext.b(this);
        return b(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC9452pp
    public AccessPattern a() {
        return AccessPattern.CONSTANT;
    }
}
