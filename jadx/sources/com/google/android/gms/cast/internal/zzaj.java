package com.google.android.gms.cast.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaj implements zzar {
    final /* synthetic */ zzar zza;
    final /* synthetic */ zzap zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaj(zzap zzapVar, zzar zzarVar) {
        this.zzb = zzapVar;
        this.zza = zzarVar;
    }

    @Override // com.google.android.gms.cast.internal.zzar
    public final void zza(long j, int i, Object obj) {
        this.zzb.zzy = null;
        zzar zzarVar = this.zza;
        if (zzarVar != null) {
            zzarVar.zza(j, i, obj);
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
