package o;

/* renamed from: o.aeR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2340aeR implements InterfaceC9037hy {
    private final int b;
    private final String d;
    private final c e;

    public final String b() {
        return this.d;
    }

    public final c c() {
        return this.e;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2340aeR) {
            C2340aeR c2340aeR = (C2340aeR) obj;
            return C8632dsu.c((Object) this.d, (Object) c2340aeR.d) && this.b == c2340aeR.b && C8632dsu.c(this.e, c2340aeR.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = Integer.hashCode(this.b);
        c cVar = this.e;
        return (((hashCode * 31) + hashCode2) * 31) + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        String str = this.d;
        int i = this.b;
        c cVar = this.e;
        return "GameInstallationInfo(__typename=" + str + ", gameId=" + i + ", androidInstallation=" + cVar + ")";
    }

    public C2340aeR(String str, int i, c cVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.b = i;
        this.e = cVar;
    }

    /* renamed from: o.aeR$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final Integer b;
        private final Integer c;
        private final String d;
        private final Integer e;
        private final Integer g;
        private final String i;

        public final String a() {
            return this.i;
        }

        public final String b() {
            return this.d;
        }

        public final Integer c() {
            return this.e;
        }

        public final Integer d() {
            return this.c;
        }

        public final Integer e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c(this.e, cVar.e) && C8632dsu.c(this.b, cVar.b) && C8632dsu.c(this.g, cVar.g) && C8632dsu.c(this.c, cVar.c) && C8632dsu.c((Object) this.i, (Object) cVar.i) && C8632dsu.c((Object) this.d, (Object) cVar.d);
            }
            return false;
        }

        public final Integer f() {
            return this.g;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            Integer num = this.e;
            int hashCode2 = num == null ? 0 : num.hashCode();
            Integer num2 = this.b;
            int hashCode3 = num2 == null ? 0 : num2.hashCode();
            Integer num3 = this.g;
            int hashCode4 = num3 == null ? 0 : num3.hashCode();
            Integer num4 = this.c;
            int hashCode5 = num4 == null ? 0 : num4.hashCode();
            int hashCode6 = this.i.hashCode();
            String str = this.d;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final String j() {
            return this.a;
        }

        public String toString() {
            String str = this.a;
            Integer num = this.e;
            Integer num2 = this.b;
            Integer num3 = this.g;
            Integer num4 = this.c;
            String str2 = this.i;
            String str3 = this.d;
            return "AndroidInstallation(__typename=" + str + ", minMemoryGb=" + num + ", minSdkVersion=" + num2 + ", packageSizeInMb=" + num3 + ", numProcessors=" + num4 + ", packageName=" + str2 + ", appStoreUrl=" + str3 + ")";
        }

        public c(String str, Integer num, Integer num2, Integer num3, Integer num4, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.e = num;
            this.b = num2;
            this.g = num3;
            this.c = num4;
            this.i = str2;
            this.d = str3;
        }
    }
}
