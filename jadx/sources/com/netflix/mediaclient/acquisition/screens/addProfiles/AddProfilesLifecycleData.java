package com.netflix.mediaclient.acquisition.screens.addProfiles;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes3.dex */
public final class AddProfilesLifecycleData extends ViewModel {
    public static final int $stable = 8;
    private final MutableLiveData<Boolean> submitProfiles = new MutableLiveData<>(Boolean.FALSE);

    public final MutableLiveData<Boolean> getSubmitProfiles() {
        return this.submitProfiles;
    }
}
