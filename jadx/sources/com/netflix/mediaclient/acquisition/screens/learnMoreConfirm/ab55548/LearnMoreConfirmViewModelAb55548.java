package com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.session.action.Navigate;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.Request;
import com.netflix.mediaclient.acquisition.lib.Response;
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
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import o.C0894Gr;
import o.C8168dfL;
import o.C8572dqo;
import o.C8632dsu;
import o.KX;
import o.aMX;

/* loaded from: classes3.dex */
public class LearnMoreConfirmViewModelAb55548 extends AbstractNetworkViewModel2 {
    public static final int $stable = 8;
    private final MutableLiveData<Pair<KX, List<KX>>> _phoneInputCountries;
    private final MutableLiveData<Boolean> _phoneInputValid;
    private final String copyUrl;
    private final String displaySignUpUrl;
    private final String email;
    private final ActionField goToNonMemberHomeAction;
    private final String headerText;
    private final boolean isRecognizedFormerMember;
    private final LearnMoreConfirm55548ParsedData parsedData;
    private final LiveData<Pair<KX, List<KX>>> phoneInputCountriesLiveData;
    private final LiveData<Boolean> phoneInputValidLiveData;
    private final boolean showCopyLink;
    private final boolean showGoToNonMemberHomeAction;
    private final boolean showOpenEmailClientButton;
    private final boolean showOpenEmailClientLink;
    private final boolean showPhoneNumberInput;
    private final boolean showPlanUnavailableDialog;
    private final boolean showReceivedEmailExperience;
    private final boolean showTextSentToast;
    private final String subHeaderText;
    private final Theme theme;

    public final String getCopyUrl() {
        return this.copyUrl;
    }

    public final String getDisplaySignUpUrl() {
        return this.displaySignUpUrl;
    }

    public String getEmail() {
        return this.email;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final LiveData<Pair<KX, List<KX>>> getPhoneInputCountriesLiveData() {
        return this.phoneInputCountriesLiveData;
    }

    public final LiveData<Boolean> getPhoneInputValidLiveData() {
        return this.phoneInputValidLiveData;
    }

    public final boolean getShowCopyLink() {
        return this.showCopyLink;
    }

    public final boolean getShowGoToNonMemberHomeAction() {
        return this.showGoToNonMemberHomeAction;
    }

    public final boolean getShowOpenEmailClientButton() {
        return this.showOpenEmailClientButton;
    }

    public final boolean getShowOpenEmailClientLink() {
        return this.showOpenEmailClientLink;
    }

    public final boolean getShowPhoneNumberInput() {
        return this.showPhoneNumberInput;
    }

    public final boolean getShowPlanUnavailableDialog() {
        return this.showPlanUnavailableDialog;
    }

    public boolean getShowReceivedEmailExperience() {
        return this.showReceivedEmailExperience;
    }

    public final boolean getShowTextSentToast() {
        return this.showTextSentToast;
    }

    public final String getSubHeaderText() {
        return this.subHeaderText;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LearnMoreConfirmViewModelAb55548(StringProvider stringProvider, LearnMoreConfirm55548ParsedData learnMoreConfirm55548ParsedData, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        Theme theme;
        String string;
        String c;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) learnMoreConfirm55548ParsedData, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        this.parsedData = learnMoreConfirm55548ParsedData;
        boolean isRecognizedFormerMember = learnMoreConfirm55548ParsedData.isRecognizedFormerMember();
        this.isRecognizedFormerMember = isRecognizedFormerMember;
        this.showReceivedEmailExperience = learnMoreConfirm55548ParsedData.getRecentlyRegistered();
        this.email = learnMoreConfirm55548ParsedData.getEmail();
        this.showPlanUnavailableDialog = learnMoreConfirm55548ParsedData.getShowPlanUnavailableDialog();
        this.copyUrl = learnMoreConfirm55548ParsedData.getCopySignUpUrl();
        this.displaySignUpUrl = learnMoreConfirm55548ParsedData.getDisplaySignUpUrl();
        this.showOpenEmailClientButton = learnMoreConfirm55548ParsedData.getShowOpenEmailClientButton();
        this.showOpenEmailClientLink = learnMoreConfirm55548ParsedData.getShowOpenEmailClientLink();
        boolean z = learnMoreConfirm55548ParsedData.getPhoneNumberField() != null;
        this.showPhoneNumberInput = z;
        boolean z2 = learnMoreConfirm55548ParsedData.getCopySignUpUrl() != null;
        this.showCopyLink = z2;
        this.showTextSentToast = learnMoreConfirm55548ParsedData.getDisplayPhoneNumber() != null;
        this.showGoToNonMemberHomeAction = learnMoreConfirm55548ParsedData.getGoToNonMemberHomeAction() != null;
        this.goToNonMemberHomeAction = learnMoreConfirm55548ParsedData.getGoToNonMemberHomeAction();
        String theme2 = learnMoreConfirm55548ParsedData.getTheme();
        if (C8632dsu.c((Object) theme2, (Object) "Dark")) {
            theme = Theme.b;
        } else {
            theme = C8632dsu.c((Object) theme2, (Object) "Light") ? Theme.a : Theme.a;
        }
        this.theme = theme;
        if (getShowReceivedEmailExperience()) {
            if (z2) {
                string = stringProvider.getString(R.string.learn_more_confirm_header_new_member_check_browser_or_email);
            } else if (z) {
                string = stringProvider.getString(R.string.learn_more_confirm_header_new_member_check_text_or_email);
            } else {
                string = stringProvider.getString(R.string.learn_more_confirm_header_new_member_check_email);
            }
        } else if (isRecognizedFormerMember) {
            string = stringProvider.getString(R.string.learn_more_confirm_header_former_member);
        } else {
            string = stringProvider.getString(R.string.learn_more_confirm_header_never_member_finish_signing_up);
        }
        this.headerText = string;
        if (isRecognizedFormerMember) {
            c = C8168dfL.c(stringProvider.getString(R.string.learn_more_confirm_subheader_former_member)).toString();
        } else {
            if (z2) {
                c = stringProvider.getFormatter(R.string.learn_more_confirm_subheader_new_member_check_link_or_email).d(SignupConstants.Field.EMAIL, getEmail()).c();
            } else if (learnMoreConfirm55548ParsedData.getDisplayPhoneNumber() != null) {
                c = stringProvider.getFormatter(R.string.learn_more_confirm_subheader_new_member_sent_text).d(SignupConstants.Field.PHONE_NUMBER, learnMoreConfirm55548ParsedData.getDisplayPhoneNumber()).d(SignupConstants.Field.EMAIL, getEmail()).c();
            } else if (z) {
                c = stringProvider.getFormatter(R.string.learn_more_confirm_subheader_new_member_check_text_or_email).d(SignupConstants.Field.EMAIL, getEmail()).c();
            } else {
                c = stringProvider.getFormatter(R.string.learn_more_confirm_subheader_new_member_check_email).d(SignupConstants.Field.EMAIL, getEmail()).c();
            }
            C8632dsu.d((Object) c);
        }
        this.subHeaderText = c;
        MutableLiveData<Pair<KX, List<KX>>> mutableLiveData = new MutableLiveData<>();
        this._phoneInputCountries = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(Boolean.FALSE);
        this._phoneInputValid = mutableLiveData2;
        this.phoneInputCountriesLiveData = mutableLiveData;
        this.phoneInputValidLiveData = mutableLiveData2;
        if (z) {
            signupNetworkManager.fetchPhoneCodes(new aMX() { // from class: com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmViewModelAb55548$$ExternalSyntheticLambda0
                @Override // o.aMX
                public final void onDataFetched(MoneyballData moneyballData, Status status, int i) {
                    LearnMoreConfirmViewModelAb55548._init_$lambda$3(LearnMoreConfirmViewModelAb55548.this, moneyballData, status, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(LearnMoreConfirmViewModelAb55548 learnMoreConfirmViewModelAb55548, MoneyballData moneyballData, Status status, int i) {
        PhoneCodesData phoneCodesData;
        int d;
        C8632dsu.c((Object) learnMoreConfirmViewModelAb55548, "");
        if (moneyballData == null || (phoneCodesData = moneyballData.getPhoneCodesData()) == null) {
            return;
        }
        List<PhoneCode> phoneCodes = phoneCodesData.getPhoneCodes();
        d = C8572dqo.d(phoneCodes, 10);
        ArrayList arrayList = new ArrayList(d);
        for (PhoneCode phoneCode : phoneCodes) {
            arrayList.add(new KX(phoneCode.getId(), phoneCode.getName(), phoneCode.getCode(), C0894Gr.d(phoneCode.getId())));
        }
        StringField countryCodeField = learnMoreConfirmViewModelAb55548.parsedData.getCountryCodeField();
        Object obj = null;
        Object value = countryCodeField != null ? countryCodeField.getValue() : null;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C8632dsu.c(((KX) next).c(), value)) {
                obj = next;
                break;
            }
        }
        learnMoreConfirmViewModelAb55548._phoneInputCountries.setValue(new Pair<>(obj, arrayList));
    }

    public final void submitPhoneNumberInputForm() {
        if (isCountryCodeValid() && isPhoneNumberValid()) {
            final Long startSession = Logger.INSTANCE.startSession(new Navigate(AppView.learnMoreConfirm, null, this.parsedData.getDisplayPhoneNumber() == null ? CommandValue.SendTextCommand : CommandValue.ResendCommand, null));
            performAction(this.parsedData.getTextSignUpLinkAction(), new MutableLiveData<>(), new NetworkRequestResponseListener() { // from class: com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmViewModelAb55548$submitPhoneNumberInputForm$1
                @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
                public void onBeforeNetworkAction(Request request) {
                    C8632dsu.c((Object) request, "");
                }

                @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
                public void onAfterNetworkAction(Response response) {
                    C8632dsu.c((Object) response, "");
                    if (!response.isValidState()) {
                        Logger.INSTANCE.endSession(startSession);
                    } else {
                        ExtLogger.INSTANCE.failedAction(startSession, response.getResErrorKey());
                    }
                }
            });
        }
    }

    public final void updatePhoneNumber(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        StringField countryCodeField = this.parsedData.getCountryCodeField();
        if (countryCodeField != null) {
            countryCodeField.setValue(str);
        }
        StringField phoneNumberField = this.parsedData.getPhoneNumberField();
        if (phoneNumberField != null) {
            phoneNumberField.setValue(str2);
        }
        this._phoneInputValid.setValue(Boolean.valueOf(isCountryCodeValid() && isPhoneNumberValid()));
    }

    private final boolean isCountryCodeValid() {
        StringField countryCodeField = this.parsedData.getCountryCodeField();
        return countryCodeField != null && countryCodeField.isValid();
    }

    private final boolean isPhoneNumberValid() {
        StringField phoneNumberField = this.parsedData.getPhoneNumberField();
        return phoneNumberField != null && phoneNumberField.isValid();
    }

    public final void submitGoToNonMemberHomeAction() {
        AbstractNetworkViewModel2.performAction$default(this, this.goToNonMemberHomeAction, new MutableLiveData(), null, 4, null);
    }
}
