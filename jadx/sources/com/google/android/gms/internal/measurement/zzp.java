package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes5.dex */
public final class zzp extends zza implements zzn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzn
    public final void zza(Bundle bundle) {
        Parcel a_ = a_();
        zzb.zza(a_, bundle);
        zzb(1, a_);
    }
}
