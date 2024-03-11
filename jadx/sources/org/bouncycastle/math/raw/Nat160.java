package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
public abstract class Nat160 {
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
        return (int) (j5 >>> 32);
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
        return (int) (j5 >>> 32);
    }

    public static int[] create() {
        return new int[5];
    }

    public static int[] createExt() {
        return new int[10];
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        for (int i = 0; i < 5; i++) {
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
            if (i3 < 0 || i3 >= 5) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
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
        for (int i = 1; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 5; i++) {
            if (iArr[i] != 0) {
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
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr[0] & 4294967295L;
        long j7 = j6 * j;
        iArr3[0] = (int) j7;
        long j8 = (j7 >>> 32) + (j6 * j2);
        iArr3[1] = (int) j8;
        long j9 = (j8 >>> 32) + (j6 * j3);
        iArr3[2] = (int) j9;
        long j10 = (j9 >>> 32) + (j6 * j4);
        iArr3[3] = (int) j10;
        long j11 = (j10 >>> 32) + (j6 * j5);
        iArr3[4] = (int) j11;
        iArr3[5] = (int) (j11 >>> 32);
        for (int i2 = 5; i < i2; i2 = 5) {
            long j12 = iArr[i] & 4294967295L;
            long j13 = (j12 * j) + (iArr3[i] & 4294967295L);
            iArr3[i] = (int) j13;
            int i3 = i + 1;
            long j14 = (j13 >>> 32) + (j12 * j2) + (iArr3[i3] & 4294967295L);
            iArr3[i3] = (int) j14;
            int i4 = i + 2;
            long j15 = (j14 >>> 32) + (j12 * j3) + (iArr3[i4] & 4294967295L);
            iArr3[i4] = (int) j15;
            int i5 = i + 3;
            long j16 = (j15 >>> 32) + (j12 * j4) + (iArr3[i5] & 4294967295L);
            iArr3[i5] = (int) j16;
            int i6 = i + 4;
            long j17 = (j16 >>> 32) + (j12 * j5) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j17;
            iArr3[i + 5] = (int) (j17 >>> 32);
            i = i3;
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
        long j11 = (j9 >>> 32) + (j * j10) + j8 + (4294967295L & iArr2[i3 + 4]);
        iArr3[i4 + 4] = (int) j11;
        return (j11 >>> 32) + j10;
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
        return Nat.incAt(5, iArr, i2, 4);
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
        return Nat.incAt(5, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2];
        long j4 = iArr2[3];
        long j5 = iArr2[4];
        long j6 = 0;
        while (i5 < 5) {
            long j7 = j6;
            long j8 = iArr[i5] & 4294967295L;
            long j9 = j;
            long j10 = (j8 * j) + (iArr3[i5] & 4294967295L);
            iArr3[i5] = (int) j10;
            int i6 = i5 + 1;
            long j11 = j2;
            long j12 = (j10 >>> 32) + (j8 * j2) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j12;
            long j13 = (j12 >>> 32) + ((j3 & 4294967295L) * j8) + (iArr3[i] & 4294967295L);
            iArr3[i5 + 2] = (int) j13;
            long j14 = (j13 >>> 32) + ((j4 & 4294967295L) * j8) + (iArr3[i2] & 4294967295L);
            iArr3[i5 + 3] = (int) j14;
            long j15 = (j14 >>> 32) + (j8 * (j5 & 4294967295L)) + (iArr3[i3] & 4294967295L);
            iArr3[i5 + 4] = (int) j15;
            long j16 = j7 + (j15 >>> 32) + (iArr3[i4] & 4294967295L);
            iArr3[i5 + 5] = (int) j16;
            j6 = j16 >>> 32;
            i5 = i6;
            j = j9;
            j4 = j4;
            j2 = j11;
            j3 = j3;
        }
        return (int) j6;
    }

    public static int mulWordsAdd(int i, int i2, int[] iArr, int i3) {
        long j = ((i2 & 4294967295L) * (i & 4294967295L)) + (iArr[i3] & 4294967295L);
        iArr[i3] = (int) j;
        int i4 = i3 + 1;
        long j2 = (j >>> 32) + (4294967295L & iArr[i4]);
        iArr[i4] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(5, iArr, i3, 2);
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 10;
        int i2 = 0;
        int i3 = 4;
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
                long j10 = (j6 & 4294967295L) + (j7 >>> 32) + (j8 * j);
                int i7 = (int) j10;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long j11 = (j9 & 4294967295L) + (j10 >>> 32) + (j8 * j5);
                long j12 = (iArr2[4] & 4294967295L) + (j11 >>> 32);
                long j13 = iArr[3] & 4294967295L;
                long j14 = (iArr2[5] & 4294967295L) + (j12 >>> 32);
                long j15 = iArr2[6];
                long j16 = (j11 & 4294967295L) + (j13 * j);
                int i8 = (int) j16;
                iArr2[3] = (i8 << 1) | (i7 >>> 31);
                long j17 = (j12 & 4294967295L) + (j16 >>> 32) + (j13 * j5);
                long j18 = (j14 & 4294967295L) + (j17 >>> 32) + (j13 * j8);
                long j19 = (j15 & 4294967295L) + (j14 >>> 32) + (j18 >>> 32);
                long j20 = iArr[4] & 4294967295L;
                long j21 = (iArr2[7] & 4294967295L) + (j19 >>> 32);
                long j22 = iArr2[8];
                long j23 = (j17 & 4294967295L) + (j * j20);
                int i9 = (int) j23;
                iArr2[4] = (i8 >>> 31) | (i9 << 1);
                long j24 = (j18 & 4294967295L) + (j23 >>> 32) + (j5 * j20);
                long j25 = (j19 & 4294967295L) + (j24 >>> 32) + (j8 * j20);
                long j26 = (j21 & 4294967295L) + (j25 >>> 32) + (j20 * j13);
                long j27 = (4294967295L & j22) + (j21 >>> 32) + (j26 >>> 32);
                int i10 = (int) j24;
                iArr2[5] = (i9 >>> 31) | (i10 << 1);
                int i11 = (int) j25;
                iArr2[6] = (i10 >>> 31) | (i11 << 1);
                int i12 = (int) j26;
                iArr2[7] = (i11 >>> 31) | (i12 << 1);
                int i13 = (int) j27;
                iArr2[8] = (i12 >>> 31) | (i13 << 1);
                iArr2[9] = (i13 >>> 31) | ((iArr2[9] + ((int) (j27 >>> 32))) << 1);
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
        return (int) (j5 >> 32);
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
        long j5 = (j4 >> 32) + ((iArr2[4] & 4294967295L) - (4294967295L & iArr[4]));
        iArr2[4] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (4 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }
}
