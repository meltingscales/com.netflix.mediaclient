package com.google.android.gms.internal.p001authapi;

import android.app.Activity;
import com.google.android.gms.auth.api.identity.CredentialSavingClient;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.zbc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbam  reason: invalid package */
/* loaded from: classes2.dex */
public final class zbam extends GoogleApi<zbc> implements CredentialSavingClient {
    private static final Api.ClientKey<zbw> zba;
    private static final Api.AbstractClientBuilder<zbw, zbc> zbb;
    private static final Api<zbc> zbc;
    private final String zbd;

    static {
        Api.ClientKey<zbw> clientKey = new Api.ClientKey<>();
        zba = clientKey;
        zbaj zbajVar = new zbaj();
        zbb = zbajVar;
        zbc = new Api<>("Auth.Api.Identity.CredentialSaving.API", zbajVar, clientKey);
    }

    public zbam(Activity activity, zbc zbcVar) {
        super(activity, zbc, zbcVar, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = zbax.zba();
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final Task<SavePasswordResult> savePassword(SavePasswordRequest savePasswordRequest) {
        SavePasswordRequest.Builder zba2 = SavePasswordRequest.zba(savePasswordRequest);
        zba2.zba(this.zbd);
        final SavePasswordRequest build = zba2.build();
        return doRead(TaskApiCall.builder().setFeatures(zbaw.zbe).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbai
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zbam zbamVar = zbam.this;
                SavePasswordRequest savePasswordRequest2 = build;
                ((zbz) ((zbw) obj).getService()).zbd(new zbal(zbamVar, (TaskCompletionSource) obj2), (SavePasswordRequest) Preconditions.checkNotNull(savePasswordRequest2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1536).build());
    }
}
