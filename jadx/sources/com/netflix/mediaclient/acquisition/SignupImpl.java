package com.netflix.mediaclient.acquisition;

import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.acquisition.api.Signup;
import com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity;
import com.netflix.mediaclient.acquisition.screens.webSignup.SignupActivity;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class SignupImpl implements Signup {
    public static final int $stable = 0;

    @Override // com.netflix.mediaclient.acquisition.api.Signup
    public Intent createNativeIntent(Context context) {
        C8632dsu.c((Object) context, "");
        return SignupNativeActivity.Companion.createStartIntent(context);
    }

    @Override // com.netflix.mediaclient.acquisition.api.Signup
    public Intent createWebIntent(Context context) {
        C8632dsu.c((Object) context, "");
        return SignupActivity.createShowIntent(context);
    }
}
