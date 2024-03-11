package com.google.android.gms.internal.recaptcha;

/* loaded from: classes2.dex */
final class zzgu extends zzgr {
    @Override // com.google.android.gms.internal.recaptcha.zzgr
    final int zza(int i, byte[] bArr, int i2, int i3) {
        int zzd;
        int zzd2;
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b < 0) {
                if (b < -32) {
                    if (i4 >= i3) {
                        return b;
                    }
                    if (b >= -62) {
                        i2 += 2;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                } else if (b >= -16) {
                    if (i4 < i3 - 2) {
                        byte b2 = bArr[i4];
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0 && bArr[i2 + 2] <= -65) {
                            i4 = i2 + 4;
                            if (bArr[i2 + 3] > -65) {
                            }
                        }
                        return -1;
                    }
                    zzd = zzgq.zzd(bArr, i4, i3);
                    return zzd;
                } else if (i4 < i3 - 1) {
                    byte b3 = bArr[i4];
                    if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                        i4 = i2 + 3;
                        if (bArr[i2 + 2] > -65) {
                        }
                    }
                    return -1;
                } else {
                    zzd2 = zzgq.zzd(bArr, i4, i3);
                    return zzd2;
                }
            }
            i2 = i4;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.recaptcha.zzgr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.recaptcha.zzgu.zza(java.lang.CharSequence, byte[], int, int):int");
    }
}
