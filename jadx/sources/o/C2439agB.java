package o;

/* renamed from: o.agB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2439agB implements InterfaceC9037hy {
    private final String a;
    private final C2529ahm e;

    public final String d() {
        return this.a;
    }

    public final C2529ahm e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2439agB) {
            C2439agB c2439agB = (C2439agB) obj;
            return C8632dsu.c((Object) this.a, (Object) c2439agB.a) && C8632dsu.c(this.e, c2439agB.e);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.a;
        C2529ahm c2529ahm = this.e;
        return "LolomoMyListRow(__typename=" + str + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2439agB(String str, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.a = str;
        this.e = c2529ahm;
    }
}
