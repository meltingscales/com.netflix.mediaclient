package o;

import com.netflix.mediaclient.graphql.models.type.SubtitleColor;
import com.netflix.mediaclient.graphql.models.type.SubtitleEdgeAttribute;
import com.netflix.mediaclient.graphql.models.type.SubtitleFontStyle;
import com.netflix.mediaclient.graphql.models.type.SubtitleOpacity;
import com.netflix.mediaclient.graphql.models.type.SubtitleSize;
import java.util.List;

/* renamed from: o.aiX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2567aiX implements InterfaceC9037hy {
    private final String a;
    private final a b;
    private final String c;
    private final Boolean d;
    private final b e;
    private final Boolean f;
    private final Boolean g;
    private final Boolean h;
    private final Boolean i;
    private final Boolean j;
    private final h k;
    private final e l;
    private final String m;
    private final Boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13470o;
    private final List<f> p;
    private final i q;
    private final String s;
    private final List<String> t;

    public final a a() {
        return this.b;
    }

    public final b b() {
        return this.e;
    }

    public final String c() {
        return this.f13470o;
    }

    public final e d() {
        return this.l;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2567aiX) {
            C2567aiX c2567aiX = (C2567aiX) obj;
            return C8632dsu.c((Object) this.a, (Object) c2567aiX.a) && C8632dsu.c((Object) this.c, (Object) c2567aiX.c) && C8632dsu.c(this.e, c2567aiX.e) && C8632dsu.c(this.d, c2567aiX.d) && C8632dsu.c(this.h, c2567aiX.h) && C8632dsu.c(this.f, c2567aiX.f) && C8632dsu.c(this.i, c2567aiX.i) && C8632dsu.c(this.g, c2567aiX.g) && C8632dsu.c(this.j, c2567aiX.j) && C8632dsu.c(this.n, c2567aiX.n) && C8632dsu.c((Object) this.f13470o, (Object) c2567aiX.f13470o) && C8632dsu.c(this.l, c2567aiX.l) && C8632dsu.c((Object) this.m, (Object) c2567aiX.m) && C8632dsu.c(this.k, c2567aiX.k) && C8632dsu.c((Object) this.s, (Object) c2567aiX.s) && C8632dsu.c(this.t, c2567aiX.t) && C8632dsu.c(this.p, c2567aiX.p) && C8632dsu.c(this.q, c2567aiX.q) && C8632dsu.c(this.b, c2567aiX.b);
        }
        return false;
    }

    public final List<String> f() {
        return this.t;
    }

    public final i g() {
        return this.q;
    }

    public final String h() {
        return this.m;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.c.hashCode();
        b bVar = this.e;
        int hashCode3 = bVar == null ? 0 : bVar.hashCode();
        Boolean bool = this.d;
        int hashCode4 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.h;
        int hashCode5 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.f;
        int hashCode6 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.i;
        int hashCode7 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.g;
        int hashCode8 = bool5 == null ? 0 : bool5.hashCode();
        Boolean bool6 = this.j;
        int hashCode9 = bool6 == null ? 0 : bool6.hashCode();
        Boolean bool7 = this.n;
        int hashCode10 = bool7 == null ? 0 : bool7.hashCode();
        String str = this.f13470o;
        int hashCode11 = str == null ? 0 : str.hashCode();
        e eVar = this.l;
        int hashCode12 = eVar == null ? 0 : eVar.hashCode();
        String str2 = this.m;
        int hashCode13 = str2 == null ? 0 : str2.hashCode();
        h hVar = this.k;
        int hashCode14 = hVar == null ? 0 : hVar.hashCode();
        String str3 = this.s;
        int hashCode15 = str3 == null ? 0 : str3.hashCode();
        List<String> list = this.t;
        int hashCode16 = list == null ? 0 : list.hashCode();
        List<f> list2 = this.p;
        int hashCode17 = list2 == null ? 0 : list2.hashCode();
        i iVar = this.q;
        int hashCode18 = iVar == null ? 0 : iVar.hashCode();
        a aVar = this.b;
        return (((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String i() {
        return this.s;
    }

    public final h j() {
        return this.k;
    }

    public final String k() {
        return this.a;
    }

    public final List<f> l() {
        return this.p;
    }

    public final Boolean m() {
        return this.f;
    }

    public final Boolean n() {
        return this.d;
    }

    public final Boolean o() {
        return this.h;
    }

    public final Boolean p() {
        return this.i;
    }

    public final Boolean r() {
        return this.j;
    }

    public final Boolean s() {
        return this.n;
    }

    public final Boolean t() {
        return this.g;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.c;
        b bVar = this.e;
        Boolean bool = this.d;
        Boolean bool2 = this.h;
        Boolean bool3 = this.f;
        Boolean bool4 = this.i;
        Boolean bool5 = this.g;
        Boolean bool6 = this.j;
        Boolean bool7 = this.n;
        String str3 = this.f13470o;
        e eVar = this.l;
        String str4 = this.m;
        h hVar = this.k;
        String str5 = this.s;
        List<String> list = this.t;
        List<f> list2 = this.p;
        i iVar = this.q;
        a aVar = this.b;
        return "UserProfile(__typename=" + str + ", guid=" + str2 + ", avatar=" + bVar + ", isAccountOwner=" + bool + ", isAutoStartEnabled=" + bool2 + ", isDefaultKidsProfile=" + bool3 + ", isKids=" + bool4 + ", isPinLocked=" + bool5 + ", isProfileCreationLocked=" + bool6 + ", isVideoMerchEnabled=" + bool7 + ", lockPin=" + str3 + ", maturityRating=" + eVar + ", name=" + str4 + ", personalData=" + hVar + ", primaryLanguage=" + str5 + ", secondaryLanguages=" + list + ", suggestedLocales=" + list2 + ", subtitleSettings=" + iVar + ", firstProtectedVideos=" + aVar + ")";
    }

    public C2567aiX(String str, String str2, b bVar, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str3, e eVar, String str4, h hVar, String str5, List<String> list, List<f> list2, i iVar, a aVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.a = str;
        this.c = str2;
        this.e = bVar;
        this.d = bool;
        this.h = bool2;
        this.f = bool3;
        this.i = bool4;
        this.g = bool5;
        this.j = bool6;
        this.n = bool7;
        this.f13470o = str3;
        this.l = eVar;
        this.m = str4;
        this.k = hVar;
        this.s = str5;
        this.t = list;
        this.p = list2;
        this.q = iVar;
        this.b = aVar;
    }

    /* renamed from: o.aiX$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final String c;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final String b() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c((Object) this.e, (Object) bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.c;
            String str3 = this.e;
            return "Avatar(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public b(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = str2;
            this.e = str3;
        }
    }

    /* renamed from: o.aiX$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final Boolean a;
        private final Integer b;
        private final List<String> c;
        private final Boolean d;
        private final String e;

        public final List<String> a() {
            return this.c;
        }

        public final String b() {
            return this.e;
        }

        public final Boolean c() {
            return this.d;
        }

        public final Integer d() {
            return this.b;
        }

        public final Boolean e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c(this.a, eVar.a) && C8632dsu.c(this.d, eVar.d) && C8632dsu.c(this.c, eVar.c) && C8632dsu.c(this.b, eVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            Boolean bool = this.a;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.d;
            int hashCode3 = bool2 == null ? 0 : bool2.hashCode();
            List<String> list = this.c;
            int hashCode4 = list == null ? 0 : list.hashCode();
            Integer num = this.b;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            Boolean bool = this.a;
            Boolean bool2 = this.d;
            List<String> list = this.c;
            Integer num = this.b;
            return "MaturityRating(__typename=" + str + ", isHighest=" + bool + ", isLowest=" + bool2 + ", labels=" + list + ", value=" + num + ")";
        }

        public e(String str, Boolean bool, Boolean bool2, List<String> list, Integer num) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = bool;
            this.d = bool2;
            this.c = list;
            this.b = num;
        }
    }

    /* renamed from: o.aiX$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final String a;
        private final String b;

        public final String c() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.b, (Object) hVar.b) && C8632dsu.c((Object) this.a, (Object) hVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.a;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.b;
            String str2 = this.a;
            return "PersonalData(__typename=" + str + ", email=" + str2 + ")";
        }

        public h(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = str2;
        }
    }

    /* renamed from: o.aiX$f */
    /* loaded from: classes3.dex */
    public static final class f {
        private final String a;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c((Object) this.d, (Object) fVar.d) && C8632dsu.c((Object) this.a, (Object) fVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.a;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.d;
            String str2 = this.a;
            return "SuggestedLocale(__typename=" + str + ", id=" + str2 + ")";
        }

        public f(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = str2;
        }
    }

    /* renamed from: o.aiX$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final SubtitleOpacity a;
        private final SubtitleColor b;
        private final SubtitleColor c;
        private final SubtitleEdgeAttribute d;
        private final String e;
        private final SubtitleFontStyle f;
        private final SubtitleColor g;
        private final SubtitleSize h;
        private final SubtitleOpacity i;
        private final SubtitleColor j;
        private final SubtitleOpacity k;

        public final SubtitleOpacity a() {
            return this.a;
        }

        public final SubtitleEdgeAttribute b() {
            return this.d;
        }

        public final SubtitleColor c() {
            return this.c;
        }

        public final SubtitleColor d() {
            return this.b;
        }

        public final SubtitleColor e() {
            return this.g;
        }

        public final i e(String str, SubtitleColor subtitleColor, SubtitleOpacity subtitleOpacity, SubtitleColor subtitleColor2, SubtitleEdgeAttribute subtitleEdgeAttribute, SubtitleColor subtitleColor3, SubtitleOpacity subtitleOpacity2, SubtitleSize subtitleSize, SubtitleFontStyle subtitleFontStyle, SubtitleColor subtitleColor4, SubtitleOpacity subtitleOpacity3) {
            C8632dsu.c((Object) str, "");
            return new i(str, subtitleColor, subtitleOpacity, subtitleColor2, subtitleEdgeAttribute, subtitleColor3, subtitleOpacity2, subtitleSize, subtitleFontStyle, subtitleColor4, subtitleOpacity3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.e, (Object) iVar.e) && this.c == iVar.c && this.a == iVar.a && this.b == iVar.b && this.d == iVar.d && this.g == iVar.g && this.i == iVar.i && this.h == iVar.h && this.f == iVar.f && this.j == iVar.j && this.k == iVar.k;
            }
            return false;
        }

        public final SubtitleOpacity f() {
            return this.k;
        }

        public final SubtitleFontStyle g() {
            return this.f;
        }

        public final SubtitleOpacity h() {
            return this.i;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            SubtitleColor subtitleColor = this.c;
            int hashCode2 = subtitleColor == null ? 0 : subtitleColor.hashCode();
            SubtitleOpacity subtitleOpacity = this.a;
            int hashCode3 = subtitleOpacity == null ? 0 : subtitleOpacity.hashCode();
            SubtitleColor subtitleColor2 = this.b;
            int hashCode4 = subtitleColor2 == null ? 0 : subtitleColor2.hashCode();
            SubtitleEdgeAttribute subtitleEdgeAttribute = this.d;
            int hashCode5 = subtitleEdgeAttribute == null ? 0 : subtitleEdgeAttribute.hashCode();
            SubtitleColor subtitleColor3 = this.g;
            int hashCode6 = subtitleColor3 == null ? 0 : subtitleColor3.hashCode();
            SubtitleOpacity subtitleOpacity2 = this.i;
            int hashCode7 = subtitleOpacity2 == null ? 0 : subtitleOpacity2.hashCode();
            SubtitleSize subtitleSize = this.h;
            int hashCode8 = subtitleSize == null ? 0 : subtitleSize.hashCode();
            SubtitleFontStyle subtitleFontStyle = this.f;
            int hashCode9 = subtitleFontStyle == null ? 0 : subtitleFontStyle.hashCode();
            SubtitleColor subtitleColor4 = this.j;
            int hashCode10 = subtitleColor4 == null ? 0 : subtitleColor4.hashCode();
            SubtitleOpacity subtitleOpacity3 = this.k;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (subtitleOpacity3 != null ? subtitleOpacity3.hashCode() : 0);
        }

        public final SubtitleColor i() {
            return this.j;
        }

        public final SubtitleSize j() {
            return this.h;
        }

        public final String k() {
            return this.e;
        }

        public String toString() {
            String str = this.e;
            SubtitleColor subtitleColor = this.c;
            SubtitleOpacity subtitleOpacity = this.a;
            SubtitleColor subtitleColor2 = this.b;
            SubtitleEdgeAttribute subtitleEdgeAttribute = this.d;
            SubtitleColor subtitleColor3 = this.g;
            SubtitleOpacity subtitleOpacity2 = this.i;
            SubtitleSize subtitleSize = this.h;
            SubtitleFontStyle subtitleFontStyle = this.f;
            SubtitleColor subtitleColor4 = this.j;
            SubtitleOpacity subtitleOpacity3 = this.k;
            return "SubtitleSettings(__typename=" + str + ", backgroundColor=" + subtitleColor + ", backgroundOpacity=" + subtitleOpacity + ", charColor=" + subtitleColor2 + ", charEdgeAttribute=" + subtitleEdgeAttribute + ", charEdgeColor=" + subtitleColor3 + ", charOpacity=" + subtitleOpacity2 + ", charSize=" + subtitleSize + ", charStyle=" + subtitleFontStyle + ", windowColor=" + subtitleColor4 + ", windowOpacity=" + subtitleOpacity3 + ")";
        }

        public i(String str, SubtitleColor subtitleColor, SubtitleOpacity subtitleOpacity, SubtitleColor subtitleColor2, SubtitleEdgeAttribute subtitleEdgeAttribute, SubtitleColor subtitleColor3, SubtitleOpacity subtitleOpacity2, SubtitleSize subtitleSize, SubtitleFontStyle subtitleFontStyle, SubtitleColor subtitleColor4, SubtitleOpacity subtitleOpacity3) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = subtitleColor;
            this.a = subtitleOpacity;
            this.b = subtitleColor2;
            this.d = subtitleEdgeAttribute;
            this.g = subtitleColor3;
            this.i = subtitleOpacity2;
            this.h = subtitleSize;
            this.f = subtitleFontStyle;
            this.j = subtitleColor4;
            this.k = subtitleOpacity3;
        }
    }

    /* renamed from: o.aiX$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final List<c> a;
        private final String d;

        public final List<c> a() {
            return this.a;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            List<c> list = this.a;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.d;
            List<c> list = this.a;
            return "FirstProtectedVideos(__typename=" + str + ", edges=" + list + ")";
        }

        public a(String str, List<c> list) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = list;
        }
    }

    /* renamed from: o.aiX$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final d e;

        public final d b() {
            return this.e;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            d dVar = this.e;
            return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            d dVar = this.e;
            return "Edge(__typename=" + str + ", node=" + dVar + ")";
        }

        public c(String str, d dVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = dVar;
        }
    }

    /* renamed from: o.aiX$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final int a;
        private final String b;

        public final int a() {
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
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && this.a == dVar.a;
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + Integer.hashCode(this.a);
        }

        public String toString() {
            String str = this.b;
            int i = this.a;
            return "Node(__typename=" + str + ", videoId=" + i + ")";
        }

        public d(String str, int i) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = i;
        }
    }
}
