package com.netflix.mediaclient.acquisition.screens.verifyCard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.heading.SignupHeadingView;
import com.netflix.mediaclient.acquisition.databinding.FragmentVerifyCardBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.WebViewContainer;
import com.netflix.mediaclient.acquisition.screens.signupContainer.SignupNativeActivity;
import com.netflix.mediaclient.acquisition.util.AUIWebViewUtilities;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import javax.inject.Inject;
import o.C1204Sr;
import o.C8569dql;
import o.C8632dsu;
import o.dpR;
import o.drX;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class VerifyCardFragment extends Hilt_VerifyCardFragment implements WebViewContainer {
    public static final int $stable = 8;
    private final AppView appView = AppView.paymentVerifyCard;
    private FragmentVerifyCardBinding binding;
    @Inject
    public FormDataObserverFactory formDataObserverFactory;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    @Inject
    public VerifyCard3dsEventListener verifyCard3dsEventListener;
    public VerifyCardViewModel viewModel;

    /* loaded from: classes3.dex */
    public interface VerifyCard3dsEventListener {
        void onVerifyCard3dsFinish(String str);

        void onVerifyCard3dsStart(String str);
    }

    public static /* synthetic */ void getGoBackButton$annotations() {
    }

    public static /* synthetic */ void getSignupHeading$annotations() {
    }

    public static /* synthetic */ void getUserMessage$annotations() {
    }

    public static /* synthetic */ void getWebView$annotations() {
    }

    public static /* synthetic */ void getWebViewContainer$annotations() {
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

    public final void setVerifyCard3dsEventListener(VerifyCard3dsEventListener verifyCard3dsEventListener) {
        C8632dsu.c((Object) verifyCard3dsEventListener, "");
        this.verifyCard3dsEventListener = verifyCard3dsEventListener;
    }

    public final void setViewModel(VerifyCardViewModel verifyCardViewModel) {
        C8632dsu.c((Object) verifyCardViewModel, "");
        this.viewModel = verifyCardViewModel;
    }

    public final VerifyCardViewModel getViewModel() {
        VerifyCardViewModel verifyCardViewModel = this.viewModel;
        if (verifyCardViewModel != null) {
            return verifyCardViewModel;
        }
        C8632dsu.d("");
        return null;
    }

    private final FragmentVerifyCardBinding requireBinding() {
        FragmentVerifyCardBinding fragmentVerifyCardBinding = this.binding;
        if (fragmentVerifyCardBinding != null) {
            return fragmentVerifyCardBinding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public final SignupHeadingView getSignupHeading() {
        SignupHeadingView signupHeadingView = requireBinding().signupHeading;
        C8632dsu.a(signupHeadingView, "");
        return signupHeadingView;
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.WebViewContainer
    public WebView getWebView() {
        WebView webView = requireBinding().webViewLayout.webView;
        C8632dsu.a(webView, "");
        return webView;
    }

    public final RelativeLayout getWebViewContainer() {
        RelativeLayout relativeLayout = requireBinding().webViewLayout.webViewContainer;
        C8632dsu.a(relativeLayout, "");
        return relativeLayout;
    }

    public final TextView getGoBackButton() {
        C1204Sr c1204Sr = requireBinding().goBackButton;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final SignupBannerView getUserMessage() {
        SignupBannerView signupBannerView = requireBinding().userMessage;
        C8632dsu.a(signupBannerView, "");
        return signupBannerView;
    }

    public final SignupMoneyballEntryPoint getMoneyballEntryPoint() {
        SignupMoneyballEntryPoint signupMoneyballEntryPoint = this.moneyballEntryPoint;
        if (signupMoneyballEntryPoint != null) {
            return signupMoneyballEntryPoint;
        }
        C8632dsu.d("");
        return null;
    }

    public final VerifyCard3dsEventListener getVerifyCard3dsEventListener() {
        VerifyCard3dsEventListener verifyCard3dsEventListener = this.verifyCard3dsEventListener;
        if (verifyCard3dsEventListener != null) {
            return verifyCard3dsEventListener;
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

    @Override // com.netflix.mediaclient.acquisition.screens.verifyCard.Hilt_VerifyCardFragment, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(getMoneyballEntryPoint().verifyCardViewModelInitializer().createVerifyCardViewModel(this));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = FragmentVerifyCardBinding.inflate(layoutInflater, viewGroup, false);
        return requireBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        initSignupHeading$default(this, null, getViewModel().getHeadingText(), getViewModel().getSubheadingText(), 0, 8, null);
        initGoBackButton();
        initWebView();
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void initSignupHeading$default(VerifyCardFragment verifyCardFragment, CharSequence charSequence, String str, List list, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = C8569dql.i();
        }
        if ((i2 & 8) != 0) {
            i = R.dimen.signup_subheading_width;
        }
        verifyCardFragment.initSignupHeading(charSequence, str, list, i);
    }

    private final void initSignupHeading(CharSequence charSequence, String str, List<String> list, int i) {
        getSignupHeading().setSubHeadingPixelWidth(getResources().getDimensionPixelSize(i));
        SignupHeadingView.setStrings$default(getSignupHeading(), charSequence, str, null, list, 4, null);
    }

    private final void initGoBackButton() {
        getGoBackButton().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyCardFragment.initGoBackButton$lambda$1(VerifyCardFragment.this, view);
            }
        });
        setupGoBackLinkClickWarningObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGoBackButton$lambda$1(VerifyCardFragment verifyCardFragment, View view) {
        C8632dsu.c((Object) verifyCardFragment, "");
        verifyCardFragment.getViewModel().performBackActionRequest();
    }

    private final void initWebView() {
        getVerifyCard3dsEventListener().onVerifyCard3dsStart(getViewModel().getAcsUrl());
        String acsUrl = getViewModel().getAcsUrl();
        if (acsUrl != null) {
            getWebView().postUrl(acsUrl, getViewModel().getPostData());
        }
        AUIWebViewUtilities.initWebView$default(AUIWebViewUtilities.INSTANCE, getWebView(), new AUIWebViewUtilities.BridgeMethods.VerifyCardWithMd(new drX<String, String, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment$initWebView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* bridge */ /* synthetic */ dpR invoke(String str, String str2) {
                invoke2(str, str2);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(String str, String str2) {
                VerifyCardFragment.this.getVerifyCard3dsEventListener().onVerifyCard3dsFinish(str);
                VerifyCardFragment.this.getViewModel().onReceivePaRes(str, str2);
            }
        }, null, 2, null), false, 4, null);
    }

    @SuppressLint({"FragmentLiveDataObserve"})
    private final void setupGoBackLinkClickWarningObserver() {
        getViewModel().getBackRequestLoading().observe(this, new Observer() { // from class: com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                VerifyCardFragment.setupGoBackLinkClickWarningObserver$lambda$3(VerifyCardFragment.this, ((Boolean) obj).booleanValue());
            }
        });
        setupWarningObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupGoBackLinkClickWarningObserver$lambda$3(VerifyCardFragment verifyCardFragment, boolean z) {
        C8632dsu.c((Object) verifyCardFragment, "");
        if (z) {
            FragmentActivity activity = verifyCardFragment.getActivity();
            SignupNativeActivity signupNativeActivity = activity instanceof SignupNativeActivity ? (SignupNativeActivity) activity : null;
            if (signupNativeActivity != null) {
                signupNativeActivity.showProgressSpinner();
                return;
            }
            return;
        }
        FragmentActivity activity2 = verifyCardFragment.getActivity();
        SignupNativeActivity signupNativeActivity2 = activity2 instanceof SignupNativeActivity ? (SignupNativeActivity) activity2 : null;
        if (signupNativeActivity2 != null) {
            SignupNativeActivity.hideProgressSpinner$default(signupNativeActivity2, false, 1, null);
        }
    }

    private final void setupWarningObserver() {
        getViewModel().getDisplayedError().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createInlineWarningObserver(getUserMessage(), null));
    }
}
