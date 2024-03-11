package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class zzl {
    public final zzm zza;
    private final IntentFilter zzc;
    private final Context zzd;
    protected final Set zzb = new HashSet();
    private zzk zze = null;
    private volatile boolean zzf = false;

    public zzl(zzm zzmVar, IntentFilter intentFilter, Context context) {
        this.zza = zzmVar;
        this.zzc = intentFilter;
        this.zzd = zzz.zza(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zza(Context context, Intent intent);

    public final void zzd(Object obj) {
        synchronized (this) {
            Iterator it = new HashSet(this.zzb).iterator();
            while (it.hasNext()) {
                ((StateUpdatedListener) it.next()).onStateUpdate(obj);
            }
        }
    }
}
