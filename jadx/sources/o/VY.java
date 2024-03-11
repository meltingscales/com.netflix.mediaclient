package o;

/* loaded from: classes3.dex */
public final class VY {
    private final VZ b;

    public final VZ a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VY) && C8632dsu.c(this.b, ((VY) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        VZ vz = this.b;
        return "PromptedDeviceData(targetDeviceData=" + vz + ")";
    }

    public VY(VZ vz) {
        C8632dsu.c((Object) vz, "");
        this.b = vz;
    }
}
