package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.model.leafs.originals.interactive.animations.Ease;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: o.jv  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9140jv {
    private final Map<String, Object> a;
    private boolean b;
    private final Set<C9031hs> c;
    private boolean d;
    private final Map<String, Object> e;
    private final Set<C9031hs> g;

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.b;
    }

    public final Set<C9031hs> d() {
        return this.g;
    }

    public C9140jv() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.e = linkedHashMap;
        this.a = linkedHashMap;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.c = linkedHashSet;
        this.g = linkedHashSet;
        this.b = true;
    }

    public final Map<String, Object> b(InterfaceC7871dIn interfaceC7871dIn) {
        C8632dsu.c((Object) interfaceC7871dIn, "");
        return c(c(interfaceC7871dIn));
    }

    public final Map<String, Object> c(Map<String, ? extends Object> map) {
        Map b;
        C8632dsu.c((Object) map, "");
        if (this.a.isEmpty()) {
            this.e.putAll(map);
            return this.a;
        }
        Object obj = map.get("incremental");
        List<Map<String, ? extends Object>> list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            this.d = true;
        } else {
            this.d = false;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map<String, ? extends Object> map2 : list) {
                d(map2);
                Object obj2 = map2.get("errors");
                List list2 = obj2 instanceof List ? (List) obj2 : null;
                if (list2 != null) {
                    C8571dqn.b(arrayList, list2);
                }
                Object obj3 = map2.get("extensions");
                Map map3 = obj3 instanceof Map ? (Map) obj3 : null;
                if (map3 != null) {
                    arrayList2.add(map3);
                }
            }
            if (!arrayList.isEmpty()) {
                this.e.put("errors", arrayList);
            } else {
                this.e.remove("errors");
            }
            if (!arrayList2.isEmpty()) {
                Map<String, Object> map4 = this.e;
                b = dqD.b(dpD.a("incremental", arrayList2));
                map4.put("extensions", b);
            } else {
                this.e.remove("extensions");
            }
        }
        Boolean bool = (Boolean) map.get("hasNext");
        this.b = bool != null ? bool.booleanValue() : false;
        return this.a;
    }

    private final void d(Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2 = (Map) map.get(NotificationFactory.DATA);
        Object obj = map.get(Ease.ANIMATION_EASE_TYPE.PATH);
        C8632dsu.d(obj);
        List<? extends Object> list = (List) obj;
        Object obj2 = this.a.get(NotificationFactory.DATA);
        C8632dsu.d(obj2);
        Map<String, ? extends Object> map3 = (Map) obj2;
        if (map2 != null) {
            Object b = b(map3, list);
            C8632dsu.d(b);
            d(dsH.d(b), map2);
            this.c.add(new C9031hs(list, (String) map.get("label")));
        }
    }

    private final void d(Map<String, Object> map, Map<String, ? extends Object> map2) {
        for (Map.Entry<String, ? extends Object> entry : map2.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (map.containsKey(key) && dsH.f(map.get(key))) {
                Object obj = map.get(key);
                C8632dsu.d(obj);
                Map<String, Object> d = dsH.d(obj);
                Map<String, ? extends Object> map3 = value instanceof Map ? (Map) value : null;
                if (map3 == null) {
                    throw new IllegalStateException(('\'' + key + "' is an object in destination but not in map").toString());
                }
                d(d, map3);
            } else {
                map.put(key, value);
            }
        }
    }

    private final Map<String, Object> c(InterfaceC7871dIn interfaceC7871dIn) {
        Object b = C9011hY.b(new C9068ic(interfaceC7871dIn));
        C8632dsu.d(b);
        return (Map) b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map<java.lang.String, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    private final Object b(Map<String, ? extends Object> map, List<? extends Object> list) {
        for (Object obj : list) {
            if (map instanceof List) {
                C8632dsu.d(obj);
                map = ((List) map).get(((Integer) obj).intValue());
            } else {
                C8632dsu.d((Object) map);
                map = ((Map) map).get(obj);
            }
        }
        return map;
    }

    public final void e() {
        this.e.clear();
        this.c.clear();
        this.b = true;
        this.d = false;
    }
}
