package o;

/* renamed from: o.ii  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9074ii {
    public static final int e(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        throw new IllegalStateException((j + " cannot be converted to Int").toString());
    }

    public static final int a(double d) {
        int i = (int) d;
        if (i == d) {
            return i;
        }
        throw new IllegalStateException((d + " cannot be converted to Int").toString());
    }

    public static final double d(long j) {
        double d = j;
        if (((long) d) == j) {
            return d;
        }
        throw new IllegalStateException((j + " cannot be converted to Double").toString());
    }

    public static final long b(double d) {
        long j = (long) d;
        if (j == d) {
            return j;
        }
        throw new IllegalStateException((d + " cannot be converted to Long").toString());
    }
}
