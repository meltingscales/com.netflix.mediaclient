package com.google.android.gms.internal.recaptcha;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzff<T> implements zzfp<T> {
    private final zzey zza;
    private final zzgh<?, ?> zzb;
    private final boolean zzc;
    private final zzdh<?> zzd;

    private zzff(zzgh<?, ?> zzghVar, zzdh<?> zzdhVar, zzey zzeyVar) {
        this.zzb = zzghVar;
        this.zzc = zzdhVar.zza(zzeyVar);
        this.zzd = zzdhVar;
        this.zza = zzeyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzff<T> zza(zzgh<?, ?> zzghVar, zzdh<?> zzdhVar, zzey zzeyVar) {
        return new zzff<>(zzghVar, zzdhVar, zzeyVar);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzfp
    public final boolean zza(T t, T t2) {
        if (this.zzb.zzb(t).equals(this.zzb.zzb(t2))) {
            if (this.zzc) {
                return this.zzd.zza(t).equals(this.zzd.zza(t2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzfp
    public final int zza(T t) {
        int hashCode = this.zzb.zzb(t).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzfp
    public final void zzb(T t, T t2) {
        zzfr.zza(this.zzb, t, t2);
        if (this.zzc) {
            zzfr.zza(this.zzd, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.recaptcha.zzfp
    public final void zza(T t, zzhe zzheVar) {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzdn zzdnVar = (zzdn) next.getKey();
            if (zzdnVar.zzc() != zzhb.MESSAGE || zzdnVar.zzd() || zzdnVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzef) {
                zzheVar.zza(zzdnVar.zza(), (Object) ((zzef) next).zza().zzc());
            } else {
                zzheVar.zza(zzdnVar.zza(), next.getValue());
            }
        }
        zzgh<?, ?> zzghVar = this.zzb;
        zzghVar.zzb(zzghVar.zzb(t), zzheVar);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzfp
    public final void zzc(T t) {
        this.zzb.zzd(t);
        this.zzd.zzc(t);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzfp
    public final boolean zzd(T t) {
        return this.zzd.zza(t).zzf();
    }

    @Override // com.google.android.gms.internal.recaptcha.zzfp
    public final int zzb(T t) {
        zzgh<?, ?> zzghVar = this.zzb;
        int zze = zzghVar.zze(zzghVar.zzb(t));
        return this.zzc ? zze + this.zzd.zza(t).zzg() : zze;
    }
}
