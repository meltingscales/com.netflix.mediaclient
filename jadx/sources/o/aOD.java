package o;

/* loaded from: classes3.dex */
public final class aOD {
    private final C1255Uq a;
    private final int c;
    private boolean d;

    public final C1255Uq b() {
        return this.a;
    }

    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aOD) {
            aOD aod = (aOD) obj;
            return C8632dsu.c(this.a, aod.a) && this.c == aod.c && this.d == aod.d;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + Integer.hashCode(this.c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        C1255Uq c1255Uq = this.a;
        int i = this.c;
        boolean z = this.d;
        return "SeenDevice(device=" + c1255Uq + ", messageId=" + i + ", ackReceived=" + z + ")";
    }

    public aOD(C1255Uq c1255Uq, int i, boolean z) {
        C8632dsu.c((Object) c1255Uq, "");
        this.a = c1255Uq;
        this.c = i;
        this.d = z;
    }

    public /* synthetic */ aOD(C1255Uq c1255Uq, int i, boolean z, int i2, C8627dsp c8627dsp) {
        this(c1255Uq, i, (i2 & 4) != 0 ? false : z);
    }
}
