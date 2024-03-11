package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.Cast;

/* loaded from: classes2.dex */
final class zzu implements Runnable {
    final /* synthetic */ zzw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzu(zzv zzvVar, zzw zzwVar, String str, String str2) {
        this.zza = zzwVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Cast.MessageReceivedCallback messageReceivedCallback;
        synchronized (zzw.zzA(this.zza)) {
            messageReceivedCallback = (Cast.MessageReceivedCallback) zzw.zzA(this.zza).get(this.zzb);
        }
        if (messageReceivedCallback != null) {
            messageReceivedCallback.onMessageReceived(zzw.zzv(this.zza), this.zzb, this.zzc);
        } else {
            zzw.zzw().d("Discarded message for unknown namespace '%s'", this.zzb);
        }
    }
}
