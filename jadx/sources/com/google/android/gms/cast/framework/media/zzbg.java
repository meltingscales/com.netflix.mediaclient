package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbg implements RemoteMediaClient.MediaChannelResult {
    final /* synthetic */ Status zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbg(zzbh zzbhVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
