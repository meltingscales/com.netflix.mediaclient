package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.C9028hp;
import o.InterfaceC8991hE;
import o.InterfaceC9034hv;

/* renamed from: o.iL  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9051iL {
    public static final <D extends InterfaceC8991hE.b> Map<String, C9053iN> c(InterfaceC8991hE<D> interfaceC8991hE, D d, C9028hp c9028hp, InterfaceC9042iC interfaceC9042iC) {
        C8632dsu.c((Object) interfaceC8991hE, "");
        C8632dsu.c((Object) d, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) interfaceC9042iC, "");
        return a(interfaceC8991hE, d, c9028hp, interfaceC9042iC, C9043iD.a.b().c());
    }

    public static final <D extends InterfaceC9034hv.d> Map<String, C9053iN> a(InterfaceC9034hv<D> interfaceC9034hv, D d, C9028hp c9028hp, InterfaceC9042iC interfaceC9042iC, String str) {
        C8632dsu.c((Object) interfaceC9034hv, "");
        C8632dsu.c((Object) d, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) interfaceC9042iC, "");
        C8632dsu.c((Object) str, "");
        C9073ih c9073ih = new C9073ih();
        interfaceC9034hv.e().e(c9073ih, c9028hp, d);
        C9060iU c9060iU = new C9060iU(C9036hx.c(interfaceC9034hv, c9028hp, true), str, interfaceC9042iC);
        Object f = c9073ih.f();
        C8632dsu.d(f);
        return c9060iU.a((Map) f, interfaceC9034hv.b().j(), interfaceC9034hv.b().g().a().b());
    }

    public static final <D extends InterfaceC9034hv.d> InterfaceC9041iB a(InterfaceC9034hv<D> interfaceC9034hv, InterfaceC9052iM interfaceC9052iM, InterfaceC9046iG interfaceC9046iG, C9044iE c9044iE, InterfaceC9034hv.c cVar) {
        C8632dsu.c((Object) interfaceC9034hv, "");
        C8632dsu.c((Object) interfaceC9052iM, "");
        C8632dsu.c((Object) interfaceC9046iG, "");
        C8632dsu.c((Object) c9044iE, "");
        C8632dsu.c((Object) cVar, "");
        return b(interfaceC9034hv, C9043iD.a.b(), interfaceC9052iM, interfaceC9046iG, c9044iE, cVar);
    }

    private static final <D extends InterfaceC9034hv.d> InterfaceC9041iB b(InterfaceC9034hv<D> interfaceC9034hv, C9043iD c9043iD, InterfaceC9052iM interfaceC9052iM, InterfaceC9046iG interfaceC9046iG, C9044iE c9044iE, InterfaceC9034hv.c cVar) {
        return new C9059iT(interfaceC9052iM, c9043iD.c(), cVar, interfaceC9046iG, c9044iE, interfaceC9034hv.b().j(), interfaceC9034hv.b().g().a().b()).b();
    }

    public static final Set<String> c(Collection<C9053iN> collection) {
        Set<String> e;
        Set<String> W;
        if (collection != null) {
            ArrayList arrayList = new ArrayList();
            for (C9053iN c9053iN : collection) {
                C8571dqn.b(arrayList, c9053iN.a());
            }
            W = C8576dqs.W(arrayList);
            if (W != null) {
                return W;
            }
        }
        e = dqN.e();
        return e;
    }

    public static final <D extends InterfaceC9034hv.d> D e(InterfaceC9041iB interfaceC9041iB, InterfaceC8949gP<D> interfaceC8949gP, C9028hp c9028hp, InterfaceC9034hv.c cVar) {
        C8632dsu.c((Object) interfaceC9041iB, "");
        C8632dsu.c((Object) interfaceC8949gP, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cVar, "");
        C9076ik c9076ik = new C9076ik(interfaceC9041iB.e(), null, 2, null);
        C9028hp.d d = c9028hp.d();
        Map<String, Object> b = cVar.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : b.entrySet()) {
            if (C8632dsu.c(entry.getValue(), Boolean.FALSE)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return interfaceC8949gP.b(c9076ik, d.a(linkedHashMap.keySet()).e());
    }
}
