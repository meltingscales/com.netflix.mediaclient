package com.google.android.gms.internal.recaptcha;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
final class zzg implements zzf {
    private zzg() {
    }

    @Override // com.google.android.gms.internal.recaptcha.zzf
    public final ExecutorService zza(int i) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }
}
