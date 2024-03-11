package o;

/* renamed from: o.sJ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9577sJ {
    private static long c(long j, long j2, int i, int i2) {
        return (j2 * (j ^ (j >> i))) + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long[] d(int i, int i2) {
        long[] jArr = new long[4];
        jArr[0] = (i2 & 4294967295L) | ((i & 4294967295L) << 32);
        for (int i3 = 1; i3 < 4; i3++) {
            jArr[i3] = e(jArr[i3 - 1], i3);
        }
        return jArr;
    }

    private static long e(long j, int i) {
        return c(j, 1812433253L, 30, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(long[] jArr, long[] jArr2, int i) {
        long j = jArr2[(i + 2) % 4];
        int i2 = (i + 3) % 4;
        jArr2[i2] = ((jArr[i2] * 2147483085) + j) / 2147483647L;
        jArr[i2] = ((jArr[i % 4] * 2147483085) + j) % 2147483647L;
    }
}
