package o;

import com.netflix.mediaclient.latencytracker.api.UiLatencyMarker;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.home.HomeActivity;
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
/* loaded from: classes4.dex */
public final class bRY implements MembersInjector<HomeActivity> {
    private final Provider<InterfaceC3854bNc> a;
    private final Provider<InterfaceC3853bNb> b;
    private final Provider<Optional<DebugMenuItems>> c;
    private final Provider<InterfaceC3993bSg> d;
    private final Provider<InterfaceC7249cse> e;
    private final Provider<UiLatencyMarker> f;
    private final Provider<LoginApi> g;
    private final Provider<InterfaceC6905cmC> h;
    private final Provider<bXD> i;
    private final Provider<InterfaceC6675chl> j;
    private final Provider<InterfaceC5844cKl> k;
    private final Provider<InterfaceC7088cpc> l;
    private final Provider<InterfaceC7303ctf> m;
    private final Provider<InterfaceC7090cpe> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<cNT> f13535o;
    private final Provider<cNT> p;
    private final Provider<InterfaceC1643aIx> q;
    private final Provider<InterfaceC6083cTf> r;
    private final Provider<InterfaceC6068cSu> s;
    private final Provider<ServiceManager> t;
    private final Provider<InterfaceC7345cuU> v;
    private final Provider<InterfaceC8098ddv> w;
    private final Provider<InterfaceC5285bvq> x;
    private final Provider<InterfaceC8351dij> y;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(HomeActivity homeActivity) {
        C1634aIo.d(homeActivity, this.t.get());
        C1634aIo.a(homeActivity, this.q.get());
        C1057Nb.d(homeActivity, this.e.get());
        C1057Nb.c(homeActivity, DoubleCheck.lazy(this.g));
        C1057Nb.c(homeActivity, this.j.get());
        C1057Nb.c(homeActivity, this.w.get());
        C1057Nb.c(homeActivity, this.v.get());
        C1057Nb.a(homeActivity, this.c.get());
        C1057Nb.a(homeActivity, this.x.get());
        C1057Nb.b(homeActivity, this.k.get());
        C1057Nb.d(homeActivity, DoubleCheck.lazy(this.f13535o));
        C1057Nb.e(homeActivity, this.m.get());
        a(homeActivity, this.f.get());
        a(homeActivity, this.d.get());
        a(homeActivity, DoubleCheck.lazy(this.r));
        b(homeActivity, this.s.get());
        c(homeActivity, this.p.get());
        c(homeActivity, this.n.get());
        c(homeActivity, DoubleCheck.lazy(this.l));
        c(homeActivity, this.b.get());
        c(homeActivity, this.i.get());
        a(homeActivity, this.h.get());
        e(homeActivity, this.a.get());
        b(homeActivity, DoubleCheck.lazy(this.y));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.HomeActivity.latencyMarker")
    public static void a(HomeActivity homeActivity, UiLatencyMarker uiLatencyMarker) {
        homeActivity.latencyMarker = uiLatencyMarker;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.HomeActivity.home")
    public static void a(HomeActivity homeActivity, InterfaceC3993bSg interfaceC3993bSg) {
        homeActivity.home = interfaceC3993bSg;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.HomeActivity.searchRepositoryFactory")
    public static void a(HomeActivity homeActivity, Lazy<InterfaceC6083cTf> lazy) {
        homeActivity.searchRepositoryFactory = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.HomeActivity.search")
    public static void b(HomeActivity homeActivity, InterfaceC6068cSu interfaceC6068cSu) {
        homeActivity.search = interfaceC6068cSu;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.HomeActivity.profileSelectionLauncher")
    public static void c(HomeActivity homeActivity, cNT cnt) {
        homeActivity.profileSelectionLauncher = cnt;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.HomeActivity.notificationPermission")
    public static void c(HomeActivity homeActivity, InterfaceC7090cpe interfaceC7090cpe) {
        homeActivity.notificationPermission = interfaceC7090cpe;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.HomeActivity.notificationPermissionApplication")
    public static void c(HomeActivity homeActivity, Lazy<InterfaceC7088cpc> lazy) {
        homeActivity.notificationPermissionApplication = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.HomeActivity.createBeaconWatcher")
    public static void c(HomeActivity homeActivity, InterfaceC3853bNb interfaceC3853bNb) {
        homeActivity.createBeaconWatcher = interfaceC3853bNb;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.HomeActivity.interstitials")
    public static void c(HomeActivity homeActivity, bXD bxd) {
        homeActivity.interstitials = bxd;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.HomeActivity.mylist")
    public static void a(HomeActivity homeActivity, InterfaceC6905cmC interfaceC6905cmC) {
        homeActivity.mylist = interfaceC6905cmC;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.HomeActivity.dismissedBeaconWatcher")
    public static void e(HomeActivity homeActivity, InterfaceC3854bNc interfaceC3854bNc) {
        homeActivity.dismissedBeaconWatcher = interfaceC3854bNc;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.HomeActivity.uxConfig")
    public static void b(HomeActivity homeActivity, Lazy<InterfaceC8351dij> lazy) {
        homeActivity.uxConfig = lazy;
    }
}
