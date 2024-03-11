package com.netflix.mediaclient.acquisition.lib;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import com.netflix.mediaclient.acquisition.lib.services.logging.LoggedErrorListenerImpl;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import o.C8632dsu;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes3.dex */
public final class SignupLibModule {
    @Provides
    public final SignupErrorReporter.LoggedErrorListener providesLoggedErrorListener(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return new LoggedErrorListenerImpl(false, (AppCompatActivity) activity);
    }
}
