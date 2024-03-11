package com.netflix.mediaclient.service.cdx;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.InterfaceC1251Um;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface CdxModule {
    @Binds
    InterfaceC1251Um c(CdxAgentImpl cdxAgentImpl);
}
