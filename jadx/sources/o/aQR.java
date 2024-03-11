package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.aQR;

/* loaded from: classes.dex */
public final class aQR extends aRM {
    private static final Map<Integer, e> a;
    private static final e d;
    public static final b e = new b(null);
    private final String b = "PrePlay_and_PostPlay_to_GraphQL_migration";
    private final String g = "53071";
    private final int c = a.size();

    @Override // o.aRM
    public String d() {
        return this.g;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.b;
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final boolean d;
        private final String e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && this.d == eVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + Boolean.hashCode(this.d);
        }

        public String toString() {
            String str = this.e;
            boolean z = this.d;
            return "Features(friendlyName=" + str + ", isInTest=" + z + ")";
        }

        public e(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = z;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final e a() {
            return aQR.d;
        }

        public final ABTestConfig.Cell e() {
            return C1818aPj.e(aQR.class);
        }

        public final boolean b() {
            return e() != ABTestConfig.Cell.CELL_1;
        }
    }

    static {
        Map c;
        Map<Integer, e> b2;
        e eVar = new e("Control", false);
        d = eVar;
        c = dqE.c(dpD.a(1, eVar), dpD.a(2, new e("GraphQL enabled", true)));
        b2 = dqC.b(c, (drM) new drM<Integer, e>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab53071_prepostplayGraphQLMigration$Companion$features$1
            public final aQR.e c(int i) {
                return aQR.e.a();
            }

            @Override // o.drM
            public /* synthetic */ aQR.e invoke(Integer num) {
                return c(num.intValue());
            }
        });
        a = b2;
    }
}
