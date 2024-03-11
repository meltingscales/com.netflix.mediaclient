package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.AbstractC9445pi;
import o.AbstractC9452pp;
import o.C9422pL;
import o.C9435pY;
import o.C9491qb;
import o.C9494qe;
import o.C9542rZ;

/* loaded from: classes5.dex */
public class BeanDeserializer extends BeanDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient Exception c;
    private volatile transient NameTransformer w;

    public BeanDeserializer(C9422pL c9422pL, AbstractC9445pi abstractC9445pi, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, HashSet<String> hashSet, boolean z, boolean z2) {
        super(c9422pL, abstractC9445pi, beanPropertyMap, map, hashSet, z, z2);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase) {
        super(beanDeserializerBase, beanDeserializerBase.l);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase, nameTransformer);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase, objectIdReader);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        super(beanDeserializerBase, set);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, o.AbstractC9452pp
    public AbstractC9452pp<Object> d(NameTransformer nameTransformer) {
        if (getClass() == BeanDeserializer.class && this.w != nameTransformer) {
            this.w = nameTransformer;
            try {
                return new BeanDeserializer(this, nameTransformer);
            } finally {
                this.w = null;
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    /* renamed from: e */
    public BeanDeserializer b(ObjectIdReader objectIdReader) {
        return new BeanDeserializer(this, objectIdReader);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    /* renamed from: a */
    public BeanDeserializer c(Set<String> set) {
        return new BeanDeserializer(this, set);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase e(BeanPropertyMap beanPropertyMap) {
        return new BeanDeserializer(this, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    protected BeanDeserializerBase f() {
        return new BeanAsArrayDeserializer(this, this.g.b());
    }

    @Override // o.AbstractC9452pp
    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.K()) {
            if (this.u) {
                return c(jsonParser, deserializationContext, jsonParser.Q());
            }
            jsonParser.Q();
            if (this.k != null) {
                return p(jsonParser, deserializationContext);
            }
            return c(jsonParser, deserializationContext);
        }
        return d(jsonParser, deserializationContext, jsonParser.o());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fasterxml.jackson.databind.deser.BeanDeserializer$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[JsonToken.values().length];
            c = iArr;
            try {
                iArr[JsonToken.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[JsonToken.VALUE_TRUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[JsonToken.VALUE_NULL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[JsonToken.START_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[JsonToken.FIELD_NAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[JsonToken.END_OBJECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    protected final Object d(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) {
        if (jsonToken != null) {
            switch (AnonymousClass4.c[jsonToken.ordinal()]) {
                case 1:
                    return r(jsonParser, deserializationContext);
                case 2:
                    return n(jsonParser, deserializationContext);
                case 3:
                    return k(jsonParser, deserializationContext);
                case 4:
                    return m(jsonParser, deserializationContext);
                case 5:
                case 6:
                    return f(jsonParser, deserializationContext);
                case 7:
                    return a(jsonParser, deserializationContext);
                case 8:
                    return g(jsonParser, deserializationContext);
                case 9:
                case 10:
                    if (this.u) {
                        return c(jsonParser, deserializationContext, jsonToken);
                    }
                    if (this.k != null) {
                        return p(jsonParser, deserializationContext);
                    }
                    return c(jsonParser, deserializationContext);
            }
        }
        return deserializationContext.d(h(deserializationContext), jsonParser);
    }

    @Override // o.AbstractC9452pp
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        String l;
        Class<?> b;
        jsonParser.e(obj);
        if (this.f13104o != null) {
            e(deserializationContext, obj);
        }
        if (this.p != null) {
            return a(jsonParser, deserializationContext, obj);
        }
        if (this.j != null) {
            return c(jsonParser, deserializationContext, obj);
        }
        if (jsonParser.K()) {
            l = jsonParser.R();
            if (l == null) {
                return obj;
            }
        } else if (!jsonParser.e(5)) {
            return obj;
        } else {
            l = jsonParser.l();
        }
        if (!this.n || (b = deserializationContext.b()) == null) {
            do {
                jsonParser.Q();
                SettableBeanProperty e = this.g.e(l);
                if (e != null) {
                    try {
                        e.d(jsonParser, deserializationContext, obj);
                    } catch (Exception e2) {
                        b(e2, obj, l, deserializationContext);
                    }
                } else {
                    e(jsonParser, deserializationContext, obj, l);
                }
                l = jsonParser.R();
            } while (l != null);
            return obj;
        }
        return d(jsonParser, deserializationContext, obj, b);
    }

    private final Object c(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) {
        Object e = this.r.e(deserializationContext);
        jsonParser.e(e);
        if (jsonParser.e(5)) {
            String l = jsonParser.l();
            do {
                jsonParser.Q();
                SettableBeanProperty e2 = this.g.e(l);
                if (e2 != null) {
                    try {
                        e2.d(jsonParser, deserializationContext, e);
                    } catch (Exception e3) {
                        b(e3, e, l, deserializationContext);
                    }
                } else {
                    e(jsonParser, deserializationContext, e, l);
                }
                l = jsonParser.R();
            } while (l != null);
            return e;
        }
        return e;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Class<?> b;
        Object x;
        ObjectIdReader objectIdReader = this.k;
        if (objectIdReader != null && objectIdReader.c() && jsonParser.e(5) && this.k.a(jsonParser.l(), jsonParser)) {
            return o(jsonParser, deserializationContext);
        }
        if (this.m) {
            if (this.p != null) {
                return h(jsonParser, deserializationContext);
            }
            if (this.j != null) {
                return j(jsonParser, deserializationContext);
            }
            Object l = l(jsonParser, deserializationContext);
            if (this.f13104o != null) {
                e(deserializationContext, l);
            }
            return l;
        }
        Object e = this.r.e(deserializationContext);
        jsonParser.e(e);
        if (jsonParser.b() && (x = jsonParser.x()) != null) {
            e(jsonParser, deserializationContext, e, x);
        }
        if (this.f13104o != null) {
            e(deserializationContext, e);
        }
        if (this.n && (b = deserializationContext.b()) != null) {
            return d(jsonParser, deserializationContext, e, b);
        }
        if (jsonParser.e(5)) {
            String l2 = jsonParser.l();
            do {
                jsonParser.Q();
                SettableBeanProperty e2 = this.g.e(l2);
                if (e2 != null) {
                    try {
                        e2.d(jsonParser, deserializationContext, e);
                    } catch (Exception e3) {
                        b(e3, e, l2, deserializationContext);
                    }
                } else {
                    e(jsonParser, deserializationContext, e, l2);
                }
                l2 = jsonParser.R();
            } while (l2 != null);
            return e;
        }
        return e;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        Object c;
        PropertyBasedCreator propertyBasedCreator = this.s;
        C9491qb d = propertyBasedCreator.d(jsonParser, deserializationContext, this.k);
        Class<?> b = this.n ? deserializationContext.b() : null;
        JsonToken o2 = jsonParser.o();
        C9542rZ c9542rZ = null;
        ArrayList<a> arrayList = null;
        while (o2 == JsonToken.FIELD_NAME) {
            String l = jsonParser.l();
            jsonParser.Q();
            if (!d.a(l)) {
                SettableBeanProperty b2 = propertyBasedCreator.b(l);
                if (b2 != null) {
                    if (b != null && !b2.a(b)) {
                        jsonParser.T();
                    } else if (d.a(b2, b(jsonParser, deserializationContext, b2))) {
                        jsonParser.Q();
                        try {
                            c = propertyBasedCreator.e(deserializationContext, d);
                        } catch (Exception e) {
                            c = c(e, deserializationContext);
                        }
                        if (c == null) {
                            return deserializationContext.d(c(), (Object) null, h());
                        }
                        jsonParser.e(c);
                        if (c.getClass() != this.f.h()) {
                            return c(jsonParser, deserializationContext, c, c9542rZ);
                        }
                        if (c9542rZ != null) {
                            c = c(deserializationContext, c, c9542rZ);
                        }
                        return e(jsonParser, deserializationContext, c);
                    }
                } else {
                    SettableBeanProperty e2 = this.g.e(l);
                    if (e2 != null) {
                        try {
                            d.b(e2, b(jsonParser, deserializationContext, e2));
                        } catch (UnresolvedForwardReference e3) {
                            a c2 = c(deserializationContext, e2, d, e3);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(c2);
                        }
                    } else {
                        Set<String> set = this.h;
                        if (set == null || !set.contains(l)) {
                            SettableAnyProperty settableAnyProperty = this.e;
                            if (settableAnyProperty != null) {
                                try {
                                    d.b(settableAnyProperty, l, settableAnyProperty.d(jsonParser, deserializationContext));
                                } catch (Exception e4) {
                                    b(e4, this.f.h(), l, deserializationContext);
                                }
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
            }
            o2 = jsonParser.Q();
        }
        try {
            obj = propertyBasedCreator.e(deserializationContext, d);
        } catch (Exception e5) {
            c(e5, deserializationContext);
            obj = null;
        }
        if (arrayList != null) {
            for (a aVar : arrayList) {
                aVar.c(obj);
            }
        }
        if (c9542rZ != null) {
            if (obj.getClass() != this.f.h()) {
                return c((JsonParser) null, deserializationContext, obj, c9542rZ);
            }
            return c(deserializationContext, obj, c9542rZ);
        }
        return obj;
    }

    private a c(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, C9491qb c9491qb, UnresolvedForwardReference unresolvedForwardReference) {
        a aVar = new a(deserializationContext, unresolvedForwardReference, settableBeanProperty.d(), c9491qb, settableBeanProperty);
        unresolvedForwardReference.a().e(aVar);
        return aVar;
    }

    protected final Object b(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        try {
            return settableBeanProperty.a(jsonParser, deserializationContext);
        } catch (Exception e) {
            b(e, this.f.h(), settableBeanProperty.a(), deserializationContext);
            return null;
        }
    }

    protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object c;
        if (jsonParser.X()) {
            C9542rZ c9542rZ = new C9542rZ(jsonParser, deserializationContext);
            c9542rZ.o();
            JsonParser g = c9542rZ.g(jsonParser);
            g.Q();
            if (this.u) {
                c = c(g, deserializationContext, JsonToken.END_OBJECT);
            } else {
                c = c(g, deserializationContext);
            }
            g.close();
            return c;
        }
        return deserializationContext.d(h(deserializationContext), jsonParser);
    }

    protected final Object d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) {
        if (jsonParser.e(5)) {
            String l = jsonParser.l();
            do {
                jsonParser.Q();
                SettableBeanProperty e = this.g.e(l);
                if (e != null) {
                    if (!e.a(cls)) {
                        jsonParser.T();
                    } else {
                        try {
                            e.d(jsonParser, deserializationContext, obj);
                        } catch (Exception e2) {
                            b(e2, obj, l, deserializationContext);
                        }
                    }
                } else {
                    e(jsonParser, deserializationContext, obj, l);
                }
                l = jsonParser.R();
            } while (l != null);
            return obj;
        }
        return obj;
    }

    protected Object h(JsonParser jsonParser, DeserializationContext deserializationContext) {
        AbstractC9452pp<Object> abstractC9452pp = this.i;
        if (abstractC9452pp != null) {
            return this.r.b(deserializationContext, abstractC9452pp.b(jsonParser, deserializationContext));
        }
        if (this.s != null) {
            return i(jsonParser, deserializationContext);
        }
        C9542rZ c9542rZ = new C9542rZ(jsonParser, deserializationContext);
        c9542rZ.l();
        Object e = this.r.e(deserializationContext);
        jsonParser.e(e);
        if (this.f13104o != null) {
            e(deserializationContext, e);
        }
        Class<?> b = this.n ? deserializationContext.b() : null;
        String l = jsonParser.e(5) ? jsonParser.l() : null;
        while (l != null) {
            jsonParser.Q();
            SettableBeanProperty e2 = this.g.e(l);
            if (e2 != null) {
                if (b != null && !e2.a(b)) {
                    jsonParser.T();
                } else {
                    try {
                        e2.d(jsonParser, deserializationContext, e);
                    } catch (Exception e3) {
                        b(e3, e, l, deserializationContext);
                    }
                }
            } else {
                Set<String> set = this.h;
                if (set != null && set.contains(l)) {
                    a(jsonParser, deserializationContext, e, l);
                } else if (this.e == null) {
                    c9542rZ.a(l);
                    c9542rZ.b(jsonParser);
                } else {
                    C9542rZ c = C9542rZ.c(jsonParser);
                    c9542rZ.a(l);
                    c9542rZ.b(c);
                    try {
                        this.e.c(c.r(), deserializationContext, e, l);
                    } catch (Exception e4) {
                        b(e4, e, l, deserializationContext);
                    }
                }
            }
            l = jsonParser.R();
        }
        c9542rZ.o();
        this.p.e(jsonParser, deserializationContext, e, c9542rZ);
        return e;
    }

    protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        JsonToken o2 = jsonParser.o();
        if (o2 == JsonToken.START_OBJECT) {
            o2 = jsonParser.Q();
        }
        C9542rZ c9542rZ = new C9542rZ(jsonParser, deserializationContext);
        c9542rZ.l();
        Class<?> b = this.n ? deserializationContext.b() : null;
        while (o2 == JsonToken.FIELD_NAME) {
            String l = jsonParser.l();
            SettableBeanProperty e = this.g.e(l);
            jsonParser.Q();
            if (e != null) {
                if (b != null && !e.a(b)) {
                    jsonParser.T();
                } else {
                    try {
                        e.d(jsonParser, deserializationContext, obj);
                    } catch (Exception e2) {
                        b(e2, obj, l, deserializationContext);
                    }
                }
            } else {
                Set<String> set = this.h;
                if (set != null && set.contains(l)) {
                    a(jsonParser, deserializationContext, obj, l);
                } else if (this.e == null) {
                    c9542rZ.a(l);
                    c9542rZ.b(jsonParser);
                } else {
                    C9542rZ c = C9542rZ.c(jsonParser);
                    c9542rZ.a(l);
                    c9542rZ.b(c);
                    try {
                        this.e.c(c.r(), deserializationContext, obj, l);
                    } catch (Exception e3) {
                        b(e3, obj, l, deserializationContext);
                    }
                }
            }
            o2 = jsonParser.Q();
        }
        c9542rZ.o();
        this.p.e(jsonParser, deserializationContext, obj, c9542rZ);
        return obj;
    }

    protected Object i(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object c;
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
                if (d.a(b, b(jsonParser, deserializationContext, b))) {
                    JsonToken Q = jsonParser.Q();
                    try {
                        c = propertyBasedCreator.e(deserializationContext, d);
                    } catch (Exception e) {
                        c = c(e, deserializationContext);
                    }
                    jsonParser.e(c);
                    while (Q == JsonToken.FIELD_NAME) {
                        c9542rZ.b(jsonParser);
                        Q = jsonParser.Q();
                    }
                    JsonToken jsonToken = JsonToken.END_OBJECT;
                    if (Q != jsonToken) {
                        deserializationContext.e(this, jsonToken, "Attempted to unwrap '%s' value", c().getName());
                    }
                    c9542rZ.o();
                    if (c.getClass() != this.f.h()) {
                        deserializationContext.a(b, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                        return null;
                    }
                    return this.p.e(jsonParser, deserializationContext, c, c9542rZ);
                }
            } else if (!d.a(l)) {
                SettableBeanProperty e2 = this.g.e(l);
                if (e2 != null) {
                    d.b(e2, b(jsonParser, deserializationContext, e2));
                } else {
                    Set<String> set = this.h;
                    if (set != null && set.contains(l)) {
                        a(jsonParser, deserializationContext, c(), l);
                    } else if (this.e == null) {
                        c9542rZ.a(l);
                        c9542rZ.b(jsonParser);
                    } else {
                        C9542rZ c2 = C9542rZ.c(jsonParser);
                        c9542rZ.a(l);
                        c9542rZ.b(c2);
                        try {
                            SettableAnyProperty settableAnyProperty = this.e;
                            d.b(settableAnyProperty, l, settableAnyProperty.d(c2.r(), deserializationContext));
                        } catch (Exception e3) {
                            b(e3, this.f.h(), l, deserializationContext);
                        }
                    }
                }
            }
            o2 = jsonParser.Q();
        }
        try {
            return this.p.e(jsonParser, deserializationContext, propertyBasedCreator.e(deserializationContext, d), c9542rZ);
        } catch (Exception e4) {
            c(e4, deserializationContext);
            return null;
        }
    }

    protected Object j(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this.s != null) {
            return e(jsonParser, deserializationContext);
        }
        AbstractC9452pp<Object> abstractC9452pp = this.i;
        if (abstractC9452pp != null) {
            return this.r.b(deserializationContext, abstractC9452pp.b(jsonParser, deserializationContext));
        }
        return c(jsonParser, deserializationContext, this.r.e(deserializationContext));
    }

    protected Object c(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Class<?> b = this.n ? deserializationContext.b() : null;
        C9435pY a2 = this.j.a();
        JsonToken o2 = jsonParser.o();
        while (o2 == JsonToken.FIELD_NAME) {
            String l = jsonParser.l();
            JsonToken Q = jsonParser.Q();
            SettableBeanProperty e = this.g.e(l);
            if (e != null) {
                if (Q.b()) {
                    a2.c(jsonParser, deserializationContext, l, obj);
                }
                if (b != null && !e.a(b)) {
                    jsonParser.T();
                } else {
                    try {
                        e.d(jsonParser, deserializationContext, obj);
                    } catch (Exception e2) {
                        b(e2, obj, l, deserializationContext);
                    }
                }
            } else {
                Set<String> set = this.h;
                if (set != null && set.contains(l)) {
                    a(jsonParser, deserializationContext, obj, l);
                } else if (!a2.e(jsonParser, deserializationContext, l, obj)) {
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
        return a2.c(jsonParser, deserializationContext, obj);
    }

    protected Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        C9435pY a2 = this.j.a();
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
                if (!a2.e(jsonParser, deserializationContext, l, null) && d.a(b, b(jsonParser, deserializationContext, b))) {
                    JsonToken Q = jsonParser.Q();
                    try {
                        Object e = propertyBasedCreator.e(deserializationContext, d);
                        while (Q == JsonToken.FIELD_NAME) {
                            jsonParser.Q();
                            c9542rZ.b(jsonParser);
                            Q = jsonParser.Q();
                        }
                        if (e.getClass() != this.f.h()) {
                            JavaType javaType = this.f;
                            return deserializationContext.c(javaType, String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", javaType, e.getClass()));
                        }
                        return a2.c(jsonParser, deserializationContext, e);
                    } catch (Exception e2) {
                        b(e2, this.f.h(), l, deserializationContext);
                    }
                }
            } else if (!d.a(l)) {
                SettableBeanProperty e3 = this.g.e(l);
                if (e3 != null) {
                    d.b(e3, e3.a(jsonParser, deserializationContext));
                } else if (!a2.e(jsonParser, deserializationContext, l, null)) {
                    Set<String> set = this.h;
                    if (set == null || !set.contains(l)) {
                        SettableAnyProperty settableAnyProperty = this.e;
                        if (settableAnyProperty != null) {
                            d.b(settableAnyProperty, l, settableAnyProperty.d(jsonParser, deserializationContext));
                        }
                    } else {
                        a(jsonParser, deserializationContext, c(), l);
                    }
                }
            }
            o2 = jsonParser.Q();
        }
        c9542rZ.o();
        try {
            return a2.d(jsonParser, deserializationContext, d, propertyBasedCreator);
        } catch (Exception e4) {
            return c(e4, deserializationContext);
        }
    }

    protected Exception h() {
        if (this.c == null) {
            this.c = new NullPointerException("JSON Creator returned null");
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a extends C9494qe.d {
        private final SettableBeanProperty b;
        private Object c;
        private final DeserializationContext e;

        public void c(Object obj) {
            this.c = obj;
        }

        a(DeserializationContext deserializationContext, UnresolvedForwardReference unresolvedForwardReference, JavaType javaType, C9491qb c9491qb, SettableBeanProperty settableBeanProperty) {
            super(unresolvedForwardReference, javaType);
            this.e = deserializationContext;
            this.b = settableBeanProperty;
        }

        @Override // o.C9494qe.d
        public void c(Object obj, Object obj2) {
            if (this.c == null) {
                DeserializationContext deserializationContext = this.e;
                SettableBeanProperty settableBeanProperty = this.b;
                deserializationContext.a(settableBeanProperty, "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", settableBeanProperty.a(), this.b.f().getName());
            }
            this.b.e(this.c, obj2);
        }
    }
}
