package com.netflix.mediaclient.commanderinfra.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import o.C1303Wm;
import o.VA;

@OriginatingElement(topLevelClass = C1303Wm.class)
@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface MediaNotificationInfraImpl_HiltBindingModule {
    @Singleton
    @Binds
    VA c(C1303Wm c1303Wm);
}
