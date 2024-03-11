package o;

import java.util.List;

/* renamed from: o.agN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2451agN implements InterfaceC9037hy {
    private final C2529ahm a;
    private final f c;
    private final String e;

    public final C2529ahm a() {
        return this.a;
    }

    public final f b() {
        return this.c;
    }

    public final String d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2451agN) {
            C2451agN c2451agN = (C2451agN) obj;
            return C8632dsu.c((Object) this.e, (Object) c2451agN.e) && C8632dsu.c(this.c, c2451agN.c) && C8632dsu.c(this.a, c2451agN.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        f fVar = this.c;
        return (((hashCode * 31) + (fVar == null ? 0 : fVar.hashCode())) * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.e;
        f fVar = this.c;
        C2529ahm c2529ahm = this.a;
        return "LolomoRecentlyWatchedRow(__typename=" + str + ", recentlyWatchedEntities=" + fVar + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2451agN(String str, f fVar, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.e = str;
        this.c = fVar;
        this.a = c2529ahm;
    }

    /* renamed from: o.agN$f */
    /* loaded from: classes3.dex */
    public static final class f {
        private final String b;
        private final List<d> d;

        public final String b() {
            return this.b;
        }

        public final List<d> c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c((Object) this.b, (Object) fVar.b) && C8632dsu.c(this.d, fVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            List<d> list = this.d;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.b;
            List<d> list = this.d;
            return "RecentlyWatchedEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public f(String str, List<d> list) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = list;
        }
    }

    /* renamed from: o.agN$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final a c;
        private final String d;

        public final String d() {
            return this.d;
        }

        public final a e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            a aVar = this.c;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            a aVar = this.c;
            return "Edge(__typename=" + str + ", node=" + aVar + ")";
        }

        public d(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = aVar;
        }
    }

    /* renamed from: o.agN$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final g b;
        private final String e;

        public final g d() {
            return this.b;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            g gVar = this.b;
            return (hashCode * 31) + (gVar == null ? 0 : gVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            g gVar = this.b;
            return "Node(__typename=" + str + ", reference=" + gVar + ")";
        }

        public a(String str, g gVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = gVar;
        }
    }

    /* renamed from: o.agN$g */
    /* loaded from: classes3.dex */
    public static final class g {
        private final e b;
        private final String d;
        private final b e;

        public final e b() {
            return this.b;
        }

        public final String d() {
            return this.d;
        }

        public final b e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.d, (Object) gVar.d) && C8632dsu.c(this.e, gVar.e) && C8632dsu.c(this.b, gVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            b bVar = this.e;
            int hashCode2 = bVar == null ? 0 : bVar.hashCode();
            e eVar = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (eVar != null ? eVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            b bVar = this.e;
            e eVar = this.b;
            return "Reference(__typename=" + str + ", onEpisode=" + bVar + ", onVideo=" + eVar + ")";
        }

        public g(String str, b bVar, e eVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = bVar;
            this.b = eVar;
        }
    }

    /* renamed from: o.agN$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final Integer a;
        private final i b;
        private final Boolean c;
        private final h d;
        private final int e;

        public final Boolean a() {
            return this.c;
        }

        public final int b() {
            return this.e;
        }

        public final h c() {
            return this.d;
        }

        public final i d() {
            return this.b;
        }

        public final Integer e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.e == bVar.e && C8632dsu.c(this.a, bVar.a) && C8632dsu.c(this.c, bVar.c) && C8632dsu.c(this.b, bVar.b) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.e);
            Integer num = this.a;
            int hashCode2 = num == null ? 0 : num.hashCode();
            Boolean bool = this.c;
            int hashCode3 = bool == null ? 0 : bool.hashCode();
            i iVar = this.b;
            int hashCode4 = iVar == null ? 0 : iVar.hashCode();
            h hVar = this.d;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (hVar != null ? hVar.hashCode() : 0);
        }

        public String toString() {
            int i = this.e;
            Integer num = this.a;
            Boolean bool = this.c;
            i iVar = this.b;
            h hVar = this.d;
            return "OnEpisode(videoId=" + i + ", number=" + num + ", hiddenEpisodeNumbers=" + bool + ", parentSeason=" + iVar + ", parentShow=" + hVar + ")";
        }

        public b(int i, Integer num, Boolean bool, i iVar, h hVar) {
            this.e = i;
            this.a = num;
            this.c = bool;
            this.b = iVar;
            this.d = hVar;
        }
    }

    /* renamed from: o.agN$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final int a;
        private final Integer b;
        private final String d;
        private final String e;

        public final Integer a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final String c() {
            return this.d;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.e, (Object) iVar.e) && this.a == iVar.a && C8632dsu.c(this.b, iVar.b) && C8632dsu.c((Object) this.d, (Object) iVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = Integer.hashCode(this.a);
            Integer num = this.b;
            int hashCode3 = num == null ? 0 : num.hashCode();
            String str = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            int i = this.a;
            Integer num = this.b;
            String str2 = this.d;
            return "ParentSeason(__typename=" + str + ", videoId=" + i + ", number=" + num + ", numberLabelV2=" + str2 + ")";
        }

        public i(String str, int i, Integer num, String str2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = i;
            this.b = num;
            this.d = str2;
        }
    }

    /* renamed from: o.agN$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final String b;
        private final C2630ajh d;

        public final C2630ajh b() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.b, (Object) hVar.b) && C8632dsu.c(this.d, hVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.b;
            C2630ajh c2630ajh = this.d;
            return "ParentShow(__typename=" + str + ", videoSummary=" + c2630ajh + ")";
        }

        public h(String str, C2630ajh c2630ajh) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2630ajh, "");
            this.b = str;
            this.d = c2630ajh;
        }
    }

    /* renamed from: o.agN$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final c b;
        private final int c;
        private final j e;

        public final c a() {
            return this.b;
        }

        public final j b() {
            return this.e;
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
                return this.c == eVar.c && C8632dsu.c(this.b, eVar.b) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.c);
            c cVar = this.b;
            int hashCode2 = cVar == null ? 0 : cVar.hashCode();
            j jVar = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (jVar != null ? jVar.hashCode() : 0);
        }

        public String toString() {
            int i = this.c;
            c cVar = this.b;
            j jVar = this.e;
            return "OnVideo(videoId=" + i + ", artwork=" + cVar + ", titleTreatment=" + jVar + ")";
        }

        public e(int i, c cVar, j jVar) {
            this.c = i;
            this.b = cVar;
            this.e = jVar;
        }
    }

    /* renamed from: o.agN$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final String c;
        private final String e;

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.e;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c((Object) this.a, (Object) cVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.e;
            String str3 = this.a;
            return "Artwork(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public c(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = str2;
            this.a = str3;
        }
    }

    /* renamed from: o.agN$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final String a;
        private final String d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final String b() {
            return this.d;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.e, (Object) jVar.e) && C8632dsu.c((Object) this.d, (Object) jVar.d) && C8632dsu.c((Object) this.a, (Object) jVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.d;
            String str3 = this.a;
            return "TitleTreatment(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public j(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = str2;
            this.a = str3;
        }
    }
}
