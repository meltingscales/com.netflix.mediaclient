package org.bouncycastle.crypto.paddings;

/* loaded from: classes5.dex */
public class ISO7816d4Padding {
    public int addPadding(byte[] bArr, int i) {
        int length = bArr.length;
        bArr[i] = Byte.MIN_VALUE;
        int i2 = i;
        while (true) {
            i2++;
            if (i2 >= bArr.length) {
                return length - i;
            }
            bArr[i2] = 0;
        }
    }
}
