package o;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.AbstractC8997hK;
import o.C8992hF;
import o.InterfaceC9034hv;

/* renamed from: o.hg */
/* loaded from: classes2.dex */
public final class C9019hg {
    public static final C8992hF c = new C8992hF.a("__Schema").d();
    public static final C8992hF i = new C8992hF.a("__Type").d();
    public static final C8992hF a = new C8992hF.a("__Field").d();
    public static final C8992hF b = new C8992hF.a("__InputValue").d();
    public static final C8992hF d = new C8992hF.a("__EnumValue").d();
    public static final C8992hF e = new C8992hF.a("__Directive").d();

    /* renamed from: o.hg$d */
    /* loaded from: classes2.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues((String) ((Pair) t).d(), (String) ((Pair) t2).d());
            return compareValues;
        }
    }

    public static final C9024hl d(AbstractC9026hn abstractC9026hn) {
        C8632dsu.c((Object) abstractC9026hn, "");
        return new C9024hl(abstractC9026hn);
    }

    public static final C9022hj a(AbstractC9026hn abstractC9026hn) {
        C8632dsu.c((Object) abstractC9026hn, "");
        return new C9022hj(abstractC9026hn);
    }

    public static final Object c(Object obj, InterfaceC9034hv.c cVar) {
        int d2;
        int e2;
        List n;
        List c2;
        Map d3;
        if (obj == null) {
            return null;
        }
        if (obj instanceof C9027ho) {
            C9027ho c9027ho = (C9027ho) obj;
            if (cVar.b().containsKey(c9027ho.c())) {
                return cVar.b().get(c9027ho.c());
            }
            return AbstractC8997hK.e.c;
        } else if (obj instanceof Map) {
            C8632dsu.d(obj);
            Map map = (Map) obj;
            e2 = dqD.e(map.size());
            LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), c(entry.getValue(), cVar));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (!(entry2.getValue() instanceof AbstractC8997hK.e)) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            n = dqK.n(linkedHashMap2);
            c2 = C8576dqs.c((Iterable) n, (Comparator) new d());
            d3 = dqE.d(c2);
            return d3;
        } else if (obj instanceof List) {
            Iterable<Object> iterable = (Iterable) obj;
            d2 = C8572dqo.d(iterable, 10);
            ArrayList arrayList = new ArrayList(d2);
            for (Object obj2 : iterable) {
                arrayList.add(c(obj2, cVar));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (!(obj3 instanceof AbstractC8997hK.e)) {
                    arrayList2.add(obj3);
                }
            }
            return arrayList2;
        } else {
            return obj;
        }
    }

    public static final boolean a(AbstractC9023hk abstractC9023hk) {
        C8632dsu.c((Object) abstractC9023hk, "");
        if ((abstractC9023hk instanceof C9004hR) || (abstractC9023hk instanceof C8987hA)) {
            return true;
        }
        return abstractC9023hk instanceof C8992hF;
    }
}
