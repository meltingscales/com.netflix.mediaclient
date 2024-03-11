package org.bouncycastle.pqc.legacy.math.linearalgebra;

/* loaded from: classes6.dex */
public final class PolynomialRingGF2 {
    public static int degree(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static int gcd(int i, int i2) {
        while (i2 != 0) {
            int i3 = i2;
            i2 = remainder(i, i2);
            i = i3;
        }
        return i;
    }

    public static boolean isIrreducible(int i) {
        if (i == 0) {
            return false;
        }
        int degree = degree(i);
        int i2 = 2;
        for (int i3 = 0; i3 < (degree >>> 1); i3++) {
            i2 = modMultiply(i2, i2, i);
            if (gcd(i2 ^ 2, i) != 1) {
                return false;
            }
        }
        return true;
    }

    public static int modMultiply(int i, int i2, int i3) {
        int remainder = remainder(i, i3);
        int remainder2 = remainder(i2, i3);
        int i4 = 0;
        if (remainder2 != 0) {
            int degree = degree(i3);
            while (remainder != 0) {
                if (((byte) (remainder & 1)) == 1) {
                    i4 ^= remainder2;
                }
                remainder >>>= 1;
                remainder2 <<= 1;
                if (remainder2 >= (1 << degree)) {
                    remainder2 ^= i3;
                }
            }
        }
        return i4;
    }

    public static int remainder(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (degree(i) >= degree(i2)) {
            i ^= i2 << (degree(i) - degree(i2));
        }
        return i;
    }
}
