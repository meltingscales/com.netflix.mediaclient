package com.netflix.mediaclient.service;

import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import o.TS;

@Singleton
/* loaded from: classes3.dex */
public final class BrotliContextImpl implements TS {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface BrotliModule {
        @Binds
        TS a(BrotliContextImpl brotliContextImpl);
    }

    @Override // o.TS
    public boolean d() {
        return ConfigFastPropertyFeatureControlConfig.Companion.g();
    }
}
