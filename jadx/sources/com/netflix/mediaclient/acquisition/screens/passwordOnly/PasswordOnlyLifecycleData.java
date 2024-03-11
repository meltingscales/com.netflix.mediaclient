package com.netflix.mediaclient.acquisition.screens.passwordOnly;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes3.dex */
public final class PasswordOnlyLifecycleData extends ViewModel {
    public static final int $stable = 8;
    private final MutableLiveData<Boolean> nextActionLoading = new MutableLiveData<>(Boolean.FALSE);

    public final MutableLiveData<Boolean> getNextActionLoading() {
        return this.nextActionLoading;
    }
}
