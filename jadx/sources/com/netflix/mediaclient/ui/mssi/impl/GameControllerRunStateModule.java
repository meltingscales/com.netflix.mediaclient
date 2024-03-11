package com.netflix.mediaclient.ui.mssi.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.C6786cjq;
import o.InterfaceC6713ciW;
import o.InterfaceC6779cjj;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface GameControllerRunStateModule {
    @Binds
    InterfaceC6713ciW a(C6786cjq c6786cjq);

    @Binds
    InterfaceC6779cjj b(C6786cjq c6786cjq);
}
