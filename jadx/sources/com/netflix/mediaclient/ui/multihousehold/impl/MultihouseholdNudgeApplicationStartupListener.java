package com.netflix.mediaclient.ui.multihousehold.impl;

import android.app.Application;
import com.netflix.mediaclient.startup.ApplicationStartupListener;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import javax.inject.Inject;
import o.C8632dsu;
import o.InterfaceC6748cjE;

/* loaded from: classes4.dex */
public final class MultihouseholdNudgeApplicationStartupListener implements ApplicationStartupListener {
    @Inject
    public InterfaceC6748cjE multihouseholdNudgeApplicationApi;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ApplicationStartupModule {
        @Binds
        @IntoSet
        ApplicationStartupListener c(MultihouseholdNudgeApplicationStartupListener multihouseholdNudgeApplicationStartupListener);
    }

    public final InterfaceC6748cjE a() {
        InterfaceC6748cjE interfaceC6748cjE = this.multihouseholdNudgeApplicationApi;
        if (interfaceC6748cjE != null) {
            return interfaceC6748cjE;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.startup.ApplicationStartupListener
    public void onApplicationCreated(Application application) {
        C8632dsu.c((Object) application, "");
        a().d();
    }
}
