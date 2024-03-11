package com.netflix.mediaclient.acquisition.components.tou;

import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.startMembershipButton.StartMembershipButtonViewModel;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import o.C1333Xq;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public abstract class TouViewModel {
    public static final int $stable = 8;
    private String ctaText;
    private final BooleanField hasAcceptedTermsOfUse;
    private final boolean isCheckboxVisible;
    private final boolean isVisible;
    private final TouParsedData parsedData;
    private final boolean requiresPaidTextInRestartCta;
    private final BooleanField rightOfWithdrawal;
    private final boolean shouldShowCashDisclaimer;
    private final boolean shouldShowMandateModificationTermOfUse;
    private final boolean showCardChainingDisclosureText;
    private final boolean showSchufaText;
    private final StringProvider stringProvider;
    private final String touDebitBankText;
    private final TouSettings touSettings;

    public final String getCtaText() {
        return this.ctaText;
    }

    public final BooleanField getHasAcceptedTermsOfUse() {
        return this.hasAcceptedTermsOfUse;
    }

    public final boolean getRequiresPaidTextInRestartCta() {
        return this.requiresPaidTextInRestartCta;
    }

    public final BooleanField getRightOfWithdrawal() {
        return this.rightOfWithdrawal;
    }

    public abstract String getRightOfWithdrawalText();

    public final boolean getShouldShowCashDisclaimer() {
        return this.shouldShowCashDisclaimer;
    }

    public final boolean getShouldShowMandateModificationTermOfUse() {
        return this.shouldShowMandateModificationTermOfUse;
    }

    public final boolean getShowCardChainingDisclosureText() {
        return this.showCardChainingDisclosureText;
    }

    public final boolean getShowSchufaText() {
        return this.showSchufaText;
    }

    public final String getTouDebitBankText() {
        return this.touDebitBankText;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final TouSettings getTouSettings() {
        return this.touSettings;
    }

    public abstract int getTouStringRes();

    public final boolean isCheckboxVisible() {
        return this.isCheckboxVisible;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setCtaText(String str) {
        C8632dsu.c((Object) str, "");
        this.ctaText = str;
    }

    public TouViewModel(StringProvider stringProvider, TouParsedData touParsedData, TouSettingsFactory touSettingsFactory, StartMembershipButtonViewModel startMembershipButtonViewModel, String str) {
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) touParsedData, "");
        C8632dsu.c((Object) touSettingsFactory, "");
        C8632dsu.c((Object) startMembershipButtonViewModel, "");
        this.stringProvider = stringProvider;
        this.parsedData = touParsedData;
        TouSettings createTouSettings = touSettingsFactory.createTouSettings(touParsedData.getRegion());
        this.touSettings = createTouSettings;
        this.ctaText = str == null ? startMembershipButtonViewModel.getText() : str;
        boolean z = false;
        boolean z2 = touParsedData.getHasAcceptedTermsOfUse() != null;
        this.isVisible = z2;
        this.isCheckboxVisible = z2 && createTouSettings.getShowCheckbox();
        this.shouldShowCashDisclaimer = touParsedData.getCashPaymentProvider() != null;
        this.showSchufaText = touParsedData.getShowSchufaText();
        this.showCardChainingDisclosureText = touParsedData.getShowCardChainingDisclosureText();
        this.touDebitBankText = stringProvider.getString(R.string.tou_debit_bank);
        this.hasAcceptedTermsOfUse = touParsedData.getHasAcceptedTermsOfUse();
        this.rightOfWithdrawal = touParsedData.getRightOfWithdrawal();
        if (createTouSettings != TouSettings.US && createTouSettings != TouSettings.RoW) {
            z = true;
        }
        this.requiresPaidTextInRestartCta = z;
        this.shouldShowMandateModificationTermOfUse = touParsedData.getShowMandateModificationTermOfUse();
    }

    public /* synthetic */ TouViewModel(StringProvider stringProvider, TouParsedData touParsedData, TouSettingsFactory touSettingsFactory, StartMembershipButtonViewModel startMembershipButtonViewModel, String str, int i, C8627dsp c8627dsp) {
        this(stringProvider, touParsedData, touSettingsFactory, startMembershipButtonViewModel, (i & 16) != 0 ? null : str);
    }

    public final String getText() {
        String str;
        C1333Xq d = this.stringProvider.getFormatter(getTouStringRes()).d("buttonText", this.ctaText).d(SignupConstants.Field.MIN_AGE, this.parsedData.getMinAge()).d("price", this.parsedData.isPreTax() ? this.stringProvider.getFormatter(R.string.label_price_preTax).d("price", this.parsedData.getPrice()).c() : this.parsedData.getPrice());
        String billingFrequency = this.parsedData.getBillingFrequency();
        if (billingFrequency != null) {
            str = billingFrequency.toLowerCase();
            C8632dsu.a(str, "");
        } else {
            str = null;
        }
        String c = d.d("planBillingFrequency", str).d("termsUrl", this.stringProvider.getString(R.string.terms_of_use_url)).d("privacyUrl", this.stringProvider.getString(R.string.privacy_policy_url)).c();
        C8632dsu.a(c, "");
        return c;
    }

    public final String getCashServiceFeeDisclaimer() {
        C1333Xq formatter = this.stringProvider.getFormatter(R.string.label_cashPayment_tou_serviceFee);
        String cashPaymentProvider = this.parsedData.getCashPaymentProvider();
        if (cashPaymentProvider == null) {
            cashPaymentProvider = "";
        }
        return formatter.d("paymentProvider", cashPaymentProvider).c();
    }

    public final String getCashNonRefundableDisclaimer() {
        C1333Xq formatter = this.stringProvider.getFormatter(R.string.label_cashPayment_tou_nonRefundable);
        String cashPaymentProviderBrandName = this.parsedData.getCashPaymentProviderBrandName();
        if (cashPaymentProviderBrandName == null && (cashPaymentProviderBrandName = this.parsedData.getCashPaymentProvider()) == null) {
            cashPaymentProviderBrandName = "";
        }
        return formatter.d("paymentProviderBrandName", cashPaymentProviderBrandName).c();
    }

    public final boolean isAccepted() {
        BooleanField hasAcceptedTermsOfUse = this.parsedData.getHasAcceptedTermsOfUse();
        if (hasAcceptedTermsOfUse != null) {
            return C8632dsu.c(hasAcceptedTermsOfUse.getValue(), Boolean.TRUE);
        }
        return false;
    }

    public final void setAccepted(boolean z) {
        BooleanField hasAcceptedTermsOfUse = this.parsedData.getHasAcceptedTermsOfUse();
        if (hasAcceptedTermsOfUse == null) {
            return;
        }
        hasAcceptedTermsOfUse.setValue(Boolean.valueOf(z));
    }

    public final boolean getRightOfWithdrawalAccepted() {
        BooleanField rightOfWithdrawal = this.parsedData.getRightOfWithdrawal();
        if (rightOfWithdrawal != null) {
            return C8632dsu.c(rightOfWithdrawal.getValue(), Boolean.TRUE);
        }
        return false;
    }

    public final void setRightOfWithdrawalAccepted(boolean z) {
        BooleanField rightOfWithdrawal = this.parsedData.getRightOfWithdrawal();
        if (rightOfWithdrawal == null) {
            return;
        }
        rightOfWithdrawal.setValue(Boolean.valueOf(z));
    }
}
