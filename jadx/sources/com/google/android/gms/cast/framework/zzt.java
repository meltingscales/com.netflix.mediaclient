package com.google.android.gms.cast.framework;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzt {
    private static final Logger zza = new Logger("DiscoveryManager");
    private final zzah zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(zzah zzahVar) {
        this.zzb = zzahVar;
    }

    public final IObjectWrapper zza() {
        try {
            return this.zzb.zze();
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "getWrappedThis", zzah.class.getSimpleName());
            return null;
        }
    }
}
