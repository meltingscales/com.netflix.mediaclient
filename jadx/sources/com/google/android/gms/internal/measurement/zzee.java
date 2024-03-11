package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class zzee extends zzef {
    protected final byte[] zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzee(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    protected int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public byte zza(int i) {
        return this.zzb[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzdu
    public byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final zzdu zza(int i, int i2) {
        int zzb = zzdu.zzb(0, i2, zza());
        return zzb == 0 ? zzdu.zza : new zzeb(this.zzb, zze(), zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza(zzdv zzdvVar) {
        zzdvVar.zza(this.zzb, zze(), zza());
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    protected final String zza(Charset charset) {
        return new String(this.zzb, zze(), zza(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final boolean zzc() {
        int zze = zze();
        return zzie.zza(this.zzb, zze, zza() + zze);
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdu) && zza() == ((zzdu) obj).zza()) {
            if (zza() == 0) {
                return true;
            }
            if (obj instanceof zzee) {
                zzee zzeeVar = (zzee) obj;
                int zzd = zzd();
                int zzd2 = zzeeVar.zzd();
                if (zzd == 0 || zzd2 == 0 || zzd == zzd2) {
                    return zza(zzeeVar, 0, zza());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzef
    final boolean zza(zzdu zzduVar, int i, int i2) {
        if (i2 > zzduVar.zza()) {
            int zza = zza();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(zza);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzduVar.zza()) {
            int zza2 = zzduVar.zza();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(zza2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (zzduVar instanceof zzee) {
            zzee zzeeVar = (zzee) zzduVar;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzeeVar.zzb;
            int zze = zze();
            int zze2 = zze();
            int zze3 = zzeeVar.zze();
            while (zze2 < zze + i2) {
                if (bArr[zze2] != bArr2[zze3]) {
                    return false;
                }
                zze2++;
                zze3++;
            }
            return true;
        } else {
            return zzduVar.zza(0, i2).equals(zza(0, i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    protected final int zza(int i, int i2, int i3) {
        return zzff.zza(i, this.zzb, zze(), i3);
    }
}
