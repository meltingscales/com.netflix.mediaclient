package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.aQW;

/* loaded from: classes.dex */
public final class aQW extends aRM {
    public static final b c = new b(null);
    private static final a d;
    private static final Map<Integer, a> e;
    private final String a = "Android Season-Level Ratings and Advisories on DP Parity";
    private final String g = "53230";
    private final int b = e.size();

    @Override // o.aRM
    public String d() {
        return this.g;
    }

    @Override // o.aRM
    /* renamed from: j */
    public String a() {
        return this.a;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final boolean d;
        private final String e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && this.d == aVar.d;
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

        public a(String str, boolean z) {
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

        public final a a() {
            return aQW.d;
        }

        public final ABTestConfig.Cell e() {
            return C1818aPj.e(aQW.class);
        }

        public final boolean d() {
            return e() != ABTestConfig.Cell.CELL_1;
        }
    }

    static {
        Map c2;
        Map<Integer, a> b2;
        a aVar = new a("Control", false);
        d = aVar;
        c2 = dqE.c(dpD.a(1, aVar), dpD.a(2, new a("Season-Level Ratings and Advisories on DP", true)));
        b2 = dqC.b(c2, (drM) new drM<Integer, a>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab53230_AndroidSeasonLevelRatingsandAdvisoriesonDPParity$Companion$features$1
            public final aQW.a d(int i) {
                return aQW.c.a();
            }

            @Override // o.drM
            public /* synthetic */ aQW.a invoke(Integer num) {
                return d(num.intValue());
            }
        });
        e = b2;
    }
}
