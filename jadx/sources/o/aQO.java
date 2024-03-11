package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aQO extends aRM {
    public static final d c = new d(null);
    private final String a = "51625";
    private final int e = 2;
    private final String b = "PQS GraphQL Migration";

    @Override // o.aRM
    /* renamed from: c */
    public String a() {
        return this.b;
    }

    @Override // o.aRM
    public String d() {
        return this.a;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("PQSGraphQLMigration");
        }

        public final boolean a() {
            return d() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell d() {
            return C1818aPj.e(aQO.class);
        }
    }
}
