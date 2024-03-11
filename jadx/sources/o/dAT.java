package o;

import kotlin.Result;

/* loaded from: classes5.dex */
public final class dAT {
    public static /* synthetic */ void c(drX drx, Object obj, InterfaceC8585dra interfaceC8585dra, drM drm, int i, Object obj2) {
        if ((i & 4) != 0) {
            drm = null;
        }
        b(drx, obj, interfaceC8585dra, drm);
    }

    public static final <R, T> void b(drX<? super R, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, R r, InterfaceC8585dra<? super T> interfaceC8585dra, drM<? super Throwable, dpR> drm) {
        InterfaceC8585dra c;
        InterfaceC8585dra b;
        try {
            c = C8590drf.c(drx, r, interfaceC8585dra);
            b = C8590drf.b(c);
            Result.c cVar = Result.e;
            C7653dAj.c(b, Result.e(dpR.c), drm);
        } catch (Throwable th) {
            a(interfaceC8585dra, th);
        }
    }

    public static final void e(InterfaceC8585dra<? super dpR> interfaceC8585dra, InterfaceC8585dra<?> interfaceC8585dra2) {
        InterfaceC8585dra b;
        try {
            b = C8590drf.b(interfaceC8585dra);
            Result.c cVar = Result.e;
            C7653dAj.c(b, Result.e(dpR.c), null, 2, null);
        } catch (Throwable th) {
            a(interfaceC8585dra2, th);
        }
    }

    private static final void a(InterfaceC8585dra<?> interfaceC8585dra, Throwable th) {
        Result.c cVar = Result.e;
        interfaceC8585dra.resumeWith(Result.e(C8556dpz.a(th)));
        throw th;
    }
}
