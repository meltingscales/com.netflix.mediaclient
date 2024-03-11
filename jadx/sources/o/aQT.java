package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_EnableTrailersMVP3ForKids;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;

/* loaded from: classes.dex */
public final class aQT extends aRM {
    private static final Map<Integer, a> b;
    public static final c c = new c(null);
    private static final a d;
    private final String g = "52269";
    private final int a = b.size();
    private final String e = "Trailer Cards";

    public static final a j() {
        return c.c();
    }

    @Override // o.aRM
    public boolean N_() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.g;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.e;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final boolean a;
        private final String b;
        private final boolean c;
        private final boolean d;
        private final boolean e;
        private final boolean f;
        private final boolean g;
        private final boolean h;
        private final boolean i;
        private final boolean j;

        public final boolean a() {
            return this.c;
        }

        public final boolean b() {
            return this.e;
        }

        public final boolean c() {
            return this.a;
        }

        public final boolean d() {
            return this.d;
        }

        public final boolean e() {
            return this.h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && this.g == aVar.g && this.d == aVar.d && this.e == aVar.e && this.h == aVar.h && this.i == aVar.i && this.a == aVar.a && this.f == aVar.f && this.c == aVar.c && this.j == aVar.j;
            }
            return false;
        }

        public final boolean f() {
            return this.g;
        }

        public final boolean g() {
            return this.f;
        }

        public final boolean h() {
            return this.j;
        }

        public int hashCode() {
            return (((((((((((((((((this.b.hashCode() * 31) + Boolean.hashCode(this.g)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.h)) * 31) + Boolean.hashCode(this.i)) * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.j);
        }

        public final boolean i() {
            return this.i;
        }

        public String toString() {
            String str = this.b;
            boolean z = this.g;
            boolean z2 = this.d;
            boolean z3 = this.e;
            boolean z4 = this.h;
            boolean z5 = this.i;
            boolean z6 = this.a;
            boolean z7 = this.f;
            boolean z8 = this.c;
            boolean z9 = this.j;
            return "Features(friendlyName=" + str + ", launchToNandH=" + z + ", cards=" + z2 + ", cwRow=" + z3 + ", hasSynopsis=" + z4 + ", hasTags=" + z5 + ", circleCtas=" + z6 + ", popularTvAndMovies=" + z7 + ", emojisInSectionHeaders=" + z8 + ", reorderTabs=" + z9 + ")";
        }

        public a(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.g = z;
            this.d = z2;
            this.e = z3;
            this.h = z4;
            this.i = z5;
            this.a = z6;
            this.f = z7;
            this.c = z8;
            this.j = z9;
        }

        public /* synthetic */ a(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? false : z6, (i & 128) != 0 ? false : z7, (i & JSONzip.end) != 0 ? true : z8, (i & 512) == 0 ? z9 : false);
        }
    }

    @Override // o.aRM
    public boolean M_() {
        return !Config_FastProperty_EnableTrailersMVP3ForKids.Companion.e();
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final boolean e() {
            return a() != ABTestConfig.Cell.CELL_1;
        }

        public final a c() {
            Object e;
            e = dqE.e(aQT.b, Integer.valueOf(a().getCellId()));
            return (a) e;
        }

        private final ABTestConfig.Cell a() {
            return C1818aPj.e(aQT.class);
        }
    }

    static {
        Map<Integer, a> c2;
        a aVar = new a("Control", false, false, false, false, false, false, false, false, false, 1022, null);
        d = aVar;
        c2 = dqE.c(dpD.a(1, aVar), dpD.a(2, new a("Old design", true, false, false, false, false, false, false, false, true, 508, null)), dpD.a(3, new a("CW Row", true, false, true, false, false, false, false, false, true, 500, null)), dpD.a(4, new a("New design with synopsis", true, true, true, true, false, false, false, false, true, 224, null)), dpD.a(5, new a("New design with tags", true, true, true, false, true, true, false, false, true, 144, null)), dpD.a(6, new a("New design with least info", true, true, true, false, false, true, false, false, true, 176, null)), dpD.a(7, new a("Cell 5 + tv/movie lists", true, true, true, false, true, true, true, false, true, 16, null)));
        b = c2;
    }
}
