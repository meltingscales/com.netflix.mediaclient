package com.netflix.mediaclient.acquisition.screens.maturityPin;

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
import com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntry;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.databinding.FragmentMaturityPinBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.C1204Sr;
import o.C8632dsu;
import o.C9834xU;
import o.dpR;
import o.drM;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class MaturityPinFragment extends Hilt_MaturityPinFragment {
    public static final int $stable = 8;
    private final AppView appView = AppView.ageVerificationDialog;
    private FragmentMaturityPinBinding binding;
    @Inject
    public FormDataObserverFactory formDataObserverFactory;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    public MaturityPinViewModel viewModel;

    public static /* synthetic */ void getMaturityPinEntry$annotations() {
    }

    public static /* synthetic */ void getMaturityPinHeader$annotations() {
    }

    public static /* synthetic */ void getMaturityPinSubheader$annotations() {
    }

    public static /* synthetic */ void getScrollView$annotations() {
    }

    public static /* synthetic */ void getSkipVerifyExpandingView$annotations() {
    }

    public static /* synthetic */ void getVerifyAgeExpandingView$annotations() {
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

    public final void setViewModel(MaturityPinViewModel maturityPinViewModel) {
        C8632dsu.c((Object) maturityPinViewModel, "");
        this.viewModel = maturityPinViewModel;
    }

    public final MaturityPinViewModel getViewModel() {
        MaturityPinViewModel maturityPinViewModel = this.viewModel;
        if (maturityPinViewModel != null) {
            return maturityPinViewModel;
        }
        C8632dsu.d("");
        return null;
    }

    private final FragmentMaturityPinBinding requireBinding() {
        FragmentMaturityPinBinding fragmentMaturityPinBinding = this.binding;
        if (fragmentMaturityPinBinding != null) {
            return fragmentMaturityPinBinding;
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

    public final MaturityPinEntry getMaturityPinEntry() {
        View findViewById = requireBinding().getRoot().findViewById(R.id.maturityPinEntry);
        C8632dsu.a(findViewById, "");
        return (MaturityPinEntry) findViewById;
    }

    public final TextView getMaturityPinHeader() {
        C1204Sr c1204Sr = requireBinding().maturityPinHeader;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final TextView getMaturityPinSubheader() {
        View findViewById = requireBinding().getRoot().findViewById(R.id.maturityPinSubheader);
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

    @Override // com.netflix.mediaclient.acquisition.screens.maturityPin.Hilt_MaturityPinFragment, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(getMoneyballEntryPoint().maturityPinViewModelInitializer().createMaturityPinViewModel(this));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = FragmentMaturityPinBinding.inflate(layoutInflater, viewGroup, false);
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

    private final void initViews() {
        getMaturityPinEntry().bind(getViewModel().getMaturityPinEntryViewModel());
        TextViewCompat.setTextAppearance(getSkipCta().getButton(), R.style.SignupCtaButton_SkipVerifyAge);
        TextViewCompat.setTextAppearance(getVerifyAgeCta().getButton(), R.style.SignupCtaButton_OnboardingTweaks);
        getSkipCta().updateTextAndButtonColor(C9834xU.c.b, C9834xU.c.q);
    }

    private final void initClickListeners() {
        getVerifyAgeExpandingView().setHeaderClickListener(new drM<View, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.maturityPin.MaturityPinFragment$initClickListeners$1
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
                if (MaturityPinFragment.this.getVerifyAgeExpandingView().isExpanded()) {
                    return;
                }
                MaturityPinFragment.this.getVerifyAgeExpandingView().toggleExpand();
                if (MaturityPinFragment.this.getSkipVerifyExpandingView().isExpanded()) {
                    MaturityPinFragment.this.getSkipVerifyExpandingView().toggleExpand();
                }
            }
        });
        getSkipVerifyExpandingView().setHeaderClickListener(new drM<View, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.maturityPin.MaturityPinFragment$initClickListeners$2
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
                if (MaturityPinFragment.this.getSkipVerifyExpandingView().isExpanded()) {
                    return;
                }
                MaturityPinFragment.this.getSkipVerifyExpandingView().toggleExpand();
                if (MaturityPinFragment.this.getVerifyAgeExpandingView().isExpanded()) {
                    MaturityPinFragment.this.getVerifyAgeExpandingView().toggleExpand();
                }
            }
        });
        getSkipCta().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.maturityPin.MaturityPinFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaturityPinFragment.initClickListeners$lambda$1(MaturityPinFragment.this, view);
            }
        });
        getVerifyAgeCta().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.maturityPin.MaturityPinFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaturityPinFragment.initClickListeners$lambda$2(MaturityPinFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$1(MaturityPinFragment maturityPinFragment, View view) {
        C8632dsu.c((Object) maturityPinFragment, "");
        maturityPinFragment.getViewModel().performSkipAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$2(MaturityPinFragment maturityPinFragment, View view) {
        C8632dsu.c((Object) maturityPinFragment, "");
        maturityPinFragment.getViewModel().performMaturityPinAction();
    }

    private final void initText() {
        getMaturityPinHeader().setText(getViewModel().getPageHeader());
        getSkipVerifyExpandingView().getExpandingHeaderText().setText(getViewModel().getSkipPinHeader());
        getMaturityPinSubheader().setText(getViewModel().getMaturityPinSubheader());
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupLoadingObserver() {
        getViewModel().getMaturityPinActionLoading().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createButtonLoadingObserver(getVerifyAgeCta()));
        getViewModel().getSkipLoading().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createButtonLoadingObserver(getSkipCta()));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupWarningObserver() {
        getViewModel().getDisplayedError().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createInlineWarningObserver(getWarningView(), getScrollView()));
    }
}
