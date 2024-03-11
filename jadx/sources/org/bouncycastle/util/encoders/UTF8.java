package org.bouncycastle.util.encoders;

/* loaded from: classes6.dex */
public class UTF8 {
    private static final short[] firstUnitTable = new short[128];
    private static final byte[] transitionTable;

    static {
        byte[] bArr = new byte[112];
        transitionTable = bArr;
        byte[] bArr2 = new byte[128];
        fill(bArr2, 0, 15, (byte) 1);
        fill(bArr2, 16, 31, (byte) 2);
        fill(bArr2, 32, 63, (byte) 3);
        fill(bArr2, 64, 65, (byte) 0);
        fill(bArr2, 66, 95, (byte) 4);
        fill(bArr2, 96, 96, (byte) 5);
        fill(bArr2, 97, 108, (byte) 6);
        fill(bArr2, 109, 109, (byte) 7);
        fill(bArr2, 110, 111, (byte) 6);
        fill(bArr2, 112, 112, (byte) 8);
        fill(bArr2, 113, 115, (byte) 9);
        fill(bArr2, 116, 116, (byte) 10);
        fill(bArr2, 117, 127, (byte) 0);
        fill(bArr, 0, 111, (byte) -2);
        fill(bArr, 8, 11, (byte) -1);
        fill(bArr, 24, 27, (byte) 0);
        fill(bArr, 40, 43, (byte) 16);
        fill(bArr, 58, 59, (byte) 0);
        fill(bArr, 72, 73, (byte) 0);
        fill(bArr, 89, 91, (byte) 16);
        fill(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b = bArr2[i];
            firstUnitTable[i] = (short) (bArr4[b] | ((bArr3[b] & i) << 8));
        }
    }

    private static void fill(byte[] bArr, int i, int i2, byte b) {
        while (i <= i2) {
            bArr[i] = b;
            i++;
        }
    }

    public static int transcodeToUTF16(byte[] bArr, int i, int i2, char[] cArr) {
        int i3 = i2 + i;
        int i4 = 0;
        while (i < i3) {
            int i5 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                short s = firstUnitTable[b & Byte.MAX_VALUE];
                int i6 = s >>> 8;
                byte b2 = (byte) s;
                while (b2 >= 0) {
                    if (i5 >= i3) {
                        return -1;
                    }
                    byte b3 = bArr[i5];
                    i6 = (i6 << 6) | (b3 & 63);
                    b2 = transitionTable[b2 + ((b3 & 255) >>> 4)];
                    i5++;
                }
                if (b2 == -2) {
                    return -1;
                }
                if (i6 <= 65535) {
                    if (i4 >= cArr.length) {
                        return -1;
                    }
                    cArr[i4] = (char) i6;
                } else if (i4 >= cArr.length - 1) {
                    return -1;
                } else {
                    cArr[i4] = (char) ((i6 >>> 10) + 55232);
                    cArr[i4 + 1] = (char) ((i6 & 1023) | 56320);
                    i4 += 2;
                    i = i5;
                }
            } else if (i4 >= cArr.length) {
                return -1;
            } else {
                cArr[i4] = (char) b;
            }
            i4++;
            i = i5;
        }
        return i4;
    }

    public static int transcodeToUTF16(byte[] bArr, char[] cArr) {
        return transcodeToUTF16(bArr, 0, bArr.length, cArr);
    }
}
