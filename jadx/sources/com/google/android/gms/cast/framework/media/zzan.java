package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.zzap;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzan extends zzbk {
    final /* synthetic */ JSONObject zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(RemoteMediaClient remoteMediaClient, JSONObject jSONObject) {
        super(remoteMediaClient, false);
        this.zzb = remoteMediaClient;
        this.zza = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    protected final void zza() {
        zzap zzapVar;
        zzapVar = this.zzb.zzd;
        zzapVar.zzA(zzb(), 0, -1L, null, 1, null, null, this.zza);
    }
}
