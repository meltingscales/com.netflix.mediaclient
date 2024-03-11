package com.netflix.mediaclient.acquisition.screens.welcomefuji;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.faq.FaqFragment;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.components.status.DialogWarningObserver;
import com.netflix.mediaclient.acquisition.components.viewPagerIndicator.ViewPagerIndicator;
import com.netflix.mediaclient.acquisition.databinding.FragmentWelcomeFujiBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiLogger;
import com.netflix.mediaclient.acquisition.services.logging.TtrEventListener;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import javax.inject.Inject;
import o.C8576dqs;
import o.C8632dsu;
import o.C9726vo;
import o.C9834xU;
import o.dpR;
import o.drM;
import o.drX;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public class WelcomeFujiFragment extends Hilt_WelcomeFujiFragment implements FujiCardContainer {
    public static final int $stable = 8;
    private FragmentWelcomeFujiBinding binding;
    private int currentPage;
    @Inject
    public WelcomeFujiLogger.Factory factory;
    @Inject
    public FormDataObserverFactory formDataObserverFactory;
    @Inject
    public WelcomeFujiNavigationListener fujiNavigationListener;
    public WelcomeFujiLogger logger;
    @Inject
    public LoginApi loginApi;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    private RegenoldFragment regenoldFragment;
    @Inject
    public TtrEventListener ttrEventListener;
    public WelcomeFujiViewModel viewModel;
    private final AppView appView = AppView.nmLanding;
    private final int transitioningBackgroundColorRes = C9834xU.c.b;

    /* loaded from: classes3.dex */
    public interface WelcomeFujiNavigationListener {
        void handoffToWebview(String str);

        void prefetchCtaClick(String str, String str2);

        void restartCtaClicked(String str, String str2);
    }

    public static /* synthetic */ void getFujiPager$annotations() {
    }

    public static /* synthetic */ void getNetflixSignupButtonWelcome$annotations() {
    }

    public static /* synthetic */ void getPlanFallbackButton$annotations() {
    }

    public static /* synthetic */ void getViewPagerIndicator$annotations() {
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public AppView getAppView() {
        return this.appView;
    }

    public final RegenoldFragment getRegenoldFragment() {
        return this.regenoldFragment;
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public int getTransitioningBackgroundColorRes() {
        return this.transitioningBackgroundColorRes;
    }

    public final void setFactory(WelcomeFujiLogger.Factory factory) {
        C8632dsu.c((Object) factory, "");
        this.factory = factory;
    }

    public final void setFormDataObserverFactory(FormDataObserverFactory formDataObserverFactory) {
        C8632dsu.c((Object) formDataObserverFactory, "");
        this.formDataObserverFactory = formDataObserverFactory;
    }

    public final void setFujiNavigationListener(WelcomeFujiNavigationListener welcomeFujiNavigationListener) {
        C8632dsu.c((Object) welcomeFujiNavigationListener, "");
        this.fujiNavigationListener = welcomeFujiNavigationListener;
    }

    public final void setLogger(WelcomeFujiLogger welcomeFujiLogger) {
        C8632dsu.c((Object) welcomeFujiLogger, "");
        this.logger = welcomeFujiLogger;
    }

    public final void setLoginApi(LoginApi loginApi) {
        C8632dsu.c((Object) loginApi, "");
        this.loginApi = loginApi;
    }

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public final void setRegenoldFragment(RegenoldFragment regenoldFragment) {
        this.regenoldFragment = regenoldFragment;
    }

    public final void setTtrEventListener(TtrEventListener ttrEventListener) {
        C8632dsu.c((Object) ttrEventListener, "");
        this.ttrEventListener = ttrEventListener;
    }

    public final void setViewModel(WelcomeFujiViewModel welcomeFujiViewModel) {
        C8632dsu.c((Object) welcomeFujiViewModel, "");
        this.viewModel = welcomeFujiViewModel;
    }

    public final WelcomeFujiViewModel getViewModel() {
        WelcomeFujiViewModel welcomeFujiViewModel = this.viewModel;
        if (welcomeFujiViewModel != null) {
            return welcomeFujiViewModel;
        }
        C8632dsu.d("");
        return null;
    }

    private final FragmentWelcomeFujiBinding requireBinding() {
        FragmentWelcomeFujiBinding fragmentWelcomeFujiBinding = this.binding;
        if (fragmentWelcomeFujiBinding != null) {
            return fragmentWelcomeFujiBinding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public final ViewPager2 getFujiPager() {
        View findViewById = requireView().findViewById(R.id.fujiPager);
        C8632dsu.a(findViewById, "");
        return (ViewPager2) findViewById;
    }

    public final ViewPagerIndicator getViewPagerIndicator() {
        View findViewById = requireView().findViewById(R.id.viewPagerIndicator);
        C8632dsu.a(findViewById, "");
        return (ViewPagerIndicator) findViewById;
    }

    public final NetflixSignupButton getNetflixSignupButtonWelcome() {
        View findViewById = requireView().findViewById(R.id.netflixSignupButtonWelcome);
        C8632dsu.a(findViewById, "");
        return (NetflixSignupButton) findViewById;
    }

    public final TextView getPlanFallbackButton() {
        return (TextView) requireView().findViewById(R.id.planFallbackButton);
    }

    private final View getFloatingCtaContainer() {
        LinearLayout linearLayout = requireBinding().floatingCtaContainer;
        C8632dsu.a(linearLayout, "");
        return linearLayout;
    }

    public final WelcomeFujiNavigationListener getFujiNavigationListener() {
        WelcomeFujiNavigationListener welcomeFujiNavigationListener = this.fujiNavigationListener;
        if (welcomeFujiNavigationListener != null) {
            return welcomeFujiNavigationListener;
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

    public final WelcomeFujiLogger.Factory getFactory() {
        WelcomeFujiLogger.Factory factory = this.factory;
        if (factory != null) {
            return factory;
        }
        C8632dsu.d("");
        return null;
    }

    public final WelcomeFujiLogger getLogger() {
        WelcomeFujiLogger welcomeFujiLogger = this.logger;
        if (welcomeFujiLogger != null) {
            return welcomeFujiLogger;
        }
        C8632dsu.d("");
        return null;
    }

    public final TtrEventListener getTtrEventListener() {
        TtrEventListener ttrEventListener = this.ttrEventListener;
        if (ttrEventListener != null) {
            return ttrEventListener;
        }
        C8632dsu.d("");
        return null;
    }

    public final LoginApi getLoginApi() {
        LoginApi loginApi = this.loginApi;
        if (loginApi != null) {
            return loginApi;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.Hilt_WelcomeFujiFragment, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(createWelcomeFujiViewModel());
        setLogger(getFactory().create(AppView.nmLanding));
    }

    public WelcomeFujiViewModel createWelcomeFujiViewModel() {
        return getMoneyballEntryPoint().welcomeFujiViewModelInitializer().createWelcomeFujiViewModel(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = FragmentWelcomeFujiBinding.inflate(layoutInflater, viewGroup, false);
        return requireBinding().getRoot();
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        if (getViewModel().getReggieCards().isEmpty()) {
            LoginApi loginApi = getLoginApi();
            Context requireContext = requireContext();
            C8632dsu.a(requireContext, "");
            startActivity(loginApi.c(requireContext));
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        setupViewPager();
        setupCta();
        getLogger().logOnPageSelected(getViewModel().getReggieCards().get(0).getCardName());
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C8632dsu.c((Object) menu, "");
        C8632dsu.c((Object) menuInflater, "");
        super.onCreateOptionsMenu(menu, menuInflater);
        addFaqMenuOption(menu);
    }

    private final void addFaqMenuOption(Menu menu) {
        menu.add(0, com.netflix.mediaclient.ui.R.g.dC, 2, getString(R.string.signup_menu_item_faq)).setShowAsAction(1);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C8632dsu.c((Object) menuItem, "");
        if (menuItem.getItemId() == com.netflix.mediaclient.ui.R.g.dC) {
            NetflixActivity netflixActivity = getNetflixActivity();
            if (netflixActivity != null) {
                netflixActivity.showFullScreenDialog(new FaqFragment());
            }
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    private final void setupCta() {
        getNetflixSignupButtonWelcome().setText(getViewModel().getCtaText());
        getNetflixSignupButtonWelcome().setAllCaps(false);
        NetflixSignupButton netflixSignupButtonWelcome = getNetflixSignupButtonWelcome();
        netflixSignupButtonWelcome.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WelcomeFujiFragment.setupCta$lambda$2(WelcomeFujiFragment.this, view);
            }
        });
        netflixSignupButtonWelcome.setClickable(true);
        if (getViewModel().getUseFormerMemberTray()) {
            ActionField nextAction = getViewModel().getNextAction();
            String flow = nextAction != null ? nextAction.getFlow() : null;
            ActionField nextAction2 = getViewModel().getNextAction();
            C9726vo.d(flow, nextAction2 != null ? nextAction2.getMode() : null, new drX<String, String, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment$setupCta$2
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
                    C8632dsu.c((Object) str, "");
                    C8632dsu.c((Object) str2, "");
                    WelcomeFujiFragment.this.getFujiNavigationListener().prefetchCtaClick(str, str2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCta$lambda$2(final WelcomeFujiFragment welcomeFujiFragment, View view) {
        C8632dsu.c((Object) welcomeFujiFragment, "");
        welcomeFujiFragment.getTtrEventListener().onPageCtaClick();
        if (welcomeFujiFragment.getViewModel().getUseFormerMemberTray()) {
            ActionField nextAction = welcomeFujiFragment.getViewModel().getNextAction();
            String flow = nextAction != null ? nextAction.getFlow() : null;
            ActionField nextAction2 = welcomeFujiFragment.getViewModel().getNextAction();
            C9726vo.d(flow, nextAction2 != null ? nextAction2.getMode() : null, new drX<String, String, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment$setupCta$1$1
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
                    C8632dsu.c((Object) str, "");
                    C8632dsu.c((Object) str2, "");
                    WelcomeFujiFragment.this.getFujiNavigationListener().restartCtaClicked(str, str2);
                }
            });
        } else {
            WelcomeFujiInteractionListener.DefaultImpls.logCtaClick$default(welcomeFujiFragment.getLogger(), welcomeFujiFragment.getViewModel().isRecognizedFormerMember(), false, 2, null);
            if (welcomeFujiFragment.getViewModel().getShowEmailTray()) {
                RegenoldFragment newInstance = RegenoldFragment.Companion.newInstance();
                NetflixActivity netflixActivity = welcomeFujiFragment.getNetflixActivity();
                if (netflixActivity != null) {
                    netflixActivity.showFullScreenDialog(newInstance);
                }
                welcomeFujiFragment.regenoldFragment = newInstance;
            } else {
                welcomeFujiFragment.onFormSubmit();
            }
        }
        welcomeFujiFragment.getLogger().logNavigate();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.components.form.FormSubmissionListener
    public void onFormSubmit() {
        String mode;
        if (getViewModel().getNextActionGoesToWebView()) {
            ActionField nextAction = getViewModel().getNextAction();
            if (nextAction == null || (mode = nextAction.getMode()) == null) {
                return;
            }
            getFujiNavigationListener().handoffToWebview(mode);
            return;
        }
        getViewModel().performNextRequest();
    }

    public FragmentStateAdapter createFujiViewPagerAdapter() {
        return new FujiViewPagerAdapter(this, getViewModel().getReggieCards());
    }

    private final void setupViewPager() {
        ViewPager2 fujiPager = getFujiPager();
        fujiPager.setAdapter(createFujiViewPagerAdapter());
        fujiPager.setOrientation(0);
        fujiPager.setOffscreenPageLimit(1);
        getViewPagerIndicator().setupWithViewPager(getFujiPager());
        getFujiPager().registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment$setupViewPager$2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i) {
                int i2;
                Object f;
                String cardName;
                i2 = WelcomeFujiFragment.this.currentPage;
                if (i2 != i) {
                    f = C8576dqs.f((List<? extends Object>) WelcomeFujiFragment.this.getViewModel().getReggieCards(), i);
                    FujiCardParsedData fujiCardParsedData = (FujiCardParsedData) f;
                    if (fujiCardParsedData == null || (cardName = fujiCardParsedData.getCardName()) == null) {
                        return;
                    }
                    WelcomeFujiFragment.this.getLogger().logOnPageSelected(cardName);
                }
            }
        });
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupLoadingObserver() {
        getViewModel().getFujiLoading().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createButtonLoadingObserver(getNetflixSignupButtonWelcome()));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupWarningObserver() {
        getViewModel().getDisplayedError().observe(getViewLifecycleOwner(), new DialogWarningObserver(requireNetflixActivity()));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.FujiCardContainer
    public void doOnFloatingContainerHeightReady(final drM<? super Integer, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        View view = getView();
        if (view != null) {
            if (ViewCompat.isLaidOut(view) && !view.isLayoutRequested()) {
                FragmentWelcomeFujiBinding fragmentWelcomeFujiBinding = this.binding;
                if (fragmentWelcomeFujiBinding != null) {
                    drm.invoke(Integer.valueOf(view.getHeight() - fragmentWelcomeFujiBinding.floatingCtaContainer.getTop()));
                    return;
                }
                return;
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment$doOnFloatingContainerHeightReady$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view2.removeOnLayoutChangeListener(this);
                    FragmentWelcomeFujiBinding fragmentWelcomeFujiBinding2 = WelcomeFujiFragment.this.binding;
                    if (fragmentWelcomeFujiBinding2 != null) {
                        drm.invoke(Integer.valueOf(view2.getHeight() - fragmentWelcomeFujiBinding2.floatingCtaContainer.getTop()));
                    }
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public interface WelcomeFujiInteractionListener {
        void logCtaClick(boolean z, boolean z2);

        void logNavigate();

        void logOnPageSelected(String str);

        /* loaded from: classes3.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ void logCtaClick$default(WelcomeFujiInteractionListener welcomeFujiInteractionListener, boolean z, boolean z2, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logCtaClick");
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                welcomeFujiInteractionListener.logCtaClick(z, z2);
            }
        }
    }
}
