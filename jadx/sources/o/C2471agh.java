package o;

import java.util.List;

/* renamed from: o.agh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2471agh implements InterfaceC9037hy {
    private final String c;
    private final C2475agl d;
    private final a e;

    public final String a() {
        return this.c;
    }

    public final a d() {
        return this.e;
    }

    public final C2475agl e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2471agh) {
            C2471agh c2471agh = (C2471agh) obj;
            return C8632dsu.c((Object) this.c, (Object) c2471agh.c) && C8632dsu.c(this.e, c2471agh.e) && C8632dsu.c(this.d, c2471agh.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        a aVar = this.e;
        return (((hashCode * 31) + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.c;
        a aVar = this.e;
        C2475agl c2475agl = this.d;
        return "LolomoGamesBillboardRow(__typename=" + str + ", gameBillboardEntities=" + aVar + ", lolomoGameRow=" + c2475agl + ")";
    }

    public C2471agh(String str, a aVar, C2475agl c2475agl) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2475agl, "");
        this.c = str;
        this.e = aVar;
        this.d = c2475agl;
    }

    /* renamed from: o.agh$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final List<c> e;

        public final List<c> b() {
            return this.e;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            List<c> list = this.e;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.a;
            List<c> list = this.e;
            return "GameBillboardEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public a(String str, List<c> list) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = list;
        }
    }

    /* renamed from: o.agh$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final String b;
        private final e c;

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final e e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c(this.c, cVar.c) && C8632dsu.c((Object) this.b, (Object) cVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            e eVar = this.c;
            int hashCode2 = eVar == null ? 0 : eVar.hashCode();
            String str = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            e eVar = this.c;
            String str2 = this.b;
            return "Edge(__typename=" + str + ", node=" + eVar + ", impressionToken=" + str2 + ")";
        }

        public c(String str, e eVar, String str2) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = eVar;
            this.b = str2;
        }
    }

    /* renamed from: o.agh$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String c;
        private final d e;

        public final String a() {
            return this.c;
        }

        public final d c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            d dVar = this.e;
            return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            d dVar = this.e;
            return "Node(__typename=" + str + ", reference=" + dVar + ")";
        }

        public e(String str, d dVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = dVar;
        }
    }

    /* renamed from: o.agh$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final b a;
        private final C2340aeR b;
        private final C2347aeY c;
        private final String d;
        private final C2335aeM e;

        public final C2347aeY a() {
            return this.c;
        }

        public final C2335aeM b() {
            return this.e;
        }

        public final b c() {
            return this.a;
        }

        public final C2340aeR d() {
            return this.b;
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
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.a, dVar.a) && C8632dsu.c(this.e, dVar.e) && C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            b bVar = this.a;
            int hashCode2 = bVar == null ? 0 : bVar.hashCode();
            C2335aeM c2335aeM = this.e;
            int hashCode3 = c2335aeM == null ? 0 : c2335aeM.hashCode();
            C2340aeR c2340aeR = this.b;
            int hashCode4 = c2340aeR == null ? 0 : c2340aeR.hashCode();
            C2347aeY c2347aeY = this.c;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (c2347aeY != null ? c2347aeY.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            b bVar = this.a;
            C2335aeM c2335aeM = this.e;
            C2340aeR c2340aeR = this.b;
            C2347aeY c2347aeY = this.c;
            return "Reference(__typename=" + str + ", onGame=" + bVar + ", gameBillboard=" + c2335aeM + ", gameInstallationInfo=" + c2340aeR + ", gameTrailer=" + c2347aeY + ")";
        }

        public d(String str, b bVar, C2335aeM c2335aeM, C2340aeR c2340aeR, C2347aeY c2347aeY) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = bVar;
            this.e = c2335aeM;
            this.b = c2340aeR;
            this.c = c2347aeY;
        }
    }

    /* renamed from: o.agh$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final List<h> a;
        private final int c;
        private final Boolean d;

        public final List<h> b() {
            return this.a;
        }

        public final Boolean c() {
            return this.d;
        }

        public final int e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.c == bVar.c && C8632dsu.c(this.a, bVar.a) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.c);
            List<h> list = this.a;
            int hashCode2 = list == null ? 0 : list.hashCode();
            Boolean bool = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            int i = this.c;
            List<h> list = this.a;
            Boolean bool = this.d;
            return "OnGame(gameId=" + i + ", tags=" + list + ", isInPlaylist=" + bool + ")";
        }

        public b(int i, List<h> list, Boolean bool) {
            this.c = i;
            this.a = list;
            this.d = bool;
        }
    }

    /* renamed from: o.agh$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final String b;
        private final Integer d;
        private final String e;

        public final String a() {
            return this.b;
        }

        public final Integer d() {
            return this.d;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.e, (Object) hVar.e) && C8632dsu.c(this.d, hVar.d) && C8632dsu.c((Object) this.b, (Object) hVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            Integer num = this.d;
            int hashCode2 = num == null ? 0 : num.hashCode();
            String str = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            Integer num = this.d;
            String str2 = this.b;
            return "Tag(__typename=" + str + ", id=" + num + ", displayName=" + str2 + ")";
        }

        public h(String str, Integer num, String str2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = num;
            this.b = str2;
        }
    }
}
