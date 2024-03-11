package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.io.IOException;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.C9491qb;
import o.C9537rU;
import o.InterfaceC9420pJ;

/* loaded from: classes5.dex */
class FactoryBasedEnumDeserializer extends StdDeserializer<Object> implements InterfaceC9420pJ {
    private static final long serialVersionUID = 1;
    protected final boolean a;
    protected final SettableBeanProperty[] b;
    protected final AnnotatedMethod c;
    protected final JavaType d;
    protected final AbstractC9452pp<?> e;
    private transient PropertyBasedCreator f;
    protected final ValueInstantiator g;

    @Override // o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    @Override // o.AbstractC9452pp
    public boolean i() {
        return true;
    }

    public FactoryBasedEnumDeserializer(Class<?> cls, AnnotatedMethod annotatedMethod, JavaType javaType, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        super(cls);
        this.c = annotatedMethod;
        this.a = true;
        this.d = javaType.d(String.class) ? null : javaType;
        this.e = null;
        this.g = valueInstantiator;
        this.b = settableBeanPropertyArr;
    }

    public FactoryBasedEnumDeserializer(Class<?> cls, AnnotatedMethod annotatedMethod) {
        super(cls);
        this.c = annotatedMethod;
        this.a = false;
        this.d = null;
        this.e = null;
        this.g = null;
        this.b = null;
    }

    protected FactoryBasedEnumDeserializer(FactoryBasedEnumDeserializer factoryBasedEnumDeserializer, AbstractC9452pp<?> abstractC9452pp) {
        super(factoryBasedEnumDeserializer.B);
        this.d = factoryBasedEnumDeserializer.d;
        this.c = factoryBasedEnumDeserializer.c;
        this.a = factoryBasedEnumDeserializer.a;
        this.g = factoryBasedEnumDeserializer.g;
        this.b = factoryBasedEnumDeserializer.b;
        this.e = abstractC9452pp;
    }

    @Override // o.InterfaceC9420pJ
    public AbstractC9452pp<?> c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JavaType javaType;
        return (this.e == null && (javaType = this.d) != null && this.b == null) ? new FactoryBasedEnumDeserializer(this, deserializationContext.c(javaType, beanProperty)) : this;
    }

    @Override // o.AbstractC9452pp
    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object A;
        AbstractC9452pp<?> abstractC9452pp = this.e;
        if (abstractC9452pp != null) {
            A = abstractC9452pp.b(jsonParser, deserializationContext);
        } else if (this.a) {
            JsonToken f = jsonParser.f();
            if (f == JsonToken.VALUE_STRING || f == JsonToken.FIELD_NAME) {
                A = jsonParser.A();
            } else if (this.b != null && jsonParser.K()) {
                if (this.f == null) {
                    this.f = PropertyBasedCreator.b(deserializationContext, this.g, this.b, deserializationContext.d(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                }
                jsonParser.Q();
                return b(jsonParser, deserializationContext, this.f);
            } else {
                A = jsonParser.L();
            }
        } else {
            jsonParser.T();
            try {
                return this.c.c();
            } catch (Exception e) {
                return deserializationContext.d(this.B, (Object) null, C9537rU.j(e));
            }
        }
        try {
            return this.c.b(this.B, A);
        } catch (Exception e2) {
            Throwable j = C9537rU.j(e2);
            if (deserializationContext.d(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL) && (j instanceof IllegalArgumentException)) {
                return null;
            }
            return deserializationContext.d(this.B, A, j);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        if (this.e == null) {
            return b(jsonParser, deserializationContext);
        }
        return abstractC9543ra.b(jsonParser, deserializationContext);
    }

    protected Object b(JsonParser jsonParser, DeserializationContext deserializationContext, PropertyBasedCreator propertyBasedCreator) {
        C9491qb d = propertyBasedCreator.d(jsonParser, deserializationContext, null);
        JsonToken f = jsonParser.f();
        while (f == JsonToken.FIELD_NAME) {
            String l = jsonParser.l();
            jsonParser.Q();
            SettableBeanProperty b = propertyBasedCreator.b(l);
            if (b != null) {
                d.a(b, b(jsonParser, deserializationContext, b));
            } else {
                d.a(l);
            }
            f = jsonParser.Q();
        }
        return propertyBasedCreator.e(deserializationContext, d);
    }

    protected final Object b(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        try {
            return settableBeanProperty.a(jsonParser, deserializationContext);
        } catch (Exception e) {
            return b(e, c(), settableBeanProperty.a(), deserializationContext);
        }
    }

    protected Object b(Throwable th, Object obj, String str, DeserializationContext deserializationContext) {
        throw JsonMappingException.d(c(th, deserializationContext), obj, str);
    }

    private Throwable c(Throwable th, DeserializationContext deserializationContext) {
        Throwable c = C9537rU.c(th);
        C9537rU.b(c);
        boolean z = deserializationContext == null || deserializationContext.d(DeserializationFeature.WRAP_EXCEPTIONS);
        if (c instanceof IOException) {
            if (!z || !(c instanceof JsonProcessingException)) {
                throw ((IOException) c);
            }
        } else if (!z) {
            C9537rU.h(c);
        }
        return c;
    }
}
