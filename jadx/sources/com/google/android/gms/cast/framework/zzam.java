package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class zzam extends com.google.android.gms.internal.cast.zzb implements zzan {
    public static zzan zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
        return queryLocalInterface instanceof zzan ? (zzan) queryLocalInterface : new zzal(iBinder);
    }
}
