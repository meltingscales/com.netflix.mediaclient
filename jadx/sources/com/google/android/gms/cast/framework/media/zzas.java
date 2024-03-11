package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.zzap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzas extends zzbk {
    final /* synthetic */ RemoteMediaClient zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzas(RemoteMediaClient remoteMediaClient, boolean z) {
        super(remoteMediaClient, true);
        this.zza = remoteMediaClient;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    protected final void zza() {
        zzap zzapVar;
        zzapVar = this.zza.zzd;
        zzapVar.zzu(zzb());
    }
}
