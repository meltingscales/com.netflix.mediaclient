package o;

/* loaded from: classes2.dex */
public final class BB implements InterfaceC9037hy {
    private final String b;
    private final String e;

    public final String a() {
        return this.b;
    }

    public final String c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BB) {
            BB bb = (BB) obj;
            return C8632dsu.c((Object) this.b, (Object) bb.b) && C8632dsu.c((Object) this.e, (Object) bb.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        String str = this.e;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.b;
        String str2 = this.e;
        return "LocalizedFormattedStringFragment(__typename=" + str + ", value=" + str2 + ")";
    }

    public BB(String str, String str2) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.e = str2;
    }
}
