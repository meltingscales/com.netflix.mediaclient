package o;

/* renamed from: o.agf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2469agf implements InterfaceC9037hy {
    private final String a;
    private final C2529ahm c;

    public final String d() {
        return this.a;
    }

    public final C2529ahm e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2469agf) {
            C2469agf c2469agf = (C2469agf) obj;
            return C8632dsu.c((Object) this.a, (Object) c2469agf.a) && C8632dsu.c(this.c, c2469agf.c);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        C2529ahm c2529ahm = this.c;
        return "LolomoFavoriteTitlesRow(__typename=" + str + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2469agf(String str, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.a = str;
        this.c = c2529ahm;
    }
}
