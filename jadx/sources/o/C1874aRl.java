package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* renamed from: o.aRl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1874aRl extends aRM {
    public static final d c = new d(null);
    private final String e = "56098";
    private final int d = 2;
    private final String a = "Downloads on GraphQL";

    @Override // o.aRM
    /* renamed from: c */
    public String a() {
        return this.a;
    }

    @Override // o.aRM
    public String d() {
        return this.e;
    }

    /* renamed from: o.aRl$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("Config_Ab56098_DownloadOnGraphQL");
        }

        public final boolean a() {
            return c() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell c() {
            return C1818aPj.e(C1874aRl.class);
        }
    }
}
