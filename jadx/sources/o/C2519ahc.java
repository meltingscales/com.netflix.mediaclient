package o;

import java.util.List;

/* renamed from: o.ahc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2519ahc implements InterfaceC9037hy {
    private final String a;
    private final C2529ahm b;
    private final Boolean d;
    private final d e;

    public final String a() {
        return this.a;
    }

    public final Boolean b() {
        return this.d;
    }

    public final d c() {
        return this.e;
    }

    public final C2529ahm e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2519ahc) {
            C2519ahc c2519ahc = (C2519ahc) obj;
            return C8632dsu.c((Object) this.a, (Object) c2519ahc.a) && C8632dsu.c(this.d, c2519ahc.d) && C8632dsu.c(this.e, c2519ahc.e) && C8632dsu.c(this.b, c2519ahc.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        Boolean bool = this.d;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        d dVar = this.e;
        return (((((hashCode * 31) + hashCode2) * 31) + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        Boolean bool = this.d;
        d dVar = this.e;
        C2529ahm c2529ahm = this.b;
        return "LolomoTallPanelRow(__typename=" + str + ", renderRichUITreatment=" + bool + ", tallPanelEntities=" + dVar + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2519ahc(String str, Boolean bool, d dVar, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.a = str;
        this.d = bool;
        this.e = dVar;
        this.b = c2529ahm;
    }

    /* renamed from: o.ahc$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final List<c> d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final List<c> d() {
            return this.d;
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
            List<c> list = this.d;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.e;
            List<c> list = this.d;
            return "TallPanelEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public d(String str, List<c> list) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = list;
        }
    }

    /* renamed from: o.ahc$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final b b;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final b b() {
            return this.b;
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
            b bVar = this.b;
            return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            b bVar = this.b;
            return "Edge(__typename=" + str + ", node=" + bVar + ")";
        }

        public c(String str, b bVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = bVar;
        }
    }

    /* renamed from: o.ahc$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final a b;
        private final String d;

        public final a a() {
            return this.b;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            a aVar = this.b;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            a aVar = this.b;
            return "Node(__typename=" + str + ", reference=" + aVar + ")";
        }

        public b(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = aVar;
        }
    }

    /* renamed from: o.ahc$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final C2559aiP b;

        public final String a() {
            return this.a;
        }

        public final C2559aiP b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            C2559aiP c2559aiP = this.b;
            return (hashCode * 31) + (c2559aiP == null ? 0 : c2559aiP.hashCode());
        }

        public String toString() {
            String str = this.a;
            C2559aiP c2559aiP = this.b;
            return "Reference(__typename=" + str + ", tallPanelVideoArtwork=" + c2559aiP + ")";
        }

        public a(String str, C2559aiP c2559aiP) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = c2559aiP;
        }
    }
}
