package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.util.EnumSet;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.C9537rU;
import o.InterfaceC9420pJ;
import o.InterfaceC9428pR;

/* loaded from: classes5.dex */
public class EnumSetDeserializer extends StdDeserializer<EnumSet<?>> implements InterfaceC9420pJ {
    private static final long serialVersionUID = 1;
    protected final boolean a;
    protected final Class<Enum> b;
    protected final InterfaceC9428pR c;
    protected AbstractC9452pp<Enum<?>> d;
    protected final JavaType e;
    protected final Boolean f;

    @Override // o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnumSetDeserializer(JavaType javaType, AbstractC9452pp<?> abstractC9452pp) {
        super(EnumSet.class);
        this.e = javaType;
        Class h = javaType.h();
        this.b = h;
        if (C9537rU.t(h)) {
            this.d = abstractC9452pp;
            this.f = null;
            this.c = null;
            this.a = false;
            return;
        }
        throw new IllegalArgumentException("Type " + javaType + " not Java Enum type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected EnumSetDeserializer(EnumSetDeserializer enumSetDeserializer, AbstractC9452pp<?> abstractC9452pp, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
        super(enumSetDeserializer);
        this.e = enumSetDeserializer.e;
        this.b = enumSetDeserializer.b;
        this.d = abstractC9452pp;
        this.c = interfaceC9428pR;
        this.a = NullsConstantProvider.c(interfaceC9428pR);
        this.f = bool;
    }

    public EnumSetDeserializer b(AbstractC9452pp<?> abstractC9452pp, InterfaceC9428pR interfaceC9428pR, Boolean bool) {
        return (this.f == bool && this.d == abstractC9452pp && this.c == abstractC9452pp) ? this : new EnumSetDeserializer(this, abstractC9452pp, interfaceC9428pR, bool);
    }

    @Override // o.AbstractC9452pp
    public boolean i() {
        return this.e.l() == null;
    }

    @Override // o.AbstractC9452pp
    public Object d(DeserializationContext deserializationContext) {
        return f();
    }

    @Override // o.AbstractC9452pp
    public AccessPattern a() {
        return AccessPattern.DYNAMIC;
    }

    @Override // o.InterfaceC9420pJ
    public AbstractC9452pp<?> c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        AbstractC9452pp<?> e;
        Boolean d = d(deserializationContext, beanProperty, EnumSet.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        AbstractC9452pp<Enum<?>> abstractC9452pp = this.d;
        if (abstractC9452pp == null) {
            e = deserializationContext.c(this.e, beanProperty);
        } else {
            e = deserializationContext.e(abstractC9452pp, beanProperty, this.e);
        }
        return b(e, b(deserializationContext, beanProperty, e), d);
    }

    @Override // o.AbstractC9452pp
    /* renamed from: d */
    public EnumSet<?> b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        EnumSet f = f();
        if (!jsonParser.J()) {
            return e(jsonParser, deserializationContext, f);
        }
        return d(jsonParser, deserializationContext, f);
    }

    @Override // o.AbstractC9452pp
    /* renamed from: b */
    public EnumSet<?> e(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet<?> enumSet) {
        if (!jsonParser.J()) {
            return e(jsonParser, deserializationContext, (EnumSet) enumSet);
        }
        return d(jsonParser, deserializationContext, enumSet);
    }

    protected final EnumSet<?> d(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) {
        Enum<?> b;
        while (true) {
            try {
                JsonToken Q = jsonParser.Q();
                if (Q == JsonToken.END_ARRAY) {
                    return enumSet;
                }
                if (Q != JsonToken.VALUE_NULL) {
                    b = this.d.b(jsonParser, deserializationContext);
                } else if (!this.a) {
                    b = (Enum) this.c.c(deserializationContext);
                }
                if (b != null) {
                    enumSet.add(b);
                }
            } catch (Exception e) {
                throw JsonMappingException.d(e, enumSet, enumSet.size());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        return abstractC9543ra.d(jsonParser, deserializationContext);
    }

    private EnumSet f() {
        return EnumSet.noneOf(this.b);
    }

    protected EnumSet<?> e(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) {
        Boolean bool = this.f;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.d(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (EnumSet) deserializationContext.e(EnumSet.class, jsonParser);
        }
        if (jsonParser.a(JsonToken.VALUE_NULL)) {
            return (EnumSet) deserializationContext.e(this.b, jsonParser);
        }
        try {
            Enum<?> b = this.d.b(jsonParser, deserializationContext);
            if (b != null) {
                enumSet.add(b);
            }
            return enumSet;
        } catch (Exception e) {
            throw JsonMappingException.d(e, enumSet, enumSet.size());
        }
    }
}
