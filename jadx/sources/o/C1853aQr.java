package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* renamed from: o.aQr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1853aQr extends aRM {
    public static final e a = new e(null);
    private final String b = "35025";
    private final int e = 2;
    private final String c = "HomeActivity simplification";

    @Override // o.aRM
    public String d() {
        return this.b;
    }

    @Override // o.aRM
    /* renamed from: e */
    public String a() {
        return this.c;
    }

    /* renamed from: o.aQr$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final boolean e() {
            return c() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell c() {
            ABTestConfig.Cell e = C1818aPj.e(C1853aQr.class);
            C8632dsu.a(e, "");
            return e;
        }
    }
}
