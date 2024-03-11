package o;

/* renamed from: o.aiU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2564aiU implements InterfaceC9037hy {
    private final String c;
    private final int d;
    private final e e;

    public final int a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final e d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2564aiU) {
            C2564aiU c2564aiU = (C2564aiU) obj;
            return C8632dsu.c((Object) this.c, (Object) c2564aiU.c) && this.d == c2564aiU.d && C8632dsu.c(this.e, c2564aiU.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = Integer.hashCode(this.d);
        e eVar = this.e;
        return (((hashCode * 31) + hashCode2) * 31) + (eVar == null ? 0 : eVar.hashCode());
    }

    public String toString() {
        String str = this.c;
        int i = this.d;
        e eVar = this.e;
        return "TopTenVideoArtwork(__typename=" + str + ", videoId=" + i + ", boxArtNoBadge=" + eVar + ")";
    }

    public C2564aiU(String str, int i, e eVar) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.d = i;
        this.e = eVar;
    }

    /* renamed from: o.aiU$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final String c;
        private final String d;

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c((Object) this.b, (Object) eVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.c;
            String str3 = this.b;
            return "BoxArtNoBadge(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public e(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = str2;
            this.b = str3;
        }
    }
}
