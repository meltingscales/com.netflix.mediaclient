package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes6.dex */
class LmsUtils {
    LmsUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void byteArray(byte[] bArr, Digest digest) {
        digest.update(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void u16str(short s, Digest digest) {
        digest.update((byte) (s >>> 8));
        digest.update((byte) s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void u32str(int i, Digest digest) {
        digest.update((byte) (i >>> 24));
        digest.update((byte) (i >>> 16));
        digest.update((byte) (i >>> 8));
        digest.update((byte) i);
    }
}
