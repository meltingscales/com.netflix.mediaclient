package o;

import java.util.List;

/* loaded from: classes5.dex */
public final class dCM {
    private static final boolean c;

    static {
        boolean z;
        try {
            Class.forName("java.lang.ClassValue");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        c = z;
    }

    public static final <T> InterfaceC7753dEb<T> b(drM<? super InterfaceC8660dtv<?>, ? extends dBT<T>> drm) {
        C8632dsu.c((Object) drm, "");
        return c ? new dCP(drm) : new dCW(drm);
    }

    public static final <T> dDN<T> e(drX<? super InterfaceC8660dtv<Object>, ? super List<? extends dtH>, ? extends dBT<T>> drx) {
        C8632dsu.c((Object) drx, "");
        return c ? new dCO(drx) : new dCT(drx);
    }
}
