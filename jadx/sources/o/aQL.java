package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.aQL;

/* loaded from: classes.dex */
public final class aQL extends aRM {
    public static final e a = new e(null);
    private static final b b;
    private static final Map<Integer, b> e;
    private final String d = "SearchPreQueryHoldback";
    private final String f = "50692";
    private final int c = e.size();

    @Override // o.aRM
    public String d() {
        return this.f;
    }

    @Override // o.aRM
    /* renamed from: i */
    public String a() {
        return this.d;
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final String c;
        private final boolean e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && this.e == bVar.e;
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            String str = this.c;
            boolean z = this.e;
            return "Features(friendlyName=" + str + ", isInTest=" + z + ")";
        }

        public b(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = z;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final b d() {
            return aQL.b;
        }

        public final ABTestConfig.Cell c() {
            return C1818aPj.e(aQL.class);
        }

        public final boolean a() {
            return c() != ABTestConfig.Cell.CELL_1;
        }
    }

    static {
        Map c;
        Map<Integer, b> b2;
        b bVar = new b("Cell 1 - Adaptive prequery", false);
        b = bVar;
        c = dqE.c(dpD.a(1, bVar), dpD.a(2, new b("Cell 2 - Held back experience", true)));
        b2 = dqC.b(c, (drM) new drM<Integer, b>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab50692_SearchPreQueryHoldback$Companion$features$1
            public final aQL.b b(int i) {
                return aQL.a.d();
            }

            @Override // o.drM
            public /* synthetic */ aQL.b invoke(Integer num) {
                return b(num.intValue());
            }
        });
        e = b2;
    }
}
