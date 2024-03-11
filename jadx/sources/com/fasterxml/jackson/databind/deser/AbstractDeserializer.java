package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;
import java.util.Map;
import o.AbstractC9445pi;
import o.AbstractC9452pp;
import o.AbstractC9509qt;
import o.AbstractC9543ra;
import o.C9422pL;
import o.C9471qH;
import o.C9494qe;
import o.InterfaceC9317nM;
import o.InterfaceC9420pJ;

/* loaded from: classes5.dex */
public class AbstractDeserializer extends AbstractC9452pp<Object> implements InterfaceC9420pJ, Serializable {
    private static final long serialVersionUID = 1;
    protected final boolean a;
    protected final Map<String, SettableBeanProperty> b;
    protected final boolean c;
    protected final boolean d;
    protected final boolean e;
    protected transient Map<String, SettableBeanProperty> g;
    protected final JavaType h;
    protected final ObjectIdReader i;

    @Override // o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        return null;
    }

    @Override // o.AbstractC9452pp
    public ObjectIdReader b() {
        return this.i;
    }

    @Override // o.AbstractC9452pp
    public boolean i() {
        return true;
    }

    public AbstractDeserializer(C9422pL c9422pL, AbstractC9445pi abstractC9445pi, Map<String, SettableBeanProperty> map, Map<String, SettableBeanProperty> map2) {
        JavaType t = abstractC9445pi.t();
        this.h = t;
        this.i = c9422pL.g();
        this.b = map;
        this.g = map2;
        Class<?> h = t.h();
        this.a = h.isAssignableFrom(String.class);
        boolean z = true;
        this.d = h == Boolean.TYPE || h.isAssignableFrom(Boolean.class);
        this.e = h == Integer.TYPE || h.isAssignableFrom(Integer.class);
        if (h != Double.TYPE && !h.isAssignableFrom(Double.class)) {
            z = false;
        }
        this.c = z;
    }

    protected AbstractDeserializer(AbstractC9445pi abstractC9445pi) {
        JavaType t = abstractC9445pi.t();
        this.h = t;
        this.i = null;
        this.b = null;
        Class<?> h = t.h();
        this.a = h.isAssignableFrom(String.class);
        boolean z = true;
        this.d = h == Boolean.TYPE || h.isAssignableFrom(Boolean.class);
        this.e = h == Integer.TYPE || h.isAssignableFrom(Integer.class);
        if (h != Double.TYPE && !h.isAssignableFrom(Double.class)) {
            z = false;
        }
        this.c = z;
    }

    protected AbstractDeserializer(AbstractDeserializer abstractDeserializer, ObjectIdReader objectIdReader, Map<String, SettableBeanProperty> map) {
        this.h = abstractDeserializer.h;
        this.b = abstractDeserializer.b;
        this.a = abstractDeserializer.a;
        this.d = abstractDeserializer.d;
        this.e = abstractDeserializer.e;
        this.c = abstractDeserializer.c;
        this.i = objectIdReader;
        this.g = map;
    }

    public static AbstractDeserializer d(AbstractC9445pi abstractC9445pi) {
        return new AbstractDeserializer(abstractC9445pi);
    }

    @Override // o.InterfaceC9420pJ
    public AbstractC9452pp<?> c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        AnnotatedMember e;
        C9471qH n;
        ObjectIdGenerator<?> d;
        SettableBeanProperty settableBeanProperty;
        JavaType javaType;
        AnnotationIntrospector f = deserializationContext.f();
        if (beanProperty == null || f == null || (e = beanProperty.e()) == null || (n = f.n(e)) == null) {
            return this.g == null ? this : new AbstractDeserializer(this, this.i, null);
        }
        InterfaceC9317nM a = deserializationContext.a(e, n);
        C9471qH a2 = f.a(e, n);
        Class<? extends ObjectIdGenerator<?>> c = a2.c();
        if (c == ObjectIdGenerators.PropertyGenerator.class) {
            PropertyName e2 = a2.e();
            Map<String, SettableBeanProperty> map = this.g;
            SettableBeanProperty settableBeanProperty2 = map == null ? null : map.get(e2.c());
            if (settableBeanProperty2 == null) {
                deserializationContext.c(this.h, String.format("Invalid Object Id definition for %s: cannot find property with name '%s'", c().getName(), e2));
            }
            JavaType d2 = settableBeanProperty2.d();
            d = new PropertyBasedObjectIdGenerator(a2.f());
            javaType = d2;
            settableBeanProperty = settableBeanProperty2;
        } else {
            a = deserializationContext.a(e, a2);
            JavaType javaType2 = deserializationContext.e().b(deserializationContext.a(c), ObjectIdGenerator.class)[0];
            d = deserializationContext.d((AbstractC9509qt) e, a2);
            settableBeanProperty = null;
            javaType = javaType2;
        }
        return new AbstractDeserializer(this, ObjectIdReader.e(javaType, a2.e(), d, deserializationContext.c(javaType), settableBeanProperty, a), null);
    }

    @Override // o.AbstractC9452pp
    public Class<?> c() {
        return this.h.h();
    }

    @Override // o.AbstractC9452pp
    public SettableBeanProperty c(String str) {
        Map<String, SettableBeanProperty> map = this.b;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        JsonToken f;
        if (this.i != null && (f = jsonParser.f()) != null) {
            if (f.b()) {
                return a(jsonParser, deserializationContext);
            }
            if (f == JsonToken.START_OBJECT) {
                f = jsonParser.Q();
            }
            if (f == JsonToken.FIELD_NAME && this.i.c() && this.i.a(jsonParser.l(), jsonParser)) {
                return a(jsonParser, deserializationContext);
            }
        }
        Object d = d(jsonParser, deserializationContext);
        return d != null ? d : abstractC9543ra.a(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC9452pp
    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return deserializationContext.c(this.h.h(), new ValueInstantiator.Base(this.h), jsonParser, "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
    }

    protected Object d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        switch (jsonParser.j()) {
            case 6:
                if (this.a) {
                    return jsonParser.A();
                }
                return null;
            case 7:
                if (this.e) {
                    return Integer.valueOf(jsonParser.u());
                }
                return null;
            case 8:
                if (this.c) {
                    return Double.valueOf(jsonParser.p());
                }
                return null;
            case 9:
                if (this.d) {
                    return Boolean.TRUE;
                }
                return null;
            case 10:
                if (this.d) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }

    protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object c = this.i.c(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this.i;
        C9494qe d = deserializationContext.d(c, objectIdReader.e, objectIdReader.j);
        Object b = d.b();
        if (b != null) {
            return b;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + c + "] -- unresolved forward-reference?", jsonParser.k(), d);
    }
}
