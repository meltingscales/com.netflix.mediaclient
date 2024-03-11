package o;

import java.util.List;

/* renamed from: o.agz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2489agz implements InterfaceC9037hy {
    private final c a;
    private final C2475agl c;
    private final String d;

    public final String b() {
        return this.d;
    }

    public final C2475agl d() {
        return this.c;
    }

    public final c e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2489agz) {
            C2489agz c2489agz = (C2489agz) obj;
            return C8632dsu.c((Object) this.d, (Object) c2489agz.d) && C8632dsu.c(this.a, c2489agz.a) && C8632dsu.c(this.c, c2489agz.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        c cVar = this.a;
        return (((hashCode * 31) + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.d;
        c cVar = this.a;
        C2475agl c2475agl = this.c;
        return "LolomoIPBasedGamesRow(__typename=" + str + ", ipBasedGameEntities=" + cVar + ", lolomoGameRow=" + c2475agl + ")";
    }

    public C2489agz(String str, c cVar, C2475agl c2475agl) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2475agl, "");
        this.d = str;
        this.a = cVar;
        this.c = c2475agl;
    }

    /* renamed from: o.agz$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final List<b> a;
        private final String d;

        public final List<b> b() {
            return this.a;
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
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            List<b> list = this.a;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.d;
            List<b> list = this.a;
            return "IpBasedGameEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public c(String str, List<b> list) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = list;
        }
    }

    /* renamed from: o.agz$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final d a;
        private final String c;
        private final e d;
        private final a e;

        public final a a() {
            return this.e;
        }

        public final String b() {
            return this.c;
        }

        public final e c() {
            return this.d;
        }

        public final d e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.e, bVar.e) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            e eVar = this.d;
            int hashCode2 = eVar == null ? 0 : eVar.hashCode();
            a aVar = this.e;
            int hashCode3 = aVar == null ? 0 : aVar.hashCode();
            d dVar = this.a;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            e eVar = this.d;
            a aVar = this.e;
            d dVar = this.a;
            return "Edge(__typename=" + str + ", node=" + eVar + ", bannerArtwork=" + aVar + ", logoArtwork=" + dVar + ")";
        }

        public b(String str, e eVar, a aVar, d dVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.d = eVar;
            this.e = aVar;
            this.a = dVar;
        }
    }

    /* renamed from: o.agz$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final i d;

        public final i a() {
            return this.d;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            i iVar = this.d;
            return (hashCode * 31) + (iVar == null ? 0 : iVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            i iVar = this.d;
            return "Node(__typename=" + str + ", reference=" + iVar + ")";
        }

        public e(String str, i iVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = iVar;
        }
    }

    /* renamed from: o.agz$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final C2347aeY a;
        private final String b;
        private final C2340aeR c;
        private final C2339aeQ e;

        public final String a() {
            return this.b;
        }

        public final C2339aeQ b() {
            return this.e;
        }

        public final C2340aeR c() {
            return this.c;
        }

        public final C2347aeY d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.b, (Object) iVar.b) && C8632dsu.c(this.e, iVar.e) && C8632dsu.c(this.a, iVar.a) && C8632dsu.c(this.c, iVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            C2339aeQ c2339aeQ = this.e;
            int hashCode2 = c2339aeQ == null ? 0 : c2339aeQ.hashCode();
            C2347aeY c2347aeY = this.a;
            int hashCode3 = c2347aeY == null ? 0 : c2347aeY.hashCode();
            C2340aeR c2340aeR = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (c2340aeR != null ? c2340aeR.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            C2339aeQ c2339aeQ = this.e;
            C2347aeY c2347aeY = this.a;
            C2340aeR c2340aeR = this.c;
            return "Reference(__typename=" + str + ", gameInQueue=" + c2339aeQ + ", gameTrailer=" + c2347aeY + ", gameInstallationInfo=" + c2340aeR + ")";
        }

        public i(String str, C2339aeQ c2339aeQ, C2347aeY c2347aeY, C2340aeR c2340aeR) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = c2339aeQ;
            this.a = c2347aeY;
            this.c = c2340aeR;
        }
    }

    /* renamed from: o.agz$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String d;
        private final String e;

        public final String c() {
            return this.e;
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
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c((Object) this.e, (Object) aVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.e;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.d;
            String str2 = this.e;
            return "BannerArtwork(__typename=" + str + ", url=" + str2 + ")";
        }

        public a(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = str2;
        }
    }

    /* renamed from: o.agz$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final String d;

        public final String d() {
            return this.a;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c((Object) this.d, (Object) dVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.d;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.a;
            String str2 = this.d;
            return "LogoArtwork(__typename=" + str + ", url=" + str2 + ")";
        }

        public d(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = str2;
        }
    }
}
