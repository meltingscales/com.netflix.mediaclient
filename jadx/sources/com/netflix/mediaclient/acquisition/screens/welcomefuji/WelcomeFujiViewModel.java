package com.netflix.mediaclient.acquisition.screens.welcomefuji;

import androidx.lifecycle.MutableLiveData;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.util.SignupMode;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes3.dex */
public class WelcomeFujiViewModel extends AbstractNetworkViewModel2 {
    public static final int $stable = 8;
    private final String ctaStringKey;
    private final String ctaText;
    private final FormViewEditTextViewModel emailEditTextViewModel;
    private final boolean isRecognizedFormerMember;
    private final boolean isRecognizedNeverMember;
    private final WelcomeFujiLifecycleData lifecycleData;
    private final ActionField nextAction;
    private final boolean nextActionGoesToWebView;
    private final WelcomeFujiParsedData parsedData;
    private final List<FujiCardParsedData> reggieCards;
    private final boolean showEmailTray;
    private final boolean showPlanFallback;
    private final boolean showPlanUnavailableDialog;
    private final StringProvider stringProvider;
    private final boolean useFormerMemberTray;

    public final String getCtaText() {
        return this.ctaText;
    }

    public final FormViewEditTextViewModel getEmailEditTextViewModel() {
        return this.emailEditTextViewModel;
    }

    public final ActionField getNextAction() {
        return this.nextAction;
    }

    public final boolean getNextActionGoesToWebView() {
        return this.nextActionGoesToWebView;
    }

    public final List<FujiCardParsedData> getReggieCards() {
        return this.reggieCards;
    }

    public boolean getShowEmailTray() {
        return this.showEmailTray;
    }

    public final boolean getShowPlanFallback() {
        return this.showPlanFallback;
    }

    public final boolean getShowPlanUnavailableDialog() {
        return this.showPlanUnavailableDialog;
    }

    public final boolean getUseFormerMemberTray() {
        return this.useFormerMemberTray;
    }

    public final boolean isRecognizedFormerMember() {
        return this.isRecognizedFormerMember;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFujiViewModel(StringProvider stringProvider, WelcomeFujiParsedData welcomeFujiParsedData, WelcomeFujiLifecycleData welcomeFujiLifecycleData, FormViewEditTextViewModel formViewEditTextViewModel, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        String neverMemberCtaStringKey;
        String string;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) welcomeFujiParsedData, "");
        C8632dsu.c((Object) welcomeFujiLifecycleData, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        this.stringProvider = stringProvider;
        this.parsedData = welcomeFujiParsedData;
        this.lifecycleData = welcomeFujiLifecycleData;
        this.emailEditTextViewModel = formViewEditTextViewModel;
        boolean isRecognizedFormerMember = welcomeFujiParsedData.isRecognizedFormerMember();
        this.isRecognizedFormerMember = isRecognizedFormerMember;
        boolean isRecognizedNeverMember = welcomeFujiParsedData.isRecognizedNeverMember();
        this.isRecognizedNeverMember = isRecognizedNeverMember;
        this.nextActionGoesToWebView = welcomeFujiParsedData.getNextActionGoesToWebView();
        ActionField nextAction = welcomeFujiParsedData.getNextAction();
        this.nextAction = nextAction;
        this.reggieCards = welcomeFujiParsedData.getReggieCards();
        this.showPlanUnavailableDialog = welcomeFujiParsedData.getShowPlanUnavailableDialog();
        this.showPlanFallback = welcomeFujiParsedData.getShowPlanFallback();
        this.showEmailTray = (formViewEditTextViewModel == null || welcomeFujiParsedData.getSaveEmailAction() == null || isRecognizedFormerMember || isRecognizedNeverMember) ? false : true;
        this.useFormerMemberTray = SignupMode.INSTANCE.isPlanSelectionAndConfirmMode(nextAction != null ? nextAction.getMode() : null);
        if (welcomeFujiParsedData.isRecognizedFormerMember()) {
            neverMemberCtaStringKey = welcomeFujiParsedData.getFormerMemberCtaStringKey();
        } else {
            neverMemberCtaStringKey = welcomeFujiParsedData.isRecognizedNeverMember() ? welcomeFujiParsedData.getNeverMemberCtaStringKey() : welcomeFujiParsedData.getDefaultCtaStringKey();
        }
        this.ctaStringKey = neverMemberCtaStringKey;
        this.ctaText = (neverMemberCtaStringKey == null || (string = stringProvider.getString(neverMemberCtaStringKey)) == null) ? stringProvider.getString(R.string.fuji_cta_get_started) : string;
    }

    public final MutableLiveData<Boolean> getFujiLoading() {
        return this.lifecycleData.getNextActionLoading();
    }

    public void performNextRequest() {
        if (this.parsedData.getResumeMembershipAction() != null) {
            AbstractNetworkViewModel2.performAction$default(this, this.parsedData.getResumeMembershipAction(), getFujiLoading(), null, 4, null);
        } else {
            AbstractNetworkViewModel2.performAction$default(this, this.parsedData.getNextAction(), getFujiLoading(), null, 4, null);
        }
    }

    public final boolean isFormValid() {
        FormViewEditTextViewModel formViewEditTextViewModel = this.emailEditTextViewModel;
        return !((formViewEditTextViewModel == null || formViewEditTextViewModel.isValid()) ? false : true);
    }
}
