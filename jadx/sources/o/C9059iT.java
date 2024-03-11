package o;

import com.apollographql.apollo3.exception.CacheMissException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C9018hf;
import o.InterfaceC9034hv;

/* renamed from: o.iT  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9059iT {
    private final InterfaceC9046iG a;
    private final Map<List<Object>, Map<String, Object>> b;
    private final List<e> c;
    private final InterfaceC9052iM d;
    private final C9044iE e;
    private final String f;
    private final InterfaceC9034hv.c g;
    private final String h;
    private final List<AbstractC9025hm> i;

    /* JADX WARN: Multi-variable type inference failed */
    public C9059iT(InterfaceC9052iM interfaceC9052iM, String str, InterfaceC9034hv.c cVar, InterfaceC9046iG interfaceC9046iG, C9044iE c9044iE, List<? extends AbstractC9025hm> list, String str2) {
        C8632dsu.c((Object) interfaceC9052iM, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) interfaceC9046iG, "");
        C8632dsu.c((Object) c9044iE, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str2, "");
        this.d = interfaceC9052iM;
        this.f = str;
        this.g = cVar;
        this.a = interfaceC9046iG;
        this.e = c9044iE;
        this.i = list;
        this.h = str2;
        this.b = new LinkedHashMap();
        this.c = new ArrayList();
    }

    /* renamed from: o.iT$e */
    /* loaded from: classes2.dex */
    public static final class e {
        private final List<AbstractC9025hm> a;
        private final List<Object> b;
        private final String d;
        private final String e;

        public final List<Object> a() {
            return this.b;
        }

        public final String c() {
            return this.e;
        }

        public final List<AbstractC9025hm> d() {
            return this.a;
        }

        public final String e() {
            return this.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, List<? extends Object> list, List<? extends AbstractC9025hm> list2, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) list2, "");
            C8632dsu.c((Object) str2, "");
            this.d = str;
            this.b = list;
            this.a = list2;
            this.e = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.iT$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private final InterfaceC9034hv.c a;
        private final List<C9018hf> e;

        public final List<C9018hf> a() {
            return this.e;
        }

        public final InterfaceC9034hv.c b() {
            return this.a;
        }

        public d(InterfaceC9034hv.c cVar) {
            C8632dsu.c((Object) cVar, "");
            this.a = cVar;
            this.e = new ArrayList();
        }
    }

    private final List<C9018hf> d(List<? extends AbstractC9025hm> list, String str, InterfaceC9034hv.c cVar, String str2) {
        int d2;
        Object y;
        d dVar = new d(cVar);
        c(list, str, str2, dVar);
        List<C9018hf> a = dVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : a) {
            C9018hf c9018hf = (C9018hf) obj;
            Pair a2 = dpD.a(c9018hf.a(), c9018hf.c());
            Object obj2 = linkedHashMap.get(a2);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(a2, obj2);
            }
            ((List) obj2).add(obj);
        }
        Collection<List> values = linkedHashMap.values();
        d2 = C8572dqo.d(values, 10);
        ArrayList arrayList = new ArrayList(d2);
        for (List<C9018hf> list2 : values) {
            y = C8576dqs.y(list2);
            C9018hf.a i = ((C9018hf) y).i();
            ArrayList arrayList2 = new ArrayList();
            for (C9018hf c9018hf2 : list2) {
                C8571dqn.b(arrayList2, c9018hf2.j());
            }
            arrayList.add(i.e(arrayList2).d());
        }
        return arrayList;
    }

    public final InterfaceC9041iB b() {
        List i;
        int d2;
        int d3;
        int e2;
        int b2;
        List<e> U;
        Map<String, Object> d4;
        List<? extends Object> b3;
        Pair a;
        Map d5;
        List<e> list = this.c;
        String str = this.f;
        List<AbstractC9025hm> list2 = this.i;
        String str2 = this.h;
        i = C8569dql.i();
        list.add(new e(str, i, list2, str2));
        while (!this.c.isEmpty()) {
            InterfaceC9052iM interfaceC9052iM = this.d;
            List<e> list3 = this.c;
            d2 = C8572dqo.d(list3, 10);
            ArrayList arrayList = new ArrayList(d2);
            for (e eVar : list3) {
                arrayList.add(eVar.e());
            }
            Collection<C9053iN> e3 = interfaceC9052iM.e(arrayList, this.e);
            d3 = C8572dqo.d(e3, 10);
            e2 = dqD.e(d3);
            b2 = C8657dts.b(e2, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(b2);
            for (Object obj : e3) {
                linkedHashMap.put(((C9053iN) obj).e(), obj);
            }
            U = C8576dqs.U(this.c);
            this.c.clear();
            for (e eVar2 : U) {
                Object obj2 = linkedHashMap.get(eVar2.e());
                if (obj2 == null) {
                    if (C8632dsu.c((Object) eVar2.e(), (Object) C9043iD.a.b().c())) {
                        String e4 = eVar2.e();
                        d5 = dqE.d();
                        obj2 = new C9053iN(e4, d5, null, 4, null);
                    } else {
                        throw new CacheMissException(eVar2.e(), null, false, 6, null);
                    }
                }
                List<AbstractC9025hm> d6 = eVar2.d();
                String c = eVar2.c();
                InterfaceC9034hv.c cVar = this.g;
                C9053iN c9053iN = (C9053iN) obj2;
                Object obj3 = c9053iN.get("__typename");
                List<C9018hf> d7 = d(d6, c, cVar, obj3 instanceof String ? (String) obj3 : null);
                ArrayList arrayList2 = new ArrayList();
                for (C9018hf c9018hf : d7) {
                    if (C9062iW.c(c9018hf, this.g.b())) {
                        a = null;
                    } else {
                        Object d8 = this.a.d(c9018hf, this.g, (Map) obj2, c9053iN.e());
                        b3 = C8576dqs.b((Collection<? extends String>) ((Collection<? extends Object>) eVar2.a()), c9018hf.a());
                        d(d8, b3, c9018hf.j(), c9018hf.g().a().b());
                        a = dpD.a(c9018hf.a(), d8);
                    }
                    if (a != null) {
                        arrayList2.add(a);
                    }
                }
                d4 = dqE.d(arrayList2);
                this.b.put(eVar2.a(), d4);
            }
        }
        return new b(this.b);
    }

    private final void d(Object obj, List<? extends Object> list, List<? extends AbstractC9025hm> list2, String str) {
        List<? extends Object> b2;
        if (obj instanceof C9043iD) {
            this.c.add(new e(((C9043iD) obj).c(), list, list2, str));
        } else if (obj instanceof List) {
            int i = 0;
            for (Object obj2 : (Iterable) obj) {
                if (i < 0) {
                    C8569dql.h();
                }
                b2 = C8576dqs.b((Collection<? extends Integer>) ((Collection<? extends Object>) list), Integer.valueOf(i));
                d(obj2, b2, list2, str);
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.iT$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC9041iB {
        private final Map<List<Object>, Map<String, Object>> c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.c, ((b) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            return "CacheBatchReaderData(data=" + this.c + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Map<List<Object>, ? extends Map<String, ? extends Object>> map) {
            C8632dsu.c((Object) map, "");
            this.c = map;
        }

        @Override // o.InterfaceC9041iB
        public Map<String, Object> e() {
            List i;
            List<? extends Object> i2;
            Map<List<Object>, Map<String, Object>> map = this.c;
            i = C8569dql.i();
            Map<String, Object> map2 = map.get(i);
            i2 = C8569dql.i();
            Object c = c(map2, i2);
            C8632dsu.d(c);
            return (Map) c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.LinkedHashMap, java.util.Map] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Collection, java.util.ArrayList] */
        private final Object c(Object obj, List<? extends Object> list) {
            ?? linkedHashMap;
            int e;
            List<? extends Object> b;
            int d;
            List<? extends Object> b2;
            if (obj instanceof C9043iD) {
                return c(this.c.get(list), list);
            }
            if (obj instanceof List) {
                Iterable iterable = (Iterable) obj;
                d = C8572dqo.d(iterable, 10);
                linkedHashMap = new ArrayList(d);
                int i = 0;
                for (Object obj2 : iterable) {
                    if (i < 0) {
                        C8569dql.h();
                    }
                    b2 = C8576dqs.b((Collection<? extends Integer>) ((Collection<? extends Object>) list), Integer.valueOf(i));
                    linkedHashMap.add(c(obj2, b2));
                    i++;
                }
            } else if (!(obj instanceof Map)) {
                return obj;
            } else {
                Map map = (Map) obj;
                e = dqD.e(map.size());
                linkedHashMap = new LinkedHashMap(e);
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Object key2 = entry.getKey();
                    C8632dsu.d(key2);
                    b = C8576dqs.b((Collection<? extends String>) ((Collection<? extends Object>) list), (String) key2);
                    linkedHashMap.put(key, c(value, b));
                }
            }
            return linkedHashMap;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o.hm, java.lang.Object] */
    private final void c(List<? extends AbstractC9025hm> list, String str, String str2, d dVar) {
        boolean b2;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ?? r0 = (AbstractC9025hm) it.next();
            if (r0 instanceof C9018hf) {
                dVar.a().add(r0);
            } else if (r0 instanceof C9017he) {
                C9017he c9017he = (C9017he) r0;
                b2 = C8576dqs.b((Iterable<? extends String>) c9017he.a(), str2);
                if (b2 || C8632dsu.c((Object) c9017he.b(), (Object) str)) {
                    if (!C9062iW.d(c9017he, dVar.b().b())) {
                        c(c9017he.e(), str, str2, dVar);
                    }
                }
            }
        }
    }
}
