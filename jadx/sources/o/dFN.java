package o;

import kotlinx.serialization.json.internal.WriteMode;
import o.AbstractC7715dCr;
import o.AbstractC7716dCs;

/* loaded from: classes5.dex */
public final class dFN {
    public static final WriteMode c(AbstractC7773dEv abstractC7773dEv, InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) abstractC7773dEv, "");
        C8632dsu.c((Object) interfaceC7707dCj, "");
        AbstractC7715dCr b = interfaceC7707dCj.b();
        if (b instanceof AbstractC7710dCm) {
            return WriteMode.c;
        }
        if (C8632dsu.c(b, AbstractC7716dCs.c.d)) {
            return WriteMode.a;
        }
        if (!C8632dsu.c(b, AbstractC7716dCs.e.a)) {
            return WriteMode.b;
        }
        InterfaceC7707dCj c = c(interfaceC7707dCj.c(0), abstractC7773dEv.d());
        AbstractC7715dCr b2 = c.b();
        if ((b2 instanceof AbstractC7709dCl) || C8632dsu.c(b2, AbstractC7715dCr.b.a)) {
            return WriteMode.e;
        }
        if (abstractC7773dEv.a().a()) {
            return WriteMode.a;
        }
        throw C7797dFs.b(c);
    }

    public static final InterfaceC7707dCj c(InterfaceC7707dCj interfaceC7707dCj, dFP dfp) {
        InterfaceC7707dCj c;
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) dfp, "");
        if (!C8632dsu.c(interfaceC7707dCj.b(), AbstractC7715dCr.a.a)) {
            return interfaceC7707dCj.a() ? c(interfaceC7707dCj.c(0), dfp) : interfaceC7707dCj;
        }
        InterfaceC7707dCj e = C7704dCg.e(dfp, interfaceC7707dCj);
        return (e == null || (c = c(e, dfp)) == null) ? interfaceC7707dCj : c;
    }
}
