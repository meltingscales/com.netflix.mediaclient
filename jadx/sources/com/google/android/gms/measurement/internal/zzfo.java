package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes5.dex */
public final class zzfo implements ServiceConnection {
    final /* synthetic */ zzfl zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfo(zzfl zzflVar, String str) {
        this.zza = zzflVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.zza.zza.zzr().zzi().zza("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzd zza = com.google.android.gms.internal.measurement.zzg.zza(iBinder);
            if (zza == null) {
                this.zza.zza.zzr().zzi().zza("Install Referrer Service implementation was not found");
                return;
            }
            this.zza.zza.zzr().zzv().zza("Install Referrer Service connected");
            this.zza.zza.zzq().zza(new zzfn(this, zza, this));
        } catch (Exception e) {
            this.zza.zza.zzr().zzi().zza("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zza.zzr().zzv().zza("Install Referrer Service disconnected");
    }
}
