package com.google.android.gms.internal.p001authapi;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.zbl;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbau  reason: invalid package */
/* loaded from: classes2.dex */
public final class zbau extends GoogleApi<zbl> implements SignInClient {
    private static final Api.ClientKey<zbav> zba;
    private static final Api.AbstractClientBuilder<zbav, zbl> zbb;
    private static final Api<zbl> zbc;
    private final String zbd;

    static {
        Api.ClientKey<zbav> clientKey = new Api.ClientKey<>();
        zba = clientKey;
        zbaq zbaqVar = new zbaq();
        zbb = zbaqVar;
        zbc = new Api<>("Auth.Api.Identity.SignIn.API", zbaqVar, clientKey);
    }

    public zbau(Activity activity, zbl zblVar) {
        super(activity, zbc, zblVar, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = zbax.zba();
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final Task<BeginSignInResult> beginSignIn(BeginSignInRequest beginSignInRequest) {
        BeginSignInRequest.Builder zba2 = BeginSignInRequest.zba(beginSignInRequest);
        zba2.zba(this.zbd);
        final BeginSignInRequest build = zba2.build();
        return doRead(TaskApiCall.builder().setFeatures(zbaw.zba).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbao
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zbau zbauVar = zbau.this;
                BeginSignInRequest beginSignInRequest2 = build;
                ((zbag) ((zbav) obj).getService()).zbc(new zbar(zbauVar, (TaskCompletionSource) obj2), (BeginSignInRequest) Preconditions.checkNotNull(beginSignInRequest2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1553).build());
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final SignInCredential getSignInCredentialFromIntent(Intent intent) {
        if (intent == null) {
            throw new ApiException(Status.RESULT_INTERNAL_ERROR);
        }
        Status status = (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new ApiException(Status.RESULT_CANCELED);
        }
        if (!status.isSuccess()) {
            throw new ApiException(status);
        }
        SignInCredential signInCredential = (SignInCredential) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "sign_in_credential", SignInCredential.CREATOR);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new ApiException(Status.RESULT_INTERNAL_ERROR);
    }
}
