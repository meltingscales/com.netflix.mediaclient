package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import o.AbstractC9543ra;

/* loaded from: classes5.dex */
public class NullifyingDeserializer extends StdDeserializer<Object> {
    public static final NullifyingDeserializer a = new NullifyingDeserializer();
    private static final long serialVersionUID = 1;

    @Override // o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public NullifyingDeserializer() {
        super(Object.class);
    }

    @Override // o.AbstractC9452pp
    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.a(JsonToken.FIELD_NAME)) {
            jsonParser.T();
            return null;
        }
        while (true) {
            JsonToken Q = jsonParser.Q();
            if (Q == null || Q == JsonToken.END_OBJECT) {
                return null;
            }
            jsonParser.T();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        int j = jsonParser.j();
        if (j == 1 || j == 3 || j == 5) {
            return abstractC9543ra.b(jsonParser, deserializationContext);
        }
        return null;
    }
}
