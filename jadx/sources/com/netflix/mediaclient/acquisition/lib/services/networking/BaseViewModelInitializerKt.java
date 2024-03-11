package com.netflix.mediaclient.acquisition.lib.services.networking;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class BaseViewModelInitializerKt {
    public static final boolean isRecognisedFormerOrNeverMemberOrCurrentMember(FlowMode flowMode) {
        C8632dsu.c((Object) flowMode, "");
        Field field = flowMode.getField(SignupConstants.Field.RECOGNIZED_FORMER_MEMBER);
        Object value = field != null ? field.getValue() : null;
        Boolean bool = value instanceof Boolean ? (Boolean) value : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Field field2 = flowMode.getField(SignupConstants.Field.RECOGNIZED_NEVER_MEMBER);
        Object value2 = field2 != null ? field2.getValue() : null;
        Boolean bool2 = value2 instanceof Boolean ? (Boolean) value2 : null;
        return booleanValue || (bool2 != null ? bool2.booleanValue() : false) || (C8632dsu.c((Object) flowMode.getFlow(), (Object) SignupConstants.Flow.MOBILE_ONBOARDING) || C8632dsu.c((Object) flowMode.getFlow(), (Object) SignupConstants.Flow.PROFILE_ONBOARDING));
    }
}
