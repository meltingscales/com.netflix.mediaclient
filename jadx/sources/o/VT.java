package o;

/* loaded from: classes3.dex */
public final class VT {
    private final VN a;
    private final VZ b;
    private final VN e;

    public final VN a() {
        return this.a;
    }

    public final VN d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VT) {
            VT vt = (VT) obj;
            return C8632dsu.c(this.b, vt.b) && C8632dsu.c(this.a, vt.a) && C8632dsu.c(this.e, vt.e);
        }
        return false;
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        VZ vz = this.b;
        VN vn = this.a;
        VN vn2 = this.e;
        return "ProfileMismatchData(targetDeviceData=" + vz + ", targetProfileData=" + vn + ", currentProfileData=" + vn2 + ")";
    }

    public VT(VZ vz, VN vn, VN vn2) {
        C8632dsu.c((Object) vz, "");
        C8632dsu.c((Object) vn, "");
        C8632dsu.c((Object) vn2, "");
        this.b = vz;
        this.a = vn;
        this.e = vn2;
    }
}
