package o;

import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;
import com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class bTC implements MembersInjector<GamesLolomoFragment> {
    private final Provider<InterfaceC7407cvd> a;
    private final Provider<InterfaceC5304bwI> b;
    private final Provider<InterfaceC5425byX> c;
    private final Provider<CollectTaste> d;
    private final Provider<InterfaceC5303bwH> e;
    private final Provider<bNL> f;
    private final Provider<bNS> g;
    private final Provider<bNT> h;
    private final Provider<bNP> i;
    private final Provider<bNN> j;
    private final Provider<bNV> k;
    private final Provider<dwQ> l;
    private final Provider<bXD> m;
    private final Provider<bNR> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<InterfaceC3994bSh> f13539o;
    private final Provider<InterfaceC4360bcz> p;
    private final Provider<InterfaceC5844cKl> q;
    private final Provider<InterfaceC6905cmC> r;
    private final Provider<InterfaceC6675chl> s;
    private final Provider<InterfaceC5840cKh> t;
    private final Provider<InterfaceC6068cSu> u;
    private final Provider<InterfaceC1573aGh> w;
    private final Provider<cWC> x;
    private final Provider<cYB> y;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(GamesLolomoFragment gamesLolomoFragment) {
        C1092Oj.e(gamesLolomoFragment, this.w);
        C4047bUg.b(gamesLolomoFragment, DoubleCheck.lazy(this.d));
        C4047bUg.a(gamesLolomoFragment, DoubleCheck.lazy(this.j));
        C4047bUg.h(gamesLolomoFragment, DoubleCheck.lazy(this.g));
        C4047bUg.f(gamesLolomoFragment, DoubleCheck.lazy(this.k));
        C4047bUg.i(gamesLolomoFragment, DoubleCheck.lazy(this.n));
        C4047bUg.j(gamesLolomoFragment, DoubleCheck.lazy(this.h));
        C4047bUg.d(gamesLolomoFragment, DoubleCheck.lazy(this.a));
        C4047bUg.d(gamesLolomoFragment, this.e.get());
        C4047bUg.a(gamesLolomoFragment, this.r.get());
        C4047bUg.a(gamesLolomoFragment, this.i.get());
        C4047bUg.g(gamesLolomoFragment, DoubleCheck.lazy(this.t));
        C4047bUg.n(gamesLolomoFragment, DoubleCheck.lazy(this.y));
        C4047bUg.c(gamesLolomoFragment, DoubleCheck.lazy(this.f));
        C4047bUg.d(gamesLolomoFragment, this.l.get());
        C4047bUg.a(gamesLolomoFragment, this.q.get());
        C4047bUg.d(gamesLolomoFragment, this.p.get());
        C4047bUg.c(gamesLolomoFragment, this.s.get());
        C4047bUg.d(gamesLolomoFragment, this.f13539o.get());
        C4047bUg.e(gamesLolomoFragment, this.b.get());
        C4047bUg.a(gamesLolomoFragment, this.x.get());
        C4047bUg.d(gamesLolomoFragment, this.m.get());
        C4047bUg.e(gamesLolomoFragment, DoubleCheck.lazy(this.c));
        e(gamesLolomoFragment, this.u.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment.search")
    public static void e(GamesLolomoFragment gamesLolomoFragment, InterfaceC6068cSu interfaceC6068cSu) {
        gamesLolomoFragment.search = interfaceC6068cSu;
    }
}
