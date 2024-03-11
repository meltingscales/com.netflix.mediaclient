package o;

import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.job.NetflixJobInitializer;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import o.C1812aPd;
import o.C1948aUe;

@DaggerGenerated
@QualifierMetadata({"com.netflix.common.di.App", "com.netflix.common.di.Main"})
/* loaded from: classes3.dex */
public final class aMC implements MembersInjector<NetflixService> {
    private final Provider<dwU> a;
    private final Provider<InterfaceC3857bNf> b;
    private final Provider<InterfaceC3856bNe> c;
    private final Provider<aCI> d;
    private final Provider<bXD> e;
    private final Provider<aGT> f;
    private final Provider<C1812aPd.e> g;
    private final Provider<NetflixJobInitializer> h;
    private final Provider<C1948aUe.c> i;
    private final Provider<InterfaceC1251Um> j;
    private final Provider<InterfaceC1602aHj> k;
    private final Provider<dwQ> l;
    private final Provider<InterfaceC1938aTv> m;
    private final Provider<InterfaceC1929aTm> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<InterfaceC1692aKs> f13431o;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(NetflixService netflixService) {
        d(netflixService, this.j.get());
        d(netflixService, this.n.get());
        b(netflixService, this.h);
        d(netflixService, this.m.get());
        d(netflixService, this.i.get());
        b(netflixService, this.g.get());
        e(netflixService, this.k.get());
        a(netflixService, this.e.get());
        b(netflixService, this.a.get());
        d(netflixService, this.l.get());
        a(netflixService, this.b.get());
        c(netflixService, this.c.get());
        e(netflixService, this.f13431o.get());
        e(netflixService, this.f.get());
        c(netflixService, DoubleCheck.lazy(this.d));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.NetflixService.mCdxAgent")
    public static void d(NetflixService netflixService, InterfaceC1251Um interfaceC1251Um) {
        netflixService.mCdxAgent = interfaceC1251Um;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.NetflixService.mNetflixJobScheduler")
    public static void d(NetflixService netflixService, InterfaceC1929aTm interfaceC1929aTm) {
        netflixService.mNetflixJobScheduler = interfaceC1929aTm;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.NetflixService.mNetflixJobInitializer")
    public static void b(NetflixService netflixService, Provider<NetflixJobInitializer> provider) {
        netflixService.mNetflixJobInitializer = provider;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.NetflixService.netflixWorkManager")
    public static void d(NetflixService netflixService, InterfaceC1938aTv interfaceC1938aTv) {
        netflixService.netflixWorkManager = interfaceC1938aTv;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.NetflixService.mClientLoggingAgentFactory")
    public static void d(NetflixService netflixService, C1948aUe.c cVar) {
        netflixService.mClientLoggingAgentFactory = cVar;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.NetflixService.mConfigurationAgentFactory")
    public static void b(NetflixService netflixService, C1812aPd.e eVar) {
        netflixService.mConfigurationAgentFactory = eVar;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.NetflixService.netflixCrashReporter")
    public static void e(NetflixService netflixService, InterfaceC1602aHj interfaceC1602aHj) {
        netflixService.netflixCrashReporter = interfaceC1602aHj;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.NetflixService.interstitials")
    public static void a(NetflixService netflixService, bXD bxd) {
        netflixService.interstitials = bxd;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.NetflixService.appScope")
    public static void b(NetflixService netflixService, dwU dwu) {
        netflixService.appScope = dwu;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.NetflixService.mainDispatcher")
    public static void d(NetflixService netflixService, dwQ dwq) {
        netflixService.mainDispatcher = dwq;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.NetflixService.cloudGameSSIDBeaconEventHandler")
    public static void a(NetflixService netflixService, InterfaceC3857bNf interfaceC3857bNf) {
        netflixService.cloudGameSSIDBeaconEventHandler = interfaceC3857bNf;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.NetflixService.cloudGameSSIDBeaconJsonAdapter")
    public static void c(NetflixService netflixService, InterfaceC3856bNe interfaceC3856bNe) {
        netflixService.cloudGameSSIDBeaconJsonAdapter = interfaceC3856bNe;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.NetflixService.mPlayIntegrityMonitor")
    public static void e(NetflixService netflixService, InterfaceC1692aKs interfaceC1692aKs) {
        netflixService.mPlayIntegrityMonitor = interfaceC1692aKs;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.NetflixService.mLocalDiscovery")
    public static void e(NetflixService netflixService, aGT agt) {
        netflixService.mLocalDiscovery = agt;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.service.NetflixService.loggedOutGraphQLRepositoryLazy")
    public static void c(NetflixService netflixService, Lazy<aCI> lazy) {
        netflixService.loggedOutGraphQLRepositoryLazy = lazy;
    }
}
