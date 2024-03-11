package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import o.AbstractC9543ra;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class StringDeserializer extends StdScalarDeserializer<String> {
    public static final StringDeserializer e = new StringDeserializer();
    private static final long serialVersionUID = 1;

    @Override // o.AbstractC9452pp
    public Object d(DeserializationContext deserializationContext) {
        return "";
    }

    @Override // o.AbstractC9452pp
    public boolean i() {
        return true;
    }

    public StringDeserializer() {
        super(String.class);
    }

    @Override // o.AbstractC9452pp
    /* renamed from: a */
    public String b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String L;
        if (jsonParser.a(JsonToken.VALUE_STRING)) {
            return jsonParser.A();
        }
        JsonToken f = jsonParser.f();
        if (f == JsonToken.START_ARRAY) {
            return q(jsonParser, deserializationContext);
        }
        if (f != JsonToken.VALUE_EMBEDDED_OBJECT) {
            return (!f.b() || (L = jsonParser.L()) == null) ? (String) deserializationContext.e(this.B, jsonParser) : L;
        }
        Object q = jsonParser.q();
        if (q == null) {
            return null;
        }
        if (q instanceof byte[]) {
            return deserializationContext.h().a((byte[]) q, false);
        }
        return q.toString();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    /* renamed from: c */
    public String a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        return b(jsonParser, deserializationContext);
    }
}
