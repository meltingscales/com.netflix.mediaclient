package com.google.android.gms.internal.cast;

/* loaded from: classes2.dex */
final class zzrf implements zzrm {
    private final zzrb zza;
    private final zzsd zzb;
    private final boolean zzc;
    private final zzpj zzd;

    private zzrf(zzsd zzsdVar, zzpj zzpjVar, zzrb zzrbVar) {
        this.zzb = zzsdVar;
        this.zzc = zzpjVar.zzc(zzrbVar);
        this.zzd = zzpjVar;
        this.zza = zzrbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzrf zzg(zzsd zzsdVar, zzpj zzpjVar, zzrb zzrbVar) {
        return new zzrf(zzsdVar, zzpjVar, zzrbVar);
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final int zza(Object obj) {
        zzsd zzsdVar = this.zzb;
        int zzb = zzsdVar.zzb(zzsdVar.zzc(obj));
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzc(obj).hashCode();
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final void zzc(Object obj) {
        this.zzb.zze(obj);
        this.zzd.zzb(obj);
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final void zzd(Object obj, Object obj2) {
        zzro.zzD(this.zzb, obj, obj2);
        if (this.zzc) {
            zzro.zzC(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final boolean zze(Object obj, Object obj2) {
        if (this.zzb.zzc(obj).equals(this.zzb.zzc(obj2))) {
            if (this.zzc) {
                this.zzd.zza(obj);
                this.zzd.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final boolean zzf(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final void zzi(Object obj, zzph zzphVar) {
        this.zzd.zza(obj);
        throw null;
    }
}
