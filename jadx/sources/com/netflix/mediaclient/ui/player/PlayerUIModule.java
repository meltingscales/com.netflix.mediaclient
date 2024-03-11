package com.netflix.mediaclient.ui.player;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import o.bDI;
import o.bDN;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public abstract class PlayerUIModule {
    @ActivityScoped
    @Binds
    public abstract bDI c(bDN bdn);
}
