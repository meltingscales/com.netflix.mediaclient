package com.netflix.mediaclient.acquisition.screens.confirm;

import androidx.lifecycle.MutableLiveData;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesViewModel;
import com.netflix.mediaclient.acquisition.components.paymentInfo.PaymentInfoViewModel;
import com.netflix.mediaclient.acquisition.components.planInfo.PlanInfoViewModel;
import com.netflix.mediaclient.acquisition.components.startMembershipButton.StartMembershipButtonViewModel;
import com.netflix.mediaclient.acquisition.components.tou.TouPaymentViewModel;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.screens.creditDebit.EmvcoDataService;
import o.C1333Xq;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class ConfirmViewModel extends AbstractNetworkViewModel2 {
    public static final int $stable = 8;
    private final PlanInfoViewModel changePlanViewModel;
    private final PaymentInfoViewModel editPaymentViewModel;
    private final String email;
    private final EmvcoDataService emvcoDataService;
    private final String firstName;
    private final String giftAmount;
    private final String headerText;
    private final boolean isRecognizedFormerMember;
    private final KoreaCheckBoxesViewModel koreaCheckBoxesViewModel;
    private final ConfirmLifecycleData lifecycleData;
    private final ConfirmParsedData parsedData;
    private final String paypalEmail;
    private final ActionField resumeMembershipAction;
    private final boolean shouldRunEmvcoCheck;
    private final boolean showCvvField;
    private final StartMembershipButtonViewModel startMembershipButtonViewModel;
    private final StringProvider stringProvider;
    private final MutableLiveData<Boolean> submitConfirm;
    private final TouPaymentViewModel touViewModel;
    private final String upiId;
    private final boolean useBlueBanner;

    public final PlanInfoViewModel getChangePlanViewModel() {
        return this.changePlanViewModel;
    }

    public final PaymentInfoViewModel getEditPaymentViewModel() {
        return this.editPaymentViewModel;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getGiftAmount() {
        return this.giftAmount;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final KoreaCheckBoxesViewModel getKoreaCheckBoxesViewModel() {
        return this.koreaCheckBoxesViewModel;
    }

    public final String getPaypalEmail() {
        return this.paypalEmail;
    }

    public final boolean getShouldRunEmvcoCheck() {
        return this.shouldRunEmvcoCheck;
    }

    public final boolean getShowCvvField() {
        return this.showCvvField;
    }

    public final StartMembershipButtonViewModel getStartMembershipButtonViewModel() {
        return this.startMembershipButtonViewModel;
    }

    public final MutableLiveData<Boolean> getSubmitConfirm() {
        return this.submitConfirm;
    }

    public final TouPaymentViewModel getTouViewModel() {
        return this.touViewModel;
    }

    public final String getUpiId() {
        return this.upiId;
    }

    public final boolean getUseBlueBanner() {
        return this.useBlueBanner;
    }

    public final boolean isRecognizedFormerMember() {
        return this.isRecognizedFormerMember;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmViewModel(StringProvider stringProvider, ConfirmParsedData confirmParsedData, ConfirmLifecycleData confirmLifecycleData, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel, EmvcoDataService emvcoDataService) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        StringField emvco3dsAuthenticationWindowSize;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) confirmParsedData, "");
        C8632dsu.c((Object) confirmLifecycleData, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        C8632dsu.c((Object) emvcoDataService, "");
        this.stringProvider = stringProvider;
        this.parsedData = confirmParsedData;
        this.lifecycleData = confirmLifecycleData;
        this.emvcoDataService = emvcoDataService;
        this.isRecognizedFormerMember = confirmParsedData.isRecognizedFormerMember();
        this.firstName = confirmParsedData.getFirstName();
        this.email = confirmParsedData.getEmail();
        this.paypalEmail = confirmParsedData.getPaypalEmail();
        this.upiId = confirmParsedData.getUpiId();
        this.showCvvField = confirmParsedData.getShowCvvField();
        this.submitConfirm = confirmLifecycleData.getSubmit();
        this.startMembershipButtonViewModel = confirmParsedData.getStartMembershipButtonViewModel();
        this.koreaCheckBoxesViewModel = confirmParsedData.getKoreaCheckBoxesViewModel();
        this.touViewModel = confirmParsedData.getTouViewModel();
        this.changePlanViewModel = confirmParsedData.getPlanInfoViewModel();
        this.editPaymentViewModel = confirmParsedData.getPaymentInfoViewModel();
        ActionField resumeMembershipAction = confirmParsedData.getResumeMembershipAction();
        this.resumeMembershipAction = resumeMembershipAction;
        this.headerText = stringProvider.getString(R.string.confirm_details);
        this.useBlueBanner = C8632dsu.c((Object) getUserMessage(), (Object) "direct_debit_payment_wait") || resumeMembershipAction != null;
        String giftAmount = confirmParsedData.getGiftAmount();
        this.giftAmount = giftAmount != null ? stringProvider.getFormatter(R.string.label_gift_applied).d(SignupConstants.Field.GIFT_AMOUNT, giftAmount).c() : null;
        boolean z = confirmParsedData.getEmvco3dsDeviceDataResponseFallback() != null;
        this.shouldRunEmvcoCheck = z;
        if (!z || (emvco3dsAuthenticationWindowSize = confirmParsedData.getEmvco3dsAuthenticationWindowSize()) == null) {
            return;
        }
        emvco3dsAuthenticationWindowSize.setValue(emvcoDataService.getEmvco3dsAuthenticationWindowSize());
    }

    public final String getWelcomeBackText() {
        String str = this.firstName;
        if (str == null || str.length() == 0) {
            return this.stringProvider.getString(com.netflix.mediaclient.ui.R.o.mx);
        }
        String c = C1333Xq.d(R.string.welcome_back_name).d("name", this.firstName).c();
        C8632dsu.d((Object) c);
        return c;
    }

    public final String getUserMessage() {
        return (this.parsedData.getMessageId() != null || this.resumeMembershipAction == null) ? this.parsedData.getMessageId() : "label_confirm_paused_membership";
    }

    public final String getUserMessageText() {
        String string;
        String userMessage = getUserMessage();
        return (userMessage == null || (string = this.stringProvider.getString(userMessage)) == null) ? "" : string;
    }

    public final void onReceiveFallbackData(String str) {
        StringField emvco3dsDeviceDataResponseFallback;
        if (str == null || (emvco3dsDeviceDataResponseFallback = this.parsedData.getEmvco3dsDeviceDataResponseFallback()) == null) {
            return;
        }
        emvco3dsDeviceDataResponseFallback.setValue(str);
    }

    public final String buildDeviceDataCollectionFallbackUrl(String str) {
        C8632dsu.c((Object) str, "");
        return this.emvcoDataService.buildDeviceDataCollectionFallbackUrl(str);
    }

    public final void submit() {
        ConfirmParsedData confirmParsedData = this.parsedData;
        ActionField resumeMembershipAction = confirmParsedData.getResumeMembershipAction();
        if (resumeMembershipAction == null && (resumeMembershipAction = confirmParsedData.getUpiStartMembershipAction()) == null) {
            resumeMembershipAction = confirmParsedData.getNextAction();
        }
        AbstractNetworkViewModel2.performAction$default(this, resumeMembershipAction, this.lifecycleData.getSubmit(), null, 4, null);
    }
}
