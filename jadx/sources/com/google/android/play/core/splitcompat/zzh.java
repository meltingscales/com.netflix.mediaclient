package com.google.android.play.core.splitcompat;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzh implements zzk {
    final /* synthetic */ zzt zza;
    final /* synthetic */ Set zzb;
    final /* synthetic */ AtomicBoolean zzc;
    final /* synthetic */ zzn zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzh(zzn zznVar, zzt zztVar, Set set, AtomicBoolean atomicBoolean) {
        this.zzd = zznVar;
        this.zza = zztVar;
        this.zzb = set;
        this.zzc = atomicBoolean;
    }

    @Override // com.google.android.play.core.splitcompat.zzk
    public final void zza(ZipFile zipFile, Set set) {
        this.zzd.zzf(this.zza, set, new zzg(this));
    }
}
