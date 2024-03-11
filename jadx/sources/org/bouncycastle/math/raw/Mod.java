package org.bouncycastle.math.raw;

import java.util.Random;
import org.bouncycastle.util.Integers;

/* loaded from: classes6.dex */
public abstract class Mod {
    public static void checkedModOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        if (modOddInverse(iArr, iArr2, iArr3) == 0) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    private static void cnegate30(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i4 + ((iArr[i5] ^ i2) - i2);
            iArr[i5] = 1073741823 & i6;
            i4 = i6 >> 30;
        }
        iArr[i3] = i4 + ((iArr[i3] ^ i2) - i2);
    }

    private static void cnormalize30(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = i - 1;
        int i4 = iArr[i3] >> 31;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = i5 + (((iArr[i6] + (iArr2[i6] & i4)) ^ i2) - i2);
            iArr[i6] = 1073741823 & i7;
            i5 = i7 >> 30;
        }
        int i8 = i5 + (((iArr[i3] + (i4 & iArr2[i3])) ^ i2) - i2);
        iArr[i3] = i8;
        int i9 = i8 >> 31;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            int i12 = i10 + iArr[i11] + (iArr2[i11] & i9);
            iArr[i11] = i12 & 1073741823;
            i10 = i12 >> 30;
        }
        iArr[i3] = i10 + iArr[i3] + (i9 & iArr2[i3]);
    }

    private static void decode30(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = 0;
        long j = 0;
        while (i > 0) {
            while (i4 < Math.min(32, i)) {
                j |= iArr[i2] << i4;
                i4 += 30;
                i2++;
            }
            iArr2[i3] = (int) j;
            j >>>= 32;
            i4 -= 32;
            i -= 32;
            i3++;
        }
    }

    private static int divsteps30(int i, int i2, int i3, int[] iArr) {
        int i4 = 1073741824;
        int i5 = 1073741824;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < 30; i8++) {
            int i9 = i >> 31;
            int i10 = -(i3 & 1);
            int i11 = i3 - ((i2 ^ i9) & i10);
            int i12 = i7 - ((i4 ^ i9) & i10);
            int i13 = i5 - ((i6 ^ i9) & i10);
            int i14 = (~i9) & i10;
            i = (i ^ i14) - (i14 - 1);
            i2 += i11 & i14;
            i4 += i12 & i14;
            i6 += i14 & i13;
            i3 = i11 >> 1;
            i7 = i12 >> 1;
            i5 = i13 >> 1;
        }
        iArr[0] = i4;
        iArr[1] = i6;
        iArr[2] = i7;
        iArr[3] = i5;
        return i;
    }

    private static void encode30(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = 0;
        long j = 0;
        while (i > 0) {
            if (i4 < Math.min(30, i)) {
                j |= (iArr[i2] & 4294967295L) << i4;
                i4 += 32;
                i2++;
            }
            iArr2[i3] = ((int) j) & 1073741823;
            j >>>= 30;
            i4 -= 30;
            i -= 30;
            i3++;
        }
    }

    private static int getMaximumDivsteps(int i) {
        return ((i * 49) + (i < 46 ? 80 : 47)) / 17;
    }

    public static int inverse32(int i) {
        int i2 = (2 - (i * i)) * i;
        int i3 = i2 * (2 - (i * i2));
        int i4 = i3 * (2 - (i * i3));
        return i4 * (2 - (i * i4));
    }

    public static int modOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int numberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i = (numberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i];
        int[] iArr6 = new int[i];
        int[] iArr7 = new int[i];
        int[] iArr8 = new int[i];
        int[] iArr9 = new int[i];
        int i2 = 0;
        iArr6[0] = 1;
        encode30(numberOfLeadingZeros, iArr2, 0, iArr8, 0);
        encode30(numberOfLeadingZeros, iArr, 0, iArr9, 0);
        System.arraycopy(iArr9, 0, iArr7, 0, i);
        int inverse32 = inverse32(iArr9[0]);
        int i3 = 0;
        int i4 = 0;
        for (int maximumDivsteps = getMaximumDivsteps(numberOfLeadingZeros); i4 < maximumDivsteps; maximumDivsteps = maximumDivsteps) {
            int divsteps30 = divsteps30(i3, iArr7[i2], iArr8[i2], iArr4);
            updateDE30(i, iArr5, iArr6, iArr4, inverse32, iArr9);
            updateFG30(i, iArr7, iArr8, iArr4);
            i4 += 30;
            i2 = i2;
            i3 = divsteps30;
        }
        int i5 = i2;
        int i6 = iArr7[i - 1] >> 31;
        cnegate30(i, i6, iArr7);
        cnormalize30(i, i6, iArr5, iArr9);
        decode30(numberOfLeadingZeros, iArr5, i5, iArr3, i5);
        return Nat.equalTo(i, iArr7, 1) & Nat.equalToZero(i, iArr8);
    }

    public static int[] random(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] create = Nat.create(length);
        int i = length - 1;
        int i2 = iArr[i];
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        do {
            for (int i7 = 0; i7 != length; i7++) {
                create[i7] = random.nextInt();
            }
            create[i] = create[i] & ((i6 >>> 16) | i6);
        } while (Nat.gte(length, create, iArr));
        return create;
    }

    private static void updateDE30(int i, int[] iArr, int[] iArr2, int[] iArr3, int i2, int[] iArr4) {
        int i3 = i;
        int i4 = iArr3[0];
        int i5 = iArr3[1];
        int i6 = iArr3[2];
        int i7 = iArr3[3];
        int i8 = i3 - 1;
        int i9 = iArr[i8] >> 31;
        int i10 = iArr2[i8] >> 31;
        int i11 = (i4 & i9) + (i5 & i10);
        int i12 = (i9 & i6) + (i10 & i7);
        int i13 = iArr4[0];
        long j = i4;
        long j2 = iArr[0];
        long j3 = i5;
        long j4 = iArr2[0];
        long j5 = (j * j2) + (j3 * j4);
        long j6 = i6;
        long j7 = i7;
        long j8 = (j2 * j6) + (j4 * j7);
        long j9 = i13;
        long j10 = i11 - (((((int) j5) * i2) + i11) & 1073741823);
        long j11 = i12 - (((((int) j8) * i2) + i12) & 1073741823);
        long j12 = (j8 + (j9 * j11)) >> 30;
        long j13 = (j5 + (j9 * j10)) >> 30;
        int i14 = 1;
        while (i14 < i3) {
            int i15 = iArr4[i14];
            long j14 = j12;
            long j15 = iArr[i14];
            int i16 = i8;
            long j16 = iArr2[i14];
            long j17 = j11;
            long j18 = i15;
            long j19 = j13 + (j * j15) + (j3 * j16) + (j18 * j10);
            long j20 = j14 + (j15 * j6) + (j16 * j7) + (j18 * j17);
            int i17 = i14 - 1;
            iArr[i17] = ((int) j19) & 1073741823;
            j13 = j19 >> 30;
            iArr2[i17] = ((int) j20) & 1073741823;
            j12 = j20 >> 30;
            i14++;
            i3 = i;
            i8 = i16;
            j11 = j17;
        }
        int i18 = i8;
        iArr[i18] = (int) j13;
        iArr2[i18] = (int) j12;
    }

    private static void updateFG30(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = i;
        int i3 = iArr3[0];
        int i4 = 1;
        int i5 = iArr3[1];
        int i6 = iArr3[2];
        int i7 = iArr3[3];
        long j = i3;
        long j2 = iArr[0];
        long j3 = i5;
        long j4 = iArr2[0];
        long j5 = i6;
        long j6 = i7;
        long j7 = ((j * j2) + (j3 * j4)) >> 30;
        long j8 = ((j2 * j5) + (j4 * j6)) >> 30;
        while (i4 < i2) {
            long j9 = iArr[i4];
            long j10 = iArr2[i4];
            long j11 = j7 + (j * j9) + (j3 * j10);
            long j12 = j8 + (j9 * j5) + (j10 * j6);
            int i8 = i4 - 1;
            iArr[i8] = ((int) j11) & 1073741823;
            j7 = j11 >> 30;
            iArr2[i8] = ((int) j12) & 1073741823;
            j8 = j12 >> 30;
            i4++;
            i2 = i;
        }
        int i9 = i - 1;
        iArr[i9] = (int) j7;
        iArr2[i9] = (int) j8;
    }
}
