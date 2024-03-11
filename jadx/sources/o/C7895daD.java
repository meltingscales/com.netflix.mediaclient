package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedActivity;
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
/* renamed from: o.daD  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7895daD implements MembersInjector<UpNextFeedActivity> {
    private final Provider<InterfaceC6675chl> a;
    private final Provider<Optional<DebugMenuItems>> b;
    private final Provider<InterfaceC3993bSg> c;
    private final Provider<InterfaceC7249cse> d;
    private final Provider<LoginApi> e;
    private final Provider<InterfaceC7090cpe> f;
    private final Provider<InterfaceC5844cKl> g;
    private final Provider<InterfaceC7088cpc> h;
    private final Provider<InterfaceC7303ctf> i;
    private final Provider<cNT> j;
    private final Provider<ServiceManager> k;
    private final Provider<InterfaceC7345cuU> l;
    private final Provider<InterfaceC6083cTf> m;
    private final Provider<InterfaceC5285bvq> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<InterfaceC1643aIx> f13818o;
    private final Provider<InterfaceC8098ddv> q;
    private final Provider<InterfaceC8351dij> s;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(UpNextFeedActivity upNextFeedActivity) {
        C1634aIo.d(upNextFeedActivity, this.k.get());
        C1634aIo.a(upNextFeedActivity, this.f13818o.get());
        C1057Nb.d(upNextFeedActivity, this.d.get());
        C1057Nb.c(upNextFeedActivity, DoubleCheck.lazy(this.e));
        C1057Nb.c(upNextFeedActivity, this.a.get());
        C1057Nb.c(upNextFeedActivity, this.q.get());
        C1057Nb.c(upNextFeedActivity, this.l.get());
        C1057Nb.a(upNextFeedActivity, this.b.get());
        C1057Nb.a(upNextFeedActivity, this.n.get());
        C1057Nb.b(upNextFeedActivity, this.g.get());
        C1057Nb.d(upNextFeedActivity, DoubleCheck.lazy(this.j));
        C1057Nb.e(upNextFeedActivity, this.i.get());
        b(upNextFeedActivity, this.f.get());
        a(upNextFeedActivity, DoubleCheck.lazy(this.c));
        e(upNextFeedActivity, DoubleCheck.lazy(this.m));
        c(upNextFeedActivity, DoubleCheck.lazy(this.h));
        b(upNextFeedActivity, DoubleCheck.lazy(this.s));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedActivity.notificationPermission")
    public static void b(UpNextFeedActivity upNextFeedActivity, InterfaceC7090cpe interfaceC7090cpe) {
        upNextFeedActivity.notificationPermission = interfaceC7090cpe;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedActivity.home")
    public static void a(UpNextFeedActivity upNextFeedActivity, Lazy<InterfaceC3993bSg> lazy) {
        upNextFeedActivity.home = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedActivity.searchRepositoryFactory")
    public static void e(UpNextFeedActivity upNextFeedActivity, Lazy<InterfaceC6083cTf> lazy) {
        upNextFeedActivity.searchRepositoryFactory = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedActivity.notificationPermissionApplication")
    public static void c(UpNextFeedActivity upNextFeedActivity, Lazy<InterfaceC7088cpc> lazy) {
        upNextFeedActivity.notificationPermissionApplication = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedActivity.uxConfig")
    public static void b(UpNextFeedActivity upNextFeedActivity, Lazy<InterfaceC8351dij> lazy) {
        upNextFeedActivity.uxConfig = lazy;
    }
}
