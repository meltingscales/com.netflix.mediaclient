package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* renamed from: o.aQn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1849aQn extends aRM {
    public static final a e = new a(null);
    private final String b = "16534";
    private final String d = "Force enable partner features";
    private final int a = 2;

    public static final boolean e() {
        return e.d();
    }

    @Override // o.aRM
    /* renamed from: c */
    public String a() {
        return this.d;
    }

    @Override // o.aRM
    public String d() {
        return this.b;
    }

    /* renamed from: o.aQn$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final boolean d() {
            return e() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell e() {
            ABTestConfig.Cell e = C1818aPj.e(C1849aQn.class);
            C8632dsu.a(e, "");
            return e;
        }
    }
}
