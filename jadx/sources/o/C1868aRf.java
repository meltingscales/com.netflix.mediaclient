package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.C1868aRf;

/* renamed from: o.aRf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1868aRf extends aRM {
    public static final b b = new b(null);
    private static final Map<Integer, c> d;
    private static final c e;
    private final String a = "Free Browsing for Never Members";
    private final String f = "55174";
    private final int c = d.size();

    public static final boolean j() {
        return b.e();
    }

    @Override // o.aRM
    public String d() {
        return this.f;
    }

    @Override // o.aRM
    /* renamed from: l */
    public String a() {
        return this.a;
    }

    /* renamed from: o.aRf$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final boolean b;
        private final String d;

        public final boolean e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && this.b == cVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            String str = this.d;
            boolean z = this.b;
            return "Features(friendlyName=" + str + ", isInTest=" + z + ")";
        }

        public c(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = z;
        }
    }

    /* renamed from: o.aRf$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final c d() {
            return C1868aRf.e;
        }

        public final c b() {
            Object e;
            e = dqE.e(C1868aRf.d, Integer.valueOf(c().getCellId()));
            return (c) e;
        }

        public final ABTestConfig.Cell c() {
            return C1818aPj.e(C1868aRf.class);
        }

        public final boolean e() {
            return b().e();
        }
    }

    static {
        Map c2;
        Map<Integer, c> b2;
        c cVar = new c("Control", false);
        e = cVar;
        c2 = dqE.c(dpD.a(1, cVar), dpD.a(2, new c("New & Hot - Coming Soon Preselected", true)), dpD.a(3, new c("New & Hot - Everyone's Watching Preselected", true)), dpD.a(4, new c("New & Hot - Top 10 Series Preselected", true)), dpD.a(5, new c("New & Hot - Top 10 Movies Preselected", true)), dpD.a(6, new c("Secondary Control - Copy URL experience from Test 55992", false)));
        b2 = dqC.b(c2, (drM) new drM<Integer, c>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab55174_FreeBrowsingForNeverMembers$Companion$features$1
            public final C1868aRf.c e(int i) {
                return C1868aRf.b.d();
            }

            @Override // o.drM
            public /* synthetic */ C1868aRf.c invoke(Integer num) {
                return e(num.intValue());
            }
        });
        d = b2;
    }
}
