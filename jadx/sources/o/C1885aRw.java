package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* renamed from: o.aRw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1885aRw extends aRM {
    public static final e e = new e(null);
    private final String d = "57438";
    private final int a = 2;
    private final String b = "Seamless Next Episode Postplay in Pip";

    public static final boolean c() {
        return e.d();
    }

    @Override // o.aRM
    public String d() {
        return this.d;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.b;
    }

    /* renamed from: o.aRw$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final boolean d() {
            return c() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell c() {
            return C1818aPj.e(C1885aRw.class);
        }
    }
}
