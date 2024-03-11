package o;

import java.util.List;

/* renamed from: o.afn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2415afn implements InterfaceC9037hy {
    private final String a;
    private final String b;
    private final e c;
    private final String d;
    private final String e;
    private final Integer i;

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final e c() {
        return this.c;
    }

    public final Integer d() {
        return this.i;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2415afn) {
            C2415afn c2415afn = (C2415afn) obj;
            return C8632dsu.c((Object) this.b, (Object) c2415afn.b) && C8632dsu.c(this.i, c2415afn.i) && C8632dsu.c((Object) this.d, (Object) c2415afn.d) && C8632dsu.c((Object) this.e, (Object) c2415afn.e) && C8632dsu.c((Object) this.a, (Object) c2415afn.a) && C8632dsu.c(this.c, c2415afn.c);
        }
        return false;
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        Integer num = this.i;
        int hashCode2 = num == null ? 0 : num.hashCode();
        String str = this.d;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.e.hashCode();
        String str2 = this.a;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        e eVar = this.c;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.b;
        Integer num = this.i;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.a;
        e eVar = this.c;
        return "IrmaEntityCollectionSectionFragment(__typename=" + str + ", trackId=" + num + ", feature=" + str2 + ", id=" + str3 + ", displayString=" + str4 + ", entities=" + eVar + ")";
    }

    public C2415afn(String str, Integer num, String str2, String str3, String str4, e eVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str3, "");
        this.b = str;
        this.i = num;
        this.d = str2;
        this.e = str3;
        this.a = str4;
        this.c = eVar;
    }

    /* renamed from: o.afn$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final int b;
        private final List<d> d;

        public final int b() {
            return this.b;
        }

        public final List<d> c() {
            return this.d;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && this.b == eVar.b && C8632dsu.c(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = Integer.hashCode(this.b);
            List<d> list = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.a;
            int i = this.b;
            List<d> list = this.d;
            return "Entities(__typename=" + str + ", totalCount=" + i + ", edges=" + list + ")";
        }

        public e(String str, int i, List<d> list) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = i;
            this.d = list;
        }
    }

    /* renamed from: o.afn$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final b c;
        private final String d;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final String d() {
            return this.d;
        }

        public final b e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = this.d.hashCode();
            b bVar = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            String str2 = this.d;
            b bVar = this.c;
            return "Edge(__typename=" + str + ", cursor=" + str2 + ", node=" + bVar + ")";
        }

        public d(String str, String str2, b bVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.e = str;
            this.d = str2;
            this.c = bVar;
        }
    }

    /* renamed from: o.afn$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final C2416afo b;
        private final String c;

        public final String a() {
            return this.c;
        }

        public final C2416afo b() {
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
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2416afo c2416afo = this.b;
            return "Node(__typename=" + str + ", irmaEntityFragment=" + c2416afo + ")";
        }

        public b(String str, C2416afo c2416afo) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2416afo, "");
            this.c = str;
            this.b = c2416afo;
        }
    }
}
