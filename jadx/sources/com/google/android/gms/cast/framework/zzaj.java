package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class zzaj extends com.google.android.gms.internal.cast.zzb implements zzak {
    public static zzak zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
        return queryLocalInterface instanceof zzak ? (zzak) queryLocalInterface : new zzai(iBinder);
    }
}
