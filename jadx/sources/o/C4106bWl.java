package o;

import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;
import com.netflix.mediaclient.ui.home.impl.mynetflix.MyNetflixFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bWl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4106bWl implements MembersInjector<MyNetflixFragment> {
    private final Provider<CollectTaste> a;
    private final Provider<InterfaceC5304bwI> b;
    private final Provider<InterfaceC5303bwH> c;
    private final Provider<InterfaceC7407cvd> d;
    private final Provider<InterfaceC5425byX> e;
    private final Provider<bNT> f;
    private final Provider<bNN> g;
    private final Provider<bNS> h;
    private final Provider<bNL> i;
    private final Provider<bNP> j;
    private final Provider<dwQ> k;
    private final Provider<bNR> l;
    private final Provider<InterfaceC3994bSh> m;
    private final Provider<bNV> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<bXD> f13551o;
    private final Provider<InterfaceC4360bcz> p;
    private final Provider<InterfaceC6675chl> q;
    private final Provider<InterfaceC5840cKh> r;
    private final Provider<InterfaceC6905cmC> s;
    private final Provider<InterfaceC7303ctf> t;
    private final Provider<cYB> u;
    private final Provider<InterfaceC5844cKl> v;
    private final Provider<cWC> w;
    private final Provider<InterfaceC1573aGh> x;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(MyNetflixFragment myNetflixFragment) {
        C1092Oj.e(myNetflixFragment, this.x);
        C4047bUg.b(myNetflixFragment, DoubleCheck.lazy(this.a));
        C4047bUg.a(myNetflixFragment, DoubleCheck.lazy(this.g));
        C4047bUg.h(myNetflixFragment, DoubleCheck.lazy(this.h));
        C4047bUg.f(myNetflixFragment, DoubleCheck.lazy(this.n));
        C4047bUg.i(myNetflixFragment, DoubleCheck.lazy(this.l));
        C4047bUg.j(myNetflixFragment, DoubleCheck.lazy(this.f));
        C4047bUg.d(myNetflixFragment, DoubleCheck.lazy(this.d));
        C4047bUg.d(myNetflixFragment, this.c.get());
        C4047bUg.a(myNetflixFragment, this.s.get());
        C4047bUg.a(myNetflixFragment, this.j.get());
        C4047bUg.g(myNetflixFragment, DoubleCheck.lazy(this.r));
        C4047bUg.n(myNetflixFragment, DoubleCheck.lazy(this.u));
        C4047bUg.c(myNetflixFragment, DoubleCheck.lazy(this.i));
        C4047bUg.d(myNetflixFragment, this.k.get());
        C4047bUg.a(myNetflixFragment, this.v.get());
        C4047bUg.d(myNetflixFragment, this.p.get());
        C4047bUg.c(myNetflixFragment, this.q.get());
        C4047bUg.d(myNetflixFragment, this.m.get());
        C4047bUg.e(myNetflixFragment, this.b.get());
        C4047bUg.a(myNetflixFragment, this.w.get());
        C4047bUg.d(myNetflixFragment, this.f13551o.get());
        C4047bUg.e(myNetflixFragment, DoubleCheck.lazy(this.e));
        d(myNetflixFragment, this.t.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.home.impl.mynetflix.MyNetflixFragment.offlineApi")
    public static void d(MyNetflixFragment myNetflixFragment, InterfaceC7303ctf interfaceC7303ctf) {
        myNetflixFragment.offlineApi = interfaceC7303ctf;
    }
}
