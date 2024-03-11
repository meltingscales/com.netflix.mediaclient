package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes6.dex */
public class GF2Matrix extends Matrix {
    private int length;
    private int[][] matrix;

    public GF2Matrix(int i, int[][] iArr) {
        int[] iArr2 = iArr[0];
        if (iArr2.length != ((i + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.numColumns = i;
        this.numRows = iArr.length;
        this.length = iArr2.length;
        int i2 = i & 31;
        int i3 = i2 == 0 ? -1 : (1 << i2) - 1;
        for (int i4 = 0; i4 < this.numRows; i4++) {
            int[] iArr3 = iArr[i4];
            int i5 = this.length - 1;
            iArr3[i5] = iArr3[i5] & i3;
        }
        this.matrix = iArr;
    }

    public GF2Matrix(GF2Matrix gF2Matrix) {
        this.numColumns = gF2Matrix.getNumColumns();
        this.numRows = gF2Matrix.getNumRows();
        this.length = gF2Matrix.length;
        this.matrix = new int[gF2Matrix.matrix.length];
        int i = 0;
        while (true) {
            int[][] iArr = this.matrix;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = IntUtils.clone(gF2Matrix.matrix[i]);
            i++;
        }
    }

    public GF2Matrix(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.numRows = LittleEndianConversions.OS2IP(bArr, 0);
        int OS2IP = LittleEndianConversions.OS2IP(bArr, 4);
        this.numColumns = OS2IP;
        int i = this.numRows;
        if (i > 0) {
            int i2 = 8;
            if (((OS2IP + 7) >>> 3) * i == bArr.length - 8) {
                int i3 = (OS2IP + 31) >>> 5;
                this.length = i3;
                this.matrix = (int[][]) Array.newInstance(Integer.TYPE, i, i3);
                int i4 = this.numColumns;
                int i5 = i4 >> 5;
                for (int i6 = 0; i6 < this.numRows; i6++) {
                    int i7 = 0;
                    while (i7 < i5) {
                        this.matrix[i6][i7] = LittleEndianConversions.OS2IP(bArr, i2);
                        i7++;
                        i2 += 4;
                    }
                    int i8 = 0;
                    while (i8 < (i4 & 31)) {
                        int[] iArr = this.matrix[i6];
                        iArr[i5] = iArr[i5] ^ ((bArr[i2] & 255) << i8);
                        i8 += 8;
                        i2++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }

    public boolean equals(Object obj) {
        if (obj instanceof GF2Matrix) {
            GF2Matrix gF2Matrix = (GF2Matrix) obj;
            if (this.numRows == gF2Matrix.numRows && this.numColumns == gF2Matrix.numColumns && this.length == gF2Matrix.length) {
                for (int i = 0; i < this.numRows; i++) {
                    if (!IntUtils.equals(this.matrix[i], gF2Matrix.matrix[i])) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public byte[] getEncoded() {
        int i = this.numColumns;
        int i2 = this.numRows;
        int i3 = 8;
        byte[] bArr = new byte[(((i + 7) >>> 3) * i2) + 8];
        LittleEndianConversions.I2OSP(i2, bArr, 0);
        LittleEndianConversions.I2OSP(this.numColumns, bArr, 4);
        int i4 = this.numColumns;
        int i5 = i4 >>> 5;
        for (int i6 = 0; i6 < this.numRows; i6++) {
            int i7 = 0;
            while (i7 < i5) {
                LittleEndianConversions.I2OSP(this.matrix[i6][i7], bArr, i3);
                i7++;
                i3 += 4;
            }
            int i8 = 0;
            while (i8 < (i4 & 31)) {
                bArr[i3] = (byte) ((this.matrix[i6][i5] >>> i8) & PrivateKeyType.INVALID);
                i8 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public int hashCode() {
        int i = (((this.numRows * 31) + this.numColumns) * 31) + this.length;
        for (int i2 = 0; i2 < this.numRows; i2++) {
            i = (i * 31) + Arrays.hashCode(this.matrix[i2]);
        }
        return i;
    }

    public String toString() {
        int i = this.numColumns & 31;
        int i2 = this.length;
        if (i != 0) {
            i2--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.numRows; i3++) {
            stringBuffer.append(i3 + ": ");
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.matrix[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i7 = this.matrix[i3][this.length - 1];
            for (int i8 = 0; i8 < i; i8++) {
                if (((i7 >>> i8) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }
}
