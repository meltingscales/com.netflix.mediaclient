package o;

import com.netflix.mediaclient.graphql.models.type.BillboardType;
import java.util.List;

/* renamed from: o.adq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2312adq implements InterfaceC9037hy {
    private final e a;
    private final List<d> b;
    private final String c;
    private final String d;
    private final a e;
    private final i f;
    private final f g;
    private final j h;
    private final String i;
    private final BillboardType j;
    private final g k;
    private final h m;
    private final s n;

    /* renamed from: o  reason: collision with root package name */
    private final n f13465o;

    public final e a() {
        return this.a;
    }

    public final List<d> b() {
        return this.b;
    }

    public final a c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final BillboardType e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2312adq) {
            C2312adq c2312adq = (C2312adq) obj;
            return C8632dsu.c((Object) this.c, (Object) c2312adq.c) && this.j == c2312adq.j && C8632dsu.c(this.b, c2312adq.b) && C8632dsu.c((Object) this.d, (Object) c2312adq.d) && C8632dsu.c((Object) this.i, (Object) c2312adq.i) && C8632dsu.c(this.f13465o, c2312adq.f13465o) && C8632dsu.c(this.a, c2312adq.a) && C8632dsu.c(this.e, c2312adq.e) && C8632dsu.c(this.f, c2312adq.f) && C8632dsu.c(this.n, c2312adq.n) && C8632dsu.c(this.k, c2312adq.k) && C8632dsu.c(this.g, c2312adq.g) && C8632dsu.c(this.m, c2312adq.m) && C8632dsu.c(this.h, c2312adq.h);
        }
        return false;
    }

    public final f f() {
        return this.g;
    }

    public final g g() {
        return this.k;
    }

    public final j h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        BillboardType billboardType = this.j;
        int hashCode2 = billboardType == null ? 0 : billboardType.hashCode();
        List<d> list = this.b;
        int hashCode3 = list == null ? 0 : list.hashCode();
        String str = this.d;
        int hashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.i;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        n nVar = this.f13465o;
        int hashCode6 = nVar == null ? 0 : nVar.hashCode();
        e eVar = this.a;
        int hashCode7 = eVar == null ? 0 : eVar.hashCode();
        a aVar = this.e;
        int hashCode8 = aVar == null ? 0 : aVar.hashCode();
        i iVar = this.f;
        int hashCode9 = iVar == null ? 0 : iVar.hashCode();
        s sVar = this.n;
        int hashCode10 = sVar == null ? 0 : sVar.hashCode();
        g gVar = this.k;
        int hashCode11 = gVar == null ? 0 : gVar.hashCode();
        f fVar = this.g;
        int hashCode12 = fVar == null ? 0 : fVar.hashCode();
        h hVar = this.m;
        int hashCode13 = hVar == null ? 0 : hVar.hashCode();
        j jVar = this.h;
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (jVar != null ? jVar.hashCode() : 0);
    }

    public final i i() {
        return this.f;
    }

    public final String j() {
        return this.i;
    }

    public final s k() {
        return this.n;
    }

    public final h l() {
        return this.m;
    }

    public final n n() {
        return this.f13465o;
    }

    public final String o() {
        return this.c;
    }

    public String toString() {
        String str = this.c;
        BillboardType billboardType = this.j;
        List<d> list = this.b;
        String str2 = this.d;
        String str3 = this.i;
        n nVar = this.f13465o;
        e eVar = this.a;
        a aVar = this.e;
        i iVar = this.f;
        s sVar = this.n;
        g gVar = this.k;
        f fVar = this.g;
        h hVar = this.m;
        j jVar = this.h;
        return "BillboardData(__typename=" + str + ", billboardType=" + billboardType + ", billboardCallsToAction=" + list + ", actionToken=" + str2 + ", impressionToken=" + str3 + ", node=" + nVar + ", billboardPromotedVideo=" + eVar + ", backgroundAsset=" + aVar + ", fallbackBackgroundAsset=" + iVar + ", storyArtAsset=" + sVar + ", logoAsset=" + gVar + ", horizontalLogoAsset=" + fVar + ", logoAssetForAwards=" + hVar + ", horizontalBackgroundAsset=" + jVar + ")";
    }

    public C2312adq(String str, BillboardType billboardType, List<d> list, String str2, String str3, n nVar, e eVar, a aVar, i iVar, s sVar, g gVar, f fVar, h hVar, j jVar) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.j = billboardType;
        this.b = list;
        this.d = str2;
        this.i = str3;
        this.f13465o = nVar;
        this.a = eVar;
        this.e = aVar;
        this.f = iVar;
        this.n = sVar;
        this.k = gVar;
        this.g = fVar;
        this.m = hVar;
        this.h = jVar;
    }

    /* renamed from: o.adq$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final Boolean a;
        private final String b;
        private final Boolean c;
        private final String d;
        private final String e;
        private final Integer g;

        public final Boolean a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public final Integer c() {
            return this.g;
        }

        public final Boolean d() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c(this.g, dVar.g) && C8632dsu.c(this.c, dVar.c) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public final String g() {
            return this.e;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.g;
            int hashCode4 = num == null ? 0 : num.hashCode();
            Boolean bool = this.c;
            int hashCode5 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.a;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.d;
            String str3 = this.b;
            Integer num = this.g;
            Boolean bool = this.c;
            Boolean bool2 = this.a;
            return "BillboardCallsToAction(__typename=" + str + ", name=" + str2 + ", type=" + str3 + ", videoId=" + num + ", suppressPostPlay=" + bool + ", ignoreBookmark=" + bool2 + ")";
        }

        public d(String str, String str2, String str3, Integer num, Boolean bool, Boolean bool2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = str2;
            this.b = str3;
            this.g = num;
            this.c = bool;
            this.a = bool2;
        }
    }

    /* renamed from: o.adq$n */
    /* loaded from: classes3.dex */
    public static final class n {
        private final p d;
        private final String e;

        public final String d() {
            return this.e;
        }

        public final p e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return C8632dsu.c((Object) this.e, (Object) nVar.e) && C8632dsu.c(this.d, nVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            p pVar = this.d;
            return (hashCode * 31) + (pVar == null ? 0 : pVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            p pVar = this.d;
            return "Node(__typename=" + str + ", reference=" + pVar + ")";
        }

        public n(String str, p pVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = pVar;
        }
    }

    /* renamed from: o.adq$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final l a;
        private final b b;
        private final m c;
        private final List<String> d;
        private final String e;
        private final int i;

        public final int a() {
            return this.i;
        }

        public final List<String> b() {
            return this.d;
        }

        public final m c() {
            return this.c;
        }

        public final b d() {
            return this.b;
        }

        public final l e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && this.i == eVar.i && C8632dsu.c(this.d, eVar.d) && C8632dsu.c(this.b, eVar.b) && C8632dsu.c(this.a, eVar.a) && C8632dsu.c(this.c, eVar.c);
            }
            return false;
        }

        public final String h() {
            return this.e;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = Integer.hashCode(this.i);
            List<String> list = this.d;
            int hashCode3 = list == null ? 0 : list.hashCode();
            b bVar = this.b;
            int hashCode4 = bVar == null ? 0 : bVar.hashCode();
            l lVar = this.a;
            int hashCode5 = lVar == null ? 0 : lVar.hashCode();
            m mVar = this.c;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (mVar != null ? mVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            int i = this.i;
            List<String> list = this.d;
            b bVar = this.b;
            l lVar = this.a;
            m mVar = this.c;
            return "BillboardPromotedVideo(__typename=" + str + ", videoId=" + i + ", badges=" + list + ", contextualSynopsis=" + bVar + ", onEpisode=" + lVar + ", onSeason=" + mVar + ")";
        }

        public e(String str, int i, List<String> list, b bVar, l lVar, m mVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.i = i;
            this.d = list;
            this.b = bVar;
            this.a = lVar;
            this.c = mVar;
        }
    }

    /* renamed from: o.adq$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final String b;
        private final Boolean c;
        private final String d;
        private final Integer e;
        private final Integer f;
        private final String g;
        private final String j;

        public final String a() {
            return this.j;
        }

        public final String b() {
            return this.d;
        }

        public final Boolean c() {
            return this.c;
        }

        public final Integer d() {
            return this.e;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c((Object) this.g, (Object) aVar.g) && C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.e, aVar.e) && C8632dsu.c(this.f, aVar.f) && C8632dsu.c((Object) this.j, (Object) aVar.j) && C8632dsu.c(this.c, aVar.c) && C8632dsu.c((Object) this.a, (Object) aVar.a);
            }
            return false;
        }

        public final String f() {
            return this.b;
        }

        public final String g() {
            return this.g;
        }

        public final Integer h() {
            return this.f;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.g;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.d;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.e;
            int hashCode4 = num == null ? 0 : num.hashCode();
            Integer num2 = this.f;
            int hashCode5 = num2 == null ? 0 : num2.hashCode();
            String str3 = this.j;
            int hashCode6 = str3 == null ? 0 : str3.hashCode();
            Boolean bool = this.c;
            int hashCode7 = bool == null ? 0 : bool.hashCode();
            String str4 = this.a;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.g;
            String str3 = this.d;
            Integer num = this.e;
            Integer num2 = this.f;
            String str4 = this.j;
            Boolean bool = this.c;
            String str5 = this.a;
            return "BackgroundAsset(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ", height=" + num + ", width=" + num2 + ", type=" + str4 + ", available=" + bool + ", dominantBackgroundColor=" + str5 + ")";
        }

        public a(String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, String str5) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.g = str2;
            this.d = str3;
            this.e = num;
            this.f = num2;
            this.j = str4;
            this.c = bool;
            this.a = str5;
        }
    }

    /* renamed from: o.adq$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final Integer a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final String f;
        private final Integer h;

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.f;
        }

        public final String c() {
            return this.e;
        }

        public final String d() {
            return this.b;
        }

        public final Integer e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.d, (Object) iVar.d) && C8632dsu.c((Object) this.f, (Object) iVar.f) && C8632dsu.c((Object) this.e, (Object) iVar.e) && C8632dsu.c(this.a, iVar.a) && C8632dsu.c(this.h, iVar.h) && C8632dsu.c((Object) this.b, (Object) iVar.b) && C8632dsu.c((Object) this.c, (Object) iVar.c);
            }
            return false;
        }

        public final Integer h() {
            return this.h;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.f;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.a;
            int hashCode4 = num == null ? 0 : num.hashCode();
            Integer num2 = this.h;
            int hashCode5 = num2 == null ? 0 : num2.hashCode();
            String str3 = this.b;
            int hashCode6 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.c;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public final String i() {
            return this.d;
        }

        public String toString() {
            String str = this.d;
            String str2 = this.f;
            String str3 = this.e;
            Integer num = this.a;
            Integer num2 = this.h;
            String str4 = this.b;
            String str5 = this.c;
            return "FallbackBackgroundAsset(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ", height=" + num + ", width=" + num2 + ", type=" + str4 + ", dominantBackgroundColor=" + str5 + ")";
        }

        public i(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.f = str2;
            this.e = str3;
            this.a = num;
            this.h = num2;
            this.b = str4;
            this.c = str5;
        }
    }

    /* renamed from: o.adq$s */
    /* loaded from: classes3.dex */
    public static final class s {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final Integer e;
        private final Integer f;
        private final String h;

        public final String a() {
            return this.h;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public final Integer e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof s) {
                s sVar = (s) obj;
                return C8632dsu.c((Object) this.b, (Object) sVar.b) && C8632dsu.c((Object) this.h, (Object) sVar.h) && C8632dsu.c((Object) this.a, (Object) sVar.a) && C8632dsu.c(this.e, sVar.e) && C8632dsu.c(this.f, sVar.f) && C8632dsu.c((Object) this.c, (Object) sVar.c) && C8632dsu.c((Object) this.d, (Object) sVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.h;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.e;
            int hashCode4 = num == null ? 0 : num.hashCode();
            Integer num2 = this.f;
            int hashCode5 = num2 == null ? 0 : num2.hashCode();
            String str3 = this.c;
            int hashCode6 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.d;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public final Integer i() {
            return this.f;
        }

        public final String j() {
            return this.b;
        }

        public String toString() {
            String str = this.b;
            String str2 = this.h;
            String str3 = this.a;
            Integer num = this.e;
            Integer num2 = this.f;
            String str4 = this.c;
            String str5 = this.d;
            return "StoryArtAsset(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ", height=" + num + ", width=" + num2 + ", type=" + str4 + ", dominantBackgroundColor=" + str5 + ")";
        }

        public s(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.h = str2;
            this.a = str3;
            this.e = num;
            this.f = num2;
            this.c = str4;
            this.d = str5;
        }
    }

    /* renamed from: o.adq$g */
    /* loaded from: classes3.dex */
    public static final class g {
        private final Integer a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final Integer f;

        public final String a() {
            return this.d;
        }

        public final Integer b() {
            return this.a;
        }

        public final String c() {
            return this.e;
        }

        public final String d() {
            return this.c;
        }

        public final Integer e() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.b, (Object) gVar.b) && C8632dsu.c((Object) this.c, (Object) gVar.c) && C8632dsu.c((Object) this.e, (Object) gVar.e) && C8632dsu.c(this.a, gVar.a) && C8632dsu.c(this.f, gVar.f) && C8632dsu.c((Object) this.d, (Object) gVar.d);
            }
            return false;
        }

        public final String h() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.a;
            int hashCode4 = num == null ? 0 : num.hashCode();
            Integer num2 = this.f;
            int hashCode5 = num2 == null ? 0 : num2.hashCode();
            String str3 = this.d;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.c;
            String str3 = this.e;
            Integer num = this.a;
            Integer num2 = this.f;
            String str4 = this.d;
            return "LogoAsset(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ", height=" + num + ", width=" + num2 + ", type=" + str4 + ")";
        }

        public g(String str, String str2, String str3, Integer num, Integer num2, String str4) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = str2;
            this.e = str3;
            this.a = num;
            this.f = num2;
            this.d = str4;
        }
    }

    /* renamed from: o.adq$f */
    /* loaded from: classes3.dex */
    public static final class f {
        private final String a;
        private final String b;
        private final Integer c;
        private final String d;
        private final String e;
        private final Integer f;

        public final Integer a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public final Integer c() {
            return this.f;
        }

        public final String d() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c((Object) this.e, (Object) fVar.e) && C8632dsu.c((Object) this.b, (Object) fVar.b) && C8632dsu.c((Object) this.a, (Object) fVar.a) && C8632dsu.c(this.c, fVar.c) && C8632dsu.c(this.f, fVar.f) && C8632dsu.c((Object) this.d, (Object) fVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.c;
            int hashCode4 = num == null ? 0 : num.hashCode();
            Integer num2 = this.f;
            int hashCode5 = num2 == null ? 0 : num2.hashCode();
            String str3 = this.d;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final String i() {
            return this.e;
        }

        public String toString() {
            String str = this.e;
            String str2 = this.b;
            String str3 = this.a;
            Integer num = this.c;
            Integer num2 = this.f;
            String str4 = this.d;
            return "HorizontalLogoAsset(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ", height=" + num + ", width=" + num2 + ", type=" + str4 + ")";
        }

        public f(String str, String str2, String str3, Integer num, Integer num2, String str4) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = str2;
            this.a = str3;
            this.c = num;
            this.f = num2;
            this.d = str4;
        }
    }

    /* renamed from: o.adq$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final String a;
        private final Boolean b;
        private final String c;
        private final String d;
        private final Integer e;
        private final String g;
        private final Integer i;

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.c;
        }

        public final Boolean c() {
            return this.b;
        }

        public final String d() {
            return this.g;
        }

        public final Integer e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.a, (Object) hVar.a) && C8632dsu.c((Object) this.g, (Object) hVar.g) && C8632dsu.c((Object) this.d, (Object) hVar.d) && C8632dsu.c(this.e, hVar.e) && C8632dsu.c(this.i, hVar.i) && C8632dsu.c((Object) this.c, (Object) hVar.c) && C8632dsu.c(this.b, hVar.b);
            }
            return false;
        }

        public final String f() {
            return this.a;
        }

        public final Integer g() {
            return this.i;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.g;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.d;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.e;
            int hashCode4 = num == null ? 0 : num.hashCode();
            Integer num2 = this.i;
            int hashCode5 = num2 == null ? 0 : num2.hashCode();
            String str3 = this.c;
            int hashCode6 = str3 == null ? 0 : str3.hashCode();
            Boolean bool = this.b;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.g;
            String str3 = this.d;
            Integer num = this.e;
            Integer num2 = this.i;
            String str4 = this.c;
            Boolean bool = this.b;
            return "LogoAssetForAwards(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ", height=" + num + ", width=" + num2 + ", type=" + str4 + ", available=" + bool + ")";
        }

        public h(String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.g = str2;
            this.d = str3;
            this.e = num;
            this.i = num2;
            this.c = str4;
            this.b = bool;
        }
    }

    /* renamed from: o.adq$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final Integer a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final Integer g;
        private final String i;

        public final String a() {
            return this.e;
        }

        public final String b() {
            return this.d;
        }

        public final Integer c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.c, (Object) jVar.c) && C8632dsu.c((Object) this.i, (Object) jVar.i) && C8632dsu.c((Object) this.b, (Object) jVar.b) && C8632dsu.c(this.a, jVar.a) && C8632dsu.c(this.g, jVar.g) && C8632dsu.c((Object) this.e, (Object) jVar.e) && C8632dsu.c((Object) this.d, (Object) jVar.d);
            }
            return false;
        }

        public final Integer f() {
            return this.g;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.i;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.a;
            int hashCode4 = num == null ? 0 : num.hashCode();
            Integer num2 = this.g;
            int hashCode5 = num2 == null ? 0 : num2.hashCode();
            String str3 = this.e;
            int hashCode6 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.d;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public final String j() {
            return this.c;
        }

        public String toString() {
            String str = this.c;
            String str2 = this.i;
            String str3 = this.b;
            Integer num = this.a;
            Integer num2 = this.g;
            String str4 = this.e;
            String str5 = this.d;
            return "HorizontalBackgroundAsset(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ", height=" + num + ", width=" + num2 + ", type=" + str4 + ", dominantBackgroundColor=" + str5 + ")";
        }

        public j(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.i = str2;
            this.b = str3;
            this.a = num;
            this.g = num2;
            this.e = str4;
            this.d = str5;
        }
    }

    /* renamed from: o.adq$p */
    /* loaded from: classes3.dex */
    public static final class p {
        private final C2383afH b;
        private final String d;
        private final k e;

        public final String b() {
            return this.d;
        }

        public final k c() {
            return this.e;
        }

        public final C2383afH d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                p pVar = (p) obj;
                return C8632dsu.c((Object) this.d, (Object) pVar.d) && C8632dsu.c(this.e, pVar.e) && C8632dsu.c(this.b, pVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            k kVar = this.e;
            int hashCode2 = kVar == null ? 0 : kVar.hashCode();
            C2383afH c2383afH = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (c2383afH != null ? c2383afH.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            k kVar = this.e;
            C2383afH c2383afH = this.b;
            return "Reference(__typename=" + str + ", onVideo=" + kVar + ", liveVideoData=" + c2383afH + ")";
        }

        public p(String str, k kVar, C2383afH c2383afH) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = kVar;
            this.b = c2383afH;
        }
    }

    /* renamed from: o.adq$k */
    /* loaded from: classes3.dex */
    public static final class k {
        private final String a;
        private final c b;
        private final o c;
        private final List<String> d;
        private final x e;
        private final C2630ajh f;
        private final int h;
        private final List<y> i;

        public final o a() {
            return this.c;
        }

        public final c b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final x d() {
            return this.e;
        }

        public final List<String> e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return this.h == kVar.h && C8632dsu.c(this.d, kVar.d) && C8632dsu.c(this.i, kVar.i) && C8632dsu.c(this.e, kVar.e) && C8632dsu.c((Object) this.a, (Object) kVar.a) && C8632dsu.c(this.b, kVar.b) && C8632dsu.c(this.c, kVar.c) && C8632dsu.c(this.f, kVar.f);
            }
            return false;
        }

        public final C2630ajh g() {
            return this.f;
        }

        public final List<y> h() {
            return this.i;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.h);
            List<String> list = this.d;
            int hashCode2 = list == null ? 0 : list.hashCode();
            List<y> list2 = this.i;
            int hashCode3 = list2 == null ? 0 : list2.hashCode();
            x xVar = this.e;
            int hashCode4 = xVar == null ? 0 : xVar.hashCode();
            String str = this.a;
            int hashCode5 = str == null ? 0 : str.hashCode();
            c cVar = this.b;
            int hashCode6 = cVar == null ? 0 : cVar.hashCode();
            o oVar = this.c;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (oVar != null ? oVar.hashCode() : 0)) * 31) + this.f.hashCode();
        }

        public final int i() {
            return this.h;
        }

        public String toString() {
            int i = this.h;
            List<String> list = this.d;
            List<y> list2 = this.i;
            x xVar = this.e;
            String str = this.a;
            c cVar = this.b;
            o oVar = this.c;
            C2630ajh c2630ajh = this.f;
            return "OnVideo(videoId=" + i + ", badges=" + list + ", tags=" + list2 + ", supplementalMessage=" + xVar + ", artworkForegroundColor=" + str + ", contextualSynopsis=" + cVar + ", onEpisode=" + oVar + ", videoSummary=" + c2630ajh + ")";
        }

        public k(int i, List<String> list, List<y> list2, x xVar, String str, c cVar, o oVar, C2630ajh c2630ajh) {
            C8632dsu.c((Object) c2630ajh, "");
            this.h = i;
            this.d = list;
            this.i = list2;
            this.e = xVar;
            this.a = str;
            this.b = cVar;
            this.c = oVar;
            this.f = c2630ajh;
        }
    }

    /* renamed from: o.adq$y */
    /* loaded from: classes3.dex */
    public static final class y {
        private final Boolean a;
        private final String c;
        private final String d;

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public final Boolean d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof y) {
                y yVar = (y) obj;
                return C8632dsu.c((Object) this.c, (Object) yVar.c) && C8632dsu.c((Object) this.d, (Object) yVar.d) && C8632dsu.c(this.a, yVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            Boolean bool = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.d;
            Boolean bool = this.a;
            return "Tag(__typename=" + str + ", displayName=" + str2 + ", isDisplayable=" + bool + ")";
        }

        public y(String str, String str2, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.d = str2;
            this.a = bool;
        }
    }

    /* renamed from: o.adq$x */
    /* loaded from: classes3.dex */
    public static final class x {
        private final String a;
        private final String d;
        private final String e;

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.d;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof x) {
                x xVar = (x) obj;
                return C8632dsu.c((Object) this.d, (Object) xVar.d) && C8632dsu.c((Object) this.e, (Object) xVar.e) && C8632dsu.c((Object) this.a, (Object) xVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.e;
            String str3 = this.a;
            return "SupplementalMessage(__typename=" + str + ", classification=" + str2 + ", tagline=" + str3 + ")";
        }

        public x(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = str2;
            this.a = str3;
        }
    }

    /* renamed from: o.adq$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final String b;
        private final String d;

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c((Object) this.a, (Object) cVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.d;
            String str3 = this.a;
            return "ContextualSynopsis(__typename=" + str + ", text=" + str2 + ", evidenceKey=" + str3 + ")";
        }

        public c(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = str2;
            this.a = str3;
        }
    }

    /* renamed from: o.adq$o */
    /* loaded from: classes3.dex */
    public static final class o {
        private final r a;

        public final r d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && C8632dsu.c(this.a, ((o) obj).a);
        }

        public int hashCode() {
            r rVar = this.a;
            if (rVar == null) {
                return 0;
            }
            return rVar.hashCode();
        }

        public String toString() {
            r rVar = this.a;
            return "OnEpisode(parentShow=" + rVar + ")";
        }

        public o(r rVar) {
            this.a = rVar;
        }
    }

    /* renamed from: o.adq$r */
    /* loaded from: classes3.dex */
    public static final class r {
        private final String a;
        private final String d;
        private final int e;

        public final int a() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof r) {
                r rVar = (r) obj;
                return C8632dsu.c((Object) this.d, (Object) rVar.d) && this.e == rVar.e && C8632dsu.c((Object) this.a, (Object) rVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = Integer.hashCode(this.e);
            String str = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.d;
            int i = this.e;
            String str2 = this.a;
            return "ParentShow(__typename=" + str + ", videoId=" + i + ", artworkForegroundColor=" + str2 + ")";
        }

        public r(String str, int i, String str2) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = i;
            this.a = str2;
        }
    }

    /* renamed from: o.adq$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final String b;
        private final String c;

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c((Object) this.c, (Object) bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            return "ContextualSynopsis1(__typename=" + str + ", text=" + str2 + ", evidenceKey=" + str3 + ")";
        }

        public b(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    /* renamed from: o.adq$l */
    /* loaded from: classes3.dex */
    public static final class l {
        private final t a;

        public final t c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && C8632dsu.c(this.a, ((l) obj).a);
        }

        public int hashCode() {
            t tVar = this.a;
            if (tVar == null) {
                return 0;
            }
            return tVar.hashCode();
        }

        public String toString() {
            t tVar = this.a;
            return "OnEpisode1(parentSeason=" + tVar + ")";
        }

        public l(t tVar) {
            this.a = tVar;
        }
    }

    /* renamed from: o.adq$t */
    /* loaded from: classes3.dex */
    public static final class t {
        private final int a;
        private final String c;
        private final String d;

        public final int b() {
            return this.a;
        }

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof t) {
                t tVar = (t) obj;
                return C8632dsu.c((Object) this.c, (Object) tVar.c) && this.a == tVar.a && C8632dsu.c((Object) this.d, (Object) tVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = Integer.hashCode(this.a);
            String str = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.c;
            int i = this.a;
            String str2 = this.d;
            return "ParentSeason(__typename=" + str + ", videoId=" + i + ", title=" + str2 + ")";
        }

        public t(String str, int i, String str2) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = i;
            this.d = str2;
        }
    }

    /* renamed from: o.adq$m */
    /* loaded from: classes3.dex */
    public static final class m {
        private final q b;

        public final q a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && C8632dsu.c(this.b, ((m) obj).b);
        }

        public int hashCode() {
            q qVar = this.b;
            if (qVar == null) {
                return 0;
            }
            return qVar.hashCode();
        }

        public String toString() {
            q qVar = this.b;
            return "OnSeason(parentShow=" + qVar + ")";
        }

        public m(q qVar) {
            this.b = qVar;
        }
    }

    /* renamed from: o.adq$q */
    /* loaded from: classes3.dex */
    public static final class q {
        private final int a;
        private final String b;
        private final String e;

        public final int c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                q qVar = (q) obj;
                return C8632dsu.c((Object) this.b, (Object) qVar.b) && this.a == qVar.a && C8632dsu.c((Object) this.e, (Object) qVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = Integer.hashCode(this.a);
            String str = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.b;
            int i = this.a;
            String str2 = this.e;
            return "ParentShow1(__typename=" + str + ", videoId=" + i + ", title=" + str2 + ")";
        }

        public q(String str, int i, String str2) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = i;
            this.e = str2;
        }
    }
}
