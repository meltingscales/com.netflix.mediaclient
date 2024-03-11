package com.google.android.gms.cast.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzal implements zzar {
    final /* synthetic */ zzar zza;
    final /* synthetic */ zzap zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzal(zzap zzapVar, zzar zzarVar) {
        this.zzb = zzapVar;
        this.zza = zzarVar;
    }

    @Override // com.google.android.gms.cast.internal.zzar
    public final void zza(long j, int i, Object obj) {
        int i2;
        zzam zzamVar;
        if (this.zza != null) {
            if (i == 2001) {
                zzap zzapVar = this.zzb;
                Logger logger = zzapVar.zza;
                i2 = zzapVar.zzA;
                logger.w("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", Integer.valueOf(i2));
                zzamVar = this.zzb.zzz;
                zzamVar.zzl();
                i = 2001;
            }
            this.zza.zza(j, i, obj);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzar
    public final void zzb(long j) {
        zzar zzarVar = this.zza;
        if (zzarVar != null) {
            zzarVar.zzb(j);
        }
    }
}
