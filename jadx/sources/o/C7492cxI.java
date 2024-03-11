package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.player.PlayerActivity;
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
/* renamed from: o.cxI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7492cxI implements MembersInjector<PlayerActivity> {
    private final Provider<InterfaceC6675chl> a;
    private final Provider<bXD> b;
    private final Provider<Optional<DebugMenuItems>> c;
    private final Provider<LoginApi> d;
    private final Provider<InterfaceC7249cse> e;
    private final Provider<ServiceManager> f;
    private final Provider<InterfaceC7303ctf> g;
    private final Provider<cNT> h;
    private final Provider<InterfaceC1643aIx> i;
    private final Provider<InterfaceC5844cKl> j;
    private final Provider<InterfaceC7345cuU> l;
    private final Provider<InterfaceC5285bvq> m;
    private final Provider<InterfaceC8098ddv> n;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(PlayerActivity playerActivity) {
        C1634aIo.d(playerActivity, this.f.get());
        C1634aIo.a(playerActivity, this.i.get());
        C1057Nb.d(playerActivity, this.e.get());
        C1057Nb.c(playerActivity, DoubleCheck.lazy(this.d));
        C1057Nb.c(playerActivity, this.a.get());
        C1057Nb.c(playerActivity, this.n.get());
        C1057Nb.c(playerActivity, this.l.get());
        C1057Nb.a(playerActivity, this.c.get());
        C1057Nb.a(playerActivity, this.m.get());
        C1057Nb.b(playerActivity, this.j.get());
        C1057Nb.d(playerActivity, DoubleCheck.lazy(this.h));
        C1057Nb.e(playerActivity, this.g.get());
        b(playerActivity, DoubleCheck.lazy(this.b));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.player.PlayerActivity.interstitials")
    public static void b(PlayerActivity playerActivity, Lazy<bXD> lazy) {
        playerActivity.interstitials = lazy;
    }
}
