package com.netflix.mediaclient.acquisition.screens.welcomefuji;

import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiLogger;
import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes6.dex */
public final class WelcomeFujiLogger_Factory_Impl implements WelcomeFujiLogger.Factory {
    private final C0714WelcomeFujiLogger_Factory delegateFactory;

    WelcomeFujiLogger_Factory_Impl(C0714WelcomeFujiLogger_Factory c0714WelcomeFujiLogger_Factory) {
        this.delegateFactory = c0714WelcomeFujiLogger_Factory;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiLogger.Factory
    public WelcomeFujiLogger create(AppView appView) {
        return this.delegateFactory.get(appView);
    }

    public static Provider<WelcomeFujiLogger.Factory> create(C0714WelcomeFujiLogger_Factory c0714WelcomeFujiLogger_Factory) {
        return InstanceFactory.create(new WelcomeFujiLogger_Factory_Impl(c0714WelcomeFujiLogger_Factory));
    }

    public static dagger.internal.Provider<WelcomeFujiLogger.Factory> createFactoryProvider(C0714WelcomeFujiLogger_Factory c0714WelcomeFujiLogger_Factory) {
        return InstanceFactory.create(new WelcomeFujiLogger_Factory_Impl(c0714WelcomeFujiLogger_Factory));
    }
}
