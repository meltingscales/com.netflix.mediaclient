package com.netflix.mediaclient.acquisition.screens.learnMoreConfirm;

import androidx.fragment.app.Fragment;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public class LearnMoreConfirmViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final FlowMode flowMode;
    private final SignupNetworkManager signupNetworkManager;
    private final StringProvider stringProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public LearnMoreConfirmViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, StringProvider stringProvider, ErrorMessageViewModelInitializer errorMessageViewModelInitializer) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        this.flowMode = flowMode;
        this.signupNetworkManager = signupNetworkManager;
        this.stringProvider = stringProvider;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
    }

    public LearnMoreConfirmViewModel createLearnMoreConfirmViewModel(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        return new LearnMoreConfirmViewModel(this.stringProvider, extractLearnMoreConfirmParsedData(), this.signupNetworkManager, this.errorMessageViewModelInitializer.createErrorMessageViewModel());
    }

    public final LearnMoreConfirmParsedData extractLearnMoreConfirmParsedData() {
        boolean z;
        boolean z2;
        String str;
        FlowMode flowMode = this.flowMode;
        boolean z3 = false;
        Object obj = null;
        if (flowMode != null) {
            BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field = flowMode.getField(SignupConstants.Field.RECENTLY_REGISTERED);
            Object value = field != null ? field.getValue() : null;
            if (value == null || !(value instanceof Boolean)) {
                value = null;
            }
            z = C8632dsu.c(value, Boolean.TRUE);
        } else {
            z = false;
        }
        FlowMode flowMode2 = this.flowMode;
        if (flowMode2 != null) {
            SignupErrorReporter access$getSignupErrorReporter = BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field2 = flowMode2.getField(SignupConstants.Field.RECOGNIZED_FORMER_MEMBER);
            Object value2 = field2 != null ? field2.getValue() : null;
            if (value2 == null) {
                access$getSignupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Field.RECOGNIZED_FORMER_MEMBER, null);
            } else {
                if (!(value2 instanceof Boolean)) {
                    access$getSignupErrorReporter.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Field.RECOGNIZED_FORMER_MEMBER, null);
                }
                z2 = C8632dsu.c(value2, Boolean.TRUE);
            }
            value2 = null;
            z2 = C8632dsu.c(value2, Boolean.TRUE);
        } else {
            z2 = false;
        }
        FlowMode flowMode3 = this.flowMode;
        if (flowMode3 != null) {
            SignupErrorReporter access$getSignupErrorReporter2 = BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field3 = flowMode3.getField(SignupConstants.Field.EMAIL);
            Object value3 = field3 != null ? field3.getValue() : null;
            if (value3 != null) {
                if (!(value3 instanceof String)) {
                    if (z) {
                        access$getSignupErrorReporter2.onDataError(SignupConstants.Error.DATA_MANIPULATION_ERROR, SignupConstants.Field.EMAIL, null);
                    }
                }
                str = (String) value3;
            } else if (z) {
                access$getSignupErrorReporter2.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, SignupConstants.Field.EMAIL, null);
            }
            value3 = null;
            str = (String) value3;
        } else {
            str = null;
        }
        FlowMode flowMode4 = this.flowMode;
        if (flowMode4 != null) {
            BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field4 = flowMode4.getField(SignupConstants.Field.PLAN_DIALOG_UNAVAILABLE);
            Object value4 = field4 != null ? field4.getValue() : null;
            if (value4 != null && (value4 instanceof Boolean)) {
                obj = value4;
            }
            z3 = C8632dsu.c(obj, Boolean.TRUE);
        }
        return new LearnMoreConfirmParsedData(z2, str, z, z3);
    }
}
