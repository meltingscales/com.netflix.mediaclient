package o;

import java.util.List;

/* renamed from: o.adU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2290adU implements InterfaceC9037hy {
    private final Integer a;
    private final String c;
    private final List<b> d;

    public final String a() {
        return this.c;
    }

    public final List<b> b() {
        return this.d;
    }

    public final Integer d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2290adU) {
            C2290adU c2290adU = (C2290adU) obj;
            return C8632dsu.c((Object) this.c, (Object) c2290adU.c) && C8632dsu.c(this.a, c2290adU.a) && C8632dsu.c(this.d, c2290adU.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        Integer num = this.a;
        int hashCode2 = num == null ? 0 : num.hashCode();
        List<b> list = this.d;
        return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.c;
        Integer num = this.a;
        List<b> list = this.d;
        return "DetailPerson(__typename=" + str + ", totalCount=" + num + ", edges=" + list + ")";
    }

    public C2290adU(String str, Integer num, List<b> list) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.a = num;
        this.d = list;
    }

    /* renamed from: o.adU$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final c c;

        public final String c() {
            return this.a;
        }

        public final c e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            c cVar = this.c;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            c cVar = this.c;
            return "Edge(__typename=" + str + ", node=" + cVar + ")";
        }

        public b(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = cVar;
        }
    }

    /* renamed from: o.adU$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final int a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.c;
        }

        public final int c() {
            return this.a;
        }

        public final String d() {
            return this.b;
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
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c((Object) this.b, (Object) cVar.b) && this.a == cVar.a && C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c((Object) this.d, (Object) cVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = this.b.hashCode();
            int hashCode3 = Integer.hashCode(this.a);
            String str = this.e;
            int hashCode4 = str == null ? 0 : str.hashCode();
            String str2 = this.d;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.b;
            int i = this.a;
            String str3 = this.e;
            String str4 = this.d;
            return "Node(__typename=" + str + ", unifiedEntityId=" + str2 + ", personId=" + i + ", title=" + str3 + ", name=" + str4 + ")";
        }

        public c(String str, String str2, int i, String str3, String str4) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.b = str2;
            this.a = i;
            this.e = str3;
            this.d = str4;
        }
    }
}
