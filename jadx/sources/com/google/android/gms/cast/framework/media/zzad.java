package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.zzap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzad extends zzbk {
    final /* synthetic */ long[] zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzad(RemoteMediaClient remoteMediaClient, long[] jArr) {
        super(remoteMediaClient, false);
        this.zzb = remoteMediaClient;
        this.zza = jArr;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    protected final void zza() {
        zzap zzapVar;
        zzapVar = this.zzb.zzd;
        zzapVar.zzD(zzb(), this.zza);
    }
}
