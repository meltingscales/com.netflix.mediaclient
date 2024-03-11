package com.netflix.mediaclient.features.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.XH;
import o.XJ;
import o.XK;
import o.XM;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface FeaturesModule {
    @Binds
    XM b(XJ xj);

    @Binds
    XH d(XK xk);
}
