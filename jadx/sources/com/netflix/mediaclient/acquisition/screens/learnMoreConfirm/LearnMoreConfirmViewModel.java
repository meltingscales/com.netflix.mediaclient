package com.netflix.mediaclient.acquisition.screens.learnMoreConfirm;

import android.text.Spanned;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import o.C8168dfL;
import o.C8632dsu;

/* loaded from: classes3.dex */
public class LearnMoreConfirmViewModel extends AbstractNetworkViewModel2 {
    public static final int $stable = 8;
    private final String email;
    private final String headerText;
    private final boolean isRecognizedFormerMember;
    private final boolean showPlanUnavailableDialog;
    private final boolean showReceivedEmailExperience;
    private final CharSequence subHeaderText;

    public String getEmail() {
        return this.email;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final boolean getShowPlanUnavailableDialog() {
        return this.showPlanUnavailableDialog;
    }

    public boolean getShowReceivedEmailExperience() {
        return this.showReceivedEmailExperience;
    }

    public final CharSequence getSubHeaderText() {
        return this.subHeaderText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LearnMoreConfirmViewModel(StringProvider stringProvider, LearnMoreConfirmParsedData learnMoreConfirmParsedData, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        String string;
        String string2;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) learnMoreConfirmParsedData, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        boolean isRecognizedFormerMember = learnMoreConfirmParsedData.isRecognizedFormerMember();
        this.isRecognizedFormerMember = isRecognizedFormerMember;
        this.showReceivedEmailExperience = learnMoreConfirmParsedData.getRecentlyRegistered();
        this.email = learnMoreConfirmParsedData.getEmail();
        this.showPlanUnavailableDialog = learnMoreConfirmParsedData.getShowPlanUnavailableDialog();
        if (getShowReceivedEmailExperience()) {
            string = stringProvider.getString(R.string.learn_more_confirm_header_new_member);
        } else if (isRecognizedFormerMember) {
            string = stringProvider.getString(R.string.learn_more_confirm_header_former_member);
        } else {
            string = stringProvider.getString(R.string.learn_more_confirm_header_never_member);
        }
        this.headerText = string;
        if (getShowReceivedEmailExperience()) {
            string2 = stringProvider.getFormatter(R.string.learn_more_confirm_subheader_new_member).d(SignupConstants.Field.EMAIL, getEmail()).c();
        } else if (isRecognizedFormerMember) {
            string2 = stringProvider.getString(R.string.learn_more_confirm_subheader_former_member);
        } else {
            string2 = stringProvider.getString(R.string.learn_more_confirm_subheader_never_member);
        }
        Spanned c = C8168dfL.c(string2);
        C8632dsu.a(c, "");
        this.subHeaderText = c;
    }
}
