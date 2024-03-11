package com.netflix.mediaclient.acquisition.screens.passwordOnly;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText;
import com.netflix.mediaclient.acquisition.components.form2.edittext.LastFormViewEditTextBinding;
import com.netflix.mediaclient.acquisition.components.heading.SignupHeadingView;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.databinding.FragmentPasswordOnlyRegBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import javax.inject.Inject;
import o.C8566dqi;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class PasswordOnlyFragment extends Hilt_PasswordOnlyFragment {
    public static final int $stable = 8;
    private final AppView appView = AppView.registration;
    private FragmentPasswordOnlyRegBinding binding;
    @Inject
    public FormDataObserverFactory formDataObserverFactory;
    private final InterfaceC8554dpx formViews$delegate;
    @Inject
    public LastFormViewEditTextBinding lastFormViewEditTextBinding;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    @Inject
    public PasswordOnlyInteractionListener passwordOnlyInteractionListener;
    public PasswordOnlyViewModel viewModel;

    /* loaded from: classes3.dex */
    public interface PasswordOnlyInteractionListener {
        void logCtaClicked();
    }

    public static /* synthetic */ void getEmailFormView$annotations() {
    }

    public static /* synthetic */ void getFormViews$annotations() {
    }

    public static /* synthetic */ void getPasswordFormView$annotations() {
    }

    public static /* synthetic */ void getRegistrationButton$annotations() {
    }

    public static /* synthetic */ void getScrollView$annotations() {
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

    public final void setPasswordOnlyInteractionListener(PasswordOnlyInteractionListener passwordOnlyInteractionListener) {
        C8632dsu.c((Object) passwordOnlyInteractionListener, "");
        this.passwordOnlyInteractionListener = passwordOnlyInteractionListener;
    }

    public final void setViewModel(PasswordOnlyViewModel passwordOnlyViewModel) {
        C8632dsu.c((Object) passwordOnlyViewModel, "");
        this.viewModel = passwordOnlyViewModel;
    }

    public PasswordOnlyFragment() {
        InterfaceC8554dpx b;
        b = dpB.b(new drO<List<? extends FormViewEditText>>() { // from class: com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyFragment$formViews$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public final List<? extends FormViewEditText> invoke() {
                List<? extends FormViewEditText> j;
                j = C8569dql.j(PasswordOnlyFragment.this.getEmailFormView(), PasswordOnlyFragment.this.getPasswordFormView());
                return j;
            }
        });
        this.formViews$delegate = b;
    }

    public final PasswordOnlyViewModel getViewModel() {
        PasswordOnlyViewModel passwordOnlyViewModel = this.viewModel;
        if (passwordOnlyViewModel != null) {
            return passwordOnlyViewModel;
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

    public final PasswordOnlyInteractionListener getPasswordOnlyInteractionListener() {
        PasswordOnlyInteractionListener passwordOnlyInteractionListener = this.passwordOnlyInteractionListener;
        if (passwordOnlyInteractionListener != null) {
            return passwordOnlyInteractionListener;
        }
        C8632dsu.d("");
        return null;
    }

    private final FragmentPasswordOnlyRegBinding requireBinding() {
        FragmentPasswordOnlyRegBinding fragmentPasswordOnlyRegBinding = this.binding;
        if (fragmentPasswordOnlyRegBinding != null) {
            return fragmentPasswordOnlyRegBinding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public final View getScrollView() {
        ScrollView scrollView = requireBinding().scrollView;
        C8632dsu.a(scrollView, "");
        return scrollView;
    }

    public final SignupBannerView getWarningView() {
        SignupBannerView signupBannerView = requireBinding().warningView;
        C8632dsu.a(signupBannerView, "");
        return signupBannerView;
    }

    public final List<FormViewEditText> getFormViews() {
        return (List) this.formViews$delegate.getValue();
    }

    public final FormViewEditText getEmailFormView() {
        FormViewEditText formViewEditText = requireBinding().email;
        C8632dsu.a(formViewEditText, "");
        return formViewEditText;
    }

    public final FormViewEditText getPasswordFormView() {
        FormViewEditText formViewEditText = requireBinding().password;
        C8632dsu.a(formViewEditText, "");
        return formViewEditText;
    }

    private final SignupHeadingView getSignupHeading() {
        SignupHeadingView signupHeadingView = requireBinding().signupHeading;
        C8632dsu.a(signupHeadingView, "");
        return signupHeadingView;
    }

    public final NetflixSignupButton getRegistrationButton() {
        NetflixSignupButton netflixSignupButton = requireBinding().registrationButton;
        C8632dsu.a(netflixSignupButton, "");
        return netflixSignupButton;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.passwordOnly.Hilt_PasswordOnlyFragment, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(getMoneyballEntryPoint().passwordOnlyViewModelInitializer().createPasswordOnlyViewModel(this));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = FragmentPasswordOnlyRegBinding.inflate(layoutInflater, viewGroup, false);
        ScrollView root = requireBinding().getRoot();
        C8632dsu.a(root, "");
        return root;
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
        initForm();
        initSignupHeading();
        initWarningView();
        initCTAButton();
    }

    private final void initSignupHeading() {
        String d;
        List<String> e;
        d = C8576dqs.d(getViewModel().getSubTitles(), "\n", null, null, 0, null, null, 62, null);
        SignupHeadingView signupHeading = getSignupHeading();
        CharSequence stepsText = getViewModel().getStepsText();
        String header = getViewModel().getHeader();
        String header2 = getViewModel().getHeader2();
        e = C8566dqi.e(d);
        signupHeading.setStrings(stepsText, header, header2, e);
        getSignupHeading().removeHeader2MarginTop();
        getSignupHeading().startAlignText();
    }

    private final void initForm() {
        getEmailFormView().bind(getViewModel().getEmailEditTextViewModel());
        getPasswordFormView().bind(getViewModel().getPasswordEditTextViewModel());
        getLastFormViewEditTextBinding().bind(getPasswordFormView(), true, this);
    }

    private final void initWarningView() {
        Resources resources;
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null) {
            return;
        }
        getWarningView().setLinkColor(resources.getColor(C9834xU.c.I));
    }

    private final void initCTAButton() {
        NetflixSignupButton registrationButton = getRegistrationButton();
        registrationButton.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordOnlyFragment.initCTAButton$lambda$2(PasswordOnlyFragment.this, view);
            }
        });
        registrationButton.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCTAButton$lambda$2(PasswordOnlyFragment passwordOnlyFragment, View view) {
        C8632dsu.c((Object) passwordOnlyFragment, "");
        passwordOnlyFragment.getPasswordOnlyInteractionListener().logCtaClicked();
        passwordOnlyFragment.onFormSubmit();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.components.form.FormSubmissionListener
    public void onFormSubmit() {
        super.onFormSubmit();
        if (getViewModel().isFormValid()) {
            getViewModel().performLogin();
            return;
        }
        for (FormViewEditText formViewEditText : getFormViews()) {
            formViewEditText.setShowValidationState(true);
        }
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupWarningObserver() {
        getViewModel().getDisplayedError().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createInlineWarningObserver(getWarningView(), getScrollView()));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupLoadingObserver() {
        getViewModel().getLoginLoading().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createButtonLoadingObserver(getRegistrationButton()));
    }
}
