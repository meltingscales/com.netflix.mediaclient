package com.netflix.mediaclient.ui.home.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.scopes.FragmentScoped;
import o.C4019bTf;
import o.InterfaceC3994bSh;

@Module
@InstallIn({FragmentComponent.class})
/* loaded from: classes6.dex */
public interface HomeTrackingModule {
    @FragmentScoped
    @Binds
    InterfaceC3994bSh d(C4019bTf c4019bTf);
}
