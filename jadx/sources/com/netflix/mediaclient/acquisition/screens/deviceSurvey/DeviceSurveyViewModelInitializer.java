package com.netflix.mediaclient.acquisition.screens.deviceSurvey;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.components.form2.BooleanViewModel;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.services.cache.FormCacheSynchronizerFactory;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.C8569dql;
import o.C8572dqo;
import o.C8632dsu;

/* loaded from: classes3.dex */
public class DeviceSurveyViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final FlowMode flowMode;
    private final FormCacheSynchronizerFactory formCacheSynchronizerFactory;
    private final SignupNetworkManager signupNetworkManager;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public DeviceSurveyViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, FormCacheSynchronizerFactory formCacheSynchronizerFactory, StringProvider stringProvider, SignupNetworkManager signupNetworkManager, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, ViewModelProvider.Factory factory) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) formCacheSynchronizerFactory, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        C8632dsu.c((Object) factory, "");
        this.flowMode = flowMode;
        this.formCacheSynchronizerFactory = formCacheSynchronizerFactory;
        this.stringProvider = stringProvider;
        this.signupNetworkManager = signupNetworkManager;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
        this.viewModelProviderFactory = factory;
    }

    public final DeviceSurveyParsedData extractDeviceSurveyParsedData() {
        String str;
        FlowMode flowMode = this.flowMode;
        ActionField actionField = null;
        Field field = null;
        if (flowMode != null) {
            SignupErrorReporter signupErrorReporter = ((BaseViewModelInitializer) this).signupErrorReporter;
            Field field2 = flowMode.getField(SignupConstants.Action.NEXT_ACTION);
            if (field2 == null) {
                str = SignupConstants.Error.MISSING_FIELD_ERROR;
            } else if (field2 instanceof ActionField) {
                field = field2;
                actionField = (ActionField) field;
            } else {
                str = SignupConstants.Error.DATA_MANIPULATION_ERROR;
            }
            signupErrorReporter.onDataError(str, SignupConstants.Action.NEXT_ACTION, null);
            actionField = (ActionField) field;
        }
        return new DeviceSurveyParsedData(actionField);
    }

    public final List<BooleanViewModel> extractDeviceSurveySelectorParsedData() {
        List<String> j;
        int d;
        j = C8569dql.j(DeviceSurveySelectorViewModel.SMART_TV, DeviceSurveySelectorViewModel.TABLET, DeviceSurveySelectorViewModel.DESKTOP, DeviceSurveySelectorViewModel.SETTOP, DeviceSurveySelectorViewModel.STREAMING_MEDIA, DeviceSurveySelectorViewModel.PLAYSTATION, DeviceSurveySelectorViewModel.XBOX, DeviceSurveySelectorViewModel.WIIU, DeviceSurveySelectorViewModel.ROKU);
        ArrayList<BooleanField> arrayList = new ArrayList();
        for (String str : j) {
            FlowMode flowMode = this.flowMode;
            BooleanField booleanField = null;
            if (flowMode != null) {
                SignupErrorReporter unused = ((BaseViewModelInitializer) this).signupErrorReporter;
                Field field = flowMode.getField(str);
                if (field != null && (field instanceof BooleanField)) {
                    booleanField = field;
                }
                booleanField = booleanField;
            }
            if (booleanField != null) {
                arrayList.add(booleanField);
            }
        }
        d = C8572dqo.d(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(d);
        for (BooleanField booleanField2 : arrayList) {
            arrayList2.add(new BooleanViewModel(booleanField2, this.formCacheSynchronizerFactory.createFormCacheSynchronizer("deviceSurvey", booleanField2)));
        }
        return arrayList2;
    }

    public DeviceSurveyViewModel createDeviceSurveyViewModel(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        return new DeviceSurveyViewModel(this.stringProvider, extractDeviceSurveyParsedData(), (DeviceSurveyLifecycleData) new ViewModelProvider(fragment, this.viewModelProviderFactory).get(DeviceSurveyLifecycleData.class), this.signupNetworkManager, this.errorMessageViewModelInitializer.createErrorMessageViewModel(), new DeviceSurveySelectorViewModel(this.stringProvider, extractDeviceSurveySelectorParsedData()));
    }
}
