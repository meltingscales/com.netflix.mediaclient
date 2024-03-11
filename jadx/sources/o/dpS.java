package o;

/* loaded from: classes5.dex */
public final class dpS {
    public static final double b(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    public static final int c(int i, int i2) {
        return C8632dsu.d(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    public static final int b(long j, long j2) {
        return C8632dsu.a(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    public static final String d(long j) {
        return a(j, 10);
    }

    public static final String a(long j, int i) {
        int c;
        int c2;
        int c3;
        if (j >= 0) {
            c3 = C8672dug.c(i);
            String l = Long.toString(j, c3);
            C8632dsu.a(l, "");
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        c = C8672dug.c(i);
        String l2 = Long.toString(j3, c);
        C8632dsu.a(l2, "");
        sb.append(l2);
        c2 = C8672dug.c(i);
        String l3 = Long.toString(j4, c2);
        C8632dsu.a(l3, "");
        sb.append(l3);
        return sb.toString();
    }
}
