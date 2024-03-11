package o;

/* renamed from: o.adR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2287adR implements InterfaceC9037hy {
    private final String a;
    private final e d;

    public final String c() {
        return this.a;
    }

    public final e e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2287adR) {
            C2287adR c2287adR = (C2287adR) obj;
            return C8632dsu.c((Object) this.a, (Object) c2287adR.a) && C8632dsu.c(this.d, c2287adR.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        e eVar = this.d;
        return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
    }

    public String toString() {
        String str = this.a;
        e eVar = this.d;
        return "DetailsContextualSynopsis(__typename=" + str + ", contextualSynopsis=" + eVar + ")";
    }

    public C2287adR(String str, e eVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.d = eVar;
    }

    /* renamed from: o.adR$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final String d;
        private final String e;

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.e;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c((Object) this.b, (Object) eVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.d;
            String str3 = this.b;
            return "ContextualSynopsis(__typename=" + str + ", text=" + str2 + ", evidenceKey=" + str3 + ")";
        }

        public e(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = str2;
            this.b = str3;
        }
    }
}
