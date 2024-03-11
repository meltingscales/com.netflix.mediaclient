package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class Session {
    private static final Logger zza = new Logger("Session");
    private final zzan zzb;
    private final zzaz zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public Session(Context context, String str, String str2) {
        zzaz zzazVar = new zzaz(this, null);
        this.zzc = zzazVar;
        this.zzb = com.google.android.gms.internal.cast.zzm.zzd(context, str, str2, zzazVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void end(boolean z);

    public long getSessionRemainingTimeMs() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return 0L;
    }

    public boolean isConnected() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzan zzanVar = this.zzb;
        if (zzanVar != null) {
            try {
                return zzanVar.zzp();
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "isConnected", zzan.class.getSimpleName());
                return false;
            }
        }
        return false;
    }

    public boolean isResuming() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzan zzanVar = this.zzb;
        if (zzanVar != null) {
            try {
                return zzanVar.zzt();
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "isResuming", zzan.class.getSimpleName());
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyFailedToResumeSession(int i) {
        zzan zzanVar = this.zzb;
        if (zzanVar != null) {
            try {
                zzanVar.zzj(i);
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "notifyFailedToResumeSession", zzan.class.getSimpleName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyFailedToStartSession(int i) {
        zzan zzanVar = this.zzb;
        if (zzanVar != null) {
            try {
                zzanVar.zzk(i);
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "notifyFailedToStartSession", zzan.class.getSimpleName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifySessionEnded(int i) {
        zzan zzanVar = this.zzb;
        if (zzanVar != null) {
            try {
                zzanVar.zzl(i);
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "notifySessionEnded", zzan.class.getSimpleName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onResuming(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onStarting(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void resume(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void start(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzm(Bundle bundle) {
    }

    public final int zzn() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzan zzanVar = this.zzb;
        if (zzanVar != null) {
            try {
                if (zzanVar.zze() >= 211100000) {
                    return this.zzb.zzf();
                }
                return 0;
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "getSessionStartType", zzan.class.getSimpleName());
                return 0;
            }
        }
        return 0;
    }

    public final IObjectWrapper zzo() {
        zzan zzanVar = this.zzb;
        if (zzanVar != null) {
            try {
                return zzanVar.zzg();
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "getWrappedObject", zzan.class.getSimpleName());
                return null;
            }
        }
        return null;
    }
}
