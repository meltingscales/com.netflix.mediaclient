package o;

import com.netflix.mediaclient.latencytracker.api.UiLatencyMarker;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.launch.LaunchActivity;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Optional;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bZd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4179bZd implements MembersInjector<LaunchActivity> {
    private final Provider<InterfaceC7249cse> a;
    private final Provider<bEX> b;
    private final Provider<InterfaceC3859bNh> c;
    private final Provider<Optional<DebugMenuItems>> d;
    private final Provider<bEY> e;
    private final Provider<InterfaceC6675chl> f;
    private final Provider<UiLatencyMarker> g;
    private final Provider<InterfaceC6713ciW> h;
    private final Provider<LoginApi> i;
    private final Provider<LoginApi> j;
    private final Provider<InterfaceC5844cKl> k;
    private final Provider<InterfaceC7303ctf> l;
    private final Provider<C4187bZl> m;
    private final Provider<InterfaceC5844cKl> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<InterfaceC7084cpY> f13557o;
    private final Provider<ServiceManager> p;
    private final Provider<InterfaceC1643aIx> q;
    private final Provider<cNT> r;
    private final Provider<cNT> s;
    private final Provider<InterfaceC5285bvq> t;
    private final Provider<InterfaceC7345cuU> u;
    private final Provider<InterfaceC8098ddv> y;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(LaunchActivity launchActivity) {
        C1634aIo.d(launchActivity, this.p.get());
        C1634aIo.a(launchActivity, this.q.get());
        C1057Nb.d(launchActivity, this.a.get());
        C1057Nb.c(launchActivity, DoubleCheck.lazy(this.j));
        C1057Nb.c(launchActivity, this.f.get());
        C1057Nb.c(launchActivity, this.y.get());
        C1057Nb.c(launchActivity, this.u.get());
        C1057Nb.a(launchActivity, this.d.get());
        C1057Nb.a(launchActivity, this.t.get());
        C1057Nb.b(launchActivity, this.k.get());
        C1057Nb.d(launchActivity, DoubleCheck.lazy(this.r));
        C1057Nb.e(launchActivity, this.l.get());
        d(launchActivity, this.m.get());
        c(launchActivity, this.g.get());
        e(launchActivity, this.n.get());
        a(launchActivity, this.f13557o.get());
        c(launchActivity, this.i.get());
        b(launchActivity, this.s.get());
        e(launchActivity, this.b.get());
        a(launchActivity, this.e.get());
        b(launchActivity, this.c.get());
        e(launchActivity, this.h.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.launch.LaunchActivity.profileGatePolicy")
    public static void d(LaunchActivity launchActivity, C4187bZl c4187bZl) {
        launchActivity.profileGatePolicy = c4187bZl;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.launch.LaunchActivity.latencyMarker")
    public static void c(LaunchActivity launchActivity, UiLatencyMarker uiLatencyMarker) {
        launchActivity.latencyMarker = uiLatencyMarker;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.launch.LaunchActivity.profileApi")
    public static void e(LaunchActivity launchActivity, InterfaceC5844cKl interfaceC5844cKl) {
        launchActivity.profileApi = interfaceC5844cKl;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.launch.LaunchActivity.notificationsUi")
    public static void a(LaunchActivity launchActivity, InterfaceC7084cpY interfaceC7084cpY) {
        launchActivity.notificationsUi = interfaceC7084cpY;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.launch.LaunchActivity.loginApi")
    public static void c(LaunchActivity launchActivity, LoginApi loginApi) {
        launchActivity.loginApi = loginApi;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.launch.LaunchActivity.profileSelectionLauncher")
    public static void b(LaunchActivity launchActivity, cNT cnt) {
        launchActivity.profileSelectionLauncher = cnt;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.launch.LaunchActivity.deepLinkHandler")
    public static void e(LaunchActivity launchActivity, bEX bex) {
        launchActivity.deepLinkHandler = bex;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.launch.LaunchActivity.deepLinkUtils")
    public static void a(LaunchActivity launchActivity, bEY bey) {
        launchActivity.deepLinkUtils = bey;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.launch.LaunchActivity.gameControllerMagicPathInboundNavigation")
    public static void b(LaunchActivity launchActivity, InterfaceC3859bNh interfaceC3859bNh) {
        launchActivity.gameControllerMagicPathInboundNavigation = interfaceC3859bNh;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.launch.LaunchActivity.gameControllerRunState")
    public static void e(LaunchActivity launchActivity, InterfaceC6713ciW interfaceC6713ciW) {
        launchActivity.gameControllerRunState = interfaceC6713ciW;
    }
}
