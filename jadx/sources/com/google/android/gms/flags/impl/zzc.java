package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
final class zzc implements Callable<Long> {
    final /* synthetic */ SharedPreferences zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Long zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(SharedPreferences sharedPreferences, String str, Long l) {
        this.zza = sharedPreferences;
        this.zzb = str;
        this.zzc = l;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() {
        return Long.valueOf(this.zza.getLong(this.zzb, this.zzc.longValue()));
    }
}
