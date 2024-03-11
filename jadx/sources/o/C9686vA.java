package o;

/* renamed from: o.vA  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9686vA {
    private final int c;
    private final boolean d;
    private final boolean e;

    public final int a() {
        return this.c;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9686vA) {
            C9686vA c9686vA = (C9686vA) obj;
            return this.c == c9686vA.c && this.d == c9686vA.d && this.e == c9686vA.e;
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.c) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e);
    }

    public String toString() {
        int i = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        return "CornerConfig(radius=" + i + ", topOnly=" + z + ", bottomOnly=" + z2 + ")";
    }

    public C9686vA(int i, boolean z, boolean z2) {
        this.c = i;
        this.d = z;
        this.e = z2;
        if (z && z2) {
            throw new IllegalStateException("Only one of topOnly and bottomOnly can be set");
        }
    }

    public /* synthetic */ C9686vA(int i, boolean z, boolean z2, int i2, C8627dsp c8627dsp) {
        this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2);
    }
}
