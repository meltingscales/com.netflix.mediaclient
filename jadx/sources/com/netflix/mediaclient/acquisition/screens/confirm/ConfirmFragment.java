package com.netflix.mediaclient.acquisition.screens.confirm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesView;
import com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesViewBindingFactory;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.components.tou.TermsOfUseView;
import com.netflix.mediaclient.acquisition.components.tou.TouViewBindingFactory;
import com.netflix.mediaclient.acquisition.databinding.ConfirmFragmentLayoutBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.WebViewContainer;
import com.netflix.mediaclient.acquisition.screens.creditDebit.EmvcoEventLogger;
import com.netflix.mediaclient.acquisition.util.AUIWebViewUtilities;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import o.C1204Sr;
import o.C1596aHd;
import o.C1645aIz;
import o.C8632dsu;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.dpR;
import o.dqE;
import o.drM;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class ConfirmFragment extends Hilt_ConfirmFragment implements WebViewContainer {
    public static final int $stable = 8;
    private final AppView appView = AppView.orderConfirmation;
    private ConfirmFragmentLayoutBinding binding;
    @Inject
    public EmvcoEventLogger emvcoEventLogger;
    @Inject
    public FormDataObserverFactory formDataObserverFactory;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    public ConfirmViewModel viewModel;

    public static /* synthetic */ void getAccountInformation$annotations() {
    }

    public static /* synthetic */ void getConfirmButton$annotations() {
    }

    public static /* synthetic */ void getConfirmHeader$annotations() {
    }

    public static /* synthetic */ void getConfirmPreHeader$annotations() {
    }

    public static /* synthetic */ void getKoreaCheckBoxes$annotations() {
    }

    public static /* synthetic */ void getPlanDescription$annotations() {
    }

    public static /* synthetic */ void getPlanName$annotations() {
    }

    public static /* synthetic */ void getPositiveView$annotations() {
    }

    public static /* synthetic */ void getScrollView$annotations() {
    }

    public static /* synthetic */ void getSelectedMop$annotations() {
    }

    public static /* synthetic */ void getTouView$annotations() {
    }

    public static /* synthetic */ void getUserDetails$annotations() {
    }

    public static /* synthetic */ void getUserMessage$annotations() {
    }

    public static /* synthetic */ void getWarningView$annotations() {
    }

    public static /* synthetic */ void getWebView$annotations() {
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public AppView getAppView() {
        return this.appView;
    }

    public final void setEmvcoEventLogger(EmvcoEventLogger emvcoEventLogger) {
        C8632dsu.c((Object) emvcoEventLogger, "");
        this.emvcoEventLogger = emvcoEventLogger;
    }

    public final void setFormDataObserverFactory(FormDataObserverFactory formDataObserverFactory) {
        C8632dsu.c((Object) formDataObserverFactory, "");
        this.formDataObserverFactory = formDataObserverFactory;
    }

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public final void setViewModel(ConfirmViewModel confirmViewModel) {
        C8632dsu.c((Object) confirmViewModel, "");
        this.viewModel = confirmViewModel;
    }

    public final ConfirmViewModel getViewModel() {
        ConfirmViewModel confirmViewModel = this.viewModel;
        if (confirmViewModel != null) {
            return confirmViewModel;
        }
        C8632dsu.d("");
        return null;
    }

    private final ConfirmFragmentLayoutBinding requireBinding() {
        ConfirmFragmentLayoutBinding confirmFragmentLayoutBinding = this.binding;
        if (confirmFragmentLayoutBinding != null) {
            return confirmFragmentLayoutBinding;
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

    public final TextView getSelectedMop() {
        C1204Sr c1204Sr = requireBinding().selectedMop;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final TextView getUserDetails() {
        C1204Sr c1204Sr = requireBinding().userDetails;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final TextView getPlanDescription() {
        C1204Sr c1204Sr = requireBinding().planDescription;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final TextView getPlanName() {
        C1204Sr c1204Sr = requireBinding().planName;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final View getAccountInformation() {
        LinearLayout linearLayout = requireBinding().accountInformation;
        C8632dsu.a(linearLayout, "");
        return linearLayout;
    }

    public final TextView getConfirmPreHeader() {
        C1204Sr c1204Sr = requireBinding().confirmPreHeader;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final TextView getConfirmHeader() {
        C1204Sr c1204Sr = requireBinding().confirmHeader;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final SignupBannerView getUserMessage() {
        SignupBannerView signupBannerView = requireBinding().userMessage;
        C8632dsu.a(signupBannerView, "");
        return signupBannerView;
    }

    public final SignupBannerView getPositiveView() {
        SignupBannerView signupBannerView = requireBinding().positiveView;
        C8632dsu.a(signupBannerView, "");
        return signupBannerView;
    }

    public final NetflixSignupButton getConfirmButton() {
        NetflixSignupButton netflixSignupButton = requireBinding().confirmButton;
        C8632dsu.a(netflixSignupButton, "");
        return netflixSignupButton;
    }

    public final TermsOfUseView getTouView() {
        TermsOfUseView termsOfUseView = requireBinding().touView;
        C8632dsu.a(termsOfUseView, "");
        return termsOfUseView;
    }

    public final KoreaCheckBoxesView getKoreaCheckBoxes() {
        KoreaCheckBoxesView koreaCheckBoxesView = requireBinding().koreaCheckBoxes;
        C8632dsu.a(koreaCheckBoxesView, "");
        return koreaCheckBoxesView;
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.WebViewContainer
    public WebView getWebView() {
        WebView webView = requireBinding().webView;
        C8632dsu.a(webView, "");
        return webView;
    }

    public final SignupMoneyballEntryPoint getMoneyballEntryPoint() {
        SignupMoneyballEntryPoint signupMoneyballEntryPoint = this.moneyballEntryPoint;
        if (signupMoneyballEntryPoint != null) {
            return signupMoneyballEntryPoint;
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

    public final EmvcoEventLogger getEmvcoEventLogger() {
        EmvcoEventLogger emvcoEventLogger = this.emvcoEventLogger;
        if (emvcoEventLogger != null) {
            return emvcoEventLogger;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.confirm.Hilt_ConfirmFragment, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(getMoneyballEntryPoint().confirmViewModelInitializer().createConfirmViewModel(this));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = ConfirmFragmentLayoutBinding.inflate(layoutInflater, viewGroup, false);
        ScrollView root = requireBinding().getRoot();
        C8632dsu.a(root, "");
        return root;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        initViews();
        initClickListeners();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    private final void initViews() {
        Context context;
        Map k;
        Throwable th;
        if (getViewModel().isRecognizedFormerMember()) {
            getConfirmPreHeader().setText(getViewModel().getWelcomeBackText());
        } else {
            getConfirmPreHeader().setVisibility(8);
        }
        getConfirmHeader().setText(getViewModel().getHeaderText());
        if (getViewModel().getShowCvvField()) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            k = dqE.k(new LinkedHashMap());
            C1596aHd c1596aHd = new C1596aHd("Not expecting MX & FR rejoins to land here", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c2 = dVar2.c();
            if (c2 != null) {
                c2.d(c1596aHd, th);
            } else {
                dVar2.e().b(c1596aHd, th);
            }
        }
        getUserMessage().setText(getViewModel().getUserMessageText());
        if (getViewModel().getUseBlueBanner() && (context = getContext()) != null) {
            setSignupBannerInfoBlue(context);
        }
        getConfirmButton().setText(getViewModel().getStartMembershipButtonViewModel().getText());
        initTouComponent();
        initCheckBoxes();
        initChangePlanView();
        initEditPaymentView();
        getPositiveView().setText(getViewModel().getGiftAmount());
        initEmvcoIfNecessary();
    }

    private final void initClickListeners() {
        getConfirmButton().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.confirm.ConfirmFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfirmFragment.initClickListeners$lambda$2(ConfirmFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$2(ConfirmFragment confirmFragment, View view) {
        C8632dsu.c((Object) confirmFragment, "");
        if (confirmFragment.touAccepted()) {
            confirmFragment.getViewModel().submit();
        }
    }

    private final boolean touAccepted() {
        return getViewModel().getKoreaCheckBoxesViewModel().getShowKoreaCheckBoxes() ? getKoreaCheckBoxes().hasAcceptedRequiredCheckBoxes() : getTouView().hasAcceptedRequiredCheckBoxes();
    }

    private final void initCheckBoxes() {
        if (getViewModel().getKoreaCheckBoxesViewModel().getShowKoreaCheckBoxes()) {
            initKoreaTouComponent();
            getTouView().setVisibility(8);
            return;
        }
        initTouComponent();
        getKoreaCheckBoxes().setVisibility(8);
    }

    private final void setSignupBannerInfoBlue(Context context) {
        getUserMessage().setSignupBannerInfoBlue(context);
        getUserMessage().setBackground(context.getDrawable(R.drawable.user_message_background_blue));
    }

    private final void initKoreaTouComponent() {
        new KoreaCheckBoxesViewBindingFactory().createKoreaCheckBoxesBinding(getKoreaCheckBoxes()).bind(getViewModel().getKoreaCheckBoxesViewModel());
    }

    private final void initTouComponent() {
        new TouViewBindingFactory().createPaymentBinding(getTouView()).bind(getViewModel().getTouViewModel());
    }

    private final void initChangePlanView() {
        getPlanDescription().setText(getViewModel().getChangePlanViewModel().getPlanDescription());
        getPlanName().setText(getViewModel().getChangePlanViewModel().getPlanName());
    }

    private final void initEditPaymentView() {
        getSelectedMop().setText(getViewModel().getEditPaymentViewModel().getSelectedMop());
        getUserDetails().setText(getViewModel().getEditPaymentViewModel().getUserDetails());
    }

    private final void initEmvcoIfNecessary() {
        if (getViewModel().getShouldRunEmvcoCheck()) {
            initEmvcoWebView();
        }
    }

    private final void initEmvcoWebView() {
        C1645aIz.a(this, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.confirm.ConfirmFragment$initEmvcoWebView$1
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
                WebView webView = ConfirmFragment.this.getWebView();
                ConfirmViewModel viewModel = ConfirmFragment.this.getViewModel();
                String m = serviceManager.k().m();
                C8632dsu.a(m, "");
                webView.loadUrl(viewModel.buildDeviceDataCollectionFallbackUrl(m));
                AUIWebViewUtilities aUIWebViewUtilities = AUIWebViewUtilities.INSTANCE;
                WebView webView2 = ConfirmFragment.this.getWebView();
                final ConfirmFragment confirmFragment = ConfirmFragment.this;
                drM<String, dpR> drm = new drM<String, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.confirm.ConfirmFragment$initEmvcoWebView$1.1
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
                        ConfirmFragment.this.getEmvcoEventLogger().onReceiveJwt(str);
                    }
                };
                final ConfirmFragment confirmFragment2 = ConfirmFragment.this;
                AUIWebViewUtilities.initWebView$default(aUIWebViewUtilities, webView2, new AUIWebViewUtilities.BridgeMethods.Emvco(drm, new drM<String, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.confirm.ConfirmFragment$initEmvcoWebView$1.2
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
                        ConfirmFragment.this.getEmvcoEventLogger().onReceiveFallbackData(str);
                        ConfirmFragment.this.getViewModel().onReceiveFallbackData(str);
                    }
                }, null, 4, null), false, 4, null);
            }
        });
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupWarningObserver() {
        getViewModel().getDisplayedError().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createInlineWarningObserver(getWarningView(), getScrollView()));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupLoadingObserver() {
        getViewModel().getSubmitConfirm().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createButtonLoadingObserver(getConfirmButton()));
    }
}
