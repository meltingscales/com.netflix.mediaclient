package o;

/* loaded from: classes4.dex */
public final class cJW {
    private final int a;
    private final boolean b;
    private final int c;
    private final boolean d;
    private final boolean e;

    public cJW() {
        this(0, false, 0, false, false, 31, null);
    }

    public static /* synthetic */ cJW c(cJW cjw, int i, boolean z, int i2, boolean z2, boolean z3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cjw.c;
        }
        if ((i3 & 2) != 0) {
            z = cjw.b;
        }
        boolean z4 = z;
        if ((i3 & 4) != 0) {
            i2 = cjw.a;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            z2 = cjw.e;
        }
        boolean z5 = z2;
        if ((i3 & 16) != 0) {
            z3 = cjw.d;
        }
        return cjw.c(i, z4, i4, z5, z3);
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final cJW c(int i, boolean z, int i2, boolean z2, boolean z3) {
        return new cJW(i, z, i2, z2, z3);
    }

    public final boolean d() {
        return this.d;
    }

    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cJW) {
            cJW cjw = (cJW) obj;
            return this.c == cjw.c && this.b == cjw.b && this.a == cjw.a && this.e == cjw.e && this.d == cjw.d;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.c) * 31) + Boolean.hashCode(this.b)) * 31) + Integer.hashCode(this.a)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        int i = this.c;
        boolean z = this.b;
        int i2 = this.a;
        boolean z2 = this.e;
        boolean z3 = this.d;
        return "PlayerSeekbarBifState(progressMs=" + i + ", shouldShow=" + z + ", xPosition=" + i2 + ", isLiveEdge=" + z2 + ", isLiveMode=" + z3 + ")";
    }

    public cJW(int i, boolean z, int i2, boolean z2, boolean z3) {
        this.c = i;
        this.b = z;
        this.a = i2;
        this.e = z2;
        this.d = z3;
    }

    public /* synthetic */ cJW(int i, boolean z, int i2, boolean z2, boolean z3, int i3, C8627dsp c8627dsp) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) == 0 ? z2 : false, (i3 & 16) != 0 ? true : z3);
    }
}
