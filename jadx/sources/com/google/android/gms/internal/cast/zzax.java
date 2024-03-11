package com.google.android.gms.internal.cast;

import android.annotation.TargetApi;
import androidx.mediarouter.media.MediaRouter;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.TransferCallback;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.HashSet;
import java.util.Set;
import org.chromium.net.ConnectionSubtype;

@TargetApi(ConnectionSubtype.SUBTYPE_WIFI_N)
/* loaded from: classes2.dex */
public final class zzax {
    private static final Logger zza = new Logger("TransferController");
    private final Set zzb = new HashSet();
    private int zzc = 0;
    private SessionManager zzd;
    private zzoi zze;
    private SessionState zzf;

    public static /* synthetic */ void zza(zzax zzaxVar, Exception exc) {
        zza.w(exc, "Error storing session", new Object[0]);
        zzoi zzoiVar = zzaxVar.zze;
        if (zzoiVar != null) {
            zzoiVar.cancel(false);
        }
    }

    public static /* synthetic */ void zzb(zzax zzaxVar, SessionState sessionState) {
        if (sessionState == null) {
            return;
        }
        zzaxVar.zzf = sessionState;
        zzoi zzoiVar = zzaxVar.zze;
        if (zzoiVar != null) {
            zzoiVar.zzi(null);
        }
    }

    private final void zzf() {
        CastSession currentCastSession;
        SessionManager sessionManager = this.zzd;
        if (sessionManager == null || (currentCastSession = sessionManager.getCurrentCastSession()) == null) {
            return;
        }
        currentCastSession.zzk(null);
    }

    public final void zzc(SessionManager sessionManager) {
        this.zzd = sessionManager;
    }

    public final void zzd() {
        SessionState sessionState;
        if (this.zzc == 0 || (sessionState = this.zzf) == null) {
            return;
        }
        zza.d("notify transferred with type = %d, sessionState = %s", 1, sessionState);
        for (TransferCallback transferCallback : new HashSet(this.zzb)) {
            transferCallback.onTransfer(this.zzc, sessionState);
        }
        this.zzc = 0;
        this.zzf = null;
        zzf();
    }

    public final void zze(MediaRouter.RouteInfo routeInfo, MediaRouter.RouteInfo routeInfo2, zzoi zzoiVar) {
        CastSession currentCastSession;
        if (new HashSet(this.zzb).isEmpty()) {
            zza.d("No need to prepare transfer without any callback", new Object[0]);
            zzoiVar.zzi(null);
        } else if (routeInfo.getPlaybackType() != 1 || routeInfo2.getPlaybackType() != 0) {
            zza.d("No need to prepare transfer for non cast-to-phone case", new Object[0]);
            zzoiVar.zzi(null);
        } else {
            SessionManager sessionManager = this.zzd;
            if (sessionManager == null) {
                currentCastSession = null;
            } else {
                currentCastSession = sessionManager.getCurrentCastSession();
                if (currentCastSession != null) {
                    currentCastSession.zzk(this);
                }
            }
            if (currentCastSession == null) {
                zza.d("No need to prepare transfer when there is no Cast session", new Object[0]);
                zzoiVar.zzi(null);
                return;
            }
            RemoteMediaClient remoteMediaClient = currentCastSession.getRemoteMediaClient();
            if (remoteMediaClient == null || !remoteMediaClient.hasMediaSession()) {
                zza.d("No need to prepare transfer when there is no media session", new Object[0]);
                zzf();
                zzoiVar.zzi(null);
                return;
            }
            zza.d("Prepare route transfer for changing endpoint", new Object[0]);
            this.zzf = null;
            this.zzc = 1;
            this.zze = zzoiVar;
            remoteMediaClient.zzi(null).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast.zzaw
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    zzax.zzb(zzax.this, (SessionState) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast.zzav
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    zzax.zza(zzax.this, exc);
                }
            });
            zzl.zzd(zzkk.CAST_TRANSFER_TO_LOCAL_USED);
        }
    }
}
