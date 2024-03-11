package com.netflix.mediaclient.ui.commander.impl;

import com.netflix.mediaclient.ui.commander.api.TargetsDiscovery;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.bBO;

@OriginatingElement(topLevelClass = bBO.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface TargetDiscoveryImpl_HiltBindingModule {
    @Binds
    TargetsDiscovery a(bBO bbo);
}
