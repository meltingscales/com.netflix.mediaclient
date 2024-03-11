package com.netflix.mediaclient.acquisition.screens.verifyCard;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import javax.inject.Inject;

/* loaded from: classes3.dex */
public final class VerifyCardLifecycleData extends ViewModel {
    public static final int $stable = 8;
    private final MutableLiveData<Boolean> backRequestLoading;
    private final MutableLiveData<Boolean> startMemebershipLoading;

    public final MutableLiveData<Boolean> getBackRequestLoading() {
        return this.backRequestLoading;
    }

    public final MutableLiveData<Boolean> getStartMemebershipLoading() {
        return this.startMemebershipLoading;
    }

    @Inject
    public VerifyCardLifecycleData() {
        Boolean bool = Boolean.FALSE;
        this.startMemebershipLoading = new MutableLiveData<>(bool);
        this.backRequestLoading = new MutableLiveData<>(bool);
    }
}
