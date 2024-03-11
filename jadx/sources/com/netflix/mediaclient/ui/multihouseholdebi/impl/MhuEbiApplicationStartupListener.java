package com.netflix.mediaclient.ui.multihouseholdebi.impl;

import android.app.Application;
import com.netflix.mediaclient.startup.ApplicationStartupListener;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import javax.inject.Inject;
import o.C8632dsu;
import o.InterfaceC6767cjX;

/* loaded from: classes4.dex */
public final class MhuEbiApplicationStartupListener implements ApplicationStartupListener {
    @Inject
    public InterfaceC6767cjX mhuEbiApplicationApi;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ApplicationStartupModule {
        @Binds
        @IntoSet
        ApplicationStartupListener d(MhuEbiApplicationStartupListener mhuEbiApplicationStartupListener);
    }

    public final InterfaceC6767cjX c() {
        InterfaceC6767cjX interfaceC6767cjX = this.mhuEbiApplicationApi;
        if (interfaceC6767cjX != null) {
            return interfaceC6767cjX;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.startup.ApplicationStartupListener
    public void onApplicationCreated(Application application) {
        C8632dsu.c((Object) application, "");
        c().d();
    }
}
