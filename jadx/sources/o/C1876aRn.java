package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.C1876aRn;

/* renamed from: o.aRn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1876aRn extends aRM {
    public static final c a = new c(null);
    private static final Map<Integer, b> b;
    private static final b d;
    private final String g = "55747";
    private final int c = 9;
    private final String e = "Reauth Explore";

    public static final b h() {
        return a.e();
    }

    public static final boolean n() {
        return a.b();
    }

    @Override // o.aRM
    public boolean O_() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.g;
    }

    @Override // o.aRM
    /* renamed from: o */
    public String a() {
        return this.e;
    }

    /* renamed from: o.aRn$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final boolean a;
        private final boolean b;
        private final String c;
        private final boolean d;
        private final boolean e;
        private final boolean f;
        private final boolean h;
        private final boolean i;

        public final boolean a() {
            return this.e;
        }

        public final boolean b() {
            return this.d;
        }

        public final boolean c() {
            return this.h;
        }

        public final boolean d() {
            return this.b;
        }

        public final boolean e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && this.f == bVar.f && this.i == bVar.i && this.h == bVar.h && this.e == bVar.e && this.d == bVar.d && this.a == bVar.a && this.b == bVar.b;
            }
            return false;
        }

        public final boolean f() {
            return this.f;
        }

        public final boolean h() {
            return this.i;
        }

        public int hashCode() {
            return (((((((((((((this.c.hashCode() * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.i)) * 31) + Boolean.hashCode(this.h)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            String str = this.c;
            boolean z = this.f;
            boolean z2 = this.i;
            boolean z3 = this.h;
            boolean z4 = this.e;
            boolean z5 = this.d;
            boolean z6 = this.a;
            boolean z7 = this.b;
            return "Features(friendlyName=" + str + ", ignoreLogging=" + z + ", ignoreBackgroundLaunch=" + z2 + ", ignoreBackgroundApp=" + z3 + ", attemptMslRenew=" + z4 + ", attemptCookieRenew=" + z5 + ", checkRequestUserId=" + z6 + ", checkCurrentUserId=" + z7 + ")";
        }

        public b(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.f = z;
            this.i = z2;
            this.h = z3;
            this.e = z4;
            this.d = z5;
            this.a = z6;
            this.b = z7;
        }

        public /* synthetic */ b(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? false : z6, (i & 128) == 0 ? z7 : false);
        }
    }

    /* renamed from: o.aRn$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final b d() {
            return C1876aRn.d;
        }

        public final b e() {
            Object e;
            e = dqE.e(C1876aRn.b, Integer.valueOf(a().getCellId()));
            return (b) e;
        }

        public final boolean b() {
            return a() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell a() {
            return C1818aPj.e(C1876aRn.class);
        }
    }

    static {
        Map c2;
        Map<Integer, b> b2;
        b bVar = new b("Control", false, false, false, false, false, false, false, 254, null);
        d = bVar;
        c2 = dqE.c(dpD.a(1, bVar), dpD.a(2, new b("Ignore Logging Requests", true, false, false, false, false, false, false, 252, null)), dpD.a(3, new b("Ignore Background Launch", false, true, false, false, false, false, false, 250, null)), dpD.a(4, new b("Ignore Background App", false, false, true, false, false, false, false, 246, null)), dpD.a(5, new b("Attempt MSL Renew", false, false, false, true, false, false, false, 238, null)), dpD.a(6, new b("Attempt Cookie Renew", false, false, false, false, true, false, false, 222, null)), dpD.a(7, new b("Check Request User ID", false, false, false, false, false, true, false, 190, null)), dpD.a(8, new b("Check Current User ID", false, false, false, false, false, false, true, 126, null)), dpD.a(9, new b("Kitchen Sink", true, true, true, true, false, true, true, 32, null)));
        b2 = dqC.b(c2, (drM) new drM<Integer, b>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab55747_ReauthExplore$Companion$features$1
            public final C1876aRn.b d(int i) {
                return C1876aRn.a.d();
            }

            @Override // o.drM
            public /* synthetic */ C1876aRn.b invoke(Integer num) {
                return d(num.intValue());
            }
        });
        b = b2;
    }
}
