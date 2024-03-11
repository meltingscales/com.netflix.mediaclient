package com.netflix.mediaclient.autologin.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.TW;
import o.TZ;

@OriginatingElement(topLevelClass = TZ.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface AutoLoginUrlOpenerImpl_HiltBindingModule {
    @Binds
    TW a(TZ tz);
}
