package o;

import java.util.Set;

/* loaded from: classes5.dex */
public final class dFL {
    private static final Set<InterfaceC7707dCj> e;

    static {
        Set<InterfaceC7707dCj> d;
        d = dqN.d(C7706dCi.c(dpJ.b).e(), C7706dCi.a(dpL.c).e(), C7706dCi.d(dpF.c).e(), C7706dCi.d(dpO.d).e());
        e = d;
    }

    public static final boolean a(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return interfaceC7707dCj.a() && e.contains(interfaceC7707dCj);
    }

    public static final boolean c(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return interfaceC7707dCj.a() && C8632dsu.c(interfaceC7707dCj, dEG.a());
    }
}
