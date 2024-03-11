package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.zzap;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaz extends zzbk {
    final /* synthetic */ JSONObject zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaz(RemoteMediaClient remoteMediaClient, JSONObject jSONObject) {
        super(remoteMediaClient, false);
        this.zzb = remoteMediaClient;
        this.zza = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    protected final void zza() {
        zzap zzapVar;
        zzapVar = this.zzb.zzd;
        zzapVar.zzr(zzb(), this.zza);
    }
}
