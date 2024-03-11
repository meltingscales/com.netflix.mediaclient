package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.internal.zzap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzba extends zzbk {
    final /* synthetic */ MediaSeekOptions zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzba(RemoteMediaClient remoteMediaClient, MediaSeekOptions mediaSeekOptions) {
        super(remoteMediaClient, false);
        this.zzb = remoteMediaClient;
        this.zza = mediaSeekOptions;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    protected final void zza() {
        zzap zzapVar;
        zzapVar = this.zzb.zzd;
        zzapVar.zzC(zzb(), this.zza);
    }
}
