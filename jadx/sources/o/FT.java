package o;

/* loaded from: classes2.dex */
public final class FT implements FD {
    private final String b;
    private final String e;

    public final String d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FT) {
            FT ft = (FT) obj;
            return C8632dsu.c((Object) this.b, (Object) ft.b) && C8632dsu.c((Object) this.e, (Object) ft.e);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.b;
        String str2 = this.e;
        return "LegacyUma(key=" + str + ", payload=" + str2 + ")";
    }

    public FT(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.b = str;
        this.e = str2;
    }
}
