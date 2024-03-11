package com.google.android.gms.internal.flags;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class zzd {
    public static <T> T zza(Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
