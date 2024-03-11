package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC9450pn;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.C9491qb;
import o.C9494qe;
import o.InterfaceC9420pJ;
import o.InterfaceC9421pK;
import o.InterfaceC9428pR;
import o.InterfaceC9429pS;
import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class MapDeserializer extends ContainerDeserializerBase<Map<Object, Object>> implements InterfaceC9420pJ, InterfaceC9429pS {
    private static final long serialVersionUID = 1;
    protected AbstractC9452pp<Object> a;
    protected final boolean b;
    protected Set<String> d;
    protected final AbstractC9450pn e;
    protected PropertyBasedCreator f;
    protected boolean j;
    protected final ValueInstantiator l;
    protected final AbstractC9452pp<Object> m;

    /* renamed from: o  reason: collision with root package name */
    protected final AbstractC9543ra f13106o;

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType g() {
        return this.c;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public AbstractC9452pp<Object> h() {
        return this.m;
    }

    @Override // o.AbstractC9452pp
    public boolean i() {
        return this.m == null && this.e == null && this.f13106o == null && this.d == null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public ValueInstantiator j() {
        return this.l;
    }

    public MapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, AbstractC9450pn abstractC9450pn, AbstractC9452pp<Object> abstractC9452pp, AbstractC9543ra abstractC9543ra) {
        super(javaType, (InterfaceC9428pR) null, (Boolean) null);
        this.e = abstractC9450pn;
        this.m = abstractC9452pp;
        this.f13106o = abstractC9543ra;
        this.l = valueInstantiator;
        this.b = valueInstantiator.g();
        this.a = null;
        this.f = null;
        this.j = a(javaType, abstractC9450pn);
    }

    protected MapDeserializer(MapDeserializer mapDeserializer, AbstractC9450pn abstractC9450pn, AbstractC9452pp<Object> abstractC9452pp, AbstractC9543ra abstractC9543ra, InterfaceC9428pR interfaceC9428pR, Set<String> set) {
        super(mapDeserializer, interfaceC9428pR, mapDeserializer.h);
        this.e = abstractC9450pn;
        this.m = abstractC9452pp;
        this.f13106o = abstractC9543ra;
        this.l = mapDeserializer.l;
        this.f = mapDeserializer.f;
        this.a = mapDeserializer.a;
        this.b = mapDeserializer.b;
        this.d = set;
        this.j = a(this.c, abstractC9450pn);
    }

    protected MapDeserializer d(AbstractC9450pn abstractC9450pn, AbstractC9543ra abstractC9543ra, AbstractC9452pp<?> abstractC9452pp, InterfaceC9428pR interfaceC9428pR, Set<String> set) {
        return (this.e == abstractC9450pn && this.m == abstractC9452pp && this.f13106o == abstractC9543ra && this.g == interfaceC9428pR && this.d == set) ? this : new MapDeserializer(this, abstractC9450pn, abstractC9452pp, abstractC9543ra, interfaceC9428pR, set);
    }

    protected final boolean a(JavaType javaType, AbstractC9450pn abstractC9450pn) {
        JavaType f;
        if (abstractC9450pn == null || (f = javaType.f()) == null) {
            return true;
        }
        Class<?> h = f.h();
        return (h == String.class || h == Object.class) && a(abstractC9450pn);
    }

    public void d(Set<String> set) {
        this.d = (set == null || set.size() == 0) ? null : null;
    }

    @Override // o.InterfaceC9429pS
    public void b(DeserializationContext deserializationContext) {
        if (this.l.f()) {
            JavaType c2 = this.l.c(deserializationContext.c());
            if (c2 == null) {
                JavaType javaType = this.c;
                deserializationContext.c(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this.l.getClass().getName()));
            }
            this.a = a(deserializationContext, c2, (BeanProperty) null);
        } else if (this.l.j()) {
            JavaType e = this.l.e(deserializationContext.c());
            if (e == null) {
                JavaType javaType2 = this.c;
                deserializationContext.c(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this.l.getClass().getName()));
            }
            this.a = a(deserializationContext, e, (BeanProperty) null);
        }
        if (this.l.b()) {
            this.f = PropertyBasedCreator.b(deserializationContext, this.l, this.l.d(deserializationContext.c()), deserializationContext.d(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this.j = a(this.c, this.e);
    }

    @Override // o.InterfaceC9420pJ
    public AbstractC9452pp<?> c(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        AbstractC9452pp<?> e;
        AnnotatedMember e2;
        JsonIgnoreProperties.Value p;
        AbstractC9450pn abstractC9450pn = this.e;
        if (abstractC9450pn == null) {
            abstractC9450pn = deserializationContext.e(this.c.f(), beanProperty);
        } else if (abstractC9450pn instanceof InterfaceC9421pK) {
            abstractC9450pn = ((InterfaceC9421pK) abstractC9450pn).b(deserializationContext, beanProperty);
        }
        AbstractC9450pn abstractC9450pn2 = abstractC9450pn;
        AbstractC9452pp<?> abstractC9452pp = this.m;
        if (beanProperty != null) {
            abstractC9452pp = d(deserializationContext, beanProperty, abstractC9452pp);
        }
        JavaType j = this.c.j();
        if (abstractC9452pp == null) {
            e = deserializationContext.c(j, beanProperty);
        } else {
            e = deserializationContext.e(abstractC9452pp, beanProperty, j);
        }
        AbstractC9452pp<?> abstractC9452pp2 = e;
        AbstractC9543ra abstractC9543ra = this.f13106o;
        if (abstractC9543ra != null) {
            abstractC9543ra = abstractC9543ra.d(beanProperty);
        }
        AbstractC9543ra abstractC9543ra2 = abstractC9543ra;
        HashSet hashSet = this.d;
        AnnotationIntrospector f = deserializationContext.f();
        if (StdDeserializer.b(f, beanProperty) && (e2 = beanProperty.e()) != null && (p = f.p(e2)) != null) {
            Set<String> d = p.d();
            if (!d.isEmpty()) {
                hashSet = hashSet == null ? new HashSet() : new HashSet(hashSet);
                for (String str : d) {
                    hashSet.add(str);
                }
            }
        }
        return d(abstractC9450pn2, abstractC9543ra2, abstractC9452pp2, b(deserializationContext, beanProperty, abstractC9452pp2), hashSet);
    }

    @Override // o.AbstractC9452pp
    /* renamed from: d */
    public Map<Object, Object> b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this.f != null) {
            return c(jsonParser, deserializationContext);
        }
        AbstractC9452pp<Object> abstractC9452pp = this.a;
        if (abstractC9452pp != null) {
            return (Map) this.l.b(deserializationContext, abstractC9452pp.b(jsonParser, deserializationContext));
        }
        if (!this.b) {
            return (Map) deserializationContext.c(f(), j(), jsonParser, "no default constructor found", new Object[0]);
        }
        JsonToken o2 = jsonParser.o();
        if (o2 != JsonToken.START_OBJECT && o2 != JsonToken.FIELD_NAME && o2 != JsonToken.END_OBJECT) {
            if (o2 == JsonToken.VALUE_STRING) {
                return (Map) this.l.a(deserializationContext, jsonParser.A());
            }
            return t(jsonParser, deserializationContext);
        }
        Map<Object, Object> map = (Map) this.l.e(deserializationContext);
        if (this.j) {
            e(jsonParser, deserializationContext, map);
            return map;
        }
        b(jsonParser, deserializationContext, map);
        return map;
    }

    @Override // o.AbstractC9452pp
    /* renamed from: c */
    public Map<Object, Object> e(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) {
        jsonParser.e(map);
        JsonToken o2 = jsonParser.o();
        if (o2 == JsonToken.START_OBJECT || o2 == JsonToken.FIELD_NAME) {
            if (this.j) {
                d(jsonParser, deserializationContext, map);
                return map;
            }
            a(jsonParser, deserializationContext, map);
            return map;
        }
        return (Map) deserializationContext.e(f(), jsonParser);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        return abstractC9543ra.a(jsonParser, deserializationContext);
    }

    public final Class<?> f() {
        return this.c.h();
    }

    protected final void b(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) {
        String l;
        Object a;
        AbstractC9450pn abstractC9450pn = this.e;
        AbstractC9452pp<Object> abstractC9452pp = this.m;
        AbstractC9543ra abstractC9543ra = this.f13106o;
        boolean z = abstractC9452pp.b() != null;
        c cVar = z ? new c(this.c.j().h(), map) : null;
        if (jsonParser.K()) {
            l = jsonParser.R();
        } else {
            JsonToken o2 = jsonParser.o();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (o2 != jsonToken) {
                if (o2 == JsonToken.END_OBJECT) {
                    return;
                }
                deserializationContext.e(this, jsonToken, (String) null, new Object[0]);
            }
            l = jsonParser.l();
        }
        while (l != null) {
            Object c2 = abstractC9450pn.c(l, deserializationContext);
            JsonToken Q = jsonParser.Q();
            Set<String> set = this.d;
            if (set != null && set.contains(l)) {
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
                    if (z) {
                        cVar.b(c2, a);
                    } else {
                        map.put(c2, a);
                    }
                } catch (UnresolvedForwardReference e) {
                    a(deserializationContext, cVar, c2, e);
                } catch (Exception e2) {
                    e(e2, map, l);
                }
            }
            l = jsonParser.R();
        }
    }

    protected final void e(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) {
        String l;
        Object a;
        AbstractC9452pp<Object> abstractC9452pp = this.m;
        AbstractC9543ra abstractC9543ra = this.f13106o;
        boolean z = abstractC9452pp.b() != null;
        c cVar = z ? new c(this.c.j().h(), map) : null;
        if (jsonParser.K()) {
            l = jsonParser.R();
        } else {
            JsonToken o2 = jsonParser.o();
            if (o2 == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (o2 != jsonToken) {
                deserializationContext.e(this, jsonToken, (String) null, new Object[0]);
            }
            l = jsonParser.l();
        }
        while (l != null) {
            JsonToken Q = jsonParser.Q();
            Set<String> set = this.d;
            if (set != null && set.contains(l)) {
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
                    if (z) {
                        cVar.b(l, a);
                    } else {
                        map.put(l, a);
                    }
                } catch (UnresolvedForwardReference e) {
                    a(deserializationContext, cVar, l, e);
                } catch (Exception e2) {
                    e(e2, map, l);
                }
            }
            l = jsonParser.R();
        }
    }

    public Map<Object, Object> c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String l;
        Object a;
        PropertyBasedCreator propertyBasedCreator = this.f;
        C9491qb d = propertyBasedCreator.d(jsonParser, deserializationContext, null);
        AbstractC9452pp<Object> abstractC9452pp = this.m;
        AbstractC9543ra abstractC9543ra = this.f13106o;
        if (jsonParser.K()) {
            l = jsonParser.R();
        } else {
            l = jsonParser.a(JsonToken.FIELD_NAME) ? jsonParser.l() : null;
        }
        while (l != null) {
            JsonToken Q = jsonParser.Q();
            Set<String> set = this.d;
            if (set != null && set.contains(l)) {
                jsonParser.T();
            } else {
                SettableBeanProperty b2 = propertyBasedCreator.b(l);
                if (b2 != null) {
                    if (d.a(b2, b2.a(jsonParser, deserializationContext))) {
                        jsonParser.Q();
                        try {
                            Map<Object, Object> map = (Map) propertyBasedCreator.e(deserializationContext, d);
                            b(jsonParser, deserializationContext, map);
                            return map;
                        } catch (Exception e) {
                            return (Map) e(e, this.c.h(), l);
                        }
                    }
                } else {
                    Object c2 = this.e.c(l, deserializationContext);
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
                        d.b(c2, a);
                    } catch (Exception e2) {
                        e(e2, this.c.h(), l);
                        return null;
                    }
                }
            }
            l = jsonParser.R();
        }
        try {
            return (Map) propertyBasedCreator.e(deserializationContext, d);
        } catch (Exception e3) {
            e(e3, this.c.h(), l);
            return null;
        }
    }

    protected final void a(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) {
        String l;
        Object a;
        AbstractC9450pn abstractC9450pn = this.e;
        AbstractC9452pp<Object> abstractC9452pp = this.m;
        AbstractC9543ra abstractC9543ra = this.f13106o;
        if (jsonParser.K()) {
            l = jsonParser.R();
        } else {
            JsonToken o2 = jsonParser.o();
            if (o2 == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (o2 != jsonToken) {
                deserializationContext.e(this, jsonToken, (String) null, new Object[0]);
            }
            l = jsonParser.l();
        }
        while (l != null) {
            Object c2 = abstractC9450pn.c(l, deserializationContext);
            JsonToken Q = jsonParser.Q();
            Set<String> set = this.d;
            if (set != null && set.contains(l)) {
                jsonParser.T();
            } else {
                try {
                    if (Q != JsonToken.VALUE_NULL) {
                        Object obj = map.get(c2);
                        if (obj != null) {
                            if (abstractC9543ra == null) {
                                a = abstractC9452pp.e(jsonParser, deserializationContext, obj);
                            } else {
                                a = abstractC9452pp.a(jsonParser, deserializationContext, abstractC9543ra, obj);
                            }
                        } else if (abstractC9543ra == null) {
                            a = abstractC9452pp.b(jsonParser, deserializationContext);
                        } else {
                            a = abstractC9452pp.a(jsonParser, deserializationContext, abstractC9543ra);
                        }
                        if (a != obj) {
                            map.put(c2, a);
                        }
                    } else if (!this.i) {
                        map.put(c2, this.g.c(deserializationContext));
                    }
                } catch (Exception e) {
                    e(e, map, l);
                }
            }
            l = jsonParser.R();
        }
    }

    protected final void d(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) {
        String l;
        Object a;
        AbstractC9452pp<Object> abstractC9452pp = this.m;
        AbstractC9543ra abstractC9543ra = this.f13106o;
        if (jsonParser.K()) {
            l = jsonParser.R();
        } else {
            JsonToken o2 = jsonParser.o();
            if (o2 == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (o2 != jsonToken) {
                deserializationContext.e(this, jsonToken, (String) null, new Object[0]);
            }
            l = jsonParser.l();
        }
        while (l != null) {
            JsonToken Q = jsonParser.Q();
            Set<String> set = this.d;
            if (set != null && set.contains(l)) {
                jsonParser.T();
            } else {
                try {
                    if (Q != JsonToken.VALUE_NULL) {
                        Object obj = map.get(l);
                        if (obj != null) {
                            if (abstractC9543ra == null) {
                                a = abstractC9452pp.e(jsonParser, deserializationContext, obj);
                            } else {
                                a = abstractC9452pp.a(jsonParser, deserializationContext, abstractC9543ra, obj);
                            }
                        } else if (abstractC9543ra == null) {
                            a = abstractC9452pp.b(jsonParser, deserializationContext);
                        } else {
                            a = abstractC9452pp.a(jsonParser, deserializationContext, abstractC9543ra);
                        }
                        if (a != obj) {
                            map.put(l, a);
                        }
                    } else if (!this.i) {
                        map.put(l, this.g.c(deserializationContext));
                    }
                } catch (Exception e) {
                    e(e, map, l);
                }
            }
            l = jsonParser.R();
        }
    }

    private void a(DeserializationContext deserializationContext, c cVar, Object obj, UnresolvedForwardReference unresolvedForwardReference) {
        if (cVar == null) {
            deserializationContext.a(this, "Unresolved forward reference but no identity info: " + unresolvedForwardReference, new Object[0]);
        }
        unresolvedForwardReference.a().e(cVar.a(unresolvedForwardReference, obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c {
        private List<b> a = new ArrayList();
        private Map<Object, Object> b;
        private final Class<?> e;

        public c(Class<?> cls, Map<Object, Object> map) {
            this.e = cls;
            this.b = map;
        }

        public void b(Object obj, Object obj2) {
            if (this.a.isEmpty()) {
                this.b.put(obj, obj2);
                return;
            }
            List<b> list = this.a;
            list.get(list.size() - 1).a.put(obj, obj2);
        }

        public C9494qe.d a(UnresolvedForwardReference unresolvedForwardReference, Object obj) {
            b bVar = new b(this, unresolvedForwardReference, this.e, obj);
            this.a.add(bVar);
            return bVar;
        }

        public void d(Object obj, Object obj2) {
            Iterator<b> it = this.a.iterator();
            Map<Object, Object> map = this.b;
            while (it.hasNext()) {
                b next = it.next();
                if (next.d(obj)) {
                    it.remove();
                    map.put(next.c, obj2);
                    map.putAll(next.a);
                    return;
                }
                map = next.a;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b extends C9494qe.d {
        public final Map<Object, Object> a;
        private final c b;
        public final Object c;

        b(c cVar, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this.a = new LinkedHashMap();
            this.b = cVar;
            this.c = obj;
        }

        @Override // o.C9494qe.d
        public void c(Object obj, Object obj2) {
            this.b.d(obj, obj2);
        }
    }
}
