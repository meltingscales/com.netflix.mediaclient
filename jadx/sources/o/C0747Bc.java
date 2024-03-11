package o;

/* renamed from: o.Bc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0747Bc implements InterfaceC9037hy {
    private final String b;
    private final String e;

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0747Bc) {
            C0747Bc c0747Bc = (C0747Bc) obj;
            return C8632dsu.c((Object) this.b, (Object) c0747Bc.b) && C8632dsu.c((Object) this.e, (Object) c0747Bc.e);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.b;
        String str2 = this.e;
        return "DesignSpaceSizeFragment(__typename=" + str + ", token=" + str2 + ")";
    }

    public C0747Bc(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.b = str;
        this.e = str2;
    }
}
