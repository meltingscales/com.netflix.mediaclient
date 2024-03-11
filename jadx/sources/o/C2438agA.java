package o;

import java.util.List;

/* renamed from: o.agA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2438agA implements InterfaceC9037hy {
    private final b a;
    private final String d;
    private final C2529ahm e;

    public final b b() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public final C2529ahm e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2438agA) {
            C2438agA c2438agA = (C2438agA) obj;
            return C8632dsu.c((Object) this.d, (Object) c2438agA.d) && C8632dsu.c(this.a, c2438agA.a) && C8632dsu.c(this.e, c2438agA.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        b bVar = this.a;
        return (((hashCode * 31) + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.d;
        b bVar = this.a;
        C2529ahm c2529ahm = this.e;
        return "LolomoKidsFavoritesRow(__typename=" + str + ", kidsFavoritesEntities=" + bVar + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2438agA(String str, b bVar, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.d = str;
        this.a = bVar;
        this.e = c2529ahm;
    }

    /* renamed from: o.agA$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final List<a> b;
        private final String c;

        public final String b() {
            return this.c;
        }

        public final List<a> c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            List<a> list = this.b;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.c;
            List<a> list = this.b;
            return "KidsFavoritesEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public b(String str, List<a> list) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = list;
        }
    }

    /* renamed from: o.agA$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final C2432afv a;
        private final Boolean b;
        private final Boolean c;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final C2432afv c() {
            return this.a;
        }

        public final Boolean d() {
            return this.c;
        }

        public final Boolean e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c(this.b, aVar.b) && C8632dsu.c(this.c, aVar.c) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            Boolean bool = this.b;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            Boolean bool = this.b;
            Boolean bool2 = this.c;
            C2432afv c2432afv = this.a;
            return "Edge(__typename=" + str + ", isMysteryTitle=" + bool + ", isImpressed=" + bool2 + ", listItemKidsFavoriteArt=" + c2432afv + ")";
        }

        public a(String str, Boolean bool, Boolean bool2, C2432afv c2432afv) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2432afv, "");
            this.e = str;
            this.b = bool;
            this.c = bool2;
            this.a = c2432afv;
        }
    }
}
