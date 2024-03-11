package o;

/* renamed from: o.ajf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2628ajf implements InterfaceC9037hy {
    private final a a;
    private final String b;

    public final a c() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2628ajf) {
            C2628ajf c2628ajf = (C2628ajf) obj;
            return C8632dsu.c((Object) this.b, (Object) c2628ajf.b) && C8632dsu.c(this.a, c2628ajf.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        a aVar = this.a;
        return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        String str = this.b;
        a aVar = this.a;
        return "VideoCertificationRating(__typename=" + str + ", certificationRating=" + aVar + ")";
    }

    public C2628ajf(String str, a aVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.a = aVar;
    }

    /* renamed from: o.ajf$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final Integer b;
        private final String c;
        private final String d;
        private final Integer e;
        private final String g;
        private final Integer h;
        private final String i;

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final Integer c() {
            return this.b;
        }

        public final Integer d() {
            return this.h;
        }

        public final Integer e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c((Object) this.i, (Object) aVar.i) && C8632dsu.c(this.e, aVar.e) && C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c((Object) this.g, (Object) aVar.g) && C8632dsu.c(this.h, aVar.h) && C8632dsu.c(this.b, aVar.b) && C8632dsu.c((Object) this.a, (Object) aVar.a);
            }
            return false;
        }

        public final String f() {
            return this.d;
        }

        public final String g() {
            return this.g;
        }

        public final String h() {
            return this.i;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.i;
            int hashCode2 = str == null ? 0 : str.hashCode();
            Integer num = this.e;
            int hashCode3 = num == null ? 0 : num.hashCode();
            String str2 = this.c;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.g;
            int hashCode5 = str3 == null ? 0 : str3.hashCode();
            Integer num2 = this.h;
            int hashCode6 = num2 == null ? 0 : num2.hashCode();
            Integer num3 = this.b;
            int hashCode7 = num3 == null ? 0 : num3.hashCode();
            String str4 = this.a;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.i;
            Integer num = this.e;
            String str3 = this.c;
            String str4 = this.g;
            Integer num2 = this.h;
            Integer num3 = this.b;
            String str5 = this.a;
            return "CertificationRating(__typename=" + str + ", value=" + str2 + ", maturityLevel=" + num + ", maturityDescription=" + str3 + ", shortDescription=" + str4 + ", ratingId=" + num2 + ", boardId=" + num3 + ", boardName=" + str5 + ")";
        }

        public a(String str, String str2, Integer num, String str3, String str4, Integer num2, Integer num3, String str5) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.i = str2;
            this.e = num;
            this.c = str3;
            this.g = str4;
            this.h = num2;
            this.b = num3;
            this.a = str5;
        }
    }
}
