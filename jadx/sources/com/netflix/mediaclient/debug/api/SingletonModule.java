package com.netflix.mediaclient.debug.api;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.Multibinds;
import java.util.Map;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public abstract class SingletonModule {
    @Multibinds
    public abstract Map<String, Object> a();

    @Multibinds
    public abstract Map<String, Object> d();
}
