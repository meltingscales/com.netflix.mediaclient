package o;

import java.util.List;

/* renamed from: o.afK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2386afK implements InterfaceC9037hy {
    private final String a;
    private final C2529ahm d;
    private final d e;

    public final String c() {
        return this.a;
    }

    public final d d() {
        return this.e;
    }

    public final C2529ahm e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2386afK) {
            C2386afK c2386afK = (C2386afK) obj;
            return C8632dsu.c((Object) this.a, (Object) c2386afK.a) && C8632dsu.c(this.e, c2386afK.e) && C8632dsu.c(this.d, c2386afK.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        d dVar = this.e;
        return (((hashCode * 31) + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        d dVar = this.e;
        C2529ahm c2529ahm = this.d;
        return "LolomoBillboardRow(__typename=" + str + ", billboardEntities=" + dVar + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2386afK(String str, d dVar, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.a = str;
        this.e = dVar;
        this.d = c2529ahm;
    }

    /* renamed from: o.afK$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String b;
        private final a c;

        public final String d() {
            return this.b;
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
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.b;
            a aVar = this.c;
            return "BillboardEntities(__typename=" + str + ", onLolomoBillboardRowEntitiesConnection=" + aVar + ")";
        }

        public d(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) aVar, "");
            this.b = str;
            this.c = aVar;
        }
    }

    /* renamed from: o.afK$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final List<b> c;

        public final List<b> a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.c, ((a) obj).c);
        }

        public int hashCode() {
            List<b> list = this.c;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<b> list = this.c;
            return "OnLolomoBillboardRowEntitiesConnection(edges=" + list + ")";
        }

        public a(List<b> list) {
            this.c = list;
        }
    }

    /* renamed from: o.afK$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final c d;
        private final C2312adq e;

        public final c b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final C2312adq d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            c cVar = this.d;
            return (((hashCode * 31) + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            c cVar = this.d;
            C2312adq c2312adq = this.e;
            return "Edge(__typename=" + str + ", node=" + cVar + ", billboardData=" + c2312adq + ")";
        }

        public b(String str, c cVar, C2312adq c2312adq) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2312adq, "");
            this.b = str;
            this.d = cVar;
            this.e = c2312adq;
        }
    }

    /* renamed from: o.afK$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final e e;

        public final e b() {
            return this.e;
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
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            e eVar = this.e;
            return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            e eVar = this.e;
            return "Node(__typename=" + str + ", reference=" + eVar + ")";
        }

        public c(String str, e eVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = eVar;
        }
    }

    /* renamed from: o.afK$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final C2514ahX a;
        private final String b;

        public final String c() {
            return this.b;
        }

        public final C2514ahX d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            C2514ahX c2514ahX = this.a;
            return (hashCode * 31) + (c2514ahX == null ? 0 : c2514ahX.hashCode());
        }

        public String toString() {
            String str = this.b;
            C2514ahX c2514ahX = this.a;
            return "Reference(__typename=" + str + ", playable=" + c2514ahX + ")";
        }

        public e(String str, C2514ahX c2514ahX) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = c2514ahX;
        }
    }
}
