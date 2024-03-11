package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.splitinstall.internal.zzcb;

/* loaded from: classes2.dex */
public final class zzbd implements zzcb {
    private final zzcb zza;

    public zzbd(zzcb zzcbVar) {
        this.zza = zzcbVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* synthetic */ Object zza() {
        Context zzb = ((zzad) this.zza).zzb();
        return new zzbc(zzb, zzb.getPackageName());
    }
}
