package o;

import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.player.PlayerFragmentV2;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.hendrixconfig.api.HendrixConfig"})
/* renamed from: o.cyS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7555cyS implements MembersInjector<PlayerFragmentV2> {
    private final Provider<InterfaceC9638uF> a;
    private final Provider<InterfaceC5603cBn> b;
    private final Provider<InterfaceC5303bwH> c;
    private final Provider<bXD> d;
    private final Provider<bZN> e;
    private final Provider<InterfaceC7303ctf> f;
    private final Provider<InterfaceC6675chl> g;
    private final Provider<Boolean> h;
    private final Provider<InterfaceC7282ctK> i;
    private final Provider<InterfaceC7468cwl> j;
    private final Provider<InterfaceC5602cBm> k;
    private final Provider<C7498cxO> l;
    private final Provider<PlaybackLauncher> m;
    private final Provider<InterfaceC7606czQ> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<bDI> f13788o;
    private final Provider<InterfaceC7967dbW> p;
    private final Provider<InterfaceC7614czY> q;
    private final Provider<InterfaceC1573aGh> r;
    private final Provider<InterfaceC1126Pr> s;
    private final Provider<Boolean> t;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(PlayerFragmentV2 playerFragmentV2) {
        C1092Oj.e(playerFragmentV2, this.r);
        b(playerFragmentV2, this.s.get());
        e(playerFragmentV2, this.c.get());
        b(playerFragmentV2, this.g.get());
        e(playerFragmentV2, DoubleCheck.lazy(this.m));
        d(playerFragmentV2, DoubleCheck.lazy(this.k));
        b(playerFragmentV2, DoubleCheck.lazy(this.d));
        a(playerFragmentV2, DoubleCheck.lazy(this.e));
        b(playerFragmentV2, this.t);
        c(playerFragmentV2, this.h);
        c(playerFragmentV2, this.j.get());
        e(playerFragmentV2, this.l.get());
        c(playerFragmentV2, this.f13788o.get());
        e(playerFragmentV2, this.b.get());
        d(playerFragmentV2, this.a.get());
        b(playerFragmentV2, this.f.get());
        e(playerFragmentV2, this.i.get());
        g(playerFragmentV2, DoubleCheck.lazy(this.p));
        c(playerFragmentV2, DoubleCheck.lazy(this.q));
        a(playerFragmentV2, this.n.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.socialSharing")
    public static void b(PlayerFragmentV2 playerFragmentV2, InterfaceC1126Pr interfaceC1126Pr) {
        playerFragmentV2.socialSharing = interfaceC1126Pr;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.adsPlan")
    public static void e(PlayerFragmentV2 playerFragmentV2, InterfaceC5303bwH interfaceC5303bwH) {
        playerFragmentV2.adsPlan = interfaceC5303bwH;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.messaging")
    public static void b(PlayerFragmentV2 playerFragmentV2, InterfaceC6675chl interfaceC6675chl) {
        playerFragmentV2.messaging = interfaceC6675chl;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.playbackLauncher")
    public static void e(PlayerFragmentV2 playerFragmentV2, Lazy<PlaybackLauncher> lazy) {
        playerFragmentV2.playbackLauncher = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.playerPrefetchRepositoryLazy")
    public static void d(PlayerFragmentV2 playerFragmentV2, Lazy<InterfaceC5602cBm> lazy) {
        playerFragmentV2.playerPrefetchRepositoryLazy = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.interstitials")
    public static void b(PlayerFragmentV2 playerFragmentV2, Lazy<bXD> lazy) {
        playerFragmentV2.interstitials = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.localDiscoveryConsentUiLazy")
    public static void a(PlayerFragmentV2 playerFragmentV2, Lazy<bZN> lazy) {
        playerFragmentV2.localDiscoveryConsentUiLazy = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.prePlayComposeEnabled")
    public static void b(PlayerFragmentV2 playerFragmentV2, Provider<Boolean> provider) {
        playerFragmentV2.prePlayComposeEnabled = provider;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.pauseAdsEnabled")
    public static void c(PlayerFragmentV2 playerFragmentV2, Provider<Boolean> provider) {
        playerFragmentV2.pauseAdsEnabled = provider;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.pauseAdsManager")
    public static void c(PlayerFragmentV2 playerFragmentV2, InterfaceC7468cwl interfaceC7468cwl) {
        playerFragmentV2.pauseAdsManager = interfaceC7468cwl;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.playerFragmentCL")
    public static void e(PlayerFragmentV2 playerFragmentV2, C7498cxO c7498cxO) {
        playerFragmentV2.playerFragmentCL = c7498cxO;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.playerUI")
    public static void c(PlayerFragmentV2 playerFragmentV2, bDI bdi) {
        playerFragmentV2.playerUI = bdi;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.mPlayerRepositoryFactory")
    public static void e(PlayerFragmentV2 playerFragmentV2, InterfaceC5603cBn interfaceC5603cBn) {
        playerFragmentV2.mPlayerRepositoryFactory = interfaceC5603cBn;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.imageLoaderRepository")
    public static void d(PlayerFragmentV2 playerFragmentV2, InterfaceC9638uF interfaceC9638uF) {
        playerFragmentV2.imageLoaderRepository = interfaceC9638uF;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.offlineApi")
    public static void b(PlayerFragmentV2 playerFragmentV2, InterfaceC7303ctf interfaceC7303ctf) {
        playerFragmentV2.offlineApi = interfaceC7303ctf;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.offlinePostplay")
    public static void e(PlayerFragmentV2 playerFragmentV2, InterfaceC7282ctK interfaceC7282ctK) {
        playerFragmentV2.offlinePostplay = interfaceC7282ctK;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.userMarks")
    public static void g(PlayerFragmentV2 playerFragmentV2, Lazy<InterfaceC7967dbW> lazy) {
        playerFragmentV2.userMarks = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.postPlayPlaygraphHelper")
    public static void c(PlayerFragmentV2 playerFragmentV2, Lazy<InterfaceC7614czY> lazy) {
        playerFragmentV2.postPlayPlaygraphHelper = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerFragmentV2.postPlayManagerFactory")
    public static void a(PlayerFragmentV2 playerFragmentV2, InterfaceC7606czQ interfaceC7606czQ) {
        playerFragmentV2.postPlayManagerFactory = interfaceC7606czQ;
    }
}
