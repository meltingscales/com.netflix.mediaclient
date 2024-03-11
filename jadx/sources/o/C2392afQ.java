package o;

import java.util.List;

/* renamed from: o.afQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2392afQ implements InterfaceC9037hy {
    private final C2454agQ a;
    private final b b;
    private final String c;

    public final String a() {
        return this.c;
    }

    public final b b() {
        return this.b;
    }

    public final C2454agQ c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2392afQ) {
            C2392afQ c2392afQ = (C2392afQ) obj;
            return C8632dsu.c((Object) this.c, (Object) c2392afQ.c) && C8632dsu.c(this.b, c2392afQ.b) && C8632dsu.c(this.a, c2392afQ.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        b bVar = this.b;
        return (((hashCode * 31) + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.c;
        b bVar = this.b;
        C2454agQ c2454agQ = this.a;
        return "LolomoCharacterRow(__typename=" + str + ", characterEntities=" + bVar + ", lolomoRow=" + c2454agQ + ")";
    }

    public C2392afQ(String str, b bVar, C2454agQ c2454agQ) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2454agQ, "");
        this.c = str;
        this.b = bVar;
        this.a = c2454agQ;
    }

    /* renamed from: o.afQ$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final List<d> a;
        private final String e;

        public final List<d> d() {
            return this.a;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.a, bVar.a);
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
            return "CharacterEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public b(String str, List<d> list) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = list;
        }
    }

    /* renamed from: o.afQ$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final c b;
        private final String d;

        public final c a() {
            return this.b;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.b, dVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            c cVar = this.b;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            c cVar = this.b;
            return "Edge(__typename=" + str + ", node=" + cVar + ")";
        }

        public d(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = cVar;
        }
    }

    /* renamed from: o.afQ$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final e b;
        private final String c;

        public final e a() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c(this.b, cVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            e eVar = this.b;
            return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            e eVar = this.b;
            return "Node(__typename=" + str + ", reference=" + eVar + ")";
        }

        public c(String str, e eVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = eVar;
        }
    }

    /* renamed from: o.afQ$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String d;
        private final C2270adA e;

        public final C2270adA b() {
            return this.e;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            C2270adA c2270adA = this.e;
            return (hashCode * 31) + (c2270adA == null ? 0 : c2270adA.hashCode());
        }

        public String toString() {
            String str = this.d;
            C2270adA c2270adA = this.e;
            return "Reference(__typename=" + str + ", characterData=" + c2270adA + ")";
        }

        public e(String str, C2270adA c2270adA) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = c2270adA;
        }
    }
}
