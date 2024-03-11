package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import o.C9246lv;

/* renamed from: o.lH  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9206lH implements C9246lv.a {
    public static final a c = new a(null);
    private final C9210lL b;
    private final Map<String, Map<String, Object>> d;

    public C9206lH() {
        this(null, 1, null);
    }

    public final C9206lH b(Map<String, Map<String, Object>> map) {
        return new C9206lH(map);
    }

    public final C9210lL b() {
        return this.b;
    }

    public final Map<String, Map<String, Object>> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9206lH) && C8632dsu.c(this.d, ((C9206lH) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        return "Metadata(store=" + this.d + ')';
    }

    public C9206lH(Map<String, Map<String, Object>> map) {
        this.d = map;
        this.b = new C9210lL();
    }

    public /* synthetic */ C9206lH(Map map, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new ConcurrentHashMap() : map);
    }

    public final Set<Pattern> c() {
        return this.b.a();
    }

    public final void c(Set<Pattern> set) {
        this.b.d(set);
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        this.b.a(this.d, c9246lv, true);
    }

    public void b(String str, Map<String, ? extends Object> map) {
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(str, (String) entry.getKey(), entry.getValue());
        }
    }

    public void a(String str, String str2, Object obj) {
        if (obj == null) {
            d(str, str2);
            return;
        }
        Map<String, Object> map = this.d.get(str);
        if (map == null) {
            map = new ConcurrentHashMap<>();
        }
        this.d.put(str, map);
        b(map, str2, obj);
    }

    private final void b(Map<String, Object> map, String str, Object obj) {
        List<? extends Map<String, ? extends Object>> j;
        Object obj2 = map.get(str);
        if (obj2 != null && (obj instanceof Map)) {
            j = C8569dql.j((Map) obj2, (Map) obj);
            obj = c.a(j);
        }
        map.put(str, obj);
    }

    public void b(String str) {
        this.d.remove(str);
    }

    public void d(String str, String str2) {
        Map<String, Object> map = this.d.get(str);
        if (map != null) {
            map.remove(str2);
        }
        if (map == null || map.isEmpty()) {
            this.d.remove(str);
        }
    }

    public Map<String, Object> c(String str) {
        return this.d.get(str);
    }

    public Object b(String str, String str2) {
        Map<String, Object> c2 = c(str);
        if (c2 == null) {
            return null;
        }
        return c2.get(str2);
    }

    public final Map<String, Map<String, Object>> d() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(this.d);
        Iterator<T> it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            concurrentHashMap.put(entry.getKey(), new ConcurrentHashMap((Map) entry.getValue()));
        }
        return concurrentHashMap;
    }

    /* renamed from: o.lH$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        private final void b(Map<String, Object> map, String str, Map<String, ? extends Object> map2) {
            List<? extends Map<String, ? extends Object>> j;
            Object obj = map.get(str);
            Object obj2 = map2.get(str);
            if (obj2 == null) {
                if (obj != null) {
                    map.put(str, obj);
                }
            } else if ((obj instanceof Map) && (obj2 instanceof Map)) {
                j = C8569dql.j((Map) obj, (Map) obj2);
                map.put(str, a(j));
            } else {
                map.put(str, obj2);
            }
        }

        public final C9206lH b(C9206lH... c9206lHArr) {
            Set<Pattern> W;
            ArrayList arrayList = new ArrayList(c9206lHArr.length);
            for (C9206lH c9206lH : c9206lHArr) {
                arrayList.add(c9206lH.d());
            }
            ArrayList arrayList2 = new ArrayList();
            for (C9206lH c9206lH2 : c9206lHArr) {
                C8571dqn.b(arrayList2, c9206lH2.b().a());
            }
            C9206lH c9206lH3 = new C9206lH(a(arrayList));
            W = C8576dqs.W(arrayList2);
            c9206lH3.c(W);
            return c9206lH3;
        }

        public final Map<String, Object> a(List<? extends Map<String, ? extends Object>> list) {
            Set<String> W;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C8571dqn.b(arrayList, ((Map) it.next()).keySet());
            }
            W = C8576dqs.W(arrayList);
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map<String, ? extends Object> map : list) {
                for (String str : W) {
                    b(concurrentHashMap, str, map);
                }
            }
            return concurrentHashMap;
        }
    }

    public final C9206lH a() {
        Set<Pattern> W;
        C9206lH b = b(d());
        W = C8576dqs.W(c());
        b.c(W);
        return b;
    }

    public final C9265mN e(int i) {
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry<String, Map<String, Object>> entry : this.d.entrySet()) {
            C9265mN a2 = C9262mK.b.a(i, entry.getValue());
            i2 += a2.e();
            i3 += a2.d();
        }
        return new C9265mN(i2, i3);
    }
}
