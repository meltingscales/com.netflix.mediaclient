package com.netflix.mediaclient.ui.login;

import android.app.Activity;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaV3Manager;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import o.C6283caQ;
import o.C6331cbL;
import o.C8632dsu;
import o.cQL;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class OneTimePassCodeFlowModuleAb54131 {
    @Provides
    @ActivityScoped
    public final C6283caQ b(Activity activity, RecaptchaV3Manager.c cVar) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) cVar, "");
        return new C6283caQ(R.g.dp, (NetflixActivity) activity, cVar.b(activity, new C6331cbL(activity, RecaptchaV3Manager.d.b(activity))), new cQL(), Logger.INSTANCE, ExtLogger.INSTANCE);
    }
}
