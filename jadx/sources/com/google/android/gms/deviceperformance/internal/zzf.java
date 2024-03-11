package com.google.android.gms.deviceperformance.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class zzf extends Api.AbstractClientBuilder {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) looper, "");
        C8632dsu.c((Object) clientSettings, "");
        C8632dsu.c((Object) ((Api.ApiOptions.NoOptions) obj), "");
        C8632dsu.c((Object) connectionCallbacks, "");
        C8632dsu.c((Object) onConnectionFailedListener, "");
        return new zzb(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
