package com.google.android.gms.internal.recaptcha;

import android.content.Context;
import com.google.android.gms.internal.recaptcha.zzhj;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zzaj {
    private final Context zza;
    private final zzv zzb;
    private final ExecutorService zzc;
    private final zzu<zzhj.zzd> zzd;

    public zzaj(Context context, zzv zzvVar) {
        this.zza = context;
        this.zzb = zzvVar;
        ExecutorService executorService = zzag.zza;
        this.zzc = executorService;
        this.zzd = new zzu<>(zzag.zzb(), executorService, zzhj.zzd.zzo());
    }
}
