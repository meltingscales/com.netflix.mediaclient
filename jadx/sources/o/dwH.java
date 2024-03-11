package o;

import kotlin.Result;

/* loaded from: classes5.dex */
public final class dwH {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean a(dwF<T> dwf, Object obj) {
        Throwable d = Result.d(obj);
        return d == null ? dwf.a((dwF<T>) obj) : dwf.a(d);
    }

    public static final <T> dwF<T> b(dxD dxd) {
        return new dwJ(dxd);
    }

    public static /* synthetic */ dwF d(dxD dxd, int i, Object obj) {
        if ((i & 1) != 0) {
            dxd = null;
        }
        return b(dxd);
    }

    public static final <T> dwF<T> a(T t) {
        dwJ dwj = new dwJ(null);
        dwj.a((dwJ) t);
        return dwj;
    }
}
