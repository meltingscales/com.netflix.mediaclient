package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.games.game_details.GameDetailsActivity;
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
/* loaded from: classes4.dex */
public final class bNY implements MembersInjector<GameDetailsActivity> {
    private final Provider<Optional<DebugMenuItems>> a;
    private final Provider<InterfaceC7249cse> b;
    private final Provider<InterfaceC6675chl> c;
    private final Provider<LoginApi> d;
    private final Provider<bNH> e;
    private final Provider<InterfaceC1643aIx> f;
    private final Provider<InterfaceC7303ctf> g;
    private final Provider<InterfaceC5844cKl> h;
    private final Provider<C3651bFt> i;
    private final Provider<cNT> j;
    private final Provider<InterfaceC7345cuU> k;
    private final Provider<InterfaceC8098ddv> l;
    private final Provider<ServiceManager> m;
    private final Provider<InterfaceC5285bvq> n;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(GameDetailsActivity gameDetailsActivity) {
        C1634aIo.d(gameDetailsActivity, this.m.get());
        C1634aIo.a(gameDetailsActivity, this.f.get());
        C1057Nb.d(gameDetailsActivity, this.b.get());
        C1057Nb.c(gameDetailsActivity, DoubleCheck.lazy(this.d));
        C1057Nb.c(gameDetailsActivity, this.c.get());
        C1057Nb.c(gameDetailsActivity, this.l.get());
        C1057Nb.c(gameDetailsActivity, this.k.get());
        C1057Nb.a(gameDetailsActivity, this.a.get());
        C1057Nb.a(gameDetailsActivity, this.n.get());
        C1057Nb.b(gameDetailsActivity, this.h.get());
        C1057Nb.d(gameDetailsActivity, DoubleCheck.lazy(this.j));
        C1057Nb.e(gameDetailsActivity, this.g.get());
        C3642bFk.b(gameDetailsActivity, DoubleCheck.lazy(this.i));
        a(gameDetailsActivity, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.games.game_details.GameDetailsActivity.gameDetail")
    public static void a(GameDetailsActivity gameDetailsActivity, bNH bnh) {
        gameDetailsActivity.gameDetail = bnh;
    }
}
