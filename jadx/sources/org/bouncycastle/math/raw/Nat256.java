package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes6.dex */
public abstract class Nat256 {
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
        long j8 = (j7 >>> 32) + (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
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
        long j8 = (j7 >>> 32) + (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (iArr3[7] & 4294967295L);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
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
        long j6 = (j5 >>> 32) + (iArr[i + 5] & 4294967295L) + (iArr2[i8] & 4294967295L);
        iArr2[i8] = (int) j6;
        int i9 = i2 + 6;
        long j7 = (j6 >>> 32) + (iArr[i + 6] & 4294967295L) + (iArr2[i9] & 4294967295L);
        iArr2[i9] = (int) j7;
        int i10 = i2 + 7;
        long j8 = (j7 >>> 32) + (iArr[i + 7] & 4294967295L) + (4294967295L & iArr2[i10]);
        iArr2[i10] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr2[3] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L);
        iArr2[4] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L);
        iArr2[5] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L);
        iArr2[6] = (int) j7;
        long j8 = (j7 >>> 32) + (iArr[7] & 4294967295L) + (4294967295L & iArr2[7]);
        iArr2[7] = (int) j8;
        return (int) (j8 >>> 32);
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
        long j6 = (j5 >>> 32) + (iArr[i16] & 4294967295L) + (iArr2[i17] & 4294967295L);
        int i18 = (int) j6;
        iArr[i16] = i18;
        iArr2[i17] = i18;
        int i19 = i + 6;
        int i20 = i2 + 6;
        long j7 = (j6 >>> 32) + (iArr[i19] & 4294967295L) + (iArr2[i20] & 4294967295L);
        int i21 = (int) j7;
        iArr[i19] = i21;
        iArr2[i20] = i21;
        int i22 = i + 7;
        int i23 = i2 + 7;
        long j8 = (j7 >>> 32) + (iArr[i22] & 4294967295L) + (4294967295L & iArr2[i23]);
        int i24 = (int) j8;
        iArr[i22] = i24;
        iArr2[i23] = i24;
        return (int) (j8 >>> 32);
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static long[] createExt64() {
        return new long[8];
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
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        for (int i = 0; i < 8; i++) {
            create[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static int getBit(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else if ((i & PrivateKeyType.INVALID) != i) {
            return 0;
        } else {
            i2 = iArr[i >>> 5] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 7; i3 >= 0; i3--) {
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
        for (int i = 7; i >= 0; i--) {
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
        for (int i = 1; i < 8; i++) {
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
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 4; i++) {
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
        int i9;
        int i10;
        long j = iArr2[i2] & 4294967295L;
        long j2 = iArr2[i2 + 1] & 4294967295L;
        long j3 = iArr2[i2 + 2] & 4294967295L;
        long j4 = iArr2[i2 + 3] & 4294967295L;
        long j5 = iArr2[i2 + 4] & 4294967295L;
        long j6 = iArr2[i2 + 5] & 4294967295L;
        long j7 = iArr2[i2 + 6] & 4294967295L;
        long j8 = iArr2[i2 + 7];
        long j9 = iArr[i] & 4294967295L;
        long j10 = j9 * j;
        iArr3[i3] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j2);
        iArr3[i3 + 1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j3);
        iArr3[i3 + 2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j4);
        iArr3[i3 + 3] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j5);
        iArr3[i3 + 4] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j6);
        iArr3[i3 + 5] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j7);
        iArr3[i3 + 6] = (int) j16;
        long j17 = j8 & 4294967295L;
        long j18 = (j16 >>> 32) + (j9 * j17);
        iArr3[i3 + 7] = (int) j18;
        iArr3[i3 + 8] = (int) (j18 >>> 32);
        int i11 = 1;
        int i12 = i3;
        while (i11 < 8) {
            int i13 = i12 + 1;
            long j19 = iArr[i + i11] & 4294967295L;
            long j20 = j17;
            long j21 = (j19 * j) + (iArr3[i13] & 4294967295L);
            iArr3[i13] = (int) j21;
            int i14 = i11;
            long j22 = (j21 >>> 32) + (j19 * j2) + (iArr3[i4] & 4294967295L);
            iArr3[i12 + 2] = (int) j22;
            long j23 = (j22 >>> 32) + (j19 * j3) + (iArr3[i5] & 4294967295L);
            iArr3[i12 + 3] = (int) j23;
            long j24 = (j23 >>> 32) + (j19 * j4) + (iArr3[i6] & 4294967295L);
            iArr3[i12 + 4] = (int) j24;
            long j25 = (j24 >>> 32) + (j19 * j5) + (iArr3[i7] & 4294967295L);
            iArr3[i12 + 5] = (int) j25;
            long j26 = (j25 >>> 32) + (j19 * j6) + (iArr3[i8] & 4294967295L);
            iArr3[i12 + 6] = (int) j26;
            long j27 = (j26 >>> 32) + (j19 * j7) + (iArr3[i9] & 4294967295L);
            iArr3[i12 + 7] = (int) j27;
            long j28 = (j27 >>> 32) + (j19 * j20) + (iArr3[i10] & 4294967295L);
            iArr3[i12 + 8] = (int) j28;
            iArr3[i12 + 9] = (int) (j28 >>> 32);
            i11 = i14 + 1;
            i12 = i13;
            j3 = j3;
            j17 = j20;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = iArr2[7] & 4294967295L;
        long j9 = iArr[0] & 4294967295L;
        long j10 = j9 * j;
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j2);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j3);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j4);
        iArr3[3] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j5);
        iArr3[4] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j6);
        iArr3[5] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j7);
        iArr3[6] = (int) j16;
        long j17 = (j16 >>> 32) + (j9 * j8);
        iArr3[7] = (int) j17;
        iArr3[8] = (int) (j17 >>> 32);
        int i7 = 1;
        for (int i8 = 8; i7 < i8; i8 = 8) {
            long j18 = iArr[i7] & 4294967295L;
            long j19 = (j18 * j) + (iArr3[i7] & 4294967295L);
            iArr3[i7] = (int) j19;
            int i9 = i7 + 1;
            long j20 = (j19 >>> 32) + (j18 * j2) + (iArr3[i9] & 4294967295L);
            iArr3[i9] = (int) j20;
            long j21 = (j20 >>> 32) + (j18 * j3) + (iArr3[i] & 4294967295L);
            iArr3[i7 + 2] = (int) j21;
            long j22 = (j21 >>> 32) + (j18 * j4) + (iArr3[i2] & 4294967295L);
            iArr3[i7 + 3] = (int) j22;
            long j23 = (j22 >>> 32) + (j18 * j5) + (iArr3[i3] & 4294967295L);
            iArr3[i7 + 4] = (int) j23;
            long j24 = (j23 >>> 32) + (j18 * j6) + (iArr3[i4] & 4294967295L);
            iArr3[i7 + 5] = (int) j24;
            long j25 = (j24 >>> 32) + (j18 * j7) + (iArr3[i5] & 4294967295L);
            iArr3[i7 + 6] = (int) j25;
            long j26 = (j25 >>> 32) + (j18 * j8) + (iArr3[i6] & 4294967295L);
            iArr3[i7 + 7] = (int) j26;
            iArr3[i7 + 8] = (int) (j26 >>> 32);
            i7 = i9;
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
        long j15 = (j13 >>> 32) + (j * j14) + j12 + (iArr2[i3 + 6] & 4294967295L);
        iArr3[i4 + 6] = (int) j15;
        long j16 = iArr[i2 + 7] & 4294967295L;
        long j17 = (j15 >>> 32) + (j * j16) + j14 + (4294967295L & iArr2[i3 + 7]);
        iArr3[i4 + 7] = (int) j17;
        return (j17 >>> 32) + j16;
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
        return Nat.incAt(8, iArr, i2, 4);
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
        return Nat.incAt(8, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j = iArr2[0];
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2];
        long j4 = iArr2[3];
        long j5 = iArr2[4];
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6];
        long j8 = iArr2[7] & 4294967295L;
        long j9 = 0;
        int i8 = 0;
        while (i8 < 8) {
            long j10 = j8;
            long j11 = iArr[i8] & 4294967295L;
            long j12 = j6;
            long j13 = (iArr3[i8] & 4294967295L) + ((j & 4294967295L) * j11);
            iArr3[i8] = (int) j13;
            int i9 = i8 + 1;
            long j14 = j2;
            long j15 = (j13 >>> 32) + (j11 * j2) + (iArr3[i9] & 4294967295L);
            iArr3[i9] = (int) j15;
            long j16 = j3;
            long j17 = (j15 >>> 32) + ((j3 & 4294967295L) * j11) + (iArr3[i] & 4294967295L);
            iArr3[i8 + 2] = (int) j17;
            long j18 = (j17 >>> 32) + ((j4 & 4294967295L) * j11) + (iArr3[i2] & 4294967295L);
            iArr3[i8 + 3] = (int) j18;
            long j19 = (j18 >>> 32) + ((j5 & 4294967295L) * j11) + (iArr3[i3] & 4294967295L);
            iArr3[i8 + 4] = (int) j19;
            long j20 = (j19 >>> 32) + (j11 * j12) + (iArr3[i4] & 4294967295L);
            iArr3[i8 + 5] = (int) j20;
            long j21 = (j20 >>> 32) + ((j7 & 4294967295L) * j11) + (iArr3[i5] & 4294967295L);
            iArr3[i8 + 6] = (int) j21;
            long j22 = (j21 >>> 32) + (j11 * j10) + (iArr3[i6] & 4294967295L);
            iArr3[i8 + 7] = (int) j22;
            long j23 = (j22 >>> 32) + (iArr3[i7] & 4294967295L) + j9;
            iArr3[i8 + 8] = (int) j23;
            j9 = j23 >>> 32;
            i8 = i9;
            j8 = j10;
            j6 = j12;
            j4 = j4;
            j2 = j14;
            j3 = j16;
        }
        return (int) j9;
    }

    public static int mulByWordAddTo(int i, int[] iArr, int[] iArr2) {
        long j = i & 4294967295L;
        long j2 = ((iArr2[0] & 4294967295L) * j) + (iArr[0] & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((iArr2[1] & 4294967295L) * j) + (iArr[1] & 4294967295L);
        iArr2[1] = (int) j3;
        long j4 = (j3 >>> 32) + ((iArr2[2] & 4294967295L) * j) + (iArr[2] & 4294967295L);
        iArr2[2] = (int) j4;
        long j5 = (j4 >>> 32) + ((iArr2[3] & 4294967295L) * j) + (iArr[3] & 4294967295L);
        iArr2[3] = (int) j5;
        long j6 = (j5 >>> 32) + ((iArr2[4] & 4294967295L) * j) + (iArr[4] & 4294967295L);
        iArr2[4] = (int) j6;
        long j7 = (j6 >>> 32) + ((iArr2[5] & 4294967295L) * j) + (iArr[5] & 4294967295L);
        iArr2[5] = (int) j7;
        long j8 = (j7 >>> 32) + ((iArr2[6] & 4294967295L) * j) + (iArr[6] & 4294967295L);
        iArr2[6] = (int) j8;
        long j9 = (j8 >>> 32) + (j * (iArr2[7] & 4294967295L)) + (4294967295L & iArr[7]);
        iArr2[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long j = iArr[i] & 4294967295L;
        int i12 = 0;
        int i13 = 16;
        int i14 = 7;
        while (true) {
            int i15 = i14 - 1;
            long j2 = iArr[i + i14] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i2 + (i13 - 1)] = (i12 << 31) | ((int) (j3 >>> 33));
            i13 -= 2;
            iArr2[i2 + i13] = (int) (j3 >>> 1);
            i12 = (int) j3;
            if (i15 <= 0) {
                long j4 = j * j;
                iArr2[i2] = (int) j4;
                long j5 = iArr[i + 1] & 4294967295L;
                long j6 = (((i12 << 31) & 4294967295L) | (j4 >>> 33)) + (j5 * j);
                int i16 = (int) j6;
                iArr2[i2 + 1] = (i16 << 1) | (((int) (j4 >>> 32)) & 1);
                long j7 = iArr[i + 2] & 4294967295L;
                int i17 = i2 + 3;
                long j8 = iArr2[i17];
                long j9 = (iArr2[i3] & 4294967295L) + (j6 >>> 32) + (j7 * j);
                int i18 = (int) j9;
                iArr2[i2 + 2] = (i18 << 1) | (i16 >>> 31);
                long j10 = (j8 & 4294967295L) + (j9 >>> 32) + (j7 * j5);
                long j11 = (iArr2[i4] & 4294967295L) + (j10 >>> 32);
                long j12 = iArr[i + 3] & 4294967295L;
                long j13 = (iArr2[i5] & 4294967295L) + (j11 >>> 32);
                int i19 = i2 + 6;
                long j14 = iArr2[i19];
                long j15 = (j10 & 4294967295L) + (j12 * j);
                int i20 = (int) j15;
                iArr2[i17] = (i20 << 1) | (i18 >>> 31);
                long j16 = (j11 & 4294967295L) + (j15 >>> 32) + (j12 * j5);
                long j17 = (j13 & 4294967295L) + (j16 >>> 32) + (j12 * j7);
                long j18 = (j14 & 4294967295L) + (j13 >>> 32) + (j17 >>> 32);
                long j19 = iArr[i + 4] & 4294967295L;
                long j20 = (iArr2[i6] & 4294967295L) + (j18 >>> 32);
                long j21 = (j16 & 4294967295L) + (j19 * j);
                int i21 = (int) j21;
                iArr2[i2 + 4] = (i21 << 1) | (i20 >>> 31);
                long j22 = (j17 & 4294967295L) + (j21 >>> 32) + (j19 * j5);
                long j23 = (j18 & 4294967295L) + (j22 >>> 32) + (j19 * j7);
                long j24 = (j20 & 4294967295L) + (j23 >>> 32) + (j19 * j12);
                long j25 = (iArr2[i7] & 4294967295L) + (j20 >>> 32) + (j24 >>> 32);
                long j26 = iArr[i + 5] & 4294967295L;
                long j27 = (iArr2[i8] & 4294967295L) + (j25 >>> 32);
                int i22 = i2 + 10;
                long j28 = iArr2[i22];
                long j29 = (j22 & 4294967295L) + (j26 * j);
                int i23 = (int) j29;
                iArr2[i2 + 5] = (i23 << 1) | (i21 >>> 31);
                long j30 = (j23 & 4294967295L) + (j29 >>> 32) + (j26 * j5);
                long j31 = (j24 & 4294967295L) + (j30 >>> 32) + (j26 * j7);
                long j32 = (j25 & 4294967295L) + (j31 >>> 32) + (j26 * j12);
                long j33 = (j27 & 4294967295L) + (j32 >>> 32) + (j26 * j19);
                long j34 = (j28 & 4294967295L) + (j27 >>> 32) + (j33 >>> 32);
                long j35 = iArr[i + 6] & 4294967295L;
                long j36 = (iArr2[i9] & 4294967295L) + (j34 >>> 32);
                int i24 = i2 + 12;
                long j37 = iArr2[i24];
                long j38 = (j30 & 4294967295L) + (j35 * j);
                int i25 = (int) j38;
                iArr2[i19] = (i25 << 1) | (i23 >>> 31);
                long j39 = (j31 & 4294967295L) + (j38 >>> 32) + (j35 * j5);
                long j40 = (j32 & 4294967295L) + (j39 >>> 32) + (j35 * j7);
                long j41 = (j33 & 4294967295L) + (j40 >>> 32) + (j35 * j12);
                long j42 = (j34 & 4294967295L) + (j41 >>> 32) + (j35 * j19);
                long j43 = (j36 & 4294967295L) + (j42 >>> 32) + (j35 * j26);
                long j44 = (j37 & 4294967295L) + (j36 >>> 32) + (j43 >>> 32);
                long j45 = iArr[i + 7] & 4294967295L;
                long j46 = (iArr2[i10] & 4294967295L) + (j44 >>> 32);
                long j47 = (j39 & 4294967295L) + (j * j45);
                int i26 = (int) j47;
                iArr2[i2 + 7] = (i26 << 1) | (i25 >>> 31);
                long j48 = (j40 & 4294967295L) + (j47 >>> 32) + (j5 * j45);
                long j49 = (j41 & 4294967295L) + (j48 >>> 32) + (j7 * j45);
                long j50 = (j42 & 4294967295L) + (j49 >>> 32) + (j12 * j45);
                long j51 = (j43 & 4294967295L) + (j50 >>> 32) + (j45 * j19);
                long j52 = (j44 & 4294967295L) + (j51 >>> 32) + (j45 * j26);
                long j53 = (j46 & 4294967295L) + (j52 >>> 32) + (j45 * j35);
                long j54 = (iArr2[i11] & 4294967295L) + (j46 >>> 32) + (j53 >>> 32);
                int i27 = (int) j48;
                iArr2[i2 + 8] = (i26 >>> 31) | (i27 << 1);
                int i28 = (int) j49;
                iArr2[i2 + 9] = (i27 >>> 31) | (i28 << 1);
                int i29 = (int) j50;
                iArr2[i22] = (i28 >>> 31) | (i29 << 1);
                int i30 = (int) j51;
                iArr2[i2 + 11] = (i29 >>> 31) | (i30 << 1);
                int i31 = (int) j52;
                iArr2[i24] = (i30 >>> 31) | (i31 << 1);
                int i32 = (int) j53;
                iArr2[i2 + 13] = (i31 >>> 31) | (i32 << 1);
                int i33 = (int) j54;
                iArr2[i2 + 14] = (i32 >>> 31) | (i33 << 1);
                int i34 = i2 + 15;
                iArr2[i34] = (i33 >>> 31) | ((iArr2[i34] + ((int) (j54 >>> 32))) << 1);
                return;
            }
            i14 = i15;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 16;
        int i2 = 0;
        int i3 = 7;
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
                long j39 = (j31 & 4294967295L) + (j36 * j);
                int i11 = (int) j39;
                iArr2[6] = (i11 << 1) | (i10 >>> 31);
                long j40 = (j32 & 4294967295L) + (j39 >>> 32) + (j36 * j5);
                long j41 = (j40 >>> 32) + (j36 * j8) + (j33 & 4294967295L);
                long j42 = (j34 & 4294967295L) + (j41 >>> 32) + (j36 * j12);
                long j43 = (j35 & 4294967295L) + (j42 >>> 32) + (j36 * j19);
                long j44 = (j37 & 4294967295L) + (j43 >>> 32) + (j36 * j27);
                long j45 = (j44 >>> 32) + (j38 & 4294967295L) + (j37 >>> 32);
                long j46 = iArr[7] & 4294967295L;
                long j47 = (iArr2[13] & 4294967295L) + (j45 >>> 32);
                long j48 = iArr2[14];
                long j49 = (j40 & 4294967295L) + (j * j46);
                int i12 = (int) j49;
                iArr2[7] = (i11 >>> 31) | (i12 << 1);
                long j50 = (j41 & 4294967295L) + (j49 >>> 32) + (j46 * j5);
                long j51 = (j42 & 4294967295L) + (j50 >>> 32) + (j46 * j8);
                long j52 = (j43 & 4294967295L) + (j51 >>> 32) + (j12 * j46);
                long j53 = (j44 & 4294967295L) + (j52 >>> 32) + (j19 * j46);
                long j54 = (j45 & 4294967295L) + (j53 >>> 32) + (j46 * j27);
                long j55 = (j47 & 4294967295L) + (j54 >>> 32) + (j46 * j36);
                long j56 = (j48 & 4294967295L) + (j47 >>> 32) + (j55 >>> 32);
                int i13 = (int) j50;
                iArr2[8] = (i12 >>> 31) | (i13 << 1);
                int i14 = (int) j51;
                iArr2[9] = (i13 >>> 31) | (i14 << 1);
                int i15 = (int) j52;
                iArr2[10] = (i14 >>> 31) | (i15 << 1);
                int i16 = (int) j53;
                iArr2[11] = (i15 >>> 31) | (i16 << 1);
                int i17 = (int) j54;
                iArr2[12] = (i16 >>> 31) | (i17 << 1);
                int i18 = (int) j55;
                iArr2[13] = (i17 >>> 31) | (i18 << 1);
                int i19 = (int) j56;
                iArr2[14] = (i18 >>> 31) | (i19 << 1);
                iArr2[15] = (i19 >>> 31) | ((iArr2[15] + ((int) (j56 >>> 32))) << 1);
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
        long j7 = (j6 >> 32) + ((iArr[i + 6] & 4294967295L) - (iArr2[i2 + 6] & 4294967295L));
        iArr3[i3 + 6] = (int) j7;
        long j8 = (j7 >> 32) + ((iArr[i + 7] & 4294967295L) - (iArr2[i2 + 7] & 4294967295L));
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >> 32);
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
        long j8 = (j7 >> 32) + ((iArr[7] & 4294967295L) - (iArr2[7] & 4294967295L));
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
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
        long j7 = (j6 >> 32) + ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L));
        iArr2[6] = (int) j7;
        long j8 = (j7 >> 32) + ((iArr2[7] & 4294967295L) - (4294967295L & iArr[7]));
        iArr2[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                Pack.longToBigEndian(j, bArr, (3 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }
}
