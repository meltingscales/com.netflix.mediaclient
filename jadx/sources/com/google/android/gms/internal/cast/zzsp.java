package com.google.android.gms.internal.cast;

/* loaded from: classes2.dex */
final class zzsp extends zzso {
    @Override // com.google.android.gms.internal.cast.zzso
    final int zza(int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 >= i3) {
            return 0;
        }
        while (i4 < i3) {
            int i5 = i4 + 1;
            byte b = bArr[i4];
            if (b < 0) {
                if (b < -32) {
                    if (i5 >= i3) {
                        return b;
                    }
                    if (b >= -62) {
                        i4 += 2;
                        if (bArr[i5] > -65) {
                        }
                    }
                } else if (b < -16) {
                    if (i5 < i3 - 1) {
                        byte b2 = bArr[i5];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i5 = i4 + 3;
                            if (bArr[i4 + 2] > -65) {
                            }
                        }
                    } else {
                        return zzsr.zza(bArr, i5, i3);
                    }
                } else if (i5 < i3 - 2) {
                    byte b3 = bArr[i5];
                    if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0 && bArr[i4 + 2] <= -65) {
                        i5 = i4 + 4;
                        if (bArr[i4 + 3] > -65) {
                        }
                    }
                } else {
                    return zzsr.zza(bArr, i5, i3);
                }
                return -1;
            }
            i4 = i5;
        }
        return 0;
    }
}
