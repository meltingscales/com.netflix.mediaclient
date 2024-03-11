package o;

import android.text.Spannable;
import android.text.Spanned;
import android.webkit.WebView;
import androidx.lifecycle.MutableLiveData;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel;
import com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesViewModel;
import com.netflix.mediaclient.acquisition.components.tou.TouPaymentViewModel;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.screens.creditDebit.EmvcoDataService;
import com.netflix.mediaclient.acquisition.screens.creditDebit.EmvcoEventLogger;
import com.netflix.mediaclient.acquisition.util.AUIWebViewUtilities;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import o.C6672chi;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* renamed from: o.chi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6672chi extends AbstractNetworkViewModel2 {
    private final EmvcoDataService a;
    private final String b;
    private final C6671chh c;
    private final EmvcoEventLogger d;
    private final KoreaCheckBoxesViewModel e;
    private final String f;
    private final C6670chg g;
    private final StringField h;
    private final FormViewEditTextViewModel i;
    private final C6674chk j;
    private final boolean k;
    private final boolean l;
    private final Spannable m;
    private final boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13727o;
    private final TouPaymentViewModel q;
    private final String r;

    public final EmvcoEventLogger a() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final FormViewEditTextViewModel d() {
        return this.i;
    }

    public final KoreaCheckBoxesViewModel e() {
        return this.e;
    }

    public final boolean f() {
        return this.k;
    }

    public final StringField g() {
        return this.h;
    }

    public final C6670chg h() {
        return this.g;
    }

    public final String i() {
        return this.f;
    }

    public final boolean j() {
        return this.f13727o;
    }

    public final String l() {
        return this.r;
    }

    public final TouPaymentViewModel m() {
        return this.q;
    }

    public final boolean o() {
        return this.l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6672chi(StringProvider stringProvider, C6674chk c6674chk, C6671chh c6671chh, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel, EmvcoDataService emvcoDataService, EmvcoEventLogger emvcoEventLogger, FormViewEditTextViewModel formViewEditTextViewModel, TouPaymentViewModel touPaymentViewModel, KoreaCheckBoxesViewModel koreaCheckBoxesViewModel) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        StringField e;
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) c6674chk, "");
        C8632dsu.c((Object) c6671chh, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        C8632dsu.c((Object) emvcoDataService, "");
        C8632dsu.c((Object) emvcoEventLogger, "");
        C8632dsu.c((Object) touPaymentViewModel, "");
        C8632dsu.c((Object) koreaCheckBoxesViewModel, "");
        this.j = c6674chk;
        this.c = c6671chh;
        this.a = emvcoDataService;
        this.d = emvcoEventLogger;
        this.i = formViewEditTextViewModel;
        this.q = touPaymentViewModel;
        this.e = koreaCheckBoxesViewModel;
        Spanned c = C8168dfL.c(touPaymentViewModel.getText());
        C8632dsu.d(c);
        this.m = (Spannable) c;
        this.n = touPaymentViewModel.isCheckboxVisible();
        this.g = c6674chk.c();
        StringField b = c6674chk.b();
        this.h = b;
        this.l = b != null;
        this.k = c6674chk.i();
        this.f = c6674chk.a().getSelectedMop();
        this.r = c6674chk.a().getUserDetails();
        boolean z = c6674chk.d() != null;
        this.f13727o = z;
        this.b = errorMessageViewModel.getText();
        if (!z || (e = c6674chk.e()) == null) {
            return;
        }
        e.setValue(emvcoDataService.getEmvco3dsAuthenticationWindowSize());
    }

    public final MutableLiveData<Boolean> k() {
        return this.c.b();
    }

    public final boolean b() {
        return (this.q.getHasAcceptedTermsOfUse() != null ? this.q.isAccepted() : true) && (this.q.getRightOfWithdrawal() != null ? this.q.getRightOfWithdrawalAccepted() : true);
    }

    public final void a(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        performAction(this.j.h(), k(), networkRequestResponseListener);
    }

    public final boolean n() {
        return this.j.h() == null;
    }

    public final String b(String str) {
        C8632dsu.c((Object) str, "");
        return this.a.buildDeviceDataCollectionFallbackUrl(str);
    }

    public final void e(String str) {
        StringField d;
        if (str == null || (d = this.j.d()) == null) {
            return;
        }
        d.setValue(str);
    }

    public final void d(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        final WebView webView = new WebView(netflixActivity);
        C1645aIz.a(netflixActivity, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.planSelectionAndConfirm.PlanSelectionAndConfirmViewModel$initEmvcoWebView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                d(serviceManager);
                return dpR.c;
            }

            public final void d(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                WebView webView2 = webView;
                C6672chi c6672chi = this;
                String m = serviceManager.k().m();
                C8632dsu.a(m, "");
                webView2.loadUrl(c6672chi.b(m));
                AUIWebViewUtilities aUIWebViewUtilities = AUIWebViewUtilities.INSTANCE;
                WebView webView3 = webView;
                final C6672chi c6672chi2 = this;
                drM<String, dpR> drm = new drM<String, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.planSelectionAndConfirm.PlanSelectionAndConfirmViewModel$initEmvcoWebView$1.1
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(String str) {
                        e(str);
                        return dpR.c;
                    }

                    public final void e(String str) {
                        C6672chi.this.a().onReceiveJwt(str);
                    }
                };
                final C6672chi c6672chi3 = this;
                AUIWebViewUtilities.initWebView$default(aUIWebViewUtilities, webView3, new AUIWebViewUtilities.BridgeMethods.Emvco(drm, new drM<String, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.planSelectionAndConfirm.PlanSelectionAndConfirmViewModel$initEmvcoWebView$1.2
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(String str) {
                        b(str);
                        return dpR.c;
                    }

                    public final void b(String str) {
                        C6672chi.this.a().onReceiveFallbackData(str);
                        C6672chi.this.e(str);
                    }
                }, null, 4, null), false, 4, null);
            }
        });
    }
}
