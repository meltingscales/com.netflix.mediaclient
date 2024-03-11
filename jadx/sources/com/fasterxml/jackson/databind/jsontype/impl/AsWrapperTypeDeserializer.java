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
public class AsWrapperTypeDeserializer extends TypeDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;

    public AsWrapperTypeDeserializer(JavaType javaType, InterfaceC9545rc interfaceC9545rc, String str, boolean z, JavaType javaType2) {
        super(javaType, interfaceC9545rc, str, z, javaType2);
    }

    protected AsWrapperTypeDeserializer(AsWrapperTypeDeserializer asWrapperTypeDeserializer, BeanProperty beanProperty) {
        super(asWrapperTypeDeserializer, beanProperty);
    }

    @Override // o.AbstractC9543ra
    public AbstractC9543ra d(BeanProperty beanProperty) {
        return beanProperty == this.f ? this : new AsWrapperTypeDeserializer(this, beanProperty);
    }

    @Override // o.AbstractC9543ra
    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.WRAPPER_OBJECT;
    }

    @Override // o.AbstractC9543ra
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return c(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC9543ra
    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) {
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
        JsonToken f = jsonParser.f();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (f == jsonToken) {
            JsonToken Q = jsonParser.Q();
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (Q != jsonToken2) {
                JavaType j = j();
                deserializationContext.d(j, jsonToken2, "need JSON String that contains type id (for subtype of " + g() + ")", new Object[0]);
            }
        } else if (f != JsonToken.FIELD_NAME) {
            JavaType j2 = j();
            deserializationContext.d(j2, jsonToken, "need JSON Object to contain As.WRAPPER_OBJECT type information for class " + g(), new Object[0]);
        }
        String A = jsonParser.A();
        AbstractC9452pp<Object> a = a(deserializationContext, A);
        jsonParser.Q();
        if (this.g && jsonParser.a(jsonToken)) {
            C9542rZ c9542rZ = new C9542rZ((ObjectCodec) null, false);
            c9542rZ.l();
            c9542rZ.a(this.j);
            c9542rZ.i(A);
            jsonParser.e();
            jsonParser = C9440pd.d(false, c9542rZ.g(jsonParser), jsonParser);
            jsonParser.Q();
        }
        Object b = a.b(jsonParser, deserializationContext);
        JsonToken Q2 = jsonParser.Q();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (Q2 != jsonToken3) {
            deserializationContext.d(j(), jsonToken3, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        }
        return b;
    }
}
