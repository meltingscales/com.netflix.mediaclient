package o;

import java.util.List;

/* renamed from: o.ahD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2494ahD implements InterfaceC9037hy {
    private final String a;
    private final c b;
    private final String c;
    private final String d;
    private final String e;
    private final Integer f;

    public final c a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final Integer d() {
        return this.f;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2494ahD) {
            C2494ahD c2494ahD = (C2494ahD) obj;
            return C8632dsu.c((Object) this.c, (Object) c2494ahD.c) && C8632dsu.c(this.f, c2494ahD.f) && C8632dsu.c((Object) this.d, (Object) c2494ahD.d) && C8632dsu.c((Object) this.a, (Object) c2494ahD.a) && C8632dsu.c((Object) this.e, (Object) c2494ahD.e) && C8632dsu.c(this.b, c2494ahD.b);
        }
        return false;
    }

    public final String f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        Integer num = this.f;
        int hashCode2 = num == null ? 0 : num.hashCode();
        String str = this.d;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.a.hashCode();
        String str2 = this.e;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        c cVar = this.b;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.c;
        Integer num = this.f;
        String str2 = this.d;
        String str3 = this.a;
        String str4 = this.e;
        c cVar = this.b;
        return "PinotEntityCollectionSectionFragment(__typename=" + str + ", trackId=" + num + ", feature=" + str2 + ", id=" + str3 + ", displayString=" + str4 + ", entities=" + cVar + ")";
    }

    public C2494ahD(String str, Integer num, String str2, String str3, String str4, c cVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str3, "");
        this.c = str;
        this.f = num;
        this.d = str2;
        this.a = str3;
        this.e = str4;
        this.b = cVar;
    }

    /* renamed from: o.ahD$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final int a;
        private final List<b> b;
        private final String e;

        public final List<b> a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && this.a == cVar.a && C8632dsu.c(this.b, cVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = Integer.hashCode(this.a);
            List<b> list = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.e;
            int i = this.a;
            List<b> list = this.b;
            return "Entities(__typename=" + str + ", totalCount=" + i + ", edges=" + list + ")";
        }

        public c(String str, int i, List<b> list) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = i;
            this.b = list;
        }
    }

    /* renamed from: o.ahD$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final String c;
        private final d d;

        public final String a() {
            return this.c;
        }

        public final d d() {
            return this.d;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = this.c.hashCode();
            d dVar = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            String str2 = this.c;
            d dVar = this.d;
            return "Edge(__typename=" + str + ", cursor=" + str2 + ", node=" + dVar + ")";
        }

        public b(String str, String str2, d dVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.c = str2;
            this.d = dVar;
        }
    }

    /* renamed from: o.ahD$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final C2492ahB b;

        public final C2492ahB b() {
            return this.b;
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
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c(this.b, dVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2492ahB c2492ahB = this.b;
            return "Node(__typename=" + str + ", pinotEntityFragment=" + c2492ahB + ")";
        }

        public d(String str, C2492ahB c2492ahB) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2492ahB, "");
            this.a = str;
            this.b = c2492ahB;
        }
    }
}
