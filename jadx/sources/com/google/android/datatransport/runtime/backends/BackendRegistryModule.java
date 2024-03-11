package com.google.android.datatransport.runtime.backends;

import dagger.Binds;
import dagger.Module;

@Module
/* loaded from: classes5.dex */
public abstract class BackendRegistryModule {
    @Binds
    abstract BackendRegistry backendRegistry(MetadataBackendRegistry metadataBackendRegistry);
}
