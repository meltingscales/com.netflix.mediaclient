package com.netflix.mediaclient.ui.adsplan.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import o.C5305bwJ;
import o.InterfaceC5303bwH;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface AdsPlanModule {
    @ActivityScoped
    @Binds
    InterfaceC5303bwH a(C5305bwJ c5305bwJ);
}
