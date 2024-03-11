package com.netflix.mediaclient.acquisition.screens.signupContainer;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializerKt;
import com.netflix.mediaclient.acquisition.lib.util.kotlinx.KeyPathEvaluationKt;
import com.netflix.mediaclient.acquisition.util.SignupFlowModeStackManager;
import java.util.List;
import java.util.Map;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class SignupViewModel extends ViewModel {
    private MutableLiveData<SignInButtonInHeaderType> signInButtonType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final MutableLiveData<SignInButtonInHeaderType> getSignInButtonType() {
        return this.signInButtonType;
    }

    public final void setSignInButtonType(MutableLiveData<SignInButtonInHeaderType> mutableLiveData) {
        C8632dsu.c((Object) mutableLiveData, "");
        this.signInButtonType = mutableLiveData;
    }

    public SignupViewModel() {
        MutableLiveData<SignInButtonInHeaderType> mutableLiveData = new MutableLiveData<>();
        this.signInButtonType = mutableLiveData;
        mutableLiveData.setValue(SignInButtonInHeaderType.SIGN_IN);
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final String getShaktiInboundUrl(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            return "/aui/inbound?flow=" + str + "&mode=" + str2 + "&sourceNetflixClientPlatform=androidNative";
        }
    }

    public final FlowMode getCurrentFlowMode() {
        return SignupFlowModeStackManager.INSTANCE.getCurrentFlowMode();
    }

    public final String getUserLoginId(FlowMode flowMode) {
        Object obj;
        Map<String, Object> data;
        List j;
        if (flowMode == null || (data = flowMode.getData()) == null) {
            obj = null;
        } else {
            j = C8569dql.j("fields", "userLoginId", "value");
            obj = KeyPathEvaluationKt.getPathValue((Object) data, (List<String>) j);
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final String getLoginBanner(FlowMode flowMode, StringProvider stringProvider) {
        Field field;
        C8632dsu.c((Object) stringProvider, "");
        Object value = (flowMode == null || (field = flowMode.getField(SignupConstants.Field.LOGIN_BANNER)) == null) ? null : field.getValue();
        String str = value instanceof String ? (String) value : null;
        if (str != null) {
            return stringProvider.getString(str);
        }
        return null;
    }

    public final void updateSignInButtonInHeader(FlowMode flowMode) {
        SignInButtonInHeaderType signInButtonInHeaderType;
        C8632dsu.c((Object) flowMode, "");
        MutableLiveData<SignInButtonInHeaderType> mutableLiveData = this.signInButtonType;
        if (C8632dsu.c((Object) flowMode.getFlow(), (Object) SignupConstants.Flow.PROFILE_ONBOARDING)) {
            signInButtonInHeaderType = SignInButtonInHeaderType.NO_BUTTON;
        } else if (C8632dsu.c((Object) flowMode.getMode(), (Object) SignupConstants.Mode.NON_MEMBER_HOME)) {
            signInButtonInHeaderType = SignInButtonInHeaderType.NO_BUTTON;
        } else if (BaseViewModelInitializerKt.isRecognisedFormerOrNeverMemberOrCurrentMember(flowMode)) {
            signInButtonInHeaderType = SignInButtonInHeaderType.SIGN_OUT;
        } else {
            signInButtonInHeaderType = SignInButtonInHeaderType.SIGN_IN;
        }
        mutableLiveData.setValue(signInButtonInHeaderType);
    }
}
