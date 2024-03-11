package com.netflix.mediaclient.acquisition.screens.welcomefuji;

import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiLogger_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0714WelcomeFujiLogger_Factory {
    private final Provider<SignupLogger> signupLoggerProvider;

    public C0714WelcomeFujiLogger_Factory(Provider<SignupLogger> provider) {
        this.signupLoggerProvider = provider;
    }

    public WelcomeFujiLogger get(AppView appView) {
        return newInstance(this.signupLoggerProvider.get(), appView);
    }

    public static C0714WelcomeFujiLogger_Factory create(Provider<SignupLogger> provider) {
        return new C0714WelcomeFujiLogger_Factory(provider);
    }

    public static WelcomeFujiLogger newInstance(SignupLogger signupLogger, AppView appView) {
        return new WelcomeFujiLogger(signupLogger, appView);
    }
}
