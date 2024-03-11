package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;

/* loaded from: classes5.dex */
public class StackTraceElementDeserializer extends StdScalarDeserializer<StackTraceElement> {
    private static final long serialVersionUID = 1;

    public StackTraceElementDeserializer() {
        super(StackTraceElement.class);
    }

    @Override // o.AbstractC9452pp
    /* renamed from: c */
    public StackTraceElement b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int A;
        JsonToken f = jsonParser.f();
        if (f != JsonToken.START_OBJECT) {
            if (f == JsonToken.START_ARRAY && deserializationContext.d(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jsonParser.Q();
                StackTraceElement b = b(jsonParser, deserializationContext);
                if (jsonParser.Q() != JsonToken.END_ARRAY) {
                    F(jsonParser, deserializationContext);
                }
                return b;
            }
            return (StackTraceElement) deserializationContext.e(this.B, jsonParser);
        }
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = "";
        String str5 = str4;
        String str6 = str5;
        int i = -1;
        while (true) {
            JsonToken O = jsonParser.O();
            if (O != JsonToken.END_OBJECT) {
                String l = jsonParser.l();
                if ("className".equals(l)) {
                    str4 = jsonParser.A();
                } else if ("classLoaderName".equals(l)) {
                    str3 = jsonParser.A();
                } else if ("fileName".equals(l)) {
                    str6 = jsonParser.A();
                } else if ("lineNumber".equals(l)) {
                    if (O.e()) {
                        A = jsonParser.u();
                    } else {
                        A = A(jsonParser, deserializationContext);
                    }
                    i = A;
                } else if ("methodName".equals(l)) {
                    str5 = jsonParser.A();
                } else if (!"nativeMethod".equals(l)) {
                    if ("moduleName".equals(l)) {
                        str = jsonParser.A();
                    } else if ("moduleVersion".equals(l)) {
                        str2 = jsonParser.A();
                    } else if (!"declaringClass".equals(l) && !"format".equals(l)) {
                        d(jsonParser, deserializationContext, this.B, l);
                    }
                }
                jsonParser.T();
            } else {
                return d(deserializationContext, str4, str5, str6, i, str, str2, str3);
            }
        }
    }

    protected StackTraceElement d(DeserializationContext deserializationContext, String str, String str2, String str3, int i, String str4, String str5, String str6) {
        return new StackTraceElement(str, str2, str3, i);
    }
}
