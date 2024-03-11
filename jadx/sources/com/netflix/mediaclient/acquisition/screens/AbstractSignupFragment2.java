package com.netflix.mediaclient.acquisition.screens;

import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.acquisition.lib.screens.SignupBackType;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment;

/* loaded from: classes3.dex */
public abstract class AbstractSignupFragment2 extends SignupFragment {
    public static final int $stable = 0;

    public TrackingInfo getPresentationTrackingInfo() {
        return null;
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public SignupBackType backBehavior() {
        return SignupBackType.BACK_TO_PREVIOUS_MODE;
    }
}
