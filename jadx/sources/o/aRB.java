package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.aRB;

/* loaded from: classes.dex */
public final class aRB extends aRM {
    private static final a a;
    public static final d c = new d(null);
    private static final Map<Integer, a> e;
    private final String d = "Fetch Live In My List";
    private final String f = "57565";
    private final int b = e.size();

    @Override // o.aRM
    public boolean L_() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.f;
    }

    @Override // o.aRM
    /* renamed from: j */
    public String a() {
        return this.d;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final boolean c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && this.c == aVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            String str = this.a;
            boolean z = this.c;
            return "Features(friendlyName=" + str + ", isInTest=" + z + ")";
        }

        public a(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = z;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final a d() {
            return aRB.a;
        }

        public final ABTestConfig.Cell a() {
            return C1818aPj.e(aRB.class);
        }

        public final boolean c() {
            return a() != ABTestConfig.Cell.CELL_1;
        }
    }

    static {
        Map c2;
        Map<Integer, a> b;
        a aVar = new a("Control", false);
        a = aVar;
        c2 = dqE.c(dpD.a(1, aVar), dpD.a(2, new a("Live as part of My List query", true)));
        b = dqC.b(c2, (drM) new drM<Integer, a>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab57565_FetchLiveInMyList$Companion$features$1
            public final aRB.a e(int i) {
                return aRB.c.d();
            }

            @Override // o.drM
            public /* synthetic */ aRB.a invoke(Integer num) {
                return e(num.intValue());
            }
        });
        e = b;
    }
}
