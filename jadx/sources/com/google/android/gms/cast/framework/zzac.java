package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class zzac extends com.google.android.gms.internal.cast.zzb implements zzad {
    public static zzad zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
        return queryLocalInterface instanceof zzad ? (zzad) queryLocalInterface : new zzab(iBinder);
    }
}
