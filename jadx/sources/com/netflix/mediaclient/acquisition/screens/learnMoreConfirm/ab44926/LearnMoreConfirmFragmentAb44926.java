package com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab44926;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.screens.Refreshable;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmViewModel;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import dagger.hilt.android.AndroidEntryPoint;
import o.C8168dfL;
import o.C8632dsu;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class LearnMoreConfirmFragmentAb44926 extends Hilt_LearnMoreConfirmFragmentAb44926 implements Refreshable {
    public static final int $stable = 0;
    private final int transitioningBackgroundColorRes = R.color.signup_grey96;

    public static /* synthetic */ void getAlternateInstructions$annotations() {
    }

    public static /* synthetic */ void getEmailField$annotations() {
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public int getTransitioningBackgroundColorRes() {
        return this.transitioningBackgroundColorRes;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.Refreshable
    public void onMoneyballDataRefreshed(MoneyballData moneyballData) {
    }

    public final TextView getEmailField() {
        View view = getView();
        if (view != null) {
            return (TextView) view.findViewById(R.id.learn_more_email);
        }
        return null;
    }

    public final TextView getAlternateInstructions() {
        View view = getView();
        if (view != null) {
            return (TextView) view.findViewById(R.id.alternate_instructions);
        }
        return null;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        return layoutInflater.inflate(getViewModel().getShowReceivedEmailExperience() ? R.layout.fragment_learn_more_confirm_ab44926 : R.layout.fragment_learn_more_confirm, viewGroup, false);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmFragment
    public void initViews() {
        if (getViewModel().getShowReceivedEmailExperience()) {
            TextView emailField = getEmailField();
            if (emailField == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            emailField.setText(getViewModel().getEmail());
            TextView alternateInstructions = getAlternateInstructions();
            if (alternateInstructions == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            alternateInstructions.setText(C8168dfL.c(getString(R.string.learn_more_alternate_instructions_ab44926)));
            return;
        }
        super.initViews();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmFragment
    public LearnMoreConfirmViewModel createLearnMoreConfirmViewModel() {
        return getMoneyballEntryPoint().learnMoreConfirmViewModelInitializer44926().createLearnMoreConfirmViewModel(this);
    }
}
