package com.google.android.gms.internal.cast;

import android.view.View;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;

/* loaded from: classes5.dex */
public final class zzbo extends UIController implements RemoteMediaClient.ProgressListener {
    private final View zza;
    private final com.google.android.gms.cast.framework.media.uicontroller.zza zzb;

    public zzbo(View view, com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar) {
        this.zza = view;
        this.zzb = zzaVar;
        view.setEnabled(false);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.ProgressListener
    public final void onProgressUpdated(long j, long j2) {
        zza();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSendingRemoteMediaRequest() {
        this.zza.setEnabled(false);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionConnected(CastSession castSession) {
        super.onSessionConnected(castSession);
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.addProgressListener(this, 1000L);
        }
        zza();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionEnded() {
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.removeProgressListener(this);
        }
        this.zza.setEnabled(false);
        super.onSessionEnded();
        zza();
    }

    final void zza() {
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        boolean z = false;
        if (remoteMediaClient == null || !remoteMediaClient.hasMediaSession() || remoteMediaClient.isPlayingAd()) {
            this.zza.setEnabled(false);
        } else if (!remoteMediaClient.isLiveStream()) {
            this.zza.setEnabled(true);
        } else {
            View view = this.zza;
            if (remoteMediaClient.zzq()) {
                com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar = this.zzb;
                if ((zzaVar.zza() + zzaVar.zze()) - (zzaVar.zzd() + zzaVar.zze()) >= 10000) {
                    z = true;
                }
            }
            view.setEnabled(z);
        }
    }
}
