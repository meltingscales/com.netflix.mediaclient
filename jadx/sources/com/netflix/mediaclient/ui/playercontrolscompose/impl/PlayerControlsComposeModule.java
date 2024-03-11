package com.netflix.mediaclient.ui.playercontrolscompose.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import o.cID;
import o.cIH;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface PlayerControlsComposeModule {
    @ActivityScoped
    @Binds
    cIH e(cID cid);
}
