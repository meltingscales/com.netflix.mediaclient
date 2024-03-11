package com.netflix.mediaclient.acquisition;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class SignupImpl_Factory implements Factory<SignupImpl> {
    @Override // javax.inject.Provider
    public SignupImpl get() {
        return newInstance();
    }

    public static SignupImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SignupImpl newInstance() {
        return new SignupImpl();
    }

    /* loaded from: classes5.dex */
    static final class InstanceHolder {
        private static final SignupImpl_Factory INSTANCE = new SignupImpl_Factory();

        private InstanceHolder() {
        }
    }
}
