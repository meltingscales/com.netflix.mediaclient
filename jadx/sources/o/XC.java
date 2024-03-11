package o;

/* loaded from: classes.dex */
public final class XC {
    private final int a;
    private final String c;
    private final String d;

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof XC) {
            XC xc = (XC) obj;
            return C8632dsu.c((Object) this.d, (Object) xc.d) && C8632dsu.c((Object) this.c, (Object) xc.c) && this.a == xc.a;
        }
        return false;
    }

    public int hashCode() {
        return (((this.d.hashCode() * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.a);
    }

    public String toString() {
        String str = this.d;
        String str2 = this.c;
        int i = this.a;
        return "ABTestAllocation(name=" + str + ", id=" + str2 + ", cell=" + i + ")";
    }

    public XC(String str, String str2, int i) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.d = str;
        this.c = str2;
        this.a = i;
    }
}
