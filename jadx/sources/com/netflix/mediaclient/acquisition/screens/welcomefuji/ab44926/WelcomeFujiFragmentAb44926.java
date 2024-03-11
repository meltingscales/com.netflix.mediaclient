package com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText;
import com.netflix.mediaclient.acquisition.components.form2.edittext.LastFormViewEditTextBinding;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.databinding.FragmentWelcomeFujiAb44926Binding;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.C8632dsu;
import o.C9687vB;
import o.aRR;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class WelcomeFujiFragmentAb44926 extends Hilt_WelcomeFujiFragmentAb44926 {
    public static final int $stable = 8;
    private FragmentWelcomeFujiAb44926Binding binding;
    @Inject
    public LastFormViewEditTextBinding lastFormViewEditTextBinding;

    public static /* synthetic */ void getEmail$annotations() {
    }

    public final void setLastFormViewEditTextBinding(LastFormViewEditTextBinding lastFormViewEditTextBinding) {
        C8632dsu.c((Object) lastFormViewEditTextBinding, "");
        this.lastFormViewEditTextBinding = lastFormViewEditTextBinding;
    }

    public final LastFormViewEditTextBinding getLastFormViewEditTextBinding() {
        LastFormViewEditTextBinding lastFormViewEditTextBinding = this.lastFormViewEditTextBinding;
        if (lastFormViewEditTextBinding != null) {
            return lastFormViewEditTextBinding;
        }
        C8632dsu.d("");
        return null;
    }

    private final FragmentWelcomeFujiAb44926Binding requireBinding() {
        FragmentWelcomeFujiAb44926Binding fragmentWelcomeFujiAb44926Binding = this.binding;
        if (fragmentWelcomeFujiAb44926Binding != null) {
            return fragmentWelcomeFujiAb44926Binding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public final FormViewEditText getEmail() {
        FormViewEditText formViewEditText = requireBinding().email;
        C8632dsu.a(formViewEditText, "");
        return formViewEditText;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = FragmentWelcomeFujiAb44926Binding.inflate(layoutInflater, viewGroup, false);
        ConstraintLayout root = requireBinding().getRoot();
        C8632dsu.a(root, "");
        return root;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment, com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        if (aRR.a.a()) {
            getEmail().bind(getViewModel().getEmailEditTextViewModel());
            getLastFormViewEditTextBinding().bind(getEmail(), true, this);
            Editable text = getEmail().getEditText().getText();
            C8632dsu.a(text, "");
            if (text.length() > 0) {
                shortenEmailHint();
            }
            getEmail().getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926.WelcomeFujiFragmentAb44926$$ExternalSyntheticLambda0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) {
                    WelcomeFujiFragmentAb44926.onViewCreated$lambda$1(WelcomeFujiFragmentAb44926.this, view2, z);
                }
            });
        } else {
            getEmail().setVisibility(8);
        }
        if (getEmail().getVisibility() == 8) {
            NetflixSignupButton netflixSignupButton = requireBinding().netflixSignupButtonWelcome;
            C8632dsu.a(netflixSignupButton, "");
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.signup_context_button_margin);
            ViewGroup.LayoutParams layoutParams = netflixSignupButton.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
                marginLayoutParams.topMargin = marginLayoutParams.topMargin;
                marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                marginLayoutParams.setMarginStart(C9687vB.c(marginLayoutParams));
                marginLayoutParams.setMarginEnd(C9687vB.b(marginLayoutParams));
                netflixSignupButton.requestLayout();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(WelcomeFujiFragmentAb44926 welcomeFujiFragmentAb44926, View view, boolean z) {
        C8632dsu.c((Object) welcomeFujiFragmentAb44926, "");
        if (z) {
            welcomeFujiFragmentAb44926.shortenEmailHint();
            return;
        }
        Editable text = welcomeFujiFragmentAb44926.getEmail().getEditText().getText();
        C8632dsu.a(text, "");
        if (text.length() == 0) {
            welcomeFujiFragmentAb44926.expandEmailHint();
        }
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment, com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    private final void shortenEmailHint() {
        getEmail().getInputLayout().setHint(getString(R.string.label_email));
    }

    private final void expandEmailHint() {
        getEmail().getInputLayout().setHint(getString(R.string.label_email_ab44926));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment, com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.components.form.FormSubmissionListener
    public void onFormSubmit() {
        if (aRR.a.a()) {
            if (getViewModel().isFormValid()) {
                getViewModel().performNextRequest();
                return;
            } else {
                getEmail().setShowValidationState(true);
                return;
            }
        }
        super.onFormSubmit();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment
    public WelcomeFujiViewModel createWelcomeFujiViewModel() {
        if (aRR.a.a()) {
            return getMoneyballEntryPoint().welcomeFujiViewModelInitializerAb44926().createWelcomeFujiViewModel((Fragment) this);
        }
        return super.createWelcomeFujiViewModel();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment
    public FujiViewPagerAdapterAb44926 createFujiViewPagerAdapter() {
        return new FujiViewPagerAdapterAb44926(this, getViewModel().getReggieCards());
    }
}
