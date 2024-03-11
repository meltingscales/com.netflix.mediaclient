package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class zzz extends com.google.android.gms.internal.cast.zzb implements zzaa {
    public static zzaa zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
        return queryLocalInterface instanceof zzaa ? (zzaa) queryLocalInterface : new zzy(iBinder);
    }
}
