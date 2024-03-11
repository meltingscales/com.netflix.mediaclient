package com.netflix.mediaclient.ui.multihouseholdebi.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import o.C6765cjV;
import o.InterfaceC6761cjR;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface MhuEbiModule {
    @ActivityScoped
    @Binds
    InterfaceC6761cjR d(C6765cjV c6765cjV);
}
