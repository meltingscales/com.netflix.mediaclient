package o;

/* loaded from: classes2.dex */
public final class AW implements InterfaceC9037hy {
    private final String a;
    private final String c;

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AW) {
            AW aw = (AW) obj;
            return C8632dsu.c((Object) this.c, (Object) aw.c) && C8632dsu.c((Object) this.a, (Object) aw.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.c;
        String str2 = this.a;
        return "ColorFragment(__typename=" + str + ", token=" + str2 + ")";
    }

    public AW(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.c = str;
        this.a = str2;
    }
}
