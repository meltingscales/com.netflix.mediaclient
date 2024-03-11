package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.profiles.MyNetflixActivity;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Optional;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cMa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5887cMa implements MembersInjector<MyNetflixActivity> {
    private final Provider<LoginApi> a;
    private final Provider<InterfaceC7249cse> b;
    private final Provider<InterfaceC6675chl> c;
    private final Provider<Optional<DebugMenuItems>> d;
    private final Provider<InterfaceC3993bSg> e;
    private final Provider<InterfaceC7084cpY> f;
    private final Provider<InterfaceC1643aIx> g;
    private final Provider<InterfaceC7303ctf> h;
    private final Provider<InterfaceC5844cKl> i;
    private final Provider<cNT> j;
    private final Provider<ServiceManager> k;
    private final Provider<InterfaceC7345cuU> l;
    private final Provider<InterfaceC5285bvq> m;
    private final Provider<InterfaceC8098ddv> n;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(MyNetflixActivity myNetflixActivity) {
        C1634aIo.d(myNetflixActivity, this.k.get());
        C1634aIo.a(myNetflixActivity, this.g.get());
        C1057Nb.d(myNetflixActivity, this.b.get());
        C1057Nb.c(myNetflixActivity, DoubleCheck.lazy(this.a));
        C1057Nb.c(myNetflixActivity, this.c.get());
        C1057Nb.c(myNetflixActivity, this.n.get());
        C1057Nb.c(myNetflixActivity, this.l.get());
        C1057Nb.a(myNetflixActivity, this.d.get());
        C1057Nb.a(myNetflixActivity, this.m.get());
        C1057Nb.b(myNetflixActivity, this.i.get());
        C1057Nb.d(myNetflixActivity, DoubleCheck.lazy(this.j));
        C1057Nb.e(myNetflixActivity, this.h.get());
        b(myNetflixActivity, this.f.get());
        d(myNetflixActivity, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.MyNetflixActivity.notificationsUi")
    public static void b(MyNetflixActivity myNetflixActivity, InterfaceC7084cpY interfaceC7084cpY) {
        myNetflixActivity.notificationsUi = interfaceC7084cpY;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.MyNetflixActivity.home")
    public static void d(MyNetflixActivity myNetflixActivity, InterfaceC3993bSg interfaceC3993bSg) {
        myNetflixActivity.home = interfaceC3993bSg;
    }
}
