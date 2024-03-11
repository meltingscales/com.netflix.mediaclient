package com.netflix.mediaclient.acquisition.screens.deviceSurvey;

import androidx.lifecycle.MutableLiveData;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes3.dex */
public class DeviceSurveyViewModel extends AbstractNetworkViewModel2 {
    public static final int $stable = 8;
    private final String ctaButtonText;
    private final DeviceSurveySelectorViewModel deviceSurveySelectorViewModel;
    private final String headingText;
    private final DeviceSurveyLifecycleData lifecycleData;
    private final DeviceSurveyParsedData parsedData;
    private final MutableLiveData<List<String>> selectedDevices;
    private final String subheadingStrings;

    public final String getCtaButtonText() {
        return this.ctaButtonText;
    }

    public final DeviceSurveySelectorViewModel getDeviceSurveySelectorViewModel() {
        return this.deviceSurveySelectorViewModel;
    }

    public final String getHeadingText() {
        return this.headingText;
    }

    public final MutableLiveData<List<String>> getSelectedDevices() {
        return this.selectedDevices;
    }

    public final String getSubheadingStrings() {
        return this.subheadingStrings;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSurveyViewModel(StringProvider stringProvider, DeviceSurveyParsedData deviceSurveyParsedData, DeviceSurveyLifecycleData deviceSurveyLifecycleData, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel, DeviceSurveySelectorViewModel deviceSurveySelectorViewModel) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) deviceSurveyParsedData, "");
        C8632dsu.c((Object) deviceSurveyLifecycleData, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        C8632dsu.c((Object) deviceSurveySelectorViewModel, "");
        this.parsedData = deviceSurveyParsedData;
        this.lifecycleData = deviceSurveyLifecycleData;
        this.deviceSurveySelectorViewModel = deviceSurveySelectorViewModel;
        this.headingText = stringProvider.getString(R.string.device_survey_header);
        this.subheadingStrings = stringProvider.getString(R.string.device_survey_subheader);
        this.ctaButtonText = stringProvider.getString(R.string.device_survey_next);
        this.selectedDevices = new MutableLiveData<>();
    }

    public final MutableLiveData<Boolean> getDeviceSurveyLoading() {
        return this.lifecycleData.getNextActionLoading();
    }

    public final void submitDeviceSurvey(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        performAction(this.parsedData.getNextAction(), getDeviceSurveyLoading(), networkRequestResponseListener);
    }
}
