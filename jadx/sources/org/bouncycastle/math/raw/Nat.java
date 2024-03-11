package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
public abstract class Nat {
    public static int add(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + (iArr[i2] & 4294967295L) + (4294967295L & iArr2[i2]);
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int add33To(int i, int i2, int[] iArr) {
        long j = (iArr[0] & 4294967295L) + (i2 & 4294967295L);
        iArr[0] = (int) j;
        long j2 = (j >>> 32) + (4294967295L & iArr[1]) + 1;
        iArr[1] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, 2);
    }

    public static int addBothTo(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + (iArr[i2] & 4294967295L) + (iArr2[i2] & 4294967295L) + (4294967295L & iArr3[i2]);
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int addTo(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + i4;
            long j2 = j + (iArr[i2 + i4] & 4294967295L) + (4294967295L & iArr2[i5]);
            iArr2[i5] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int addTo(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + (iArr[i2] & 4294967295L) + (4294967295L & iArr2[i2]);
            iArr2[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int addWordAt(int i, int i2, int[] iArr, int i3) {
        long j = (i2 & 4294967295L) + (4294967295L & iArr[i3]);
        iArr[i3] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i3 + 1);
    }

    public static int addWordTo(int i, int i2, int[] iArr) {
        long j = (i2 & 4294967295L) + (4294967295L & iArr[0]);
        iArr[0] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, 1);
    }

    public static int[] create(int i) {
        return new int[i];
    }

    public static long[] create64(int i) {
        return new long[i];
    }

    public static int dec(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 != -1) {
                return 0;
            }
        }
        return -1;
    }

    public static int decAt(int i, int[] iArr, int i2) {
        while (i2 < i) {
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 != -1) {
                return 0;
            }
            i2++;
        }
        return -1;
    }

    public static boolean eq(int i, int[] iArr, int[] iArr2) {
        do {
            i--;
            if (i < 0) {
                return true;
            }
        } while (iArr[i] == iArr2[i]);
        return false;
    }

    public static int equalTo(int i, int[] iArr, int i2) {
        int i3 = i2 ^ iArr[0];
        for (int i4 = 1; i4 < i; i4++) {
            i3 |= iArr[i4];
        }
        return (((i3 >>> 1) | (i3 & 1)) - 1) >> 31;
    }

    public static int equalToZero(int i, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 |= iArr[i3];
        }
        return (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
    }

    public static int[] fromBigInteger(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        int i2 = (i + 31) >> 5;
        int[] create = create(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            create[i3] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static long[] fromBigInteger64(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        int i2 = (i + 63) >> 6;
        long[] create64 = create64(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            create64[i3] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return create64;
    }

    public static int getBit(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= iArr.length) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int i, int[] iArr, int[] iArr2) {
        int i2;
        int i3;
        do {
            i--;
            if (i < 0) {
                break;
            }
            i2 = iArr[i] ^ Integer.MIN_VALUE;
            i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
        } while (i2 <= i3);
        return true;
    }

    public static int inc(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int inc(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr2[i2] = i3;
            i2++;
            if (i3 != 0) {
                while (i2 < i) {
                    iArr2[i2] = iArr[i2];
                    i2++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static int incAt(int i, int[] iArr, int i2) {
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    public static int incAt(int i, int[] iArr, int i2, int i3) {
        while (i3 < i) {
            int i4 = i2 + i3;
            int i5 = iArr[i4] + 1;
            iArr[i4] = i5;
            if (i5 != 0) {
                return 0;
            }
            i3++;
        }
        return 1;
    }

    public static boolean isOne(int i, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int lessThan(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j + ((iArr[i2] & 4294967295L) - (4294967295L & iArr2[i2]))) >> 32;
        }
        return (int) j;
    }

    public static int mul31BothAdd(int i, int i2, int[] iArr, int i3, int[] iArr2, int[] iArr3, int i4) {
        int i5;
        long j = i2;
        long j2 = i3;
        long j3 = 0;
        int i6 = 0;
        do {
            long j4 = j3 + ((iArr[i6] & 4294967295L) * (j & 4294967295L)) + ((iArr2[i6] & 4294967295L) * (j2 & 4294967295L)) + (iArr3[i5] & 4294967295L);
            iArr3[i4 + i6] = (int) j4;
            j3 = j4 >>> 32;
            i6++;
        } while (i6 < i);
        return (int) j3;
    }

    public static int mulWordAddTo(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        int i5;
        long j = i2;
        long j2 = 0;
        int i6 = 0;
        do {
            long j3 = j2 + ((iArr[i3 + i6] & 4294967295L) * (j & 4294967295L)) + (4294967295L & iArr2[i5]);
            iArr2[i4 + i6] = (int) j3;
            j2 = j3 >>> 32;
            i6++;
        } while (i6 < i);
        return (int) j2;
    }

    public static int shiftDownBits(int i, int[] iArr, int i2, int i3, int i4, int[] iArr2, int i5) {
        while (true) {
            i--;
            if (i < 0) {
                return i4 << (-i3);
            }
            int i6 = iArr[i2 + i];
            iArr2[i5 + i] = (i4 << (-i3)) | (i6 >>> i3);
            i4 = i6;
        }
    }

    public static int shiftUpBit(int i, int[] iArr, int i2, int i3, int[] iArr2, int i4) {
        int i5 = 0;
        while (i5 < i) {
            int i6 = iArr[i2 + i5];
            iArr2[i4 + i5] = (i3 >>> 31) | (i6 << 1);
            i5++;
            i3 = i6;
        }
        return i3 >>> 31;
    }

    public static int shiftUpBit(int i, int[] iArr, int i2, int[] iArr2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            iArr2[i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        return i2 >>> 31;
    }

    public static long shiftUpBit64(int i, long[] jArr, int i2, long j, long[] jArr2, int i3) {
        int i4 = 0;
        while (i4 < i) {
            long j2 = jArr[i2 + i4];
            jArr2[i3 + i4] = (j >>> 63) | (j2 << 1);
            i4++;
            j = j2;
        }
        return j >>> 63;
    }

    public static int shiftUpBits(int i, int[] iArr, int i2, int i3) {
        int i4 = 0;
        while (i4 < i) {
            int i5 = iArr[i4];
            iArr[i4] = (i3 >>> (-i2)) | (i5 << i2);
            i4++;
            i3 = i5;
        }
        return i3 >>> (-i2);
    }

    public static int shiftUpBits(int i, int[] iArr, int i2, int i3, int[] iArr2) {
        int i4 = 0;
        while (i4 < i) {
            int i5 = iArr[i4];
            iArr2[i4] = (i3 >>> (-i2)) | (i5 << i2);
            i4++;
            i3 = i5;
        }
        return i3 >>> (-i2);
    }

    public static long shiftUpBits64(int i, long[] jArr, int i2, int i3, long j) {
        int i4 = 0;
        while (i4 < i) {
            int i5 = i2 + i4;
            long j2 = jArr[i5];
            jArr[i5] = (j >>> (-i3)) | (j2 << i3);
            i4++;
            j = j2;
        }
        return j >>> (-i3);
    }

    public static long shiftUpBits64(int i, long[] jArr, int i2, int i3, long j, long[] jArr2, int i4) {
        int i5 = 0;
        while (i5 < i) {
            long j2 = jArr[i2 + i5];
            jArr2[i4 + i5] = (j >>> (-i3)) | (j2 << i3);
            i5++;
            j = j2;
        }
        return j >>> (-i3);
    }

    public static int sub(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + ((iArr[i2] & 4294967295L) - (4294967295L & iArr2[i2]));
            iArr3[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int sub33From(int i, int i2, int[] iArr) {
        long j = (iArr[0] & 4294967295L) - (i2 & 4294967295L);
        iArr[0] = (int) j;
        long j2 = (j >> 32) + ((4294967295L & iArr[1]) - 1);
        iArr[1] = (int) j2;
        if ((j2 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, 2);
    }

    public static int subFrom(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + i4;
            long j2 = j + ((iArr2[i5] & 4294967295L) - (4294967295L & iArr[i2 + i4]));
            iArr2[i5] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int subFrom(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + ((iArr2[i2] & 4294967295L) - (4294967295L & iArr[i2]));
            iArr2[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int subWordFrom(int i, int i2, int[] iArr) {
        long j = (iArr[0] & 4294967295L) - (4294967295L & i2);
        iArr[0] = (int) j;
        if ((j >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, 1);
    }

    public static BigInteger toBigInteger(int i, int[] iArr) {
        byte[] bArr = new byte[i << 2];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                Pack.intToBigEndian(i3, bArr, ((i - 1) - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = 0;
        }
    }
}
