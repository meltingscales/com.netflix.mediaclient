package com.netflix.mediaclient.acquisition.screens.confirm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes3.dex */
public final class ConfirmLifecycleData extends ViewModel {
    public static final int $stable = 8;
    private final MutableLiveData<Boolean> submit = new MutableLiveData<>(Boolean.FALSE);

    public final MutableLiveData<Boolean> getSubmit() {
        return this.submit;
    }
}
