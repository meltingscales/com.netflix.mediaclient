package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public class SessionManager {
    private static final Logger zza = new Logger("SessionManager");
    private final zzap zzb;
    private final Context zzc;

    public SessionManager(zzap zzapVar, Context context) {
        this.zzb = zzapVar;
        this.zzc = context;
    }

    public void endCurrentSession(boolean z) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            zza.i("End session for %s", this.zzc.getPackageName());
            this.zzb.zzj(true, z);
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "endCurrentSession", zzap.class.getSimpleName());
        }
    }

    public CastSession getCurrentCastSession() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        Session currentSession = getCurrentSession();
        if (currentSession == null || !(currentSession instanceof CastSession)) {
            return null;
        }
        return (CastSession) currentSession;
    }

    public Session getCurrentSession() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            return (Session) ObjectWrapper.unwrap(this.zzb.zzf());
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "getWrappedCurrentSession", zzap.class.getSimpleName());
            return null;
        }
    }

    public final IObjectWrapper zzb() {
        try {
            return this.zzb.zzg();
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "getWrappedThis", zzap.class.getSimpleName());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(CastStateListener castStateListener) {
        Preconditions.checkNotNull(castStateListener);
        try {
            this.zzb.zzh(new zzs(castStateListener));
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "addCastStateListener", zzap.class.getSimpleName());
        }
    }

    public <T extends Session> void removeSessionManagerListener(SessionManagerListener<T> sessionManagerListener, Class cls) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (sessionManagerListener == null) {
            return;
        }
        try {
            this.zzb.zzl(new zzba(sessionManagerListener, cls));
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "removeSessionManagerListener", zzap.class.getSimpleName());
        }
    }

    public <T extends Session> void addSessionManagerListener(SessionManagerListener<T> sessionManagerListener, Class<T> cls) {
        if (sessionManagerListener == null) {
            throw new NullPointerException("SessionManagerListener can't be null");
        }
        Preconditions.checkNotNull(cls);
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            this.zzb.zzi(new zzba(sessionManagerListener, cls));
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "addSessionManagerListener", zzap.class.getSimpleName());
        }
    }
}
