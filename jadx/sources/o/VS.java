package o;

/* loaded from: classes3.dex */
public final class VS {
    private final VZ c;

    public final VZ d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VS) && C8632dsu.c(this.c, ((VS) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        VZ vz = this.c;
        return "ImplicitDeviceData(targetDeviceData=" + vz + ")";
    }

    public VS(VZ vz) {
        C8632dsu.c((Object) vz, "");
        this.c = vz;
    }
}
