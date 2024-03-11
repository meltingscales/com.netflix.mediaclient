package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aQV extends aRM {
    public static final b b = new b(null);
    private final String c = "53159";
    private final int d = 2;
    private final String a = "avoid extra seek for playback";

    public static final boolean c() {
        return b.b();
    }

    @Override // o.aRM
    public String d() {
        return this.c;
    }

    @Override // o.aRM
    /* renamed from: j */
    public String a() {
        return this.a;
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final boolean b() {
            return d() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell d() {
            return C1818aPj.e(aQV.class);
        }
    }
}
