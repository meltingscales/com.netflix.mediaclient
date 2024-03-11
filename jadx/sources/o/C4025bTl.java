package o;

import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bTl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4025bTl implements MembersInjector<FeedLolomoFragment> {
    private final Provider<InterfaceC1573aGh> B;
    private final Provider<cYB> C;
    private final Provider<CollectTaste> a;
    private final Provider<InterfaceC5304bwI> b;
    private final Provider<InterfaceC5425byX> c;
    private final Provider<InterfaceC7407cvd> d;
    private final Provider<InterfaceC5303bwH> e;
    private final Provider<bNS> f;
    private final Provider<bNT> g;
    private final Provider<bNN> h;
    private final Provider<bNP> i;
    private final Provider<bNL> j;
    private final Provider<bNS> k;
    private final Provider<bNR> l;
    private final Provider<InterfaceC3994bSh> m;
    private final Provider<bXD> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<bNV> f13546o;
    private final Provider<InterfaceC6675chl> p;
    private final Provider<InterfaceC5840cKh> q;
    private final Provider<dwQ> r;
    private final Provider<InterfaceC7089cpd> s;
    private final Provider<InterfaceC6905cmC> t;
    private final Provider<InterfaceC1126Pr> u;
    private final Provider<PlaybackLauncher> v;
    private final Provider<InterfaceC5844cKl> w;
    private final Provider<InterfaceC4360bcz> x;
    private final Provider<InterfaceC7090cpe> y;
    private final Provider<cWC> z;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(FeedLolomoFragment feedLolomoFragment) {
        C1092Oj.e(feedLolomoFragment, this.B);
        C4047bUg.b(feedLolomoFragment, DoubleCheck.lazy(this.a));
        C4047bUg.a(feedLolomoFragment, DoubleCheck.lazy(this.h));
        C4047bUg.h(feedLolomoFragment, DoubleCheck.lazy(this.f));
        C4047bUg.f(feedLolomoFragment, DoubleCheck.lazy(this.f13546o));
        C4047bUg.i(feedLolomoFragment, DoubleCheck.lazy(this.l));
        C4047bUg.j(feedLolomoFragment, DoubleCheck.lazy(this.g));
        C4047bUg.d(feedLolomoFragment, DoubleCheck.lazy(this.d));
        C4047bUg.d(feedLolomoFragment, this.e.get());
        C4047bUg.a(feedLolomoFragment, this.t.get());
        C4047bUg.a(feedLolomoFragment, this.i.get());
        C4047bUg.g(feedLolomoFragment, DoubleCheck.lazy(this.q));
        C4047bUg.n(feedLolomoFragment, DoubleCheck.lazy(this.C));
        C4047bUg.c(feedLolomoFragment, DoubleCheck.lazy(this.j));
        C4047bUg.d(feedLolomoFragment, this.r.get());
        C4047bUg.a(feedLolomoFragment, this.w.get());
        C4047bUg.d(feedLolomoFragment, this.x.get());
        C4047bUg.c(feedLolomoFragment, this.p.get());
        C4047bUg.d(feedLolomoFragment, this.m.get());
        C4047bUg.e(feedLolomoFragment, this.b.get());
        C4047bUg.a(feedLolomoFragment, this.z.get());
        C4047bUg.d(feedLolomoFragment, this.n.get());
        C4047bUg.e(feedLolomoFragment, DoubleCheck.lazy(this.c));
        e(feedLolomoFragment, this.u.get());
        d(feedLolomoFragment, this.y.get());
        e(feedLolomoFragment, this.s.get());
        d(feedLolomoFragment, DoubleCheck.lazy(this.k));
        c(feedLolomoFragment, DoubleCheck.lazy(this.v));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment.sharing")
    public static void e(FeedLolomoFragment feedLolomoFragment, InterfaceC1126Pr interfaceC1126Pr) {
        feedLolomoFragment.sharing = interfaceC1126Pr;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment.notificationPermission")
    public static void d(FeedLolomoFragment feedLolomoFragment, InterfaceC7090cpe interfaceC7090cpe) {
        feedLolomoFragment.notificationPermission = interfaceC7090cpe;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment.notificationPermissionHelper")
    public static void e(FeedLolomoFragment feedLolomoFragment, InterfaceC7089cpd interfaceC7089cpd) {
        feedLolomoFragment.notificationPermissionHelper = interfaceC7089cpd;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment.gamesInstallation")
    public static void d(FeedLolomoFragment feedLolomoFragment, Lazy<bNS> lazy) {
        feedLolomoFragment.gamesInstallation = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment.playbackLauncher")
    public static void c(FeedLolomoFragment feedLolomoFragment, Lazy<PlaybackLauncher> lazy) {
        feedLolomoFragment.playbackLauncher = lazy;
    }
}
