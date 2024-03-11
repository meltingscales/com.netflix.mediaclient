package com.google.android.gms.internal.tflite;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class zzaa {
    private String zza = null;

    public final zzaa zza(String str) {
        String.format(Locale.ROOT, "TFLiteClient-%d", 0);
        this.zza = "TFLiteClient-%d";
        return this;
    }

    public final ThreadFactory zzb() {
        String str = this.zza;
        return new zzz(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0L) : null, null, null, null);
    }
}
