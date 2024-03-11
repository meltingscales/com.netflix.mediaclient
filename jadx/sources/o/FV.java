package o;

/* loaded from: classes2.dex */
public final class FV implements FD {
    private final FD a;
    private final FA b;
    private final C0880Gd c;
    private final String d;
    private final FA e;
    private final String f;
    private final FC g;
    private final FC j;

    public final FA a() {
        return this.e;
    }

    public final FA b() {
        return this.b;
    }

    public final FC c() {
        return this.j;
    }

    public final FD d() {
        return this.a;
    }

    public final C0880Gd e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FV) {
            FV fv = (FV) obj;
            return C8632dsu.c((Object) this.d, (Object) fv.d) && C8632dsu.c(this.a, fv.a) && C8632dsu.c(this.c, fv.c) && C8632dsu.c((Object) this.f, (Object) fv.f) && C8632dsu.c(this.e, fv.e) && C8632dsu.c(this.b, fv.b) && C8632dsu.c(this.j, fv.j) && C8632dsu.c(this.g, fv.g);
        }
        return false;
    }

    public final FC f() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = this.a.hashCode();
        C0880Gd c0880Gd = this.c;
        int hashCode3 = c0880Gd == null ? 0 : c0880Gd.hashCode();
        String str = this.f;
        int hashCode4 = str == null ? 0 : str.hashCode();
        FA fa = this.e;
        int hashCode5 = fa == null ? 0 : fa.hashCode();
        FA fa2 = this.b;
        int hashCode6 = fa2 == null ? 0 : fa2.hashCode();
        FC fc = this.j;
        int hashCode7 = fc == null ? 0 : fc.hashCode();
        FC fc2 = this.g;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (fc2 != null ? fc2.hashCode() : 0);
    }

    public final String j() {
        return this.f;
    }

    public String toString() {
        String str = this.d;
        FD fd = this.a;
        C0880Gd c0880Gd = this.c;
        String str2 = this.f;
        FA fa = this.e;
        FA fa2 = this.b;
        FC fc = this.j;
        FC fc2 = this.g;
        return "SelectableCard(key=" + str + ", content=" + fd + ", field=" + c0880Gd + ", value=" + str2 + ", button=" + fa + ", buttonSelected=" + fa2 + ", style=" + fc + ", styleSelected=" + fc2 + ")";
    }

    public FV(String str, FD fd, C0880Gd c0880Gd, String str2, FA fa, FA fa2, FC fc, FC fc2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) fd, "");
        this.d = str;
        this.a = fd;
        this.c = c0880Gd;
        this.f = str2;
        this.e = fa;
        this.b = fa2;
        this.j = fc;
        this.g = fc2;
    }
}
