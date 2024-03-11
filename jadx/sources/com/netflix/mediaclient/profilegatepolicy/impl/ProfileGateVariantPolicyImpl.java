package com.netflix.mediaclient.profilegatepolicy.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.aKF;

/* loaded from: classes3.dex */
public final class ProfileGateVariantPolicyImpl implements aKF {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface PolicyModule {
        @Binds
        aKF b(ProfileGateVariantPolicyImpl profileGateVariantPolicyImpl);
    }

    @Override // o.aKF
    public boolean a() {
        return false;
    }
}
