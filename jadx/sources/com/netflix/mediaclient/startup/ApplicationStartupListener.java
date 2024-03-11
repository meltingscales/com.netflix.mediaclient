package com.netflix.mediaclient.startup;

import android.app.Application;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.Multibinds;
import java.util.Set;

/* loaded from: classes.dex */
public interface ApplicationStartupListener {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes.dex */
    public interface ListenerModule {
        @Multibinds
        Set<ApplicationStartupListener> c();
    }

    void onApplicationCreated(Application application);
}
