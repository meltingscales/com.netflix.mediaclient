package o;

/* loaded from: classes2.dex */
public final class AB implements InterfaceC9037hy {
    private final c d;
    private final String e;

    public final String c() {
        return this.e;
    }

    public final c e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AB) {
            AB ab = (AB) obj;
            return C8632dsu.c((Object) this.e, (Object) ab.e) && C8632dsu.c(this.d, ab.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        c cVar = this.d;
        return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        String str = this.e;
        c cVar = this.d;
        return "AlertDialogActionFragment(__typename=" + str + ", label=" + cVar + ")";
    }

    public AB(String str, c cVar) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.d = cVar;
    }

    /* loaded from: classes2.dex */
    public static final class c {
        private final String b;
        private final BG c;

        public final String b() {
            return this.b;
        }

        public final BG c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.b;
            BG bg = this.c;
            return "Label(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public c(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.b = str;
            this.c = bg;
        }
    }
}
