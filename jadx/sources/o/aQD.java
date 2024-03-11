package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aQD extends aRM {
    public static final c e = new c(null);
    private final String b = "48258";
    private final int d = 2;
    private final String a = "Ambient Light Monitoring on Android";

    public static final boolean c() {
        return e.d();
    }

    @Override // o.aRM
    public String d() {
        return this.b;
    }

    @Override // o.aRM
    /* renamed from: i */
    public String a() {
        return this.a;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("Config_Ab48258_AmbientLightMonitor");
        }

        public final boolean d() {
            return a() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell a() {
            ABTestConfig.Cell e = C1818aPj.e(aQD.class);
            C8632dsu.a(e, "");
            return e;
        }
    }
}
