package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.util.HashMap;
import o.AbstractC9424pN;
import o.AbstractC9445pi;
import o.AbstractC9450pn;
import o.AbstractC9452pp;
import o.AbstractC9454pr;
import o.AbstractC9509qt;
import o.C9537rU;
import o.InterfaceC9429pS;
import o.InterfaceC9535rS;

/* loaded from: classes5.dex */
public final class DeserializerCache implements Serializable {
    private static final long serialVersionUID = 1;
    protected final LRUMap<JavaType, AbstractC9452pp<Object>> b;
    protected final HashMap<JavaType, AbstractC9452pp<Object>> c;

    public DeserializerCache() {
        this(2000);
    }

    public DeserializerCache(int i) {
        this.c = new HashMap<>(8);
        this.b = new LRUMap<>(Math.min(64, i >> 2), i);
    }

    Object writeReplace() {
        this.c.clear();
        return this;
    }

    public AbstractC9452pp<Object> b(DeserializationContext deserializationContext, AbstractC9424pN abstractC9424pN, JavaType javaType) {
        AbstractC9452pp<Object> b = b(javaType);
        if (b == null) {
            AbstractC9452pp<Object> d = d(deserializationContext, abstractC9424pN, javaType);
            return d == null ? a(deserializationContext, javaType) : d;
        }
        return b;
    }

    public AbstractC9450pn c(DeserializationContext deserializationContext, AbstractC9424pN abstractC9424pN, JavaType javaType) {
        AbstractC9450pn d = abstractC9424pN.d(deserializationContext, javaType);
        if (d == null) {
            return b(deserializationContext, javaType);
        }
        if (d instanceof InterfaceC9429pS) {
            ((InterfaceC9429pS) d).b(deserializationContext);
        }
        return d;
    }

    public boolean j(DeserializationContext deserializationContext, AbstractC9424pN abstractC9424pN, JavaType javaType) {
        AbstractC9452pp<Object> b = b(javaType);
        if (b == null) {
            b = d(deserializationContext, abstractC9424pN, javaType);
        }
        return b != null;
    }

    protected AbstractC9452pp<Object> b(JavaType javaType) {
        if (javaType == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        }
        if (a(javaType)) {
            return null;
        }
        return this.b.a(javaType);
    }

    protected AbstractC9452pp<Object> d(DeserializationContext deserializationContext, AbstractC9424pN abstractC9424pN, JavaType javaType) {
        AbstractC9452pp<Object> abstractC9452pp;
        synchronized (this.c) {
            AbstractC9452pp<Object> b = b(javaType);
            if (b != null) {
                return b;
            }
            int size = this.c.size();
            if (size <= 0 || (abstractC9452pp = this.c.get(javaType)) == null) {
                AbstractC9452pp<Object> a = a(deserializationContext, abstractC9424pN, javaType);
                if (size == 0 && this.c.size() > 0) {
                    this.c.clear();
                }
                return a;
            }
            return abstractC9452pp;
        }
    }

    protected AbstractC9452pp<Object> a(DeserializationContext deserializationContext, AbstractC9424pN abstractC9424pN, JavaType javaType) {
        try {
            AbstractC9452pp<Object> e = e(deserializationContext, abstractC9424pN, javaType);
            if (e == null) {
                return null;
            }
            boolean z = !a(javaType) && e.i();
            if (e instanceof InterfaceC9429pS) {
                this.c.put(javaType, e);
                ((InterfaceC9429pS) e).b(deserializationContext);
                this.c.remove(javaType);
            }
            if (z) {
                this.b.c(javaType, e);
            }
            return e;
        } catch (IllegalArgumentException e2) {
            throw JsonMappingException.c(deserializationContext, C9537rU.d((Throwable) e2), e2);
        }
    }

    protected AbstractC9452pp<Object> e(DeserializationContext deserializationContext, AbstractC9424pN abstractC9424pN, JavaType javaType) {
        DeserializationConfig c = deserializationContext.c();
        if (javaType.s() || javaType.B() || javaType.r()) {
            javaType = abstractC9424pN.c(c, javaType);
        }
        AbstractC9445pi a = c.a(javaType);
        AbstractC9452pp<Object> d = d(deserializationContext, a.k());
        if (d != null) {
            return d;
        }
        JavaType e = e(deserializationContext, a.k(), javaType);
        if (e != javaType) {
            a = c.a(e);
            javaType = e;
        }
        Class<?> h = a.h();
        if (h != null) {
            return abstractC9424pN.c(deserializationContext, javaType, a, h);
        }
        InterfaceC9535rS<Object, Object> g = a.g();
        if (g == null) {
            return d(deserializationContext, abstractC9424pN, javaType, a);
        }
        JavaType d2 = g.d(deserializationContext.e());
        if (!d2.d(javaType.h())) {
            a = c.a(d2);
        }
        return new StdDelegatingDeserializer(g, d2, d(deserializationContext, abstractC9424pN, d2, a));
    }

    protected AbstractC9452pp<?> d(DeserializationContext deserializationContext, AbstractC9424pN abstractC9424pN, JavaType javaType, AbstractC9445pi abstractC9445pi) {
        JsonFormat.Value e;
        JsonFormat.Value e2;
        DeserializationConfig c = deserializationContext.c();
        if (javaType.u()) {
            return abstractC9424pN.b(deserializationContext, javaType, abstractC9445pi);
        }
        if (javaType.x()) {
            if (javaType.p()) {
                return abstractC9424pN.e(deserializationContext, (ArrayType) javaType, abstractC9445pi);
            }
            if (javaType.B() && ((e2 = abstractC9445pi.e(null)) == null || e2.a() != JsonFormat.Shape.OBJECT)) {
                MapLikeType mapLikeType = (MapLikeType) javaType;
                if (mapLikeType.F()) {
                    return abstractC9424pN.d(deserializationContext, (MapType) mapLikeType, abstractC9445pi);
                }
                return abstractC9424pN.c(deserializationContext, mapLikeType, abstractC9445pi);
            } else if (javaType.r() && ((e = abstractC9445pi.e(null)) == null || e.a() != JsonFormat.Shape.OBJECT)) {
                CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
                if (collectionLikeType.F()) {
                    return abstractC9424pN.d(deserializationContext, (CollectionType) collectionLikeType, abstractC9445pi);
                }
                return abstractC9424pN.e(deserializationContext, collectionLikeType, abstractC9445pi);
            }
        }
        if (javaType.d()) {
            return abstractC9424pN.d(deserializationContext, (ReferenceType) javaType, abstractC9445pi);
        }
        if (AbstractC9454pr.class.isAssignableFrom(javaType.h())) {
            return abstractC9424pN.b(c, javaType, abstractC9445pi);
        }
        return abstractC9424pN.f(deserializationContext, javaType, abstractC9445pi);
    }

    protected AbstractC9452pp<Object> d(DeserializationContext deserializationContext, AbstractC9509qt abstractC9509qt) {
        Object b = deserializationContext.f().b(abstractC9509qt);
        if (b == null) {
            return null;
        }
        return e(deserializationContext, abstractC9509qt, deserializationContext.d(abstractC9509qt, b));
    }

    protected AbstractC9452pp<Object> e(DeserializationContext deserializationContext, AbstractC9509qt abstractC9509qt, AbstractC9452pp<Object> abstractC9452pp) {
        InterfaceC9535rS<Object, Object> e = e(deserializationContext, abstractC9509qt);
        return e == null ? abstractC9452pp : new StdDelegatingDeserializer(e, e.d(deserializationContext.e()), abstractC9452pp);
    }

    protected InterfaceC9535rS<Object, Object> e(DeserializationContext deserializationContext, AbstractC9509qt abstractC9509qt) {
        Object c = deserializationContext.f().c(abstractC9509qt);
        if (c == null) {
            return null;
        }
        return deserializationContext.b(abstractC9509qt, c);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.fasterxml.jackson.databind.JavaType e(com.fasterxml.jackson.databind.DeserializationContext r5, o.AbstractC9509qt r6, com.fasterxml.jackson.databind.JavaType r7) {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r5.f()
            if (r0 != 0) goto L7
            return r7
        L7:
            boolean r1 = r7.B()
            if (r1 == 0) goto L2e
            com.fasterxml.jackson.databind.JavaType r1 = r7.f()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r1.l()
            if (r1 != 0) goto L2e
            java.lang.Object r1 = r0.j(r6)
            if (r1 == 0) goto L2e
            o.pn r1 = r5.e(r6, r1)
            if (r1 == 0) goto L2e
            com.fasterxml.jackson.databind.type.MapLikeType r7 = (com.fasterxml.jackson.databind.type.MapLikeType) r7
            com.fasterxml.jackson.databind.type.MapLikeType r7 = r7.g(r1)
            r7.f()
        L2e:
            com.fasterxml.jackson.databind.JavaType r1 = r7.j()
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r1.l()
            if (r1 != 0) goto L5d
            java.lang.Object r1 = r0.d(r6)
            if (r1 == 0) goto L5d
            boolean r2 = r1 instanceof o.AbstractC9452pp
            if (r2 == 0) goto L47
            o.pp r1 = (o.AbstractC9452pp) r1
            goto L56
        L47:
            java.lang.String r2 = "findContentDeserializer"
            java.lang.Class<o.pp$d> r3 = o.AbstractC9452pp.d.class
            java.lang.Class r1 = r4.a(r1, r2, r3)
            if (r1 == 0) goto L56
            o.pp r1 = r5.d(r6, r1)
            goto L57
        L56:
            r1 = 0
        L57:
            if (r1 == 0) goto L5d
            com.fasterxml.jackson.databind.JavaType r7 = r7.c(r1)
        L5d:
            com.fasterxml.jackson.databind.DeserializationConfig r5 = r5.c()
            com.fasterxml.jackson.databind.JavaType r5 = r0.e(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.DeserializerCache.e(com.fasterxml.jackson.databind.DeserializationContext, o.qt, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JavaType");
    }

    private boolean a(JavaType javaType) {
        if (javaType.x()) {
            JavaType j = javaType.j();
            if (j == null || (j.l() == null && j.m() == null)) {
                return javaType.B() && javaType.f().l() != null;
            }
            return true;
        }
        return false;
    }

    private Class<?> a(Object obj, String str, Class<?> cls) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector." + str + "() returned value of type " + obj.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
        }
        Class<?> cls2 = (Class) obj;
        if (cls2 == cls || C9537rU.l(cls2)) {
            return null;
        }
        return cls2;
    }

    protected AbstractC9452pp<Object> a(DeserializationContext deserializationContext, JavaType javaType) {
        if (!C9537rU.q(javaType.h())) {
            return (AbstractC9452pp) deserializationContext.c(javaType, "Cannot find a Value deserializer for abstract type " + javaType);
        }
        return (AbstractC9452pp) deserializationContext.c(javaType, "Cannot find a Value deserializer for type " + javaType);
    }

    protected AbstractC9450pn b(DeserializationContext deserializationContext, JavaType javaType) {
        return (AbstractC9450pn) deserializationContext.c(javaType, "Cannot find a (Map) Key deserializer for type " + javaType);
    }
}
