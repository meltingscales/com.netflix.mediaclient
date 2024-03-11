package com.google.android.gms.tflite.dynamite.internal;

import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes5.dex */
public final class zzj {
    private final DynamiteModule zza;
    private final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(DynamiteModule dynamiteModule, int i) {
        this.zza = dynamiteModule;
        this.zzb = i;
    }

    public final int zza() {
        return this.zzb;
    }

    public final IBinder zzb(String str) {
        return this.zza.instantiate(str);
    }
}
