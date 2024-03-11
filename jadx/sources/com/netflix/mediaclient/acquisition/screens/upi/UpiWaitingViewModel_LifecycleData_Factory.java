package com.netflix.mediaclient.acquisition.screens.upi;

import com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModel;
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
public final class UpiWaitingViewModel_LifecycleData_Factory implements Factory<UpiWaitingViewModel.LifecycleData> {
    private final Provider<InterfaceC1270Vf> clockProvider;

    public UpiWaitingViewModel_LifecycleData_Factory(Provider<InterfaceC1270Vf> provider) {
        this.clockProvider = provider;
    }

    @Override // javax.inject.Provider
    public UpiWaitingViewModel.LifecycleData get() {
        return newInstance(this.clockProvider.get());
    }

    public static UpiWaitingViewModel_LifecycleData_Factory create(Provider<InterfaceC1270Vf> provider) {
        return new UpiWaitingViewModel_LifecycleData_Factory(provider);
    }

    public static UpiWaitingViewModel.LifecycleData newInstance(InterfaceC1270Vf interfaceC1270Vf) {
        return new UpiWaitingViewModel.LifecycleData(interfaceC1270Vf);
    }
}
