package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aQG extends aRM {
    public static final a b = new a(null);
    private final String c = "50262";
    private final int a = 2;
    private final String d = "Playback Thermal State";

    public static final boolean c() {
        return b.a();
    }

    @Override // o.aRM
    public String d() {
        return this.c;
    }

    @Override // o.aRM
    /* renamed from: i */
    public String a() {
        return this.d;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final boolean a() {
            return c() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell c() {
            ABTestConfig.Cell e = C1818aPj.e(aQG.class);
            C8632dsu.a(e, "");
            return e;
        }
    }
}
