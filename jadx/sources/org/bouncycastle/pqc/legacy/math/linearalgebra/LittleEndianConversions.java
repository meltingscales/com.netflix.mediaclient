package org.bouncycastle.pqc.legacy.math.linearalgebra;

import org.chromium.net.PrivateKeyType;

/* loaded from: classes6.dex */
public final class LittleEndianConversions {
    public static void I2OSP(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void I2OSP(int i, byte[] bArr, int i2, int i3) {
        while (true) {
            i3--;
            if (i3 < 0) {
                return;
            }
            bArr[i2 + i3] = (byte) (i >>> (i3 * 8));
        }
    }

    public static byte[] I2OSP(int i) {
        return new byte[]{(byte) i, (byte) (i >>> 8), (byte) (i >>> 16), (byte) (i >>> 24)};
    }

    public static int OS2IP(byte[] bArr) {
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public static int OS2IP(byte[] bArr, int i) {
        byte b = bArr[i];
        return ((bArr[i + 3] & 255) << 24) | ((bArr[i + 1] & 255) << 8) | (b & 255) | ((bArr[i + 2] & 255) << 16);
    }

    public static int OS2IP(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            i3 |= (bArr[i + i4] & PrivateKeyType.INVALID) << (i4 * 8);
        }
        return i3;
    }
}
