package o;

/* renamed from: o.Cg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0779Cg implements InterfaceC9037hy {
    private final String b;
    private final String d;

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0779Cg) {
            C0779Cg c0779Cg = (C0779Cg) obj;
            return C8632dsu.c((Object) this.d, (Object) c0779Cg.d) && C8632dsu.c((Object) this.b, (Object) c0779Cg.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.d;
        String str2 = this.b;
        return "TypographyFragment(__typename=" + str + ", token=" + str2 + ")";
    }

    public C0779Cg(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.d = str;
        this.b = str2;
    }
}
