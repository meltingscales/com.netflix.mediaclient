package com.google.android.gms.auth.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzbe;
import com.google.android.gms.internal.auth.zzbt;

/* loaded from: classes5.dex */
public final class AuthProxy {
    @RecentlyNonNull
    public static final Api<AuthProxyOptions> API;
    @RecentlyNonNull
    public static final ProxyApi ProxyApi;
    @RecentlyNonNull
    public static final Api.ClientKey<zzbe> zza;
    private static final Api.AbstractClientBuilder<zzbe, AuthProxyOptions> zzb;

    static {
        Api.ClientKey<zzbe> clientKey = new Api.ClientKey<>();
        zza = clientKey;
        zza zzaVar = new zza();
        zzb = zzaVar;
        API = new Api<>("Auth.PROXY_API", zzaVar, clientKey);
        ProxyApi = new zzbt();
    }
}
