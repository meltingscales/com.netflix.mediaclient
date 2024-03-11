package com.netflix.mediaclient.acquisition.screens.registration;

import androidx.lifecycle.MutableLiveData;
import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import java.util.ArrayList;
import java.util.List;
import o.C8566dqi;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;

/* loaded from: classes3.dex */
public class RegistrationViewModel extends AbstractNetworkViewModel2 {
    public static final int $stable = 8;
    private final String consumptionOnlyHeader;
    private final List<String> consumptionOnlySubheaders;
    private final String ctaButtonText;
    private final FormViewEditTextViewModel emailEditTextViewModel;
    private final EmailPreferenceViewModel emailPreferenceViewModel;
    private final boolean isPipcConsentCheckboxVisible;
    private final boolean isRegReadOnly;
    private final RegistrationLifecycleData lifecycleData;
    private final RegistrationParsedData parsedData;
    private final FormViewEditTextViewModel passwordEditTextViewModel;
    private final String pipcConsentCheckboxText;
    private final String readOnlyEmail;
    private final String registrationFormTitle;
    private final NetworkRequestResponseListener registrationListener;
    private final StringProvider stringProvider;
    private final List<String> subTitles;
    private final String userMessageText;

    public final String getConsumptionOnlyHeader() {
        return this.consumptionOnlyHeader;
    }

    public final List<String> getConsumptionOnlySubheaders() {
        return this.consumptionOnlySubheaders;
    }

    public final String getCtaButtonText() {
        return this.ctaButtonText;
    }

    public final FormViewEditTextViewModel getEmailEditTextViewModel() {
        return this.emailEditTextViewModel;
    }

    public final EmailPreferenceViewModel getEmailPreferenceViewModel() {
        return this.emailPreferenceViewModel;
    }

    protected final RegistrationParsedData getParsedData() {
        return this.parsedData;
    }

    public final FormViewEditTextViewModel getPasswordEditTextViewModel() {
        return this.passwordEditTextViewModel;
    }

    public final String getPipcConsentCheckboxText() {
        return this.pipcConsentCheckboxText;
    }

    public final String getReadOnlyEmail() {
        return this.readOnlyEmail;
    }

    public String getRegistrationFormTitle() {
        return this.registrationFormTitle;
    }

    protected final StringProvider getStringProvider() {
        return this.stringProvider;
    }

    public final List<String> getSubTitles() {
        return this.subTitles;
    }

    public final String getUserMessageText() {
        return this.userMessageText;
    }

    public final boolean isPipcConsentCheckboxVisible() {
        return this.isPipcConsentCheckboxVisible;
    }

    public final boolean isRegReadOnly() {
        return this.isRegReadOnly;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationViewModel(StringProvider stringProvider, SignupNetworkManager signupNetworkManager, NetworkRequestResponseListener networkRequestResponseListener, RegistrationLifecycleData registrationLifecycleData, RegistrationParsedData registrationParsedData, EmailPreferenceViewModel emailPreferenceViewModel, FormViewEditTextViewModel formViewEditTextViewModel, FormViewEditTextViewModel formViewEditTextViewModel2, ErrorMessageViewModel errorMessageViewModel) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        List j;
        List<String> G;
        List<String> e;
        String string;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) networkRequestResponseListener, "");
        C8632dsu.c((Object) registrationLifecycleData, "");
        C8632dsu.c((Object) registrationParsedData, "");
        C8632dsu.c((Object) emailPreferenceViewModel, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        this.stringProvider = stringProvider;
        this.registrationListener = networkRequestResponseListener;
        this.lifecycleData = registrationLifecycleData;
        this.parsedData = registrationParsedData;
        this.emailPreferenceViewModel = emailPreferenceViewModel;
        this.emailEditTextViewModel = formViewEditTextViewModel;
        this.passwordEditTextViewModel = formViewEditTextViewModel2;
        this.registrationFormTitle = stringProvider.getString(R.string.header_emailPassword);
        if (registrationParsedData.isReadOnly()) {
            j = C8566dqi.e(registrationParsedData.getSubtitleRegSubtitleKey());
        } else {
            j = C8569dql.j(registrationParsedData.getSubtitleValuePropKey(), registrationParsedData.getSubtitleValuePropSecondaryKey());
        }
        G = C8576dqs.G(j);
        ArrayList arrayList = new ArrayList();
        for (String str : G) {
            String string2 = this.stringProvider.getString(str);
            if (string2 != null) {
                arrayList.add(string2);
            }
        }
        this.subTitles = arrayList;
        this.consumptionOnlyHeader = this.stringProvider.getString(R.string.aco_registration_header);
        if (this.emailPreferenceViewModel.isVisible()) {
            e = C8566dqi.e(this.stringProvider.getString(R.string.aco_registration_email_opt_in_subheader));
        } else {
            e = C8566dqi.e(this.stringProvider.getString(R.string.aco_registration_subheader));
        }
        this.consumptionOnlySubheaders = e;
        String registerCtaKey = this.parsedData.getRegisterCtaKey();
        this.ctaButtonText = (registerCtaKey == null || (string = this.stringProvider.getString(registerCtaKey)) == null) ? this.stringProvider.getString(R.string.button_continue) : string;
        boolean isReadOnly = this.parsedData.isReadOnly();
        this.isRegReadOnly = isReadOnly;
        this.readOnlyEmail = isReadOnly ? this.parsedData.getInitialEmail() : null;
        this.isPipcConsentCheckboxVisible = this.parsedData.getPipcConsent() != null;
        this.pipcConsentCheckboxText = this.stringProvider.getFormatter(R.string.pipc_consent_text).d("privacyUrl", this.stringProvider.getString(R.string.privacy_policy_url)).c();
    }

    public final MutableLiveData<Boolean> getRegisterLoading() {
        return this.lifecycleData.getRedeemGiftCardLoading();
    }

    public final void performRegister() {
        performAction(this.parsedData.getRegisterAction(), getRegisterLoading(), this.registrationListener);
    }

    public final boolean isFormValid() {
        FormViewEditTextViewModel formViewEditTextViewModel;
        FormViewEditTextViewModel formViewEditTextViewModel2;
        return this.isRegReadOnly || (((formViewEditTextViewModel = this.emailEditTextViewModel) == null || formViewEditTextViewModel.isValid()) && (((formViewEditTextViewModel2 = this.passwordEditTextViewModel) == null || formViewEditTextViewModel2.isValid()) && isPipcConsentValid()));
    }

    public final boolean isPipcConsentValid() {
        if (this.isPipcConsentCheckboxVisible) {
            BooleanField pipcConsent = this.parsedData.getPipcConsent();
            if (pipcConsent != null) {
                return C8632dsu.c(pipcConsent.getValue(), Boolean.TRUE);
            }
            return false;
        }
        return true;
    }

    public final void updatePipcConsent(boolean z) {
        BooleanField pipcConsent = this.parsedData.getPipcConsent();
        if (pipcConsent == null) {
            return;
        }
        pipcConsent.setValue(Boolean.valueOf(z));
    }
}
