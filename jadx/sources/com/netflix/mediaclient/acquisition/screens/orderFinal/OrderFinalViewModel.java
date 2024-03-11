package com.netflix.mediaclient.acquisition.screens.orderFinal;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.service.webclient.model.leafs.PhoneCode;
import com.netflix.mediaclient.service.webclient.model.leafs.PhoneCodesData;
import java.util.ArrayList;
import java.util.List;
import o.C1333Xq;
import o.C8168dfL;
import o.C8569dql;
import o.C8572dqo;
import o.C8632dsu;
import o.C8691duz;
import o.aMX;

/* loaded from: classes3.dex */
public class OrderFinalViewModel extends AbstractNetworkViewModel2 {
    public static final int $stable = 8;
    private final String accountNumber;
    private final String address;
    private final String confirmFallback;
    private String countryCode;
    private final MutableLiveData<String> countryCodeLiveData;
    private final String email;
    private final String giftAmount;
    private final OrderFinalLifecycleData lifecycleData;
    private final OrderFinalParsedData parsedData;
    private final String paymentInformation;
    private PhoneCodesData phoneCodesData;
    private final boolean shouldShowPhoneNumber;
    private final StringProvider stringProvider;

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final MutableLiveData<String> getCountryCodeLiveData() {
        return this.countryCodeLiveData;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getGiftAmount() {
        return this.giftAmount;
    }

    protected final OrderFinalParsedData getParsedData() {
        return this.parsedData;
    }

    public final String getPaymentInformation() {
        return this.paymentInformation;
    }

    public final PhoneCodesData getPhoneCodesData() {
        return this.phoneCodesData;
    }

    public final boolean getShouldShowPhoneNumber() {
        return this.shouldShowPhoneNumber;
    }

    protected final StringProvider getStringProvider() {
        return this.stringProvider;
    }

    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    public final void setPhoneCodesData(PhoneCodesData phoneCodesData) {
        this.phoneCodesData = phoneCodesData;
    }

    public final boolean showEmail() {
        return this.email != null;
    }

    public final boolean showGiftAmount() {
        return this.giftAmount != null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderFinalViewModel(StringProvider stringProvider, OrderFinalParsedData orderFinalParsedData, OrderFinalLifecycleData orderFinalLifecycleData, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        String accountNumberDisplay;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) orderFinalParsedData, "");
        C8632dsu.c((Object) orderFinalLifecycleData, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        this.stringProvider = stringProvider;
        this.parsedData = orderFinalParsedData;
        this.lifecycleData = orderFinalLifecycleData;
        this.confirmFallback = stringProvider.getString(R.string.orderfinal_fallback_simplicity);
        this.giftAmount = orderFinalParsedData.getGiftAmount();
        this.email = orderFinalParsedData.getEmail();
        if (orderFinalParsedData.getCardType() != null && orderFinalParsedData.getAccountNumberDisplay() != null) {
            accountNumberDisplay = orderFinalParsedData.getCardType() + " " + orderFinalParsedData.getAccountNumberDisplay();
        } else {
            accountNumberDisplay = orderFinalParsedData.getAccountNumberDisplay();
        }
        this.paymentInformation = accountNumberDisplay;
        this.shouldShowPhoneNumber = (orderFinalParsedData.getCountryIsoCode() == null || orderFinalParsedData.getMobilePhone() == null) ? false : true;
        this.address = orderFinalParsedData.getAddress();
        this.accountNumber = orderFinalParsedData.getAccountNumberDisplay();
        this.countryCodeLiveData = new MutableLiveData<>();
    }

    public final MutableLiveData<Boolean> getOrderFinalLoading() {
        return this.lifecycleData.getNextActionLoading();
    }

    public final void performContinueAction(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        performAction(this.parsedData.getContinueAction(), getOrderFinalLoading(), networkRequestResponseListener);
    }

    public final String getTitle() {
        return this.stringProvider.getString(R.string.orderfinal_title);
    }

    public String getSignupConfirmationMessage() {
        return TextUtils.isEmpty(this.parsedData.getEmail()) ? this.confirmFallback : this.stringProvider.getFormatter(R.string.orderfinal_email_body_text).d(SignupConstants.Field.EMAIL, this.parsedData.getEmail()).c();
    }

    public final String getAutoContinueMessage() {
        if (this.parsedData.getGiftAmount() == null && this.parsedData.getHasLcfmOffer()) {
            return this.stringProvider.getString(R.string.orderfinal_auto_continue_simplicity_lcfm);
        }
        return null;
    }

    public final String getDirectDebitMessage() {
        C1333Xq formatter;
        C1333Xq d;
        String userMessage = this.parsedData.getUserMessage();
        if (userMessage == null || (formatter = this.stringProvider.getFormatter(userMessage)) == null || (d = formatter.d("DAYS", 6)) == null) {
            return null;
        }
        return d.c();
    }

    public final boolean showPaymentInformation() {
        return (this.paymentInformation == null || isDeDirectDebit()) ? false : true;
    }

    private final boolean isDeDirectDebit() {
        return C8632dsu.c((Object) this.parsedData.getMopType(), (Object) SignupConstants.MopType.EU_DIRECT_DEBIT);
    }

    public final String getPlanNameText() {
        C1333Xq d = this.stringProvider.getFormatter(R.string.label_standard_plan_name).d("planName", this.parsedData.getLocalizedPlanName());
        if (d != null) {
            return d.c();
        }
        return null;
    }

    public String getPlanPriceText() {
        if (C8168dfL.g(this.parsedData.getPlanPrice())) {
            return null;
        }
        return this.stringProvider.getFormatter(R.string.orderfinal_plan_price_nft).d(SignupConstants.Field.PLAN_PRICE, this.parsedData.getPlanPrice()).c();
    }

    public final boolean showPlanText() {
        return (getPlanNameText() == null || getPlanPriceText() == null || isDeDirectDebit()) ? false : true;
    }

    public final String getFullName() {
        String firstName = this.parsedData.getFirstName();
        if (firstName == null) {
            firstName = "";
        }
        String lastName = this.parsedData.getLastName();
        String str = lastName != null ? lastName : "";
        return firstName + " " + str;
    }

    public final boolean showName() {
        boolean g;
        if (isDeDirectDebit()) {
            g = C8691duz.g(getFullName());
            if (!g) {
                return true;
            }
        }
        return false;
    }

    public final boolean showAddress() {
        return isDeDirectDebit() && this.address != null;
    }

    public final boolean showAccountNumber() {
        return isDeDirectDebit() && this.parsedData.getAccountNumberDisplay() != null;
    }

    public final String getPhoneBodyText() {
        return this.stringProvider.getString(showSmsConsent() ? R.string.orderfinal_sms_consent_body : R.string.orderfinal_phone_body);
    }

    public final void updateSmsConsent(boolean z) {
        BooleanField smsConsent = this.parsedData.getSmsConsent();
        if (smsConsent == null) {
            return;
        }
        smsConsent.setValue(Boolean.valueOf(z));
    }

    public final String[] getPhoneCodesArray() {
        List<PhoneCode> phoneCodes;
        int d;
        PhoneCodesData phoneCodesData = this.phoneCodesData;
        if (phoneCodesData == null || (phoneCodes = phoneCodesData.getPhoneCodes()) == null) {
            return null;
        }
        d = C8572dqo.d(phoneCodes, 10);
        ArrayList arrayList = new ArrayList(d);
        for (PhoneCode phoneCode : phoneCodes) {
            arrayList.add(phoneCode.getName());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final void updateSelectedCountry(String str) {
        List<PhoneCode> i;
        C8632dsu.c((Object) str, "");
        PhoneCodesData phoneCodesData = this.phoneCodesData;
        if (phoneCodesData == null || (i = phoneCodesData.getPhoneCodes()) == null) {
            i = C8569dql.i();
        }
        for (PhoneCode phoneCode : i) {
            if (C8632dsu.c((Object) phoneCode.getName(), (Object) str)) {
                StringField countryIsoCode = this.parsedData.getCountryIsoCode();
                if (countryIsoCode != null) {
                    countryIsoCode.setValue(phoneCode.getId());
                }
                this.countryCodeLiveData.setValue(phoneCode.getId());
            }
        }
    }

    public final void updatePhoneNumber(String str) {
        C8632dsu.c((Object) str, "");
        StringField mobilePhone = this.parsedData.getMobilePhone();
        if (mobilePhone == null) {
            return;
        }
        mobilePhone.setValue(str);
    }

    public final boolean showSmsConsent() {
        return this.parsedData.getSmsConsent() != null;
    }

    public String getPhoneEntryTitle() {
        return this.stringProvider.getString(R.string.orderfinal_setup_password_recovery_heading);
    }

    public final void fetchPhoneCodes() {
        getSignupNetworkManager().fetchPhoneCodes(new aMX() { // from class: com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalViewModel$$ExternalSyntheticLambda0
            @Override // o.aMX
            public final void onDataFetched(MoneyballData moneyballData, Status status, int i) {
                OrderFinalViewModel.fetchPhoneCodes$lambda$1(OrderFinalViewModel.this, moneyballData, status, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchPhoneCodes$lambda$1(OrderFinalViewModel orderFinalViewModel, MoneyballData moneyballData, Status status, int i) {
        boolean a;
        C8632dsu.c((Object) orderFinalViewModel, "");
        if (moneyballData == null || moneyballData.getPhoneCodesData() == null) {
            return;
        }
        PhoneCodesData phoneCodesData = moneyballData.getPhoneCodesData();
        orderFinalViewModel.phoneCodesData = phoneCodesData;
        List<PhoneCode> phoneCodes = phoneCodesData != null ? phoneCodesData.getPhoneCodes() : null;
        if (phoneCodes != null) {
            for (PhoneCode phoneCode : phoneCodes) {
                StringField countryIsoCode = orderFinalViewModel.parsedData.getCountryIsoCode();
                String str = (String) (countryIsoCode != null ? countryIsoCode.getValue() : null);
                if (str != null) {
                    a = C8691duz.a(str, phoneCode.getId(), true);
                    if (a) {
                        orderFinalViewModel.countryCode = phoneCode.getFormattedCountryCode();
                        orderFinalViewModel.countryCodeLiveData.setValue(str);
                        return;
                    }
                }
            }
        }
    }
}
