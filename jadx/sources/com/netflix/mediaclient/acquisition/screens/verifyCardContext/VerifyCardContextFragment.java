package com.netflix.mediaclient.acquisition.screens.verifyCardContext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.heading.SignupHeadingView;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.databinding.ContextFragmentLayoutWithMessageBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.List;
import javax.inject.Inject;
import o.C8569dql;
import o.C8632dsu;
import o.C9618tM;
import o.dpR;
import o.drM;
import o.drO;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class VerifyCardContextFragment extends Hilt_VerifyCardContextFragment {
    public static final int $stable = 8;
    private final AppView appView = AppView.paymentVerifyCardContext;
    private ContextFragmentLayoutWithMessageBinding binding;
    @Inject
    public EventListener eventListener;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    @Inject
    public VerifyCardContextClickListener verifyCardContextClickListener;
    public VerifyCardContextViewModel viewModel;

    /* loaded from: classes3.dex */
    public interface EventListener {
        void onAutoSubmit();

        void onContinue(long j, boolean z);
    }

    /* loaded from: classes3.dex */
    public interface VerifyCardContextClickListener {
        void onVerifyContextConfirm();
    }

    public static /* synthetic */ void getContextButton$annotations() {
    }

    public static /* synthetic */ void getContextIcon$annotations() {
    }

    public static /* synthetic */ void getSignupHeading$annotations() {
    }

    private static /* synthetic */ void getUserMessage$annotations() {
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public AppView getAppView() {
        return this.appView;
    }

    public final void setEventListener(EventListener eventListener) {
        C8632dsu.c((Object) eventListener, "");
        this.eventListener = eventListener;
    }

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public final void setVerifyCardContextClickListener(VerifyCardContextClickListener verifyCardContextClickListener) {
        C8632dsu.c((Object) verifyCardContextClickListener, "");
        this.verifyCardContextClickListener = verifyCardContextClickListener;
    }

    public final void setViewModel(VerifyCardContextViewModel verifyCardContextViewModel) {
        C8632dsu.c((Object) verifyCardContextViewModel, "");
        this.viewModel = verifyCardContextViewModel;
    }

    public final VerifyCardContextViewModel getViewModel() {
        VerifyCardContextViewModel verifyCardContextViewModel = this.viewModel;
        if (verifyCardContextViewModel != null) {
            return verifyCardContextViewModel;
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

    public final VerifyCardContextClickListener getVerifyCardContextClickListener() {
        VerifyCardContextClickListener verifyCardContextClickListener = this.verifyCardContextClickListener;
        if (verifyCardContextClickListener != null) {
            return verifyCardContextClickListener;
        }
        C8632dsu.d("");
        return null;
    }

    public final EventListener getEventListener() {
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            return eventListener;
        }
        C8632dsu.d("");
        return null;
    }

    private final ContextFragmentLayoutWithMessageBinding requireBinding() {
        ContextFragmentLayoutWithMessageBinding contextFragmentLayoutWithMessageBinding = this.binding;
        if (contextFragmentLayoutWithMessageBinding != null) {
            return contextFragmentLayoutWithMessageBinding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public final ImageView getContextIcon() {
        ImageView imageView = requireBinding().contextIcon;
        C8632dsu.a(imageView, "");
        return imageView;
    }

    public final SignupHeadingView getSignupHeading() {
        SignupHeadingView signupHeadingView = requireBinding().signupHeading;
        C8632dsu.a(signupHeadingView, "");
        return signupHeadingView;
    }

    public final NetflixSignupButton getContextButton() {
        NetflixSignupButton netflixSignupButton = requireBinding().contextButton;
        C8632dsu.a(netflixSignupButton, "");
        return netflixSignupButton;
    }

    private final SignupBannerView getUserMessage() {
        SignupBannerView signupBannerView = requireBinding().userMessage;
        C8632dsu.a(signupBannerView, "");
        return signupBannerView;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.verifyCardContext.Hilt_VerifyCardContextFragment, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(getMoneyballEntryPoint().verifyCardContextViewModelInitializer().createVerifyCardContextViewModel(this));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = ContextFragmentLayoutWithMessageBinding.inflate(layoutInflater, viewGroup, false);
        return requireBinding().getRoot();
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initSignupHeading$default(VerifyCardContextFragment verifyCardContextFragment, CharSequence charSequence, String str, List list, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = C8569dql.i();
        }
        if ((i2 & 8) != 0) {
            i = R.dimen.signup_subheading_width;
        }
        verifyCardContextFragment.initSignupHeading(charSequence, str, list, i);
    }

    public final void initSignupHeading(CharSequence charSequence, String str, List<String> list, int i) {
        C8632dsu.c((Object) list, "");
        getSignupHeading().setSubHeadingPixelWidth(getResources().getDimensionPixelSize(i));
        SignupHeadingView.setStrings$default(getSignupHeading(), charSequence, str, null, list, 4, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        initSignupHeading$default(this, null, getViewModel().getHeadingText(), getViewModel().getSubheadingText(), 0, 8, null);
        NetflixSignupButton contextButton = getContextButton();
        String string = getString(R.string.button_verify_card);
        C8632dsu.a(string, "");
        contextButton.setText(string);
        Drawable drawable = ContextCompat.getDrawable(view.getContext(), getViewModel().getContextIcon());
        if (drawable != null) {
            getContextIcon().setImageDrawable(drawable);
        }
        initClickListeners();
        initBindings();
        initUserMessage();
    }

    private final void initUserMessage() {
        getUserMessage().setText(getViewModel().getUserMessage());
    }

    private final void initClickListeners() {
        getContextButton().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyCardContextFragment.initClickListeners$lambda$2(VerifyCardContextFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$2(VerifyCardContextFragment verifyCardContextFragment, View view) {
        C8632dsu.c((Object) verifyCardContextFragment, "");
        verifyCardContextFragment.onSubmit(false);
    }

    @SuppressLint({"CheckResult"})
    private final void initBindings() {
        Observable<dpR> takeUntil;
        Observable<dpR> autoSubmit = getViewModel().getAutoSubmit();
        if (autoSubmit == null || (takeUntil = autoSubmit.takeUntil(C9618tM.d(getContextButton()))) == null) {
            return;
        }
        SubscribersKt.subscribeBy$default(takeUntil, (drM) null, (drO) null, new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment$initBindings$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(dpR dpr) {
                invoke2(dpr);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(dpR dpr) {
                VerifyCardContextFragment.this.getEventListener().onAutoSubmit();
                VerifyCardContextFragment.this.onSubmit(true);
            }
        }, 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSubmit(boolean z) {
        getEventListener().onContinue(getViewModel().getElapsedTimeMillis(), z);
        getVerifyCardContextClickListener().onVerifyContextConfirm();
    }
}
