package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzbj;
import com.google.android.gms.internal.measurement.zzbr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzt extends zzu {
    private zzbj.zze zzg;
    private final /* synthetic */ zzn zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzu
    public final boolean zzb() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzn zznVar, String str, int i, zzbj.zze zzeVar) {
        super(str, i);
        this.zzh = zznVar;
        this.zzg = zzeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzu
    public final int zza() {
        return this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(Long l, zzbr.zzk zzkVar, boolean z) {
        boolean zzd = this.zzh.zzt().zzd(this.zza, zzap.zzbl);
        boolean zzd2 = this.zzh.zzt().zzd(this.zza, zzap.zzbr);
        boolean zze = this.zzg.zze();
        boolean zzf = this.zzg.zzf();
        byte b = (zzd && this.zzg.zzh()) ? (byte) 1 : (byte) 0;
        byte b2 = (zze || zzf || b != 0) ? (byte) 1 : (byte) 0;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z && b2 == 0) {
            this.zzh.zzr().zzx().zza("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzb), this.zzg.zza() ? Integer.valueOf(this.zzg.zzb()) : null);
            return true;
        }
        zzbj.zzc zzd3 = this.zzg.zzd();
        boolean zzf2 = zzd3.zzf();
        if (zzkVar.zzf()) {
            if (!zzd3.zzc()) {
                this.zzh.zzr().zzi().zza("No number filter for long property. property", this.zzh.zzo().zzc(zzkVar.zzc()));
            } else {
                bool = zzu.zza(zzu.zza(zzkVar.zzg(), zzd3.zzd()), zzf2);
            }
        } else if (zzkVar.zzh()) {
            if (!zzd3.zzc()) {
                this.zzh.zzr().zzi().zza("No number filter for double property. property", this.zzh.zzo().zzc(zzkVar.zzc()));
            } else {
                bool = zzu.zza(zzu.zza(zzkVar.zzi(), zzd3.zzd()), zzf2);
            }
        } else if (zzkVar.zzd()) {
            if (!zzd3.zza()) {
                if (!zzd3.zzc()) {
                    this.zzh.zzr().zzi().zza("No string or number filter defined. property", this.zzh.zzo().zzc(zzkVar.zzc()));
                } else if (zzki.zza(zzkVar.zze())) {
                    bool = zzu.zza(zzu.zza(zzkVar.zze(), zzd3.zzd()), zzf2);
                } else {
                    this.zzh.zzr().zzi().zza("Invalid user property value for Numeric number filter. property, value", this.zzh.zzo().zzc(zzkVar.zzc()), zzkVar.zze());
                }
            } else {
                bool = zzu.zza(zzu.zza(zzkVar.zze(), zzd3.zzb(), this.zzh.zzr()), zzf2);
            }
        } else {
            this.zzh.zzr().zzi().zza("User property has no value, property", this.zzh.zzo().zzc(zzkVar.zzc()));
        }
        this.zzh.zzr().zzx().zza("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.zzc = Boolean.TRUE;
        if (!zzd || b == 0 || bool.booleanValue()) {
            if (!z || this.zzg.zze()) {
                this.zzd = bool;
            }
            if (bool.booleanValue() && b2 != 0 && zzkVar.zza()) {
                long zzb = zzkVar.zzb();
                if (zzd2 && l != null) {
                    zzb = l.longValue();
                }
                if (zzf) {
                    this.zzf = Long.valueOf(zzb);
                } else {
                    this.zze = Long.valueOf(zzb);
                }
            }
            return true;
        }
        return true;
    }
}
