package com.google.android.play.core.splitinstall;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzr {
    private static final AtomicReference zza = new AtomicReference(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzq zza() {
        return (zzq) zza.get();
    }

    public static void zzb(zzq zzqVar) {
        AtomicReference atomicReference = zza;
        while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, zzqVar) && atomicReference.get() == null) {
        }
    }
}
