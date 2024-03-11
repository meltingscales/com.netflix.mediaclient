package o;

/* renamed from: o.dgV  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8231dgV {
    public static final C8231dgV e = new C8231dgV();

    public final int e(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (i == 0) {
            return (int) (i3 * (i2 / i4));
        } else if (i2 == 0) {
            return i;
        } else {
            double d = i4 / i3;
            double d2 = i2;
            return ((double) i) * d > d2 ? (int) (d2 / d) : i;
        }
    }

    private C8231dgV() {
    }

    public final int d(int i, int i2, int i3, int i4) {
        double f;
        f = C8657dts.f(i / i3, i2 / i4);
        float f2 = 1.0f;
        while (2 * f2 <= f) {
            f2 *= 2.0f;
        }
        return (int) f2;
    }
}
