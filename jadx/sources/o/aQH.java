package o;

import android.content.Context;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public final class aQH extends aRM {
    public static final c b = new c(null);
    private final String c = "49736";
    private final int e = 2;
    private final String a = "Search GraphQL Migration";

    public static final boolean c() {
        return b.c();
    }

    @Override // o.aRM
    public String d() {
        return this.c;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.a;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("SearchGraphQLMigration");
        }

        public final boolean c() {
            return e() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell e() {
            return C1818aPj.e(aQH.class);
        }

        public final boolean d() {
            C1332Xp c1332Xp = C1332Xp.b;
            ABTestConfig.Cell e = C1818aPj.e(aQH.class);
            C8632dsu.a(e, "");
            return ((aQH) C1818aPj.a(aQH.class)).d((Context) C1332Xp.b(Context.class), e);
        }
    }
}
