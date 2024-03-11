package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.internal.PendingResultUtil;

/* loaded from: classes5.dex */
final class zbb implements PendingResultUtil.ResultConverter<GoogleSignInResult, GoogleSignInAccount> {
    private zbb() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zbb(zba zbaVar) {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ GoogleSignInAccount convert(GoogleSignInResult googleSignInResult) {
        return googleSignInResult.getSignInAccount();
    }
}
