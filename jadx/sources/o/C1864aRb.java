package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.C1864aRb;

/* renamed from: o.aRb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1864aRb extends aRM {
    private static final Map<Integer, c> a;
    public static final a b = new a(null);
    private static final c e;
    private final String d = "IP Based Mobile Games";
    private final String f = "54177";
    private final int c = a.size();

    @Override // o.aRM
    public boolean M_() {
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

    /* renamed from: o.aRb$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final boolean a;
        private final String e;

        public final boolean b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && this.a == cVar.a;
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + Boolean.hashCode(this.a);
        }

        public String toString() {
            String str = this.e;
            boolean z = this.a;
            return "Features(friendlyName=" + str + ", bigRowDesign=" + z + ")";
        }

        public c(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = z;
        }
    }

    /* renamed from: o.aRb$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final c b() {
            return C1864aRb.e;
        }

        public final c a() {
            Object e;
            e = dqE.e(C1864aRb.a, Integer.valueOf(c().getCellId()));
            return (c) e;
        }

        public final ABTestConfig.Cell c() {
            return C1818aPj.e(C1864aRb.class);
        }

        public final boolean e() {
            return c() != ABTestConfig.Cell.CELL_1;
        }
    }

    static {
        Map c2;
        Map<Integer, c> b2;
        c cVar = new c("Control", false);
        e = cVar;
        c2 = dqE.c(dpD.a(1, cVar), dpD.a(2, new c("Secondary control", false)), dpD.a(3, new c("Home standard game icon UI", false)), dpD.a(4, new c("Home show centric design", true)), dpD.a(5, new c("Home game centric design", true)), dpD.a(6, new c("Game tab show centric design", true)), dpD.a(7, new c("Home and Game show centric design", true)));
        b2 = dqC.b(c2, (drM) new drM<Integer, c>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab54177_IPBasedMobileGames$Companion$features$1
            public final C1864aRb.c a(int i) {
                return C1864aRb.b.b();
            }

            @Override // o.drM
            public /* synthetic */ C1864aRb.c invoke(Integer num) {
                return a(num.intValue());
            }
        });
        a = b2;
    }
}
