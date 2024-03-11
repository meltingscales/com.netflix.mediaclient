package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzov extends zzou {
    protected final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzov(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.cast.zzoy
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzoy) && zzd() == ((zzoy) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzov) {
                zzov zzovVar = (zzov) obj;
                int zzk = zzk();
                int zzk2 = zzovVar.zzk();
                if (zzk == 0 || zzk2 == 0 || zzk == zzk2) {
                    int zzd = zzd();
                    if (zzd > zzovVar.zzd()) {
                        int zzd2 = zzd();
                        StringBuilder sb = new StringBuilder(40);
                        sb.append("Length too large: ");
                        sb.append(zzd);
                        sb.append(zzd2);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (zzd > zzovVar.zzd()) {
                        int zzd3 = zzovVar.zzd();
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Ran off end of other: 0, ");
                        sb2.append(zzd);
                        sb2.append(", ");
                        sb2.append(zzd3);
                        throw new IllegalArgumentException(sb2.toString());
                    } else {
                        byte[] bArr = this.zza;
                        byte[] bArr2 = zzovVar.zza;
                        zzovVar.zzc();
                        int i = 0;
                        int i2 = 0;
                        while (i < zzd) {
                            if (bArr[i] != bArr2[i2]) {
                                return false;
                            }
                            i++;
                            i2++;
                        }
                        return true;
                    }
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.zzoy
    public byte zza(int i) {
        return this.zza[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzoy
    public byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.zzoy
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.cast.zzoy
    protected final int zze(int i, int i2, int i3) {
        return zzqc.zzd(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.cast.zzoy
    public final zzoy zzf(int i, int i2) {
        zzoy.zzj(0, i2, zzd());
        return i2 == 0 ? zzoy.zzb : new zzos(this.zza, 0, i2);
    }

    @Override // com.google.android.gms.internal.cast.zzoy
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzoy
    public final void zzh(zzoo zzooVar) {
        ((zzpd) zzooVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.cast.zzoy
    public final boolean zzi() {
        return zzsr.zze(this.zza, 0, zzd());
    }
}
