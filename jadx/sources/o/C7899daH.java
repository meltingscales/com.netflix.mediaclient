package o;

import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.daH  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7899daH implements MembersInjector<UpNextFeedFragment> {
    private final Provider<bNS> a;
    private final Provider<InterfaceC5303bwH> b;
    private final Provider<bNN> c;
    private final Provider<InterfaceC5304bwI> d;
    private final Provider<bNS> e;
    private final Provider<InterfaceC3993bSg> f;
    private final Provider<InterfaceC7020coL> g;
    private final Provider<InterfaceC6675chl> h;
    private final Provider<bNV> i;
    private final Provider<InterfaceC7089cpd> j;
    private final Provider<InterfaceC6068cSu> k;
    private final Provider<PlaybackLauncher> l;
    private final Provider<InterfaceC1126Pr> m;
    private final Provider<InterfaceC7090cpe> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<InterfaceC7084cpY> f13819o;
    private final Provider<InterfaceC1573aGh> t;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(UpNextFeedFragment upNextFeedFragment) {
        C1092Oj.e(upNextFeedFragment, this.t);
        a(upNextFeedFragment, this.m.get());
        j(upNextFeedFragment, DoubleCheck.lazy(this.f13819o));
        d(upNextFeedFragment, this.d.get());
        d(upNextFeedFragment, DoubleCheck.lazy(this.a));
        b(upNextFeedFragment, DoubleCheck.lazy(this.f));
        a(upNextFeedFragment, this.h.get());
        g(upNextFeedFragment, DoubleCheck.lazy(this.l));
        b(upNextFeedFragment, this.b.get());
        e(upNextFeedFragment, this.k.get());
        e(upNextFeedFragment, this.n.get());
        a(upNextFeedFragment, this.j.get());
        e(upNextFeedFragment, DoubleCheck.lazy(this.c));
        a(upNextFeedFragment, DoubleCheck.lazy(this.e));
        c(upNextFeedFragment, DoubleCheck.lazy(this.i));
        a(upNextFeedFragment, this.g.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment.sharing")
    public static void a(UpNextFeedFragment upNextFeedFragment, InterfaceC1126Pr interfaceC1126Pr) {
        upNextFeedFragment.sharing = interfaceC1126Pr;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment.notifications")
    public static void j(UpNextFeedFragment upNextFeedFragment, Lazy<InterfaceC7084cpY> lazy) {
        upNextFeedFragment.notifications = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment.adsPlanApplication")
    public static void d(UpNextFeedFragment upNextFeedFragment, InterfaceC5304bwI interfaceC5304bwI) {
        upNextFeedFragment.adsPlanApplication = interfaceC5304bwI;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment.gamesInstallation")
    public static void d(UpNextFeedFragment upNextFeedFragment, Lazy<bNS> lazy) {
        upNextFeedFragment.gamesInstallation = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment.home")
    public static void b(UpNextFeedFragment upNextFeedFragment, Lazy<InterfaceC3993bSg> lazy) {
        upNextFeedFragment.home = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment.messaging")
    public static void a(UpNextFeedFragment upNextFeedFragment, InterfaceC6675chl interfaceC6675chl) {
        upNextFeedFragment.messaging = interfaceC6675chl;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment.playbackLauncher")
    public static void g(UpNextFeedFragment upNextFeedFragment, Lazy<PlaybackLauncher> lazy) {
        upNextFeedFragment.playbackLauncher = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment.adsPlan")
    public static void b(UpNextFeedFragment upNextFeedFragment, InterfaceC5303bwH interfaceC5303bwH) {
        upNextFeedFragment.adsPlan = interfaceC5303bwH;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment.search")
    public static void e(UpNextFeedFragment upNextFeedFragment, InterfaceC6068cSu interfaceC6068cSu) {
        upNextFeedFragment.search = interfaceC6068cSu;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment.notificationPermission")
    public static void e(UpNextFeedFragment upNextFeedFragment, InterfaceC7090cpe interfaceC7090cpe) {
        upNextFeedFragment.notificationPermission = interfaceC7090cpe;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment.notificationPermissionHelper")
    public static void a(UpNextFeedFragment upNextFeedFragment, InterfaceC7089cpd interfaceC7089cpd) {
        upNextFeedFragment.notificationPermissionHelper = interfaceC7089cpd;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment.gameModels")
    public static void e(UpNextFeedFragment upNextFeedFragment, Lazy<bNN> lazy) {
        upNextFeedFragment.gameModels = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment.gamesInstallationAndLaunch")
    public static void a(UpNextFeedFragment upNextFeedFragment, Lazy<bNS> lazy) {
        upNextFeedFragment.gamesInstallationAndLaunch = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment.gamesUtils")
    public static void c(UpNextFeedFragment upNextFeedFragment, Lazy<bNV> lazy) {
        upNextFeedFragment.gamesUtils = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment.nonMember")
    public static void a(UpNextFeedFragment upNextFeedFragment, InterfaceC7020coL interfaceC7020coL) {
        upNextFeedFragment.nonMember = interfaceC7020coL;
    }
}
