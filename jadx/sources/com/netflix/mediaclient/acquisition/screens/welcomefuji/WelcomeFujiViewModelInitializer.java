package com.netflix.mediaclient.acquisition.screens.welcomefuji;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import javax.inject.Inject;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public class WelcomeFujiViewModelInitializer extends BaseViewModelInitializer {
    private static final String FALLBACK_VLV_IMAGE_URL = "https://assets.nflxext.com/ffe/siteui/vlv3/afbfd84e-c987-4438-99f2-8d0738d30d68/80f89692-9533-4b7b-ab0c-359825415564/US-en-20170918-popsignuptwoweeks-perspective_alpha_website_small.jpg";
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final FlowMode flowMode;
    private final FormViewEditTextViewModelInitializer formViewEditTextViewModelInitializer;
    private final SignupNetworkManager signupNetworkManager;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public WelcomeFujiViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, StringProvider stringProvider, ViewModelProvider.Factory factory, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, FormViewEditTextViewModelInitializer formViewEditTextViewModelInitializer) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        C8632dsu.c((Object) formViewEditTextViewModelInitializer, "");
        this.flowMode = flowMode;
        this.signupNetworkManager = signupNetworkManager;
        this.stringProvider = stringProvider;
        this.viewModelProviderFactory = factory;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
        this.formViewEditTextViewModelInitializer = formViewEditTextViewModelInitializer;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x02e7, code lost:
        if (r11 == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x030e, code lost:
        if (r15 == false) goto L221;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiParsedData extractWelcomeFujiParsedData() {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiViewModelInitializer.extractWelcomeFujiParsedData():com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiParsedData");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String getImageUrl(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "vlv"
            boolean r12 = o.C8632dsu.c(r12, r0)
            r0 = 0
            if (r12 == 0) goto L55
            com.netflix.android.moneyball.FlowMode r11 = r10.flowMode
            if (r11 == 0) goto L52
            java.util.Map r11 = r11.getData()
            if (r11 == 0) goto L52
            java.lang.String r1 = "adaptiveFields"
            java.lang.String r2 = "concord"
            java.lang.String r3 = "image"
            java.lang.String r4 = "imageSet"
            java.lang.String r5 = "0"
            java.lang.String r6 = "cdnUrl"
            java.lang.String[] r12 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}
            java.util.List r1 = o.C8570dqm.b(r12)
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r12 = com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r10)
            java.lang.Object r11 = com.netflix.mediaclient.acquisition.lib.util.kotlinx.KeyPathEvaluationKt.getPathValue(r11, r1)
            java.lang.String r2 = ","
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 62
            r9 = 0
            java.lang.String r1 = o.C8570dqm.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L42
            java.lang.String r11 = "SignupNativeFieldError"
            goto L48
        L42:
            boolean r2 = r11 instanceof java.lang.String
            if (r2 != 0) goto L4c
            java.lang.String r11 = "SignupNativeDataManipulationError"
        L48:
            r12.onDataError(r11, r1, r0)
            goto L4d
        L4c:
            r0 = r11
        L4d:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L52
            goto L8a
        L52:
            java.lang.String r0 = "https://assets.nflxext.com/ffe/siteui/vlv3/afbfd84e-c987-4438-99f2-8d0738d30d68/80f89692-9533-4b7b-ab0c-359825415564/US-en-20170918-popsignuptwoweeks-perspective_alpha_website_small.jpg"
            goto L8a
        L55:
            com.netflix.android.moneyball.FlowMode r12 = r10.flowMode
            if (r12 == 0) goto L8a
            java.util.Map r12 = r12.getData()
            if (r12 == 0) goto L8a
            java.lang.String r1 = "adaptiveFields"
            java.lang.String r2 = "imageUrl"
            java.lang.String[] r11 = new java.lang.String[]{r1, r11, r2}
            java.util.List r1 = o.C8570dqm.b(r11)
            com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r10)
            java.lang.Object r11 = com.netflix.mediaclient.acquisition.lib.util.kotlinx.KeyPathEvaluationKt.getPathValue(r12, r1)
            java.lang.String r2 = ","
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 62
            r9 = 0
            o.C8570dqm.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L82
            goto L88
        L82:
            boolean r12 = r11 instanceof java.lang.String
            if (r12 != 0) goto L87
            goto L88
        L87:
            r0 = r11
        L88:
            java.lang.String r0 = (java.lang.String) r0
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiViewModelInitializer.getImageUrl(java.lang.String, java.lang.String):java.lang.String");
    }

    public final FormViewEditTextViewModel createEmailViewModel() {
        return FormViewEditTextViewModelInitializer.extractFormViewEditTextViewModel$default(this.formViewEditTextViewModelInitializer, "registration", SignupConstants.Field.EMAIL, AppView.emailInput, InputKind.email, true, false, null, 64, null);
    }

    public WelcomeFujiViewModel createWelcomeFujiViewModel(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        return new WelcomeFujiViewModel(this.stringProvider, extractWelcomeFujiParsedData(), (WelcomeFujiLifecycleData) new ViewModelProvider(fragment, this.viewModelProviderFactory).get(WelcomeFujiLifecycleData.class), createEmailViewModel(), this.signupNetworkManager, this.errorMessageViewModelInitializer.createErrorMessageViewModel());
    }
}
