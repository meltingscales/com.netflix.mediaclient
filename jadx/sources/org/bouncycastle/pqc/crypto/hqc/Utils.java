package org.bouncycastle.pqc.crypto.hqc;

/* loaded from: classes6.dex */
class Utils {
    Utils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getByte64SizeFromBitSize(int i) {
        return (i + 63) / 64;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getByteSizeFromBitSize(int i) {
        return (i + 7) / 8;
    }
}
