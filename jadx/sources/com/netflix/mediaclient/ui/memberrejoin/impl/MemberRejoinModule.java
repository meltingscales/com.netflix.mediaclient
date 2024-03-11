package com.netflix.mediaclient.ui.memberrejoin.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import o.InterfaceC6634cgx;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public abstract class MemberRejoinModule {
    @ActivityScoped
    @Binds
    public abstract InterfaceC6634cgx a(MemberRejoinImpl memberRejoinImpl);
}
