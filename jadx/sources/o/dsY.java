package o;

/* loaded from: classes5.dex */
public final class dsY {
    public static final int e(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    public static final int c(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final void a(int i, int i2) {
        if (i2 <= i) {
            throw new IllegalArgumentException(b(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    public static final String b(Object obj, Object obj2) {
        C8632dsu.c(obj, "");
        C8632dsu.c(obj2, "");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }
}
