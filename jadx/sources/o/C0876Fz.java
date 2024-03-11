package o;

/* renamed from: o.Fz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0876Fz implements FD {
    private final FD b;
    private final FC c;
    private final String d;

    public final FD a() {
        return this.b;
    }

    public String b() {
        return this.d;
    }

    public final FC e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0876Fz) {
            C0876Fz c0876Fz = (C0876Fz) obj;
            return C8632dsu.c((Object) this.d, (Object) c0876Fz.d) && C8632dsu.c(this.c, c0876Fz.c) && C8632dsu.c(this.b, c0876Fz.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        FC fc = this.c;
        return (((hashCode * 31) + (fc == null ? 0 : fc.hashCode())) * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.d;
        FC fc = this.c;
        FD fd = this.b;
        return "Banner(key=" + str + ", style=" + fc + ", content=" + fd + ")";
    }

    public C0876Fz(String str, FC fc, FD fd) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) fd, "");
        this.d = str;
        this.c = fc;
        this.b = fd;
    }
}
