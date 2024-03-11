package com.netflix.mediaclient.ui.multihousehold.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import o.C6755cjL;
import o.InterfaceC6746cjC;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface MultihouseholdNudgeModule {
    @ActivityScoped
    @Binds
    InterfaceC6746cjC d(C6755cjL c6755cjL);
}
