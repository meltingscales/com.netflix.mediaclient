package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.command.CloseCommand;
import com.netflix.cl.model.event.session.command.SubmitCommand;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaCta;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOffer;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferData;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaPresentAt;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.ums.UserMessageAreaThemedTooltip;
import com.netflix.mediaclient.ui.ums.UserMessageAreaView;
import dagger.Lazy;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.Iterator;
import java.util.List;
import o.AbstractC1608aHp;
import o.aIB;

/* renamed from: o.ccy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6423ccy {
    private final Lazy<InterfaceC5425byX> a;
    private final bXD b;
    private Long c;
    private final bRZ d;
    private final NetflixFrag e;
    private C6186cXa g;
    private Disposable i;
    private cWV m;
    private UserMessageAreaView n;
    private boolean h = false;
    private final BroadcastReceiver j = new BroadcastReceiver() { // from class: o.ccy.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetflixActivity o2 = C6423ccy.this.o();
            if (o2 == null || !o2.getServiceManager().c()) {
                return;
            }
            try {
                C6423ccy.this.e(o2);
            } catch (Exception e) {
                InterfaceC1598aHf.a(new C1596aHd("Unable to render UMA").b(ErrorType.s).d(e));
            }
        }
    };
    private final BroadcastReceiver f = new BroadcastReceiver() { // from class: o.ccy.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetflixActivity o2 = C6423ccy.this.o();
            if (o2 == null || !o2.getServiceManager().c()) {
                return;
            }
            C6423ccy.this.j();
        }
    };

    public boolean d() {
        return this.m != null;
    }

    public C6423ccy(bRZ brz, bXD bxd, Lazy<InterfaceC5425byX> lazy) {
        this.d = brz;
        this.e = (NetflixFrag) brz;
        this.b = bxd;
        this.a = lazy;
    }

    public void c() {
        LocalBroadcastManager.getInstance(this.e.requireActivity()).registerReceiver(this.j, new IntentFilter("RefreshUserMessageRequest.ACTION_UMA_MESSAGE_UPDATED"));
        LocalBroadcastManager.getInstance(this.e.requireActivity()).registerReceiver(this.f, new IntentFilter("RefreshUserMessageRequest.ACTION_DISMISS_UMA_MESSAGE"));
    }

    public void b() {
        LocalBroadcastManager.getInstance(this.e.requireActivity()).unregisterReceiver(this.j);
        LocalBroadcastManager.getInstance(this.e.requireActivity()).unregisterReceiver(this.f);
    }

    public void a() {
        UserMessageAreaView userMessageAreaView = this.n;
        if (userMessageAreaView != null) {
            userMessageAreaView.e(false);
            this.n = null;
        }
    }

    public void e(Context context) {
        UserMessageAreaView userMessageAreaView;
        C6186cXa c6186cXa;
        NetflixActivity o2;
        Fragment findFragmentByTag;
        C8166dfJ.b("SPY-18152: UMAs should only be removed on the main thread");
        if (!this.d.ac_() || this.h || this.d.ae_()) {
            return;
        }
        this.h = true;
        if (m() != null && m().c() && i() != null && (this.e.getView() instanceof ViewGroup)) {
            if (this.b.a()) {
                FragmentActivity f = f();
                InterfaceC5283bvo j = m().u().j();
                if (f == null || j == null) {
                    return;
                }
                this.b.a(f, j, this.e.getParentFragmentManager());
                return;
            }
            final UmaAlert x = m().x();
            Disposable disposable = this.i;
            if (disposable != null) {
                disposable.dispose();
                this.i = null;
            }
            if ((x == null || !x.bannerAlert() || x.suppressOnAppLaunch()) && (userMessageAreaView = this.n) != null) {
                userMessageAreaView.e(true);
                this.n = null;
            }
            if ((x == null || !x.modalAlert() || x.suppressOnAppLaunch()) && (c6186cXa = this.g) != null) {
                if (c6186cXa.isVisible()) {
                    this.g.dismiss();
                }
                this.g = null;
            }
            if (f() != null && f().getSupportFragmentManager() != null && (findFragmentByTag = f().getSupportFragmentManager().findFragmentByTag("UmaDialogFrag")) != this.g && (findFragmentByTag instanceof C6186cXa)) {
                ((C6186cXa) findFragmentByTag).dismiss();
            }
            if (x == null || x.isConsumed() || x.isStale() || !C6193cXh.d(context, x)) {
                this.h = false;
                return;
            } else if (x.presentAt() != null && x.presentAt().point() != UmaPresentAt.Point.LOLOMO) {
                return;
            } else {
                UmaMultiMonthOffer multiMonthOffer = x.multiMonthOffer();
                if (C8168dfL.h(x.flow()) || C8168dfL.h(x.mode())) {
                    x.setConsumed(true);
                    if (SignupConstants.Flow.DEMOGRAPHIC_SIMPLICITY.equals(x.flow()) && SignupConstants.Mode.DEMOGRAPHIC_INTERSTITIAL_LANDING.equals(x.mode())) {
                        this.a.get().a();
                    } else {
                        InterfaceC1597aHe.e("Unknown flow/mode combo in UMA: " + x.flow() + "/" + x.mode());
                        return;
                    }
                } else if (multiMonthOffer != null) {
                    UserMessageAreaView userMessageAreaView2 = this.n;
                    if (userMessageAreaView2 != null) {
                        userMessageAreaView2.e(true);
                        this.n = null;
                    }
                    C6186cXa c6186cXa2 = this.g;
                    if (c6186cXa2 != null && c6186cXa2.isVisible()) {
                        this.g.dismiss();
                        this.g = null;
                    }
                    UmaMultiMonthOfferData viewData = multiMonthOffer.viewData();
                    if (viewData != null) {
                        if ("banner".equalsIgnoreCase(viewData.viewType())) {
                            e(context, x);
                        } else {
                            b(x);
                        }
                    }
                } else {
                    if (x.bannerAlert()) {
                        UserMessageAreaView userMessageAreaView3 = this.n;
                        if (userMessageAreaView3 == null) {
                            if (x.getTemplateType() == UmaAlert.Template.THEMED_PROMO) {
                                this.n = C6198cXm.c.b(context, g());
                            } else {
                                this.n = new UserMessageAreaView(context, UserMessageAreaView.MessageType.BANNER);
                            }
                        } else {
                            userMessageAreaView3.e(x);
                        }
                        if (!x.suppressForBackgroundAction()) {
                            if (!this.n.isAttachedToWindow()) {
                                ViewParent parent = this.n.getParent();
                                if (parent instanceof ViewGroup) {
                                    InterfaceC1598aHf.a(new C1596aHd("SPY-14858 - banner uma parent is non-null").b(ErrorType.s));
                                    InterfaceC1593aHa.b("Uma Banner [SPY-14858] parent.removeView workaround");
                                    ((ViewGroup) parent).removeView(this.n);
                                }
                                this.n.a(x, i(), (ViewGroup) this.e.getView());
                            }
                        } else {
                            InterfaceC1593aHa.b("Uma Banner suppressed for background action");
                            this.n.e(false);
                            this.n = null;
                        }
                    }
                    if (x.modalAlert()) {
                        C6186cXa c6186cXa3 = this.g;
                        if (c6186cXa3 == null) {
                            C6186cXa d = C6186cXa.d(context, x, g());
                            this.g = d;
                            d.addDismissOrCancelListener(new NetflixDialogFrag.a() { // from class: o.ccy.1
                                @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag.a
                                public void a(NetflixDialogFrag netflixDialogFrag) {
                                    if (netflixDialogFrag == C6423ccy.this.g) {
                                        C6423ccy.this.g = null;
                                    }
                                }
                            });
                        } else {
                            c6186cXa3.d(x);
                        }
                        if (!x.suppressForBackgroundAction()) {
                            if (!this.g.isVisible()) {
                                this.g.d(o());
                            }
                        } else if (this.g.getDialog() != null && this.g.isVisible()) {
                            this.g.dismiss();
                        }
                    }
                    if (x.tooltipAlert() && !this.e.isHidden() && this.e.isResumed() && x.getTemplateType() == UmaAlert.Template.THEMED_PROMO && (o2 = o()) != null) {
                        ViewGroup viewGroup = (ViewGroup) o2.findViewById(16908290);
                        View findViewById = o2.findViewById(com.netflix.mediaclient.ui.R.g.eK);
                        if ((findViewById != null) & (viewGroup != null)) {
                            C6198cXm c = C6198cXm.c(context, g(), viewGroup, findViewById, UserMessageAreaThemedTooltip.TooltipDirection.e);
                            c.a(x);
                            this.n = c;
                            if (!x.suppressForBackgroundAction()) {
                                c.p();
                            }
                        }
                    }
                    if (!x.modalAlert() && !x.bannerAlert() && !x.tooltipAlert()) {
                        InterfaceC1598aHf.a(new C1596aHd("uma detected but could not be rendered, missing bannerAlert / modalAlert / tooltipAlert flag").b(ErrorType.s));
                    } else if (x.suppressForBackgroundAction()) {
                        final UserMessageAreaView userMessageAreaView4 = this.n;
                        if (userMessageAreaView4 == null) {
                            userMessageAreaView4 = this.g.a();
                        }
                        if (userMessageAreaView4 == null) {
                            InterfaceC1598aHf.a(new C1596aHd("umaView is null can't perform background action").b(ErrorType.s));
                        } else {
                            userMessageAreaView4.q().observeOn(AndroidSchedulers.mainThread()).take(1L).subscribe(new Observer<Boolean>() { // from class: o.ccy.3
                                @Override // io.reactivex.Observer
                                public void onComplete() {
                                }

                                @Override // io.reactivex.Observer
                                public void onSubscribe(Disposable disposable2) {
                                    C6423ccy.this.i = disposable2;
                                    userMessageAreaView4.e(C6423ccy.this.o(), x.backgroundAction());
                                }

                                @Override // io.reactivex.Observer
                                /* renamed from: c */
                                public void onNext(Boolean bool) {
                                    boolean z = (bool.booleanValue() && x.showOnBackgroundActionSuccess()) || !(bool.booleanValue() || x.showOnBackgroundActionSuccess());
                                    if (x.bannerAlert()) {
                                        if (z && C6423ccy.this.n != null) {
                                            C6423ccy.this.n.a(x, C6423ccy.this.i(), (ViewGroup) C6423ccy.this.e.getView());
                                        } else {
                                            C6423ccy.this.n = null;
                                        }
                                    }
                                    if (x.modalAlert()) {
                                        if (z && C6423ccy.this.g != null) {
                                            C6423ccy.this.g.d(C6423ccy.this.o());
                                        } else {
                                            C6423ccy.this.g = null;
                                        }
                                    }
                                    if (x.tooltipAlert()) {
                                        if (z && C6423ccy.this.n != null) {
                                            ((C6198cXm) C6423ccy.this.n).p();
                                        } else {
                                            C6423ccy.this.n = null;
                                        }
                                    }
                                }

                                @Override // io.reactivex.Observer
                                public void onError(Throwable th) {
                                    if (x.bannerAlert() && C6423ccy.this.n != null) {
                                        C6423ccy.this.n.a(x, C6423ccy.this.i(), (ViewGroup) C6423ccy.this.e.getView());
                                    }
                                    if (x.modalAlert() && C6423ccy.this.g != null) {
                                        C6423ccy.this.g.d(C6423ccy.this.o());
                                    }
                                    if (!x.tooltipAlert() || C6423ccy.this.n == null) {
                                        return;
                                    }
                                    ((C6198cXm) C6423ccy.this.n).p();
                                }
                            });
                        }
                    }
                }
            }
        }
        this.h = false;
    }

    private void e(Context context, final UmaAlert umaAlert) {
        if (this.m == null) {
            cWV cwv = new cWV(context);
            this.m = cwv;
            cwv.setUma(umaAlert);
            i().setHeaderView(this.m);
        }
        this.m.setDismissButtonListener(new View.OnClickListener() { // from class: o.ccE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6423ccy.this.c(umaAlert, view);
            }
        });
        this.m.setCtaButtonListener(new View.OnClickListener() { // from class: o.ccC
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6423ccy.this.e(umaAlert, view);
            }
        });
        umaAlert.setConsumed(true);
        i().scrollToPosition(0);
        this.d.aa_();
        this.d.ad_();
        final String bannerUmsAlertRenderFeedback = umaAlert.bannerUmsAlertRenderFeedback();
        if (!TextUtils.isEmpty(bannerUmsAlertRenderFeedback) && o() != null) {
            aIB.b(o(), new aIB.e() { // from class: o.ccD
                @Override // o.aIB.e
                public final void run(ServiceManager serviceManager) {
                    serviceManager.c(bannerUmsAlertRenderFeedback);
                }
            });
        }
        c(umaAlert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(UmaAlert umaAlert, View view) {
        e(umaAlert);
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(UmaAlert umaAlert, View view) {
        d(umaAlert);
        b(umaAlert);
    }

    private void d(UmaAlert umaAlert) {
        String str;
        List<UmaCta> bannerCtas = umaAlert.bannerCtas();
        if (bannerCtas != null) {
            Iterator<UmaCta> it = bannerCtas.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                UmaCta next = it.next();
                if (next != null && !"DISMISS".equals(next.action())) {
                    str = next.trackingInfo();
                    break;
                }
            }
            CLv2Utils.INSTANCE.e(new Focus(AppView.umsAlertButton, CLv2Utils.e(str)), new SubmitCommand());
        }
    }

    private void e(UmaAlert umaAlert) {
        String str;
        List<UmaCta> bannerCtas = umaAlert.bannerCtas();
        if (bannerCtas != null) {
            Iterator<UmaCta> it = bannerCtas.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                UmaCta next = it.next();
                if (next != null && "DISMISS".equals(next.action())) {
                    str = next.trackingInfo();
                    break;
                }
            }
            CLv2Utils.INSTANCE.e(new Focus(AppView.umsAlertButton, CLv2Utils.e(str)), new CloseCommand());
        }
    }

    private void c(UmaAlert umaAlert) {
        h();
        this.c = Logger.INSTANCE.startSession(new Presentation(AppView.umsAlert, CLv2Utils.e(umaAlert.bannerTrackingInfo())));
    }

    private void h() {
        Long l = this.c;
        if (l != null) {
            Logger.INSTANCE.endSession(l);
            this.c = null;
        }
    }

    private void l() {
        if (this.m != null) {
            i().setHeaderView(null);
            this.m = null;
        }
        this.d.aa_();
        if (o() != null && o().getNetflixActionBar() != null) {
            this.d.ad_();
        }
        h();
    }

    private void b(UmaAlert umaAlert) {
        l();
        NetflixActivity o2 = o();
        if (o2 != null) {
            umaAlert.setConsumed(true);
            C7017coI.a().d(AbstractC1608aHp.g.d).b(o2);
        }
    }

    private ImageResolutionClass g() {
        aOV g;
        ServiceManager m = m();
        if (m == null || (g = m.g()) == null) {
            return null;
        }
        return g.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        UserMessageAreaView userMessageAreaView = this.n;
        if (userMessageAreaView != null) {
            userMessageAreaView.e(true);
            this.n = null;
        }
        C6186cXa c6186cXa = this.g;
        if (c6186cXa != null) {
            if (c6186cXa.isVisible()) {
                this.g.dismissAllowingStateLoss();
            }
            this.g = null;
        }
    }

    public void e() {
        Disposable disposable = this.i;
        if (disposable != null) {
            disposable.dispose();
            this.i = null;
        }
        h();
    }

    private FragmentActivity f() {
        return this.e.getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NetflixActivity o() {
        return this.e.bj_();
    }

    private ServiceManager m() {
        return this.e.bl_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC6373ccA i() {
        return this.d.ab_();
    }
}
