package com.netflix.mediaclient.ui.memberrejoin.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import o.InterfaceC6636cgz;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface MemberRejoinFlagsModule {
    @Singleton
    @Binds
    InterfaceC6636cgz e(MemberRejoinFlagsImpl memberRejoinFlagsImpl);
}
