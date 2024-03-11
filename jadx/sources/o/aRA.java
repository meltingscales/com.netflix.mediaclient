package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.aRA;

/* loaded from: classes.dex */
public final class aRA extends aRM {
    private static final Map<Integer, a> c;
    private static final a d;
    public static final c e = new c(null);
    private final String a = "Android - Live HEVC Explore";
    private final String g = "57631";
    private final int b = c.size();

    public static final boolean h() {
        return e.d();
    }

    public static final boolean j() {
        return e.a();
    }

    @Override // o.aRM
    public String d() {
        return this.g;
    }

    @Override // o.aRM
    /* renamed from: m */
    public String a() {
        return this.a;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final String d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c((Object) this.d, (Object) ((a) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            String str = this.d;
            return "Features(friendlyName=" + str + ")";
        }

        public a(String str) {
            C8632dsu.c((Object) str, "");
            this.d = str;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final a c() {
            return aRA.d;
        }

        public final ABTestConfig.Cell e() {
            return C1818aPj.e(aRA.class);
        }

        public final boolean a() {
            return e() != ABTestConfig.Cell.CELL_1;
        }

        public final boolean d() {
            return e() == ABTestConfig.Cell.CELL_3;
        }
    }

    static {
        Map c2;
        Map<Integer, a> b;
        a aVar = new a("Control");
        d = aVar;
        c2 = dqE.c(dpD.a(1, aVar), dpD.a(2, new a("Enable HEVC")), dpD.a(3, new a("Enable HEVC + Set Codec")));
        b = dqC.b(c2, (drM) new drM<Integer, a>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab57631_LiveHevcExplore$Companion$features$1
            public final aRA.a e(int i) {
                return aRA.e.c();
            }

            @Override // o.drM
            public /* synthetic */ aRA.a invoke(Integer num) {
                return e(num.intValue());
            }
        });
        c = b;
    }
}
