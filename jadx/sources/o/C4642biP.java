package o;

import com.netflix.android.org.json.zip.JSONzip;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: o.biP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4642biP {
    private static final C4816bmy a;
    private static final C4813bmv c;
    public static final b b = new b(null);
    private static final a d = new a(false, false, false, false, false, false, false, false, false, false, false, false, 4095, null);

    /* renamed from: o.biP$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC5270bvb {
        private C4813bmv a;
        private final String b;
        private List<e> c;
        private boolean d;
        private final boolean e;
        private final long f;
        private boolean h;

        @Override // o.InterfaceC5270bvb
        public List<e> a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final C4813bmv c() {
            return this.a;
        }

        public void d(List<e> list) {
            C8632dsu.c((Object) list, "");
            this.c = list;
        }

        public final void d(C4813bmv c4813bmv) {
            C8632dsu.c((Object) c4813bmv, "");
            this.a = c4813bmv;
        }

        public final void d(boolean z) {
            this.h = z;
        }

        public final boolean d() {
            return (this.e || this.d || this.h) ? false : true;
        }

        public final void e(boolean z) {
            this.d = z;
        }

        public final boolean e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f == dVar.f && C8632dsu.c(this.c, dVar.c) && C8632dsu.c(this.a, dVar.a) && this.e == dVar.e && C8632dsu.c((Object) this.b, (Object) dVar.b) && this.d == dVar.d;
            }
            return false;
        }

        @Override // o.InterfaceC5270bvb
        public long f() {
            return this.f;
        }

        public final boolean h() {
            return this.e;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.f);
            int hashCode2 = this.c.hashCode();
            int hashCode3 = this.a.hashCode();
            int hashCode4 = Boolean.hashCode(this.e);
            String str = this.b;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.d);
        }

        public final boolean j() {
            return this.h;
        }

        public String toString() {
            long j = this.f;
            List<e> list = this.c;
            C4813bmv c4813bmv = this.a;
            boolean z = this.e;
            String str = this.b;
            boolean z2 = this.d;
            return "AdBreak(locationMs=" + j + ", ads=" + list + ", adBreaksImpressionConfiguration=" + c4813bmv + ", isStatic=" + z + ", adBreakToken=" + str + ", hydrated=" + z2 + ")";
        }

        public d(long j, List<e> list, C4813bmv c4813bmv, boolean z, String str, boolean z2) {
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) c4813bmv, "");
            this.f = j;
            this.c = list;
            this.a = c4813bmv;
            this.e = z;
            this.b = str;
            this.d = z2;
            for (e eVar : a()) {
                eVar.a(this);
            }
        }

        @Override // o.InterfaceC5270bvb
        public boolean i() {
            return this.h || (this.e && a().isEmpty());
        }
    }

    /* renamed from: o.biP$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC5269bva {
        public d a;
        private final long b;
        private final boolean c;
        private final C4816bmy d;
        private final long e;
        private final long f;
        private final c g;
        private int h;
        private String i;
        private final boolean j;
        private final a n;

        public final long a() {
            return this.b;
        }

        public final void a(d dVar) {
            C8632dsu.c((Object) dVar, "");
            this.a = dVar;
        }

        public final boolean b() {
            return this.c;
        }

        public final C4816bmy d() {
            return this.d;
        }

        @Override // o.InterfaceC5269bva
        public long e() {
            return this.e;
        }

        public final void e(int i) {
            this.h = i;
        }

        public final void e(String str) {
            this.i = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c(this.g, eVar.g) && this.f == eVar.f && this.e == eVar.e && C8632dsu.c(this.n, eVar.n) && this.b == eVar.b && C8632dsu.c(this.d, eVar.d) && this.j == eVar.j && this.c == eVar.c && this.h == eVar.h;
            }
            return false;
        }

        @Override // o.InterfaceC5269bva
        /* renamed from: f */
        public c h() {
            return this.g;
        }

        public final int g() {
            return this.h;
        }

        public int hashCode() {
            return (((((((((((((((this.g.hashCode() * 31) + Long.hashCode(this.f)) * 31) + Long.hashCode(this.e)) * 31) + this.n.hashCode()) * 31) + Long.hashCode(this.b)) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.j)) * 31) + Boolean.hashCode(this.c)) * 31) + Integer.hashCode(this.h);
        }

        public boolean i() {
            return this.i != null;
        }

        public final String j() {
            return this.i;
        }

        @Override // o.InterfaceC5269bva
        public long k() {
            return this.f;
        }

        public final boolean n() {
            return this.j;
        }

        public final a o() {
            return this.n;
        }

        public String toString() {
            c cVar = this.g;
            long j = this.f;
            long j2 = this.e;
            a aVar = this.n;
            long j3 = this.b;
            C4816bmy c4816bmy = this.d;
            boolean z = this.j;
            boolean z2 = this.c;
            int i = this.h;
            return "Ad(id=" + cVar + ", startTimeMs=" + j + ", endTimeMs=" + j2 + ", uxPolicy=" + aVar + ", adBreakLocationMs=" + j3 + ", adImpressionConfiguration=" + c4816bmy + ", startAdBreak=" + z + ", endAdBreak=" + z2 + ", played=" + i + ")";
        }

        public e(c cVar, long j, long j2, a aVar, long j3, C4816bmy c4816bmy, boolean z, boolean z2, int i) {
            C8632dsu.c((Object) cVar, "");
            C8632dsu.c((Object) aVar, "");
            C8632dsu.c((Object) c4816bmy, "");
            this.g = cVar;
            this.f = j;
            this.e = j2;
            this.n = aVar;
            this.b = j3;
            this.d = c4816bmy;
            this.j = z;
            this.c = z2;
            this.h = i;
        }

        public final d c() {
            d dVar = this.a;
            if (dVar != null) {
                return dVar;
            }
            C8632dsu.d("");
            return null;
        }
    }

    /* renamed from: o.biP$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC5214buY {
        private final long a;

        public long e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public int hashCode() {
            return Long.hashCode(this.a);
        }

        public String toString() {
            long j = this.a;
            return "AdIdentifier(viewableId=" + j + ")";
        }

        public c(long j) {
            this.a = j;
        }
    }

    /* renamed from: o.biP$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC5215buZ {
        private final boolean a;
        private final boolean b;
        private final boolean c;
        private final boolean d;
        private final boolean e;
        private final boolean f;
        private final boolean g;
        private final boolean h;
        private final boolean i;
        private final boolean j;
        private final boolean k;

        /* renamed from: o  reason: collision with root package name */
        private final boolean f13601o;

        public a() {
            this(false, false, false, false, false, false, false, false, false, false, false, false, 4095, null);
        }

        public boolean a() {
            return this.e;
        }

        @Override // o.InterfaceC5215buZ
        public boolean b() {
            return this.i;
        }

        @Override // o.InterfaceC5215buZ
        public boolean c() {
            return this.a;
        }

        public boolean d() {
            return this.c;
        }

        public boolean e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f == aVar.f && this.i == aVar.i && this.a == aVar.a && this.d == aVar.d && this.f13601o == aVar.f13601o && this.g == aVar.g && this.b == aVar.b && this.c == aVar.c && this.e == aVar.e && this.j == aVar.j && this.h == aVar.h && this.k == aVar.k;
            }
            return false;
        }

        public int hashCode() {
            return (((((((((((((((((((((Boolean.hashCode(this.f) * 31) + Boolean.hashCode(this.i)) * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f13601o)) * 31) + Boolean.hashCode(this.g)) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.j)) * 31) + Boolean.hashCode(this.h)) * 31) + Boolean.hashCode(this.k);
        }

        public boolean i() {
            return this.j;
        }

        public String toString() {
            return "C4UxPolicy()";
        }

        public a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
            this.f = z;
            this.i = z2;
            this.a = z3;
            this.d = z4;
            this.f13601o = z5;
            this.g = z6;
            this.b = z7;
            this.c = z8;
            this.e = z9;
            this.j = z10;
            this.h = z11;
            this.k = z12;
        }

        public /* synthetic */ a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) != 0 ? true : z8, (i & JSONzip.end) != 0 ? true : z9, (i & 512) != 0 ? true : z10, (i & 1024) == 0 ? z11 : false, (i & 2048) == 0 ? z12 : true);
        }
    }

    /* renamed from: o.biP$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("AdsData");
        }

        public final a b() {
            return C4642biP.d;
        }

        public final List<e> d(AbstractC4470bfC abstractC4470bfC) {
            int d;
            C8632dsu.c((Object) abstractC4470bfC, "");
            List<AbstractC4468bfA> j = abstractC4470bfC.j();
            C8632dsu.a(j, "");
            d = C8572dqo.d(j, 10);
            ArrayList arrayList = new ArrayList(d);
            int i = 0;
            for (Object obj : j) {
                if (i < 0) {
                    C8569dql.h();
                }
                AbstractC4468bfA abstractC4468bfA = (AbstractC4468bfA) obj;
                c cVar = new c(abstractC4468bfA.b());
                long d2 = abstractC4468bfA.d();
                long e = abstractC4468bfA.e();
                a b = C4642biP.b.b();
                long b2 = abstractC4470bfC.b();
                C8632dsu.d(abstractC4468bfA);
                arrayList.add(new e(cVar, d2, e, b, b2, C4812bmu.c(abstractC4468bfA), i == 0, i == abstractC4470bfC.j().size() - 1, 0));
                i++;
            }
            return arrayList;
        }
    }

    static {
        List i;
        Map d2;
        Map d3;
        i = C8569dql.i();
        d2 = dqE.d();
        a = new C4816bmy(i, d2, new C4805bmn(123L, false, null), 0L);
        d3 = dqE.d();
        c = new C4813bmv(d3, null, false, 4, null);
    }
}
