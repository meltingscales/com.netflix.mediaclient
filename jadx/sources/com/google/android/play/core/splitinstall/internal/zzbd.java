package com.google.android.play.core.splitinstall.internal;

import com.netflix.model.leafs.originals.interactive.animations.Ease;
import java.io.File;
import java.util.Set;

/* loaded from: classes.dex */
final class zzbd implements zzan {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzc(ClassLoader classLoader, Set set) {
        zzay.zzc(classLoader, set, new zzbb());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzd(ClassLoader classLoader, File file, File file2, boolean z) {
        return zzat.zze(classLoader, file, file2, z, new zzav(), Ease.ANIMATION_EASE_TYPE.PATH, new zzbc());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final void zza(ClassLoader classLoader, Set set) {
        zzc(classLoader, set);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean z) {
        return zzd(classLoader, file, file2, z);
    }
}
