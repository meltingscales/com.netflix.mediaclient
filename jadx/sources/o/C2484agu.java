package o;

/* renamed from: o.agu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2484agu implements InterfaceC9037hy {
    private final C2529ahm b;
    private final String c;

    public final C2529ahm c() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2484agu) {
            C2484agu c2484agu = (C2484agu) obj;
            return C8632dsu.c((Object) this.c, (Object) c2484agu.c) && C8632dsu.c(this.b, c2484agu.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.c;
        C2529ahm c2529ahm = this.b;
        return "LolomoGenreGalleryRow(__typename=" + str + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2484agu(String str, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.c = str;
        this.b = c2529ahm;
    }
}
