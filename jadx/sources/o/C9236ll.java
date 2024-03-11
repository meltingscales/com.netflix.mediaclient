package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C9246lv;

/* renamed from: o.ll  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9236ll implements C9246lv.a {
    private final Map<String, String> d;
    private final String e;

    public C9236ll() {
        this(null, 1, null);
    }

    public final Map<String, String> a() {
        return this.d;
    }

    public C9236ll(Map<String, String> map) {
        this.d = map;
        this.e = "__EMPTY_VARIANT_SENTINEL__";
    }

    public /* synthetic */ C9236ll(Map map, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }

    public void e(String str, String str2) {
        synchronized (this) {
            Map<String, String> map = this.d;
            if (str2 == null) {
                str2 = this.e;
            }
            map.put(str, str2);
        }
    }

    public void e() {
        synchronized (this) {
            this.d.clear();
        }
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        Map l;
        synchronized (this) {
            l = dqE.l(a());
        }
        c9246lv.c();
        for (Map.Entry entry : l.entrySet()) {
            String str = (String) entry.getValue();
            c9246lv.e();
            c9246lv.c("featureFlag").e((String) entry.getKey());
            if (!C8632dsu.c((Object) str, (Object) this.e)) {
                c9246lv.c("variant").e(str);
            }
            c9246lv.d();
        }
        c9246lv.b();
    }

    public final List<C9240lp> b() {
        ArrayList arrayList;
        int d;
        synchronized (this) {
            Set<Map.Entry<String, String>> entrySet = this.d.entrySet();
            d = C8572dqo.d(entrySet, 10);
            arrayList = new ArrayList(d);
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (C8632dsu.c((Object) str2, (Object) this.e)) {
                    str2 = null;
                }
                arrayList.add(new C9240lp(str, str2));
            }
        }
        return arrayList;
    }

    public final C9236ll c() {
        C9236ll c9236ll;
        Map k;
        synchronized (this) {
            k = dqE.k(this.d);
            c9236ll = new C9236ll(k);
        }
        return c9236ll;
    }
}
