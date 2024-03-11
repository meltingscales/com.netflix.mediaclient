package com.netflix.mediaclient.acquisition.components.steps;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class StepsViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final FlowMode flowMode;
    private final StringProvider stringProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public StepsViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) stringProvider, "");
        this.flowMode = flowMode;
        this.stringProvider = stringProvider;
    }

    public static /* synthetic */ StepsViewModel createStepsViewModel$default(StepsViewModelInitializer stepsViewModelInitializer, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return stepsViewModelInitializer.createStepsViewModel(z);
    }

    public final StepsViewModel createStepsViewModel(boolean z) {
        return new StepsViewModel(this.stringProvider, extractStepsData(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.netflix.mediaclient.acquisition.components.steps.StepsParsedData extractStepsData(boolean r5) {
        /*
            r4 = this;
            com.netflix.android.moneyball.FlowMode r0 = r4.flowMode
            r1 = 0
            if (r0 == 0) goto L18
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r2 = com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r4)
            java.lang.String r3 = "steps"
            com.netflix.android.moneyball.fields.Field r0 = r0.getField(r3)
            if (r0 != 0) goto L19
            if (r5 == 0) goto L18
            java.lang.String r5 = "SignupNativeFieldError"
            r2.onDataError(r5, r3, r1)
        L18:
            r0 = r1
        L19:
            if (r0 == 0) goto L22
            java.lang.String r5 = "currentStep"
            java.lang.Object r5 = r0.getAttr(r5)
            goto L23
        L22:
            r5 = r1
        L23:
            boolean r2 = r5 instanceof java.lang.Number
            if (r2 == 0) goto L2a
            java.lang.Number r5 = (java.lang.Number) r5
            goto L2b
        L2a:
            r5 = r1
        L2b:
            if (r0 == 0) goto L34
            java.lang.String r2 = "totalSteps"
            java.lang.Object r0 = r0.getAttr(r2)
            goto L35
        L34:
            r0 = r1
        L35:
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L3c
            java.lang.Number r0 = (java.lang.Number) r0
            goto L3d
        L3c:
            r0 = r1
        L3d:
            if (r5 == 0) goto L48
            int r5 = r5.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L49
        L48:
            r5 = r1
        L49:
            if (r0 == 0) goto L53
            int r0 = r0.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L53:
            com.netflix.mediaclient.acquisition.components.steps.StepsParsedData r0 = new com.netflix.mediaclient.acquisition.components.steps.StepsParsedData
            r0.<init>(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.components.steps.StepsViewModelInitializer.extractStepsData(boolean):com.netflix.mediaclient.acquisition.components.steps.StepsParsedData");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x000e, code lost:
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.netflix.mediaclient.acquisition.components.steps.StepsViewModel createStepsViewModelWithFallback(int r4, int r5) {
        /*
            r3 = this;
            com.netflix.android.moneyball.FlowMode r0 = r3.flowMode
            r1 = 0
            if (r0 == 0) goto L10
            com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r3)
            java.lang.String r2 = "steps"
            com.netflix.android.moneyball.fields.Field r0 = r0.getField(r2)
            if (r0 != 0) goto L11
        L10:
            r0 = r1
        L11:
            if (r0 == 0) goto L1a
            r4 = 0
            r5 = 1
            com.netflix.mediaclient.acquisition.components.steps.StepsViewModel r4 = createStepsViewModel$default(r3, r4, r5, r1)
            goto L2e
        L1a:
            com.netflix.mediaclient.acquisition.lib.services.StringProvider r0 = r3.stringProvider
            com.netflix.mediaclient.acquisition.components.steps.StepsParsedData r1 = new com.netflix.mediaclient.acquisition.components.steps.StepsParsedData
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.<init>(r4, r5)
            com.netflix.mediaclient.acquisition.components.steps.StepsViewModel r4 = new com.netflix.mediaclient.acquisition.components.steps.StepsViewModel
            r4.<init>(r0, r1)
        L2e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.components.steps.StepsViewModelInitializer.createStepsViewModelWithFallback(int, int):com.netflix.mediaclient.acquisition.components.steps.StepsViewModel");
    }
}
