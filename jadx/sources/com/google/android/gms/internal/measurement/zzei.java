package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzei extends zzeg {
    private final byte[] zzd;
    private final boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private zzei(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzk = Integer.MAX_VALUE;
        this.zzd = bArr;
        this.zzf = i2 + i;
        this.zzh = i;
        this.zzi = i;
        this.zze = z;
    }

    private final void zzz() {
        int i = this.zzf + this.zzg;
        this.zzf = i;
        int i2 = i - this.zzi;
        int i3 = this.zzk;
        if (i2 <= i3) {
            this.zzg = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzg = i4;
        this.zzf = i - i4;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final boolean zzt() {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zzu() {
        return this.zzh - this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zza() {
        if (zzt()) {
            this.zzj = 0;
            return 0;
        }
        int zzv = zzv();
        this.zzj = zzv;
        if ((zzv >>> 3) != 0) {
            return zzv;
        }
        throw zzfo.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final void zza(int i) {
        if (this.zzj != i) {
            throw zzfo.zze();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final boolean zzb(int i) {
        int zza;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzf - this.zzh >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.zzd;
                    int i4 = this.zzh;
                    this.zzh = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzfo.zzc();
            }
            while (i3 < 10) {
                if (zzaa() < 0) {
                    i3++;
                }
            }
            throw zzfo.zzc();
            return true;
        } else if (i2 == 1) {
            zzf(8);
            return true;
        } else if (i2 == 2) {
            zzf(zzv());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzf(4);
                    return true;
                }
                throw zzfo.zzf();
            }
            return false;
        } else {
            do {
                zza = zza();
                if (zza == 0) {
                    break;
                }
            } while (zzb(zza));
            zza(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final double zzb() {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final float zzc() {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final long zzd() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final long zze() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zzf() {
        return zzv();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final long zzg() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zzh() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final boolean zzi() {
        return zzw() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final String zzj() {
        int zzv = zzv();
        if (zzv > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zzv <= i - i2) {
                String str = new String(this.zzd, i2, zzv, zzff.zza);
                this.zzh += zzv;
                return str;
            }
        }
        if (zzv == 0) {
            return "";
        }
        if (zzv < 0) {
            throw zzfo.zzb();
        }
        throw zzfo.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final String zzk() {
        int zzv = zzv();
        if (zzv > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zzv <= i - i2) {
                String zzb = zzie.zzb(this.zzd, i2, zzv);
                this.zzh += zzv;
                return zzb;
            }
        }
        if (zzv == 0) {
            return "";
        }
        if (zzv <= 0) {
            throw zzfo.zzb();
        }
        throw zzfo.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final zzdu zzl() {
        byte[] bArr;
        int zzv = zzv();
        if (zzv > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zzv <= i - i2) {
                zzdu zza = zzdu.zza(this.zzd, i2, zzv);
                this.zzh += zzv;
                return zza;
            }
        }
        if (zzv == 0) {
            return zzdu.zza;
        }
        if (zzv > 0) {
            int i3 = this.zzf;
            int i4 = this.zzh;
            if (zzv <= i3 - i4) {
                int i5 = zzv + i4;
                this.zzh = i5;
                bArr = Arrays.copyOfRange(this.zzd, i4, i5);
                return zzdu.zza(bArr);
            }
        }
        if (zzv <= 0) {
            if (zzv == 0) {
                bArr = zzff.zzb;
                return zzdu.zza(bArr);
            }
            throw zzfo.zzb();
        }
        throw zzfo.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zzm() {
        return zzv();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zzn() {
        return zzv();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zzo() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final long zzp() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zzq() {
        return zzeg.zze(zzv());
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final long zzr() {
        return zzeg.zza(zzw());
    }

    private final int zzv() {
        int i;
        int i2 = this.zzh;
        int i3 = this.zzf;
        if (i3 != i2) {
            byte[] bArr = this.zzd;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzh = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                if (bArr[i7] >= 0) {
                                                    i5 = i2 + 10;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.zzh = i5;
                return i;
            }
        }
        return (int) zzs();
    }

    private final long zzw() {
        long j;
        long j2;
        long j3;
        int i = this.zzh;
        int i2 = this.zzf;
        if (i2 != i) {
            byte[] bArr = this.zzd;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzh = i3;
                return b;
            } else if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            i4 = i8;
                            j = (-2080896) ^ i9;
                        } else {
                            long j4 = i9;
                            i4 = i + 5;
                            long j5 = j4 ^ (bArr[i8] << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (bArr[i4] << 35);
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (bArr[i4] << 49);
                                        if (j6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j7 = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                if (bArr[i4] >= 0) {
                                                    i4 = i + 10;
                                                }
                                            }
                                            j = j7;
                                        }
                                    }
                                }
                                j = j6 ^ j2;
                                i4 = i10;
                            }
                            j = j5 ^ j3;
                        }
                    }
                }
                this.zzh = i4;
                return j;
            }
        }
        return zzs();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzeg
    public final long zzs() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzaa = zzaa();
            j |= (zzaa & Byte.MAX_VALUE) << i;
            if ((zzaa & 128) == 0) {
                return j;
            }
        }
        throw zzfo.zzc();
    }

    private final int zzx() {
        int i = this.zzh;
        if (this.zzf - i < 4) {
            throw zzfo.zza();
        }
        byte[] bArr = this.zzd;
        this.zzh = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zzy() {
        int i = this.zzh;
        if (this.zzf - i < 8) {
            throw zzfo.zza();
        }
        byte[] bArr = this.zzd;
        this.zzh = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zzc(int i) {
        if (i < 0) {
            throw zzfo.zzb();
        }
        int zzu = i + zzu();
        int i2 = this.zzk;
        if (zzu > i2) {
            throw zzfo.zza();
        }
        this.zzk = zzu;
        zzz();
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final void zzd(int i) {
        this.zzk = i;
        zzz();
    }

    private final byte zzaa() {
        int i = this.zzh;
        if (i == this.zzf) {
            throw zzfo.zza();
        }
        byte[] bArr = this.zzd;
        this.zzh = i + 1;
        return bArr[i];
    }

    private final void zzf(int i) {
        if (i >= 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (i <= i2 - i3) {
                this.zzh = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzfo.zzb();
        }
        throw zzfo.zza();
    }
}
