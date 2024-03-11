package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Ref;
import o.C8571dqn;
import o.C8572dqo;
import o.C8576dqs;
import o.C8657dts;
import o.C9053iN;
import o.C9119ja;
import o.InterfaceC9126jh;
import o.dpR;
import o.dqD;

/* renamed from: o.ja  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9119ja extends AbstractC9055iP {
    private final InterfaceC9126jh a;

    public C9119ja(InterfaceC9126jh interfaceC9126jh) {
        C8632dsu.c((Object) interfaceC9126jh, "");
        this.a = interfaceC9126jh;
    }

    @Override // o.InterfaceC9052iM
    public C9053iN d(String str, C9044iE c9044iE) {
        C9053iN c9053iN;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c9044iE, "");
        try {
            c9053iN = this.a.d(str);
        } catch (Exception e) {
            C9137js.d().invoke(new Exception("Unable to read a record from the database", e));
            c9053iN = null;
        }
        if (c9053iN != null) {
            if (c9044iE.c("evict-after-read")) {
                this.a.b(str);
            }
            return c9053iN;
        }
        AbstractC9055iP b = b();
        if (b != null) {
            return b.d(str, c9044iE);
        }
        return null;
    }

    @Override // o.InterfaceC9052iM
    public Collection<C9053iN> e(Collection<String> collection, C9044iE c9044iE) {
        List<C9053iN> i;
        int d;
        Set W;
        List g;
        List g2;
        AbstractC9055iP b;
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) c9044iE, "");
        try {
            i = e(collection);
        } catch (Exception e) {
            C9137js.d().invoke(new Exception("Unable to read records from the database", e));
            i = C8569dql.i();
        }
        if (c9044iE.c("evict-after-read")) {
            for (C9053iN c9053iN : i) {
                this.a.b(c9053iN.e());
            }
        }
        Collection<String> collection2 = collection;
        d = C8572dqo.d(i, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C9053iN c9053iN2 : i) {
            arrayList.add(c9053iN2.e());
        }
        W = C8576dqs.W(arrayList);
        g = C8576dqs.g((Iterable) collection2, (Iterable) W);
        Collection<C9053iN> collection3 = null;
        if (g.isEmpty()) {
            g = null;
        }
        if (g != null && (b = b()) != null) {
            collection3 = b.e(g, c9044iE);
        }
        if (collection3 == null) {
            collection3 = C8569dql.i();
        }
        g2 = C8576dqs.g((Collection) i, (Iterable) collection3);
        return g2;
    }

    @Override // o.AbstractC9055iP
    public void c() {
        AbstractC9055iP b = b();
        if (b != null) {
            b.c();
        }
        this.a.c();
    }

    @Override // o.AbstractC9055iP
    public int a(final String str) {
        C8632dsu.c((Object) str, "");
        final Ref.IntRef intRef = new Ref.IntRef();
        InterfaceC9126jh.b(this.a, false, new drO<dpR>() { // from class: com.apollographql.apollo3.cache.normalized.sql.SqlNormalizedCache$remove$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }

            public final void c() {
                InterfaceC9126jh interfaceC9126jh;
                InterfaceC9126jh interfaceC9126jh2;
                interfaceC9126jh = C9119ja.this.a;
                interfaceC9126jh.a(str);
                Ref.IntRef intRef2 = intRef;
                interfaceC9126jh2 = C9119ja.this.a;
                intRef2.b = (int) interfaceC9126jh2.e();
            }
        }, 1, null);
        AbstractC9055iP b = b();
        return intRef.b + (b != null ? b.a(str) : 0);
    }

    @Override // o.AbstractC9055iP
    public Set<String> c(Collection<C9053iN> collection, C9044iE c9044iE) {
        Set<String> e;
        Set<String> c;
        Set<String> e2;
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) c9044iE, "");
        if (c9044iE.c("do-not-store")) {
            e2 = dqN.e();
            return e2;
        }
        try {
            Set<String> e3 = e(collection, e(c9044iE));
            AbstractC9055iP b = b();
            Set<String> c2 = b != null ? b.c(collection, c9044iE) : null;
            if (c2 == null) {
                c2 = dqN.e();
            }
            c = dqM.c(e3, c2);
            return c;
        } catch (Exception e4) {
            C9137js.d().invoke(new Exception("Unable to merge records from the database", e4));
            e = dqN.e();
            return e;
        }
    }

    private final Long e(C9044iE c9044iE) {
        String b = c9044iE.b("apollo-date");
        if (b != null) {
            return Long.valueOf(Long.parseLong(b));
        }
        return null;
    }

    @Override // o.AbstractC9055iP
    public Set<String> e(C9053iN c9053iN, C9044iE c9044iE) {
        Set<String> e;
        Set<String> c;
        Set<String> e2;
        C8632dsu.c((Object) c9053iN, "");
        C8632dsu.c((Object) c9044iE, "");
        if (c9044iE.c("do-not-store")) {
            e2 = dqN.e();
            return e2;
        }
        try {
            Set<String> e3 = e(c9053iN, e(c9044iE));
            AbstractC9055iP b = b();
            Set<String> e4 = b != null ? b.e(c9053iN, c9044iE) : null;
            if (e4 == null) {
                e4 = dqN.e();
            }
            c = dqM.c(e3, e4);
            return c;
        } catch (Exception e5) {
            C9137js.d().invoke(new Exception("Unable to merge a record from the database", e5));
            e = dqN.e();
            return e;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.Set] */
    private final Set<String> e(final Collection<C9053iN> collection, final Long l) {
        ?? e;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        e = dqN.e();
        objectRef.d = e;
        InterfaceC9126jh.b(this.a, false, new drO<dpR>() { // from class: com.apollographql.apollo3.cache.normalized.sql.SqlNormalizedCache$internalUpdateRecords$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                e();
                return dpR.c;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [T, java.util.Set] */
            public final void e() {
                int d;
                List e2;
                int d2;
                int e3;
                int b;
                ?? W;
                Set<String> c;
                InterfaceC9126jh interfaceC9126jh;
                InterfaceC9126jh interfaceC9126jh2;
                C9053iN d3;
                C9119ja c9119ja = C9119ja.this;
                Collection<C9053iN> collection2 = collection;
                d = C8572dqo.d(collection2, 10);
                ArrayList arrayList = new ArrayList(d);
                for (C9053iN c9053iN : collection2) {
                    arrayList.add(c9053iN.e());
                }
                e2 = c9119ja.e(arrayList);
                d2 = C8572dqo.d(e2, 10);
                e3 = dqD.e(d2);
                b = C8657dts.b(e3, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(b);
                for (Object obj : e2) {
                    linkedHashMap.put(((C9053iN) obj).e(), obj);
                }
                Ref.ObjectRef<Set<String>> objectRef2 = objectRef;
                C9119ja c9119ja2 = C9119ja.this;
                Long l2 = l;
                ArrayList arrayList2 = new ArrayList();
                for (C9053iN c9053iN2 : collection) {
                    C9053iN c9053iN3 = (C9053iN) linkedHashMap.get(c9053iN2.e());
                    if (c9053iN3 == null) {
                        interfaceC9126jh2 = c9119ja2.a;
                        d3 = c9119ja2.d(c9053iN2, l2);
                        interfaceC9126jh2.c(d3);
                        c = c9053iN2.a();
                    } else {
                        Pair<C9053iN, Set<String>> d4 = c9053iN3.d(c9053iN2, l2);
                        C9053iN b2 = d4.b();
                        c = d4.c();
                        if (!b2.isEmpty()) {
                            interfaceC9126jh = c9119ja2.a;
                            interfaceC9126jh.a(b2);
                        }
                    }
                    C8571dqn.b(arrayList2, c);
                }
                W = C8576dqs.W(arrayList2);
                objectRef2.d = W;
            }
        }, 1, null);
        return (Set) objectRef.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C9053iN d(C9053iN c9053iN, Long l) {
        int e;
        if (l == null) {
            return c9053iN;
        }
        String e2 = c9053iN.e();
        Map<String, Object> d = c9053iN.d();
        UUID j = c9053iN.j();
        Map<String, Object> d2 = c9053iN.d();
        e = dqD.e(d2.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator<T> it = d2.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((Map.Entry) it.next()).getKey(), Long.valueOf(l.longValue()));
        }
        return new C9053iN(e2, d, j, linkedHashMap);
    }

    private final Set<String> e(final C9053iN c9053iN, final Long l) {
        return (Set) InterfaceC9126jh.b(this.a, false, new drO<Set<? extends String>>() { // from class: com.apollographql.apollo3.cache.normalized.sql.SqlNormalizedCache$internalUpdateRecord$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final Set<String> invoke() {
                InterfaceC9126jh interfaceC9126jh;
                InterfaceC9126jh interfaceC9126jh2;
                InterfaceC9126jh interfaceC9126jh3;
                C9053iN d;
                interfaceC9126jh = C9119ja.this.a;
                C9053iN d2 = interfaceC9126jh.d(c9053iN.e());
                if (d2 == null) {
                    interfaceC9126jh3 = C9119ja.this.a;
                    d = C9119ja.this.d(c9053iN, l);
                    interfaceC9126jh3.c(d);
                    return c9053iN.a();
                }
                Pair<C9053iN, Set<String>> d3 = d2.d(c9053iN, l);
                C9053iN b = d3.b();
                Set<String> c = d3.c();
                if (!b.isEmpty()) {
                    interfaceC9126jh2 = C9119ja.this.a;
                    interfaceC9126jh2.a(b);
                    return c;
                }
                return c;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<C9053iN> e(Collection<String> collection) {
        List<List> f;
        f = C8576dqs.f(collection, 999);
        ArrayList arrayList = new ArrayList();
        for (List list : f) {
            C8571dqn.b(arrayList, this.a.a(list));
        }
        return arrayList;
    }
}
