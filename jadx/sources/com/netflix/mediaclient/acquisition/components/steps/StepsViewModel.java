package com.netflix.mediaclient.acquisition.components.steps;

import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import o.C8168dfL;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class StepsViewModel {
    public static final int $stable = 8;
    private final String lowercaseStepsText;
    private final CharSequence stepsText;

    public final String getLowercaseStepsText() {
        return this.lowercaseStepsText;
    }

    public final CharSequence getStepsText() {
        return this.stepsText;
    }

    public StepsViewModel(StringProvider stringProvider, StepsParsedData stepsParsedData) {
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) stepsParsedData, "");
        String str = null;
        this.stepsText = (stepsParsedData.getCurrentStep() == null || stepsParsedData.getTotalSteps() == null) ? null : C8168dfL.c(stringProvider.getFormatter(R.string.label_steps_indicator).d(SignupConstants.Key.CURRENT_STEP, Integer.valueOf(stepsParsedData.getCurrentStep().intValue() + 1)).d(SignupConstants.Key.TOTAL_STEPS, stepsParsedData.getTotalSteps()).c());
        if (stepsParsedData.getCurrentStep() != null && stepsParsedData.getTotalSteps() != null) {
            str = stringProvider.getFormatter(R.string.label_steps_indicator_lowercase).d(SignupConstants.Key.CURRENT_STEP, Integer.valueOf(stepsParsedData.getCurrentStep().intValue() + 1)).d(SignupConstants.Key.TOTAL_STEPS, stepsParsedData.getTotalSteps()).c();
        }
        this.lowercaseStepsText = str;
    }
}
