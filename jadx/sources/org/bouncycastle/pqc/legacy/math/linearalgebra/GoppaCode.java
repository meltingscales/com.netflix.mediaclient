package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.lang.reflect.Array;

/* loaded from: classes6.dex */
public final class GoppaCode {
    public static GF2Matrix createCanonicalCheckMatrix(GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int degree = gF2mField.getDegree();
        int i = 1 << degree;
        int degree2 = polynomialGF2mSmallM.getDegree();
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance(cls, degree2, i);
        int[][] iArr2 = (int[][]) Array.newInstance(cls, degree2, i);
        for (int i2 = 0; i2 < i; i2++) {
            iArr2[0][i2] = gF2mField.inverse(polynomialGF2mSmallM.evaluateAt(i2));
        }
        for (int i3 = 1; i3 < degree2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[i3][i4] = gF2mField.mult(iArr2[i3 - 1][i4], i4);
            }
        }
        for (int i5 = 0; i5 < degree2; i5++) {
            for (int i6 = 0; i6 < i; i6++) {
                for (int i7 = 0; i7 <= i5; i7++) {
                    int[] iArr3 = iArr[i5];
                    iArr3[i6] = gF2mField.add(iArr3[i6], gF2mField.mult(iArr2[i7][i6], polynomialGF2mSmallM.getCoefficient((degree2 + i7) - i5)));
                }
            }
        }
        int[][] iArr4 = (int[][]) Array.newInstance(Integer.TYPE, degree2 * degree, (i + 31) >>> 5);
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = i8 >>> 5;
            for (int i10 = 0; i10 < degree2; i10++) {
                int i11 = iArr[i10][i8];
                for (int i12 = 0; i12 < degree; i12++) {
                    if (((i11 >>> i12) & 1) != 0) {
                        int[] iArr5 = iArr4[(((i10 + 1) * degree) - i12) - 1];
                        iArr5[i9] = iArr5[i9] ^ (1 << (i8 & 31));
                    }
                }
            }
        }
        return new GF2Matrix(i, iArr4);
    }
}
