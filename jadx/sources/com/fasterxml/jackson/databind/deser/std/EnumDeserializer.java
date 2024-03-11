package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.CompactStringObjectMap;
import com.fasterxml.jackson.databind.util.EnumResolver;
import o.AbstractC9452pp;
import o.C9537rU;
import o.InterfaceC9420pJ;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class EnumDeserializer extends StdScalarDeserializer<Object> implements InterfaceC9420pJ {
    private static final long serialVersionUID = 1;
    protected final CompactStringObjectMap a;
    protected CompactStringObjectMap b;
    protected final Boolean c;
    protected Object[] d;
    private final Enum<?> e;

    @Override // o.AbstractC9452pp
    public boolean i() {
        return true;
    }

    public EnumDeserializer(EnumResolver enumResolver, Boolean bool) {
        super(enumResolver.e());
        this.a = enumResolver.b();
        this.d = enumResolver.a();
        this.e = enumResolver.d();
        this.c = bool;
    }

    protected EnumDeserializer(EnumDeserializer enumDeserializer, Boolean bool) {
        super(enumDeserializer);
        this.a = enumDeserializer.a;
        this.d = enumDeserializer.d;
        this.e = enumDeserializer.e;
        this.c = bool;
    }

    public static AbstractC9452pp<?> b(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        if (deserializationConfig.f()) {
            C9537rU.b(annotatedMethod.h(), deserializationConfig.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod, annotatedMethod.c(0), valueInstantiator, settableBeanPropertyArr);
    }

    public static AbstractC9452pp<?> b(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod) {
        if (deserializationConfig.f()) {
            C9537rU.b(annotatedMethod.h(), deserializationConfig.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod);
    }

    public EnumDeserializer a(Boolean bool) {
        return this.c == bool ? this : new EnumDeserializer(this, bool);
    }

    @Override // o.InterfaceC9420pJ
    public AbstractC9452pp<?> c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        Boolean d = d(deserializationContext, beanProperty, c(), JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        if (d == null) {
            d = this.c;
        }
        return a(d);
    }

    @Override // o.AbstractC9452pp
    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken f = jsonParser.f();
        if (f == JsonToken.VALUE_STRING || f == JsonToken.FIELD_NAME) {
            CompactStringObjectMap a = deserializationContext.d(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? a(deserializationContext) : this.a;
            String A = jsonParser.A();
            Object e = a.e(A);
            return e == null ? a(jsonParser, deserializationContext, a, A) : e;
        } else if (f == JsonToken.VALUE_NUMBER_INT) {
            int u = jsonParser.u();
            if (deserializationContext.d(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                return deserializationContext.c(f(), Integer.valueOf(u), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
            }
            if (u >= 0) {
                Object[] objArr = this.d;
                if (u < objArr.length) {
                    return objArr[u];
                }
            }
            if (this.e == null || !deserializationContext.d(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                if (deserializationContext.d(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return null;
                }
                return deserializationContext.c(f(), Integer.valueOf(u), "index value outside legal index range [0..%s]", Integer.valueOf(this.d.length - 1));
            }
            return this.e;
        } else {
            return d(jsonParser, deserializationContext);
        }
    }

    private final Object a(JsonParser jsonParser, DeserializationContext deserializationContext, CompactStringObjectMap compactStringObjectMap, String str) {
        char charAt;
        String trim = str.trim();
        if (trim.length() == 0) {
            if (deserializationContext.d(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                return d(deserializationContext);
            }
        } else if (Boolean.TRUE.equals(this.c)) {
            Object c = compactStringObjectMap.c(trim);
            if (c != null) {
                return c;
            }
        } else if (!deserializationContext.d(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS) && (charAt = trim.charAt(0)) >= '0' && charAt <= '9') {
            try {
                int parseInt = Integer.parseInt(trim);
                if (!deserializationContext.d(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
                    return deserializationContext.b(f(), trim, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                }
                if (parseInt >= 0) {
                    Object[] objArr = this.d;
                    if (parseInt < objArr.length) {
                        return objArr[parseInt];
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (this.e == null || !deserializationContext.d(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            if (deserializationContext.d(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return deserializationContext.b(f(), trim, "not one of the values accepted for Enum class: %s", compactStringObjectMap.e());
        }
        return this.e;
    }

    protected Object d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.a(JsonToken.START_ARRAY)) {
            return q(jsonParser, deserializationContext);
        }
        return deserializationContext.e(f(), jsonParser);
    }

    protected Class<?> f() {
        return c();
    }

    protected CompactStringObjectMap a(DeserializationContext deserializationContext) {
        CompactStringObjectMap compactStringObjectMap = this.b;
        if (compactStringObjectMap == null) {
            synchronized (this) {
                compactStringObjectMap = EnumResolver.c(f(), deserializationContext.f()).b();
            }
            this.b = compactStringObjectMap;
        }
        return compactStringObjectMap;
    }
}
