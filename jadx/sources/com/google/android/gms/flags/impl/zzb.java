package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
final class zzb implements Callable<Integer> {
    final /* synthetic */ SharedPreferences zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Integer zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(SharedPreferences sharedPreferences, String str, Integer num) {
        this.zza = sharedPreferences;
        this.zzb = str;
        this.zzc = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Integer call() {
        return Integer.valueOf(this.zza.getInt(this.zzb, this.zzc.intValue()));
    }
}
