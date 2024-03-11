package com.netflix.mediaclient.acquisition.components.regenold;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.form.FormSubmissionListener;
import com.netflix.mediaclient.acquisition.components.form2.edittext.LastFormViewEditTextBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class RegenoldFragment extends Hilt_RegenoldFragment implements FormSubmissionListener {
    @Inject
    public FormDataObserverFactory formDataObserverFactory;
    @Inject
    public KeyboardController keyboardController;
    @Inject
    public LastFormViewEditTextBinding lastFormViewEditTextBinding;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    private RegenoldFragment$networkResponseListener$1 networkResponseListener = new RegenoldFragment$networkResponseListener$1(this);
    @Inject
    public RegenoldInteractionListener regenoldInteractionListener;
    public RegenoldTray regenoldTray;
    public RegenoldViewModel viewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes3.dex */
    public interface RegenoldInteractionListener {
        void logRegenoldTrayClosed();

        void logRegenoldTrayCtaClicked();

        void logRegenoldTrayOpened();
    }

    public final void setFormDataObserverFactory(FormDataObserverFactory formDataObserverFactory) {
        C8632dsu.c((Object) formDataObserverFactory, "");
        this.formDataObserverFactory = formDataObserverFactory;
    }

    public final void setKeyboardController(KeyboardController keyboardController) {
        C8632dsu.c((Object) keyboardController, "");
        this.keyboardController = keyboardController;
    }

    public final void setLastFormViewEditTextBinding(LastFormViewEditTextBinding lastFormViewEditTextBinding) {
        C8632dsu.c((Object) lastFormViewEditTextBinding, "");
        this.lastFormViewEditTextBinding = lastFormViewEditTextBinding;
    }

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public final void setRegenoldInteractionListener(RegenoldInteractionListener regenoldInteractionListener) {
        C8632dsu.c((Object) regenoldInteractionListener, "");
        this.regenoldInteractionListener = regenoldInteractionListener;
    }

    public final void setRegenoldTray(RegenoldTray regenoldTray) {
        C8632dsu.c((Object) regenoldTray, "");
        this.regenoldTray = regenoldTray;
    }

    public final void setViewModel(RegenoldViewModel regenoldViewModel) {
        C8632dsu.c((Object) regenoldViewModel, "");
        this.viewModel = regenoldViewModel;
    }

    public final RegenoldTray getRegenoldTray() {
        RegenoldTray regenoldTray = this.regenoldTray;
        if (regenoldTray != null) {
            return regenoldTray;
        }
        C8632dsu.d("");
        return null;
    }

    public final RegenoldViewModel getViewModel() {
        RegenoldViewModel regenoldViewModel = this.viewModel;
        if (regenoldViewModel != null) {
            return regenoldViewModel;
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

    public final KeyboardController getKeyboardController() {
        KeyboardController keyboardController = this.keyboardController;
        if (keyboardController != null) {
            return keyboardController;
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

    public final RegenoldInteractionListener getRegenoldInteractionListener() {
        RegenoldInteractionListener regenoldInteractionListener = this.regenoldInteractionListener;
        if (regenoldInteractionListener != null) {
            return regenoldInteractionListener;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final RegenoldFragment newInstance() {
            return new RegenoldFragment();
        }
    }

    @Override // com.netflix.mediaclient.acquisition.components.regenold.Hilt_RegenoldFragment, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        RegenoldViewModelInitializer regenoldViewModelInitializer = getMoneyballEntryPoint().regenoldViewModelInitializer();
        FlowMode flowMode = regenoldViewModelInitializer.getFlowMode();
        setViewModel(regenoldViewModelInitializer.createRegenoldViewModel(this, C8632dsu.c((Object) (flowMode != null ? flowMode.getMode() : null), (Object) "welcome")));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        getRegenoldInteractionListener().logRegenoldTrayOpened();
        FragmentActivity requireActivity = requireActivity();
        C8632dsu.a(requireActivity, "");
        setRegenoldTray(new RegenoldTray(requireActivity, new drM<View, dpR>() { // from class: com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment$onCreateView$1
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
                RegenoldFragment.this.getRegenoldInteractionListener().logRegenoldTrayClosed();
                RegenoldFragment.this.getRegenoldTray().close();
                RegenoldFragment.this.dismiss();
            }
        }));
        View closeRegistrationTrayButton = getRegenoldTray().getCloseRegistrationTrayButton();
        if (closeRegistrationTrayButton != null) {
            closeRegistrationTrayButton.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RegenoldFragment.onCreateView$lambda$0(RegenoldFragment.this, view);
                }
            });
        }
        getRegenoldTray().getEmailFormView().bind(getViewModel().getEmailEditTextViewModel());
        getLastFormViewEditTextBinding().bind(getRegenoldTray().getEmailFormView(), true, this);
        getRegenoldTray().getSaveEmailButton().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegenoldFragment.onCreateView$lambda$1(RegenoldFragment.this, view);
            }
        });
        getViewModel().getRegenoldLoading().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createButtonLoadingObserver(getRegenoldTray().getSaveEmailButton()));
        return getRegenoldTray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$0(RegenoldFragment regenoldFragment, View view) {
        C8632dsu.c((Object) regenoldFragment, "");
        regenoldFragment.getKeyboardController().dismissKeyboard();
        regenoldFragment.getRegenoldTray().close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$1(RegenoldFragment regenoldFragment, View view) {
        C8632dsu.c((Object) regenoldFragment, "");
        regenoldFragment.getRegenoldInteractionListener().logRegenoldTrayCtaClicked();
        regenoldFragment.onFormSubmit();
    }

    @Override // com.netflix.mediaclient.acquisition.components.form.FormSubmissionListener
    public void onFormSubmit() {
        getKeyboardController().dismissKeyboard();
        if (getViewModel().isFormValid()) {
            getViewModel().performSaveEmailAction(this.networkResponseListener);
        } else {
            getRegenoldTray().getEmailFormView().setShowValidationState(true);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        getRegenoldTray().open();
        new Handler().postDelayed(new Runnable() { // from class: com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RegenoldFragment.onViewCreated$lambda$3(RegenoldFragment.this);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(RegenoldFragment regenoldFragment) {
        C8632dsu.c((Object) regenoldFragment, "");
        regenoldFragment.getKeyboardController().requestKeyboard(regenoldFragment.getRegenoldTray().getEmailFormView().getEditText());
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public boolean handleBackPressed() {
        getRegenoldInteractionListener().logRegenoldTrayClosed();
        getRegenoldTray().close();
        return true;
    }
}
