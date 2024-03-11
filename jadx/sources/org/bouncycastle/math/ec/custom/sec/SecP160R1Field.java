package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat160;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
public class SecP160R1Field {
    static final int[] P = {Integer.MAX_VALUE, -1, -1, -1, -1};
    private static final int[] PExt = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat160.add(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && Nat160.gte(iArr3, P))) {
            Nat.addWordTo(5, -2147483647, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && Nat160.gte(iArr2, P))) {
            Nat.addWordTo(5, -2147483647, iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat160.fromBigInteger(bigInteger);
        if (fromBigInteger[4] == -1) {
            int[] iArr = P;
            if (Nat160.gte(fromBigInteger, iArr)) {
                Nat160.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = Nat160.createExt();
        Nat160.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat160.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && Nat.gte(10, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(10, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat160.sub(P, iArr, iArr2);
            return;
        }
        int[] iArr3 = P;
        Nat160.sub(iArr3, iArr3, iArr2);
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[20];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 5);
        } while (Nat.lessThan(5, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = iArr[5] & 4294967295L;
        long j2 = iArr[6] & 4294967295L;
        long j3 = iArr[7] & 4294967295L;
        long j4 = iArr[8] & 4294967295L;
        long j5 = iArr[9] & 4294967295L;
        long j6 = (iArr[0] & 4294967295L) + j + (j << 31);
        iArr2[0] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[1] & 4294967295L) + j2 + (j2 << 31);
        iArr2[1] = (int) j7;
        long j8 = (j7 >>> 32) + (iArr[2] & 4294967295L) + j3 + (j3 << 31);
        iArr2[2] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[3] & 4294967295L) + j4 + (j4 << 31);
        iArr2[3] = (int) j9;
        long j10 = (j9 >>> 32) + (4294967295L & iArr[4]) + j5 + (j5 << 31);
        iArr2[4] = (int) j10;
        reduce32((int) (j10 >>> 32), iArr2);
    }

    public static void reduce32(int i, int[] iArr) {
        if ((i == 0 || Nat160.mulWordsAdd(-2147483647, i, iArr, 0) == 0) && !(iArr[4] == -1 && Nat160.gte(iArr, P))) {
            return;
        }
        Nat.addWordTo(5, -2147483647, iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = Nat160.createExt();
        Nat160.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] createExt = Nat160.createExt();
        Nat160.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i--;
            if (i <= 0) {
                return;
            }
            Nat160.square(iArr2, createExt);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat160.sub(iArr, iArr2, iArr3) != 0) {
            Nat.subWordFrom(5, -2147483647, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && Nat160.gte(iArr2, P))) {
            Nat.addWordTo(5, -2147483647, iArr2);
        }
    }
}