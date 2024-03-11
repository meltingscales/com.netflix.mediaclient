package o;

/* loaded from: classes.dex */
public final class aPY {
    private final boolean a;
    private final boolean d;
    private final boolean e;

    public final boolean b() {
        return this.d;
    }

    public final boolean d() {
        return this.a;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aPY) {
            aPY apy = (aPY) obj;
            return this.e == apy.e && this.d == apy.d && this.a == apy.a;
        }
        return false;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.e) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.a);
    }

    public String toString() {
        boolean z = this.e;
        boolean z2 = this.d;
        boolean z3 = this.a;
        return "WidevineCryptoConfig(isWidevineL1Enabled=" + z + ", isWidevineL3SystemId4266Supported=" + z2 + ", isWidevineL1ReEnabled=" + z3 + ")";
    }

    public aPY(boolean z, boolean z2, boolean z3) {
        this.e = z;
        this.d = z2;
        this.a = z3;
    }
}
