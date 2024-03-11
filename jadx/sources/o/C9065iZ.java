package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.text.Regex;

/* renamed from: o.iZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9065iZ extends AbstractC9055iP {
    private final Map<String, a> d = new LinkedHashMap();

    @Override // o.InterfaceC9052iM
    public C9053iN d(String str, C9044iE c9044iE) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c9044iE, "");
        try {
            AbstractC9055iP b = b();
            return d(b != null ? b.d(str, c9044iE) : null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // o.InterfaceC9052iM
    public Collection<C9053iN> e(Collection<String> collection, C9044iE c9044iE) {
        Map d2;
        Collection<C9053iN> e;
        int d3;
        int e2;
        int b;
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) c9044iE, "");
        AbstractC9055iP b2 = b();
        if (b2 == null || (e = b2.e(collection, c9044iE)) == null) {
            d2 = dqE.d();
        } else {
            Collection<C9053iN> collection2 = e;
            d3 = C8572dqo.d(collection2, 10);
            e2 = dqD.e(d3);
            b = C8657dts.b(e2, 16);
            d2 = new LinkedHashMap(b);
            for (Object obj : collection2) {
                d2.put(((C9053iN) obj).e(), obj);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str : collection) {
            C9053iN d4 = d((C9053iN) d2.get(str), str);
            if (d4 != null) {
                arrayList.add(d4);
            }
        }
        return arrayList;
    }

    @Override // o.AbstractC9055iP
    public Set<String> e(C9053iN c9053iN, C9044iE c9044iE) {
        Set<String> e;
        Set<String> e2;
        C8632dsu.c((Object) c9053iN, "");
        C8632dsu.c((Object) c9044iE, "");
        AbstractC9055iP b = b();
        if (b == null || (e2 = b.e(c9053iN, c9044iE)) == null) {
            e = dqN.e();
            return e;
        }
        return e2;
    }

    @Override // o.AbstractC9055iP
    public Set<String> c(Collection<C9053iN> collection, C9044iE c9044iE) {
        Set<String> e;
        Set<String> c;
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) c9044iE, "");
        AbstractC9055iP b = b();
        if (b == null || (c = b.c(collection, c9044iE)) == null) {
            e = dqN.e();
            return e;
        }
        return c;
    }

    @Override // o.AbstractC9055iP
    public void c() {
        this.d.clear();
        AbstractC9055iP b = b();
        if (b != null) {
            b.c();
        }
    }

    @Override // o.AbstractC9055iP
    public int a(String str) {
        C8632dsu.c((Object) str, "");
        Regex c = AbstractC9055iP.b.c(str);
        Iterator<Map.Entry<String, a>> it = this.d.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (c.e(it.next().getKey())) {
                it.remove();
                i++;
            }
        }
        AbstractC9055iP b = b();
        return i + (b != null ? b.a(str) : 0);
    }

    public final Set<String> e(Collection<C9053iN> collection) {
        Set<String> W;
        C8632dsu.c((Object) collection, "");
        ArrayList arrayList = new ArrayList();
        for (C9053iN c9053iN : collection) {
            C8571dqn.b(arrayList, b(c9053iN));
        }
        W = C8576dqs.W(arrayList);
        return W;
    }

    public final Set<String> b(C9053iN c9053iN) {
        C8632dsu.c((Object) c9053iN, "");
        a aVar = this.d.get(c9053iN.e());
        if (aVar == null) {
            this.d.put(c9053iN.e(), new a(c9053iN));
            return c9053iN.a();
        }
        return aVar.e(c9053iN);
    }

    public final Set<String> d(UUID uuid) {
        C8632dsu.c((Object) uuid, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Map.Entry<String, a>> it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            d e = it.next().getValue().e(uuid);
            linkedHashSet.addAll(e.a());
            if (e.d()) {
                it.remove();
            }
        }
        return linkedHashSet;
    }

    private final C9053iN d(C9053iN c9053iN, String str) {
        Pair<C9053iN, Set<String>> d2;
        C9053iN d3;
        a aVar = this.d.get(str);
        return aVar != null ? (c9053iN == null || (d2 = c9053iN.d(aVar.b())) == null || (d3 = d2.d()) == null) ? aVar.b() : d3 : c9053iN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.iZ$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private final boolean a;
        private final Set<String> e;

        public final Set<String> a() {
            return this.e;
        }

        public final boolean d() {
            return this.a;
        }

        public d(Set<String> set, boolean z) {
            C8632dsu.c((Object) set, "");
            this.e = set;
            this.a = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.iZ$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final List<C9053iN> c;
        private C9053iN d;

        public final C9053iN b() {
            return this.d;
        }

        public a(C9053iN c9053iN) {
            List<C9053iN> f;
            C8632dsu.c((Object) c9053iN, "");
            this.d = c9053iN;
            f = C8569dql.f(c9053iN);
            this.c = f;
        }

        public final Set<String> e(C9053iN c9053iN) {
            C8632dsu.c((Object) c9053iN, "");
            Pair<C9053iN, Set<String>> d = this.d.d(c9053iN);
            Set<String> c = d.c();
            this.d = d.b();
            this.c.add(c9053iN);
            return c;
        }

        public final d e(UUID uuid) {
            Set e;
            C8632dsu.c((Object) uuid, "");
            Iterator<C9053iN> it = this.c.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C8632dsu.c(uuid, it.next().j())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                e = dqN.e();
                return new d(e, false);
            } else if (this.c.size() == 1) {
                return new d(this.d.a(), true);
            } else {
                C9053iN c9053iN = this.d;
                this.c.remove(i).e();
                int size = this.c.size();
                C9053iN c9053iN2 = null;
                for (int max = Math.max(0, i - 1); max < size; max++) {
                    C9053iN c9053iN3 = this.c.get(max);
                    c9053iN2 = c9053iN2 == null ? c9053iN3 : c9053iN2.d(c9053iN3).b();
                }
                C8632dsu.d(c9053iN2);
                this.d = c9053iN2;
                return new d(C9053iN.a.a(c9053iN, c9053iN2), false);
            }
        }
    }
}
