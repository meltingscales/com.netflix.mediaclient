package o;

/* renamed from: o.adE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2274adE implements InterfaceC9037hy {
    private final b a;
    private final String b;

    public final b b() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2274adE) {
            C2274adE c2274adE = (C2274adE) obj;
            return C8632dsu.c((Object) this.b, (Object) c2274adE.b) && C8632dsu.c(this.a, c2274adE.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        b bVar = this.a;
        return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        String str = this.b;
        b bVar = this.a;
        return "CollectTasteVideoBoxArt(__typename=" + str + ", boxArt=" + bVar + ")";
    }

    public C2274adE(String str, b bVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.a = bVar;
    }

    /* renamed from: o.adE$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final String c;
        private final String e;

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c((Object) this.e, (Object) bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.c;
            String str3 = this.e;
            return "BoxArt(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public b(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = str2;
            this.e = str3;
        }
    }
}
