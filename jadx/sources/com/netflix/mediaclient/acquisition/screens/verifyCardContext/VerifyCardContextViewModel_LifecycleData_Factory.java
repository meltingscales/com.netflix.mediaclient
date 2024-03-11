package com.netflix.mediaclient.acquisition.screens.verifyCardContext;

import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import o.InterfaceC1270Vf;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class VerifyCardContextViewModel_LifecycleData_Factory implements Factory<VerifyCardContextViewModel.LifecycleData> {
    private final Provider<InterfaceC1270Vf> clockProvider;

    public VerifyCardContextViewModel_LifecycleData_Factory(Provider<InterfaceC1270Vf> provider) {
        this.clockProvider = provider;
    }

    @Override // javax.inject.Provider
    public VerifyCardContextViewModel.LifecycleData get() {
        return newInstance(this.clockProvider.get());
    }

    public static VerifyCardContextViewModel_LifecycleData_Factory create(Provider<InterfaceC1270Vf> provider) {
        return new VerifyCardContextViewModel_LifecycleData_Factory(provider);
    }

    public static VerifyCardContextViewModel.LifecycleData newInstance(InterfaceC1270Vf interfaceC1270Vf) {
        return new VerifyCardContextViewModel.LifecycleData(interfaceC1270Vf);
    }
}
