package com.netflix.mediaclient.acquisition.screens.registration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText;
import com.netflix.mediaclient.acquisition.components.form2.edittext.LastFormViewEditTextBinding;
import com.netflix.mediaclient.acquisition.components.heading.SignupHeadingView;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.databinding.RegistrationFragmentLayoutBinding;
import com.netflix.mediaclient.acquisition.databinding.RegistrationUserInputBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import javax.inject.Inject;
import o.C1204Sr;
import o.C1645aIz;
import o.C8168dfL;
import o.C8566dqi;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;
import o.C9696vK;
import o.C9834xU;
import o.InterfaceC8554dpx;
import o.dpB;
import o.dpR;
import o.drM;
import o.drO;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public class RegistrationFragment extends Hilt_RegistrationFragment {
    public static final int $stable = 8;
    private final AppView appView = AppView.registration;
    private RegistrationFragmentLayoutBinding binding;
    @Inject
    public FormDataObserverFactory formDataObserverFactory;
    private final InterfaceC8554dpx formViews$delegate;
    @Inject
    public LastFormViewEditTextBinding lastFormViewEditTextBinding;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    public RegistrationViewModel viewModel;

    public static /* synthetic */ void getEmailCheckbox$annotations() {
    }

    public static /* synthetic */ void getEmailFormView$annotations() {
    }

    public static /* synthetic */ void getFormViews$annotations() {
    }

    public static /* synthetic */ void getPasswordFormView$annotations() {
    }

    public static /* synthetic */ void getPipcConsentCheckbox$annotations() {
    }

    public static /* synthetic */ void getPipcConsentText$annotations() {
    }

    public static /* synthetic */ void getPipcErrorText$annotations() {
    }

    public static /* synthetic */ void getPipcHolder$annotations() {
    }

    public static /* synthetic */ void getReadOnlyEmailText$annotations() {
    }

    public static /* synthetic */ void getRegistrationButton$annotations() {
    }

    public static /* synthetic */ void getScrollView$annotations() {
    }

    public static /* synthetic */ void getSignupHeading$annotations() {
    }

    public static /* synthetic */ void getWarningView$annotations() {
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public AppView getAppView() {
        return this.appView;
    }

    public final void setFormDataObserverFactory(FormDataObserverFactory formDataObserverFactory) {
        C8632dsu.c((Object) formDataObserverFactory, "");
        this.formDataObserverFactory = formDataObserverFactory;
    }

    public final void setLastFormViewEditTextBinding(LastFormViewEditTextBinding lastFormViewEditTextBinding) {
        C8632dsu.c((Object) lastFormViewEditTextBinding, "");
        this.lastFormViewEditTextBinding = lastFormViewEditTextBinding;
    }

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public final void setViewModel(RegistrationViewModel registrationViewModel) {
        C8632dsu.c((Object) registrationViewModel, "");
        this.viewModel = registrationViewModel;
    }

    public RegistrationFragment() {
        InterfaceC8554dpx b;
        b = dpB.b(new drO<List<? extends FormViewEditText>>() { // from class: com.netflix.mediaclient.acquisition.screens.registration.RegistrationFragment$formViews$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public final List<? extends FormViewEditText> invoke() {
                List<? extends FormViewEditText> j;
                j = C8569dql.j(RegistrationFragment.this.getEmailFormView(), RegistrationFragment.this.getPasswordFormView());
                return j;
            }
        });
        this.formViews$delegate = b;
    }

    public final RegistrationViewModel getViewModel() {
        RegistrationViewModel registrationViewModel = this.viewModel;
        if (registrationViewModel != null) {
            return registrationViewModel;
        }
        C8632dsu.d("");
        return null;
    }

    public final FormDataObserverFactory getFormDataObserverFactory() {
        FormDataObserverFactory formDataObserverFactory = this.formDataObserverFactory;
        if (formDataObserverFactory != null) {
            return formDataObserverFactory;
        }
        C8632dsu.d("");
        return null;
    }

    public final SignupMoneyballEntryPoint getMoneyballEntryPoint() {
        SignupMoneyballEntryPoint signupMoneyballEntryPoint = this.moneyballEntryPoint;
        if (signupMoneyballEntryPoint != null) {
            return signupMoneyballEntryPoint;
        }
        C8632dsu.d("");
        return null;
    }

    public final LastFormViewEditTextBinding getLastFormViewEditTextBinding() {
        LastFormViewEditTextBinding lastFormViewEditTextBinding = this.lastFormViewEditTextBinding;
        if (lastFormViewEditTextBinding != null) {
            return lastFormViewEditTextBinding;
        }
        C8632dsu.d("");
        return null;
    }

    private final RegistrationFragmentLayoutBinding requireBinding() {
        RegistrationFragmentLayoutBinding registrationFragmentLayoutBinding = this.binding;
        if (registrationFragmentLayoutBinding != null) {
            return registrationFragmentLayoutBinding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public final View getScrollView() {
        ScrollView scrollView = requireBinding().scrollView;
        C8632dsu.a(scrollView, "");
        return scrollView;
    }

    private final SignupBannerView getUserMessage() {
        SignupBannerView signupBannerView = requireBinding().userMessage;
        C8632dsu.a(signupBannerView, "");
        return signupBannerView;
    }

    public final SignupBannerView getWarningView() {
        SignupBannerView signupBannerView = requireBinding().warningView;
        C8632dsu.a(signupBannerView, "");
        return signupBannerView;
    }

    public final List<FormViewEditText> getFormViews() {
        return (List) this.formViews$delegate.getValue();
    }

    private final RegistrationUserInputBinding getRegistrationUserInputBinding() {
        RegistrationUserInputBinding bind = RegistrationUserInputBinding.bind(requireBinding().getRoot());
        C8632dsu.a(bind, "");
        return bind;
    }

    public final FormViewEditText getEmailFormView() {
        FormViewEditText formViewEditText = getRegistrationUserInputBinding().email;
        C8632dsu.a(formViewEditText, "");
        return formViewEditText;
    }

    public final FormViewEditText getPasswordFormView() {
        FormViewEditText formViewEditText = getRegistrationUserInputBinding().password;
        C8632dsu.a(formViewEditText, "");
        return formViewEditText;
    }

    public final SignupHeadingView getSignupHeading() {
        SignupHeadingView signupHeadingView = requireBinding().signupHeading;
        C8632dsu.a(signupHeadingView, "");
        return signupHeadingView;
    }

    public final NetflixSignupButton getRegistrationButton() {
        NetflixSignupButton netflixSignupButton = requireBinding().registrationButton;
        C8632dsu.a(netflixSignupButton, "");
        return netflixSignupButton;
    }

    public final CheckBox getEmailCheckbox() {
        CheckBox checkBox = getRegistrationUserInputBinding().emailCheckbox;
        C8632dsu.a(checkBox, "");
        return checkBox;
    }

    public final CheckBox getPipcConsentCheckbox() {
        CheckBox checkBox = getRegistrationUserInputBinding().pipcConsentCheckbox;
        C8632dsu.a(checkBox, "");
        return checkBox;
    }

    public final TextView getPipcConsentText() {
        C1204Sr c1204Sr = getRegistrationUserInputBinding().pipcConsentText;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final View getPipcHolder() {
        ConstraintLayout constraintLayout = getRegistrationUserInputBinding().pipcConsentHolder;
        C8632dsu.a(constraintLayout, "");
        return constraintLayout;
    }

    public final View getPipcErrorText() {
        C1204Sr c1204Sr = getRegistrationUserInputBinding().pipcErrorMessage;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final TextView getReadOnlyEmailText() {
        C1204Sr c1204Sr = requireBinding().registrationReadOnly.readOnlyEmailText;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.registration.Hilt_RegistrationFragment, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(createViewModel());
    }

    public RegistrationViewModel createViewModel() {
        return getMoneyballEntryPoint().registrationViewModelInitializer().createRegistrationViewModel(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = RegistrationFragmentLayoutBinding.inflate(layoutInflater, viewGroup, false);
        return requireBinding().getRoot();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        initViews();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    private final void initViews() {
        C1645aIz.a(this, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.registration.RegistrationFragment$initViews$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                invoke2(serviceManager);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                RegistrationFragment.this.initForm();
                RegistrationFragment.this.initReadOnlyReg();
                RegistrationFragment.this.initSignupHeading();
                RegistrationFragment.this.initUserMessage();
                RegistrationFragment.this.initWarningView();
                RegistrationFragment.this.initCTAButton();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initSignupHeading() {
        String d;
        List e;
        d = C8576dqs.d(getViewModel().getConsumptionOnlySubheaders(), "\n", null, null, 0, null, null, 62, null);
        SignupHeadingView signupHeading = getSignupHeading();
        String consumptionOnlyHeader = getViewModel().getConsumptionOnlyHeader();
        e = C8566dqi.e(d);
        SignupHeadingView.setStrings$default(signupHeading, null, consumptionOnlyHeader, null, e, 4, null);
        getSignupHeading().startAlignText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initUserMessage() {
        String userMessageText = getViewModel().getUserMessageText();
        if (userMessageText != null) {
            getUserMessage().setText(userMessageText);
        }
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.components.form.FormSubmissionListener
    public void onFormSubmit() {
        super.onFormSubmit();
        if (getViewModel().isFormValid()) {
            getViewModel().performRegister();
            return;
        }
        for (FormViewEditText formViewEditText : getFormViews()) {
            formViewEditText.setShowValidationState(true);
        }
        showPipcConsentValidationState();
    }

    private final void showPipcConsentValidationState() {
        if (getViewModel().isPipcConsentCheckboxVisible()) {
            getPipcConsentCheckbox().setActivated(true);
            getPipcErrorText().setVisibility(true ^ getViewModel().isPipcConsentValid() ? 0 : 8);
        }
    }

    private final boolean hasCheckboxes() {
        return getViewModel().getEmailPreferenceViewModel().isVisible();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initForm() {
        if (!getViewModel().isRegReadOnly()) {
            getEmailFormView().bind(getViewModel().getEmailEditTextViewModel());
            getPasswordFormView().bind(getViewModel().getPasswordEditTextViewModel());
            getLastFormViewEditTextBinding().bind(getPasswordFormView(), !hasCheckboxes(), this);
        } else {
            for (FormViewEditText formViewEditText : getFormViews()) {
                formViewEditText.setVisibility(8);
            }
        }
        if (getViewModel().getEmailPreferenceViewModel().isVisible()) {
            getEmailCheckbox().setVisibility(0);
            getEmailCheckbox().setChecked(getViewModel().getEmailPreferenceViewModel().isChecked());
            getEmailCheckbox().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.netflix.mediaclient.acquisition.screens.registration.RegistrationFragment$$ExternalSyntheticLambda1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    RegistrationFragment.initForm$lambda$4(RegistrationFragment.this, compoundButton, z);
                }
            });
            getEmailCheckbox().setText(getViewModel().getEmailPreferenceViewModel().getUserFacingString());
        }
        if (getViewModel().isPipcConsentCheckboxVisible()) {
            TextView pipcConsentText = getPipcConsentText();
            Spanned c = C8168dfL.c(getViewModel().getPipcConsentCheckboxText());
            C8632dsu.d(c);
            C9696vK.c(pipcConsentText, (Spannable) c);
            getPipcConsentText().setMovementMethod(LinkMovementMethod.getInstance());
            getPipcHolder().setVisibility(0);
            getPipcConsentCheckbox().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.netflix.mediaclient.acquisition.screens.registration.RegistrationFragment$$ExternalSyntheticLambda2
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    RegistrationFragment.initForm$lambda$5(RegistrationFragment.this, compoundButton, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initForm$lambda$4(RegistrationFragment registrationFragment, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) registrationFragment, "");
        registrationFragment.getViewModel().getEmailPreferenceViewModel().setChecked(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initForm$lambda$5(RegistrationFragment registrationFragment, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) registrationFragment, "");
        registrationFragment.getViewModel().updatePipcConsent(z);
        registrationFragment.showPipcConsentValidationState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initWarningView() {
        if (getContext() != null) {
            getWarningView().setLinkColor(getResources().getColor(C9834xU.c.I));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initReadOnlyReg() {
        getReadOnlyEmailText().setVisibility(getViewModel().isRegReadOnly() ? 0 : 8);
        getReadOnlyEmailText().setText(getViewModel().getReadOnlyEmail());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initCTAButton() {
        getRegistrationButton().setText(getViewModel().getCtaButtonText());
        getRegistrationButton().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.registration.RegistrationFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationFragment.initCTAButton$lambda$7(RegistrationFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCTAButton$lambda$7(RegistrationFragment registrationFragment, View view) {
        C8632dsu.c((Object) registrationFragment, "");
        registrationFragment.onFormSubmit();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupWarningObserver() {
        getViewModel().getDisplayedError().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createInlineWarningObserver(getWarningView(), getScrollView()));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupLoadingObserver() {
        getViewModel().getRegisterLoading().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createButtonLoadingObserver(getRegistrationButton()));
    }
}
