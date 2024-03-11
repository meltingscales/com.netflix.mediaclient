package o;

import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"com.netflix.common.di.IO"})
/* renamed from: o.bUg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4047bUg implements MembersInjector<LolomoMvRxFragment> {
    private final Provider<InterfaceC5304bwI> a;
    private final Provider<InterfaceC5425byX> b;
    private final Provider<CollectTaste> c;
    private final Provider<InterfaceC7407cvd> d;
    private final Provider<InterfaceC5303bwH> e;
    private final Provider<bNS> f;
    private final Provider<bNN> g;
    private final Provider<bNT> h;
    private final Provider<bNL> i;
    private final Provider<bNP> j;
    private final Provider<InterfaceC3994bSh> k;
    private final Provider<bNR> l;
    private final Provider<bNV> m;
    private final Provider<dwQ> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<bXD> f13547o;
    private final Provider<InterfaceC5844cKl> p;
    private final Provider<InterfaceC5840cKh> q;
    private final Provider<InterfaceC6905cmC> r;
    private final Provider<InterfaceC6675chl> s;
    private final Provider<InterfaceC4360bcz> t;
    private final Provider<cYB> w;
    private final Provider<InterfaceC1573aGh> x;
    private final Provider<cWC> y;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(LolomoMvRxFragment lolomoMvRxFragment) {
        C1092Oj.e(lolomoMvRxFragment, this.x);
        b(lolomoMvRxFragment, DoubleCheck.lazy(this.c));
        a(lolomoMvRxFragment, DoubleCheck.lazy(this.g));
        h(lolomoMvRxFragment, DoubleCheck.lazy(this.f));
        f(lolomoMvRxFragment, DoubleCheck.lazy(this.m));
        i(lolomoMvRxFragment, DoubleCheck.lazy(this.l));
        j(lolomoMvRxFragment, DoubleCheck.lazy(this.h));
        d(lolomoMvRxFragment, DoubleCheck.lazy(this.d));
        d(lolomoMvRxFragment, this.e.get());
        a(lolomoMvRxFragment, this.r.get());
        a(lolomoMvRxFragment, this.j.get());
        g(lolomoMvRxFragment, DoubleCheck.lazy(this.q));
        n(lolomoMvRxFragment, DoubleCheck.lazy(this.w));
        c(lolomoMvRxFragment, DoubleCheck.lazy(this.i));
        d(lolomoMvRxFragment, this.n.get());
        a(lolomoMvRxFragment, this.p.get());
        d(lolomoMvRxFragment, this.t.get());
        c(lolomoMvRxFragment, this.s.get());
        d(lolomoMvRxFragment, this.k.get());
        e(lolomoMvRxFragment, this.a.get());
        a(lolomoMvRxFragment, this.y.get());
        d(lolomoMvRxFragment, this.f13547o.get());
        e(lolomoMvRxFragment, DoubleCheck.lazy(this.b));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.collectTaste")
    public static void b(LolomoMvRxFragment lolomoMvRxFragment, Lazy<CollectTaste> lazy) {
        lolomoMvRxFragment.collectTaste = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.gameModels")
    public static void a(LolomoMvRxFragment lolomoMvRxFragment, Lazy<bNN> lazy) {
        lolomoMvRxFragment.gameModels = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.gamesInstallationAndLaunch")
    public static void h(LolomoMvRxFragment lolomoMvRxFragment, Lazy<bNS> lazy) {
        lolomoMvRxFragment.gamesInstallationAndLaunch = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.gamesUtils")
    public static void f(LolomoMvRxFragment lolomoMvRxFragment, Lazy<bNV> lazy) {
        lolomoMvRxFragment.gamesUtils = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.gamesTab")
    public static void i(LolomoMvRxFragment lolomoMvRxFragment, Lazy<bNR> lazy) {
        lolomoMvRxFragment.gamesTab = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.gamesIdentity")
    public static void j(LolomoMvRxFragment lolomoMvRxFragment, Lazy<bNT> lazy) {
        lolomoMvRxFragment.gamesIdentity = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.downloadedForYou")
    public static void d(LolomoMvRxFragment lolomoMvRxFragment, Lazy<InterfaceC7407cvd> lazy) {
        lolomoMvRxFragment.downloadedForYou = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.adsPlan")
    public static void d(LolomoMvRxFragment lolomoMvRxFragment, InterfaceC5303bwH interfaceC5303bwH) {
        lolomoMvRxFragment.adsPlan = interfaceC5303bwH;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.myList")
    public static void a(LolomoMvRxFragment lolomoMvRxFragment, InterfaceC6905cmC interfaceC6905cmC) {
        lolomoMvRxFragment.myList = interfaceC6905cmC;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.gamesInMyList")
    public static void a(LolomoMvRxFragment lolomoMvRxFragment, bNP bnp) {
        lolomoMvRxFragment.gamesInMyList = bnp;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.myNetflixLolomo")
    public static void g(LolomoMvRxFragment lolomoMvRxFragment, Lazy<InterfaceC5840cKh> lazy) {
        lolomoMvRxFragment.myNetflixLolomo = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.upNextGps")
    public static void n(LolomoMvRxFragment lolomoMvRxFragment, Lazy<cYB> lazy) {
        lolomoMvRxFragment.upNextGps = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.gamesAssetFetcher")
    public static void c(LolomoMvRxFragment lolomoMvRxFragment, Lazy<bNL> lazy) {
        lolomoMvRxFragment.gamesAssetFetcher = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.ioDispatcher")
    public static void d(LolomoMvRxFragment lolomoMvRxFragment, dwQ dwq) {
        lolomoMvRxFragment.ioDispatcher = dwq;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.profileApi")
    public static void a(LolomoMvRxFragment lolomoMvRxFragment, InterfaceC5844cKl interfaceC5844cKl) {
        lolomoMvRxFragment.profileApi = interfaceC5844cKl;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.playerAgentRepository")
    public static void d(LolomoMvRxFragment lolomoMvRxFragment, InterfaceC4360bcz interfaceC4360bcz) {
        lolomoMvRxFragment.playerAgentRepository = interfaceC4360bcz;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.messaging")
    public static void c(LolomoMvRxFragment lolomoMvRxFragment, InterfaceC6675chl interfaceC6675chl) {
        lolomoMvRxFragment.messaging = interfaceC6675chl;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.homeTracking")
    public static void d(LolomoMvRxFragment lolomoMvRxFragment, InterfaceC3994bSh interfaceC3994bSh) {
        lolomoMvRxFragment.homeTracking = interfaceC3994bSh;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.adsPlanApplication")
    public static void e(LolomoMvRxFragment lolomoMvRxFragment, InterfaceC5304bwI interfaceC5304bwI) {
        lolomoMvRxFragment.adsPlanApplication = interfaceC5304bwI;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.uma")
    public static void a(LolomoMvRxFragment lolomoMvRxFragment, cWC cwc) {
        lolomoMvRxFragment.uma = cwc;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.interstitials")
    public static void d(LolomoMvRxFragment lolomoMvRxFragment, bXD bxd) {
        lolomoMvRxFragment.interstitials = bxd;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.cfourSurvey")
    public static void e(LolomoMvRxFragment lolomoMvRxFragment, Lazy<InterfaceC5425byX> lazy) {
        lolomoMvRxFragment.cfourSurvey = lazy;
    }
}
