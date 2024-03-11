package com.netflix.mediaclient.nfu.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.aII;
import o.aIM;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface NfuModule {
    @Binds
    aII e(aIM aim);
}
