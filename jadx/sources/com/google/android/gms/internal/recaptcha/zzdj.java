package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.zzds;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzdj extends zzdh<zzds.zze> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.zzdh
    public final boolean zza(zzey zzeyVar) {
        return zzeyVar instanceof zzds.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.zzdh
    public final zzdl<zzds.zze> zza(Object obj) {
        return ((zzds.zzb) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.zzdh
    public final zzdl<zzds.zze> zzb(Object obj) {
        zzds.zzb zzbVar = (zzds.zzb) obj;
        if (zzbVar.zzc.zzc()) {
            zzbVar.zzc = (zzdl) zzbVar.zzc.clone();
        }
        return zzbVar.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.zzdh
    public final void zzc(Object obj) {
        zza(obj).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.zzdh
    public final int zza(Map.Entry<?, ?> entry) {
        zzds.zze zzeVar = (zzds.zze) entry.getKey();
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.zzdh
    public final void zza(zzhe zzheVar, Map.Entry<?, ?> entry) {
        zzds.zze zzeVar = (zzds.zze) entry.getKey();
        throw new NoSuchMethodError();
    }
}
