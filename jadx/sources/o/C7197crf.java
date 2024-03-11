package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen;
import com.netflix.mediaclient.ui.nux.impl.NewUserExperienceImpl$subscribe$1;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import o.AbstractC7200cri;
import o.C7193crb;
import o.C7197crf;
import o.C8632dsu;
import o.C9935zP;
import o.InterfaceC6675chl;
import o.dpR;

/* renamed from: o.crf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7197crf implements InterfaceC7194crc {
    public static final a d = new a(null);
    private final InterfaceC6675chl a;
    private final C9935zP b;
    private final NetflixActivity e;

    @Inject
    public C7197crf(Activity activity, InterfaceC6675chl interfaceC6675chl) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC6675chl, "");
        this.a = interfaceC6675chl;
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(activity, NetflixActivity.class);
        this.e = netflixActivity;
        this.b = C9935zP.b.d(netflixActivity);
        b();
        netflixActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.nux.impl.NewUserExperienceImpl$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                C8632dsu.c((Object) lifecycleOwner, "");
                C7193crb.d.a();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                InterfaceC6675chl interfaceC6675chl2;
                C8632dsu.c((Object) lifecycleOwner, "");
                interfaceC6675chl2 = C7197crf.this.a;
                InterfaceC6675chl.a.e(interfaceC6675chl2, "NewUserExperienceScreen", null, 2, null);
                C7193crb.d.a();
            }
        });
    }

    /* renamed from: o.crf$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("NewUserExperienceImpl");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.InterfaceC7194crc
    public boolean c() {
        C1645aIz.a(this.e, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.nux.impl.NewUserExperienceImpl$showNux$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                d(serviceManager);
                return dpR.c;
            }

            public final void d(ServiceManager serviceManager) {
                InterfaceC6675chl interfaceC6675chl;
                C9935zP c9935zP;
                MessagingTooltipScreen bVar;
                C9935zP c9935zP2;
                NetflixActivity netflixActivity;
                C8632dsu.c((Object) serviceManager, "");
                interfaceC6675chl = C7197crf.this.a;
                if (ConfigFastPropertyFeatureControlConfig.Companion.u()) {
                    c9935zP2 = C7197crf.this.b;
                    boolean H = serviceManager.H();
                    netflixActivity = C7197crf.this.e;
                    bVar = new AbstractC7200cri.c(c9935zP2, H, netflixActivity instanceof HomeActivity);
                } else {
                    c9935zP = C7197crf.this.b;
                    bVar = new AbstractC7200cri.b(c9935zP);
                }
                interfaceC6675chl.e(bVar, (Integer) null, true);
            }
        });
        return true;
    }

    public final AbstractC7200cri.b d() {
        return new AbstractC7200cri.b(this.b);
    }

    public final AbstractC7200cri a() {
        C1645aIz.a(this.e, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.nux.impl.NewUserExperienceImpl$createNewUserExperienceTooltipWithRedDotV2$1
            public final void d(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                d(serviceManager);
                return dpR.c;
            }
        });
        return new AbstractC7200cri.c(this.b, this.e.getServiceManager().H(), this.e instanceof HomeActivity);
    }

    @SuppressLint({"CheckResult"})
    private final void b() {
        Observable distinctUntilChanged = this.b.d(AbstractC7196cre.class).distinctUntilChanged();
        final NewUserExperienceImpl$subscribe$1 newUserExperienceImpl$subscribe$1 = new NewUserExperienceImpl$subscribe$1(this);
        distinctUntilChanged.subscribe(new Consumer() { // from class: o.crg
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7197crf.a(drM.this, obj);
            }
        });
    }
}
