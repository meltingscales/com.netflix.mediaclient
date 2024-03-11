package o;

import java.util.List;

/* renamed from: o.agm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2476agm implements InterfaceC9037hy {
    private final C2475agl b;
    private final d c;
    private final String e;

    public final C2475agl a() {
        return this.b;
    }

    public final String d() {
        return this.e;
    }

    public final d e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2476agm) {
            C2476agm c2476agm = (C2476agm) obj;
            return C8632dsu.c((Object) this.e, (Object) c2476agm.e) && C8632dsu.c(this.c, c2476agm.c) && C8632dsu.c(this.b, c2476agm.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        d dVar = this.c;
        return (((hashCode * 31) + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.e;
        d dVar = this.c;
        C2475agl c2475agl = this.b;
        return "LolomoGamesGenreRow(__typename=" + str + ", gamesGenreEntities=" + dVar + ", lolomoGameRow=" + c2475agl + ")";
    }

    public C2476agm(String str, d dVar, C2475agl c2475agl) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2475agl, "");
        this.e = str;
        this.c = dVar;
        this.b = c2475agl;
    }

    /* renamed from: o.agm$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String b;
        private final List<c> c;

        public final List<c> c() {
            return this.c;
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
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            List<c> list = this.c;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.b;
            List<c> list = this.c;
            return "GamesGenreEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public d(String str, List<c> list) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = list;
        }
    }

    /* renamed from: o.agm$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final e d;

        public final String a() {
            return this.a;
        }

        public final e c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c(this.d, cVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            e eVar = this.d;
            return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            e eVar = this.d;
            return "Edge(__typename=" + str + ", node=" + eVar + ")";
        }

        public c(String str, e eVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = eVar;
        }
    }

    /* renamed from: o.agm$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final a e;

        public final String c() {
            return this.a;
        }

        public final a d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            a aVar = this.e;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            a aVar = this.e;
            return "Node(__typename=" + str + ", reference=" + aVar + ")";
        }

        public e(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = aVar;
        }
    }

    /* renamed from: o.agm$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final b a;
        private final String c;

        public final String b() {
            return this.c;
        }

        public final b e() {
            return this.a;
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
            int hashCode = this.c.hashCode();
            b bVar = this.a;
            return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            b bVar = this.a;
            return "Reference(__typename=" + str + ", onGame=" + bVar + ")";
        }

        public a(String str, b bVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = bVar;
        }
    }

    /* renamed from: o.agm$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final int c;
        private final List<g> e;

        public final List<g> c() {
            return this.e;
        }

        public final int d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.c == bVar.c && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.c);
            List<g> list = this.e;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            int i = this.c;
            List<g> list = this.e;
            return "OnGame(gameId=" + i + ", tags=" + list + ")";
        }

        public b(int i, List<g> list) {
            this.c = i;
            this.e = list;
        }
    }

    /* renamed from: o.agm$g */
    /* loaded from: classes3.dex */
    public static final class g {
        private final Integer a;
        private final String b;
        private final String d;

        public final Integer a() {
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
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.d, (Object) gVar.d) && C8632dsu.c(this.a, gVar.a) && C8632dsu.c((Object) this.b, (Object) gVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            Integer num = this.a;
            int hashCode2 = num == null ? 0 : num.hashCode();
            String str = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            Integer num = this.a;
            String str2 = this.b;
            return "Tag(__typename=" + str + ", id=" + num + ", displayName=" + str2 + ")";
        }

        public g(String str, Integer num, String str2) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = num;
            this.b = str2;
        }
    }
}
