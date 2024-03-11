package com.netflix.mediaclient.servicemgr;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.Multibinds;
import java.util.Set;
import o.aOV;

/* loaded from: classes4.dex */
public interface IClientLoggingListener {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ListenerModule {
        @Multibinds
        Set<IClientLoggingListener> a();
    }

    void e(IClientLogging iClientLogging, aOV aov, long j);
}
