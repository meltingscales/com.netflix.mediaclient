package com.netflix.mediaclient.ui.cfouracquisition.impl;

import com.netflix.mediaclient.acquisition.lib.CfourStringMapping;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.Map;
import o.C5423byV;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes4.dex */
public final class CfourStringMappingModule {
    @Provides
    @CfourStringMapping
    public final Map<String, Integer> e() {
        return C5423byV.a.d();
    }
}
