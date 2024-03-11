package com.netflix.mediaclient.acquisition.screens.upi;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModel;
import javax.inject.Inject;
import o.C8632dsu;
import o.InterfaceC1270Vf;

/* loaded from: classes3.dex */
public final class UpiWaitingViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final InterfaceC1270Vf clock;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final FlowMode initialFlowMode;
    private final SignupNetworkManager signupNetworkManager;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public UpiWaitingViewModelInitializer(FlowMode flowMode, SignupNetworkManager signupNetworkManager, StringProvider stringProvider, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, ViewModelProvider.Factory factory, InterfaceC1270Vf interfaceC1270Vf, SignupErrorReporter signupErrorReporter) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        this.initialFlowMode = flowMode;
        this.signupNetworkManager = signupNetworkManager;
        this.stringProvider = stringProvider;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
        this.viewModelProviderFactory = factory;
        this.clock = interfaceC1270Vf;
    }

    public final UpiWaitingViewModel createUpiWaitingViewModel(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        return new UpiWaitingViewModel(this.signupNetworkManager, this.stringProvider, this.errorMessageViewModelInitializer.createErrorMessageViewModel(), this.clock, extractParsedData(this.initialFlowMode), (UpiWaitingViewModel.LifecycleData) new ViewModelProvider(fragment, this.viewModelProviderFactory).get(UpiWaitingViewModel.LifecycleData.class));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r1 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModel.ParsedData extractParsedData(com.netflix.android.moneyball.FlowMode r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L21
            com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r9)
            java.lang.String r1 = "expirationInMinutes"
            com.netflix.android.moneyball.fields.Field r1 = r10.getField(r1)
            if (r1 == 0) goto L13
            java.lang.Object r1 = r1.getValue()
            goto L14
        L13:
            r1 = r0
        L14:
            if (r1 != 0) goto L17
            goto L1b
        L17:
            boolean r2 = r1 instanceof java.lang.Long
            if (r2 != 0) goto L1c
        L1b:
            r1 = r0
        L1c:
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L21
            goto L27
        L21:
            r1 = 7
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L27:
            java.lang.String r2 = "SignupNativeDataManipulationError"
            java.lang.String r3 = "SignupNativeFieldError"
            if (r10 == 0) goto L50
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r4 = com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r9)
            java.lang.String r5 = "pollAfterMS"
            com.netflix.android.moneyball.fields.Field r6 = r10.getField(r5)
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r6.getValue()
            goto L3f
        L3e:
            r6 = r0
        L3f:
            if (r6 != 0) goto L45
            r4.onDataError(r3, r5, r0)
            goto L4c
        L45:
            boolean r7 = r6 instanceof java.lang.Long
            if (r7 != 0) goto L4d
            r4.onDataError(r2, r5, r0)
        L4c:
            r6 = r0
        L4d:
            java.lang.Long r6 = (java.lang.Long) r6
            goto L51
        L50:
            r6 = r0
        L51:
            if (r10 == 0) goto L6e
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r4 = com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r9)
            java.lang.String r5 = "nextAction"
            com.netflix.android.moneyball.fields.Field r7 = r10.getField(r5)
            if (r7 != 0) goto L63
            r4.onDataError(r3, r5, r0)
            goto L6a
        L63:
            boolean r8 = r7 instanceof com.netflix.android.moneyball.fields.ActionField
            if (r8 != 0) goto L6b
            r4.onDataError(r2, r5, r0)
        L6a:
            r7 = r0
        L6b:
            com.netflix.android.moneyball.fields.ActionField r7 = (com.netflix.android.moneyball.fields.ActionField) r7
            goto L6f
        L6e:
            r7 = r0
        L6f:
            if (r10 == 0) goto L8c
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r4 = com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r9)
            java.lang.String r5 = "skipWaitAction"
            com.netflix.android.moneyball.fields.Field r10 = r10.getField(r5)
            if (r10 != 0) goto L81
            r4.onDataError(r3, r5, r0)
            goto L8a
        L81:
            boolean r3 = r10 instanceof com.netflix.android.moneyball.fields.ActionField
            if (r3 != 0) goto L89
            r4.onDataError(r2, r5, r0)
            goto L8a
        L89:
            r0 = r10
        L8a:
            com.netflix.android.moneyball.fields.ActionField r0 = (com.netflix.android.moneyball.fields.ActionField) r0
        L8c:
            com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModel$ParsedData r10 = new com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModel$ParsedData
            r10.<init>(r1, r6, r7, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModelInitializer.extractParsedData(com.netflix.android.moneyball.FlowMode):com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModel$ParsedData");
    }
}
