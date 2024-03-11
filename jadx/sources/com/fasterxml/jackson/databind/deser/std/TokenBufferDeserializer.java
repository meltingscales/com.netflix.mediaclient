package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import o.C9542rZ;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class TokenBufferDeserializer extends StdScalarDeserializer<C9542rZ> {
    private static final long serialVersionUID = 1;

    public TokenBufferDeserializer() {
        super(C9542rZ.class);
    }

    @Override // o.AbstractC9452pp
    /* renamed from: c */
    public C9542rZ b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return d(jsonParser).e(jsonParser, deserializationContext);
    }

    protected C9542rZ d(JsonParser jsonParser) {
        return new C9542rZ(jsonParser);
    }
}
