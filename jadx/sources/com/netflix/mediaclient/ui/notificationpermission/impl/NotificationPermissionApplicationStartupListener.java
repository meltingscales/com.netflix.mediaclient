package com.netflix.mediaclient.ui.notificationpermission.impl;

import android.app.Application;
import com.netflix.mediaclient.startup.ApplicationStartupListener;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import javax.inject.Inject;
import o.C8632dsu;
import o.InterfaceC7088cpc;

/* loaded from: classes4.dex */
public final class NotificationPermissionApplicationStartupListener implements ApplicationStartupListener {
    @Inject
    public InterfaceC7088cpc notificationPermissionApplication;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ApplicationStartupModule {
        @Binds
        @IntoSet
        ApplicationStartupListener d(NotificationPermissionApplicationStartupListener notificationPermissionApplicationStartupListener);
    }

    public final InterfaceC7088cpc a() {
        InterfaceC7088cpc interfaceC7088cpc = this.notificationPermissionApplication;
        if (interfaceC7088cpc != null) {
            return interfaceC7088cpc;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.startup.ApplicationStartupListener
    public void onApplicationCreated(Application application) {
        C8632dsu.c((Object) application, "");
        a().b();
    }
}
