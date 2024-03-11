package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
final class zzii extends zzif {
    @Override // com.google.android.gms.internal.measurement.zzif
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
                    zzd = zzie.zzd(bArr, i4, i3);
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
                    zzd2 = zzie.zzd(bArr, i4, i3);
                    return zzd2;
                }
            }
            i2 = i4;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzif
    public final String zzb(byte[] bArr, int i, int i2) {
        boolean zzd;
        boolean zzd2;
        boolean zze;
        boolean zzf;
        boolean zzd3;
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            zzd3 = zzig.zzd(b);
            if (!zzd3) {
                break;
            }
            i++;
            zzig.zzb(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            zzd = zzig.zzd(b2);
            if (zzd) {
                zzig.zzb(b2, cArr, i5);
                i5++;
                i = i6;
                while (i < i3) {
                    byte b3 = bArr[i];
                    zzd2 = zzig.zzd(b3);
                    if (zzd2) {
                        i++;
                        zzig.zzb(b3, cArr, i5);
                        i5++;
                    }
                }
            } else {
                zze = zzig.zze(b2);
                if (!zze) {
                    zzf = zzig.zzf(b2);
                    if (zzf) {
                        if (i6 < i3 - 1) {
                            zzig.zzb(b2, bArr[i6], bArr[i + 2], cArr, i5);
                            i5++;
                            i += 3;
                        } else {
                            throw zzfo.zzh();
                        }
                    } else if (i6 < i3 - 2) {
                        zzig.zzb(b2, bArr[i6], bArr[i + 2], bArr[i + 3], cArr, i5);
                        i5 += 2;
                        i += 4;
                    } else {
                        throw zzfo.zzh();
                    }
                } else if (i6 < i3) {
                    i += 2;
                    zzig.zzb(b2, bArr[i6], cArr, i5);
                    i5++;
                } else {
                    throw zzfo.zzh();
                }
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.measurement.zzif
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzii.zza(java.lang.CharSequence, byte[], int, int):int");
    }
}
