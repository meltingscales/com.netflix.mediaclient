package com.netflix.mediaclient.acquisition.components.faq;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import javax.inject.Inject;
import o.C8632dsu;
import o.InterfaceC5417byP;

/* loaded from: classes3.dex */
public final class FaqViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final InterfaceC5417byP cfourAcquisition;
    private final FlowMode flowMode;
    private final StringProvider stringProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public FaqViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, InterfaceC5417byP interfaceC5417byP) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) interfaceC5417byP, "");
        this.flowMode = flowMode;
        this.stringProvider = stringProvider;
        this.cfourAcquisition = interfaceC5417byP;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.netflix.mediaclient.acquisition.components.faq.FaqViewParsedData extractFaqParsedData() {
        /*
            r7 = this;
            com.netflix.android.moneyball.FlowMode r0 = r7.flowMode
            java.lang.String r1 = ""
            if (r0 == 0) goto Lc
            java.lang.String r0 = r7.getLowestCostPlanPriceString(r0)
            if (r0 != 0) goto Ld
        Lc:
            r0 = r1
        Ld:
            com.netflix.android.moneyball.FlowMode r2 = r7.flowMode
            if (r2 == 0) goto L19
            java.lang.String r2 = r7.getHighestCostPlanPriceString(r2)
            if (r2 != 0) goto L18
            goto L19
        L18:
            r1 = r2
        L19:
            com.netflix.android.moneyball.FlowMode r2 = r7.flowMode
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L43
            o.byP r5 = r7.cfourAcquisition
            java.lang.String r5 = r5.d()
            com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r7)
            com.netflix.android.moneyball.fields.Field r2 = r2.getField(r5)
            if (r2 != 0) goto L2f
            goto L33
        L2f:
            boolean r5 = r2 instanceof com.netflix.android.moneyball.fields.BooleanField
            if (r5 != 0) goto L34
        L33:
            r2 = r3
        L34:
            com.netflix.android.moneyball.fields.BooleanField r2 = (com.netflix.android.moneyball.fields.BooleanField) r2
            if (r2 == 0) goto L43
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r2 = o.C8632dsu.c(r2, r5)
            goto L44
        L43:
            r2 = r4
        L44:
            com.netflix.android.moneyball.FlowMode r5 = r7.flowMode
            if (r5 == 0) goto L6c
            o.byP r6 = r7.cfourAcquisition
            java.lang.String r6 = r6.c()
            com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer.access$getSignupErrorReporter(r7)
            com.netflix.android.moneyball.fields.Field r5 = r5.getField(r6)
            if (r5 != 0) goto L58
            goto L5e
        L58:
            boolean r6 = r5 instanceof com.netflix.android.moneyball.fields.BooleanField
            if (r6 != 0) goto L5d
            goto L5e
        L5d:
            r3 = r5
        L5e:
            com.netflix.android.moneyball.fields.BooleanField r3 = (com.netflix.android.moneyball.fields.BooleanField) r3
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r4 = o.C8632dsu.c(r3, r4)
        L6c:
            com.netflix.mediaclient.acquisition.components.faq.FaqViewParsedData r3 = new com.netflix.mediaclient.acquisition.components.faq.FaqViewParsedData
            r3.<init>(r0, r1, r2, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.components.faq.FaqViewModelInitializer.extractFaqParsedData():com.netflix.mediaclient.acquisition.components.faq.FaqViewParsedData");
    }

    public final FaqViewModel createFaqViewModel() {
        return new FaqViewModel(this.stringProvider, extractFaqParsedData(), this.cfourAcquisition);
    }
}
