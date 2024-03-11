package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.C1860aQy;

/* renamed from: o.aQy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1860aQy extends aRM {
    private static final Map<Integer, e> a;
    public static final d b = new d(null);
    private static final e c;
    private final String e = "Collecting Taste Preferences";
    private final String i = "44516";
    private final int d = a.size();

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

    /* renamed from: o.aQy$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final boolean b;
        private final int c;
        private final boolean d;
        private final boolean e;

        public final boolean b() {
            return this.b;
        }

        public final boolean c() {
            return this.d;
        }

        public final int d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && this.d == eVar.d && this.e == eVar.e && this.b == eVar.b && this.c == eVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.b)) * 31) + Integer.hashCode(this.c);
        }

        public String toString() {
            String str = this.a;
            boolean z = this.d;
            boolean z2 = this.e;
            boolean z3 = this.b;
            int i = this.c;
            return "Features(friendlyName=" + str + ", isInTest=" + z + ", betterRecommendationsCopyFraming=" + z2 + ", simpleConceptCopyFraming=" + z3 + ", titlesCount=" + i + ")";
        }

        public e(String str, boolean z, boolean z2, boolean z3, int i) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = z;
            this.e = z2;
            this.b = z3;
            this.c = i;
        }
    }

    /* renamed from: o.aQy$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final e d() {
            return C1860aQy.c;
        }

        public final e e() {
            Object e;
            e = dqE.e(C1860aQy.a, Integer.valueOf(b().getCellId()));
            return (e) e;
        }

        private final ABTestConfig.Cell b() {
            return C1818aPj.e(C1860aQy.class);
        }
    }

    static {
        Map c2;
        Map<Integer, e> b2;
        e eVar = new e("Control", false, false, false, 0);
        c = eVar;
        c2 = dqE.c(dpD.a(1, eVar), dpD.a(2, new e("Cell 2: New bulk rater UI (better recommendation copy framing)", true, true, false, 5)), dpD.a(3, new e("Cell 3: New bulk rater UI + Alternate copy", true, false, true, 5)), dpD.a(4, new e("Cell 4: New bulk rater UI with 10 titles instead of 5 (with copy cell 2)", true, true, false, 10)));
        b2 = dqC.b(c2, (drM) new drM<Integer, e>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab44516_CollectTaste$Companion$features$1
            public final C1860aQy.e c(int i) {
                return C1860aQy.b.d();
            }

            @Override // o.drM
            public /* synthetic */ C1860aQy.e invoke(Integer num) {
                return c(num.intValue());
            }
        });
        a = b2;
    }
}
