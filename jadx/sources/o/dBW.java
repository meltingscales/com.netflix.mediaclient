package o;

import kotlin.KotlinNothingValueException;

/* loaded from: classes5.dex */
public final class dBW {
    public static final <T> dBP<T> a(dCC<T> dcc, InterfaceC7717dCt interfaceC7717dCt, String str) {
        C8632dsu.c((Object) dcc, "");
        C8632dsu.c((Object) interfaceC7717dCt, "");
        dBP<T> d = dcc.d(interfaceC7717dCt, str);
        if (d != null) {
            return d;
        }
        dCB.c(str, dcc.d());
        throw new KotlinNothingValueException();
    }

    public static final <T> dBZ<T> c(dCC<T> dcc, InterfaceC7721dCx interfaceC7721dCx, T t) {
        C8632dsu.c((Object) dcc, "");
        C8632dsu.c((Object) interfaceC7721dCx, "");
        C8632dsu.c((Object) t, "");
        dBZ<T> d = dcc.d(interfaceC7721dCx, (InterfaceC7721dCx) t);
        if (d != null) {
            return d;
        }
        dCB.b(dsA.a(t.getClass()), dcc.d());
        throw new KotlinNothingValueException();
    }
}
