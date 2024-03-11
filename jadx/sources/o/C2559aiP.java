package o;

/* renamed from: o.aiP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2559aiP implements InterfaceC9037hy {
    private final int a;
    private final String b;
    private final c c;

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final c e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2559aiP) {
            C2559aiP c2559aiP = (C2559aiP) obj;
            return C8632dsu.c((Object) this.b, (Object) c2559aiP.b) && this.a == c2559aiP.a && C8632dsu.c(this.c, c2559aiP.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = Integer.hashCode(this.a);
        c cVar = this.c;
        return (((hashCode * 31) + hashCode2) * 31) + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        String str = this.b;
        int i = this.a;
        c cVar = this.c;
        return "TallPanelVideoArtwork(__typename=" + str + ", videoId=" + i + ", tallPanelImage=" + cVar + ")";
    }

    public C2559aiP(String str, int i, c cVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.a = i;
        this.c = cVar;
    }

    /* renamed from: o.aiP$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final String c;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c((Object) this.c, (Object) cVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.b;
            String str3 = this.c;
            return "TallPanelImage(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public c(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = str2;
            this.c = str3;
        }
    }
}
