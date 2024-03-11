package com.netflix.mediaclient.ui.commander.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.bBI;
import o.bBL;

@OriginatingElement(topLevelClass = bBL.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface ProfileSwitchUiImpl_HiltBindingModule {
    @Binds
    bBI d(bBL bbl);
}
