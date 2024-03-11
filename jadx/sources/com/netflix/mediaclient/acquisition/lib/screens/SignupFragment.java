package com.netflix.mediaclient.acquisition.lib.screens;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_NonMemberUiLatencyTracker;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C1645aIz;
import o.C8632dsu;
import o.InterfaceC1078Nw;
import o.InterfaceC1573aGh;
import o.InterfaceC1575aGj;
import o.InterfaceC1577aGl;
import o.dpR;
import o.drM;
import o.drO;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public abstract class SignupFragment extends Hilt_SignupFragment {
    private final int transitioningBackgroundColorRes = R.c.s;
    @Inject
    protected Lazy<InterfaceC1573aGh> uiLatencyTracker;

    public abstract SignupBackType backBehavior();

    public abstract AppView getAppView();

    public int getTransitioningBackgroundColorRes() {
        return this.transitioningBackgroundColorRes;
    }

    public boolean handleBackInFragment() {
        return false;
    }

    protected final void setUiLatencyTracker(Lazy<InterfaceC1573aGh> lazy) {
        C8632dsu.c((Object) lazy, "");
        this.uiLatencyTracker = lazy;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Lazy<InterfaceC1573aGh> getUiLatencyTracker() {
        Lazy<InterfaceC1573aGh> lazy = this.uiLatencyTracker;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final NetflixActivity getNetflixActivity() {
        FragmentActivity activity = getActivity();
        if (activity instanceof NetflixActivity) {
            return (NetflixActivity) activity;
        }
        return null;
    }

    public final NetflixActivity requireNetflixActivity() {
        FragmentActivity activity = getActivity();
        C8632dsu.d(activity);
        return (NetflixActivity) activity;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setupUiLatencyTracker(bundle == null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        WebView webView;
        WebViewContainer webViewContainer = this instanceof WebViewContainer ? (WebViewContainer) this : null;
        if (webViewContainer != null && (webView = webViewContainer.getWebView()) != null) {
            webView.loadUrl("about:blank");
            webView.onPause();
            webView.removeAllViews();
            webView.destroy();
        }
        super.onDestroyView();
    }

    private final void setupUiLatencyTracker(boolean z) {
        NetflixActivity netflixActivity;
        if (Config_FastProperty_NonMemberUiLatencyTracker.Companion.b() && (netflixActivity = getNetflixActivity()) != null) {
            getUiLatencyTracker().get().a(getAppView(), this, netflixActivity).a(z).a();
            C1645aIz.a(this, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.acquisition.lib.screens.SignupFragment$setupUiLatencyTracker$1
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
                    InterfaceC1575aGj e = SignupFragment.this.getUiLatencyTracker().get().e(true);
                    String netflixImmutableStatus = InterfaceC1078Nw.aJ.toString();
                    C8632dsu.a(netflixImmutableStatus, "");
                    InterfaceC1577aGl c = e.b(netflixImmutableStatus).c((Boolean) null);
                    ImageLoader imageLoader = NetflixActivity.getImageLoader(SignupFragment.this.requireContext());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(SignupFragment.this);
                    Lifecycle lifecycle = SignupFragment.this.getLifecycle();
                    C8632dsu.a(lifecycle, "");
                    c.e(imageLoader, anonymousClass1, lifecycle);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.netflix.mediaclient.acquisition.lib.screens.SignupFragment$setupUiLatencyTracker$1$1  reason: invalid class name */
                /* loaded from: classes3.dex */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements drO<View> {
                    AnonymousClass1(Object obj) {
                        super(0, obj, SignupFragment.class, "getView", "getView()Landroid/view/View;", 0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // o.drO
                    public final View invoke() {
                        return ((SignupFragment) this.receiver).getView();
                    }
                }
            });
        }
    }
}
