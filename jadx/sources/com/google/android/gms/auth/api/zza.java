package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.auth.zzbe;

/* loaded from: classes5.dex */
final class zza extends Api.AbstractClientBuilder<zzbe, AuthProxyOptions> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ zzbe buildClient(Context context, Looper looper, ClientSettings clientSettings, AuthProxyOptions authProxyOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new zzbe(context, looper, clientSettings, authProxyOptions, connectionCallbacks, onConnectionFailedListener);
    }
}
