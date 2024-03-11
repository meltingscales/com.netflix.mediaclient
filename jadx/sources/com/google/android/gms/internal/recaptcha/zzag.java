package com.google.android.gms.internal.recaptcha;

import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
final class zzag {
    public static final ExecutorService zza = zze.zza().zza(zzi.zza);
    private static String zzb = "https://www.recaptcha.net";

    public static final String zza() {
        String str = zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32);
        sb.append(str);
        sb.append("/recaptcha/api3/accountchallenge");
        return sb.toString();
    }

    public static final String zzb() {
        String str = zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
        sb.append(str);
        sb.append("/recaptcha/api3/accountverify");
        return sb.toString();
    }
}
