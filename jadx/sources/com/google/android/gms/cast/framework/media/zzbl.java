package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzbl implements RemoteMediaClient.MediaChannelResult {
    private final Status zza;
    private final JSONObject zzb;
    private final MediaError zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbl(Status status, JSONObject jSONObject, MediaError mediaError) {
        this.zza = status;
        this.zzb = jSONObject;
        this.zzc = mediaError;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
