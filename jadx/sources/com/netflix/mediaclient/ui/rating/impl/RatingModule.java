package com.netflix.mediaclient.ui.rating.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import o.cPU;
import o.cPW;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface RatingModule {
    @Binds
    cPU c(cPW cpw);
}
