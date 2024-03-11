package com.netflix.mediaclient.ui.adsplan.impl;

import android.app.Application;
import com.netflix.mediaclient.startup.ApplicationStartupListener;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import javax.inject.Inject;
import o.C8632dsu;
import o.InterfaceC5304bwI;

/* loaded from: classes4.dex */
public final class AdsPlanApplicationStartupListener implements ApplicationStartupListener {
    @Inject
    public InterfaceC5304bwI adsPlanApplication;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ApplicationStartupModule {
        @Binds
        @IntoSet
        ApplicationStartupListener e(AdsPlanApplicationStartupListener adsPlanApplicationStartupListener);
    }

    public final InterfaceC5304bwI e() {
        InterfaceC5304bwI interfaceC5304bwI = this.adsPlanApplication;
        if (interfaceC5304bwI != null) {
            return interfaceC5304bwI;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.startup.ApplicationStartupListener
    public void onApplicationCreated(Application application) {
        C8632dsu.c((Object) application, "");
        e().a();
    }
}
