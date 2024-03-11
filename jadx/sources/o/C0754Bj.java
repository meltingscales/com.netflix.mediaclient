package o;

/* renamed from: o.Bj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0754Bj implements InterfaceC9037hy {
    private final d b;
    private final String d;

    public final String a() {
        return this.d;
    }

    public final d b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0754Bj) {
            C0754Bj c0754Bj = (C0754Bj) obj;
            return C8632dsu.c((Object) this.d, (Object) c0754Bj.d) && C8632dsu.c(this.b, c0754Bj.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        d dVar = this.b;
        return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        String str = this.d;
        d dVar = this.b;
        return "HorizontalDividerFragment(__typename=" + str + ", color=" + dVar + ")";
    }

    public C0754Bj(String str, d dVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.b = dVar;
    }

    /* renamed from: o.Bj$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private final AW c;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final AW d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.e;
            AW aw = this.c;
            return "Color(__typename=" + str + ", colorFragment=" + aw + ")";
        }

        public d(String str, AW aw) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) aw, "");
            this.e = str;
            this.c = aw;
        }
    }
}
