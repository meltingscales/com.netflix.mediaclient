package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
public abstract class Nat192 {
    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
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
        long j5 = (j4 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (i3 & 4294967295L) + (iArr[i] & 4294967295L) + (iArr2[i2] & 4294967295L);
        iArr2[i2] = (int) j;
        int i4 = i2 + 1;
        long j2 = (j >>> 32) + (iArr[i + 1] & 4294967295L) + (iArr2[i4] & 4294967295L);
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (j2 >>> 32) + (iArr[i + 2] & 4294967295L) + (iArr2[i5] & 4294967295L);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (j3 >>> 32) + (iArr[i + 3] & 4294967295L) + (iArr2[i6] & 4294967295L);
        iArr2[i6] = (int) j4;
        int i7 = i2 + 4;
        long j5 = (j4 >>> 32) + (iArr[i + 4] & 4294967295L) + (iArr2[i7] & 4294967295L);
        iArr2[i7] = (int) j5;
        int i8 = i2 + 5;
        long j6 = (j5 >>> 32) + (iArr[i + 5] & 4294967295L) + (4294967295L & iArr2[i8]);
        iArr2[i8] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (iArr[i] & 4294967295L) + (iArr2[i2] & 4294967295L);
        int i3 = (int) j;
        iArr[i] = i3;
        iArr2[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        long j2 = (j >>> 32) + (iArr[i4] & 4294967295L) + (iArr2[i5] & 4294967295L);
        int i6 = (int) j2;
        iArr[i4] = i6;
        iArr2[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        long j3 = (j2 >>> 32) + (iArr[i7] & 4294967295L) + (iArr2[i8] & 4294967295L);
        int i9 = (int) j3;
        iArr[i7] = i9;
        iArr2[i8] = i9;
        int i10 = i + 3;
        int i11 = i2 + 3;
        long j4 = (j3 >>> 32) + (iArr[i10] & 4294967295L) + (iArr2[i11] & 4294967295L);
        int i12 = (int) j4;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        int i13 = i + 4;
        int i14 = i2 + 4;
        long j5 = (j4 >>> 32) + (iArr[i13] & 4294967295L) + (iArr2[i14] & 4294967295L);
        int i15 = (int) j5;
        iArr[i13] = i15;
        iArr2[i14] = i15;
        int i16 = i + 5;
        int i17 = i2 + 5;
        long j6 = (j5 >>> 32) + (iArr[i16] & 4294967295L) + (4294967295L & iArr2[i17]);
        int i18 = (int) j6;
        iArr[i16] = i18;
        iArr2[i17] = i18;
        return (int) (j6 >>> 32);
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static int[] create() {
        return new int[6];
    }

    public static long[] create64() {
        return new long[3];
    }

    public static int[] createExt() {
        return new int[12];
    }

    public static long[] createExt64() {
        return new long[6];
    }

    public static boolean diff(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean gte = gte(iArr, i, iArr2, i2);
        if (gte) {
            sub(iArr, i, iArr2, i2, iArr3, i3);
        } else {
            sub(iArr2, i2, iArr, i, iArr3, i3);
        }
        return gte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        for (int i = 0; i < 6; i++) {
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
            if (i3 < 0 || i3 >= 6) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 5; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ iArr2[i2 + i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
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
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j = iArr2[i2] & 4294967295L;
        long j2 = iArr2[i2 + 1] & 4294967295L;
        long j3 = iArr2[i2 + 2] & 4294967295L;
        long j4 = iArr2[i2 + 3] & 4294967295L;
        long j5 = iArr2[i2 + 4] & 4294967295L;
        long j6 = iArr2[i2 + 5] & 4294967295L;
        long j7 = iArr[i] & 4294967295L;
        long j8 = j7 * j;
        iArr3[i3] = (int) j8;
        long j9 = (j8 >>> 32) + (j7 * j2);
        iArr3[i3 + 1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j3);
        iArr3[i3 + 2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j4);
        iArr3[i3 + 3] = (int) j11;
        long j12 = (j11 >>> 32) + (j7 * j5);
        iArr3[i3 + 4] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j6);
        iArr3[i3 + 5] = (int) j13;
        iArr3[i3 + 6] = (int) (j13 >>> 32);
        int i9 = 1;
        int i10 = i3;
        while (i9 < 6) {
            int i11 = i10 + 1;
            long j14 = iArr[i + i9] & 4294967295L;
            long j15 = j6;
            long j16 = (j14 * j) + (iArr3[i11] & 4294967295L);
            iArr3[i11] = (int) j16;
            int i12 = i9;
            long j17 = (j16 >>> 32) + (j14 * j2) + (iArr3[i4] & 4294967295L);
            iArr3[i10 + 2] = (int) j17;
            long j18 = (j17 >>> 32) + (j14 * j3) + (iArr3[i5] & 4294967295L);
            iArr3[i10 + 3] = (int) j18;
            long j19 = (j18 >>> 32) + (j14 * j4) + (iArr3[i6] & 4294967295L);
            iArr3[i10 + 4] = (int) j19;
            long j20 = (j19 >>> 32) + (j14 * j5) + (iArr3[i7] & 4294967295L);
            iArr3[i10 + 5] = (int) j20;
            long j21 = (j20 >>> 32) + (j14 * j15) + (iArr3[i8] & 4294967295L);
            iArr3[i10 + 6] = (int) j21;
            iArr3[i10 + 7] = (int) (j21 >>> 32);
            i9 = i12 + 1;
            i10 = i11;
            j6 = j15;
            j3 = j3;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr[0] & 4294967295L;
        long j8 = j7 * j;
        iArr3[0] = (int) j8;
        long j9 = (j8 >>> 32) + (j7 * j2);
        iArr3[1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j3);
        iArr3[2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j4);
        iArr3[3] = (int) j11;
        long j12 = (j11 >>> 32) + (j7 * j5);
        iArr3[4] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j6);
        iArr3[5] = (int) j13;
        iArr3[6] = (int) (j13 >>> 32);
        int i5 = 1;
        for (int i6 = 6; i5 < i6; i6 = 6) {
            long j14 = iArr[i5] & 4294967295L;
            long j15 = (j14 * j) + (iArr3[i5] & 4294967295L);
            iArr3[i5] = (int) j15;
            int i7 = i5 + 1;
            long j16 = (j15 >>> 32) + (j14 * j2) + (iArr3[i7] & 4294967295L);
            iArr3[i7] = (int) j16;
            long j17 = (j16 >>> 32) + (j14 * j3) + (iArr3[i] & 4294967295L);
            iArr3[i5 + 2] = (int) j17;
            long j18 = (j17 >>> 32) + (j14 * j4) + (iArr3[i2] & 4294967295L);
            iArr3[i5 + 3] = (int) j18;
            long j19 = (j18 >>> 32) + (j14 * j5) + (iArr3[i3] & 4294967295L);
            iArr3[i5 + 4] = (int) j19;
            long j20 = (j19 >>> 32) + (j14 * j6) + (iArr3[i4] & 4294967295L);
            iArr3[i5 + 5] = (int) j20;
            iArr3[i5 + 6] = (int) (j20 >>> 32);
            i5 = i7;
            j4 = j4;
            j = j;
            j2 = j2;
        }
    }

    public static long mul33Add(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = i & 4294967295L;
        long j2 = iArr[i2] & 4294967295L;
        long j3 = (j * j2) + (iArr2[i3] & 4294967295L);
        iArr3[i4] = (int) j3;
        long j4 = iArr[i2 + 1] & 4294967295L;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (iArr2[i3 + 1] & 4294967295L);
        iArr3[i4 + 1] = (int) j5;
        long j6 = iArr[i2 + 2] & 4294967295L;
        long j7 = (j5 >>> 32) + (j * j6) + j4 + (iArr2[i3 + 2] & 4294967295L);
        iArr3[i4 + 2] = (int) j7;
        long j8 = iArr[i2 + 3] & 4294967295L;
        long j9 = (j7 >>> 32) + (j * j8) + j6 + (iArr2[i3 + 3] & 4294967295L);
        iArr3[i4 + 3] = (int) j9;
        long j10 = iArr[i2 + 4] & 4294967295L;
        long j11 = (j9 >>> 32) + (j * j10) + j8 + (iArr2[i3 + 4] & 4294967295L);
        iArr3[i4 + 4] = (int) j11;
        long j12 = iArr[i2 + 5] & 4294967295L;
        long j13 = (j11 >>> 32) + (j * j12) + j10 + (4294967295L & iArr2[i3 + 5]);
        iArr3[i4 + 5] = (int) j13;
        return (j13 >>> 32) + j12;
    }

    public static int mul33DWordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = i & 4294967295L;
        long j3 = j & 4294967295L;
        long j4 = (j2 * j3) + (iArr[i2] & 4294967295L);
        iArr[i2] = (int) j4;
        long j5 = j >>> 32;
        int i3 = i2 + 1;
        long j6 = (j4 >>> 32) + (j2 * j5) + j3 + (iArr[i3] & 4294967295L);
        iArr[i3] = (int) j6;
        int i4 = i2 + 2;
        long j7 = (j6 >>> 32) + j5 + (iArr[i4] & 4294967295L);
        iArr[i4] = (int) j7;
        int i5 = i2 + 3;
        long j8 = (j7 >>> 32) + (4294967295L & iArr[i5]);
        iArr[i5] = (int) j8;
        if ((j8 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i2, 4);
    }

    public static int mul33WordAdd(int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        long j = i;
        long j2 = i2 & 4294967295L;
        long j3 = ((j & 4294967295L) * j2) + (iArr[i3] & 4294967295L);
        iArr[i3] = (int) j3;
        long j4 = (j3 >>> 32) + j2 + (iArr[i4] & 4294967295L);
        iArr[i3 + 1] = (int) j4;
        long j5 = (j4 >>> 32) + (4294967295L & iArr[i5]);
        iArr[i3 + 2] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2];
        long j4 = iArr2[3];
        long j5 = iArr2[4];
        long j6 = iArr2[5] & 4294967295L;
        long j7 = 0;
        while (i6 < 6) {
            long j8 = j6;
            long j9 = iArr[i6] & 4294967295L;
            long j10 = j5;
            long j11 = (iArr3[i6] & 4294967295L) + (j9 * j);
            iArr3[i6] = (int) j11;
            int i7 = i6 + 1;
            long j12 = j;
            long j13 = (j11 >>> 32) + (j9 * j2) + (iArr3[i7] & 4294967295L);
            iArr3[i7] = (int) j13;
            long j14 = j2;
            long j15 = (j13 >>> 32) + ((j3 & 4294967295L) * j9) + (iArr3[i] & 4294967295L);
            iArr3[i6 + 2] = (int) j15;
            long j16 = (j15 >>> 32) + ((j4 & 4294967295L) * j9) + (iArr3[i2] & 4294967295L);
            iArr3[i6 + 3] = (int) j16;
            long j17 = (j16 >>> 32) + ((j10 & 4294967295L) * j9) + (iArr3[i3] & 4294967295L);
            iArr3[i6 + 4] = (int) j17;
            long j18 = (j17 >>> 32) + (j9 * j8) + (iArr3[i4] & 4294967295L);
            iArr3[i6 + 5] = (int) j18;
            long j19 = (j18 >>> 32) + (iArr3[i5] & 4294967295L) + j7;
            iArr3[i6 + 6] = (int) j19;
            j7 = j19 >>> 32;
            i6 = i7;
            j6 = j8;
            j5 = j10;
            j3 = j3;
            j = j12;
            j2 = j14;
        }
        return (int) j7;
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j = iArr[i] & 4294967295L;
        int i10 = 0;
        int i11 = 12;
        int i12 = 5;
        while (true) {
            int i13 = i12 - 1;
            long j2 = iArr[i + i12] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i2 + (i11 - 1)] = (i10 << 31) | ((int) (j3 >>> 33));
            i11 -= 2;
            iArr2[i2 + i11] = (int) (j3 >>> 1);
            i10 = (int) j3;
            if (i13 <= 0) {
                long j4 = j * j;
                iArr2[i2] = (int) j4;
                long j5 = iArr[i + 1] & 4294967295L;
                long j6 = (((i10 << 31) & 4294967295L) | (j4 >>> 33)) + (j5 * j);
                int i14 = (int) j6;
                iArr2[i2 + 1] = (i14 << 1) | (((int) (j4 >>> 32)) & 1);
                long j7 = iArr[i + 2] & 4294967295L;
                int i15 = i2 + 3;
                long j8 = iArr2[i15];
                long j9 = (iArr2[i3] & 4294967295L) + (j6 >>> 32) + (j7 * j);
                int i16 = (int) j9;
                iArr2[i2 + 2] = (i16 << 1) | (i14 >>> 31);
                long j10 = (j8 & 4294967295L) + (j9 >>> 32) + (j7 * j5);
                long j11 = (iArr2[i4] & 4294967295L) + (j10 >>> 32);
                long j12 = iArr[i + 3] & 4294967295L;
                long j13 = (iArr2[i5] & 4294967295L) + (j11 >>> 32);
                int i17 = i2 + 6;
                long j14 = iArr2[i17];
                long j15 = (j10 & 4294967295L) + (j12 * j);
                int i18 = (int) j15;
                iArr2[i15] = (i18 << 1) | (i16 >>> 31);
                long j16 = (j11 & 4294967295L) + (j15 >>> 32) + (j12 * j5);
                long j17 = (j13 & 4294967295L) + (j16 >>> 32) + (j12 * j7);
                long j18 = (j14 & 4294967295L) + (j13 >>> 32) + (j17 >>> 32);
                long j19 = iArr[i + 4] & 4294967295L;
                long j20 = (iArr2[i6] & 4294967295L) + (j18 >>> 32);
                long j21 = (j16 & 4294967295L) + (j19 * j);
                int i19 = (int) j21;
                iArr2[i2 + 4] = (i19 << 1) | (i18 >>> 31);
                long j22 = (j17 & 4294967295L) + (j21 >>> 32) + (j19 * j5);
                long j23 = (j18 & 4294967295L) + (j22 >>> 32) + (j19 * j7);
                long j24 = (j20 & 4294967295L) + (j23 >>> 32) + (j19 * j12);
                long j25 = (iArr2[i7] & 4294967295L) + (j20 >>> 32) + (j24 >>> 32);
                long j26 = iArr[i + 5] & 4294967295L;
                long j27 = (iArr2[i8] & 4294967295L) + (j25 >>> 32);
                long j28 = (j22 & 4294967295L) + (j * j26);
                int i20 = (int) j28;
                iArr2[i2 + 5] = (i20 << 1) | (i19 >>> 31);
                long j29 = (j23 & 4294967295L) + (j28 >>> 32) + (j5 * j26);
                long j30 = (j24 & 4294967295L) + (j29 >>> 32) + (j26 * j7);
                long j31 = (j25 & 4294967295L) + (j30 >>> 32) + (j26 * j12);
                long j32 = (j27 & 4294967295L) + (j31 >>> 32) + (j26 * j19);
                long j33 = (iArr2[i9] & 4294967295L) + (j27 >>> 32) + (j32 >>> 32);
                int i21 = (int) j29;
                iArr2[i17] = (i20 >>> 31) | (i21 << 1);
                int i22 = (int) j30;
                iArr2[i2 + 7] = (i21 >>> 31) | (i22 << 1);
                int i23 = (int) j31;
                iArr2[i2 + 8] = (i22 >>> 31) | (i23 << 1);
                int i24 = (int) j32;
                iArr2[i2 + 9] = (i23 >>> 31) | (i24 << 1);
                int i25 = (int) j33;
                iArr2[i2 + 10] = (i24 >>> 31) | (i25 << 1);
                int i26 = i2 + 11;
                iArr2[i26] = (i25 >>> 31) | ((iArr2[i26] + ((int) (j33 >>> 32))) << 1);
                return;
            }
            i12 = i13;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 12;
        int i2 = 0;
        int i3 = 5;
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
                long j9 = (j6 & 4294967295L) + (j7 >>> 32) + (j8 * j);
                int i7 = (int) j9;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long j10 = (iArr2[3] & 4294967295L) + (j9 >>> 32) + (j8 * j5);
                long j11 = (iArr2[4] & 4294967295L) + (j10 >>> 32);
                long j12 = iArr[3] & 4294967295L;
                long j13 = (iArr2[5] & 4294967295L) + (j11 >>> 32);
                long j14 = iArr2[6];
                long j15 = (j10 & 4294967295L) + (j12 * j);
                int i8 = (int) j15;
                iArr2[3] = (i8 << 1) | (i7 >>> 31);
                long j16 = (j11 & 4294967295L) + (j15 >>> 32) + (j12 * j5);
                long j17 = (j13 & 4294967295L) + (j16 >>> 32) + (j12 * j8);
                long j18 = (j14 & 4294967295L) + (j13 >>> 32) + (j17 >>> 32);
                long j19 = iArr[4] & 4294967295L;
                long j20 = (iArr2[7] & 4294967295L) + (j18 >>> 32);
                long j21 = iArr2[8];
                long j22 = (j16 & 4294967295L) + (j19 * j);
                int i9 = (int) j22;
                iArr2[4] = (i9 << 1) | (i8 >>> 31);
                long j23 = (j17 & 4294967295L) + (j22 >>> 32) + (j19 * j5);
                long j24 = (j18 & 4294967295L) + (j23 >>> 32) + (j19 * j8);
                long j25 = (j20 & 4294967295L) + (j24 >>> 32) + (j19 * j12);
                long j26 = (j21 & 4294967295L) + (j20 >>> 32) + (j25 >>> 32);
                long j27 = iArr[5] & 4294967295L;
                long j28 = (iArr2[9] & 4294967295L) + (j26 >>> 32);
                long j29 = iArr2[10];
                long j30 = (j23 & 4294967295L) + (j * j27);
                int i10 = (int) j30;
                iArr2[5] = (i10 << 1) | (i9 >>> 31);
                long j31 = (j24 & 4294967295L) + (j30 >>> 32) + (j27 * j5);
                long j32 = (j25 & 4294967295L) + (j31 >>> 32) + (j8 * j27);
                long j33 = (j26 & 4294967295L) + (j32 >>> 32) + (j27 * j12);
                long j34 = (j28 & 4294967295L) + (j33 >>> 32) + (j27 * j19);
                long j35 = (j29 & 4294967295L) + (j28 >>> 32) + (j34 >>> 32);
                int i11 = (int) j31;
                iArr2[6] = (i10 >>> 31) | (i11 << 1);
                int i12 = (int) j32;
                iArr2[7] = (i11 >>> 31) | (i12 << 1);
                int i13 = (int) j33;
                iArr2[8] = (i12 >>> 31) | (i13 << 1);
                int i14 = (int) j34;
                iArr2[9] = (i13 >>> 31) | (i14 << 1);
                int i15 = (int) j35;
                iArr2[10] = (i14 >>> 31) | (i15 << 1);
                iArr2[11] = (i15 >>> 31) | ((iArr2[11] + ((int) (j35 >>> 32))) << 1);
                return;
            }
            i3 = i4;
        }
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (iArr[i] & 4294967295L) - (iArr2[i2] & 4294967295L);
        iArr3[i3] = (int) j;
        long j2 = (j >> 32) + ((iArr[i + 1] & 4294967295L) - (iArr2[i2 + 1] & 4294967295L));
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr[i + 2] & 4294967295L) - (iArr2[i2 + 2] & 4294967295L));
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr[i + 3] & 4294967295L) - (iArr2[i2 + 3] & 4294967295L));
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr[i + 4] & 4294967295L) - (iArr2[i2 + 4] & 4294967295L));
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr[i + 5] & 4294967295L) - (iArr2[i2 + 5] & 4294967295L));
        iArr3[i3 + 5] = (int) j6;
        return (int) (j6 >> 32);
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
        long j5 = (j4 >> 32) + ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L));
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr2[5] & 4294967295L) - (4294967295L & iArr[5]));
        iArr2[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                Pack.longToBigEndian(j, bArr, (2 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }
}
