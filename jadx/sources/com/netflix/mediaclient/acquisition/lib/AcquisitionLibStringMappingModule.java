package com.netflix.mediaclient.acquisition.lib;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.Map;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes3.dex */
public final class AcquisitionLibStringMappingModule {
    @Provides
    @AcquisitionLibStringMapping
    public final Map<String, Integer> providesStringMapping() {
        return StringKeyMapping.INSTANCE.getKeyResourceMap();
    }
}
