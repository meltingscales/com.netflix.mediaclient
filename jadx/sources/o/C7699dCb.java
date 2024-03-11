package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import o.InterfaceC8662dtx;

/* renamed from: o.dCb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C7699dCb {
    public static final dBT<Object> b(dFP dfp, dtH dth) {
        C8632dsu.c((Object) dfp, "");
        C8632dsu.c((Object) dth, "");
        dBT<Object> e = e(dfp, dth, true);
        if (e != null) {
            return e;
        }
        dDT.e(dDR.a(dth));
        throw new KotlinNothingValueException();
    }

    public static final dBT<Object> e(dFP dfp, dtH dth) {
        C8632dsu.c((Object) dfp, "");
        C8632dsu.c((Object) dth, "");
        return e(dfp, dth, false);
    }

    private static final dBT<Object> e(dFP dfp, dtH dth, boolean z) {
        int d;
        dBT<Object> dbt;
        dBT<? extends Object> b;
        InterfaceC8660dtv<Object> a = dDR.a(dth);
        boolean e = dth.e();
        List<dtJ> b2 = dth.b();
        d = C8572dqo.d(b2, 10);
        final ArrayList arrayList = new ArrayList(d);
        for (dtJ dtj : b2) {
            dtH c = dtj.c();
            if (c == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + dth).toString());
            }
            arrayList.add(c);
        }
        if (arrayList.isEmpty()) {
            dbt = C7698dCa.d(a, e);
        } else {
            Object e2 = C7698dCa.e(a, arrayList, e);
            if (Result.a(e2)) {
                e2 = null;
            }
            dbt = (dBT) e2;
        }
        if (dbt != null) {
            return dbt;
        }
        if (arrayList.isEmpty()) {
            b = dFP.a(dfp, a, null, 2, null);
        } else {
            List<dBT<Object>> b3 = C7701dCd.b(dfp, arrayList, z);
            if (b3 == null) {
                return null;
            }
            dBT<? extends Object> d2 = C7701dCd.d(a, b3, new drO<InterfaceC8662dtx>() { // from class: kotlinx.serialization.SerializersKt__SerializersKt$serializerByKTypeImpl$contextualSerializer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: d */
                public final InterfaceC8662dtx invoke() {
                    return arrayList.get(0).a();
                }
            });
            b = d2 == null ? dfp.b(a, b3) : d2;
        }
        if (b != null) {
            return c(b, e);
        }
        return null;
    }

    public static final <T> dBT<T> b(InterfaceC8660dtv<T> interfaceC8660dtv) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        dBT<T> a = dDT.a(interfaceC8660dtv);
        return a == null ? dDZ.b(interfaceC8660dtv) : a;
    }

    public static final dBT<? extends Object> d(InterfaceC8660dtv<Object> interfaceC8660dtv, List<? extends dBT<Object>> list, drO<? extends InterfaceC8662dtx> dro) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) dro, "");
        dBT<? extends Object> e = e(interfaceC8660dtv, list, dro);
        return e == null ? c(interfaceC8660dtv, list) : e;
    }

    private static final dBT<? extends Object> e(InterfaceC8660dtv<Object> interfaceC8660dtv, List<? extends dBT<Object>> list, drO<? extends InterfaceC8662dtx> dro) {
        if (C8632dsu.c(interfaceC8660dtv, dsA.a(Collection.class)) || C8632dsu.c(interfaceC8660dtv, dsA.a(List.class)) || C8632dsu.c(interfaceC8660dtv, dsA.a(List.class)) || C8632dsu.c(interfaceC8660dtv, dsA.a(ArrayList.class))) {
            return new C7722dCy(list.get(0));
        }
        if (C8632dsu.c(interfaceC8660dtv, dsA.a(HashSet.class))) {
            return new C7734dDj(list.get(0));
        }
        if (C8632dsu.c(interfaceC8660dtv, dsA.a(Set.class)) || C8632dsu.c(interfaceC8660dtv, dsA.a(Set.class)) || C8632dsu.c(interfaceC8660dtv, dsA.a(LinkedHashSet.class))) {
            return new dDA(list.get(0));
        }
        if (C8632dsu.c(interfaceC8660dtv, dsA.a(HashMap.class))) {
            return new C7733dDi(list.get(0), list.get(1));
        }
        if (C8632dsu.c(interfaceC8660dtv, dsA.a(Map.class)) || C8632dsu.c(interfaceC8660dtv, dsA.a(Map.class)) || C8632dsu.c(interfaceC8660dtv, dsA.a(LinkedHashMap.class))) {
            return new C7745dDu(list.get(0), list.get(1));
        }
        if (C8632dsu.c(interfaceC8660dtv, dsA.a(Map.Entry.class))) {
            return C7706dCi.b(list.get(0), list.get(1));
        }
        if (C8632dsu.c(interfaceC8660dtv, dsA.a(Pair.class))) {
            return C7706dCi.e(list.get(0), list.get(1));
        }
        if (C8632dsu.c(interfaceC8660dtv, dsA.a(Triple.class))) {
            return C7706dCi.e(list.get(0), list.get(1), list.get(2));
        }
        if (dDT.d(interfaceC8660dtv)) {
            InterfaceC8662dtx invoke = dro.invoke();
            C8632dsu.d(invoke);
            return C7706dCi.b((InterfaceC8660dtv) invoke, list.get(0));
        }
        return null;
    }

    private static final <T> dBT<T> c(dBT<T> dbt, boolean z) {
        if (z) {
            return C7706dCi.a(dbt);
        }
        C8632dsu.d(dbt);
        return dbt;
    }

    public static final List<dBT<Object>> b(dFP dfp, List<? extends dtH> list, boolean z) {
        ArrayList arrayList;
        int d;
        int d2;
        C8632dsu.c((Object) dfp, "");
        C8632dsu.c((Object) list, "");
        if (z) {
            d2 = C8572dqo.d(list, 10);
            arrayList = new ArrayList(d2);
            for (dtH dth : list) {
                arrayList.add(C7701dCd.e(dfp, dth));
            }
        } else {
            d = C8572dqo.d(list, 10);
            arrayList = new ArrayList(d);
            for (dtH dth2 : list) {
                dBT<Object> a = C7701dCd.a(dfp, dth2);
                if (a == null) {
                    return null;
                }
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    private static final dBT<? extends Object> c(InterfaceC8660dtv<Object> interfaceC8660dtv, List<? extends dBT<Object>> list) {
        dBT[] dbtArr = (dBT[]) list.toArray(new dBT[0]);
        return dDT.d((InterfaceC8660dtv) interfaceC8660dtv, (dBT<Object>[]) Arrays.copyOf(dbtArr, dbtArr.length));
    }
}
