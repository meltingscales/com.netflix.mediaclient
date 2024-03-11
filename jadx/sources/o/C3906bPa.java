package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.games.impl.games.GamesLolomoActivity;
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
/* renamed from: o.bPa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3906bPa implements MembersInjector<GamesLolomoActivity> {
    private final Provider<Optional<DebugMenuItems>> a;
    private final Provider<InterfaceC7249cse> b;
    private final Provider<LoginApi> c;
    private final Provider<InterfaceC6675chl> d;
    private final Provider<InterfaceC3993bSg> e;
    private final Provider<InterfaceC5844cKl> f;
    private final Provider<InterfaceC7303ctf> g;
    private final Provider<InterfaceC1643aIx> h;
    private final Provider<ServiceManager> i;
    private final Provider<cNT> j;
    private final Provider<InterfaceC8098ddv> m;
    private final Provider<InterfaceC7345cuU> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<InterfaceC5285bvq> f13530o;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(GamesLolomoActivity gamesLolomoActivity) {
        C1634aIo.d(gamesLolomoActivity, this.i.get());
        C1634aIo.a(gamesLolomoActivity, this.h.get());
        C1057Nb.d(gamesLolomoActivity, this.b.get());
        C1057Nb.c(gamesLolomoActivity, DoubleCheck.lazy(this.c));
        C1057Nb.c(gamesLolomoActivity, this.d.get());
        C1057Nb.c(gamesLolomoActivity, this.m.get());
        C1057Nb.c(gamesLolomoActivity, this.n.get());
        C1057Nb.a(gamesLolomoActivity, this.a.get());
        C1057Nb.a(gamesLolomoActivity, this.f13530o.get());
        C1057Nb.b(gamesLolomoActivity, this.f.get());
        C1057Nb.d(gamesLolomoActivity, DoubleCheck.lazy(this.j));
        C1057Nb.e(gamesLolomoActivity, this.g.get());
        e(gamesLolomoActivity, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.games.impl.games.GamesLolomoActivity.home")
    public static void e(GamesLolomoActivity gamesLolomoActivity, InterfaceC3993bSg interfaceC3993bSg) {
        gamesLolomoActivity.home = interfaceC3993bSg;
    }
}
