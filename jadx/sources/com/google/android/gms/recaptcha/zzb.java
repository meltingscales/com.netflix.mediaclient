package com.google.android.gms.recaptcha;

import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final class zzb {
    public static final Feature zza;
    public static final Feature zzb;
    public static final Feature zzc;
    public static final Feature[] zzd;
    private static final Feature zze;

    static {
        Feature feature = new Feature("verify_with_recaptcha_v2_internal", 1L);
        zze = feature;
        Feature feature2 = new Feature("init", 2L);
        zza = feature2;
        Feature feature3 = new Feature("execute", 4L);
        zzb = feature3;
        Feature feature4 = new Feature("close", 2L);
        zzc = feature4;
        zzd = new Feature[]{feature, feature2, feature3, feature4};
    }
}
