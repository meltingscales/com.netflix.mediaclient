package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
final class zzik extends zzif {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
        return -1;
     */
    @Override // com.google.android.gms.internal.measurement.zzif
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zza(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzik.zza(int, byte[], int, int):int");
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
            byte zza = zzib.zza(bArr, i);
            zzd3 = zzig.zzd(zza);
            if (!zzd3) {
                break;
            }
            i++;
            zzig.zzb(zza, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte zza2 = zzib.zza(bArr, i);
            zzd = zzig.zzd(zza2);
            if (zzd) {
                zzig.zzb(zza2, cArr, i5);
                i5++;
                i = i6;
                while (i < i3) {
                    byte zza3 = zzib.zza(bArr, i);
                    zzd2 = zzig.zzd(zza3);
                    if (zzd2) {
                        i++;
                        zzig.zzb(zza3, cArr, i5);
                        i5++;
                    }
                }
            } else {
                zze = zzig.zze(zza2);
                if (!zze) {
                    zzf = zzig.zzf(zza2);
                    if (zzf) {
                        if (i6 >= i3 - 1) {
                            throw zzfo.zzh();
                        }
                        zzig.zzb(zza2, zzib.zza(bArr, i6), zzib.zza(bArr, i + 2), cArr, i5);
                        i5++;
                        i += 3;
                    } else if (i6 < i3 - 2) {
                        zzig.zzb(zza2, zzib.zza(bArr, i6), zzib.zza(bArr, i + 2), zzib.zza(bArr, i + 3), cArr, i5);
                        i5 += 2;
                        i += 4;
                    } else {
                        throw zzfo.zzh();
                    }
                } else if (i6 < i3) {
                    i += 2;
                    zzig.zzb(zza2, zzib.zza(bArr, i6), cArr, i5);
                    i5++;
                } else {
                    throw zzfo.zzh();
                }
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzif
    public final int zza(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        String str;
        String str2;
        long j2;
        int i3;
        char charAt;
        long j3 = i;
        long j4 = i2 + j3;
        int length = charSequence.length();
        String str3 = " at index ";
        String str4 = "Failed writing ";
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            j = 1;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            zzib.zza(bArr, j3, (byte) charAt);
            i4++;
            j3++;
        }
        if (i4 == length) {
            return (int) j3;
        }
        while (i4 < length) {
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 >= 128 || j3 >= j4) {
                if (charAt3 < 2048 && j3 <= j4 - 2) {
                    zzib.zza(bArr, j3, (byte) ((charAt3 >>> 6) | 960));
                    j2 = 2 + j3;
                    zzib.zza(bArr, j3 + j, (byte) ((charAt3 & '?') | 128));
                    str = str3;
                    str2 = str4;
                } else if ((charAt3 >= 55296 && 57343 >= charAt3) || j3 > j4 - 3) {
                    str = str3;
                    str2 = str4;
                    if (j3 <= j4 - 4) {
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt4 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                zzib.zza(bArr, j3, (byte) ((codePoint >>> 18) | 240));
                                zzib.zza(bArr, j3 + j, (byte) (((codePoint >>> 12) & 63) | 128));
                                zzib.zza(bArr, j3 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                zzib.zza(bArr, j3 + 3, (byte) ((codePoint & 63) | 128));
                                j3 = 4 + j3;
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new zzih(i4 - 1, length);
                    } else if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                        throw new zzih(i4, length);
                    } else {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append(str2);
                        sb2.append(charAt3);
                        sb2.append(str);
                        sb2.append(j3);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                } else {
                    zzib.zza(bArr, j3, (byte) ((charAt3 >>> '\f') | 480));
                    str = str3;
                    str2 = str4;
                    zzib.zza(bArr, j3 + j, (byte) (((charAt3 >>> 6) & 63) | 128));
                    j2 = j3 + 3;
                    zzib.zza(bArr, j3 + 2, (byte) ((charAt3 & '?') | 128));
                }
                j3 = j2;
            } else {
                zzib.zza(bArr, j3, (byte) charAt3);
                j3 += j;
                str = str3;
                str2 = str4;
            }
            i4++;
            str3 = str;
            str4 = str2;
            j = 1;
        }
        return (int) j3;
    }

    private static int zza(byte[] bArr, int i, long j, int i2) {
        int zzb;
        int zzb2;
        int zzb3;
        if (i2 == 0) {
            zzb = zzie.zzb(i);
            return zzb;
        } else if (i2 == 1) {
            zzb2 = zzie.zzb(i, zzib.zza(bArr, j));
            return zzb2;
        } else if (i2 == 2) {
            zzb3 = zzie.zzb(i, zzib.zza(bArr, j), zzib.zza(bArr, j + 1));
            return zzb3;
        } else {
            throw new AssertionError();
        }
    }
}
