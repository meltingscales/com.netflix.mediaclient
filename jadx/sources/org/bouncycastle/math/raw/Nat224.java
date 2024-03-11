package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
public abstract class Nat224 {
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
        long j7 = (j6 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
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
        long j7 = (j6 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static int[] create() {
        return new int[7];
    }

    public static int[] createExt() {
        return new int[14];
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        for (int i = 0; i < 7; i++) {
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
            if (i3 < 0 || i3 >= 7) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
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
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = iArr[0] & 4294967295L;
        long j9 = j8 * j;
        iArr3[0] = (int) j9;
        long j10 = (j9 >>> 32) + (j8 * j2);
        iArr3[1] = (int) j10;
        long j11 = (j10 >>> 32) + (j8 * j3);
        iArr3[2] = (int) j11;
        long j12 = (j11 >>> 32) + (j8 * j4);
        iArr3[3] = (int) j12;
        long j13 = (j12 >>> 32) + (j8 * j5);
        iArr3[4] = (int) j13;
        long j14 = (j13 >>> 32) + (j8 * j6);
        iArr3[5] = (int) j14;
        long j15 = (j14 >>> 32) + (j8 * j7);
        iArr3[6] = (int) j15;
        iArr3[7] = (int) (j15 >>> 32);
        int i6 = 1;
        for (int i7 = 7; i6 < i7; i7 = 7) {
            long j16 = iArr[i6] & 4294967295L;
            long j17 = (j16 * j) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j17;
            int i8 = i6 + 1;
            long j18 = (j17 >>> 32) + (j16 * j2) + (iArr3[i8] & 4294967295L);
            iArr3[i8] = (int) j18;
            long j19 = (j18 >>> 32) + (j16 * j3) + (iArr3[i] & 4294967295L);
            iArr3[i6 + 2] = (int) j19;
            long j20 = (j19 >>> 32) + (j16 * j4) + (iArr3[i2] & 4294967295L);
            iArr3[i6 + 3] = (int) j20;
            long j21 = (j20 >>> 32) + (j16 * j5) + (iArr3[i3] & 4294967295L);
            iArr3[i6 + 4] = (int) j21;
            long j22 = (j21 >>> 32) + (j16 * j6) + (iArr3[i4] & 4294967295L);
            iArr3[i6 + 5] = (int) j22;
            long j23 = (j22 >>> 32) + (j16 * j7) + (iArr3[i5] & 4294967295L);
            iArr3[i6 + 6] = (int) j23;
            iArr3[i6 + 7] = (int) (j23 >>> 32);
            i6 = i8;
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
        long j13 = (j11 >>> 32) + (j * j12) + j10 + (iArr2[i3 + 5] & 4294967295L);
        iArr3[i4 + 5] = (int) j13;
        long j14 = iArr[i2 + 6] & 4294967295L;
        long j15 = (j13 >>> 32) + (j * j14) + j12 + (4294967295L & iArr2[i3 + 6]);
        iArr3[i4 + 6] = (int) j15;
        return (j15 >>> 32) + j14;
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
        return Nat.incAt(7, iArr, i2, 4);
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
        return Nat.incAt(7, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j = iArr2[0];
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2];
        long j4 = iArr2[3];
        long j5 = iArr2[4];
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = 0;
        int i7 = 0;
        while (i7 < 7) {
            long j9 = j7;
            long j10 = iArr[i7] & 4294967295L;
            long j11 = j6;
            long j12 = (iArr3[i7] & 4294967295L) + ((j & 4294967295L) * j10);
            iArr3[i7] = (int) j12;
            int i8 = i7 + 1;
            long j13 = j2;
            long j14 = (j12 >>> 32) + (j10 * j2) + (iArr3[i8] & 4294967295L);
            iArr3[i8] = (int) j14;
            long j15 = j3;
            long j16 = (j14 >>> 32) + ((j3 & 4294967295L) * j10) + (iArr3[i] & 4294967295L);
            iArr3[i7 + 2] = (int) j16;
            long j17 = (j16 >>> 32) + ((j4 & 4294967295L) * j10) + (iArr3[i2] & 4294967295L);
            iArr3[i7 + 3] = (int) j17;
            long j18 = (j17 >>> 32) + ((j5 & 4294967295L) * j10) + (iArr3[i3] & 4294967295L);
            iArr3[i7 + 4] = (int) j18;
            long j19 = (j18 >>> 32) + (j10 * j11) + (iArr3[i4] & 4294967295L);
            iArr3[i7 + 5] = (int) j19;
            long j20 = (j19 >>> 32) + (j10 * j9) + (iArr3[i5] & 4294967295L);
            iArr3[i7 + 6] = (int) j20;
            long j21 = (j20 >>> 32) + (iArr3[i6] & 4294967295L) + j8;
            iArr3[i7 + 7] = (int) j21;
            j8 = j21 >>> 32;
            i7 = i8;
            j7 = j9;
            j6 = j11;
            j4 = j4;
            j2 = j13;
            j3 = j15;
        }
        return (int) j8;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 14;
        int i2 = 0;
        int i3 = 6;
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
                iArr2[3] = (i7 >>> 31) | (i8 << 1);
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
                long j30 = (j23 & 4294967295L) + (j27 * j);
                int i10 = (int) j30;
                iArr2[5] = (i10 << 1) | (i9 >>> 31);
                long j31 = (j24 & 4294967295L) + (j30 >>> 32) + (j27 * j5);
                long j32 = (j25 & 4294967295L) + (j31 >>> 32) + (j27 * j8);
                long j33 = (j26 & 4294967295L) + (j32 >>> 32) + (j27 * j12);
                long j34 = (j28 & 4294967295L) + (j33 >>> 32) + (j27 * j19);
                long j35 = (j29 & 4294967295L) + (j28 >>> 32) + (j34 >>> 32);
                long j36 = iArr[6] & 4294967295L;
                long j37 = (iArr2[11] & 4294967295L) + (j35 >>> 32);
                long j38 = iArr2[12];
                long j39 = (j31 & 4294967295L) + (j * j36);
                int i11 = (int) j39;
                iArr2[6] = (i10 >>> 31) | (i11 << 1);
                long j40 = (j32 & 4294967295L) + (j39 >>> 32) + (j36 * j5);
                long j41 = (j40 >>> 32) + (j8 * j36) + (j33 & 4294967295L);
                long j42 = (j41 >>> 32) + (j36 * j12) + (j34 & 4294967295L);
                long j43 = (j42 >>> 32) + (j36 * j19) + (j35 & 4294967295L);
                long j44 = (j37 & 4294967295L) + (j43 >>> 32) + (j36 * j27);
                long j45 = (j37 >>> 32) + (j38 & 4294967295L) + (j44 >>> 32);
                int i12 = (int) j40;
                iArr2[7] = (i11 >>> 31) | (i12 << 1);
                int i13 = (int) j41;
                iArr2[8] = (i12 >>> 31) | (i13 << 1);
                int i14 = (int) j42;
                iArr2[9] = (i13 >>> 31) | (i14 << 1);
                int i15 = (int) j43;
                iArr2[10] = (i14 >>> 31) | (i15 << 1);
                int i16 = (int) j44;
                iArr2[11] = (i15 >>> 31) | (i16 << 1);
                int i17 = (int) j45;
                iArr2[12] = (i16 >>> 31) | (i17 << 1);
                iArr2[13] = (i17 >>> 31) | ((iArr2[13] + ((int) (j45 >>> 32))) << 1);
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
        long j5 = (j4 >> 32) + ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L));
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
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
        long j6 = (j5 >> 32) + ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L));
        iArr2[5] = (int) j6;
        long j7 = (j6 >> 32) + ((iArr2[6] & 4294967295L) - (4294967295L & iArr[6]));
        iArr2[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (6 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }
}
