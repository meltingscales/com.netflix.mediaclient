package com.netflix.mediaclient.acquisition.screens.confirm;

import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesViewModel;
import com.netflix.mediaclient.acquisition.components.paymentInfo.PaymentInfoViewModel;
import com.netflix.mediaclient.acquisition.components.planInfo.PlanInfoViewModel;
import com.netflix.mediaclient.acquisition.components.startMembershipButton.StartMembershipButtonViewModel;
import com.netflix.mediaclient.acquisition.components.tou.TouPaymentViewModel;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class ConfirmParsedData {
    public static final int $stable = 8;
    private final String email;
    private StringField emvco3dsAuthenticationWindowSize;
    private final StringField emvco3dsDeviceDataResponseFallback;
    private final String firstName;
    private final String giftAmount;
    private final boolean isRecognizedFormerMember;
    private final KoreaCheckBoxesViewModel koreaCheckBoxesViewModel;
    private final String messageId;
    private final ActionField nextAction;
    private final PaymentInfoViewModel paymentInfoViewModel;
    private final String paypalEmail;
    private final PlanInfoViewModel planInfoViewModel;
    private final ActionField resumeMembershipAction;
    private final boolean showCvvField;
    private final StartMembershipButtonViewModel startMembershipButtonViewModel;
    private final TouPaymentViewModel touViewModel;
    private final String upiId;
    private final ActionField upiStartMembershipAction;

    public final ActionField component1() {
        return this.nextAction;
    }

    public final String component10() {
        return this.messageId;
    }

    public final StringField component11() {
        return this.emvco3dsAuthenticationWindowSize;
    }

    public final StringField component12() {
        return this.emvco3dsDeviceDataResponseFallback;
    }

    public final StartMembershipButtonViewModel component13() {
        return this.startMembershipButtonViewModel;
    }

    public final KoreaCheckBoxesViewModel component14() {
        return this.koreaCheckBoxesViewModel;
    }

    public final TouPaymentViewModel component15() {
        return this.touViewModel;
    }

    public final PlanInfoViewModel component16() {
        return this.planInfoViewModel;
    }

    public final PaymentInfoViewModel component17() {
        return this.paymentInfoViewModel;
    }

    public final String component18() {
        return this.giftAmount;
    }

    public final ActionField component2() {
        return this.resumeMembershipAction;
    }

    public final ActionField component3() {
        return this.upiStartMembershipAction;
    }

    public final boolean component4() {
        return this.isRecognizedFormerMember;
    }

    public final String component5() {
        return this.firstName;
    }

    public final String component6() {
        return this.email;
    }

    public final String component7() {
        return this.paypalEmail;
    }

    public final String component8() {
        return this.upiId;
    }

    public final boolean component9() {
        return this.showCvvField;
    }

    public final ConfirmParsedData copy(ActionField actionField, ActionField actionField2, ActionField actionField3, boolean z, String str, String str2, String str3, String str4, boolean z2, String str5, StringField stringField, StringField stringField2, StartMembershipButtonViewModel startMembershipButtonViewModel, KoreaCheckBoxesViewModel koreaCheckBoxesViewModel, TouPaymentViewModel touPaymentViewModel, PlanInfoViewModel planInfoViewModel, PaymentInfoViewModel paymentInfoViewModel, String str6) {
        C8632dsu.c((Object) startMembershipButtonViewModel, "");
        C8632dsu.c((Object) koreaCheckBoxesViewModel, "");
        C8632dsu.c((Object) touPaymentViewModel, "");
        C8632dsu.c((Object) planInfoViewModel, "");
        C8632dsu.c((Object) paymentInfoViewModel, "");
        return new ConfirmParsedData(actionField, actionField2, actionField3, z, str, str2, str3, str4, z2, str5, stringField, stringField2, startMembershipButtonViewModel, koreaCheckBoxesViewModel, touPaymentViewModel, planInfoViewModel, paymentInfoViewModel, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfirmParsedData) {
            ConfirmParsedData confirmParsedData = (ConfirmParsedData) obj;
            return C8632dsu.c(this.nextAction, confirmParsedData.nextAction) && C8632dsu.c(this.resumeMembershipAction, confirmParsedData.resumeMembershipAction) && C8632dsu.c(this.upiStartMembershipAction, confirmParsedData.upiStartMembershipAction) && this.isRecognizedFormerMember == confirmParsedData.isRecognizedFormerMember && C8632dsu.c((Object) this.firstName, (Object) confirmParsedData.firstName) && C8632dsu.c((Object) this.email, (Object) confirmParsedData.email) && C8632dsu.c((Object) this.paypalEmail, (Object) confirmParsedData.paypalEmail) && C8632dsu.c((Object) this.upiId, (Object) confirmParsedData.upiId) && this.showCvvField == confirmParsedData.showCvvField && C8632dsu.c((Object) this.messageId, (Object) confirmParsedData.messageId) && C8632dsu.c(this.emvco3dsAuthenticationWindowSize, confirmParsedData.emvco3dsAuthenticationWindowSize) && C8632dsu.c(this.emvco3dsDeviceDataResponseFallback, confirmParsedData.emvco3dsDeviceDataResponseFallback) && C8632dsu.c(this.startMembershipButtonViewModel, confirmParsedData.startMembershipButtonViewModel) && C8632dsu.c(this.koreaCheckBoxesViewModel, confirmParsedData.koreaCheckBoxesViewModel) && C8632dsu.c(this.touViewModel, confirmParsedData.touViewModel) && C8632dsu.c(this.planInfoViewModel, confirmParsedData.planInfoViewModel) && C8632dsu.c(this.paymentInfoViewModel, confirmParsedData.paymentInfoViewModel) && C8632dsu.c((Object) this.giftAmount, (Object) confirmParsedData.giftAmount);
        }
        return false;
    }

    public final String getEmail() {
        return this.email;
    }

    public final StringField getEmvco3dsAuthenticationWindowSize() {
        return this.emvco3dsAuthenticationWindowSize;
    }

    public final StringField getEmvco3dsDeviceDataResponseFallback() {
        return this.emvco3dsDeviceDataResponseFallback;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getGiftAmount() {
        return this.giftAmount;
    }

    public final KoreaCheckBoxesViewModel getKoreaCheckBoxesViewModel() {
        return this.koreaCheckBoxesViewModel;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final ActionField getNextAction() {
        return this.nextAction;
    }

    public final PaymentInfoViewModel getPaymentInfoViewModel() {
        return this.paymentInfoViewModel;
    }

    public final String getPaypalEmail() {
        return this.paypalEmail;
    }

    public final PlanInfoViewModel getPlanInfoViewModel() {
        return this.planInfoViewModel;
    }

    public final ActionField getResumeMembershipAction() {
        return this.resumeMembershipAction;
    }

    public final boolean getShowCvvField() {
        return this.showCvvField;
    }

    public final StartMembershipButtonViewModel getStartMembershipButtonViewModel() {
        return this.startMembershipButtonViewModel;
    }

    public final TouPaymentViewModel getTouViewModel() {
        return this.touViewModel;
    }

    public final String getUpiId() {
        return this.upiId;
    }

    public final ActionField getUpiStartMembershipAction() {
        return this.upiStartMembershipAction;
    }

    public int hashCode() {
        ActionField actionField = this.nextAction;
        int hashCode = actionField == null ? 0 : actionField.hashCode();
        ActionField actionField2 = this.resumeMembershipAction;
        int hashCode2 = actionField2 == null ? 0 : actionField2.hashCode();
        ActionField actionField3 = this.upiStartMembershipAction;
        int hashCode3 = actionField3 == null ? 0 : actionField3.hashCode();
        int hashCode4 = Boolean.hashCode(this.isRecognizedFormerMember);
        String str = this.firstName;
        int hashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.email;
        int hashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.paypalEmail;
        int hashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.upiId;
        int hashCode8 = str4 == null ? 0 : str4.hashCode();
        int hashCode9 = Boolean.hashCode(this.showCvvField);
        String str5 = this.messageId;
        int hashCode10 = str5 == null ? 0 : str5.hashCode();
        StringField stringField = this.emvco3dsAuthenticationWindowSize;
        int hashCode11 = stringField == null ? 0 : stringField.hashCode();
        StringField stringField2 = this.emvco3dsDeviceDataResponseFallback;
        int hashCode12 = stringField2 == null ? 0 : stringField2.hashCode();
        int hashCode13 = this.startMembershipButtonViewModel.hashCode();
        int hashCode14 = this.koreaCheckBoxesViewModel.hashCode();
        int hashCode15 = this.touViewModel.hashCode();
        int hashCode16 = this.planInfoViewModel.hashCode();
        int hashCode17 = this.paymentInfoViewModel.hashCode();
        String str6 = this.giftAmount;
        return (((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + (str6 == null ? 0 : str6.hashCode());
    }

    public final boolean isRecognizedFormerMember() {
        return this.isRecognizedFormerMember;
    }

    public final void setEmvco3dsAuthenticationWindowSize(StringField stringField) {
        this.emvco3dsAuthenticationWindowSize = stringField;
    }

    public String toString() {
        ActionField actionField = this.nextAction;
        ActionField actionField2 = this.resumeMembershipAction;
        ActionField actionField3 = this.upiStartMembershipAction;
        boolean z = this.isRecognizedFormerMember;
        String str = this.firstName;
        String str2 = this.email;
        String str3 = this.paypalEmail;
        String str4 = this.upiId;
        boolean z2 = this.showCvvField;
        String str5 = this.messageId;
        StringField stringField = this.emvco3dsAuthenticationWindowSize;
        StringField stringField2 = this.emvco3dsDeviceDataResponseFallback;
        StartMembershipButtonViewModel startMembershipButtonViewModel = this.startMembershipButtonViewModel;
        KoreaCheckBoxesViewModel koreaCheckBoxesViewModel = this.koreaCheckBoxesViewModel;
        TouPaymentViewModel touPaymentViewModel = this.touViewModel;
        PlanInfoViewModel planInfoViewModel = this.planInfoViewModel;
        PaymentInfoViewModel paymentInfoViewModel = this.paymentInfoViewModel;
        String str6 = this.giftAmount;
        return "ConfirmParsedData(nextAction=" + actionField + ", resumeMembershipAction=" + actionField2 + ", upiStartMembershipAction=" + actionField3 + ", isRecognizedFormerMember=" + z + ", firstName=" + str + ", email=" + str2 + ", paypalEmail=" + str3 + ", upiId=" + str4 + ", showCvvField=" + z2 + ", messageId=" + str5 + ", emvco3dsAuthenticationWindowSize=" + stringField + ", emvco3dsDeviceDataResponseFallback=" + stringField2 + ", startMembershipButtonViewModel=" + startMembershipButtonViewModel + ", koreaCheckBoxesViewModel=" + koreaCheckBoxesViewModel + ", touViewModel=" + touPaymentViewModel + ", planInfoViewModel=" + planInfoViewModel + ", paymentInfoViewModel=" + paymentInfoViewModel + ", giftAmount=" + str6 + ")";
    }

    public ConfirmParsedData(ActionField actionField, ActionField actionField2, ActionField actionField3, boolean z, String str, String str2, String str3, String str4, boolean z2, String str5, StringField stringField, StringField stringField2, StartMembershipButtonViewModel startMembershipButtonViewModel, KoreaCheckBoxesViewModel koreaCheckBoxesViewModel, TouPaymentViewModel touPaymentViewModel, PlanInfoViewModel planInfoViewModel, PaymentInfoViewModel paymentInfoViewModel, String str6) {
        C8632dsu.c((Object) startMembershipButtonViewModel, "");
        C8632dsu.c((Object) koreaCheckBoxesViewModel, "");
        C8632dsu.c((Object) touPaymentViewModel, "");
        C8632dsu.c((Object) planInfoViewModel, "");
        C8632dsu.c((Object) paymentInfoViewModel, "");
        this.nextAction = actionField;
        this.resumeMembershipAction = actionField2;
        this.upiStartMembershipAction = actionField3;
        this.isRecognizedFormerMember = z;
        this.firstName = str;
        this.email = str2;
        this.paypalEmail = str3;
        this.upiId = str4;
        this.showCvvField = z2;
        this.messageId = str5;
        this.emvco3dsAuthenticationWindowSize = stringField;
        this.emvco3dsDeviceDataResponseFallback = stringField2;
        this.startMembershipButtonViewModel = startMembershipButtonViewModel;
        this.koreaCheckBoxesViewModel = koreaCheckBoxesViewModel;
        this.touViewModel = touPaymentViewModel;
        this.planInfoViewModel = planInfoViewModel;
        this.paymentInfoViewModel = paymentInfoViewModel;
        this.giftAmount = str6;
    }
}
