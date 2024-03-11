package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public interface SignInClient {
    @RecentlyNonNull
    Task<BeginSignInResult> beginSignIn(@RecentlyNonNull BeginSignInRequest beginSignInRequest);

    @RecentlyNonNull
    SignInCredential getSignInCredentialFromIntent(Intent intent);
}
