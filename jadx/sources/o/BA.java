package o;

import com.netflix.clcs.codegen.type.CLCSItemAlignment;
import com.netflix.clcs.codegen.type.CLCSLayoutDirection;
import com.netflix.clcs.codegen.type.CLCSStackContentJustification;
import java.util.List;

/* loaded from: classes2.dex */
public final class BA implements InterfaceC9037hy {
    private final CLCSStackContentJustification a;
    private final String b;
    private final e c;
    private final c d;
    private final List<C0744a> e;
    private final d f;
    private final g g;
    private final CLCSLayoutDirection h;
    private final CLCSItemAlignment i;
    private final b j;
    private final List<p> k;
    private final l l;
    private final n m;
    private final q n;

    /* renamed from: o  reason: collision with root package name */
    private final t f13347o;

    public final e a() {
        return this.c;
    }

    public final b b() {
        return this.j;
    }

    public final CLCSStackContentJustification c() {
        return this.a;
    }

    public final c d() {
        return this.d;
    }

    public final List<C0744a> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BA) {
            BA ba = (BA) obj;
            return C8632dsu.c((Object) this.b, (Object) ba.b) && this.h == ba.h && C8632dsu.c(this.f, ba.f) && this.a == ba.a && C8632dsu.c(this.j, ba.j) && this.i == ba.i && C8632dsu.c(this.g, ba.g) && C8632dsu.c(this.k, ba.k) && C8632dsu.c(this.n, ba.n) && C8632dsu.c(this.d, ba.d) && C8632dsu.c(this.c, ba.c) && C8632dsu.c(this.l, ba.l) && C8632dsu.c(this.m, ba.m) && C8632dsu.c(this.f13347o, ba.f13347o) && C8632dsu.c(this.e, ba.e);
        }
        return false;
    }

    public final g f() {
        return this.g;
    }

    public final l g() {
        return this.l;
    }

    public final CLCSLayoutDirection h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        CLCSLayoutDirection cLCSLayoutDirection = this.h;
        int hashCode2 = cLCSLayoutDirection == null ? 0 : cLCSLayoutDirection.hashCode();
        d dVar = this.f;
        int hashCode3 = dVar == null ? 0 : dVar.hashCode();
        CLCSStackContentJustification cLCSStackContentJustification = this.a;
        int hashCode4 = cLCSStackContentJustification == null ? 0 : cLCSStackContentJustification.hashCode();
        b bVar = this.j;
        int hashCode5 = bVar == null ? 0 : bVar.hashCode();
        CLCSItemAlignment cLCSItemAlignment = this.i;
        int hashCode6 = cLCSItemAlignment == null ? 0 : cLCSItemAlignment.hashCode();
        g gVar = this.g;
        int hashCode7 = gVar == null ? 0 : gVar.hashCode();
        List<p> list = this.k;
        int hashCode8 = list == null ? 0 : list.hashCode();
        q qVar = this.n;
        int hashCode9 = qVar == null ? 0 : qVar.hashCode();
        c cVar = this.d;
        int hashCode10 = cVar == null ? 0 : cVar.hashCode();
        e eVar = this.c;
        int hashCode11 = eVar == null ? 0 : eVar.hashCode();
        l lVar = this.l;
        int hashCode12 = lVar == null ? 0 : lVar.hashCode();
        n nVar = this.m;
        int hashCode13 = nVar == null ? 0 : nVar.hashCode();
        t tVar = this.f13347o;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (tVar != null ? tVar.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    public final d i() {
        return this.f;
    }

    public final CLCSItemAlignment j() {
        return this.i;
    }

    public final List<p> k() {
        return this.k;
    }

    public final String l() {
        return this.b;
    }

    public final t m() {
        return this.f13347o;
    }

    public final q n() {
        return this.n;
    }

    public final n o() {
        return this.m;
    }

    public String toString() {
        String str = this.b;
        CLCSLayoutDirection cLCSLayoutDirection = this.h;
        d dVar = this.f;
        CLCSStackContentJustification cLCSStackContentJustification = this.a;
        b bVar = this.j;
        CLCSItemAlignment cLCSItemAlignment = this.i;
        g gVar = this.g;
        List<p> list = this.k;
        q qVar = this.n;
        c cVar = this.d;
        e eVar = this.c;
        l lVar = this.l;
        n nVar = this.m;
        t tVar = this.f13347o;
        List<C0744a> list2 = this.e;
        return "LayoutFragment(__typename=" + str + ", direction=" + cLCSLayoutDirection + ", directionResponsive=" + dVar + ", contentJustification=" + cLCSStackContentJustification + ", contentJustificationResponsive=" + bVar + ", itemAlignment=" + cLCSItemAlignment + ", itemAlignmentResponsive=" + gVar + ", template=" + list + ", templateResponsive=" + qVar + ", columnSpacing=" + cVar + ", columnSpacingResponsive=" + eVar + ", rowSpacing=" + lVar + ", rowSpacingResponsive=" + nVar + ", style=" + tVar + ", children=" + list2 + ")";
    }

    public BA(String str, CLCSLayoutDirection cLCSLayoutDirection, d dVar, CLCSStackContentJustification cLCSStackContentJustification, b bVar, CLCSItemAlignment cLCSItemAlignment, g gVar, List<p> list, q qVar, c cVar, e eVar, l lVar, n nVar, t tVar, List<C0744a> list2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list2, "");
        this.b = str;
        this.h = cLCSLayoutDirection;
        this.f = dVar;
        this.a = cLCSStackContentJustification;
        this.j = bVar;
        this.i = cLCSItemAlignment;
        this.g = gVar;
        this.k = list;
        this.n = qVar;
        this.d = cVar;
        this.c = eVar;
        this.l = lVar;
        this.m = nVar;
        this.f13347o = tVar;
        this.e = list2;
    }

    /* loaded from: classes2.dex */
    public static final class d {
        private final String a;
        private final CLCSLayoutDirection b;
        private final CLCSLayoutDirection c;
        private final CLCSLayoutDirection d;
        private final CLCSLayoutDirection e;
        private final CLCSLayoutDirection i;

        public final CLCSLayoutDirection a() {
            return this.d;
        }

        public final CLCSLayoutDirection b() {
            return this.c;
        }

        public final CLCSLayoutDirection c() {
            return this.b;
        }

        public final CLCSLayoutDirection d() {
            return this.e;
        }

        public final CLCSLayoutDirection e() {
            return this.i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && this.i == dVar.i && this.d == dVar.d && this.b == dVar.b && this.e == dVar.e && this.c == dVar.c;
            }
            return false;
        }

        public final String g() {
            return this.a;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            CLCSLayoutDirection cLCSLayoutDirection = this.i;
            int hashCode2 = cLCSLayoutDirection == null ? 0 : cLCSLayoutDirection.hashCode();
            CLCSLayoutDirection cLCSLayoutDirection2 = this.d;
            int hashCode3 = cLCSLayoutDirection2 == null ? 0 : cLCSLayoutDirection2.hashCode();
            CLCSLayoutDirection cLCSLayoutDirection3 = this.b;
            int hashCode4 = cLCSLayoutDirection3 == null ? 0 : cLCSLayoutDirection3.hashCode();
            CLCSLayoutDirection cLCSLayoutDirection4 = this.e;
            int hashCode5 = cLCSLayoutDirection4 == null ? 0 : cLCSLayoutDirection4.hashCode();
            CLCSLayoutDirection cLCSLayoutDirection5 = this.c;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (cLCSLayoutDirection5 != null ? cLCSLayoutDirection5.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            CLCSLayoutDirection cLCSLayoutDirection = this.i;
            CLCSLayoutDirection cLCSLayoutDirection2 = this.d;
            CLCSLayoutDirection cLCSLayoutDirection3 = this.b;
            CLCSLayoutDirection cLCSLayoutDirection4 = this.e;
            CLCSLayoutDirection cLCSLayoutDirection5 = this.c;
            return "DirectionResponsive(__typename=" + str + ", xs=" + cLCSLayoutDirection + ", s=" + cLCSLayoutDirection2 + ", m=" + cLCSLayoutDirection3 + ", l=" + cLCSLayoutDirection4 + ", xl=" + cLCSLayoutDirection5 + ")";
        }

        public d(String str, CLCSLayoutDirection cLCSLayoutDirection, CLCSLayoutDirection cLCSLayoutDirection2, CLCSLayoutDirection cLCSLayoutDirection3, CLCSLayoutDirection cLCSLayoutDirection4, CLCSLayoutDirection cLCSLayoutDirection5) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.i = cLCSLayoutDirection;
            this.d = cLCSLayoutDirection2;
            this.b = cLCSLayoutDirection3;
            this.e = cLCSLayoutDirection4;
            this.c = cLCSLayoutDirection5;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private final String a;
        private final CLCSStackContentJustification b;
        private final CLCSStackContentJustification c;
        private final CLCSStackContentJustification d;
        private final CLCSStackContentJustification e;
        private final CLCSStackContentJustification i;

        public final CLCSStackContentJustification a() {
            return this.b;
        }

        public final CLCSStackContentJustification b() {
            return this.i;
        }

        public final CLCSStackContentJustification c() {
            return this.c;
        }

        public final CLCSStackContentJustification d() {
            return this.e;
        }

        public final CLCSStackContentJustification e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && this.i == bVar.i && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
            }
            return false;
        }

        public final String f() {
            return this.a;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            CLCSStackContentJustification cLCSStackContentJustification = this.i;
            int hashCode2 = cLCSStackContentJustification == null ? 0 : cLCSStackContentJustification.hashCode();
            CLCSStackContentJustification cLCSStackContentJustification2 = this.b;
            int hashCode3 = cLCSStackContentJustification2 == null ? 0 : cLCSStackContentJustification2.hashCode();
            CLCSStackContentJustification cLCSStackContentJustification3 = this.c;
            int hashCode4 = cLCSStackContentJustification3 == null ? 0 : cLCSStackContentJustification3.hashCode();
            CLCSStackContentJustification cLCSStackContentJustification4 = this.d;
            int hashCode5 = cLCSStackContentJustification4 == null ? 0 : cLCSStackContentJustification4.hashCode();
            CLCSStackContentJustification cLCSStackContentJustification5 = this.e;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (cLCSStackContentJustification5 != null ? cLCSStackContentJustification5.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            CLCSStackContentJustification cLCSStackContentJustification = this.i;
            CLCSStackContentJustification cLCSStackContentJustification2 = this.b;
            CLCSStackContentJustification cLCSStackContentJustification3 = this.c;
            CLCSStackContentJustification cLCSStackContentJustification4 = this.d;
            CLCSStackContentJustification cLCSStackContentJustification5 = this.e;
            return "ContentJustificationResponsive(__typename=" + str + ", xs=" + cLCSStackContentJustification + ", s=" + cLCSStackContentJustification2 + ", m=" + cLCSStackContentJustification3 + ", l=" + cLCSStackContentJustification4 + ", xl=" + cLCSStackContentJustification5 + ")";
        }

        public b(String str, CLCSStackContentJustification cLCSStackContentJustification, CLCSStackContentJustification cLCSStackContentJustification2, CLCSStackContentJustification cLCSStackContentJustification3, CLCSStackContentJustification cLCSStackContentJustification4, CLCSStackContentJustification cLCSStackContentJustification5) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.i = cLCSStackContentJustification;
            this.b = cLCSStackContentJustification2;
            this.c = cLCSStackContentJustification3;
            this.d = cLCSStackContentJustification4;
            this.e = cLCSStackContentJustification5;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g {
        private final CLCSItemAlignment a;
        private final CLCSItemAlignment b;
        private final CLCSItemAlignment c;
        private final CLCSItemAlignment d;
        private final String e;
        private final CLCSItemAlignment g;

        public final CLCSItemAlignment a() {
            return this.g;
        }

        public final CLCSItemAlignment b() {
            return this.d;
        }

        public final CLCSItemAlignment c() {
            return this.c;
        }

        public final CLCSItemAlignment d() {
            return this.b;
        }

        public final CLCSItemAlignment e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.e, (Object) gVar.e) && this.g == gVar.g && this.b == gVar.b && this.a == gVar.a && this.c == gVar.c && this.d == gVar.d;
            }
            return false;
        }

        public final String g() {
            return this.e;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            CLCSItemAlignment cLCSItemAlignment = this.g;
            int hashCode2 = cLCSItemAlignment == null ? 0 : cLCSItemAlignment.hashCode();
            CLCSItemAlignment cLCSItemAlignment2 = this.b;
            int hashCode3 = cLCSItemAlignment2 == null ? 0 : cLCSItemAlignment2.hashCode();
            CLCSItemAlignment cLCSItemAlignment3 = this.a;
            int hashCode4 = cLCSItemAlignment3 == null ? 0 : cLCSItemAlignment3.hashCode();
            CLCSItemAlignment cLCSItemAlignment4 = this.c;
            int hashCode5 = cLCSItemAlignment4 == null ? 0 : cLCSItemAlignment4.hashCode();
            CLCSItemAlignment cLCSItemAlignment5 = this.d;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (cLCSItemAlignment5 != null ? cLCSItemAlignment5.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            CLCSItemAlignment cLCSItemAlignment = this.g;
            CLCSItemAlignment cLCSItemAlignment2 = this.b;
            CLCSItemAlignment cLCSItemAlignment3 = this.a;
            CLCSItemAlignment cLCSItemAlignment4 = this.c;
            CLCSItemAlignment cLCSItemAlignment5 = this.d;
            return "ItemAlignmentResponsive(__typename=" + str + ", xs=" + cLCSItemAlignment + ", s=" + cLCSItemAlignment2 + ", m=" + cLCSItemAlignment3 + ", l=" + cLCSItemAlignment4 + ", xl=" + cLCSItemAlignment5 + ")";
        }

        public g(String str, CLCSItemAlignment cLCSItemAlignment, CLCSItemAlignment cLCSItemAlignment2, CLCSItemAlignment cLCSItemAlignment3, CLCSItemAlignment cLCSItemAlignment4, CLCSItemAlignment cLCSItemAlignment5) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.g = cLCSItemAlignment;
            this.b = cLCSItemAlignment2;
            this.a = cLCSItemAlignment3;
            this.c = cLCSItemAlignment4;
            this.d = cLCSItemAlignment5;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p {
        private final String b;
        private final BX d;

        public final String a() {
            return this.b;
        }

        public final BX d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                p pVar = (p) obj;
                return C8632dsu.c((Object) this.b, (Object) pVar.b) && C8632dsu.c(this.d, pVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.b;
            BX bx = this.d;
            return "Template(__typename=" + str + ", templateItemFragment=" + bx + ")";
        }

        public p(String str, BX bx) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bx, "");
            this.b = str;
            this.d = bx;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q {
        private final List<v> a;
        private final String b;
        private final List<f> c;
        private final List<h> d;
        private final List<s> e;
        private final List<y> j;

        public final List<s> a() {
            return this.e;
        }

        public final List<y> b() {
            return this.j;
        }

        public final List<f> c() {
            return this.c;
        }

        public final List<h> d() {
            return this.d;
        }

        public final List<v> e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                q qVar = (q) obj;
                return C8632dsu.c((Object) this.b, (Object) qVar.b) && C8632dsu.c(this.j, qVar.j) && C8632dsu.c(this.e, qVar.e) && C8632dsu.c(this.d, qVar.d) && C8632dsu.c(this.c, qVar.c) && C8632dsu.c(this.a, qVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            List<y> list = this.j;
            int hashCode2 = list == null ? 0 : list.hashCode();
            List<s> list2 = this.e;
            int hashCode3 = list2 == null ? 0 : list2.hashCode();
            List<h> list3 = this.d;
            int hashCode4 = list3 == null ? 0 : list3.hashCode();
            List<f> list4 = this.c;
            int hashCode5 = list4 == null ? 0 : list4.hashCode();
            List<v> list5 = this.a;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list5 != null ? list5.hashCode() : 0);
        }

        public final String j() {
            return this.b;
        }

        public String toString() {
            String str = this.b;
            List<y> list = this.j;
            List<s> list2 = this.e;
            List<h> list3 = this.d;
            List<f> list4 = this.c;
            List<v> list5 = this.a;
            return "TemplateResponsive(__typename=" + str + ", xs=" + list + ", small=" + list2 + ", m=" + list3 + ", l=" + list4 + ", xl=" + list5 + ")";
        }

        public q(String str, List<y> list, List<s> list2, List<h> list3, List<f> list4, List<v> list5) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.j = list;
            this.e = list2;
            this.d = list3;
            this.c = list4;
            this.a = list5;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        private final String d;
        private final C0747Bc e;

        public final C0747Bc b() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            C0747Bc c0747Bc = this.e;
            return "ColumnSpacing(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public c(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.d = str;
            this.e = c0747Bc;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final o a;
        private final k b;
        private final String c;
        private final j d;
        private final u e;
        private final x f;

        public final u a() {
            return this.e;
        }

        public final j b() {
            return this.d;
        }

        public final k c() {
            return this.b;
        }

        public final x d() {
            return this.f;
        }

        public final o e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.f, eVar.f) && C8632dsu.c(this.b, eVar.b) && C8632dsu.c(this.a, eVar.a) && C8632dsu.c(this.d, eVar.d) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public final String h() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            x xVar = this.f;
            int hashCode2 = xVar == null ? 0 : xVar.hashCode();
            k kVar = this.b;
            int hashCode3 = kVar == null ? 0 : kVar.hashCode();
            o oVar = this.a;
            int hashCode4 = oVar == null ? 0 : oVar.hashCode();
            j jVar = this.d;
            int hashCode5 = jVar == null ? 0 : jVar.hashCode();
            u uVar = this.e;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (uVar != null ? uVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            x xVar = this.f;
            k kVar = this.b;
            o oVar = this.a;
            j jVar = this.d;
            u uVar = this.e;
            return "ColumnSpacingResponsive(__typename=" + str + ", xs=" + xVar + ", s=" + kVar + ", m=" + oVar + ", l=" + jVar + ", xl=" + uVar + ")";
        }

        public e(String str, x xVar, k kVar, o oVar, j jVar, u uVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.f = xVar;
            this.b = kVar;
            this.a = oVar;
            this.d = jVar;
            this.e = uVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l {
        private final C0747Bc a;
        private final String d;

        public final C0747Bc b() {
            return this.a;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return C8632dsu.c((Object) this.d, (Object) lVar.d) && C8632dsu.c(this.a, lVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.d;
            C0747Bc c0747Bc = this.a;
            return "RowSpacing(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public l(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.d = str;
            this.a = c0747Bc;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n {
        private final String a;
        private final w b;
        private final i c;
        private final m d;
        private final r e;
        private final A g;

        public final i a() {
            return this.c;
        }

        public final w b() {
            return this.b;
        }

        public final m c() {
            return this.d;
        }

        public final A d() {
            return this.g;
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
                return C8632dsu.c((Object) this.a, (Object) nVar.a) && C8632dsu.c(this.g, nVar.g) && C8632dsu.c(this.e, nVar.e) && C8632dsu.c(this.d, nVar.d) && C8632dsu.c(this.c, nVar.c) && C8632dsu.c(this.b, nVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            A a = this.g;
            int hashCode2 = a == null ? 0 : a.hashCode();
            r rVar = this.e;
            int hashCode3 = rVar == null ? 0 : rVar.hashCode();
            m mVar = this.d;
            int hashCode4 = mVar == null ? 0 : mVar.hashCode();
            i iVar = this.c;
            int hashCode5 = iVar == null ? 0 : iVar.hashCode();
            w wVar = this.b;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (wVar != null ? wVar.hashCode() : 0);
        }

        public final String i() {
            return this.a;
        }

        public String toString() {
            String str = this.a;
            A a = this.g;
            r rVar = this.e;
            m mVar = this.d;
            i iVar = this.c;
            w wVar = this.b;
            return "RowSpacingResponsive(__typename=" + str + ", xs=" + a + ", s=" + rVar + ", m=" + mVar + ", l=" + iVar + ", xl=" + wVar + ")";
        }

        public n(String str, A a, r rVar, m mVar, i iVar, w wVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.g = a;
            this.e = rVar;
            this.d = mVar;
            this.c = iVar;
            this.b = wVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class t {
        private final String a;
        private final AU d;

        public final AU b() {
            return this.d;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof t) {
                t tVar = (t) obj;
                return C8632dsu.c((Object) this.a, (Object) tVar.a) && C8632dsu.c(this.d, tVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.a;
            AU au = this.d;
            return "Style(__typename=" + str + ", containerStyleFragment=" + au + ")";
        }

        public t(String str, AU au) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) au, "");
            this.a = str;
            this.d = au;
        }
    }

    /* renamed from: o.BA$a  reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C0744a {
        private final String a;
        private final String b;

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0744a) {
                C0744a c0744a = (C0744a) obj;
                return C8632dsu.c((Object) this.a, (Object) c0744a.a) && C8632dsu.c((Object) this.b, (Object) c0744a.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            return "Child(__typename=" + str + ", key=" + str2 + ")";
        }

        public C0744a(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.b = str2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class y {
        private final BX c;
        private final String d;

        public final BX b() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof y) {
                y yVar = (y) obj;
                return C8632dsu.c((Object) this.d, (Object) yVar.d) && C8632dsu.c(this.c, yVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.d;
            BX bx = this.c;
            return "X(__typename=" + str + ", templateItemFragment=" + bx + ")";
        }

        public y(String str, BX bx) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bx, "");
            this.d = str;
            this.c = bx;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s {
        private final String a;
        private final BX c;

        public final BX d() {
            return this.c;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof s) {
                s sVar = (s) obj;
                return C8632dsu.c((Object) this.a, (Object) sVar.a) && C8632dsu.c(this.c, sVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            BX bx = this.c;
            return "Small(__typename=" + str + ", templateItemFragment=" + bx + ")";
        }

        public s(String str, BX bx) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bx, "");
            this.a = str;
            this.c = bx;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h {
        private final BX b;
        private final String c;

        public final BX c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.c, (Object) hVar.c) && C8632dsu.c(this.b, hVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            BX bx = this.b;
            return "M(__typename=" + str + ", templateItemFragment=" + bx + ")";
        }

        public h(String str, BX bx) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bx, "");
            this.c = str;
            this.b = bx;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f {
        private final BX a;
        private final String e;

        public final BX c() {
            return this.a;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c((Object) this.e, (Object) fVar.e) && C8632dsu.c(this.a, fVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            BX bx = this.a;
            return "L(__typename=" + str + ", templateItemFragment=" + bx + ")";
        }

        public f(String str, BX bx) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bx, "");
            this.e = str;
            this.a = bx;
        }
    }

    /* loaded from: classes2.dex */
    public static final class v {
        private final String d;
        private final BX e;

        public final String b() {
            return this.d;
        }

        public final BX e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof v) {
                v vVar = (v) obj;
                return C8632dsu.c((Object) this.d, (Object) vVar.d) && C8632dsu.c(this.e, vVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            BX bx = this.e;
            return "Xl(__typename=" + str + ", templateItemFragment=" + bx + ")";
        }

        public v(String str, BX bx) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bx, "");
            this.d = str;
            this.e = bx;
        }
    }

    /* loaded from: classes2.dex */
    public static final class x {
        private final C0747Bc a;
        private final String c;

        public final C0747Bc b() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof x) {
                x xVar = (x) obj;
                return C8632dsu.c((Object) this.c, (Object) xVar.c) && C8632dsu.c(this.a, xVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.c;
            C0747Bc c0747Bc = this.a;
            return "Xs(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public x(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.c = str;
            this.a = c0747Bc;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k {
        private final String b;
        private final C0747Bc d;

        public final String c() {
            return this.b;
        }

        public final C0747Bc e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return C8632dsu.c((Object) this.b, (Object) kVar.b) && C8632dsu.c(this.d, kVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.b;
            C0747Bc c0747Bc = this.d;
            return "S(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public k(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.b = str;
            this.d = c0747Bc;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o {
        private final String a;
        private final C0747Bc b;

        public final String c() {
            return this.a;
        }

        public final C0747Bc e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                return C8632dsu.c((Object) this.a, (Object) oVar.a) && C8632dsu.c(this.b, oVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            C0747Bc c0747Bc = this.b;
            return "M1(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public o(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.a = str;
            this.b = c0747Bc;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j {
        private final String a;
        private final C0747Bc e;

        public final String b() {
            return this.a;
        }

        public final C0747Bc d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.a, (Object) jVar.a) && C8632dsu.c(this.e, jVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            C0747Bc c0747Bc = this.e;
            return "L1(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public j(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.a = str;
            this.e = c0747Bc;
        }
    }

    /* loaded from: classes2.dex */
    public static final class u {
        private final C0747Bc a;
        private final String d;

        public final C0747Bc a() {
            return this.a;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof u) {
                u uVar = (u) obj;
                return C8632dsu.c((Object) this.d, (Object) uVar.d) && C8632dsu.c(this.a, uVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.d;
            C0747Bc c0747Bc = this.a;
            return "Xl1(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public u(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.d = str;
            this.a = c0747Bc;
        }
    }

    /* loaded from: classes2.dex */
    public static final class A {
        private final C0747Bc c;
        private final String e;

        public final C0747Bc a() {
            return this.c;
        }

        public final String c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof A) {
                A a = (A) obj;
                return C8632dsu.c((Object) this.e, (Object) a.e) && C8632dsu.c(this.c, a.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.e;
            C0747Bc c0747Bc = this.c;
            return "Xs1(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public A(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.e = str;
            this.c = c0747Bc;
        }
    }

    /* loaded from: classes2.dex */
    public static final class r {
        private final String d;
        private final C0747Bc e;

        public final C0747Bc b() {
            return this.e;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof r) {
                r rVar = (r) obj;
                return C8632dsu.c((Object) this.d, (Object) rVar.d) && C8632dsu.c(this.e, rVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            C0747Bc c0747Bc = this.e;
            return "S1(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public r(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.d = str;
            this.e = c0747Bc;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m {
        private final String b;
        private final C0747Bc e;

        public final C0747Bc b() {
            return this.e;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return C8632dsu.c((Object) this.b, (Object) mVar.b) && C8632dsu.c(this.e, mVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            C0747Bc c0747Bc = this.e;
            return "M2(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public m(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.b = str;
            this.e = c0747Bc;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i {
        private final String c;
        private final C0747Bc d;

        public final String b() {
            return this.c;
        }

        public final C0747Bc e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.c, (Object) iVar.c) && C8632dsu.c(this.d, iVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            C0747Bc c0747Bc = this.d;
            return "L2(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public i(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.c = str;
            this.d = c0747Bc;
        }
    }

    /* loaded from: classes2.dex */
    public static final class w {
        private final C0747Bc a;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final C0747Bc e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof w) {
                w wVar = (w) obj;
                return C8632dsu.c((Object) this.d, (Object) wVar.d) && C8632dsu.c(this.a, wVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.d;
            C0747Bc c0747Bc = this.a;
            return "Xl2(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public w(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.d = str;
            this.a = c0747Bc;
        }
    }
}
