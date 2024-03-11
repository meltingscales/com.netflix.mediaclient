package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzx extends com.google.android.play.core.splitinstall.internal.zzs {
    private static zzx zzc;
    private final Handler zzd;
    private final zzg zze;
    private final Set zzf;

    public zzx(Context context, zzg zzgVar) {
        super(new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.zzd = new Handler(Looper.getMainLooper());
        this.zzf = new LinkedHashSet();
        this.zze = zzgVar;
    }

    public static zzx zzg(Context context) {
        zzx zzxVar;
        synchronized (zzx.class) {
            if (zzc == null) {
                zzc = new zzx(context, zzo.INSTANCE);
            }
            zzxVar = zzc;
        }
        return zzxVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzs
    public final void zza(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        SplitInstallSessionState zzd = SplitInstallSessionState.zzd(bundleExtra);
        this.zza.zza("ListenerRegistryBroadcastReceiver.onReceive: %s", zzd);
        zzh zza = this.zze.zza();
        if (zzd.status() != 3 || zza == null) {
            zzk(zzd);
        } else {
            zza.zzd(zzd.zzc(), new zzv(this, zzd, intent, context));
        }
    }

    public final void zzk(SplitInstallSessionState splitInstallSessionState) {
        synchronized (this) {
            Iterator it = new LinkedHashSet(this.zzf).iterator();
            while (it.hasNext()) {
                ((SplitInstallStateUpdatedListener) it.next()).onStateUpdate(splitInstallSessionState);
            }
            super.zze(splitInstallSessionState);
        }
    }
}
