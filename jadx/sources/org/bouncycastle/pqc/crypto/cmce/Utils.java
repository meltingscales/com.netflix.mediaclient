package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
class Utils {
    Utils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short bitrev(short s, int i) {
        short s2 = (short) (((s & 255) << 8) | ((65280 & s) >> 8));
        short s3 = (short) (((s2 & 3855) << 4) | ((61680 & s2) >> 4));
        short s4 = (short) (((s3 & 13107) << 2) | ((52428 & s3) >> 2));
        short s5 = (short) (((s4 & 21845) << 1) | ((43690 & s4) >> 1));
        return (short) (i == 12 ? s5 >> 4 : s5 >> 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int load4(byte[] bArr, int i) {
        return Pack.littleEndianToInt(bArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long load8(byte[] bArr, int i) {
        return Pack.littleEndianToLong(bArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short load_gf(byte[] bArr, int i, int i2) {
        return (short) (Pack.littleEndianToShort(bArr, i) & i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void store8(byte[] bArr, int i, long j) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
        bArr[i + 4] = (byte) ((j >> 32) & 255);
        bArr[i + 5] = (byte) ((j >> 40) & 255);
        bArr[i + 6] = (byte) ((j >> 48) & 255);
        bArr[i + 7] = (byte) ((j >> 56) & 255);
    }
}
