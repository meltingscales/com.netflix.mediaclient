package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.Xh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1324Xh {
    public static final C1324Xh a = new C1324Xh();
    private static final InterfaceC8812dzl<List<VZ>> b;
    private static final List<VQ> d;
    private static boolean e;

    public final List<VQ> a() {
        return d;
    }

    public final boolean b() {
        return e;
    }

    public final InterfaceC8812dzl<List<VZ>> c() {
        return b;
    }

    public final void e(boolean z) {
        e = z;
    }

    private C1324Xh() {
    }

    static {
        List i;
        i = C8569dql.i();
        b = dzB.d(i);
        d = new ArrayList();
    }
}
