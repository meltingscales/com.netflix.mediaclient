package o;

import java.util.List;

/* renamed from: o.afT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2395afT implements InterfaceC9037hy {
    private final d a;
    private final C2454agQ b;
    private final String c;

    public final String a() {
        return this.c;
    }

    public final C2454agQ b() {
        return this.b;
    }

    public final d e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2395afT) {
            C2395afT c2395afT = (C2395afT) obj;
            return C8632dsu.c((Object) this.c, (Object) c2395afT.c) && C8632dsu.c(this.a, c2395afT.a) && C8632dsu.c(this.b, c2395afT.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        d dVar = this.a;
        return (((hashCode * 31) + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.c;
        d dVar = this.a;
        C2454agQ c2454agQ = this.b;
        return "LolomoContainerPageEvidenceRow(__typename=" + str + ", genericContainerEntities=" + dVar + ", lolomoRow=" + c2454agQ + ")";
    }

    public C2395afT(String str, d dVar, C2454agQ c2454agQ) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2454agQ, "");
        this.c = str;
        this.a = dVar;
        this.b = c2454agQ;
    }

    /* renamed from: o.afT$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final List<c> c;
        private final String d;

        public final List<c> b() {
            return this.c;
        }

        public final String c() {
            return this.d;
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
            List<c> list = this.c;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.d;
            List<c> list = this.c;
            return "GenericContainerEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public d(String str, List<c> list) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = list;
        }
    }

    /* renamed from: o.afT$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final e b;
        private final String e;

        public final e a() {
            return this.b;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c(this.b, cVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            e eVar = this.b;
            return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            e eVar = this.b;
            return "Edge(__typename=" + str + ", node=" + eVar + ")";
        }

        public c(String str, e eVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = eVar;
        }
    }

    /* renamed from: o.afT$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String d;
        private final b e;

        public final String a() {
            return this.d;
        }

        public final b b() {
            return this.e;
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
            b bVar = this.e;
            return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            b bVar = this.e;
            return "Node(__typename=" + str + ", reference=" + bVar + ")";
        }

        public e(String str, b bVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = bVar;
        }
    }

    /* renamed from: o.afT$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final C2348aeZ d;
        private final String e;

        public final String c() {
            return this.e;
        }

        public final C2348aeZ e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            C2348aeZ c2348aeZ = this.d;
            return (hashCode * 31) + (c2348aeZ == null ? 0 : c2348aeZ.hashCode());
        }

        public String toString() {
            String str = this.e;
            C2348aeZ c2348aeZ = this.d;
            return "Reference(__typename=" + str + ", genericContainer=" + c2348aeZ + ")";
        }

        public b(String str, C2348aeZ c2348aeZ) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = c2348aeZ;
        }
    }
}
