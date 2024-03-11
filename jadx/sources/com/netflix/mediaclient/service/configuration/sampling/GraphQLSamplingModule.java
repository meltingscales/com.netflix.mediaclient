package com.netflix.mediaclient.service.configuration.sampling;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.C8153dex;
import o.InterfaceC1468aCk;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes3.dex */
public final class GraphQLSamplingModule {

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC1468aCk {
        d() {
        }

        @Override // o.InterfaceC1468aCk
        public boolean b() {
            return C8153dex.H();
        }
    }

    @Provides
    public final InterfaceC1468aCk a() {
        return new d();
    }
}
