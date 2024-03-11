package com.google.android.gms.recaptcha;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;

/* loaded from: classes2.dex */
final class zzj extends Api.AbstractClientBuilder<com.google.android.gms.internal.recaptcha.zzr, Api.ApiOptions.NoOptions> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.internal.recaptcha.zzr buildClient(Context context, Looper looper, ClientSettings clientSettings, Api.ApiOptions.NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.internal.recaptcha.zzr(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
