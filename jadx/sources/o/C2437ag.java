package o;

import androidx.compose.runtime.Composer;
import java.util.Arrays;

/* renamed from: o.ag  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2437ag {
    public static final void b(InterfaceC2023aX interfaceC2023aX, String str, Object[] objArr, drX<? super Composer, ? super Integer, dpR> drx) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) objArr, "");
        C8632dsu.c((Object) drx, "");
        C2322ae c2322ae = new C2322ae(Arrays.copyOf(objArr, objArr.length), drx);
        c2322ae.a((CharSequence) str);
        interfaceC2023aX.add(c2322ae);
    }

    public static final C2322ae c(String str, Object[] objArr, drX<? super Composer, ? super Integer, dpR> drx) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) objArr, "");
        C8632dsu.c((Object) drx, "");
        C2322ae c2322ae = new C2322ae(Arrays.copyOf(objArr, objArr.length), drx);
        c2322ae.a((CharSequence) str);
        return c2322ae;
    }
}
