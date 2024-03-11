package o;

import java.util.List;

/* renamed from: o.agP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2453agP implements InterfaceC9037hy {
    private final String a;
    private final C2475agl b;
    private final b d;

    public final String c() {
        return this.a;
    }

    public final b d() {
        return this.d;
    }

    public final C2475agl e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2453agP) {
            C2453agP c2453agP = (C2453agP) obj;
            return C8632dsu.c((Object) this.a, (Object) c2453agP.a) && C8632dsu.c(this.d, c2453agP.d) && C8632dsu.c(this.b, c2453agP.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        b bVar = this.d;
        return (((hashCode * 31) + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        b bVar = this.d;
        C2475agl c2475agl = this.b;
        return "LolomoReadyToPlayGamesRow(__typename=" + str + ", readyToPlayEntities=" + bVar + ", lolomoGameRow=" + c2475agl + ")";
    }

    public C2453agP(String str, b bVar, C2475agl c2475agl) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2475agl, "");
        this.a = str;
        this.d = bVar;
        this.b = c2475agl;
    }

    /* renamed from: o.agP$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final List<d> c;

        public final String c() {
            return this.b;
        }

        public final List<d> d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            List<d> list = this.c;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.b;
            List<d> list = this.c;
            return "ReadyToPlayEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public b(String str, List<d> list) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = list;
        }
    }

    /* renamed from: o.agP$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final e c;

        public final e b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            e eVar = this.c;
            return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            e eVar = this.c;
            return "Edge(__typename=" + str + ", node=" + eVar + ")";
        }

        public d(String str, e eVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = eVar;
        }
    }

    /* renamed from: o.agP$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final c d;

        public final String c() {
            return this.b;
        }

        public final c d() {
            return this.d;
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
            c cVar = this.d;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            c cVar = this.d;
            return "Node(__typename=" + str + ", reference=" + cVar + ")";
        }

        public e(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = cVar;
        }
    }

    /* renamed from: o.agP$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final C2340aeR c;

        public final C2340aeR a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            C2340aeR c2340aeR = this.c;
            return (hashCode * 31) + (c2340aeR == null ? 0 : c2340aeR.hashCode());
        }

        public String toString() {
            String str = this.a;
            C2340aeR c2340aeR = this.c;
            return "Reference(__typename=" + str + ", gameInstallationInfo=" + c2340aeR + ")";
        }

        public c(String str, C2340aeR c2340aeR) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = c2340aeR;
        }
    }
}
