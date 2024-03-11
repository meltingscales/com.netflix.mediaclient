package com.netflix.mediaclient.acquisition.screens.registration;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes3.dex */
public final class RegistrationLifecycleData extends ViewModel {
    public static final int $stable = 8;
    private final MutableLiveData<Boolean> redeemGiftCardLoading = new MutableLiveData<>(Boolean.FALSE);

    public final MutableLiveData<Boolean> getRedeemGiftCardLoading() {
        return this.redeemGiftCardLoading;
    }
}
