package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.C9440pd;
import o.C9542rZ;
import o.InterfaceC9545rc;

/* loaded from: classes5.dex */
public class AsPropertyTypeDeserializer extends AsArrayTypeDeserializer {
    private static final long serialVersionUID = 1;
    protected final JsonTypeInfo.As d;

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, o.AbstractC9543ra
    public JsonTypeInfo.As c() {
        return this.d;
    }

    public AsPropertyTypeDeserializer(JavaType javaType, InterfaceC9545rc interfaceC9545rc, String str, boolean z, JavaType javaType2, JsonTypeInfo.As as) {
        super(javaType, interfaceC9545rc, str, z, javaType2);
        this.d = as;
    }

    public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, BeanProperty beanProperty) {
        super(asPropertyTypeDeserializer, beanProperty);
        this.d = asPropertyTypeDeserializer.d;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, o.AbstractC9543ra
    public AbstractC9543ra d(BeanProperty beanProperty) {
        return beanProperty == this.f ? this : new AsPropertyTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, o.AbstractC9543ra
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object F;
        if (jsonParser.c() && (F = jsonParser.F()) != null) {
            return e(jsonParser, deserializationContext, F);
        }
        JsonToken f = jsonParser.f();
        C9542rZ c9542rZ = null;
        if (f == JsonToken.START_OBJECT) {
            f = jsonParser.Q();
        } else if (f != JsonToken.FIELD_NAME) {
            return b(jsonParser, deserializationContext, null);
        }
        while (f == JsonToken.FIELD_NAME) {
            String l = jsonParser.l();
            jsonParser.Q();
            if (l.equals(this.j)) {
                return a(jsonParser, deserializationContext, c9542rZ);
            }
            if (c9542rZ == null) {
                c9542rZ = new C9542rZ(jsonParser, deserializationContext);
            }
            c9542rZ.a(l);
            c9542rZ.b(jsonParser);
            f = jsonParser.Q();
        }
        return b(jsonParser, deserializationContext, c9542rZ);
    }

    protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext, C9542rZ c9542rZ) {
        String A = jsonParser.A();
        AbstractC9452pp<Object> a = a(deserializationContext, A);
        if (this.g) {
            if (c9542rZ == null) {
                c9542rZ = new C9542rZ(jsonParser, deserializationContext);
            }
            c9542rZ.a(jsonParser.l());
            c9542rZ.i(A);
        }
        if (c9542rZ != null) {
            jsonParser.e();
            jsonParser = C9440pd.d(false, c9542rZ.g(jsonParser), jsonParser);
        }
        jsonParser.Q();
        return a.b(jsonParser, deserializationContext);
    }

    protected Object b(JsonParser jsonParser, DeserializationContext deserializationContext, C9542rZ c9542rZ) {
        AbstractC9452pp<Object> c = c(deserializationContext);
        if (c == null) {
            Object e = AbstractC9543ra.e(jsonParser, deserializationContext, this.a);
            if (e != null) {
                return e;
            }
            if (jsonParser.J()) {
                return super.b(jsonParser, deserializationContext);
            }
            if (jsonParser.a(JsonToken.VALUE_STRING) && deserializationContext.d(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.A().trim().isEmpty()) {
                return null;
            }
            String format = String.format("missing type id property '%s'", this.j);
            BeanProperty beanProperty = this.f;
            if (beanProperty != null) {
                format = String.format("%s (for POJO property '%s')", format, beanProperty.a());
            }
            JavaType d = d(deserializationContext, format);
            if (d == null) {
                return null;
            }
            c = deserializationContext.c(d, this.f);
        }
        if (c9542rZ != null) {
            c9542rZ.o();
            jsonParser = c9542rZ.g(jsonParser);
            jsonParser.Q();
        }
        return c.b(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, o.AbstractC9543ra
    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.a(JsonToken.START_ARRAY)) {
            return super.d(jsonParser, deserializationContext);
        }
        return a(jsonParser, deserializationContext);
    }
}
