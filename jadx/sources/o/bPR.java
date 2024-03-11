package o;

import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.ui.games.impl.gdp.TrailerAutoPlay", "com.netflix.mediaclient.ui.games.impl.gdp.BillBoardAutoPlay"})
/* loaded from: classes4.dex */
public final class bPR implements MembersInjector<GdpFragment> {
    private final Provider<bLW> a;
    private final Provider<C3909bPd> b;
    private final Provider<C9935zP> c;
    private final Provider<bNS> d;
    private final Provider<bPG> e;
    private final Provider<TrackingInfoHolder> f;
    private final Provider<InterfaceC1573aGh> g;
    private final Provider<MiniPlayerVideoGroupViewModel> h;
    private final Provider<bLW> i;
    private final Provider<InterfaceC1126Pr> j;
    private final Provider<C1619aI> l;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(GdpFragment gdpFragment) {
        C1092Oj.e(gdpFragment, this.g);
        a(gdpFragment, this.l.get());
        e(gdpFragment, DoubleCheck.lazy(this.i));
        c(gdpFragment, DoubleCheck.lazy(this.a));
        c(gdpFragment, this.b.get());
        e(gdpFragment, this.f.get());
        b(gdpFragment, this.c.get());
        d(gdpFragment, DoubleCheck.lazy(this.h));
        d(gdpFragment, this.j.get());
        b(gdpFragment, this.e.get());
        e(gdpFragment, this.d.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment.visibilityTracker")
    public static void a(GdpFragment gdpFragment, C1619aI c1619aI) {
        gdpFragment.visibilityTracker = c1619aI;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment.trailerAutoPlay")
    public static void e(GdpFragment gdpFragment, Lazy<bLW> lazy) {
        gdpFragment.trailerAutoPlay = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment.billBoardAutoPlay")
    public static void c(GdpFragment gdpFragment, Lazy<bLW> lazy) {
        gdpFragment.billBoardAutoPlay = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment.gdpCl")
    public static void c(GdpFragment gdpFragment, C3909bPd c3909bPd) {
        gdpFragment.gdpCl = c3909bPd;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment.trackingInfoHolder")
    public static void e(GdpFragment gdpFragment, TrackingInfoHolder trackingInfoHolder) {
        gdpFragment.trackingInfoHolder = trackingInfoHolder;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment.eventBusFactory")
    public static void b(GdpFragment gdpFragment, C9935zP c9935zP) {
        gdpFragment.eventBusFactory = c9935zP;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment.miniPlayerViewModelField")
    public static void d(GdpFragment gdpFragment, Lazy<MiniPlayerVideoGroupViewModel> lazy) {
        gdpFragment.miniPlayerViewModelField = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment.sharing")
    public static void d(GdpFragment gdpFragment, InterfaceC1126Pr interfaceC1126Pr) {
        gdpFragment.sharing = interfaceC1126Pr;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment.epoxyControllerFactory")
    public static void b(GdpFragment gdpFragment, bPG bpg) {
        gdpFragment.epoxyControllerFactory = bpg;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment.gameInstallation")
    public static void e(GdpFragment gdpFragment, bNS bns) {
        gdpFragment.gameInstallation = bns;
    }
}
