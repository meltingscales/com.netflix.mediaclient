package o;

/* renamed from: o.drs  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8603drs {
    private static final int b(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    private static final long b(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }

    private static final int a(int i, int i2, int i3) {
        return b(b(i, i3) - b(i2, i3), i3);
    }

    private static final long e(long j, long j2, long j3) {
        return b(b(j, j3) - b(j2, j3), j3);
    }

    public static final int c(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - a(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + a(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static final long a(long j, long j2, long j3) {
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i > 0) {
            return j >= j2 ? j2 : j2 - e(j2, j, j3);
        } else if (i < 0) {
            return j <= j2 ? j2 : j2 + e(j, j2, -j3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
