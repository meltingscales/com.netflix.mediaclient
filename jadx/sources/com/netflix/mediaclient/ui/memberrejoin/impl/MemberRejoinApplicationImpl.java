package com.netflix.mediaclient.ui.memberrejoin.impl;

import android.app.Application;
import android.content.Intent;
import com.netflix.mediaclient.acquisition.api.Signup;
import com.netflix.mediaclient.startup.ApplicationStartupListener;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C8632dsu;
import o.InterfaceC6636cgz;
import o.XH;

@Singleton
/* loaded from: classes4.dex */
public final class MemberRejoinApplicationImpl implements ApplicationStartupListener, XH.d {
    private boolean b;
    private final Application d;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ApplicationStartupModule {
        @Singleton
        @Binds
        @IntoSet
        ApplicationStartupListener c(MemberRejoinApplicationImpl memberRejoinApplicationImpl);
    }

    @Inject
    public MemberRejoinApplicationImpl(Application application) {
        C8632dsu.c((Object) application, "");
        this.d = application;
    }

    @Override // com.netflix.mediaclient.startup.ApplicationStartupListener
    public void onApplicationCreated(Application application) {
        C8632dsu.c((Object) application, "");
        XH d = XH.c.d(application);
        this.b = d.d().a();
        d.c(this);
    }

    @Override // o.XH.d
    public void d() {
        if (InterfaceC6636cgz.b.a(this.d).e()) {
            boolean a = XH.c.d(this.d).d().a();
            if (!this.b || a) {
                return;
            }
            Intent createNativeIntent = Signup.Companion.get(this.d).createNativeIntent(this.d);
            createNativeIntent.setFlags(335544320);
            this.d.startActivity(createNativeIntent);
        }
    }
}
