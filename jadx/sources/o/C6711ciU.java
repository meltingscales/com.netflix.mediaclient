package o;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.debugmenu.api.DebugMenuItems;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.mssi.impl.GameControllerActivity;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Optional;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.ciU  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6711ciU implements MembersInjector<GameControllerActivity> {
    private final Provider<InterfaceC7249cse> a;
    private final Provider<InterfaceC6779cjj> b;
    private final Provider<Optional<DebugMenuItems>> c;
    private final Provider<InterfaceC6675chl> d;
    private final Provider<LoginApi> e;
    private final Provider<InterfaceC7303ctf> f;
    private final Provider<ServiceManager> g;
    private final Provider<InterfaceC1643aIx> h;
    private final Provider<InterfaceC5844cKl> i;
    private final Provider<cNT> j;
    private final Provider<InterfaceC8098ddv> m;
    private final Provider<InterfaceC5285bvq> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<InterfaceC7345cuU> f13731o;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(GameControllerActivity gameControllerActivity) {
        C1634aIo.d(gameControllerActivity, this.g.get());
        C1634aIo.a(gameControllerActivity, this.h.get());
        C1057Nb.d(gameControllerActivity, this.a.get());
        C1057Nb.c(gameControllerActivity, DoubleCheck.lazy(this.e));
        C1057Nb.c(gameControllerActivity, this.d.get());
        C1057Nb.c(gameControllerActivity, this.m.get());
        C1057Nb.c(gameControllerActivity, this.f13731o.get());
        C1057Nb.a(gameControllerActivity, this.c.get());
        C1057Nb.a(gameControllerActivity, this.n.get());
        C1057Nb.b(gameControllerActivity, this.i.get());
        C1057Nb.d(gameControllerActivity, DoubleCheck.lazy(this.j));
        C1057Nb.e(gameControllerActivity, this.f.get());
        d(gameControllerActivity, this.b.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.mssi.impl.GameControllerActivity.gameControllerLifecycleObserver")
    public static void d(GameControllerActivity gameControllerActivity, InterfaceC6779cjj interfaceC6779cjj) {
        gameControllerActivity.gameControllerLifecycleObserver = interfaceC6779cjj;
    }
}
