package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* renamed from: o.aRq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1879aRq extends aRM {
    public static final b b = new b(null);
    private final String e = "57011";
    private final int c = 2;
    private final String a = "Android Work Manager";

    public static final boolean c() {
        return b.a();
    }

    @Override // o.aRM
    public String d() {
        return this.e;
    }

    @Override // o.aRM
    /* renamed from: j */
    public String a() {
        return this.a;
    }

    /* renamed from: o.aRq$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final boolean a() {
            return c() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell c() {
            return C1818aPj.e(C1879aRq.class);
        }
    }
}
