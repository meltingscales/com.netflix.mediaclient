package o;

/* renamed from: o.afR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2393afR implements InterfaceC9037hy {
    private final C2529ahm b;
    private final String d;

    public final String a() {
        return this.d;
    }

    public final C2529ahm d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2393afR) {
            C2393afR c2393afR = (C2393afR) obj;
            return C8632dsu.c((Object) this.d, (Object) c2393afR.d) && C8632dsu.c(this.b, c2393afR.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.d;
        C2529ahm c2529ahm = this.b;
        return "LolomoComingSoonRow(__typename=" + str + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2393afR(String str, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.d = str;
        this.b = c2529ahm;
    }
}
