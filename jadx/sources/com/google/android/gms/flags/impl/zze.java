package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
final class zze implements Callable<SharedPreferences> {
    final /* synthetic */ Context zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zze(Context context) {
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ SharedPreferences call() {
        return this.zza.getSharedPreferences("google_sdk_flags", 0);
    }
}
