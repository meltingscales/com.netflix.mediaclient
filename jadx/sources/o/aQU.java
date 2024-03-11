package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.aQU;

/* loaded from: classes.dex */
public final class aQU extends aRM {
    public static final e c = new e(null);
    private static final d d;
    private static final Map<Integer, d> e;
    private final String b = "DP_to_GraphQL_migration";
    private final String h = "51852";
    private final int a = e.size();

    @Override // o.aRM
    public String d() {
        return this.h;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.b;
    }

    /* loaded from: classes3.dex */
    public static final class d {
        private final boolean b;
        private final String e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && this.b == dVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            String str = this.e;
            boolean z = this.b;
            return "Features(friendlyName=" + str + ", isInTest=" + z + ")";
        }

        public d(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = z;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final d e() {
            return aQU.d;
        }

        public final ABTestConfig.Cell a() {
            return C1818aPj.e(aQU.class);
        }

        public final boolean d() {
            return a() != ABTestConfig.Cell.CELL_1;
        }
    }

    static {
        Map c2;
        Map<Integer, d> b;
        d dVar = new d("Control", false);
        d = dVar;
        c2 = dqE.c(dpD.a(1, dVar), dpD.a(2, new d("GraphQL enabled", true)));
        b = dqC.b(c2, (drM) new drM<Integer, d>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab51852_DPToGraphQLMigration$Companion$features$1
            public final aQU.d b(int i) {
                return aQU.c.e();
            }

            @Override // o.drM
            public /* synthetic */ aQU.d invoke(Integer num) {
                return b(num.intValue());
            }
        });
        e = b;
    }
}
