package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aQF extends aRM {
    public static final d d = new d(null);
    private final String e = "46427";
    private final String a = "Multichannel_Spatial";
    private final int c = 4;

    public static final boolean c() {
        return d.d();
    }

    public static final boolean i() {
        return d.a();
    }

    public static final boolean j() {
        return d.e();
    }

    @Override // o.aRM
    public String d() {
        return this.e;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.a;
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        private final ABTestConfig.Cell b() {
            return C1818aPj.e(aQF.class);
        }

        public final boolean d() {
            return b() != ABTestConfig.Cell.CELL_1;
        }

        public final boolean a() {
            return b() == ABTestConfig.Cell.CELL_2;
        }

        public final boolean e() {
            return b() == ABTestConfig.Cell.CELL_4;
        }
    }
}
