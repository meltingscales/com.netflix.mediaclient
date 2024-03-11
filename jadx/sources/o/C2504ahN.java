package o;

import java.util.List;

/* renamed from: o.ahN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2504ahN implements InterfaceC9037hy {
    private final String a;
    private final c e;

    public final c a() {
        return this.e;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2504ahN) {
            C2504ahN c2504ahN = (C2504ahN) obj;
            return C8632dsu.c((Object) this.a, (Object) c2504ahN.a) && C8632dsu.c(this.e, c2504ahN.e);
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
        return "PinotPQSListSectionFragment(__typename=" + str + ", entities=" + cVar + ")";
    }

    public C2504ahN(String str, c cVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.e = cVar;
    }

    /* renamed from: o.ahN$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final List<d> c;
        private final String d;
        private final int e;

        public final List<d> a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public final int d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && this.e == cVar.e && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = Integer.hashCode(this.e);
            List<d> list = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.d;
            int i = this.e;
            List<d> list = this.c;
            return "Entities(__typename=" + str + ", totalCount=" + i + ", edges=" + list + ")";
        }

        public c(String str, int i, List<d> list) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = i;
            this.c = list;
        }
    }

    /* renamed from: o.ahN$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String b;
        private final String c;
        private final b e;

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.b;
        }

        public final b d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = this.c.hashCode();
            b bVar = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            String str2 = this.c;
            b bVar = this.e;
            return "Edge(__typename=" + str + ", cursor=" + str2 + ", node=" + bVar + ")";
        }

        public d(String str, String str2, b bVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.c = str2;
            this.e = bVar;
        }
    }

    /* renamed from: o.ahN$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final C2506ahP a;
        private final String b;
        private final C2431afu e;

        public final String a() {
            return this.b;
        }

        public final C2431afu b() {
            return this.e;
        }

        public final C2506ahP c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.a, bVar.a) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            C2506ahP c2506ahP = this.a;
            int hashCode2 = c2506ahP == null ? 0 : c2506ahP.hashCode();
            C2431afu c2431afu = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (c2431afu != null ? c2431afu.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            C2506ahP c2506ahP = this.a;
            C2431afu c2431afu = this.e;
            return "Node(__typename=" + str + ", pinotPrequeryEntityFragment=" + c2506ahP + ", irmaPreQueryEntityFragment=" + c2431afu + ")";
        }

        public b(String str, C2506ahP c2506ahP, C2431afu c2431afu) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = c2506ahP;
            this.e = c2431afu;
        }
    }
}
