package com.netflix.mediaclient.acquisition.components.paymentInfo;

import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class PaymentInfoViewModel {
    public static final int $stable = 8;
    private final PaymentInfoParsedData parsedData;
    private final StringProvider stringProvider;

    public PaymentInfoViewModel(PaymentInfoParsedData paymentInfoParsedData, StringProvider stringProvider) {
        C8632dsu.c((Object) paymentInfoParsedData, "");
        C8632dsu.c((Object) stringProvider, "");
        this.parsedData = paymentInfoParsedData;
        this.stringProvider = stringProvider;
    }

    public final String getSelectedMop() {
        String mopType = this.parsedData.getMopType();
        if (mopType != null) {
            switch (mopType.hashCode()) {
                case -1987883123:
                    if (mopType.equals(SignupConstants.PaymentMethod.UPI_PAYMENT_OPTION)) {
                        return formatUpiText();
                    }
                    break;
                case -1273151282:
                    if (mopType.equals(SignupConstants.PaymentMethod.CREDIT_CARD)) {
                        return formatCreditCardText();
                    }
                    break;
                case -467543528:
                    if (mopType.equals(SignupConstants.PaymentMethod.DCB)) {
                        return formatDCBDebitText();
                    }
                    break;
                case 84810048:
                    if (mopType.equals(SignupConstants.PaymentMethod.DE_DEBIT)) {
                        return formatDEDebitText();
                    }
                    break;
                case 1470730568:
                    if (mopType.equals(SignupConstants.PaymentMethod.PAYPAL)) {
                        return formatPaypalText();
                    }
                    break;
                case 1669040245:
                    if (mopType.equals(SignupConstants.PaymentMethod.CO_DEBIT)) {
                        return formatCODebitText();
                    }
                    break;
                case 1763126160:
                    if (mopType.equals(SignupConstants.PaymentMethod.MOBILE_WALLET_OPTION)) {
                        return formatMobileWalletText();
                    }
                    break;
            }
        }
        return formatEmail();
    }

    public final String getUserDetails() {
        if (C8632dsu.c((Object) this.parsedData.getMopType(), (Object) SignupConstants.PaymentMethod.PAYPAL) && this.parsedData.getPaypalEmail() != null) {
            return this.parsedData.getPaypalEmail();
        }
        if (C8632dsu.c((Object) this.parsedData.getMopType(), (Object) SignupConstants.PaymentMethod.UPI_PAYMENT_OPTION) && this.parsedData.getUpiId() != null) {
            return this.parsedData.getUpiId();
        }
        if (this.parsedData.getFirstName() != null && this.parsedData.getLastName() != null) {
            String firstName = this.parsedData.getFirstName();
            String lastName = this.parsedData.getLastName();
            return firstName + " " + lastName;
        } else if (this.parsedData.getFirstName() != null) {
            return this.parsedData.getFirstName();
        } else {
            if (this.parsedData.getLastName() != null) {
                return this.parsedData.getLastName();
            }
            return null;
        }
    }

    private final String formatEmail() {
        return this.parsedData.getEmail();
    }

    private final String formatPaypalText() {
        return this.stringProvider.getString(R.string.label_paypalDisplayStringId);
    }

    private final String formatCreditCardText() {
        return this.stringProvider.getFormatter(R.string.card_type_ending).d(SignupConstants.Field.CARD_TYPE, this.parsedData.getCardType()).d(SignupConstants.Field.LAST_FOUR, this.parsedData.getLastFour()).c();
    }

    private final String formatDEDebitText() {
        return this.stringProvider.getFormatter(R.string.IBAN_ending).d(SignupConstants.Field.LAST_FOUR, this.parsedData.getLastFour()).c();
    }

    private final String formatCODebitText() {
        String bankName = this.parsedData.getBankName();
        String maskedAccountNumber = this.parsedData.getMaskedAccountNumber();
        return bankName + " " + maskedAccountNumber;
    }

    private final String formatDCBDebitText() {
        return this.stringProvider.getFormatter(R.string.label_payment_dcb_v2).d("CARRIER", this.parsedData.getPartnerDisplayName()).c();
    }

    private final String formatUpiText() {
        return this.stringProvider.getString(R.string.label_upiDisplayStringId);
    }

    private final String formatMobileWalletText() {
        return this.stringProvider.getFormatter(R.string.label_mobileWallet_rejoin).d("accountId", this.parsedData.getMaskedAccountNumber()).c();
    }
}
