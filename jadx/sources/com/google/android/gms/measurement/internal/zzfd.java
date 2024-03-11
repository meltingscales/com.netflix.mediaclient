package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class zzfd extends BroadcastReceiver {
    @VisibleForTesting
    private static final String zza = "com.google.android.gms.measurement.internal.zzfd";
    private final zzke zzb;
    private boolean zzc;
    private boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfd(zzke zzkeVar) {
        Preconditions.checkNotNull(zzkeVar);
        this.zzb = zzkeVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.zzb.zzk();
        String action = intent.getAction();
        this.zzb.zzr().zzx().zza("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zzf = this.zzb.zzd().zzf();
            if (this.zzd != zzf) {
                this.zzd = zzf;
                this.zzb.zzq().zza(new zzfg(this, zzf));
                return;
            }
            return;
        }
        this.zzb.zzr().zzi().zza("NetworkBroadcastReceiver received unknown action", action);
    }

    public final void zza() {
        this.zzb.zzk();
        this.zzb.zzq().zzd();
        if (this.zzc) {
            return;
        }
        this.zzb.zzn().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzd = this.zzb.zzd().zzf();
        this.zzb.zzr().zzx().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzd));
        this.zzc = true;
    }

    public final void zzb() {
        this.zzb.zzk();
        this.zzb.zzq().zzd();
        this.zzb.zzq().zzd();
        if (this.zzc) {
            this.zzb.zzr().zzx().zza("Unregistering connectivity change receiver");
            this.zzc = false;
            this.zzd = false;
            try {
                this.zzb.zzn().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.zzb.zzr().zzf().zza("Failed to unregister the network broadcast receiver", e);
            }
        }
    }
}
