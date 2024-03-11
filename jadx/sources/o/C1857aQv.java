package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;

/* renamed from: o.aQv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1857aQv extends aRM {
    private static final Map<Integer, d> a;
    public static final e b = new e(null);
    private static final d d;
    private final String i = "42750";
    private final String e = "Android: Most Liked Row/Category";
    private final int c = a.size();

    @Override // o.aRM
    public boolean L_() {
        return true;
    }

    @Override // o.aRM
    public boolean M_() {
        return true;
    }

    @Override // o.aRM
    public boolean N_() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.i;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.e;
    }

    /* renamed from: o.aQv$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final boolean a;
        private final boolean b;
        private final boolean c;
        private final String e;

        public final boolean a() {
            return this.b;
        }

        public final boolean b() {
            return this.c;
        }

        public final boolean d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.b == dVar.b && this.c == dVar.c && this.a == dVar.a && C8632dsu.c((Object) this.e, (Object) dVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.b) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.a)) * 31) + this.e.hashCode();
        }

        public String toString() {
            boolean z = this.b;
            boolean z2 = this.c;
            boolean z3 = this.a;
            String str = this.e;
            return "Features(showMostLikedRow=" + z + ", showCustomRowHeader=" + z2 + ", showPercentageEvidence=" + z3 + ", friendlyName=" + str + ")";
        }

        public d(boolean z, boolean z2, boolean z3, String str) {
            C8632dsu.c((Object) str, "");
            this.b = z;
            this.c = z2;
            this.a = z3;
            this.e = str;
        }

        public /* synthetic */ d(boolean z, boolean z2, boolean z3, String str, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, str);
        }
    }

    /* renamed from: o.aQv$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final d b() {
            Object e;
            e = dqE.e(C1857aQv.a, Integer.valueOf(d().getCellId()));
            return (d) e;
        }

        private final ABTestConfig.Cell d() {
            return C1818aPj.e(C1857aQv.class);
        }
    }

    static {
        Map<Integer, d> c;
        d dVar = new d(false, false, false, "Control", 7, null);
        d = dVar;
        c = dqE.c(dpD.a(1, dVar), dpD.a(2, new d(true, false, false, "Most Liked Row Untreated: floor pin: Regular deduping", 6, null)), dpD.a(3, new d(true, true, false, "Most Liked Row Treated: Row Header: floor pin: Regular deduping", 4, null)), dpD.a(4, new d(true, false, true, "Most Liked Row Treated: percentage evidence: floor pin: Regular deduping", 2, null)), dpD.a(5, new d(true, true, false, "Cell 3 + a dedupe source but not a dedupe sink", 4, null)), dpD.a(6, new d(false, false, false, "DO NOT USE: De-scoped from the ab test", 7, null)), dpD.a(7, new d(true, false, true, "Most Liked Row Treated: percentage evidence: floated: Regular deduping", 2, null)));
        a = c;
    }
}
