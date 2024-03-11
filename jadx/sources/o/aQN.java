package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aQN extends aRM {
    public static final e c = new e(null);
    private final String a = "51411";
    private final int e = 2;
    private final String d = "android prepare in time test";

    public static final boolean c() {
        return c.d();
    }

    @Override // o.aRM
    public boolean O_() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.a;
    }

    @Override // o.aRM
    /* renamed from: j */
    public String a() {
        return this.d;
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final boolean d() {
            return b() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell b() {
            return C1818aPj.e(aQN.class);
        }
    }
}
