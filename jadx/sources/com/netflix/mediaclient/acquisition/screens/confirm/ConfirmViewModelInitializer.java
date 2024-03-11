package com.netflix.mediaclient.acquisition.screens.confirm;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesViewModel;
import com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.paymentInfo.PaymentInfoViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.planInfo.PlanInfoViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.startMembershipButton.StartMembershipButtonViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.tou.TouPaymentViewModel;
import com.netflix.mediaclient.acquisition.components.tou.TouViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.FormCache;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.screens.creditDebit.EmvcoDataService;
import javax.inject.Inject;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class ConfirmViewModelInitializer extends BaseViewModelInitializer {
    public static final String PAGE_KEY = "confirm";
    private final EmvcoDataService emvcoDataService;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final FormCache formCache;
    private final KoreaCheckBoxesViewModelInitializer koreaCheckBoxesViewModelInitializer;
    private final MoneyballDataSource moneyballDataSource;
    private final PaymentInfoViewModelInitializer paymentInfoViewModelInitializer;
    private final PlanInfoViewModelInitializer planInfoViewModelInitializer;
    private final SignupNetworkManager signupNetworkManager;
    private final StartMembershipButtonViewModelInitializer startMembershipButtonViewModelInitializer;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ConfirmViewModelInitializer(MoneyballDataSource moneyballDataSource, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, StringProvider stringProvider, ViewModelProvider.Factory factory, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, StartMembershipButtonViewModelInitializer startMembershipButtonViewModelInitializer, KoreaCheckBoxesViewModelInitializer koreaCheckBoxesViewModelInitializer, FormCache formCache, EmvcoDataService emvcoDataService, PlanInfoViewModelInitializer planInfoViewModelInitializer, PaymentInfoViewModelInitializer paymentInfoViewModelInitializer) {
        super(signupErrorReporter);
        C8632dsu.c((Object) moneyballDataSource, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        C8632dsu.c((Object) startMembershipButtonViewModelInitializer, "");
        C8632dsu.c((Object) koreaCheckBoxesViewModelInitializer, "");
        C8632dsu.c((Object) formCache, "");
        C8632dsu.c((Object) emvcoDataService, "");
        C8632dsu.c((Object) planInfoViewModelInitializer, "");
        C8632dsu.c((Object) paymentInfoViewModelInitializer, "");
        this.moneyballDataSource = moneyballDataSource;
        this.signupNetworkManager = signupNetworkManager;
        this.stringProvider = stringProvider;
        this.viewModelProviderFactory = factory;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
        this.startMembershipButtonViewModelInitializer = startMembershipButtonViewModelInitializer;
        this.koreaCheckBoxesViewModelInitializer = koreaCheckBoxesViewModelInitializer;
        this.formCache = formCache;
        this.emvcoDataService = emvcoDataService;
        this.planInfoViewModelInitializer = planInfoViewModelInitializer;
        this.paymentInfoViewModelInitializer = paymentInfoViewModelInitializer;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    private final FlowMode getFlowMode() {
        return this.moneyballDataSource.getFlowMode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.netflix.mediaclient.acquisition.screens.confirm.ConfirmParsedData extractConfirmParsedData() {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.confirm.ConfirmViewModelInitializer.extractConfirmParsedData():com.netflix.mediaclient.acquisition.screens.confirm.ConfirmParsedData");
    }

    private final KoreaCheckBoxesViewModel createKoreaCheckBoxesViewModel() {
        return this.koreaCheckBoxesViewModelInitializer.createKoreaCheckBoxesViewModel(getFlowMode(), "confirm", this.formCache);
    }

    private final TouPaymentViewModel createTouViewModel() {
        return TouViewModelInitializer.createTermsOfUsePaymentViewModel$default(new TouViewModelInitializer(this.moneyballDataSource, getSignupErrorReporter(), this.stringProvider, this.startMembershipButtonViewModelInitializer), getFlowMode(), null, 2, null);
    }

    public final ConfirmViewModel createConfirmViewModel(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        ConfirmParsedData extractConfirmParsedData = extractConfirmParsedData();
        return new ConfirmViewModel(this.stringProvider, extractConfirmParsedData, (ConfirmLifecycleData) new ViewModelProvider(fragment, this.viewModelProviderFactory).get(ConfirmLifecycleData.class), this.signupNetworkManager, this.errorMessageViewModelInitializer.createErrorMessageViewModel(), this.emvcoDataService);
    }
}
