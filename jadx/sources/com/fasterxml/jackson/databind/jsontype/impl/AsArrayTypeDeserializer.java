package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.C9440pd;
import o.C9542rZ;
import o.InterfaceC9545rc;

/* loaded from: classes5.dex */
public class AsArrayTypeDeserializer extends TypeDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;

    protected boolean e() {
        return false;
    }

    public AsArrayTypeDeserializer(JavaType javaType, InterfaceC9545rc interfaceC9545rc, String str, boolean z, JavaType javaType2) {
        super(javaType, interfaceC9545rc, str, z, javaType2);
    }

    public AsArrayTypeDeserializer(AsArrayTypeDeserializer asArrayTypeDeserializer, BeanProperty beanProperty) {
        super(asArrayTypeDeserializer, beanProperty);
    }

    @Override // o.AbstractC9543ra
    public AbstractC9543ra d(BeanProperty beanProperty) {
        return beanProperty == this.f ? this : new AsArrayTypeDeserializer(this, beanProperty);
    }

    @Override // o.AbstractC9543ra
    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.WRAPPER_ARRAY;
    }

    @Override // o.AbstractC9543ra
    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return c(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC9543ra
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return c(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC9543ra
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return c(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC9543ra
    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return c(jsonParser, deserializationContext);
    }

    protected Object c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object F;
        if (jsonParser.c() && (F = jsonParser.F()) != null) {
            return e(jsonParser, deserializationContext, F);
        }
        boolean J2 = jsonParser.J();
        String h = h(jsonParser, deserializationContext);
        AbstractC9452pp<Object> a = a(deserializationContext, h);
        if (this.g && !e() && jsonParser.a(JsonToken.START_OBJECT)) {
            C9542rZ c9542rZ = new C9542rZ((ObjectCodec) null, false);
            c9542rZ.l();
            c9542rZ.a(this.j);
            c9542rZ.i(h);
            jsonParser.e();
            jsonParser = C9440pd.d(false, c9542rZ.g(jsonParser), jsonParser);
            jsonParser.Q();
        }
        if (J2 && jsonParser.f() == JsonToken.END_ARRAY) {
            return a.c(deserializationContext);
        }
        Object b = a.b(jsonParser, deserializationContext);
        if (J2) {
            JsonToken Q = jsonParser.Q();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (Q != jsonToken) {
                deserializationContext.d(j(), jsonToken, "expected closing END_ARRAY after type information and deserialized value", new Object[0]);
            }
        }
        return b;
    }

    protected String h(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.J()) {
            if (this.c != null) {
                return this.i.c();
            }
            JavaType j = j();
            JsonToken jsonToken = JsonToken.START_ARRAY;
            deserializationContext.d(j, jsonToken, "need JSON Array to contain As.WRAPPER_ARRAY type information for class " + g(), new Object[0]);
            return null;
        }
        JsonToken Q = jsonParser.Q();
        JsonToken jsonToken2 = JsonToken.VALUE_STRING;
        if (Q == jsonToken2) {
            String A = jsonParser.A();
            jsonParser.Q();
            return A;
        } else if (this.c != null) {
            return this.i.c();
        } else {
            deserializationContext.d(j(), jsonToken2, "need JSON String that contains type id (for subtype of %s)", g());
            return null;
        }
    }
}
