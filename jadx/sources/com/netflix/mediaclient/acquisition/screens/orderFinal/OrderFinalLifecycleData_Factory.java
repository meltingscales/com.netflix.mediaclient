package com.netflix.mediaclient.acquisition.screens.orderFinal;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class OrderFinalLifecycleData_Factory implements Factory<OrderFinalLifecycleData> {
    @Override // javax.inject.Provider
    public OrderFinalLifecycleData get() {
        return newInstance();
    }

    public static OrderFinalLifecycleData_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static OrderFinalLifecycleData newInstance() {
        return new OrderFinalLifecycleData();
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final OrderFinalLifecycleData_Factory INSTANCE = new OrderFinalLifecycleData_Factory();

        private InstanceHolder() {
        }
    }
}
