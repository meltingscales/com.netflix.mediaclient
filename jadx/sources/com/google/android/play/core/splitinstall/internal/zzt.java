package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzt {
    protected final Set zza = new HashSet();

    public final void zza(StateUpdatedListener stateUpdatedListener) {
        synchronized (this) {
            this.zza.add(stateUpdatedListener);
        }
    }

    public final void zzc(Object obj) {
        synchronized (this) {
            for (StateUpdatedListener stateUpdatedListener : this.zza) {
                stateUpdatedListener.onStateUpdate(obj);
            }
        }
    }
}
