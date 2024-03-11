package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aQB extends aRM {
    public static final c d = new c(null);
    private final String a = "48469";
    private final int b = 4;
    private final String e = "Android HDR Streaming Upsell Test";

    public static final boolean c() {
        return d.b();
    }

    @Override // o.aRM
    public String d() {
        return this.a;
    }

    @Override // o.aRM
    /* renamed from: i */
    public String a() {
        return this.e;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("Config_Ab48469_HDRUpsell");
        }

        public final boolean b() {
            return d() != ABTestConfig.Cell.CELL_1;
        }

        public final boolean a() {
            return d() == ABTestConfig.Cell.CELL_4;
        }

        private final ABTestConfig.Cell d() {
            ABTestConfig.Cell e = C1818aPj.e(aQB.class);
            C8632dsu.a(e, "");
            return e;
        }
    }
}
