package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.zzds;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zzu<ResponseT extends zzds<ResponseT, ?>> {
    private final String zza;
    private final ExecutorService zzb;
    private final ResponseT zzc;

    public zzu(String str, ExecutorService executorService, ResponseT responset) {
        this.zza = str;
        this.zzb = executorService;
        this.zzc = responset;
    }
}
