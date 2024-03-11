package com.netflix.mediaclient.acquisition.screens.verifyCardContext;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextViewModel;
import javax.inject.Inject;
import o.C8632dsu;
import o.InterfaceC1270Vf;

/* loaded from: classes3.dex */
public final class VerifyCardContextViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final InterfaceC1270Vf clock;
    private final FlowMode flowMode;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public VerifyCardContextViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, ViewModelProvider.Factory factory, InterfaceC1270Vf interfaceC1270Vf) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        this.flowMode = flowMode;
        this.stringProvider = stringProvider;
        this.viewModelProviderFactory = factory;
        this.clock = interfaceC1270Vf;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextParsedData extractVerifyCardContextData() {
        /*
            r5 = this;
            com.netflix.android.moneyball.FlowMode r0 = r5.flowMode
            r1 = 0
            if (r0 == 0) goto L2f
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r2 = com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r5)
            java.lang.String r3 = "is3DSCharge"
            com.netflix.android.moneyball.fields.Field r0 = r0.getField(r3)
            if (r0 == 0) goto L16
            java.lang.Object r0 = r0.getValue()
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 != 0) goto L1c
            java.lang.String r0 = "SignupNativeFieldError"
            goto L22
        L1c:
            boolean r4 = r0 instanceof java.lang.Boolean
            if (r4 != 0) goto L26
            java.lang.String r0 = "SignupNativeDataManipulationError"
        L22:
            r2.onDataError(r0, r3, r1)
            r0 = r1
        L26:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L2f
            boolean r0 = r0.booleanValue()
            goto L30
        L2f:
            r0 = 1
        L30:
            com.netflix.android.moneyball.FlowMode r2 = r5.flowMode
            if (r2 == 0) goto L56
            com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r5)
            java.lang.String r3 = "autoSubmit"
            com.netflix.android.moneyball.fields.Field r2 = r2.getField(r3)
            if (r2 == 0) goto L44
            java.lang.Object r2 = r2.getValue()
            goto L45
        L44:
            r2 = r1
        L45:
            if (r2 != 0) goto L48
            goto L4c
        L48:
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 != 0) goto L4d
        L4c:
            r2 = r1
        L4d:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L56
            boolean r2 = r2.booleanValue()
            goto L57
        L56:
            r2 = 0
        L57:
            com.netflix.android.moneyball.FlowMode r3 = r5.flowMode
            if (r3 == 0) goto L77
            com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r5)
            java.lang.String r4 = "userMessage"
            com.netflix.android.moneyball.fields.Field r3 = r3.getField(r4)
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r3.getValue()
            goto L6c
        L6b:
            r3 = r1
        L6c:
            if (r3 != 0) goto L6f
            goto L75
        L6f:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L74
            goto L75
        L74:
            r1 = r3
        L75:
            java.lang.String r1 = (java.lang.String) r1
        L77:
            com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextParsedData r3 = new com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextParsedData
            r3.<init>(r0, r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextViewModelInitializer.extractVerifyCardContextData():com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextParsedData");
    }

    public final VerifyCardContextViewModel createVerifyCardContextViewModel(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        return new VerifyCardContextViewModel(this.stringProvider, this.clock, extractVerifyCardContextData(), (VerifyCardContextViewModel.LifecycleData) new ViewModelProvider(fragment, this.viewModelProviderFactory).get(VerifyCardContextViewModel.LifecycleData.class));
    }
}
