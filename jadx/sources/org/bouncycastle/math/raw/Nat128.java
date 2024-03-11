package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
public abstract class Nat128 {
    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static int[] create() {
        return new int[4];
    }

    public static long[] create64() {
        return new long[2];
    }

    public static int[] createExt() {
        return new int[8];
    }

    public static long[] createExt64() {
        return new long[4];
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        for (int i = 0; i < 4; i++) {
            create[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static int getBit(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 4) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        return jArr[0] == 1 && jArr[1] == 0;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        int i = 1;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr[0] & 4294967295L;
        long j6 = j5 * j;
        iArr3[0] = (int) j6;
        long j7 = (j6 >>> 32) + (j5 * j2);
        iArr3[1] = (int) j7;
        long j8 = (j7 >>> 32) + (j5 * j3);
        iArr3[2] = (int) j8;
        long j9 = (j8 >>> 32) + (j5 * j4);
        iArr3[3] = (int) j9;
        iArr3[4] = (int) (j9 >>> 32);
        for (int i2 = 4; i < i2; i2 = 4) {
            long j10 = iArr[i] & 4294967295L;
            long j11 = (j10 * j) + (iArr3[i] & 4294967295L);
            iArr3[i] = (int) j11;
            int i3 = i + 1;
            long j12 = (j11 >>> 32) + (j10 * j2) + (iArr3[i3] & 4294967295L);
            iArr3[i3] = (int) j12;
            int i4 = i + 2;
            int i5 = i;
            long j13 = (j12 >>> 32) + (j10 * j3) + (iArr3[i4] & 4294967295L);
            iArr3[i4] = (int) j13;
            int i6 = i5 + 3;
            long j14 = (j13 >>> 32) + (j10 * j4) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j14;
            iArr3[i5 + 4] = (int) (j14 >>> 32);
            i = i3;
            j = j;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2];
        long j4 = iArr2[3];
        long j5 = 0;
        while (i4 < 4) {
            long j6 = iArr[i4] & 4294967295L;
            long j7 = j5;
            long j8 = (iArr3[i4] & 4294967295L) + (j6 * j);
            iArr3[i4] = (int) j8;
            int i5 = i4 + 1;
            long j9 = j;
            long j10 = (j8 >>> 32) + (j6 * j2) + (iArr3[i5] & 4294967295L);
            iArr3[i5] = (int) j10;
            long j11 = j2;
            long j12 = (j10 >>> 32) + ((j3 & 4294967295L) * j6) + (iArr3[i] & 4294967295L);
            iArr3[i4 + 2] = (int) j12;
            long j13 = (j12 >>> 32) + (j6 * (j4 & 4294967295L)) + (iArr3[i2] & 4294967295L);
            iArr3[i4 + 3] = (int) j13;
            long j14 = j7 + (j13 >>> 32) + (iArr3[i3] & 4294967295L);
            iArr3[i4 + 4] = (int) j14;
            j5 = j14 >>> 32;
            i4 = i5;
            j = j9;
            j2 = j11;
        }
        return (int) j5;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 8;
        int i2 = 0;
        int i3 = 3;
        while (true) {
            int i4 = i3 - 1;
            long j2 = iArr[i3] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[0] = (int) j4;
                int i5 = (int) (j4 >>> 32);
                long j5 = iArr[1] & 4294967295L;
                long j6 = iArr2[2];
                long j7 = ((j4 >>> 33) | ((i2 << 31) & 4294967295L)) + (j5 * j);
                int i6 = (int) j7;
                iArr2[1] = (i5 & 1) | (i6 << 1);
                long j8 = iArr[2] & 4294967295L;
                long j9 = iArr2[3];
                long j10 = iArr2[4];
                long j11 = (j6 & 4294967295L) + (j7 >>> 32) + (j8 * j);
                int i7 = (int) j11;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long j12 = (j9 & 4294967295L) + (j11 >>> 32) + (j8 * j5);
                long j13 = (j10 & 4294967295L) + (j12 >>> 32);
                long j14 = iArr[3] & 4294967295L;
                long j15 = (iArr2[5] & 4294967295L) + (j13 >>> 32);
                long j16 = iArr2[6];
                long j17 = (j12 & 4294967295L) + (j * j14);
                int i8 = (int) j17;
                iArr2[3] = (i8 << 1) | (i7 >>> 31);
                long j18 = (j13 & 4294967295L) + (j17 >>> 32) + (j5 * j14);
                long j19 = (j15 & 4294967295L) + (j18 >>> 32) + (j14 * j8);
                long j20 = (j16 & 4294967295L) + (j15 >>> 32) + (j19 >>> 32);
                int i9 = (int) j18;
                iArr2[4] = (i8 >>> 31) | (i9 << 1);
                int i10 = (int) (j19 & 4294967295L);
                iArr2[5] = (i9 >>> 31) | (i10 << 1);
                int i11 = (int) j20;
                iArr2[6] = (i10 >>> 31) | (i11 << 1);
                iArr2[7] = (i11 >>> 31) | ((iArr2[7] + ((int) (j20 >>> 32))) << 1);
                return;
            }
            i3 = i4;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L));
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr2[3] & 4294967295L) - (4294967295L & iArr[3]));
        iArr2[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = jArr[i];
            if (j != 0) {
                Pack.longToBigEndian(j, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }
}
