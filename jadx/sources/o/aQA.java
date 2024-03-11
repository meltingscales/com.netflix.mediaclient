package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aQA extends aRM {
    public static final b c = new b(null);
    private final String b = "45026";
    private final String e = "Force device to WV L3";
    private final int d = 2;

    public static final boolean c() {
        return c.a();
    }

    @Override // o.aRM
    public String d() {
        return this.b;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.e;
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final boolean a() {
            return c() == ABTestConfig.Cell.CELL_2;
        }

        private final ABTestConfig.Cell c() {
            return C1818aPj.e(aQA.class);
        }
    }
}
