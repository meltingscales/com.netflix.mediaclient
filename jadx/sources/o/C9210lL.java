package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import o.C9246lv;

/* renamed from: o.lL  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9210lL {
    public static final a e = new a(null);
    private Set<Pattern> b;

    public final Set<Pattern> a() {
        return this.b;
    }

    public final void d(Set<Pattern> set) {
        this.b = set;
    }

    public C9210lL() {
        Set<Pattern> a2;
        a2 = dqP.a(Pattern.compile(".*password.*", 2));
        this.b = a2;
    }

    /* renamed from: o.lL$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    public static /* synthetic */ void b(C9210lL c9210lL, Object obj, C9246lv c9246lv, boolean z, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = false;
        }
        c9210lL.a(obj, c9246lv, z);
    }

    public final void a(Object obj, C9246lv c9246lv, boolean z) {
        if (obj == null) {
            c9246lv.a();
        } else if (obj instanceof String) {
            c9246lv.e((String) obj);
        } else if (obj instanceof Number) {
            c9246lv.a((Number) obj);
        } else if (obj instanceof Boolean) {
            c9246lv.b(((Boolean) obj).booleanValue());
        } else if (obj instanceof C9246lv.a) {
            ((C9246lv.a) obj).toStream(c9246lv);
        } else if (obj instanceof Date) {
            C9302my c9302my = C9302my.d;
            c9246lv.e(C9302my.a((Date) obj));
        } else if (obj instanceof Map) {
            c(c9246lv, (Map) obj, z);
        } else if (obj instanceof Collection) {
            d(c9246lv, (Collection) obj);
        } else if (obj.getClass().isArray()) {
            c(c9246lv, obj);
        } else {
            c9246lv.e("[OBJECT]");
        }
    }

    private final void c(C9246lv c9246lv, Map<?, ?> map, boolean z) {
        c9246lv.e();
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            if (key instanceof String) {
                String str = (String) key;
                c9246lv.c(str);
                if (z && a(str)) {
                    c9246lv.e("[REDACTED]");
                } else {
                    a(entry.getValue(), c9246lv, z);
                }
            }
        }
        c9246lv.d();
    }

    private final void d(C9246lv c9246lv, Collection<?> collection) {
        c9246lv.c();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            b(this, it.next(), c9246lv, false, 4, null);
        }
        c9246lv.b();
    }

    private final void c(C9246lv c9246lv, Object obj) {
        c9246lv.c();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            b(this, Array.get(obj, i), c9246lv, false, 4, null);
        }
        c9246lv.b();
    }

    private final boolean a(String str) {
        Set<Pattern> set = this.b;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (Pattern pattern : set) {
                if (pattern.matcher(str).matches()) {
                    return true;
                }
            }
        }
        return false;
    }
}
