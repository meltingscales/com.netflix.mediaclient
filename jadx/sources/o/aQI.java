package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aQI extends aRM {
    public static final e c = new e(null);
    private final String b = "49837";
    private final int a = 4;
    private final String d = "android avif image format";

    public static final boolean c() {
        return c.a();
    }

    @Override // o.aRM
    public boolean L_() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.b;
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

        public final boolean a() {
            return e() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell e() {
            return C1818aPj.e(aQI.class);
        }
    }
}
