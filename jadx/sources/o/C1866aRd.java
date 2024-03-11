package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.C1866aRd;

/* renamed from: o.aRd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1866aRd extends aRM {
    private static final d b;
    private static final Map<Integer, d> c;
    public static final c d = new c(null);
    private final String e = "Secondary Profiles Onboarding";
    private final String h = "53426";
    private final int a = c.size();

    @Override // o.aRM
    public String d() {
        return this.h;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.e;
    }

    /* renamed from: o.aRd$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final boolean b;
        private final boolean c;

        public final boolean a() {
            return this.c;
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
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && this.b == dVar.b && this.c == dVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            String str = this.a;
            boolean z = this.b;
            boolean z2 = this.c;
            return "Features(friendlyName=" + str + ", isInTest=" + z + ", showOnboarding=" + z2 + ")";
        }

        public d(String str, boolean z, boolean z2) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = z;
            this.c = z2;
        }
    }

    /* renamed from: o.aRd$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final d a() {
            return C1866aRd.b;
        }

        public final d c() {
            Object e;
            e = dqE.e(C1866aRd.c, Integer.valueOf(e().getCellId()));
            return (d) e;
        }

        public final ABTestConfig.Cell e() {
            return C1818aPj.e(C1866aRd.class);
        }
    }

    static {
        Map c2;
        Map<Integer, d> b2;
        d dVar = new d("Control", false, false);
        b = dVar;
        c2 = dqE.c(dpD.a(1, dVar), dpD.a(2, new d("show Profile Onboarding", true, true)), dpD.a(3, new d("2nd control: eligibility check", true, false)));
        b2 = dqC.b(c2, (drM) new drM<Integer, d>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab53426_SecondaryProfilesOnboarding$Companion$features$1
            public final C1866aRd.d e(int i) {
                return C1866aRd.d.a();
            }

            @Override // o.drM
            public /* synthetic */ C1866aRd.d invoke(Integer num) {
                return e(num.intValue());
            }
        });
        c = b2;
    }
}
