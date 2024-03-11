package o;

import java.util.List;

/* renamed from: o.ahI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2499ahI implements InterfaceC9037hy {
    private final String a;
    private final d b;
    private final String c;
    private final String d;
    private final String e;
    private final Integer f;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.e;
    }

    public final Integer c() {
        return this.f;
    }

    public final d d() {
        return this.b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2499ahI) {
            C2499ahI c2499ahI = (C2499ahI) obj;
            return C8632dsu.c((Object) this.c, (Object) c2499ahI.c) && C8632dsu.c(this.f, c2499ahI.f) && C8632dsu.c((Object) this.a, (Object) c2499ahI.a) && C8632dsu.c((Object) this.e, (Object) c2499ahI.e) && C8632dsu.c((Object) this.d, (Object) c2499ahI.d) && C8632dsu.c(this.b, c2499ahI.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        Integer num = this.f;
        int hashCode2 = num == null ? 0 : num.hashCode();
        String str = this.a;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.e.hashCode();
        String str2 = this.d;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        d dVar = this.b;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String i() {
        return this.c;
    }

    public String toString() {
        String str = this.c;
        Integer num = this.f;
        String str2 = this.a;
        String str3 = this.e;
        String str4 = this.d;
        d dVar = this.b;
        return "PinotOption5EntityCollectionSectionFragment(__typename=" + str + ", trackId=" + num + ", feature=" + str2 + ", id=" + str3 + ", displayString=" + str4 + ", entities=" + dVar + ")";
    }

    public C2499ahI(String str, Integer num, String str2, String str3, String str4, d dVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str3, "");
        this.c = str;
        this.f = num;
        this.a = str2;
        this.e = str3;
        this.d = str4;
        this.b = dVar;
    }

    /* renamed from: o.ahI$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final List<b> b;
        private final int d;
        private final String e;

        public final int b() {
            return this.d;
        }

        public final String d() {
            return this.e;
        }

        public final List<b> e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && this.d == dVar.d && C8632dsu.c(this.b, dVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = Integer.hashCode(this.d);
            List<b> list = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.e;
            int i = this.d;
            List<b> list = this.b;
            return "Entities(__typename=" + str + ", totalCount=" + i + ", edges=" + list + ")";
        }

        public d(String str, int i, List<b> list) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = i;
            this.b = list;
        }
    }

    /* renamed from: o.ahI$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final e c;
        private final String d;

        public final e b() {
            return this.c;
        }

        public final String c() {
            return this.b;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = this.d.hashCode();
            e eVar = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            String str2 = this.d;
            e eVar = this.c;
            return "Edge(__typename=" + str + ", cursor=" + str2 + ", node=" + eVar + ")";
        }

        public b(String str, String str2, e eVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.d = str2;
            this.c = eVar;
        }
    }

    /* renamed from: o.ahI$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String d;
        private final C2502ahL e;

        public final String b() {
            return this.d;
        }

        public final C2502ahL e() {
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
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            C2502ahL c2502ahL = this.e;
            return "Node(__typename=" + str + ", pinotOption5EntityFragment=" + c2502ahL + ")";
        }

        public e(String str, C2502ahL c2502ahL) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2502ahL, "");
            this.d = str;
            this.e = c2502ahL;
        }
    }
}
