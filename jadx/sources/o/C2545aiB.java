package o;

/* renamed from: o.aiB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2545aiB implements InterfaceC9037hy {
    private final String a;
    private final String b;
    private final e c;
    private final String d;
    private final String e;

    public final e a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2545aiB) {
            C2545aiB c2545aiB = (C2545aiB) obj;
            return C8632dsu.c((Object) this.e, (Object) c2545aiB.e) && C8632dsu.c((Object) this.d, (Object) c2545aiB.d) && C8632dsu.c((Object) this.a, (Object) c2545aiB.a) && C8632dsu.c((Object) this.b, (Object) c2545aiB.b) && C8632dsu.c(this.c, c2545aiB.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        String str = this.d;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.a;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.b;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        e eVar = this.c;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.e;
        String str2 = this.d;
        String str3 = this.a;
        String str4 = this.b;
        e eVar = this.c;
        return "ProfileLocaleSummary(__typename=" + str + ", id=" + str2 + ", language=" + str3 + ", languageTag=" + str4 + ", localizedDisplayName=" + eVar + ")";
    }

    public C2545aiB(String str, String str2, String str3, String str4, e eVar) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.d = str2;
        this.a = str3;
        this.b = str4;
        this.c = eVar;
    }

    /* renamed from: o.aiB$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String d;
        private final String e;

        public final String c() {
            return this.d;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c((Object) this.d, (Object) eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.d;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.e;
            String str2 = this.d;
            return "LocalizedDisplayName(__typename=" + str + ", value=" + str2 + ")";
        }

        public e(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = str2;
        }
    }
}
