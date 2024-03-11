package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaPresentAt;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.ums.UserMessageAreaView;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

/* renamed from: o.daO  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7906daO {
    private C6186cXa a;
    private Disposable d;
    private final NetflixFrag e;
    private final InterfaceC6675chl g;
    private boolean b = false;
    private final BroadcastReceiver f = new BroadcastReceiver() { // from class: o.daO.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetflixActivity h = C7906daO.this.h();
            if (h == null || !h.getServiceManager().c()) {
                return;
            }
            try {
                C7906daO.this.c(h);
            } catch (Exception e) {
                InterfaceC1598aHf.a(new C1596aHd("Unable to render UMA").b(ErrorType.s).d(e));
            }
        }
    };
    private final BroadcastReceiver c = new BroadcastReceiver() { // from class: o.daO.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetflixActivity h = C7906daO.this.h();
            if (h == null || !h.getServiceManager().c()) {
                return;
            }
            C7906daO.this.a();
        }
    };

    public C7906daO(NetflixFrag netflixFrag, InterfaceC6675chl interfaceC6675chl) {
        this.e = netflixFrag;
        this.g = interfaceC6675chl;
    }

    public void b() {
        LocalBroadcastManager.getInstance(this.e.requireActivity()).registerReceiver(this.f, new IntentFilter("RefreshUserMessageRequest.ACTION_UMA_MESSAGE_UPDATED"));
        LocalBroadcastManager.getInstance(this.e.requireActivity()).registerReceiver(this.c, new IntentFilter("RefreshUserMessageRequest.ACTION_DISMISS_UMA_MESSAGE"));
    }

    public void d() {
        LocalBroadcastManager.getInstance(this.e.requireActivity()).unregisterReceiver(this.f);
        LocalBroadcastManager.getInstance(this.e.requireActivity()).unregisterReceiver(this.c);
    }

    private boolean e(UmaAlert umaAlert) {
        if (umaAlert == null) {
            return true;
        }
        return umaAlert.modalAlert();
    }

    public void c(Context context) {
        C6186cXa c6186cXa;
        C8166dfJ.b("SPY-18152: UMAs should only be removed on the main thread");
        if (this.g.d() || this.b) {
            return;
        }
        this.b = true;
        if (f() != null && f().c() && (this.e.getView() instanceof ViewGroup)) {
            final UmaAlert x = f().x();
            if (!e(x)) {
                this.b = false;
                return;
            }
            Disposable disposable = this.d;
            if (disposable != null) {
                disposable.dispose();
                this.d = null;
            }
            if ((x == null || !x.modalAlert() || x.suppressOnAppLaunch()) && (c6186cXa = this.a) != null) {
                if (c6186cXa.isVisible()) {
                    this.a.dismiss();
                }
                this.a = null;
            }
            if (c() != null) {
                c().getSupportFragmentManager();
                Fragment findFragmentByTag = c().getSupportFragmentManager().findFragmentByTag("UmaDialogFrag");
                if (findFragmentByTag != this.a && (findFragmentByTag instanceof C6186cXa)) {
                    ((C6186cXa) findFragmentByTag).dismiss();
                }
            }
            if (x == null || x.isConsumed() || x.isStale() || !C6193cXh.d(context, x)) {
                this.b = false;
                return;
            } else if (x.presentAt() != null && x.presentAt().point() != UmaPresentAt.Point.LOLOMO) {
                return;
            } else {
                if (C8168dfL.h(x.flow()) || C8168dfL.h(x.mode())) {
                    x.setConsumed(true);
                    return;
                }
                if (x.modalAlert()) {
                    C6186cXa c6186cXa2 = this.a;
                    if (c6186cXa2 == null) {
                        C6186cXa d = C6186cXa.d(context, x, i());
                        this.a = d;
                        d.addDismissOrCancelListener(new NetflixDialogFrag.a() { // from class: o.daO.3
                            @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag.a
                            public void a(NetflixDialogFrag netflixDialogFrag) {
                                if (netflixDialogFrag == C7906daO.this.a) {
                                    C7906daO.this.a = null;
                                }
                            }
                        });
                    } else {
                        c6186cXa2.d(x);
                    }
                    if (!x.suppressForBackgroundAction()) {
                        if (!this.a.isVisible()) {
                            this.a.d(h());
                        }
                    } else if (this.a.getDialog() != null && this.a.isVisible()) {
                        this.a.dismiss();
                    }
                }
                if (!x.modalAlert() && !x.bannerAlert() && !x.tooltipAlert()) {
                    InterfaceC1598aHf.a(new C1596aHd("uma detected but could not be rendered, missing bannerAlert / modalAlert / tooltipAlert flag").b(ErrorType.s));
                } else if (x.suppressForBackgroundAction()) {
                    final UserMessageAreaView a = this.a.a();
                    if (a == null) {
                        InterfaceC1598aHf.a(new C1596aHd("umaView is null can't perform background action").b(ErrorType.s));
                    } else {
                        a.q().observeOn(AndroidSchedulers.mainThread()).take(1L).subscribe(new Observer<Boolean>() { // from class: o.daO.4
                            @Override // io.reactivex.Observer
                            public void onComplete() {
                            }

                            @Override // io.reactivex.Observer
                            public void onSubscribe(Disposable disposable2) {
                                C7906daO.this.d = disposable2;
                                a.e(C7906daO.this.h(), x.backgroundAction());
                            }

                            @Override // io.reactivex.Observer
                            /* renamed from: a */
                            public void onNext(Boolean bool) {
                                boolean z = (bool.booleanValue() && x.showOnBackgroundActionSuccess()) || !(bool.booleanValue() || x.showOnBackgroundActionSuccess());
                                if (x.modalAlert()) {
                                    if (z && C7906daO.this.a != null) {
                                        C7906daO.this.a.d(C7906daO.this.h());
                                    } else {
                                        C7906daO.this.a = null;
                                    }
                                }
                            }

                            @Override // io.reactivex.Observer
                            public void onError(Throwable th) {
                                if (!x.modalAlert() || C7906daO.this.a == null) {
                                    return;
                                }
                                C7906daO.this.a.d(C7906daO.this.h());
                            }
                        });
                    }
                }
            }
        }
        this.b = false;
    }

    private ImageResolutionClass i() {
        aOV g;
        ServiceManager f = f();
        if (f == null || (g = f.g()) == null) {
            return null;
        }
        return g.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        C6186cXa c6186cXa = this.a;
        if (c6186cXa != null) {
            if (c6186cXa.isVisible()) {
                this.a.dismissAllowingStateLoss();
            }
            this.a = null;
        }
    }

    public void e() {
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.dispose();
            this.d = null;
        }
    }

    private FragmentActivity c() {
        return this.e.getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NetflixActivity h() {
        return this.e.bj_();
    }

    private ServiceManager f() {
        return this.e.bl_();
    }
}
