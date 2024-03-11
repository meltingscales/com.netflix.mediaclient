package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.zzap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzat extends zzbk {
    final /* synthetic */ int[] zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzat(RemoteMediaClient remoteMediaClient, boolean z, int[] iArr) {
        super(remoteMediaClient, true);
        this.zzb = remoteMediaClient;
        this.zza = iArr;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    protected final void zza() {
        zzap zzapVar;
        zzapVar = this.zzb.zzd;
        zzapVar.zzv(zzb(), this.zza);
    }
}
