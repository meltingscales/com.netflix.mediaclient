package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.p001authapi.zbo;

/* loaded from: classes5.dex */
final class zba extends Api.AbstractClientBuilder<zbo, Auth.AuthCredentialsOptions> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ zbo buildClient(Context context, Looper looper, ClientSettings clientSettings, Auth.AuthCredentialsOptions authCredentialsOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new zbo(context, looper, clientSettings, authCredentialsOptions, connectionCallbacks, onConnectionFailedListener);
    }
}
