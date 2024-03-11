package com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.session.action.Navigate;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.status.DialogWarningObserver;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.services.logging.TtrEventListener;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.AbstractC1017Lk;
import o.C1030Lx;
import o.C8627dsp;
import o.C8632dsu;
import o.C9872yF;
import o.C9878yL;
import o.InterfaceC1570aGe;
import o.LC;
import o.aRS;
import o.dpR;
import o.drX;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public class LearnMoreConfirmFragmentAb55548 extends Hilt_LearnMoreConfirmFragmentAb55548 {
    private static final String GRADIENT_BACKGROUND_ASSET_URL = "https://assets.nflxext.com/ffe/siteui/acquisition/androidSignup/clcs_mobile_gradient_background.webp";
    private final AppView appView = AppView.learnMoreConfirm;
    @Inject
    public InterfaceC1570aGe imageLoaderCompose;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    public StringProvider stringProvider;
    private final int transitioningBackgroundColorRes;
    @Inject
    public TtrEventListener ttrEventListener;
    public LearnMoreConfirmViewModelAb55548 viewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public AppView getAppView() {
        return this.appView;
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public int getTransitioningBackgroundColorRes() {
        return this.transitioningBackgroundColorRes;
    }

    public final void setImageLoaderCompose(InterfaceC1570aGe interfaceC1570aGe) {
        C8632dsu.c((Object) interfaceC1570aGe, "");
        this.imageLoaderCompose = interfaceC1570aGe;
    }

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public final void setStringProvider(StringProvider stringProvider) {
        C8632dsu.c((Object) stringProvider, "");
        this.stringProvider = stringProvider;
    }

    public final void setTtrEventListener(TtrEventListener ttrEventListener) {
        C8632dsu.c((Object) ttrEventListener, "");
        this.ttrEventListener = ttrEventListener;
    }

    public final void setViewModel(LearnMoreConfirmViewModelAb55548 learnMoreConfirmViewModelAb55548) {
        C8632dsu.c((Object) learnMoreConfirmViewModelAb55548, "");
        this.viewModel = learnMoreConfirmViewModelAb55548;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupLoadingObserver() {
    }

    public LearnMoreConfirmFragmentAb55548() {
        this.transitioningBackgroundColorRes = aRS.e.d() ? C1030Lx.d.h : super.getTransitioningBackgroundColorRes();
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    public final LearnMoreConfirmViewModelAb55548 getViewModel() {
        LearnMoreConfirmViewModelAb55548 learnMoreConfirmViewModelAb55548 = this.viewModel;
        if (learnMoreConfirmViewModelAb55548 != null) {
            return learnMoreConfirmViewModelAb55548;
        }
        C8632dsu.d("");
        return null;
    }

    public final StringProvider getStringProvider() {
        StringProvider stringProvider = this.stringProvider;
        if (stringProvider != null) {
            return stringProvider;
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

    public final TtrEventListener getTtrEventListener() {
        TtrEventListener ttrEventListener = this.ttrEventListener;
        if (ttrEventListener != null) {
            return ttrEventListener;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC1570aGe getImageLoaderCompose() {
        InterfaceC1570aGe interfaceC1570aGe = this.imageLoaderCompose;
        if (interfaceC1570aGe != null) {
            return interfaceC1570aGe;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.Hilt_LearnMoreConfirmFragmentAb55548, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(createLearnMoreConfirmViewModel());
        setStringProvider(getMoneyballEntryPoint().stringProvider());
    }

    public LearnMoreConfirmViewModelAb55548 createLearnMoreConfirmViewModel() {
        return getMoneyballEntryPoint().learnMoreConfirmViewModelInitializer55548().createLearnMoreConfirmViewModel(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1790693305, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmFragmentAb55548$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return dpR.c;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790693305, i, -1, "com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmFragmentAb55548.onCreateView.<anonymous>.<anonymous> (LearnMoreConfirmFragmentAb55548.kt:107)");
                }
                LearnMoreConfirmFragmentAb55548.this.LearnMoreConfirmScreen(null, composer, 64, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return composeView;
    }

    public final void LearnMoreConfirmScreen(final Modifier modifier, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-1932226243);
        if ((i2 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1932226243, i, -1, "com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmFragmentAb55548.LearnMoreConfirmScreen (LearnMoreConfirmFragmentAb55548.kt:115)");
        }
        LC.d(getViewModel().getTheme(), ComposableLambdaKt.composableLambda(startRestartGroup, 127951923, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmFragmentAb55548$LearnMoreConfirmScreen$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return dpR.c;
            }

            /* JADX WARN: Removed duplicated region for block: B:65:0x0494  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x04f5  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x050a  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0553  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x0568  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x05cb  */
            /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke(androidx.compose.runtime.Composer r36, int r37) {
                /*
                    Method dump skipped, instructions count: 1487
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmFragmentAb55548$LearnMoreConfirmScreen$1.invoke(androidx.compose.runtime.Composer, int):void");
            }
        }), startRestartGroup, 48, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmFragmentAb55548$LearnMoreConfirmScreen$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i3) {
                    LearnMoreConfirmFragmentAb55548.this.LearnMoreConfirmScreen(modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        getTtrEventListener().onPageRenderSuccess();
        if (getViewModel().getShowReceivedEmailExperience()) {
            showBottomToastWithTimeout(getStringProvider().getString(R.string.learn_more_confirm_toast_account_created), HawkinsIcon.aP.e, getViewModel().getTheme());
        }
        if (getViewModel().getShowTextSentToast()) {
            showBottomToastWithTimeout(getStringProvider().getString(R.string.learn_more_confirm_toast_text_sent), HawkinsIcon.aP.e, getViewModel().getTheme());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openDefaultEmail() {
        Logger logger = Logger.INSTANCE;
        Long startSession = logger.startSession(new Navigate(getAppView(), null, CommandValue.SeeDetailsCommand, null));
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.APP_EMAIL");
        intent.addFlags(268435456);
        startActivity(Intent.createChooser(intent, getStringProvider().getString(R.string.learn_more_confirm_email_chooser_text)));
        logger.endSession(startSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBottomToastWithTimeout(String str, HawkinsIcon hawkinsIcon, Theme theme) {
        C9872yF c9872yF = requireNetflixActivity().composeViewOverlayManager;
        C8632dsu.a(c9872yF, "");
        C9878yL.d(c9872yF, (r22 & 1) != 0 ? Modifier.Companion : null, str, (r22 & 4) != 0 ? null : hawkinsIcon, (r22 & 8) != 0 ? null : null, (r22 & 16) != 0 ? new AbstractC1017Lk.d(null, 1, null) : null, (r22 & 32) != 0 ? Theme.b : theme, (r22 & 64) != 0 ? 3000 : 0, (r22 & 128) != 0, (r22 & JSONzip.end) != 0 ? null : null);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupWarningObserver() {
        getViewModel().getDisplayedError().observe(getViewLifecycleOwner(), new DialogWarningObserver(requireNetflixActivity()));
    }
}
