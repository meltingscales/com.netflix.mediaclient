package o;

import kotlin.Result;

/* loaded from: classes5.dex */
public final class dwN {
    public static /* synthetic */ Object d(Object obj, drM drm, int i, Object obj2) {
        if ((i & 1) != 0) {
            drm = null;
        }
        return e(obj, drm);
    }

    public static final <T> Object e(Object obj, drM<? super Throwable, dpR> drm) {
        Throwable d = Result.d(obj);
        if (d == null) {
            return drm != null ? new dwK(obj, drm) : obj;
        }
        return new dwO(d, false, 2, null);
    }

    public static final <T> Object b(Object obj, InterfaceC8743dwx<?> interfaceC8743dwx) {
        Throwable d = Result.d(obj);
        return d == null ? obj : new dwO(d, false, 2, null);
    }

    public static final <T> Object e(Object obj, InterfaceC8585dra<? super T> interfaceC8585dra) {
        if (obj instanceof dwO) {
            Result.c cVar = Result.e;
            return Result.e(C8556dpz.a(((dwO) obj).a));
        }
        Result.c cVar2 = Result.e;
        return Result.e(obj);
    }
}
