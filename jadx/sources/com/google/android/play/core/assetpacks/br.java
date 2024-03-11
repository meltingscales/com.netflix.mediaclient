package com.google.android.play.core.assetpacks;

/* loaded from: classes5.dex */
final class br {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long c(byte[] bArr, int i) {
        return ((a(bArr, i + 2) << 16) | a(bArr, i)) & 4294967295L;
    }
}
