package o;

import java.util.List;

/* renamed from: o.afS  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2394afS implements InterfaceC9037hy {
    private final e a;
    private final String d;
    private final C2529ahm e;

    public final C2529ahm b() {
        return this.e;
    }

    public final e d() {
        return this.a;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2394afS) {
            C2394afS c2394afS = (C2394afS) obj;
            return C8632dsu.c((Object) this.d, (Object) c2394afS.d) && C8632dsu.c(this.a, c2394afS.a) && C8632dsu.c(this.e, c2394afS.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        e eVar = this.a;
        return (((hashCode * 31) + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.d;
        e eVar = this.a;
        C2529ahm c2529ahm = this.e;
        return "LolomoContinueWatchingRow(__typename=" + str + ", cwEntities=" + eVar + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2394afS(String str, e eVar, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.d = str;
        this.a = eVar;
        this.e = c2529ahm;
    }

    /* renamed from: o.afS$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final List<d> b;
        private final String d;

        public final String c() {
            return this.d;
        }

        public final List<d> d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c(this.b, eVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            List<d> list = this.b;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.d;
            List<d> list = this.b;
            return "CwEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public e(String str, List<d> list) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = list;
        }
    }

    /* renamed from: o.afS$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final c e;

        public final c d() {
            return this.e;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            c cVar = this.e;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            c cVar = this.e;
            return "Edge(__typename=" + str + ", node=" + cVar + ")";
        }

        public d(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = cVar;
        }
    }

    /* renamed from: o.afS$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final a e;

        public final a c() {
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
            a aVar = this.e;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            a aVar = this.e;
            return "Node(__typename=" + str + ", reference=" + aVar + ")";
        }

        public c(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = aVar;
        }
    }

    /* renamed from: o.afS$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String c;
        private final C2638ajp d;
        private final C2514ahX e;

        public final C2638ajp b() {
            return this.d;
        }

        public final C2514ahX c() {
            return this.e;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.e, aVar.e) && C8632dsu.c(this.d, aVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            C2514ahX c2514ahX = this.e;
            int hashCode2 = c2514ahX == null ? 0 : c2514ahX.hashCode();
            C2638ajp c2638ajp = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (c2638ajp != null ? c2638ajp.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            C2514ahX c2514ahX = this.e;
            C2638ajp c2638ajp = this.d;
            return "Reference(__typename=" + str + ", playable=" + c2514ahX + ", viewable=" + c2638ajp + ")";
        }

        public a(String str, C2514ahX c2514ahX, C2638ajp c2638ajp) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = c2514ahX;
            this.d = c2638ajp;
        }
    }
}
