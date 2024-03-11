package com.netflix.mediaclient.acquisition.screens.verifyAge;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import javax.inject.Inject;

/* loaded from: classes3.dex */
public final class VerifyAgeLifecycleData extends ViewModel {
    public static final int $stable = 8;
    private final MutableLiveData<Boolean> skipActionLoading;
    private final MutableLiveData<Boolean> verifyActionLoading;

    public final MutableLiveData<Boolean> getSkipActionLoading() {
        return this.skipActionLoading;
    }

    public final MutableLiveData<Boolean> getVerifyActionLoading() {
        return this.verifyActionLoading;
    }

    @Inject
    public VerifyAgeLifecycleData() {
        Boolean bool = Boolean.FALSE;
        this.verifyActionLoading = new MutableLiveData<>(bool);
        this.skipActionLoading = new MutableLiveData<>(bool);
    }
}
