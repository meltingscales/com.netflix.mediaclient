package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import java.io.IOException;
import java.util.EnumMap;
import o.AbstractC9450pn;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.C9491qb;
import o.C9537rU;
import o.InterfaceC9420pJ;
import o.InterfaceC9428pR;
import o.InterfaceC9429pS;

/* loaded from: classes5.dex */
public class EnumMapDeserializer extends ContainerDeserializerBase<EnumMap<?, ?>> implements InterfaceC9420pJ, InterfaceC9429pS {
    private static final long serialVersionUID = 1;
    protected final Class<?> a;
    protected AbstractC9452pp<Object> b;
    protected AbstractC9450pn d;
    protected PropertyBasedCreator e;
    protected final ValueInstantiator f;
    protected AbstractC9452pp<Object> j;
    protected final AbstractC9543ra m;

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public AbstractC9452pp<Object> h() {
        return this.j;
    }

    @Override // o.AbstractC9452pp
    public boolean i() {
        return this.j == null && this.d == null && this.m == null;
    }

    public EnumMapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, AbstractC9450pn abstractC9450pn, AbstractC9452pp<?> abstractC9452pp, AbstractC9543ra abstractC9543ra, InterfaceC9428pR interfaceC9428pR) {
        super(javaType, interfaceC9428pR, (Boolean) null);
        this.a = javaType.f().h();
        this.d = abstractC9450pn;
        this.j = abstractC9452pp;
        this.m = abstractC9543ra;
        this.f = valueInstantiator;
    }

    protected EnumMapDeserializer(EnumMapDeserializer enumMapDeserializer, AbstractC9450pn abstractC9450pn, AbstractC9452pp<?> abstractC9452pp, AbstractC9543ra abstractC9543ra, InterfaceC9428pR interfaceC9428pR) {
        super(enumMapDeserializer, interfaceC9428pR, enumMapDeserializer.h);
        this.a = enumMapDeserializer.a;
        this.d = abstractC9450pn;
        this.j = abstractC9452pp;
        this.m = abstractC9543ra;
        this.f = enumMapDeserializer.f;
        this.b = enumMapDeserializer.b;
        this.e = enumMapDeserializer.e;
    }

    public EnumMapDeserializer d(AbstractC9450pn abstractC9450pn, AbstractC9452pp<?> abstractC9452pp, AbstractC9543ra abstractC9543ra, InterfaceC9428pR interfaceC9428pR) {
        return (abstractC9450pn == this.d && interfaceC9428pR == this.g && abstractC9452pp == this.j && abstractC9543ra == this.m) ? this : new EnumMapDeserializer(this, abstractC9450pn, abstractC9452pp, abstractC9543ra, interfaceC9428pR);
    }

    @Override // o.InterfaceC9429pS
    public void b(DeserializationContext deserializationContext) {
        ValueInstantiator valueInstantiator = this.f;
        if (valueInstantiator != null) {
            if (valueInstantiator.f()) {
                JavaType c = this.f.c(deserializationContext.c());
                if (c == null) {
                    JavaType javaType = this.c;
                    deserializationContext.c(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this.f.getClass().getName()));
                }
                this.b = a(deserializationContext, c, (BeanProperty) null);
            } else if (this.f.j()) {
                JavaType e = this.f.e(deserializationContext.c());
                if (e == null) {
                    JavaType javaType2 = this.c;
                    deserializationContext.c(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this.f.getClass().getName()));
                }
                this.b = a(deserializationContext, e, (BeanProperty) null);
            } else if (this.f.b()) {
                this.e = PropertyBasedCreator.b(deserializationContext, this.f, this.f.d(deserializationContext.c()), deserializationContext.d(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
            }
        }
    }

    @Override // o.InterfaceC9420pJ
    public AbstractC9452pp<?> c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        AbstractC9452pp<?> e;
        AbstractC9450pn abstractC9450pn = this.d;
        if (abstractC9450pn == null) {
            abstractC9450pn = deserializationContext.e(this.c.f(), beanProperty);
        }
        AbstractC9452pp<?> abstractC9452pp = this.j;
        JavaType j = this.c.j();
        if (abstractC9452pp == null) {
            e = deserializationContext.c(j, beanProperty);
        } else {
            e = deserializationContext.e(abstractC9452pp, beanProperty, j);
        }
        AbstractC9543ra abstractC9543ra = this.m;
        if (abstractC9543ra != null) {
            abstractC9543ra = abstractC9543ra.d(beanProperty);
        }
        return d(abstractC9450pn, e, abstractC9543ra, b(deserializationContext, beanProperty, e));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, o.AbstractC9452pp
    public Object d(DeserializationContext deserializationContext) {
        return a(deserializationContext);
    }

    @Override // o.AbstractC9452pp
    /* renamed from: a */
    public EnumMap<?, ?> b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this.e != null) {
            return c(jsonParser, deserializationContext);
        }
        AbstractC9452pp<Object> abstractC9452pp = this.b;
        if (abstractC9452pp != null) {
            return (EnumMap) this.f.b(deserializationContext, abstractC9452pp.b(jsonParser, deserializationContext));
        }
        JsonToken f = jsonParser.f();
        if (f != JsonToken.START_OBJECT && f != JsonToken.FIELD_NAME && f != JsonToken.END_OBJECT) {
            if (f == JsonToken.VALUE_STRING) {
                return (EnumMap) this.f.a(deserializationContext, jsonParser.A());
            }
            return t(jsonParser, deserializationContext);
        }
        return e(jsonParser, deserializationContext, a(deserializationContext));
    }

    @Override // o.AbstractC9452pp
    /* renamed from: a */
    public EnumMap<?, ?> e(JsonParser jsonParser, DeserializationContext deserializationContext, EnumMap enumMap) {
        String l;
        Object a;
        jsonParser.e(enumMap);
        AbstractC9452pp<Object> abstractC9452pp = this.j;
        AbstractC9543ra abstractC9543ra = this.m;
        if (jsonParser.K()) {
            l = jsonParser.R();
        } else {
            JsonToken f = jsonParser.f();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (f != jsonToken) {
                if (f == JsonToken.END_OBJECT) {
                    return enumMap;
                }
                deserializationContext.e(this, jsonToken, (String) null, new Object[0]);
            }
            l = jsonParser.l();
        }
        while (l != null) {
            Enum r3 = (Enum) this.d.c(l, deserializationContext);
            JsonToken Q = jsonParser.Q();
            if (r3 == null) {
                if (!deserializationContext.d(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return (EnumMap) deserializationContext.b(this.a, l, "value not one of declared Enum instance names for %s", this.c.f());
                }
                jsonParser.T();
            } else {
                try {
                    if (Q == JsonToken.VALUE_NULL) {
                        if (!this.i) {
                            a = this.g.c(deserializationContext);
                        }
                    } else if (abstractC9543ra == null) {
                        a = abstractC9452pp.b(jsonParser, deserializationContext);
                    } else {
                        a = abstractC9452pp.a(jsonParser, deserializationContext, abstractC9543ra);
                    }
                    enumMap.put((EnumMap) r3, (Enum) a);
                } catch (Exception e) {
                    return (EnumMap) e(e, enumMap, l);
                }
            }
            l = jsonParser.R();
        }
        return enumMap;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        return abstractC9543ra.a(jsonParser, deserializationContext);
    }

    protected EnumMap<?, ?> a(DeserializationContext deserializationContext) {
        ValueInstantiator valueInstantiator = this.f;
        if (valueInstantiator == null) {
            return new EnumMap<>(this.a);
        }
        try {
            if (!valueInstantiator.g()) {
                return (EnumMap) deserializationContext.c(c(), j(), (JsonParser) null, "no default constructor found", new Object[0]);
            }
            return (EnumMap) this.f.e(deserializationContext);
        } catch (IOException e) {
            return (EnumMap) C9537rU.d(deserializationContext, e);
        }
    }

    public EnumMap<?, ?> c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String l;
        Object a;
        PropertyBasedCreator propertyBasedCreator = this.e;
        C9491qb d = propertyBasedCreator.d(jsonParser, deserializationContext, null);
        if (jsonParser.K()) {
            l = jsonParser.R();
        } else {
            l = jsonParser.a(JsonToken.FIELD_NAME) ? jsonParser.l() : null;
        }
        while (l != null) {
            JsonToken Q = jsonParser.Q();
            SettableBeanProperty b = propertyBasedCreator.b(l);
            if (b != null) {
                if (d.a(b, b.a(jsonParser, deserializationContext))) {
                    jsonParser.Q();
                    try {
                        return e(jsonParser, deserializationContext, (EnumMap) propertyBasedCreator.e(deserializationContext, d));
                    } catch (Exception e) {
                        return (EnumMap) e(e, this.c.h(), l);
                    }
                }
            } else {
                Enum r5 = (Enum) this.d.c(l, deserializationContext);
                if (r5 == null) {
                    if (!deserializationContext.d(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                        return (EnumMap) deserializationContext.b(this.a, l, "value not one of declared Enum instance names for %s", this.c.f());
                    }
                    jsonParser.Q();
                    jsonParser.T();
                } else {
                    try {
                        if (Q != JsonToken.VALUE_NULL) {
                            AbstractC9543ra abstractC9543ra = this.m;
                            if (abstractC9543ra == null) {
                                a = this.j.b(jsonParser, deserializationContext);
                            } else {
                                a = this.j.a(jsonParser, deserializationContext, abstractC9543ra);
                            }
                        } else if (!this.i) {
                            a = this.g.c(deserializationContext);
                        }
                        d.b(r5, a);
                    } catch (Exception e2) {
                        e(e2, this.c.h(), l);
                        return null;
                    }
                }
            }
            l = jsonParser.R();
        }
        try {
            return (EnumMap) propertyBasedCreator.e(deserializationContext, d);
        } catch (Exception e3) {
            e(e3, this.c.h(), l);
            return null;
        }
    }
}
