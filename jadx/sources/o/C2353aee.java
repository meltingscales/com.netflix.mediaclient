package o;

/* renamed from: o.aee  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2353aee implements InterfaceC9037hy {
    private final String a;
    private final b b;

    public final String c() {
        return this.a;
    }

    public final b e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2353aee) {
            C2353aee c2353aee = (C2353aee) obj;
            return C8632dsu.c((Object) this.a, (Object) c2353aee.a) && C8632dsu.c(this.b, c2353aee.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        b bVar = this.b;
        return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        String str = this.a;
        b bVar = this.b;
        return "DownloadsForYouRowHeaderData(__typename=" + str + ", horizontalBackgroundAsset=" + bVar + ")";
    }

    public C2353aee(String str, b bVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.b = bVar;
    }

    /* renamed from: o.aee$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final String b;
        private final String c;
        private final Integer d;
        private final String e;
        private final Integer h;

        public final String a() {
            return this.e;
        }

        public final Integer b() {
            return this.h;
        }

        public final Integer c() {
            return this.d;
        }

        public final String d() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.h, bVar.h) && C8632dsu.c((Object) this.e, (Object) bVar.e);
            }
            return false;
        }

        public final String h() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.d;
            int hashCode4 = num == null ? 0 : num.hashCode();
            Integer num2 = this.h;
            int hashCode5 = num2 == null ? 0 : num2.hashCode();
            String str3 = this.e;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.a;
            String str3 = this.b;
            Integer num = this.d;
            Integer num2 = this.h;
            String str4 = this.e;
            return "HorizontalBackgroundAsset(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ", height=" + num + ", width=" + num2 + ", type=" + str4 + ")";
        }

        public b(String str, String str2, String str3, Integer num, Integer num2, String str4) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = str2;
            this.b = str3;
            this.d = num;
            this.h = num2;
            this.e = str4;
        }
    }
}
