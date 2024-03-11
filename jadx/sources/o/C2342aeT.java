package o;

/* renamed from: o.aeT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2342aeT implements InterfaceC9037hy {
    private final e b;
    private final String d;

    public final e c() {
        return this.b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2342aeT) {
            C2342aeT c2342aeT = (C2342aeT) obj;
            return C8632dsu.c((Object) this.d, (Object) c2342aeT.d) && C8632dsu.c(this.b, c2342aeT.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        e eVar = this.b;
        return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
    }

    public String toString() {
        String str = this.d;
        e eVar = this.b;
        return "GameLolomoArtwork(__typename=" + str + ", artwork=" + eVar + ")";
    }

    public C2342aeT(String str, e eVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.b = eVar;
    }

    /* renamed from: o.aeT$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final String c;
        private final String d;

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c((Object) this.d, (Object) eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.b;
            String str3 = this.d;
            return "Artwork(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public e(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = str2;
            this.d = str3;
        }
    }
}
