package o;

/* loaded from: classes2.dex */
public final class AE implements InterfaceC9037hy {
    private final b a;
    private final a b;
    private final String c;
    private final String d;
    private final c e;
    private final e g;

    public final a a() {
        return this.b;
    }

    public final b b() {
        return this.a;
    }

    public final e c() {
        return this.g;
    }

    public final String d() {
        return this.d;
    }

    public final c e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AE) {
            AE ae = (AE) obj;
            return C8632dsu.c((Object) this.c, (Object) ae.c) && C8632dsu.c(this.g, ae.g) && C8632dsu.c(this.e, ae.e) && C8632dsu.c(this.a, ae.a) && C8632dsu.c(this.b, ae.b) && C8632dsu.c((Object) this.d, (Object) ae.d);
        }
        return false;
    }

    public final String f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        e eVar = this.g;
        int hashCode2 = eVar == null ? 0 : eVar.hashCode();
        c cVar = this.e;
        int hashCode3 = cVar == null ? 0 : cVar.hashCode();
        b bVar = this.a;
        int hashCode4 = bVar == null ? 0 : bVar.hashCode();
        a aVar = this.b;
        int hashCode5 = aVar == null ? 0 : aVar.hashCode();
        String str = this.d;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.c;
        e eVar = this.g;
        c cVar = this.e;
        b bVar = this.a;
        a aVar = this.b;
        String str2 = this.d;
        return "AlertDialogFragment(__typename=" + str + ", title=" + eVar + ", message=" + cVar + ", dismissAction=" + bVar + ", secondaryAction=" + aVar + ", errorCode=" + str2 + ")";
    }

    public AE(String str, e eVar, c cVar, b bVar, a aVar, String str2) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.g = eVar;
        this.e = cVar;
        this.a = bVar;
        this.b = aVar;
        this.d = str2;
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final String a;
        private final BG b;

        public final String b() {
            return this.a;
        }

        public final BG d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c(this.b, eVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            BG bg = this.b;
            return "Title(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public e(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.a = str;
            this.b = bg;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        private final BG c;
        private final String d;

        public final String d() {
            return this.d;
        }

        public final BG e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.d;
            BG bg = this.c;
            return "Message(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public c(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.d = str;
            this.c = bg;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private final String d;
        private final AB e;

        public final AB a() {
            return this.e;
        }

        public final String b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            AB ab = this.e;
            return "DismissAction(__typename=" + str + ", alertDialogActionFragment=" + ab + ")";
        }

        public b(String str, AB ab) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) ab, "");
            this.d = str;
            this.e = ab;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final String b;
        private final AB d;

        public final String a() {
            return this.b;
        }

        public final AB c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c(this.d, aVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.b;
            AB ab = this.d;
            return "SecondaryAction(__typename=" + str + ", alertDialogActionFragment=" + ab + ")";
        }

        public a(String str, AB ab) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) ab, "");
            this.b = str;
            this.d = ab;
        }
    }
}
