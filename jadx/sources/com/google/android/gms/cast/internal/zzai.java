package com.google.android.gms.cast.internal;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

/* loaded from: classes2.dex */
public final class zzai {
    public static final Api.ClientKey zza = new Api.ClientKey();
    public static final Api.ClientKey zzb = new Api.ClientKey();
    public static final Api.ClientKey zzc = new Api.ClientKey();
    public static final Api.ClientKey zzd = new Api.ClientKey();
    public static final Api.ClientKey zze = new Api.ClientKey();
    public static final Api.ClientKey zzf = new Api.ClientKey();
    public static final Charset zzg;
    public static final String zzh;

    static {
        Charset charset;
        try {
            charset = Charset.forName("UTF-8");
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
            charset = null;
        }
        zzg = charset;
        zzh = CastUtils.zzc("com.google.cast.multizone");
    }
}
