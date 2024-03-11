package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Optional;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.Nb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1057Nb implements MembersInjector<NetflixActivity> {
    private final Provider<LoginApi> a;
    private final Provider<InterfaceC6675chl> b;
    private final Provider<Optional<DebugMenuItems>> c;
    private final Provider<InterfaceC7249cse> d;
    private final Provider<InterfaceC7303ctf> e;
    private final Provider<ServiceManager> f;
    private final Provider<InterfaceC5844cKl> g;
    private final Provider<InterfaceC1643aIx> h;
    private final Provider<cNT> i;
    private final Provider<InterfaceC5285bvq> j;
    private final Provider<InterfaceC8098ddv> k;
    private final Provider<InterfaceC7345cuU> n;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(NetflixActivity netflixActivity) {
        C1634aIo.d(netflixActivity, this.f.get());
        C1634aIo.a(netflixActivity, this.h.get());
        d(netflixActivity, this.d.get());
        c(netflixActivity, DoubleCheck.lazy(this.a));
        c(netflixActivity, this.b.get());
        c(netflixActivity, this.k.get());
        c(netflixActivity, this.n.get());
        a(netflixActivity, this.c.get());
        a(netflixActivity, this.j.get());
        b(netflixActivity, this.g.get());
        d(netflixActivity, DoubleCheck.lazy(this.i));
        e(netflixActivity, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.activity.NetflixActivity.downloadSummaryListener")
    public static void d(NetflixActivity netflixActivity, InterfaceC7249cse interfaceC7249cse) {
        netflixActivity.downloadSummaryListener = interfaceC7249cse;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.activity.NetflixActivity.loginApi")
    public static void c(NetflixActivity netflixActivity, Lazy<LoginApi> lazy) {
        netflixActivity.loginApi = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.activity.NetflixActivity.messaging")
    public static void c(NetflixActivity netflixActivity, InterfaceC6675chl interfaceC6675chl) {
        netflixActivity.messaging = interfaceC6675chl;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.activity.NetflixActivity.voip")
    public static void c(NetflixActivity netflixActivity, InterfaceC8098ddv interfaceC8098ddv) {
        netflixActivity.voip = interfaceC8098ddv;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.activity.NetflixActivity.tutorialHelperFactory")
    public static void c(NetflixActivity netflixActivity, InterfaceC7345cuU interfaceC7345cuU) {
        netflixActivity.tutorialHelperFactory = interfaceC7345cuU;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.activity.NetflixActivity.debugMenuItems")
    public static void a(NetflixActivity netflixActivity, Optional<DebugMenuItems> optional) {
        netflixActivity.debugMenuItems = optional;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.activity.NetflixActivity.shakeDetector")
    public static void a(NetflixActivity netflixActivity, InterfaceC5285bvq interfaceC5285bvq) {
        netflixActivity.shakeDetector = interfaceC5285bvq;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.activity.NetflixActivity.profileApi")
    public static void b(NetflixActivity netflixActivity, InterfaceC5844cKl interfaceC5844cKl) {
        netflixActivity.profileApi = interfaceC5844cKl;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.activity.NetflixActivity.profileSelectionLauncher")
    public static void d(NetflixActivity netflixActivity, Lazy<cNT> lazy) {
        netflixActivity.profileSelectionLauncher = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.activity.NetflixActivity.offlineApi")
    public static void e(NetflixActivity netflixActivity, InterfaceC7303ctf interfaceC7303ctf) {
        netflixActivity.offlineApi = interfaceC7303ctf;
    }
}
