package com.google.android.play.core.splitcompat;

import java.io.File;

/* loaded from: classes.dex */
final class zzg implements zzl {
    final /* synthetic */ zzh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // com.google.android.play.core.splitcompat.zzl
    public final void zza(zzm zzmVar, File file, boolean z) {
        this.zza.zzb.add(file);
        if (z) {
            return;
        }
        this.zza.zzc.set(false);
    }
}
