package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzfq;
import com.google.android.gms.measurement.internal.zzfr;

/* loaded from: classes5.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zzfr {
    private zzfq zza;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.zza == null) {
            this.zza = new zzfq(this);
        }
        this.zza.zza(context, intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzfr
    public final void doStartService(Context context, Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzfr
    public final BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }
}
