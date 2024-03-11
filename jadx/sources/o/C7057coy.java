package o;

/* renamed from: o.coy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7057coy {
    private final boolean b;
    private final boolean d;

    public static /* synthetic */ C7057coy e(C7057coy c7057coy, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c7057coy.d;
        }
        if ((i & 2) != 0) {
            z2 = c7057coy.b;
        }
        return c7057coy.d(z, z2);
    }

    public final boolean b() {
        return this.d;
    }

    public final C7057coy d(boolean z, boolean z2) {
        return new C7057coy(z, z2);
    }

    public final boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7057coy) {
            C7057coy c7057coy = (C7057coy) obj;
            return this.d == c7057coy.d && this.b == c7057coy.b;
        }
        return false;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.d) * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        boolean z = this.d;
        boolean z2 = this.b;
        return "EditModeIconVisibilityState(visibleForGameTab=" + z + ", visibleForVideoTab=" + z2 + ")";
    }

    public C7057coy(boolean z, boolean z2) {
        this.d = z;
        this.b = z2;
    }
}
