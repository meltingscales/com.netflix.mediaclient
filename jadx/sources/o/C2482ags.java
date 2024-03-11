package o;

import java.util.List;

/* renamed from: o.ags  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2482ags implements InterfaceC9037hy {
    private final C2475agl a;
    private final String c;
    private final a e;

    public final a b() {
        return this.e;
    }

    public final C2475agl d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2482ags) {
            C2482ags c2482ags = (C2482ags) obj;
            return C8632dsu.c((Object) this.c, (Object) c2482ags.c) && C8632dsu.c(this.e, c2482ags.e) && C8632dsu.c(this.a, c2482ags.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        a aVar = this.e;
        return (((hashCode * 31) + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.c;
        a aVar = this.e;
        C2475agl c2475agl = this.a;
        return "LolomoGamesTrailersRow(__typename=" + str + ", gamesTrailerEntities=" + aVar + ", lolomoGameRow=" + c2475agl + ")";
    }

    public C2482ags(String str, a aVar, C2475agl c2475agl) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2475agl, "");
        this.c = str;
        this.e = aVar;
        this.a = c2475agl;
    }

    /* renamed from: o.ags$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final List<d> a;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final List<d> e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            List<d> list = this.a;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.e;
            List<d> list = this.a;
            return "GamesTrailerEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public a(String str, List<d> list) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = list;
        }
    }

    /* renamed from: o.ags$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final e d;
        private final String e;

        public final e b() {
            return this.d;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            e eVar = this.d;
            return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            e eVar = this.d;
            return "Edge(__typename=" + str + ", node=" + eVar + ")";
        }

        public d(String str, e eVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = eVar;
        }
    }

    /* renamed from: o.ags$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final b e;

        public final b c() {
            return this.e;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            b bVar = this.e;
            return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            b bVar = this.e;
            return "Node(__typename=" + str + ", reference=" + bVar + ")";
        }

        public e(String str, b bVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = bVar;
        }
    }

    /* renamed from: o.ags$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final C2347aeY d;

        public final C2347aeY d() {
            return this.d;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            C2347aeY c2347aeY = this.d;
            return (hashCode * 31) + (c2347aeY == null ? 0 : c2347aeY.hashCode());
        }

        public String toString() {
            String str = this.b;
            C2347aeY c2347aeY = this.d;
            return "Reference(__typename=" + str + ", gameTrailer=" + c2347aeY + ")";
        }

        public b(String str, C2347aeY c2347aeY) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = c2347aeY;
        }
    }
}
