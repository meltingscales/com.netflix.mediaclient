package com.netflix.mediaclient.acquisition.screens.upi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.databinding.UpiWaitingFragmentBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.SignupBackType;
import com.netflix.mediaclient.acquisition.screens.Refreshable;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.rxkotlin.SubscribersKt;
import javax.inject.Inject;
import o.C1204Sr;
import o.C8632dsu;
import o.C9618tM;
import o.dpR;
import o.drM;
import o.drO;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class UpiWaitingFragment extends Hilt_UpiWaitingFragment implements Refreshable {
    public static final int $stable = 8;
    private final AppView appView = AppView.upiWaiting;
    private UpiWaitingFragmentBinding binding;
    @Inject
    public FormDataObserverFactory formDataObserverFactory;
    @Inject
    public InteractionListener interactionListener;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    private boolean shouldShowContinueButton;
    public UpiWaitingViewModel viewModel;
    public UpiWaitingViewModelInitializer viewModelInitializer;

    /* loaded from: classes3.dex */
    public interface InteractionListener {
        void logContinueClicked();

        void logContinueShown();
    }

    public static /* synthetic */ void getContinueButton$annotations() {
    }

    public static /* synthetic */ void getContinueContainerLayout$annotations() {
    }

    public static /* synthetic */ void getLoadingContainerLayout$annotations() {
    }

    public static /* synthetic */ void getLoadingMessageTextView$annotations() {
    }

    public static /* synthetic */ void getScrollView$annotations() {
    }

    public static /* synthetic */ void getTimerTextView$annotations() {
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public AppView getAppView() {
        return this.appView;
    }

    public final void setFormDataObserverFactory(FormDataObserverFactory formDataObserverFactory) {
        C8632dsu.c((Object) formDataObserverFactory, "");
        this.formDataObserverFactory = formDataObserverFactory;
    }

    public final void setInteractionListener(InteractionListener interactionListener) {
        C8632dsu.c((Object) interactionListener, "");
        this.interactionListener = interactionListener;
    }

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public final void setViewModel(UpiWaitingViewModel upiWaitingViewModel) {
        C8632dsu.c((Object) upiWaitingViewModel, "");
        this.viewModel = upiWaitingViewModel;
    }

    public final void setViewModelInitializer(UpiWaitingViewModelInitializer upiWaitingViewModelInitializer) {
        C8632dsu.c((Object) upiWaitingViewModelInitializer, "");
        this.viewModelInitializer = upiWaitingViewModelInitializer;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupLoadingObserver() {
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupWarningObserver() {
    }

    private final UpiWaitingFragmentBinding requireBinding() {
        UpiWaitingFragmentBinding upiWaitingFragmentBinding = this.binding;
        if (upiWaitingFragmentBinding != null) {
            return upiWaitingFragmentBinding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public final NetflixSignupButton getContinueButton() {
        NetflixSignupButton netflixSignupButton = requireBinding().continueButton;
        C8632dsu.a(netflixSignupButton, "");
        return netflixSignupButton;
    }

    public final LinearLayout getContinueContainerLayout() {
        LinearLayout linearLayout = requireBinding().continueContainerLayout;
        C8632dsu.a(linearLayout, "");
        return linearLayout;
    }

    public final LinearLayout getLoadingContainerLayout() {
        LinearLayout linearLayout = requireBinding().loadingContainerLayout;
        C8632dsu.a(linearLayout, "");
        return linearLayout;
    }

    public final C1204Sr getLoadingMessageTextView() {
        C1204Sr c1204Sr = requireBinding().loadingMessageTextView;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final ScrollView getScrollView() {
        ScrollView scrollView = requireBinding().scrollView;
        C8632dsu.a(scrollView, "");
        return scrollView;
    }

    public final C1204Sr getTimerTextView() {
        UpiWaitingFragmentBinding upiWaitingFragmentBinding = this.binding;
        if (upiWaitingFragmentBinding != null) {
            return upiWaitingFragmentBinding.timerTextView;
        }
        return null;
    }

    public final UpiWaitingViewModel getViewModel() {
        UpiWaitingViewModel upiWaitingViewModel = this.viewModel;
        if (upiWaitingViewModel != null) {
            return upiWaitingViewModel;
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

    public final UpiWaitingViewModelInitializer getViewModelInitializer() {
        UpiWaitingViewModelInitializer upiWaitingViewModelInitializer = this.viewModelInitializer;
        if (upiWaitingViewModelInitializer != null) {
            return upiWaitingViewModelInitializer;
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

    public final InteractionListener getInteractionListener() {
        InteractionListener interactionListener = this.interactionListener;
        if (interactionListener != null) {
            return interactionListener;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = UpiWaitingFragmentBinding.inflate(layoutInflater, viewGroup, false);
        return requireBinding().getRoot();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        initClickListeners();
        initTextListeners();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.upi.Hilt_UpiWaitingFragment, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModelInitializer(getMoneyballEntryPoint().upiWaitingViewModelInitializer());
        setViewModel(getViewModelInitializer().createUpiWaitingViewModel(this));
        getViewModel().pollNextAction();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.shouldShowContinueButton = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        C1204Sr timerTextView;
        super.onResume();
        if (this.shouldShowContinueButton && getContinueContainerLayout().getVisibility() == 8 && (timerTextView = getTimerTextView()) != null && timerTextView.getVisibility() == 0) {
            C1204Sr timerTextView2 = getTimerTextView();
            if (timerTextView2 != null) {
                timerTextView2.setVisibility(8);
            }
            getContinueContainerLayout().setVisibility(0);
            getInteractionListener().logContinueShown();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getViewModel().clearPollTimer();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractSignupFragment2, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public SignupBackType backBehavior() {
        return SignupBackType.INTERRUPT_WITH_DIALOG;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.Refreshable
    public void onMoneyballDataRefreshed(MoneyballData moneyballData) {
        getViewModel().updateParsedData(getViewModelInitializer().extractParsedData(moneyballData != null ? moneyballData.getFlowMode() : null));
        getViewModel().pollNextAction();
    }

    private final void initClickListeners() {
        getContinueButton().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpiWaitingFragment.initClickListeners$lambda$1(UpiWaitingFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$1(UpiWaitingFragment upiWaitingFragment, View view) {
        C8632dsu.c((Object) upiWaitingFragment, "");
        upiWaitingFragment.onContinue();
    }

    @SuppressLint({"CheckResult"})
    private final void initTextListeners() {
        Observable<CharSequence> expirationTimer = getViewModel().getExpirationTimer();
        C1204Sr timerTextView = getTimerTextView();
        Observable<CharSequence> observeOn = expirationTimer.takeUntil(timerTextView != null ? C9618tM.d(timerTextView) : null).observeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(observeOn, "");
        SubscribersKt.subscribeBy$default(observeOn, (drM) null, (drO) null, new drM<CharSequence, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingFragment$initTextListeners$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(CharSequence charSequence) {
                invoke2(charSequence);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(CharSequence charSequence) {
                C1204Sr timerTextView2 = UpiWaitingFragment.this.getTimerTextView();
                if (timerTextView2 == null) {
                    return;
                }
                timerTextView2.setText(charSequence);
            }
        }, 3, (Object) null);
    }

    @SuppressLint({"CheckResult"})
    private final void onContinue() {
        getScrollView().setVisibility(8);
        getContinueContainerLayout().setVisibility(8);
        getLoadingContainerLayout().setVisibility(0);
        Observable<String> takeUntil = getViewModel().getLoadingMessage().observeOn(AndroidSchedulers.mainThread()).takeUntil(C9618tM.d(getLoadingMessageTextView()));
        C8632dsu.a(takeUntil, "");
        SubscribersKt.subscribeBy$default(takeUntil, (drM) null, (drO) null, new drM<String, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingFragment$onContinue$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(String str) {
                invoke2(str);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                UpiWaitingFragment.this.getLoadingMessageTextView().setText(str);
            }
        }, 3, (Object) null);
        getInteractionListener().logContinueClicked();
    }
}
