package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.util.Set;

/* loaded from: classes.dex */
final class zzba implements zzan {
    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final void zza(ClassLoader classLoader, Set set) {
        zzay.zzc(classLoader, set, new zzaw());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean z) {
        return zzay.zzd(classLoader, file, file2, z, "zip");
    }
}
