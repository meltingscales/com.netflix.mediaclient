package o;

/* renamed from: o.afX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2399afX implements InterfaceC9037hy {
    private final String c;
    private final C2529ahm d;

    public final C2529ahm a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2399afX) {
            C2399afX c2399afX = (C2399afX) obj;
            return C8632dsu.c((Object) this.c, (Object) c2399afX.c) && C8632dsu.c(this.d, c2399afX.d);
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.c;
        C2529ahm c2529ahm = this.d;
        return "LolomoDefaultRow(__typename=" + str + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2399afX(String str, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.c = str;
        this.d = c2529ahm;
    }
}
