package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import o.AbstractC9464qA;
import o.C9468qE;
import o.C9472qI;
import o.C9508qs;
import o.C9510qu;
import o.C9537rU;
import o.InterfaceC9411pA;

/* loaded from: classes5.dex */
public class BasicClassIntrospector extends AbstractC9464qA implements Serializable {
    protected static final C9468qE a;
    protected static final C9468qE b = C9468qE.c(null, SimpleType.a((Class<?>) String.class), C9510qu.e(String.class));
    protected static final C9468qE d;
    protected static final C9468qE e;
    private static final long serialVersionUID = 1;
    protected final LRUMap<JavaType, C9468qE> c = new LRUMap<>(16, 64);

    static {
        Class cls = Boolean.TYPE;
        e = C9468qE.c(null, SimpleType.a((Class<?>) cls), C9510qu.e(cls));
        Class cls2 = Integer.TYPE;
        a = C9468qE.c(null, SimpleType.a((Class<?>) cls2), C9510qu.e(cls2));
        Class cls3 = Long.TYPE;
        d = C9468qE.c(null, SimpleType.a((Class<?>) cls3), C9510qu.e(cls3));
    }

    @Override // o.AbstractC9464qA
    public AbstractC9464qA e() {
        return new BasicClassIntrospector();
    }

    @Override // o.AbstractC9464qA
    /* renamed from: a */
    public C9468qE d(SerializationConfig serializationConfig, JavaType javaType, AbstractC9464qA.c cVar) {
        C9468qE a2 = a(javaType);
        if (a2 == null) {
            a2 = b(serializationConfig, javaType);
            if (a2 == null) {
                a2 = C9468qE.e(c((MapperConfig<?>) serializationConfig, javaType, cVar, true, "set"));
            }
            this.c.e(javaType, a2);
        }
        return a2;
    }

    @Override // o.AbstractC9464qA
    /* renamed from: a */
    public C9468qE c(DeserializationConfig deserializationConfig, JavaType javaType, AbstractC9464qA.c cVar) {
        C9468qE a2 = a(javaType);
        if (a2 == null) {
            a2 = b(deserializationConfig, javaType);
            if (a2 == null) {
                a2 = C9468qE.a(c((MapperConfig<?>) deserializationConfig, javaType, cVar, false, "set"));
            }
            this.c.e(javaType, a2);
        }
        return a2;
    }

    @Override // o.AbstractC9464qA
    /* renamed from: h */
    public C9468qE b(DeserializationConfig deserializationConfig, JavaType javaType, AbstractC9464qA.c cVar) {
        C9468qE a2 = C9468qE.a(b(deserializationConfig, javaType, cVar, false));
        this.c.e(javaType, a2);
        return a2;
    }

    @Override // o.AbstractC9464qA
    /* renamed from: d */
    public C9468qE e(DeserializationConfig deserializationConfig, JavaType javaType, AbstractC9464qA.c cVar) {
        C9468qE a2 = a(javaType);
        if (a2 == null) {
            C9468qE b2 = b(deserializationConfig, javaType);
            return b2 == null ? C9468qE.a(c((MapperConfig<?>) deserializationConfig, javaType, cVar, false, "set")) : b2;
        }
        return a2;
    }

    @Override // o.AbstractC9464qA
    /* renamed from: b */
    public C9468qE d(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC9464qA.c cVar) {
        C9468qE a2 = a(javaType);
        if (a2 == null) {
            C9468qE a3 = this.c.a(javaType);
            if (a3 == null) {
                C9468qE c = C9468qE.c(mapperConfig, javaType, e(mapperConfig, javaType, cVar));
                this.c.c(javaType, c);
                return c;
            }
            return a3;
        }
        return a2;
    }

    protected C9472qI c(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC9464qA.c cVar, boolean z, String str) {
        return c(mapperConfig, e(mapperConfig, javaType, cVar), javaType, z, str);
    }

    protected C9472qI b(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC9464qA.c cVar, boolean z) {
        C9508qs e2 = e(mapperConfig, javaType, cVar);
        AnnotationIntrospector h = mapperConfig.p() ? mapperConfig.h() : null;
        InterfaceC9411pA.d c = h != null ? h.c(e2) : null;
        return c(mapperConfig, e2, javaType, z, c == null ? "with" : c.b);
    }

    protected C9472qI c(MapperConfig<?> mapperConfig, C9508qs c9508qs, JavaType javaType, boolean z, String str) {
        return new C9472qI(mapperConfig, z, javaType, c9508qs, str);
    }

    protected C9468qE a(JavaType javaType) {
        Class<?> h = javaType.h();
        if (!h.isPrimitive()) {
            if (h == String.class) {
                return b;
            }
            return null;
        } else if (h == Boolean.TYPE) {
            return e;
        } else {
            if (h == Integer.TYPE) {
                return a;
            }
            if (h == Long.TYPE) {
                return d;
            }
            return null;
        }
    }

    protected boolean b(JavaType javaType) {
        Class<?> h;
        String m;
        if (!javaType.x() || javaType.p() || (m = C9537rU.m((h = javaType.h()))) == null) {
            return false;
        }
        if (m.startsWith("java.lang") || m.startsWith("java.util")) {
            return Collection.class.isAssignableFrom(h) || Map.class.isAssignableFrom(h);
        }
        return false;
    }

    protected C9468qE b(MapperConfig<?> mapperConfig, JavaType javaType) {
        if (b(javaType)) {
            return C9468qE.c(mapperConfig, javaType, e(mapperConfig, javaType, mapperConfig));
        }
        return null;
    }

    protected C9508qs e(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC9464qA.c cVar) {
        return C9510qu.d(mapperConfig, javaType, cVar);
    }
}
