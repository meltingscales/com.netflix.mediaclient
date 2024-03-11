package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class dAI {
    public static final boolean c(String str, boolean z) {
        String c = dAL.c(str);
        return c != null ? Boolean.parseBoolean(c) : z;
    }

    public static /* synthetic */ int c(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return dAL.c(str, i, i2, i3);
    }

    public static final int a(String str, int i, int i2, int i3) {
        return (int) dAL.e(str, i, i2, i3);
    }

    public static /* synthetic */ long b(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return dAL.e(str, j, j4, j3);
    }

    public static final long a(String str, long j, long j2, long j3) {
        Long m;
        String c = dAL.c(str);
        if (c == null) {
            return j;
        }
        m = C8689dux.m(c);
        if (m == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + c + '\'').toString());
        }
        long longValue = m.longValue();
        if (j2 > longValue || longValue > j3) {
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        return longValue;
    }

    public static final String c(String str, String str2) {
        String c = dAL.c(str);
        return c == null ? str2 : c;
    }
}
