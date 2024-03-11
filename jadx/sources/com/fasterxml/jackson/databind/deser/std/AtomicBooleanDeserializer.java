package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public class AtomicBooleanDeserializer extends StdScalarDeserializer<AtomicBoolean> {
    private static final long serialVersionUID = 1;

    public AtomicBooleanDeserializer() {
        super(AtomicBoolean.class);
    }

    @Override // o.AbstractC9452pp
    /* renamed from: a */
    public AtomicBoolean b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return new AtomicBoolean(x(jsonParser, deserializationContext));
    }
}
