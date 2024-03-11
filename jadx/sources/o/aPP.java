package o;

import java.util.List;

/* loaded from: classes3.dex */
public final class aPP {
    public static final b b = new b(null);
    private static String c = "nf_ReEnableWidevineL1";
    private final aPY a;

    public aPP(aPY apy) {
        C8632dsu.c((Object) apy, "");
        this.a = apy;
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    public final boolean d() {
        if (C8157dfA.b(AbstractApplicationC1040Mh.d(), "pref_wl1_exception", false)) {
            C1044Mm.j(c, "Device was already moved back to L1 before, ignore");
            return false;
        }
        return a();
    }

    private final boolean a() {
        List<aPV> j;
        j = C8569dql.j(new aPW(), new aPO(this.a));
        for (aPV apv : j) {
            if (apv.c()) {
                apv.d();
                return true;
            }
        }
        return false;
    }
}
