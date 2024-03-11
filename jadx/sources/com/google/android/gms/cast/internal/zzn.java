package com.google.android.gms.cast.internal;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* loaded from: classes2.dex */
public final class zzn extends GoogleApi {
    private static final Api.ClientKey zza;
    private static final Api.AbstractClientBuilder zzb;
    private static final Api zzc;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzi zziVar = new zzi();
        zzb = zziVar;
        zzc = new Api("CastApi.API", zziVar, clientKey);
    }

    public zzn(Context context) {
        super(context, zzc, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
