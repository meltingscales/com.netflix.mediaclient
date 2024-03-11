package com.netflix.mediaclient.acquisition.screens.verifyAge;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.TextViewCompat;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.expandingDropDownView.ExpandingDropDownView;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.form2.NumberViewModel;
import com.netflix.mediaclient.acquisition.components.form2.ageVerify.BirthYearEditText;
import com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntry;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthDateEditText;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthDateViewModel;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthMonthEditText;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthMonthViewModel;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.databinding.FragmentVerifyAgeBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.C1204Sr;
import o.C8632dsu;
import o.C9834xU;
import o.dpR;
import o.drM;
import o.drO;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class VerifyAgeFragment extends Hilt_VerifyAgeFragment {
    public static final int $stable = 8;
    private final AppView appView = AppView.ageVerificationDialog;
    private FragmentVerifyAgeBinding binding;
    private boolean birthYearWasValidAtSomePoint;
    @Inject
    public FormDataObserverFactory formDataObserverFactory;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    public VerifyAgeViewModel viewModel;

    public static /* synthetic */ void getBirthDateDropDown$annotations() {
    }

    public static /* synthetic */ void getBirthMonthDropDown$annotations() {
    }

    public static /* synthetic */ void getBirthYearEditText$annotations() {
    }

    public static /* synthetic */ void getDobErrorText$annotations() {
    }

    public static /* synthetic */ void getMaturityPinEntry$annotations() {
    }

    public static /* synthetic */ void getScrollView$annotations() {
    }

    public static /* synthetic */ void getSkipVerifyExpandingView$annotations() {
    }

    public static /* synthetic */ void getSkipVerifySubheader$annotations() {
    }

    public static /* synthetic */ void getVerifyAgeExpandingView$annotations() {
    }

    public static /* synthetic */ void getVerifyAgeHeader$annotations() {
    }

    public static /* synthetic */ void getVerifyAgeSubheader$annotations() {
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

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public final void setViewModel(VerifyAgeViewModel verifyAgeViewModel) {
        C8632dsu.c((Object) verifyAgeViewModel, "");
        this.viewModel = verifyAgeViewModel;
    }

    public final VerifyAgeViewModel getViewModel() {
        VerifyAgeViewModel verifyAgeViewModel = this.viewModel;
        if (verifyAgeViewModel != null) {
            return verifyAgeViewModel;
        }
        C8632dsu.d("");
        return null;
    }

    private final FragmentVerifyAgeBinding requireBinding() {
        FragmentVerifyAgeBinding fragmentVerifyAgeBinding = this.binding;
        if (fragmentVerifyAgeBinding != null) {
            return fragmentVerifyAgeBinding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public final View getScrollView() {
        NestedScrollView nestedScrollView = requireBinding().scrollView;
        C8632dsu.a(nestedScrollView, "");
        return nestedScrollView;
    }

    public final SignupBannerView getWarningView() {
        SignupBannerView signupBannerView = requireBinding().warningView;
        C8632dsu.a(signupBannerView, "");
        return signupBannerView;
    }

    public final ExpandingDropDownView getVerifyAgeExpandingView() {
        ExpandingDropDownView expandingDropDownView = requireBinding().verifyAgeExpandingView;
        C8632dsu.a(expandingDropDownView, "");
        return expandingDropDownView;
    }

    public final ExpandingDropDownView getSkipVerifyExpandingView() {
        ExpandingDropDownView expandingDropDownView = requireBinding().skipVerifyExpandingView;
        C8632dsu.a(expandingDropDownView, "");
        return expandingDropDownView;
    }

    public final BirthMonthEditText getBirthMonthDropDown() {
        View findViewById = requireBinding().getRoot().findViewById(R.id.birthMonthDropdown);
        C8632dsu.a(findViewById, "");
        return (BirthMonthEditText) findViewById;
    }

    public final BirthDateEditText getBirthDateDropDown() {
        View findViewById = requireBinding().getRoot().findViewById(R.id.birthDateDropdown);
        C8632dsu.a(findViewById, "");
        return (BirthDateEditText) findViewById;
    }

    public final BirthYearEditText getBirthYearEditText() {
        View findViewById = requireBinding().getRoot().findViewById(R.id.birthYearEditText);
        C8632dsu.a(findViewById, "");
        return (BirthYearEditText) findViewById;
    }

    public final View getDobErrorText() {
        View findViewById = requireBinding().getRoot().findViewById(R.id.dobErrorText);
        C8632dsu.a(findViewById, "");
        return findViewById;
    }

    public final MaturityPinEntry getMaturityPinEntry() {
        View findViewById = requireBinding().getRoot().findViewById(R.id.maturityPinEntry);
        C8632dsu.a(findViewById, "");
        return (MaturityPinEntry) findViewById;
    }

    public final TextView getVerifyAgeHeader() {
        C1204Sr c1204Sr = requireBinding().verifyAgeHeader;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final TextView getVerifyAgeSubheader() {
        View findViewById = requireBinding().getRoot().findViewById(R.id.verifyAgeSubheader);
        C8632dsu.a(findViewById, "");
        return (TextView) findViewById;
    }

    public final TextView getSkipVerifySubheader() {
        View findViewById = requireBinding().getRoot().findViewById(R.id.skipVerifySubheader);
        C8632dsu.a(findViewById, "");
        return (TextView) findViewById;
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

    private final NetflixSignupButton getSkipCta() {
        View findViewById = requireBinding().getRoot().findViewById(R.id.skipCta);
        C8632dsu.a(findViewById, "");
        return (NetflixSignupButton) findViewById;
    }

    private final NetflixSignupButton getVerifyAgeCta() {
        View findViewById = requireBinding().getRoot().findViewById(R.id.verifyAgeCta);
        C8632dsu.a(findViewById, "");
        return (NetflixSignupButton) findViewById;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.verifyAge.Hilt_VerifyAgeFragment, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(getMoneyballEntryPoint().verifyAgeViewModelInitializer().createVerifyAgeViewModel(this));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = FragmentVerifyAgeBinding.inflate(layoutInflater, viewGroup, false);
        LinearLayout root = requireBinding().getRoot();
        C8632dsu.a(root, "");
        return root;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        initViews();
        initClickListeners();
        initText();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDobValidation() {
        boolean isDobValid = getViewModel().isDobValid();
        getDobErrorText().setVisibility(isDobValid ? 4 : 0);
        getBirthDateDropDown().setValidationState(isDobValid);
        getBirthMonthDropDown().setValidationState(isDobValid);
        getBirthYearEditText().setValidationState(isDobValid);
    }

    private final void initViews() {
        drO<dpR> dro = new drO<dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.verifyAge.VerifyAgeFragment$initViews$validationListener$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BirthDateViewModel birthDateViewModel;
                boolean z;
                NumberViewModel birthYearViewModel = VerifyAgeFragment.this.getViewModel().getBirthYearViewModel();
                if (birthYearViewModel != null && birthYearViewModel.isValid()) {
                    VerifyAgeFragment.this.birthYearWasValidAtSomePoint = true;
                }
                BirthMonthViewModel birthMonthViewModel = VerifyAgeFragment.this.getViewModel().getBirthMonthViewModel();
                if (birthMonthViewModel == null || !birthMonthViewModel.isValid() || (birthDateViewModel = VerifyAgeFragment.this.getViewModel().getBirthDateViewModel()) == null || !birthDateViewModel.isValid()) {
                    return;
                }
                z = VerifyAgeFragment.this.birthYearWasValidAtSomePoint;
                if (z) {
                    VerifyAgeFragment.this.showDobValidation();
                }
            }
        };
        getBirthMonthDropDown().bind(getViewModel().getBirthMonthViewModel(), dro);
        getBirthDateDropDown().bind(getViewModel().getBirthDateViewModel(), dro);
        getBirthYearEditText().bind(getViewModel().getBirthYearViewModel(), dro);
        getMaturityPinEntry().bind(getViewModel().getMaturityPinEntryViewModel());
        TextViewCompat.setTextAppearance(getSkipCta().getButton(), R.style.SignupCtaButton_SkipVerifyAge);
        TextViewCompat.setTextAppearance(getVerifyAgeCta().getButton(), R.style.SignupCtaButton_OnboardingTweaks);
        getSkipCta().updateTextAndButtonColor(C9834xU.c.b, C9834xU.c.q);
    }

    private final void initText() {
        getVerifyAgeHeader().setText(getViewModel().getHeaderText());
        getVerifyAgeSubheader().setText(getViewModel().getVerifyAgeSubheaderText());
        getSkipVerifySubheader().setText(getViewModel().getSkipVerifyExpandingSubheaderText());
        ExpandingDropDownView verifyAgeExpandingView = getVerifyAgeExpandingView();
        String verifyAgeExpandingHeaderText = getViewModel().getVerifyAgeExpandingHeaderText();
        C8632dsu.a(verifyAgeExpandingHeaderText, "");
        verifyAgeExpandingView.setHeaderText(verifyAgeExpandingHeaderText);
        ExpandingDropDownView skipVerifyExpandingView = getSkipVerifyExpandingView();
        String skipVerifyExpandingHeaderText = getViewModel().getSkipVerifyExpandingHeaderText();
        C8632dsu.a(skipVerifyExpandingHeaderText, "");
        skipVerifyExpandingView.setHeaderText(skipVerifyExpandingHeaderText);
    }

    private final void initClickListeners() {
        getVerifyAgeExpandingView().setHeaderClickListener(new drM<View, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.verifyAge.VerifyAgeFragment$initClickListeners$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(View view) {
                invoke2(view);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C8632dsu.c((Object) view, "");
                if (VerifyAgeFragment.this.getVerifyAgeExpandingView().isExpanded()) {
                    return;
                }
                VerifyAgeFragment.this.getVerifyAgeExpandingView().toggleExpand();
                if (VerifyAgeFragment.this.getSkipVerifyExpandingView().isExpanded()) {
                    VerifyAgeFragment.this.getSkipVerifyExpandingView().toggleExpand();
                }
            }
        });
        getSkipVerifyExpandingView().setHeaderClickListener(new drM<View, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.verifyAge.VerifyAgeFragment$initClickListeners$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(View view) {
                invoke2(view);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C8632dsu.c((Object) view, "");
                if (VerifyAgeFragment.this.getSkipVerifyExpandingView().isExpanded()) {
                    return;
                }
                VerifyAgeFragment.this.getSkipVerifyExpandingView().toggleExpand();
                if (VerifyAgeFragment.this.getVerifyAgeExpandingView().isExpanded()) {
                    VerifyAgeFragment.this.getVerifyAgeExpandingView().toggleExpand();
                }
            }
        });
        getSkipCta().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.verifyAge.VerifyAgeFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyAgeFragment.initClickListeners$lambda$1(VerifyAgeFragment.this, view);
            }
        });
        getVerifyAgeCta().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.verifyAge.VerifyAgeFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyAgeFragment.initClickListeners$lambda$2(VerifyAgeFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$1(VerifyAgeFragment verifyAgeFragment, View view) {
        C8632dsu.c((Object) verifyAgeFragment, "");
        verifyAgeFragment.getViewModel().performSkipAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$2(VerifyAgeFragment verifyAgeFragment, View view) {
        C8632dsu.c((Object) verifyAgeFragment, "");
        if (verifyAgeFragment.getViewModel().isFormValid()) {
            verifyAgeFragment.getViewModel().performVerifyAction();
        } else {
            verifyAgeFragment.showDobValidation();
        }
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupLoadingObserver() {
        getViewModel().getSkipLoading().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createButtonLoadingObserver(getSkipCta()));
        getViewModel().getVerifyAgeLoading().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createButtonLoadingObserver(getVerifyAgeCta()));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupWarningObserver() {
        getViewModel().getDisplayedError().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createInlineWarningObserver(getWarningView(), getScrollView()));
    }
}
