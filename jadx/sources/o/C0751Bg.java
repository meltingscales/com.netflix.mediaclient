package o;

/* renamed from: o.Bg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0751Bg implements InterfaceC9037hy {
    private final BU b;
    private final AI c;
    private final String d;

    public final String c() {
        return this.d;
    }

    public final BU d() {
        return this.b;
    }

    public final AI e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0751Bg) {
            C0751Bg c0751Bg = (C0751Bg) obj;
            return C8632dsu.c((Object) this.d, (Object) c0751Bg.d) && C8632dsu.c(this.b, c0751Bg.b) && C8632dsu.c(this.c, c0751Bg.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        BU bu = this.b;
        int hashCode2 = bu == null ? 0 : bu.hashCode();
        AI ai = this.c;
        return (((hashCode * 31) + hashCode2) * 31) + (ai != null ? ai.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        BU bu = this.b;
        AI ai = this.c;
        return "FieldFragment(__typename=" + str + ", stringFieldFragment=" + bu + ", booleanFieldFragment=" + ai + ")";
    }

    public C0751Bg(String str, BU bu, AI ai) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.b = bu;
        this.c = ai;
    }
}
