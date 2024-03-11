package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;

/* renamed from: o.aRa  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1863aRa extends aRM {
    private static final e a;
    private static final Map<Integer, e> d;
    public static final d e = new d(null);
    private final String h = "54404";
    private final int b = d.size();
    private final String c = "First Time Profile Education";

    @Override // o.aRM
    public boolean N_() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.h;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.c;
    }

    /* renamed from: o.aRa$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final boolean a;
        private final String b;
        private final boolean c;
        private final boolean d;
        private final boolean e;
        private final boolean f;
        private final boolean g;

        public final boolean a() {
            return this.d;
        }

        public final boolean b() {
            return this.c;
        }

        public final boolean c() {
            return this.g;
        }

        public final boolean d() {
            return this.a;
        }

        public final boolean e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && this.e == eVar.e && this.g == eVar.g && this.c == eVar.c && this.d == eVar.d && this.a == eVar.a && this.f == eVar.f;
            }
            return false;
        }

        public final boolean f() {
            return this.f;
        }

        public int hashCode() {
            return (((((((((((this.b.hashCode() * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.g)) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.f);
        }

        public String toString() {
            String str = this.b;
            boolean z = this.e;
            boolean z2 = this.g;
            boolean z3 = this.c;
            boolean z4 = this.d;
            boolean z5 = this.a;
            boolean z6 = this.f;
            return "Features(friendlyName=" + str + ", enabled=" + z + ", tapToNavigate=" + z2 + ", hasSkip=" + z3 + ", hasBody=" + z4 + ", opensFromProfileGate=" + z5 + ", withLottie=" + z6 + ")";
        }

        public e(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = z;
            this.g = z2;
            this.c = z3;
            this.d = z4;
            this.a = z5;
            this.f = z6;
        }
    }

    /* renamed from: o.aRa$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final e d() {
            Object e;
            e = dqE.e(C1863aRa.d, Integer.valueOf(e().getCellId()));
            return (e) e;
        }

        private final ABTestConfig.Cell e() {
            return C1818aPj.e(C1863aRa.class);
        }
    }

    static {
        Map<Integer, e> c;
        e eVar = new e("Control", false, true, false, false, false, true);
        a = eVar;
        c = dqE.c(dpD.a(1, eVar), dpD.a(2, new e("Best Guess", true, true, false, false, false, true)), dpD.a(3, new e("Cell 2 + Only swipe to navigate", true, false, true, false, false, true)), dpD.a(4, new e("Cell 2 + Skip", true, true, true, false, false, true)), dpD.a(5, new e("Cell 2 + Copy ALT", true, true, false, true, false, true)), dpD.a(6, new e("Show permanent entry point in profile gate", true, true, false, false, true, true)), dpD.a(7, new e("Cell 2 + Static illustration", true, true, false, false, false, false)));
        d = c;
    }
}
