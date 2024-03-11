package o;

/* renamed from: o.dCg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7704dCg {
    public static final InterfaceC8660dtv<?> e(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        if (interfaceC7707dCj instanceof C7705dCh) {
            return ((C7705dCh) interfaceC7707dCj).b;
        }
        if (interfaceC7707dCj instanceof C7756dEe) {
            return e(((C7756dEe) interfaceC7707dCj).f());
        }
        return null;
    }

    public static final InterfaceC7707dCj e(dFP dfp, InterfaceC7707dCj interfaceC7707dCj) {
        dBT a;
        C8632dsu.c((Object) dfp, "");
        C8632dsu.c((Object) interfaceC7707dCj, "");
        InterfaceC8660dtv<?> e = e(interfaceC7707dCj);
        if (e == null || (a = dFP.a(dfp, e, null, 2, null)) == null) {
            return null;
        }
        return a.e();
    }

    public static final InterfaceC7707dCj d(InterfaceC7707dCj interfaceC7707dCj, InterfaceC8660dtv<?> interfaceC8660dtv) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) interfaceC8660dtv, "");
        return new C7705dCh(interfaceC7707dCj, interfaceC8660dtv);
    }
}
