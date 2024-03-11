package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzs {
    public final zzu zza;
    private final IntentFilter zzc;
    private final Context zzd;
    protected final Set zzb = new HashSet();
    private zzr zze = null;
    private volatile boolean zzf = false;

    public zzs(zzu zzuVar, IntentFilter intentFilter, Context context) {
        this.zza = zzuVar;
        this.zzc = intentFilter;
        this.zzd = zzbr.zza(context);
    }

    private final void zzf() {
        zzr zzrVar;
        if ((this.zzf || !this.zzb.isEmpty()) && this.zze == null) {
            zzr zzrVar2 = new zzr(this, null);
            this.zze = zzrVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.zzd.registerReceiver(zzrVar2, this.zzc, 2);
            } else {
                this.zzd.registerReceiver(zzrVar2, this.zzc);
            }
        }
        if (this.zzf || !this.zzb.isEmpty() || (zzrVar = this.zze) == null) {
            return;
        }
        this.zzd.unregisterReceiver(zzrVar);
        this.zze = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zza(Context context, Intent intent);

    public final void zzb(StateUpdatedListener stateUpdatedListener) {
        synchronized (this) {
            this.zza.zzd("registerListener", new Object[0]);
            zzbv.zza(stateUpdatedListener, "Registered Play Core listener should not be null.");
            this.zzb.add(stateUpdatedListener);
            zzf();
        }
    }

    public final void zzc(boolean z) {
        synchronized (this) {
            this.zzf = true;
            zzf();
        }
    }

    public final void zze(Object obj) {
        synchronized (this) {
            Iterator it = new HashSet(this.zzb).iterator();
            while (it.hasNext()) {
                ((StateUpdatedListener) it.next()).onStateUpdate(obj);
            }
        }
    }
}
