package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.identity.zbl;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;

/* renamed from: com.google.android.gms.internal.auth-api.zbaq  reason: invalid package */
/* loaded from: classes2.dex */
final class zbaq extends Api.AbstractClientBuilder<zbav, zbl> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ zbav buildClient(Context context, Looper looper, ClientSettings clientSettings, zbl zblVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new zbav(context, looper, zblVar, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
