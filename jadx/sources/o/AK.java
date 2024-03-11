package o;

/* loaded from: classes2.dex */
public final class AK implements InterfaceC9037hy {
    private final String b;
    private final String e;

    public final String b() {
        return this.e;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AK) {
            AK ak = (AK) obj;
            return C8632dsu.c((Object) this.e, (Object) ak.e) && C8632dsu.c((Object) this.b, (Object) ak.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.e;
        String str2 = this.b;
        return "BorderWidthFragment(__typename=" + str + ", token=" + str2 + ")";
    }

    public AK(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.e = str;
        this.b = str2;
    }
}
