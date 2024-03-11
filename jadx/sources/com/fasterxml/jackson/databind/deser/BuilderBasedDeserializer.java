package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Map;
import java.util.Set;
import o.AbstractC9445pi;
import o.AbstractC9452pp;
import o.C9422pL;
import o.C9435pY;
import o.C9491qb;
import o.C9542rZ;

/* loaded from: classes5.dex */
public class BuilderBasedDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    protected final AnnotatedMethod c;
    protected final JavaType x;

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, o.AbstractC9452pp
    public Boolean a(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public BuilderBasedDeserializer(C9422pL c9422pL, AbstractC9445pi abstractC9445pi, JavaType javaType, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, boolean z2) {
        super(c9422pL, abstractC9445pi, beanPropertyMap, map, set, z, z2);
        this.x = javaType;
        this.c = c9422pL.c();
        if (this.k == null) {
            return;
        }
        throw new IllegalArgumentException("Cannot use Object Id with Builder-based deserialization (type " + abstractC9445pi.t() + ")");
    }

    protected BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, NameTransformer nameTransformer) {
        super(builderBasedDeserializer, nameTransformer);
        this.c = builderBasedDeserializer.c;
        this.x = builderBasedDeserializer.x;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, ObjectIdReader objectIdReader) {
        super(builderBasedDeserializer, objectIdReader);
        this.c = builderBasedDeserializer.c;
        this.x = builderBasedDeserializer.x;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, Set<String> set) {
        super(builderBasedDeserializer, set);
        this.c = builderBasedDeserializer.c;
        this.x = builderBasedDeserializer.x;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, BeanPropertyMap beanPropertyMap) {
        super(builderBasedDeserializer, beanPropertyMap);
        this.c = builderBasedDeserializer.c;
        this.x = builderBasedDeserializer.x;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, o.AbstractC9452pp
    public AbstractC9452pp<Object> d(NameTransformer nameTransformer) {
        return new BuilderBasedDeserializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase b(ObjectIdReader objectIdReader) {
        return new BuilderBasedDeserializer(this, objectIdReader);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase c(Set<String> set) {
        return new BuilderBasedDeserializer(this, set);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase e(BeanPropertyMap beanPropertyMap) {
        return new BuilderBasedDeserializer(this, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    protected BeanDeserializerBase f() {
        return new BeanAsArrayBuilderDeserializer(this, this.x, this.g.b(), this.c);
    }

    protected Object c(DeserializationContext deserializationContext, Object obj) {
        AnnotatedMethod annotatedMethod = this.c;
        if (annotatedMethod == null) {
            return obj;
        }
        try {
            return annotatedMethod.h().invoke(obj, null);
        } catch (Exception e) {
            return c(e, deserializationContext);
        }
    }

    @Override // o.AbstractC9452pp
    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.K()) {
            JsonToken Q = jsonParser.Q();
            if (this.u) {
                return c(deserializationContext, b(jsonParser, deserializationContext, Q));
            }
            return c(deserializationContext, c(jsonParser, deserializationContext));
        }
        switch (jsonParser.t()) {
            case 2:
            case 5:
                return c(deserializationContext, c(jsonParser, deserializationContext));
            case 3:
                return c(deserializationContext, g(jsonParser, deserializationContext));
            case 4:
            case 11:
            default:
                return deserializationContext.d(h(deserializationContext), jsonParser);
            case 6:
                return c(deserializationContext, r(jsonParser, deserializationContext));
            case 7:
                return c(deserializationContext, n(jsonParser, deserializationContext));
            case 8:
                return c(deserializationContext, k(jsonParser, deserializationContext));
            case 9:
            case 10:
                return c(deserializationContext, f(jsonParser, deserializationContext));
            case 12:
                return jsonParser.q();
        }
    }

    @Override // o.AbstractC9452pp
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        JavaType javaType = this.x;
        Class<?> c = c();
        Class<?> cls = obj.getClass();
        if (c.isAssignableFrom(cls)) {
            return deserializationContext.c(javaType, String.format("Deserialization of %s by passing existing Builder (%s) instance not supported", javaType, c.getName()));
        }
        return deserializationContext.c(javaType, String.format("Deserialization of %s by passing existing instance (of %s) not supported", javaType, cls.getName()));
    }

    private final Object b(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) {
        Object e = this.r.e(deserializationContext);
        while (jsonParser.o() == JsonToken.FIELD_NAME) {
            String l = jsonParser.l();
            jsonParser.Q();
            SettableBeanProperty e2 = this.g.e(l);
            if (e2 != null) {
                try {
                    e = e2.e(jsonParser, deserializationContext, e);
                } catch (Exception e3) {
                    b(e3, e, l, deserializationContext);
                }
            } else {
                e(jsonParser, deserializationContext, e, l);
            }
            jsonParser.Q();
        }
        return e;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Class<?> b;
        if (this.m) {
            if (this.p != null) {
                return j(jsonParser, deserializationContext);
            }
            if (this.j != null) {
                return h(jsonParser, deserializationContext);
            }
            return l(jsonParser, deserializationContext);
        }
        Object e = this.r.e(deserializationContext);
        if (this.f13104o != null) {
            e(deserializationContext, e);
        }
        if (this.n && (b = deserializationContext.b()) != null) {
            return d(jsonParser, deserializationContext, e, b);
        }
        while (jsonParser.o() == JsonToken.FIELD_NAME) {
            String l = jsonParser.l();
            jsonParser.Q();
            SettableBeanProperty e2 = this.g.e(l);
            if (e2 != null) {
                try {
                    e = e2.e(jsonParser, deserializationContext, e);
                } catch (Exception e3) {
                    b(e3, e, l, deserializationContext);
                }
            } else {
                e(jsonParser, deserializationContext, e, l);
            }
            jsonParser.Q();
        }
        return e;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    protected Object d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object c;
        PropertyBasedCreator propertyBasedCreator = this.s;
        C9491qb d = propertyBasedCreator.d(jsonParser, deserializationContext, this.k);
        Class<?> b = this.n ? deserializationContext.b() : null;
        JsonToken o2 = jsonParser.o();
        C9542rZ c9542rZ = null;
        while (o2 == JsonToken.FIELD_NAME) {
            String l = jsonParser.l();
            jsonParser.Q();
            SettableBeanProperty b2 = propertyBasedCreator.b(l);
            if (b2 != null) {
                if (b != null && !b2.a(b)) {
                    jsonParser.T();
                } else if (d.a(b2, b2.a(jsonParser, deserializationContext))) {
                    jsonParser.Q();
                    try {
                        Object e = propertyBasedCreator.e(deserializationContext, d);
                        if (e.getClass() != this.f.h()) {
                            return c(jsonParser, deserializationContext, e, c9542rZ);
                        }
                        if (c9542rZ != null) {
                            e = c(deserializationContext, e, c9542rZ);
                        }
                        return a(jsonParser, deserializationContext, e);
                    } catch (Exception e2) {
                        b(e2, this.f.h(), l, deserializationContext);
                    }
                } else {
                    continue;
                }
            } else if (!d.a(l)) {
                SettableBeanProperty e3 = this.g.e(l);
                if (e3 != null) {
                    d.b(e3, e3.a(jsonParser, deserializationContext));
                } else {
                    Set<String> set = this.h;
                    if (set == null || !set.contains(l)) {
                        SettableAnyProperty settableAnyProperty = this.e;
                        if (settableAnyProperty != null) {
                            d.b(settableAnyProperty, l, settableAnyProperty.d(jsonParser, deserializationContext));
                        } else {
                            if (c9542rZ == null) {
                                c9542rZ = new C9542rZ(jsonParser, deserializationContext);
                            }
                            c9542rZ.a(l);
                            c9542rZ.b(jsonParser);
                        }
                    } else {
                        a(jsonParser, deserializationContext, c(), l);
                    }
                }
            }
            o2 = jsonParser.Q();
        }
        try {
            c = propertyBasedCreator.e(deserializationContext, d);
        } catch (Exception e4) {
            c = c(e4, deserializationContext);
        }
        if (c9542rZ != null) {
            if (c.getClass() != this.f.h()) {
                return c((JsonParser) null, deserializationContext, c, c9542rZ);
            }
            return c(deserializationContext, c, c9542rZ);
        }
        return c;
    }

    protected final Object a(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Class<?> b;
        if (this.f13104o != null) {
            e(deserializationContext, obj);
        }
        if (this.p != null) {
            if (jsonParser.a(JsonToken.START_OBJECT)) {
                jsonParser.Q();
            }
            C9542rZ c9542rZ = new C9542rZ(jsonParser, deserializationContext);
            c9542rZ.l();
            return e(jsonParser, deserializationContext, obj, c9542rZ);
        } else if (this.j != null) {
            return d(jsonParser, deserializationContext, obj);
        } else {
            if (this.n && (b = deserializationContext.b()) != null) {
                return d(jsonParser, deserializationContext, obj, b);
            }
            JsonToken o2 = jsonParser.o();
            if (o2 == JsonToken.START_OBJECT) {
                o2 = jsonParser.Q();
            }
            while (o2 == JsonToken.FIELD_NAME) {
                String l = jsonParser.l();
                jsonParser.Q();
                SettableBeanProperty e = this.g.e(l);
                if (e != null) {
                    try {
                        obj = e.e(jsonParser, deserializationContext, obj);
                    } catch (Exception e2) {
                        b(e2, obj, l, deserializationContext);
                    }
                } else {
                    e(jsonParser, deserializationContext, obj, l);
                }
                o2 = jsonParser.Q();
            }
            return obj;
        }
    }

    protected final Object d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) {
        JsonToken o2 = jsonParser.o();
        while (o2 == JsonToken.FIELD_NAME) {
            String l = jsonParser.l();
            jsonParser.Q();
            SettableBeanProperty e = this.g.e(l);
            if (e != null) {
                if (!e.a(cls)) {
                    jsonParser.T();
                } else {
                    try {
                        obj = e.e(jsonParser, deserializationContext, obj);
                    } catch (Exception e2) {
                        b(e2, obj, l, deserializationContext);
                    }
                }
            } else {
                e(jsonParser, deserializationContext, obj, l);
            }
            o2 = jsonParser.Q();
        }
        return obj;
    }

    protected Object j(JsonParser jsonParser, DeserializationContext deserializationContext) {
        AbstractC9452pp<Object> abstractC9452pp = this.i;
        if (abstractC9452pp != null) {
            return this.r.b(deserializationContext, abstractC9452pp.b(jsonParser, deserializationContext));
        }
        if (this.s != null) {
            return a(jsonParser, deserializationContext);
        }
        C9542rZ c9542rZ = new C9542rZ(jsonParser, deserializationContext);
        c9542rZ.l();
        Object e = this.r.e(deserializationContext);
        if (this.f13104o != null) {
            e(deserializationContext, e);
        }
        Class<?> b = this.n ? deserializationContext.b() : null;
        while (jsonParser.o() == JsonToken.FIELD_NAME) {
            String l = jsonParser.l();
            jsonParser.Q();
            SettableBeanProperty e2 = this.g.e(l);
            if (e2 != null) {
                if (b != null && !e2.a(b)) {
                    jsonParser.T();
                } else {
                    try {
                        e = e2.e(jsonParser, deserializationContext, e);
                    } catch (Exception e3) {
                        b(e3, e, l, deserializationContext);
                    }
                }
            } else {
                Set<String> set = this.h;
                if (set != null && set.contains(l)) {
                    a(jsonParser, deserializationContext, e, l);
                } else {
                    c9542rZ.a(l);
                    c9542rZ.b(jsonParser);
                    SettableAnyProperty settableAnyProperty = this.e;
                    if (settableAnyProperty != null) {
                        try {
                            settableAnyProperty.c(jsonParser, deserializationContext, e, l);
                        } catch (Exception e4) {
                            b(e4, e, l, deserializationContext);
                        }
                    }
                }
            }
            jsonParser.Q();
        }
        c9542rZ.o();
        return this.p.e(jsonParser, deserializationContext, e, c9542rZ);
    }

    protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        PropertyBasedCreator propertyBasedCreator = this.s;
        C9491qb d = propertyBasedCreator.d(jsonParser, deserializationContext, this.k);
        C9542rZ c9542rZ = new C9542rZ(jsonParser, deserializationContext);
        c9542rZ.l();
        JsonToken o2 = jsonParser.o();
        while (o2 == JsonToken.FIELD_NAME) {
            String l = jsonParser.l();
            jsonParser.Q();
            SettableBeanProperty b = propertyBasedCreator.b(l);
            if (b != null) {
                if (d.a(b, b.a(jsonParser, deserializationContext))) {
                    jsonParser.Q();
                    try {
                        Object e = propertyBasedCreator.e(deserializationContext, d);
                        if (e.getClass() != this.f.h()) {
                            return c(jsonParser, deserializationContext, e, c9542rZ);
                        }
                        return e(jsonParser, deserializationContext, e, c9542rZ);
                    } catch (Exception e2) {
                        b(e2, this.f.h(), l, deserializationContext);
                    }
                } else {
                    continue;
                }
            } else if (!d.a(l)) {
                SettableBeanProperty e3 = this.g.e(l);
                if (e3 != null) {
                    d.b(e3, e3.a(jsonParser, deserializationContext));
                } else {
                    Set<String> set = this.h;
                    if (set != null && set.contains(l)) {
                        a(jsonParser, deserializationContext, c(), l);
                    } else {
                        c9542rZ.a(l);
                        c9542rZ.b(jsonParser);
                        SettableAnyProperty settableAnyProperty = this.e;
                        if (settableAnyProperty != null) {
                            d.b(settableAnyProperty, l, settableAnyProperty.d(jsonParser, deserializationContext));
                        }
                    }
                }
            }
            o2 = jsonParser.Q();
        }
        c9542rZ.o();
        try {
            return this.p.e(jsonParser, deserializationContext, propertyBasedCreator.e(deserializationContext, d), c9542rZ);
        } catch (Exception e4) {
            return c(e4, deserializationContext);
        }
    }

    protected Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, C9542rZ c9542rZ) {
        Class<?> b = this.n ? deserializationContext.b() : null;
        JsonToken o2 = jsonParser.o();
        while (o2 == JsonToken.FIELD_NAME) {
            String l = jsonParser.l();
            SettableBeanProperty e = this.g.e(l);
            jsonParser.Q();
            if (e != null) {
                if (b != null && !e.a(b)) {
                    jsonParser.T();
                } else {
                    try {
                        obj = e.e(jsonParser, deserializationContext, obj);
                    } catch (Exception e2) {
                        b(e2, obj, l, deserializationContext);
                    }
                }
            } else {
                Set<String> set = this.h;
                if (set != null && set.contains(l)) {
                    a(jsonParser, deserializationContext, obj, l);
                } else {
                    c9542rZ.a(l);
                    c9542rZ.b(jsonParser);
                    SettableAnyProperty settableAnyProperty = this.e;
                    if (settableAnyProperty != null) {
                        settableAnyProperty.c(jsonParser, deserializationContext, obj, l);
                    }
                }
            }
            o2 = jsonParser.Q();
        }
        c9542rZ.o();
        return this.p.e(jsonParser, deserializationContext, obj, c9542rZ);
    }

    protected Object h(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this.s != null) {
            return e(jsonParser, deserializationContext);
        }
        return d(jsonParser, deserializationContext, this.r.e(deserializationContext));
    }

    protected Object d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Class<?> b = this.n ? deserializationContext.b() : null;
        C9435pY a = this.j.a();
        JsonToken o2 = jsonParser.o();
        while (o2 == JsonToken.FIELD_NAME) {
            String l = jsonParser.l();
            JsonToken Q = jsonParser.Q();
            SettableBeanProperty e = this.g.e(l);
            if (e != null) {
                if (Q.b()) {
                    a.c(jsonParser, deserializationContext, l, obj);
                }
                if (b != null && !e.a(b)) {
                    jsonParser.T();
                } else {
                    try {
                        obj = e.e(jsonParser, deserializationContext, obj);
                    } catch (Exception e2) {
                        b(e2, obj, l, deserializationContext);
                    }
                }
            } else {
                Set<String> set = this.h;
                if (set != null && set.contains(l)) {
                    a(jsonParser, deserializationContext, obj, l);
                } else if (!a.e(jsonParser, deserializationContext, l, obj)) {
                    SettableAnyProperty settableAnyProperty = this.e;
                    if (settableAnyProperty != null) {
                        try {
                            settableAnyProperty.c(jsonParser, deserializationContext, obj, l);
                        } catch (Exception e3) {
                            b(e3, obj, l, deserializationContext);
                        }
                    } else {
                        d(jsonParser, deserializationContext, obj, l);
                    }
                }
            }
            o2 = jsonParser.Q();
        }
        return a.c(jsonParser, deserializationContext, obj);
    }

    protected Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JavaType javaType = this.x;
        return deserializationContext.c(javaType, String.format("Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented", javaType));
    }
}
