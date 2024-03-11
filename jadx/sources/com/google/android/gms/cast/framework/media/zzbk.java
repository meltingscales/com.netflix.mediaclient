package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.zzar;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes2.dex */
public abstract class zzbk extends BasePendingResult {
    private zzar zza;
    private final boolean zzb;
    final /* synthetic */ RemoteMediaClient zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbk(RemoteMediaClient remoteMediaClient, boolean z) {
        super((GoogleApiClient) null);
        this.zzg = remoteMediaClient;
        this.zzb = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzbj(this, status);
    }

    abstract void zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzar zzb() {
        if (this.zza == null) {
            this.zza = new zzbi(this);
        }
        return this.zza;
    }

    public final void zzc() {
        Object obj;
        List<RemoteMediaClient.Listener> list;
        if (!this.zzb) {
            list = this.zzg.zzh;
            for (RemoteMediaClient.Listener listener : list) {
                listener.onSendingRemoteMediaRequest();
            }
            for (RemoteMediaClient.Callback callback : this.zzg.zza) {
                callback.onSendingRemoteMediaRequest();
            }
        }
        try {
            obj = this.zzg.zzb;
            synchronized (obj) {
                zza();
            }
        } catch (com.google.android.gms.cast.internal.zzan unused) {
            setResult(new zzbj(this, new Status(2100)));
        }
    }
}
