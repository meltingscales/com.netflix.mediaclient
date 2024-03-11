package o;

import android.content.Context;

/* renamed from: o.fx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8930fx {
    private static C8900fT a;
    public static final C8930fx c = new C8930fx();
    private static InterfaceC8976gq b = new C8926ft();

    public final InterfaceC8976gq d() {
        return b;
    }

    private C8930fx() {
    }

    public final C8900fT c() {
        C8900fT c8900fT = a;
        if (c8900fT != null) {
            return c8900fT;
        }
        throw new IllegalStateException("You must initialize Mavericks. Add Mavericks.initialize(...) to your Application.onCreate().".toString());
    }

    public final void d(Context context, C8900fT c8900fT, InterfaceC8976gq interfaceC8976gq) {
        C8632dsu.c((Object) context, "");
        c(C8905fY.d(context), c8900fT, interfaceC8976gq);
    }

    public final void c(boolean z, C8900fT c8900fT, InterfaceC8976gq interfaceC8976gq) {
        if (c8900fT == null) {
            c8900fT = new C8900fT(z, null, null, null, 14, null);
        }
        a = c8900fT;
        if (interfaceC8976gq == null) {
            interfaceC8976gq = b;
            if (!(interfaceC8976gq instanceof C8926ft)) {
                interfaceC8976gq = new C8926ft();
            }
        }
        b = interfaceC8976gq;
    }
}
