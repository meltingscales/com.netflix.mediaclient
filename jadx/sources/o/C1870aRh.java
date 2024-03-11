package o;

import android.content.Context;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;

/* renamed from: o.aRh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1870aRh extends aRM {
    public static final b a = new b(null);
    private static final e b;
    private static final Map<Integer, e> c;
    private final String h = "55526";
    private final int d = c.size();
    private final String e = "Trailer MVP4";

    public static final e j() {
        return a.a();
    }

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
        return this.h;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.e;
    }

    /* renamed from: o.aRh$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final boolean a;
        private final boolean b;
        private final Integer c;
        private final Integer d;
        private final String e;
        private final boolean f;
        private final boolean g;
        private final boolean h;
        private final boolean j;

        public final boolean a() {
            return this.g;
        }

        public final Integer b() {
            return this.d;
        }

        public final boolean c() {
            return this.a;
        }

        public final Integer d() {
            return this.c;
        }

        public final boolean e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && this.g == eVar.g && this.j == eVar.j && this.h == eVar.h && C8632dsu.c(this.d, eVar.d) && C8632dsu.c(this.c, eVar.c) && this.b == eVar.b && this.a == eVar.a && this.f == eVar.f;
            }
            return false;
        }

        public final boolean f() {
            return this.h;
        }

        public final boolean h() {
            return this.j;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = Boolean.hashCode(this.g);
            int hashCode3 = Boolean.hashCode(this.j);
            int hashCode4 = Boolean.hashCode(this.h);
            Integer num = this.d;
            int hashCode5 = num == null ? 0 : num.hashCode();
            Integer num2 = this.c;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.f);
        }

        public final boolean j() {
            return this.f;
        }

        public String toString() {
            String str = this.e;
            boolean z = this.g;
            boolean z2 = this.j;
            boolean z3 = this.h;
            Integer num = this.d;
            Integer num2 = this.c;
            boolean z4 = this.b;
            boolean z5 = this.a;
            boolean z6 = this.f;
            return "Features(friendlyName=" + str + ", launchToNewAndHot=" + z + ", reorderTabs=" + z2 + ", secondaryDesign=" + z3 + ", cwRowPosition=" + num + ", gamesRowPosition=" + num2 + ", insideCard=" + z4 + ", hawkinsCTAs=" + z5 + ", titleText=" + z6 + ")";
        }

        public e(String str, boolean z, boolean z2, boolean z3, Integer num, Integer num2, boolean z4, boolean z5, boolean z6) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.g = z;
            this.j = z2;
            this.h = z3;
            this.d = num;
            this.c = num2;
            this.b = z4;
            this.a = z5;
            this.f = z6;
        }

        public /* synthetic */ e(String str, boolean z, boolean z2, boolean z3, Integer num, Integer num2, boolean z4, boolean z5, boolean z6, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? null : num, (i & 32) == 0 ? num2 : null, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? false : z5, (i & JSONzip.end) == 0 ? z6 : false);
        }
    }

    /* renamed from: o.aRh$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final boolean d() {
            return a().d() != null;
        }

        public final boolean c() {
            return e() != ABTestConfig.Cell.CELL_1;
        }

        public final e a() {
            Object e;
            e = dqE.e(C1870aRh.c, Integer.valueOf(e().getCellId()));
            return (e) e;
        }

        private final ABTestConfig.Cell e() {
            return C1818aPj.e(C1870aRh.class);
        }

        public final boolean b() {
            return e() == ABTestConfig.Cell.CELL_1 && h();
        }

        private final boolean h() {
            C1332Xp c1332Xp = C1332Xp.b;
            ABTestConfig.Cell e = C1818aPj.e(C1870aRh.class);
            C8632dsu.a(e, "");
            return ((C1870aRh) C1818aPj.a(C1870aRh.class)).d((Context) C1332Xp.b(Context.class), e);
        }
    }

    static {
        Map<Integer, e> c2;
        e eVar = new e("Control", false, false, false, null, null, false, false, false, 510, null);
        b = eVar;
        c2 = dqE.c(dpD.a(1, eVar), dpD.a(2, new e("N&H first tab", true, true, false, null, null, false, false, false, 504, null)), dpD.a(3, new e("Top picks for you", false, false, false, null, null, false, false, false, 510, null)), dpD.a(4, new e("Games Row 2", true, true, true, 3, 1, true, false, false, 384, null)), dpD.a(5, new e("Games Row 3", true, true, true, 4, 2, true, false, false, 384, null)), dpD.a(6, new e("Card", true, true, true, null, null, true, false, false, 432, null)), dpD.a(7, new e("Has CW", true, true, true, 2, null, true, false, false, 416, null)), dpD.a(8, new e("Bigger CTAs", true, true, true, 2, null, true, true, false, 288, null)), dpD.a(9, new e("Title Text", true, true, true, 2, null, true, true, true, 32, null)), dpD.a(10, new e("Secondary design", true, true, true, null, null, false, false, false, 496, null)), dpD.a(11, new e("Cell 4 + No Games Category", true, true, true, 3, 1, true, false, false, 384, null)));
        c = c2;
    }
}
