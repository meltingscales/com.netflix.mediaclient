package o;

/* loaded from: classes2.dex */
public final class AL implements InterfaceC9037hy {
    private final String b;
    private final String c;

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AL) {
            AL al = (AL) obj;
            return C8632dsu.c((Object) this.c, (Object) al.c) && C8632dsu.c((Object) this.b, (Object) al.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.c;
        String str2 = this.b;
        return "BorderRadiusFragment(__typename=" + str + ", token=" + str2 + ")";
    }

    public AL(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.c = str;
        this.b = str2;
    }
}
