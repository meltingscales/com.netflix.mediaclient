package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* renamed from: o.aQq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1852aQq extends aRM {
    public static final e e = new e(null);
    private final String d = "22595";
    private final int c = 2;
    private final String b = "Release DRM resources in suspend mode";

    public static final boolean c() {
        return e.e();
    }

    @Override // o.aRM
    public String d() {
        return this.d;
    }

    @Override // o.aRM
    /* renamed from: e */
    public String a() {
        return this.b;
    }

    /* renamed from: o.aQq$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final boolean e() {
            return C1818aPj.e(C1852aQq.class) != ABTestConfig.Cell.CELL_1;
        }
    }
}
