package com.google.android.play.core.splitinstall.internal;

import com.netflix.model.leafs.originals.interactive.animations.Ease;
import java.io.File;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbg implements zzan {
    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final void zza(ClassLoader classLoader, Set set) {
        zzbd.zzc(classLoader, set);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean z) {
        return zzat.zze(classLoader, file, file2, z, new zzav(), Ease.ANIMATION_EASE_TYPE.PATH, new zzbf());
    }
}
