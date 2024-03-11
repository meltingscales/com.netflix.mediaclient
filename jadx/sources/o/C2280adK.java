package o;

/* renamed from: o.adK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2280adK implements InterfaceC9037hy {
    private final String b;
    private final e c;

    public final String b() {
        return this.b;
    }

    public final e e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2280adK) {
            C2280adK c2280adK = (C2280adK) obj;
            return C8632dsu.c((Object) this.b, (Object) c2280adK.b) && C8632dsu.c(this.c, c2280adK.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        e eVar = this.c;
        return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
    }

    public String toString() {
        String str = this.b;
        e eVar = this.c;
        return "CommanderTitleHorizontalArt(__typename=" + str + ", horizontalArt=" + eVar + ")";
    }

    public C2280adK(String str, e eVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.c = eVar;
    }

    /* renamed from: o.adK$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final String d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final String d() {
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
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c((Object) this.d, (Object) eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.a;
            String str3 = this.d;
            return "HorizontalArt(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public e(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = str2;
            this.d = str3;
        }
    }
}
