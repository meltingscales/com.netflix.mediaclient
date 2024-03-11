package com.netflix.mediaclient.acquisition.components.paymentInfo;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class PaymentInfoViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final MoneyballDataSource moneyballDataSource;
    private final StringProvider stringProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public PaymentInfoViewModelInitializer(MoneyballDataSource moneyballDataSource, SignupErrorReporter signupErrorReporter, StringProvider stringProvider) {
        super(signupErrorReporter);
        C8632dsu.c((Object) moneyballDataSource, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) stringProvider, "");
        this.moneyballDataSource = moneyballDataSource;
        this.stringProvider = stringProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.netflix.mediaclient.acquisition.components.paymentInfo.PaymentInfoParsedData extractEditPaymentData() {
        /*
            Method dump skipped, instructions count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.components.paymentInfo.PaymentInfoViewModelInitializer.extractEditPaymentData():com.netflix.mediaclient.acquisition.components.paymentInfo.PaymentInfoParsedData");
    }

    public final PaymentInfoViewModel createEditPaymentViewModel() {
        return new PaymentInfoViewModel(extractEditPaymentData(), this.stringProvider);
    }
}
