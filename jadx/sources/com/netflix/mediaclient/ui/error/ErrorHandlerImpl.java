package com.netflix.mediaclient.ui.error;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.InterfaceC1903aSn;
import o.bMQ;

/* loaded from: classes4.dex */
public final class ErrorHandlerImpl implements bMQ {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ErrorHandlerApiModule {
        @Binds
        bMQ e(ErrorHandlerImpl errorHandlerImpl);
    }

    @Override // o.bMQ
    public CryptoErrorManager c() {
        return CryptoErrorManagerImpl.INSTANCE;
    }

    @Override // o.bMQ
    public InterfaceC1903aSn a() {
        return ErrorDescriptorFactoryImpl.INSTANCE;
    }
}
