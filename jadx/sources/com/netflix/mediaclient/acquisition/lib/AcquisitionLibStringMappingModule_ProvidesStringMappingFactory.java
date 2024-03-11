package com.netflix.mediaclient.acquisition.lib;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.acquisition.lib.AcquisitionLibStringMapping"})
/* loaded from: classes3.dex */
public final class AcquisitionLibStringMappingModule_ProvidesStringMappingFactory implements Factory<Map<String, Integer>> {
    private final AcquisitionLibStringMappingModule module;

    public AcquisitionLibStringMappingModule_ProvidesStringMappingFactory(AcquisitionLibStringMappingModule acquisitionLibStringMappingModule) {
        this.module = acquisitionLibStringMappingModule;
    }

    @Override // javax.inject.Provider
    public Map<String, Integer> get() {
        return providesStringMapping(this.module);
    }

    public static AcquisitionLibStringMappingModule_ProvidesStringMappingFactory create(AcquisitionLibStringMappingModule acquisitionLibStringMappingModule) {
        return new AcquisitionLibStringMappingModule_ProvidesStringMappingFactory(acquisitionLibStringMappingModule);
    }

    public static Map<String, Integer> providesStringMapping(AcquisitionLibStringMappingModule acquisitionLibStringMappingModule) {
        return (Map) Preconditions.checkNotNullFromProvides(acquisitionLibStringMappingModule.providesStringMapping());
    }
}
