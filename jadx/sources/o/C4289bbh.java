package o;

/* renamed from: o.bbh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4289bbh {
    private static boolean c;
    public static final C4289bbh d = new C4289bbh();

    public final void e(boolean z) {
        c = z;
    }

    private C4289bbh() {
    }

    public final boolean a() {
        return e() && !c;
    }

    public final boolean e() {
        InterfaceC4208baF l = AbstractApplicationC1040Mh.getInstance().i().l();
        if (l != null && l.s() && l.l() != null) {
            InterfaceC5204buO l2 = l.l();
            C8632dsu.a(l2, "");
            InterfaceC5203buN c2 = l2.c(l2.b());
            if ((c2 != null ? c2.j() : 0L) >= 5000000000L) {
                return true;
            }
        }
        return false;
    }
}
