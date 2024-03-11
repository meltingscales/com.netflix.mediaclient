package com.google.android.gms.cast.framework;

import android.os.RemoteException;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzr extends com.google.android.gms.cast.zzq {
    final /* synthetic */ CastSession zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzr(CastSession castSession, zzq zzqVar) {
        this.zza = castSession;
    }

    @Override // com.google.android.gms.cast.zzq
    public final void zza() {
        zzad zzadVar;
        Logger logger;
        RemoteMediaClient remoteMediaClient;
        zzad zzadVar2;
        RemoteMediaClient remoteMediaClient2;
        CastSession castSession = this.zza;
        zzadVar = castSession.zze;
        if (zzadVar != null) {
            try {
                remoteMediaClient = castSession.zzi;
                if (remoteMediaClient != null) {
                    remoteMediaClient2 = castSession.zzi;
                    remoteMediaClient2.zzn();
                }
                zzadVar2 = this.zza.zze;
                zzadVar2.zzh(null);
            } catch (RemoteException e) {
                logger = CastSession.zzb;
                logger.d(e, "Unable to call %s on %s.", "onConnected", zzad.class.getSimpleName());
            }
            CastSession.zzj(this.zza);
        }
    }

    @Override // com.google.android.gms.cast.zzq
    public final void zzb(int i) {
        zzad zzadVar;
        Logger logger;
        zzad zzadVar2;
        CastSession castSession = this.zza;
        zzadVar = castSession.zze;
        if (zzadVar != null) {
            try {
                zzadVar2 = castSession.zze;
                zzadVar2.zzi(new ConnectionResult(i));
            } catch (RemoteException e) {
                logger = CastSession.zzb;
                logger.d(e, "Unable to call %s on %s.", "onConnectionFailed", zzad.class.getSimpleName());
            }
        }
    }

    @Override // com.google.android.gms.cast.zzq
    public final void zzc(int i) {
        zzad zzadVar;
        Logger logger;
        zzad zzadVar2;
        CastSession castSession = this.zza;
        zzadVar = castSession.zze;
        if (zzadVar != null) {
            try {
                zzadVar2 = castSession.zze;
                zzadVar2.zzj(i);
            } catch (RemoteException e) {
                logger = CastSession.zzb;
                logger.d(e, "Unable to call %s on %s.", "onConnectionSuspended", zzad.class.getSimpleName());
            }
        }
    }

    @Override // com.google.android.gms.cast.zzq
    public final void zzd(int i) {
        zzad zzadVar;
        Logger logger;
        zzad zzadVar2;
        CastSession castSession = this.zza;
        zzadVar = castSession.zze;
        if (zzadVar != null) {
            try {
                zzadVar2 = castSession.zze;
                zzadVar2.zzi(new ConnectionResult(i));
            } catch (RemoteException e) {
                logger = CastSession.zzb;
                logger.d(e, "Unable to call %s on %s.", "onDisconnected", zzad.class.getSimpleName());
            }
        }
    }
}
