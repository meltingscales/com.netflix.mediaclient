package o;

import com.netflix.clcs.codegen.type.CLCSSpaceSize;

/* loaded from: classes2.dex */
public final class AU implements InterfaceC9037hy {
    private final e a;
    private final a b;
    private final c c;
    private final String d;
    private final d e;
    private final n f;
    private final o h;
    private final l i;

    public final e a() {
        return this.a;
    }

    public final a b() {
        return this.b;
    }

    public final c c() {
        return this.c;
    }

    public final d d() {
        return this.e;
    }

    public final o e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AU) {
            AU au = (AU) obj;
            return C8632dsu.c((Object) this.d, (Object) au.d) && C8632dsu.c(this.h, au.h) && C8632dsu.c(this.i, au.i) && C8632dsu.c(this.f, au.f) && C8632dsu.c(this.c, au.c) && C8632dsu.c(this.b, au.b) && C8632dsu.c(this.a, au.a) && C8632dsu.c(this.e, au.e);
        }
        return false;
    }

    public final n f() {
        return this.f;
    }

    public final l g() {
        return this.i;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        o oVar = this.h;
        int hashCode2 = oVar == null ? 0 : oVar.hashCode();
        l lVar = this.i;
        int hashCode3 = lVar == null ? 0 : lVar.hashCode();
        n nVar = this.f;
        int hashCode4 = nVar == null ? 0 : nVar.hashCode();
        c cVar = this.c;
        int hashCode5 = cVar == null ? 0 : cVar.hashCode();
        a aVar = this.b;
        int hashCode6 = aVar == null ? 0 : aVar.hashCode();
        e eVar = this.a;
        int hashCode7 = eVar == null ? 0 : eVar.hashCode();
        d dVar = this.e;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        o oVar = this.h;
        l lVar = this.i;
        n nVar = this.f;
        c cVar = this.c;
        a aVar = this.b;
        e eVar = this.a;
        d dVar = this.e;
        return "ContainerStyleFragment(__typename=" + str + ", padding=" + oVar + ", paddingSize=" + lVar + ", paddingSizeResponsive=" + nVar + ", backgroundColor=" + cVar + ", borderColor=" + aVar + ", borderWidth=" + eVar + ", borderRadius=" + dVar + ")";
    }

    public AU(String str, o oVar, l lVar, n nVar, c cVar, a aVar, e eVar, d dVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.h = oVar;
        this.i = lVar;
        this.f = nVar;
        this.c = cVar;
        this.b = aVar;
        this.a = eVar;
        this.e = dVar;
    }

    /* loaded from: classes2.dex */
    public static final class o {
        private final CLCSSpaceSize a;
        private final CLCSSpaceSize b;
        private final CLCSSpaceSize c;
        private final CLCSSpaceSize d;
        private final String e;

        public final CLCSSpaceSize a() {
            return this.c;
        }

        public final CLCSSpaceSize b() {
            return this.a;
        }

        public final String c() {
            return this.e;
        }

        public final CLCSSpaceSize d() {
            return this.b;
        }

        public final CLCSSpaceSize e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                return C8632dsu.c((Object) this.e, (Object) oVar.e) && this.b == oVar.b && this.d == oVar.d && this.a == oVar.a && this.c == oVar.c;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            CLCSSpaceSize cLCSSpaceSize = this.b;
            int hashCode2 = cLCSSpaceSize == null ? 0 : cLCSSpaceSize.hashCode();
            CLCSSpaceSize cLCSSpaceSize2 = this.d;
            int hashCode3 = cLCSSpaceSize2 == null ? 0 : cLCSSpaceSize2.hashCode();
            CLCSSpaceSize cLCSSpaceSize3 = this.a;
            int hashCode4 = cLCSSpaceSize3 == null ? 0 : cLCSSpaceSize3.hashCode();
            CLCSSpaceSize cLCSSpaceSize4 = this.c;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (cLCSSpaceSize4 != null ? cLCSSpaceSize4.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            CLCSSpaceSize cLCSSpaceSize = this.b;
            CLCSSpaceSize cLCSSpaceSize2 = this.d;
            CLCSSpaceSize cLCSSpaceSize3 = this.a;
            CLCSSpaceSize cLCSSpaceSize4 = this.c;
            return "Padding(__typename=" + str + ", top=" + cLCSSpaceSize + ", bottom=" + cLCSSpaceSize2 + ", start=" + cLCSSpaceSize3 + ", end=" + cLCSSpaceSize4 + ")";
        }

        public o(String str, CLCSSpaceSize cLCSSpaceSize, CLCSSpaceSize cLCSSpaceSize2, CLCSSpaceSize cLCSSpaceSize3, CLCSSpaceSize cLCSSpaceSize4) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = cLCSSpaceSize;
            this.d = cLCSSpaceSize2;
            this.a = cLCSSpaceSize3;
            this.c = cLCSSpaceSize4;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l {
        private final String c;
        private final BK e;

        public final String c() {
            return this.c;
        }

        public final BK d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return C8632dsu.c((Object) this.c, (Object) lVar.c) && C8632dsu.c(this.e, lVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.c;
            BK bk = this.e;
            return "PaddingSize(__typename=" + str + ", paddingSizeFragment=" + bk + ")";
        }

        public l(String str, BK bk) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bk, "");
            this.c = str;
            this.e = bk;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n {
        private final f a;
        private final k b;
        private final String c;
        private final i d;
        private final r e;
        private final s g;

        public final i a() {
            return this.d;
        }

        public final s b() {
            return this.g;
        }

        public final k c() {
            return this.b;
        }

        public final f d() {
            return this.a;
        }

        public final r e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return C8632dsu.c((Object) this.c, (Object) nVar.c) && C8632dsu.c(this.g, nVar.g) && C8632dsu.c(this.b, nVar.b) && C8632dsu.c(this.a, nVar.a) && C8632dsu.c(this.d, nVar.d) && C8632dsu.c(this.e, nVar.e);
            }
            return false;
        }

        public final String g() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            s sVar = this.g;
            int hashCode2 = sVar == null ? 0 : sVar.hashCode();
            k kVar = this.b;
            int hashCode3 = kVar == null ? 0 : kVar.hashCode();
            f fVar = this.a;
            int hashCode4 = fVar == null ? 0 : fVar.hashCode();
            i iVar = this.d;
            int hashCode5 = iVar == null ? 0 : iVar.hashCode();
            r rVar = this.e;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (rVar != null ? rVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            s sVar = this.g;
            k kVar = this.b;
            f fVar = this.a;
            i iVar = this.d;
            r rVar = this.e;
            return "PaddingSizeResponsive(__typename=" + str + ", xs=" + sVar + ", s=" + kVar + ", m=" + fVar + ", l=" + iVar + ", xl=" + rVar + ")";
        }

        public n(String str, s sVar, k kVar, f fVar, i iVar, r rVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.g = sVar;
            this.b = kVar;
            this.a = fVar;
            this.d = iVar;
            this.e = rVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        private final String b;
        private final AW d;

        public final String a() {
            return this.b;
        }

        public final AW d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.d, cVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.b;
            AW aw = this.d;
            return "BackgroundColor(__typename=" + str + ", colorFragment=" + aw + ")";
        }

        public c(String str, AW aw) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) aw, "");
            this.b = str;
            this.d = aw;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final AW a;
        private final String c;

        public final AW a() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.c;
            AW aw = this.a;
            return "BorderColor(__typename=" + str + ", colorFragment=" + aw + ")";
        }

        public a(String str, AW aw) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) aw, "");
            this.c = str;
            this.a = aw;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final h a;
        private final b b;
        private final p c;
        private final m d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final m b() {
            return this.d;
        }

        public final p c() {
            return this.c;
        }

        public final b d() {
            return this.b;
        }

        public final h e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c(this.c, eVar.c) && C8632dsu.c(this.b, eVar.b) && C8632dsu.c(this.d, eVar.d) && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            p pVar = this.c;
            int hashCode2 = pVar == null ? 0 : pVar.hashCode();
            b bVar = this.b;
            int hashCode3 = bVar == null ? 0 : bVar.hashCode();
            m mVar = this.d;
            int hashCode4 = mVar == null ? 0 : mVar.hashCode();
            h hVar = this.a;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (hVar != null ? hVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            p pVar = this.c;
            b bVar = this.b;
            m mVar = this.d;
            h hVar = this.a;
            return "BorderWidth(__typename=" + str + ", top=" + pVar + ", bottom=" + bVar + ", start=" + mVar + ", end=" + hVar + ")";
        }

        public e(String str, p pVar, b bVar, m mVar, h hVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = pVar;
            this.b = bVar;
            this.d = mVar;
            this.a = hVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        private final q a;
        private final String b;
        private final j c;
        private final g d;
        private final t e;

        public final j a() {
            return this.c;
        }

        public final q b() {
            return this.a;
        }

        public final g c() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public final t e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c(this.e, dVar.e) && C8632dsu.c(this.a, dVar.a) && C8632dsu.c(this.d, dVar.d) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            t tVar = this.e;
            int hashCode2 = tVar == null ? 0 : tVar.hashCode();
            q qVar = this.a;
            int hashCode3 = qVar == null ? 0 : qVar.hashCode();
            g gVar = this.d;
            int hashCode4 = gVar == null ? 0 : gVar.hashCode();
            j jVar = this.c;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (jVar != null ? jVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            t tVar = this.e;
            q qVar = this.a;
            g gVar = this.d;
            j jVar = this.c;
            return "BorderRadius(__typename=" + str + ", topStart=" + tVar + ", topEnd=" + qVar + ", bottomStart=" + gVar + ", bottomEnd=" + jVar + ")";
        }

        public d(String str, t tVar, q qVar, g gVar, j jVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = tVar;
            this.a = qVar;
            this.d = gVar;
            this.c = jVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s {
        private final BK b;
        private final String e;

        public final String d() {
            return this.e;
        }

        public final BK e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof s) {
                s sVar = (s) obj;
                return C8632dsu.c((Object) this.e, (Object) sVar.e) && C8632dsu.c(this.b, sVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.e;
            BK bk = this.b;
            return "Xs(__typename=" + str + ", paddingSizeFragment=" + bk + ")";
        }

        public s(String str, BK bk) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bk, "");
            this.e = str;
            this.b = bk;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k {
        private final BK b;
        private final String c;

        public final BK c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return C8632dsu.c((Object) this.c, (Object) kVar.c) && C8632dsu.c(this.b, kVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            BK bk = this.b;
            return "S(__typename=" + str + ", paddingSizeFragment=" + bk + ")";
        }

        public k(String str, BK bk) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bk, "");
            this.c = str;
            this.b = bk;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f {
        private final String d;
        private final BK e;

        public final String d() {
            return this.d;
        }

        public final BK e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c((Object) this.d, (Object) fVar.d) && C8632dsu.c(this.e, fVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            BK bk = this.e;
            return "M(__typename=" + str + ", paddingSizeFragment=" + bk + ")";
        }

        public f(String str, BK bk) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bk, "");
            this.d = str;
            this.e = bk;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i {
        private final String c;
        private final BK e;

        public final BK a() {
            return this.e;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.c, (Object) iVar.c) && C8632dsu.c(this.e, iVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.c;
            BK bk = this.e;
            return "L(__typename=" + str + ", paddingSizeFragment=" + bk + ")";
        }

        public i(String str, BK bk) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bk, "");
            this.c = str;
            this.e = bk;
        }
    }

    /* loaded from: classes2.dex */
    public static final class r {
        private final BK c;
        private final String d;

        public final String d() {
            return this.d;
        }

        public final BK e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof r) {
                r rVar = (r) obj;
                return C8632dsu.c((Object) this.d, (Object) rVar.d) && C8632dsu.c(this.c, rVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.d;
            BK bk = this.c;
            return "Xl(__typename=" + str + ", paddingSizeFragment=" + bk + ")";
        }

        public r(String str, BK bk) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bk, "");
            this.d = str;
            this.c = bk;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p {
        private final AK a;
        private final String e;

        public final AK a() {
            return this.a;
        }

        public final String b() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                p pVar = (p) obj;
                return C8632dsu.c((Object) this.e, (Object) pVar.e) && C8632dsu.c(this.a, pVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            AK ak = this.a;
            return "Top(__typename=" + str + ", borderWidthFragment=" + ak + ")";
        }

        public p(String str, AK ak) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) ak, "");
            this.e = str;
            this.a = ak;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private final String c;
        private final AK e;

        public final String b() {
            return this.c;
        }

        public final AK c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.c;
            AK ak = this.e;
            return "Bottom(__typename=" + str + ", borderWidthFragment=" + ak + ")";
        }

        public b(String str, AK ak) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) ak, "");
            this.c = str;
            this.e = ak;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m {
        private final String c;
        private final AK d;

        public final String c() {
            return this.c;
        }

        public final AK e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return C8632dsu.c((Object) this.c, (Object) mVar.c) && C8632dsu.c(this.d, mVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            AK ak = this.d;
            return "Start(__typename=" + str + ", borderWidthFragment=" + ak + ")";
        }

        public m(String str, AK ak) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) ak, "");
            this.c = str;
            this.d = ak;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h {
        private final AK d;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final AK c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.e, (Object) hVar.e) && C8632dsu.c(this.d, hVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            AK ak = this.d;
            return "End(__typename=" + str + ", borderWidthFragment=" + ak + ")";
        }

        public h(String str, AK ak) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) ak, "");
            this.e = str;
            this.d = ak;
        }
    }

    /* loaded from: classes2.dex */
    public static final class t {
        private final AL a;
        private final String c;

        public final String c() {
            return this.c;
        }

        public final AL e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof t) {
                t tVar = (t) obj;
                return C8632dsu.c((Object) this.c, (Object) tVar.c) && C8632dsu.c(this.a, tVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.c;
            AL al = this.a;
            return "TopStart(__typename=" + str + ", borderRadiusFragment=" + al + ")";
        }

        public t(String str, AL al) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) al, "");
            this.c = str;
            this.a = al;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q {
        private final String b;
        private final AL d;

        public final String c() {
            return this.b;
        }

        public final AL e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                q qVar = (q) obj;
                return C8632dsu.c((Object) this.b, (Object) qVar.b) && C8632dsu.c(this.d, qVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.b;
            AL al = this.d;
            return "TopEnd(__typename=" + str + ", borderRadiusFragment=" + al + ")";
        }

        public q(String str, AL al) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) al, "");
            this.b = str;
            this.d = al;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g {
        private final String a;
        private final AL b;

        public final String a() {
            return this.a;
        }

        public final AL c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.a, (Object) gVar.a) && C8632dsu.c(this.b, gVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            AL al = this.b;
            return "BottomStart(__typename=" + str + ", borderRadiusFragment=" + al + ")";
        }

        public g(String str, AL al) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) al, "");
            this.a = str;
            this.b = al;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j {
        private final String b;
        private final AL e;

        public final String d() {
            return this.b;
        }

        public final AL e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.b, (Object) jVar.b) && C8632dsu.c(this.e, jVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            AL al = this.e;
            return "BottomEnd(__typename=" + str + ", borderRadiusFragment=" + al + ")";
        }

        public j(String str, AL al) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) al, "");
            this.b = str;
            this.e = al;
        }
    }
}
