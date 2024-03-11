package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: o.rq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9559rq extends AbstractC9552rj {
    protected final Map<String, String> a;
    protected final MapperConfig<?> b;
    protected final Map<String, JavaType> e;

    protected C9559rq(MapperConfig<?> mapperConfig, JavaType javaType, Map<String, String> map, Map<String, JavaType> map2) {
        super(javaType, mapperConfig.t());
        this.b = mapperConfig;
        this.a = map;
        this.e = map2;
    }

    public static C9559rq d(MapperConfig<?> mapperConfig, JavaType javaType, Collection<NamedType> collection, boolean z, boolean z2) {
        JavaType javaType2;
        if (z == z2) {
            throw new IllegalArgumentException();
        }
        HashMap hashMap = null;
        Map hashMap2 = z ? new HashMap() : null;
        if (z2) {
            hashMap = new HashMap();
            hashMap2 = new TreeMap();
        }
        if (collection != null) {
            for (NamedType namedType : collection) {
                Class<?> b = namedType.b();
                String d = namedType.c() ? namedType.d() : a(b);
                if (z) {
                    hashMap2.put(b.getName(), d);
                }
                if (z2 && ((javaType2 = (JavaType) hashMap.get(d)) == null || !b.isAssignableFrom(javaType2.h()))) {
                    hashMap.put(d, mapperConfig.b(b));
                }
            }
        }
        return new C9559rq(mapperConfig, javaType, hashMap2, hashMap);
    }

    @Override // o.InterfaceC9545rc
    public String c(Object obj) {
        return e(obj.getClass());
    }

    protected String e(Class<?> cls) {
        String str;
        if (cls == null) {
            return null;
        }
        Class<?> h = this.c.d((Type) cls).h();
        String name = h.getName();
        synchronized (this.a) {
            str = this.a.get(name);
            if (str == null) {
                if (this.b.p()) {
                    str = this.b.h().g(this.b.j(h).k());
                }
                if (str == null) {
                    str = a(h);
                }
                this.a.put(name, str);
            }
        }
        return str;
    }

    @Override // o.InterfaceC9545rc
    public String e(Object obj, Class<?> cls) {
        if (obj == null) {
            return e(cls);
        }
        return c(obj);
    }

    @Override // o.AbstractC9552rj, o.InterfaceC9545rc
    public JavaType e(AbstractC9446pj abstractC9446pj, String str) {
        return c(str);
    }

    protected JavaType c(String str) {
        return this.e.get(str);
    }

    @Override // o.AbstractC9552rj, o.InterfaceC9545rc
    public String a() {
        return new TreeSet(this.e.keySet()).toString();
    }

    public String toString() {
        return String.format("[%s; id-to-type=%s]", getClass().getName(), this.e);
    }

    protected static String a(Class<?> cls) {
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf < 0 ? name : name.substring(lastIndexOf + 1);
    }
}
