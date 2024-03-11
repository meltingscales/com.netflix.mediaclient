package o;

import kotlin.Result;

/* loaded from: classes5.dex */
public final class dqW {
    public static final <R, T> InterfaceC8585dra<dpR> a(drX<? super R, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, R r, InterfaceC8585dra<? super T> interfaceC8585dra) {
        InterfaceC8585dra c;
        InterfaceC8585dra b;
        Object e;
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) interfaceC8585dra, "");
        c = C8590drf.c(drx, r, interfaceC8585dra);
        b = C8590drf.b(c);
        e = C8586drb.e();
        return new C8587drc(b, e);
    }

    public static final <R, T> void e(drX<? super R, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, R r, InterfaceC8585dra<? super T> interfaceC8585dra) {
        InterfaceC8585dra c;
        InterfaceC8585dra b;
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) interfaceC8585dra, "");
        c = C8590drf.c(drx, r, interfaceC8585dra);
        b = C8590drf.b(c);
        Result.c cVar = Result.e;
        b.resumeWith(Result.e(dpR.c));
    }
}
