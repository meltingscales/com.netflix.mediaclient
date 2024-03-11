package com.google.android.gms.auth.api.identity;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p001authapi.zbam;
import com.google.android.gms.internal.p001authapi.zbau;

/* loaded from: classes2.dex */
public final class Identity {
    @RecentlyNonNull
    public static CredentialSavingClient getCredentialSavingClient(@RecentlyNonNull Activity activity) {
        return new zbam((Activity) Preconditions.checkNotNull(activity), new zbc());
    }

    @RecentlyNonNull
    public static SignInClient getSignInClient(@RecentlyNonNull Activity activity) {
        return new zbau((Activity) Preconditions.checkNotNull(activity), new zbl());
    }
}
