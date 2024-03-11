package com.google.android.gms.auth.api.signin;

import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* loaded from: classes5.dex */
public class GoogleSignInResult implements Result {
    private Status zba;
    private GoogleSignInAccount zbb;

    @RecentlyNullable
    public GoogleSignInAccount getSignInAccount() {
        return this.zbb;
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zba;
    }
}
