package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.common.util.PlatformVersion;

/* loaded from: classes2.dex */
public final class zzy {
    public static zzv zza() {
        if (!PlatformVersion.isAtLeastO()) {
            return new zzw();
        }
        return new zzx();
    }
}
