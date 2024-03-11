package com.netflix.mediaclient.acquisition.lib.components.error;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class ErrorMessageViewModelInitializer extends BaseViewModelInitializer {
    private final MoneyballDataSource moneyballDataSource;
    private final StringProvider stringProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ErrorMessageViewModelInitializer(MoneyballDataSource moneyballDataSource, SignupErrorReporter signupErrorReporter, StringProvider stringProvider) {
        super(signupErrorReporter);
        C8632dsu.c((Object) moneyballDataSource, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) stringProvider, "");
        this.moneyballDataSource = moneyballDataSource;
        this.stringProvider = stringProvider;
    }

    private final FlowMode getFlowMode() {
        return this.moneyballDataSource.getFlowMode();
    }

    public static /* synthetic */ ErrorMessageParsedData extractErrorMessageData$default(ErrorMessageViewModelInitializer errorMessageViewModelInitializer, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return errorMessageViewModelInitializer.extractErrorMessageData(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageParsedData extractErrorMessageData(java.lang.String r7) {
        /*
            r6 = this;
            com.netflix.android.moneyball.FlowMode r0 = r6.getFlowMode()
            r1 = 0
            if (r0 == 0) goto L23
            com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r6)
            java.lang.String r2 = "errorCode"
            com.netflix.android.moneyball.fields.Field r0 = r0.getField(r2)
            if (r0 == 0) goto L17
            java.lang.Object r0 = r0.getValue()
            goto L18
        L17:
            r0 = r1
        L18:
            if (r0 != 0) goto L1b
            goto L1f
        L1b:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 != 0) goto L20
        L1f:
            r0 = r1
        L20:
            java.lang.String r0 = (java.lang.String) r0
            goto L24
        L23:
            r0 = r1
        L24:
            if (r7 != 0) goto L32
            com.netflix.android.moneyball.FlowMode r7 = r6.getFlowMode()
            if (r7 == 0) goto L31
            java.lang.String r7 = r7.getMode()
            goto L32
        L31:
            r7 = r1
        L32:
            com.netflix.mediaclient.acquisition.lib.SignupConstants$ErrorStringsWithArg r2 = com.netflix.mediaclient.acquisition.lib.SignupConstants.ErrorStringsWithArg.INSTANCE
            java.lang.String[] r2 = r2.getCARRIER()
            boolean r2 = o.C8561dqd.d(r2, r0)
            if (r2 == 0) goto L74
            com.netflix.android.moneyball.FlowMode r2 = r6.getFlowMode()
            if (r2 == 0) goto L68
            com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter r3 = com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r6)
            java.lang.String r4 = "partnerDisplayName"
            com.netflix.android.moneyball.fields.Field r2 = r2.getField(r4)
            if (r2 == 0) goto L55
            java.lang.Object r2 = r2.getValue()
            goto L56
        L55:
            r2 = r1
        L56:
            if (r2 != 0) goto L5b
            java.lang.String r2 = "SignupNativeFieldError"
            goto L61
        L5b:
            boolean r5 = r2 instanceof java.lang.String
            if (r5 != 0) goto L65
            java.lang.String r2 = "SignupNativeDataManipulationError"
        L61:
            r3.onDataError(r2, r4, r1)
            r2 = r1
        L65:
            java.lang.String r2 = (java.lang.String) r2
            goto L69
        L68:
            r2 = r1
        L69:
            java.lang.String r3 = "carrier"
            kotlin.Pair r2 = o.dpD.a(r3, r2)
            java.util.Map r2 = o.dqF.e(r2)
            goto L75
        L74:
            r2 = r1
        L75:
            com.netflix.android.moneyball.FlowMode r3 = r6.getFlowMode()
            if (r3 == 0) goto L9e
            com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r6)
            java.lang.String r4 = "isPaymentPickerError"
            com.netflix.android.moneyball.fields.Field r3 = r3.getField(r4)
            if (r3 == 0) goto L8b
            java.lang.Object r3 = r3.getValue()
            goto L8c
        L8b:
            r3 = r1
        L8c:
            if (r3 != 0) goto L8f
            goto L95
        L8f:
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 != 0) goto L94
            goto L95
        L94:
            r1 = r3
        L95:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L9e
            boolean r1 = r1.booleanValue()
            goto L9f
        L9e:
            r1 = 0
        L9f:
            if (r7 != 0) goto La3
            java.lang.String r7 = ""
        La3:
            com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageParsedData r3 = new com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageParsedData
            r3.<init>(r0, r2, r1, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer.extractErrorMessageData(java.lang.String):com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageParsedData");
    }

    public final ErrorMessageViewModel createErrorMessageViewModel() {
        return new ErrorMessageViewModel(this.stringProvider, extractErrorMessageData$default(this, null, 1, null));
    }
}
