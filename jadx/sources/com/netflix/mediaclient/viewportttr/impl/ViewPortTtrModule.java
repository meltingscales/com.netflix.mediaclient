package com.netflix.mediaclient.viewportttr.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.InterfaceC8358diq;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface ViewPortTtrModule {
    @Binds
    InterfaceC8358diq c(ViewPortTtrTrackerImpl viewPortTtrTrackerImpl);
}
