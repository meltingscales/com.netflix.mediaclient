package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzag extends com.google.android.gms.internal.cast.zza implements zzah {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    @Override // com.google.android.gms.cast.framework.zzah
    public final IObjectWrapper zze() {
        Parcel zzb = zzb(5, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzb.readStrongBinder());
        zzb.recycle();
        return asInterface;
    }
}
