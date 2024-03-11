package com.google.android.gms.tflite.dynamite.internal;

import com.google.android.apps.common.proguard.UsedByNative;

/* loaded from: classes5.dex */
public final class zze {
    private final long zza;
    private final Object zzb;

    public zze(long j, Object obj, boolean z) {
        this.zza = j;
        this.zzb = obj;
    }

    @UsedByNative("NativeInitializationHandleInternal_gen.cc")
    Object getLogger() {
        return this.zzb;
    }

    @UsedByNative("NativeInitializationHandleInternal_gen.cc")
    public long getTflApi() {
        return this.zza;
    }

    @UsedByNative("NativeInitializationHandleInternal_gen.cc")
    boolean shouldUseInitV2() {
        return false;
    }
}
