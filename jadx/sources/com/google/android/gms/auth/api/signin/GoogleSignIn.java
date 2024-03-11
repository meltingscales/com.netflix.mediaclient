package com.google.android.gms.auth.api.signin;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public final class GoogleSignIn {
    @RecentlyNonNull
    public static GoogleSignInClient getClient(@RecentlyNonNull Context context, @RecentlyNonNull GoogleSignInOptions googleSignInOptions) {
        return new GoogleSignInClient(context, (GoogleSignInOptions) Preconditions.checkNotNull(googleSignInOptions));
    }
}
