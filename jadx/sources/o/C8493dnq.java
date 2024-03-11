package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC8488dnl;

/* renamed from: o.dnq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8493dnq implements InterfaceC8482dnf {
    private final Map<String, List<Object>> c;
    private final Map<String, List<InterfaceC8494dnr>> d;

    public Map<String, List<Object>> c() {
        return this.c;
    }

    public final Map<String, List<InterfaceC8494dnr>> e() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
        r1 = o.dqE.k(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C8493dnq(java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r1) {
        /*
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Lb
            java.util.Map r1 = o.dqF.d(r1)
            if (r1 != 0) goto L10
        Lb:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
        L10:
            r0.c = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8493dnq.<init>(java.util.Map):void");
    }

    @Override // o.InterfaceC8488dnl
    public Object b(String str) {
        C8632dsu.c((Object) str, "");
        List<Object> remove = c().remove(str);
        if (remove == null || remove.isEmpty()) {
            return null;
        }
        if (remove.size() > 1) {
            c().put(str, remove.subList(1, remove.size()));
        }
        return remove.get(0);
    }

    @Override // o.InterfaceC8488dnl
    public InterfaceC8488dnl.b e(String str, InterfaceC8494dnr interfaceC8494dnr) {
        boolean g;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC8494dnr, "");
        g = C8691duz.g(str);
        if (!(!g)) {
            throw new IllegalArgumentException("Registered key is empty or blank".toString());
        }
        Map<String, List<InterfaceC8494dnr>> map = this.d;
        List<InterfaceC8494dnr> list = map.get(str);
        if (list == null) {
            list = new ArrayList<>();
            map.put(str, list);
        }
        list.add(interfaceC8494dnr);
        return new d(str, interfaceC8494dnr);
    }

    /* renamed from: o.dnq$d */
    /* loaded from: classes5.dex */
    public static final class d implements InterfaceC8488dnl.b {
        final /* synthetic */ String a;
        final /* synthetic */ InterfaceC8494dnr d;

        d(String str, InterfaceC8494dnr interfaceC8494dnr) {
            this.a = str;
            this.d = interfaceC8494dnr;
        }

        @Override // o.InterfaceC8488dnl.b
        public void a() {
            List<InterfaceC8494dnr> remove = C8493dnq.this.e().remove(this.a);
            if (remove != null) {
                remove.remove(this.d);
            }
            if (remove == null || remove.isEmpty()) {
                return;
            }
            C8493dnq.this.e().put(this.a, remove);
        }
    }

    @Override // o.InterfaceC8488dnl
    public void a(String str) {
        int d2;
        C8632dsu.c((Object) str, "");
        List<InterfaceC8494dnr> list = this.d.get(str);
        if (list != null) {
            Map<String, List<Object>> c = c();
            d2 = C8572dqo.d(list, 10);
            ArrayList arrayList = new ArrayList(d2);
            for (InterfaceC8494dnr interfaceC8494dnr : list) {
                arrayList.add(interfaceC8494dnr.invoke());
            }
            c.put(str, arrayList);
            this.d.remove(str);
        }
    }

    public void d() {
        c().clear();
    }

    @Override // o.InterfaceC8488dnl
    public void a() {
        int e;
        int d2;
        Map<String, List<InterfaceC8494dnr>> map = this.d;
        e = dqD.e(map.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            List<InterfaceC8494dnr> list = (List) entry.getValue();
            d2 = C8572dqo.d(list, 10);
            ArrayList arrayList = new ArrayList(d2);
            for (InterfaceC8494dnr interfaceC8494dnr : list) {
                arrayList.add(interfaceC8494dnr.invoke());
            }
            for (Object obj : arrayList) {
                if (obj instanceof InterfaceC8488dnl) {
                    ((InterfaceC8488dnl) obj).a();
                }
            }
            linkedHashMap.put(key, arrayList);
        }
        if (!linkedHashMap.isEmpty()) {
            c().putAll(linkedHashMap);
        }
        this.d.clear();
    }
}
