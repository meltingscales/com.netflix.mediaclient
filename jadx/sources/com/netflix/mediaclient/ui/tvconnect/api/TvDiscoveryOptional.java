package com.netflix.mediaclient.ui.tvconnect.api;

import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.cVS;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface TvDiscoveryOptional {
    @BindsOptionalOf
    cVS b();
}
