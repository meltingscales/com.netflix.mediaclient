package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.zzhj;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zzac {
    private final zzv zza;
    private final ExecutorService zzb;
    private final zzu<zzhj.zzb> zzc;

    public zzac(zzv zzvVar) {
        this.zza = zzvVar;
        ExecutorService executorService = zzag.zza;
        this.zzb = executorService;
        this.zzc = new zzu<>(zzag.zza(), executorService, zzhj.zzb.zzn());
    }
}
