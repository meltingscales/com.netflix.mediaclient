package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.internal.zzbz;
import com.google.android.play.core.splitinstall.internal.zzcb;
import com.google.android.play.core.splitinstall.zzad;
import com.google.android.play.core.splitinstall.zzs;
import java.io.File;

/* loaded from: classes2.dex */
public final class zzt implements zzcb {
    private final zzcb zza;
    private final zzcb zzb;
    private final zzcb zzc;
    private final zzcb zzd;

    public zzt(zzcb zzcbVar, zzcb zzcbVar2, zzcb zzcbVar3, zzcb zzcbVar4) {
        this.zza = zzcbVar;
        this.zzb = zzcbVar2;
        this.zzc = zzcbVar3;
        this.zzd = zzcbVar4;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* synthetic */ Object zza() {
        return new FakeSplitInstallManager(((zzad) this.zza).zzb(), (File) this.zzb.zza(), (zzs) this.zzc.zza(), zzbz.zzb(this.zzd));
    }
}
