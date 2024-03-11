package com.netflix.mediaclient.acquisition.screens.deviceSurvey;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class DeviceSurveyDeviceContainerBinding {
    public static final int $stable = 8;
    private final DeviceSurveyDeviceContainer deviceSurveyDeviceContainer;

    public DeviceSurveyDeviceContainerBinding(DeviceSurveyDeviceContainer deviceSurveyDeviceContainer) {
        C8632dsu.c((Object) deviceSurveyDeviceContainer, "");
        this.deviceSurveyDeviceContainer = deviceSurveyDeviceContainer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(DeviceSurveyDeviceContainerBinding deviceSurveyDeviceContainerBinding, DeviceSurveySelectorViewModel deviceSurveySelectorViewModel, DeviceSurveyLogger deviceSurveyLogger, MutableLiveData mutableLiveData, int i, Object obj) {
        if ((i & 4) != 0) {
            mutableLiveData = null;
        }
        deviceSurveyDeviceContainerBinding.bind(deviceSurveySelectorViewModel, deviceSurveyLogger, mutableLiveData);
    }

    public final void bind(DeviceSurveySelectorViewModel deviceSurveySelectorViewModel, DeviceSurveyLogger deviceSurveyLogger, MutableLiveData<List<String>> mutableLiveData) {
        C8632dsu.c((Object) deviceSurveySelectorViewModel, "");
        C8632dsu.c((Object) deviceSurveyLogger, "");
        this.deviceSurveyDeviceContainer.bindFieldsToSelectors(deviceSurveySelectorViewModel.getDeviceSurveyItems(), deviceSurveyLogger, mutableLiveData);
    }
}
