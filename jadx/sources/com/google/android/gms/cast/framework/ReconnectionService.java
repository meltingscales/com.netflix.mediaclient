package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.Logger;

/* loaded from: classes2.dex */
public class ReconnectionService extends Service {
    private static final Logger zza = new Logger("ReconnectionService");
    private zzak zzb;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        zzak zzakVar = this.zzb;
        if (zzakVar != null) {
            try {
                return zzakVar.zzf(intent);
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "onBind", zzak.class.getSimpleName());
                return null;
            }
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        CastContext sharedInstance = CastContext.getSharedInstance(this);
        zzak zzc = com.google.android.gms.internal.cast.zzm.zzc(this, sharedInstance.getSessionManager().zzb(), sharedInstance.zzc().zza());
        this.zzb = zzc;
        if (zzc != null) {
            try {
                zzc.zzg();
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "onCreate", zzak.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        zzak zzakVar = this.zzb;
        if (zzakVar != null) {
            try {
                zzakVar.zzh();
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "onDestroy", zzak.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        zzak zzakVar = this.zzb;
        if (zzakVar != null) {
            try {
                return zzakVar.zze(intent, i, i2);
            } catch (RemoteException e) {
                zza.d(e, "Unable to call %s on %s.", "onStartCommand", zzak.class.getSimpleName());
                return 2;
            }
        }
        return 2;
    }
}
