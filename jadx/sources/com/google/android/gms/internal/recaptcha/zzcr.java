package com.google.android.gms.internal.recaptcha;

import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzcr extends zzco {
    protected final byte[] zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcr(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    protected int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzch
    public byte zza(int i) {
        return this.zzb[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.zzch
    public byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.recaptcha.zzch
    public int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzch
    public final zzch zza(int i, int i2) {
        int zzb = zzch.zzb(0, i2, zza());
        return zzb == 0 ? zzch.zza : new zzck(this.zzb, zze(), zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.zzch
    public final void zza(zzce zzceVar) {
        zzceVar.zza(this.zzb, zze(), zza());
    }

    @Override // com.google.android.gms.internal.recaptcha.zzch
    protected final String zza(Charset charset) {
        return new String(this.zzb, zze(), zza(), charset);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzch
    public final boolean zzc() {
        int zze = zze();
        return zzgq.zza(this.zzb, zze, zza() + zze);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzch
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzch) && zza() == ((zzch) obj).zza()) {
            if (zza() == 0) {
                return true;
            }
            if (obj instanceof zzcr) {
                zzcr zzcrVar = (zzcr) obj;
                int zzd = zzd();
                int zzd2 = zzcrVar.zzd();
                if (zzd == 0 || zzd2 == 0 || zzd == zzd2) {
                    return zza(zzcrVar, 0, zza());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzco
    final boolean zza(zzch zzchVar, int i, int i2) {
        if (i2 > zzchVar.zza()) {
            int zza = zza();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(zza);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzchVar.zza()) {
            int zza2 = zzchVar.zza();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(zza2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (zzchVar instanceof zzcr) {
            zzcr zzcrVar = (zzcr) zzchVar;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzcrVar.zzb;
            int zze = zze();
            int zze2 = zze();
            int zze3 = zzcrVar.zze();
            while (zze2 < zze + i2) {
                if (bArr[zze2] != bArr2[zze3]) {
                    return false;
                }
                zze2++;
                zze3++;
            }
            return true;
        } else {
            return zzchVar.zza(0, i2).equals(zza(0, i2));
        }
    }

    @Override // com.google.android.gms.internal.recaptcha.zzch
    protected final int zza(int i, int i2, int i3) {
        return zzdv.zza(i, this.zzb, zze(), i3);
    }
}
