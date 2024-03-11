package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.aRF;

/* loaded from: classes.dex */
public final class aRF extends aRM {
    private static final d a;
    private static final Map<Integer, d> c;
    public static final b e = new b(null);
    private final String d = "Thumbs for Mobile Games";
    private final String i = "58347";
    private final int b = c.size();

    @Override // o.aRM
    public String d() {
        return this.i;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.d;
    }

    /* loaded from: classes3.dex */
    public static final class d {
        private final boolean b;
        private final boolean d;
        private final String e;

        public final boolean d() {
            return this.d;
        }

        public final boolean e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && this.b == dVar.b && this.d == dVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (((this.e.hashCode() * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.d);
        }

        public String toString() {
            String str = this.e;
            boolean z = this.b;
            boolean z2 = this.d;
            return "Features(friendlyName=" + str + ", isGamesThumbsEnabled=" + z + ", isDefault=" + z2 + ")";
        }

        public d(String str, boolean z, boolean z2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = z;
            this.d = z2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final d a() {
            Object e;
            e = dqE.e(aRF.c, Integer.valueOf(b().getCellId()));
            return (d) e;
        }

        private final ABTestConfig.Cell b() {
            return C1818aPj.e(aRF.class);
        }
    }

    static {
        Map c2;
        Map<Integer, d> b2;
        d dVar = new d("Default", false, true);
        a = dVar;
        c2 = dqE.c(dpD.a(1, dVar), dpD.a(2, new d("Disabled", false, false)), dpD.a(3, new d("Enabled", true, false)));
        b2 = dqC.b(c2, (drM) new drM<Integer, d>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab58347_ThumbsForMobileGames$Companion$features$1
            public final aRF.d b(int i) {
                aRF.d dVar2;
                dVar2 = aRF.a;
                return dVar2;
            }

            @Override // o.drM
            public /* synthetic */ aRF.d invoke(Integer num) {
                return b(num.intValue());
            }
        });
        c = b2;
    }
}
