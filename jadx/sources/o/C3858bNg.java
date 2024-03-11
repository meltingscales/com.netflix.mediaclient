package o;

/* renamed from: o.bNg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3858bNg {
    private final boolean d;

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3858bNg) && this.d == ((C3858bNg) obj).d;
    }

    public int hashCode() {
        return Boolean.hashCode(this.d);
    }

    public String toString() {
        boolean z = this.d;
        return "GameControllerBeaconRepoConfig(enableChecks=" + z + ")";
    }

    public C3858bNg(boolean z) {
        this.d = z;
    }
}
