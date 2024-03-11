package com.netflix.mediaclient.ui.home.impl.repository.graphql;

import android.content.Context;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeLolomoRepositoryImpl;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import o.AbstractApplicationC1040Mh;
import o.C1045Mp;
import o.C1567aGb;
import o.C2520ahd;
import o.C2937apW;
import o.C4001bSo;
import o.C4107bWm;
import o.C4116bWv;
import o.C4129bXh;
import o.C4132bXk;
import o.C4136bXo;
import o.C4137bXp;
import o.C8627dsp;
import o.C8632dsu;
import o.C8954gU;
import o.C9083ir;
import o.InterfaceC1593aHa;
import o.InterfaceC4005bSs;
import o.InterfaceC5283bvo;
import o.InterfaceC5606cBq;
import o.InterfaceC9638uF;
import o.XH;
import o.YQ;
import o.aCE;
import o.aCG;
import o.aCK;
import o.aCN;
import o.aDB;
import o.aFU;
import o.aQS;
import o.aRG;
import o.aRL;
import o.aSC;
import o.bNS;
import o.bZD;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class GraphQLHomeLolomoRepositoryImpl extends C4116bWv implements InterfaceC4005bSs {
    private static final String b;
    private static final String d;
    public static final b e = new b(null);
    private final aCG f;
    private final aCN g;
    private final Context h;
    private final C1567aGb i;
    private final InterfaceC9638uF j;
    private final Scheduler l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GraphQLHomeLolomoRepositoryImpl(InterfaceC9638uF interfaceC9638uF, C1567aGb c1567aGb, aCN acn, @ApplicationContext Context context, aCG acg, Scheduler scheduler, bNS bns, aDB adb, Lazy<XH> lazy, Lazy<InterfaceC5606cBq> lazy2, Lazy<BookmarkStore> lazy3, bZD bzd, C4136bXo c4136bXo, C4137bXp c4137bXp, C4132bXk c4132bXk) {
        super(acg, c1567aGb, context, null, scheduler, bns, adb, lazy, lazy2, lazy3, bzd, c4136bXo, c4137bXp, c4132bXk);
        C8632dsu.c((Object) interfaceC9638uF, "");
        C8632dsu.c((Object) c1567aGb, "");
        C8632dsu.c((Object) acn, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) scheduler, "");
        C8632dsu.c((Object) bns, "");
        C8632dsu.c((Object) adb, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) lazy2, "");
        C8632dsu.c((Object) lazy3, "");
        C8632dsu.c((Object) bzd, "");
        C8632dsu.c((Object) c4136bXo, "");
        C8632dsu.c((Object) c4137bXp, "");
        C8632dsu.c((Object) c4132bXk, "");
        this.j = interfaceC9638uF;
        this.i = c1567aGb;
        this.g = acn;
        this.h = context;
        this.f = acg;
        this.l = scheduler;
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("GraphQLHomeLolomoRepositoryImpl");
        }
    }

    static {
        String b2 = C2937apW.b.c().b();
        d = b2;
        b = b2 + "%";
    }

    private final Completable i() {
        return AbstractApplicationC1040Mh.getInstance().i().t();
    }

    @Override // o.InterfaceC4005bSs
    public Completable e(final int i, final String str, final boolean z, final boolean z2, final boolean z3) {
        Completable andThen = i().andThen(Completable.defer(new Callable() { // from class: o.bWr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CompletableSource c;
                c = GraphQLHomeLolomoRepositoryImpl.c(GraphQLHomeLolomoRepositoryImpl.this, str, i, z2, z, z3);
                return c;
            }
        }));
        C8632dsu.a(andThen, "");
        return andThen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompletableSource c(final GraphQLHomeLolomoRepositoryImpl graphQLHomeLolomoRepositoryImpl, String str, int i, boolean z, final boolean z2, final boolean z3) {
        QueryMode queryMode;
        Single d2;
        C8632dsu.c((Object) graphQLHomeLolomoRepositoryImpl, "");
        final aQS.e e2 = aQS.a.e();
        YQ e3 = C4116bWv.e(graphQLHomeLolomoRepositoryImpl, graphQLHomeLolomoRepositoryImpl.c(true), graphQLHomeLolomoRepositoryImpl.a(), str, null, null, 24, null);
        if (i == 0) {
            queryMode = QueryMode.b;
        } else {
            queryMode = QueryMode.d;
        }
        QueryMode queryMode2 = queryMode;
        if (z) {
            d2 = aCE.d.e(graphQLHomeLolomoRepositoryImpl.f, e3, queryMode2, RequestPriority.a, false, 8, null);
        } else {
            d2 = aCE.d.d(graphQLHomeLolomoRepositoryImpl.f, e3, queryMode2, RequestPriority.a, false, 8, null);
        }
        final drM<C8954gU<YQ.e>, dpR> drm = new drM<C8954gU<YQ.e>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeLolomoRepositoryImpl$prefetchInitialLolomo$1$regularQuerySingle$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C8954gU<YQ.e> c8954gU) {
                a(c8954gU);
                return dpR.c;
            }

            public final void a(C8954gU<YQ.e> c8954gU) {
                GraphQLHomeLolomoRepositoryImpl graphQLHomeLolomoRepositoryImpl2 = GraphQLHomeLolomoRepositoryImpl.this;
                C8632dsu.d(c8954gU);
                graphQLHomeLolomoRepositoryImpl2.c(c8954gU, z2, z3);
            }
        };
        Single doOnSuccess = d2.doOnSuccess(new Consumer() { // from class: o.bWn
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GraphQLHomeLolomoRepositoryImpl.E(drM.this, obj);
            }
        });
        final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeLolomoRepositoryImpl$prefetchInitialLolomo$1$regularQuerySingle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                GraphQLHomeLolomoRepositoryImpl.b bVar = GraphQLHomeLolomoRepositoryImpl.e;
                GraphQLHomeLolomoRepositoryImpl.this.e((Single<C4001bSo>) null);
            }
        };
        Single doOnError = doOnSuccess.doOnError(new Consumer() { // from class: o.bWo
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GraphQLHomeLolomoRepositoryImpl.I(drM.this, obj);
            }
        });
        final drM<C8954gU<YQ.e>, C4001bSo> drm3 = new drM<C8954gU<YQ.e>, C4001bSo>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeLolomoRepositoryImpl$prefetchInitialLolomo$1$regularQuerySingle$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final C4001bSo invoke(C8954gU<YQ.e> c8954gU) {
                YQ.d e4;
                C2520ahd c;
                C8632dsu.c((Object) c8954gU, "");
                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                YQ.e eVar = c8954gU.d;
                String e5 = (eVar == null || (e4 = eVar.e()) == null || (c = e4.c()) == null) ? null : c.e();
                String g = GraphQLHomeLolomoRepositoryImpl.this.g();
                boolean c2 = C9083ir.c(c8954gU);
                aVar.a("fetchLolomo: (inFlightPrefetch) id: " + e5 + ", genreId: " + g + ", isFromCache: " + c2);
                return GraphQLHomeLolomoRepositoryImpl.this.j().e((YQ.e) aCK.b(c8954gU, false, 1, null), C9083ir.c(c8954gU));
            }
        };
        Single map = doOnError.map(new Function() { // from class: o.bWq
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C4001bSo H;
                H = GraphQLHomeLolomoRepositoryImpl.H(drM.this, obj);
                return H;
            }
        });
        final drM<C4001bSo, SingleSource<? extends C4001bSo>> drm4 = new drM<C4001bSo, SingleSource<? extends C4001bSo>>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeLolomoRepositoryImpl$prefetchInitialLolomo$1$regularQuerySingle$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final SingleSource<? extends C4001bSo> invoke(C4001bSo c4001bSo) {
                C8632dsu.c((Object) c4001bSo, "");
                if (aQS.e.this.b() && aQS.e.this.a() == 0 && graphQLHomeLolomoRepositoryImpl.g() == null) {
                    return graphQLHomeLolomoRepositoryImpl.c(c4001bSo);
                }
                Single just = Single.just(c4001bSo);
                C8632dsu.d(just);
                return just;
            }
        };
        graphQLHomeLolomoRepositoryImpl.e(map.flatMap(new Function() { // from class: o.bWp
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource F;
                F = GraphQLHomeLolomoRepositoryImpl.F(drM.this, obj);
                return F;
            }
        }).subscribeOn(graphQLHomeLolomoRepositoryImpl.l).cache());
        Single<C4001bSo> h = graphQLHomeLolomoRepositoryImpl.h();
        if (h != null) {
            return h.ignoreElement();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4001bSo H(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (C4001bSo) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource F(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(C8954gU<YQ.e> c8954gU, boolean z, boolean z2) {
        aCK.e(c8954gU);
        if (z) {
            boolean z3 = z2 && aRL.e.a().d();
            C4001bSo e2 = j().e((YQ.e) aCK.b(c8954gU, false, 1, null), C9083ir.c(c8954gU));
            if (!AbstractApplicationC1040Mh.getInstance().n()) {
                if (z3) {
                    C4129bXh.e(e2, this.j, aRL.e.c());
                }
            } else if (z3) {
                C4129bXh.e(e2, this.j, aRL.e.c());
            } else {
                C4129bXh.d(e2, this.j, 0, 4, null);
            }
        }
    }

    @Override // o.InterfaceC4005bSs
    public Completable d(final String str) {
        return InterfaceC4005bSs.a.d(this, 1, str, true, false, false, 8, null).andThen(Completable.fromAction(new Action() { // from class: o.bWi
            @Override // io.reactivex.functions.Action
            public final void run() {
                GraphQLHomeLolomoRepositoryImpl.b(GraphQLHomeLolomoRepositoryImpl.this, str);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(GraphQLHomeLolomoRepositoryImpl graphQLHomeLolomoRepositoryImpl, String str) {
        C8632dsu.c((Object) graphQLHomeLolomoRepositoryImpl, "");
        aSC.b(graphQLHomeLolomoRepositoryImpl.h, str);
    }

    @Override // o.InterfaceC4005bSs
    public Completable a(String str, String str2) {
        return c(str, str2, "GQLHome.fromIris");
    }

    @Override // o.InterfaceC4005bSs
    public Completable e() {
        InterfaceC5283bvo b2;
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        if (k == null || (b2 = k.b(this.i.a())) == null) {
            Completable error = Completable.error(new IllegalStateException("Invalid UserAgent or profile guid"));
            C8632dsu.a(error, "");
            return error;
        }
        return this.g.b(b2, b);
    }

    @Module
    @InstallIn({aFU.class})
    /* loaded from: classes4.dex */
    public static final class HomeLolomoRepository {
        public static final HomeLolomoRepository c = new HomeLolomoRepository();

        private HomeLolomoRepository() {
        }

        @Provides
        public static final InterfaceC4005bSs c(GraphQLHomeLolomoRepositoryImpl graphQLHomeLolomoRepositoryImpl, C4107bWm c4107bWm) {
            C8632dsu.c((Object) graphQLHomeLolomoRepositoryImpl, "");
            C8632dsu.c((Object) c4107bWm, "");
            return aRG.b.e() ? c4107bWm : graphQLHomeLolomoRepositoryImpl;
        }
    }

    @Module
    @InstallIn({ActivityRetainedComponent.class})
    /* loaded from: classes6.dex */
    public static final class HomeLolomoRepositoryInActivity {
        public static final HomeLolomoRepositoryInActivity a = new HomeLolomoRepositoryInActivity();

        private HomeLolomoRepositoryInActivity() {
        }

        @Provides
        public static final InterfaceC4005bSs b(GraphQLHomeLolomoRepositoryImpl graphQLHomeLolomoRepositoryImpl, C4107bWm c4107bWm) {
            C8632dsu.c((Object) graphQLHomeLolomoRepositoryImpl, "");
            C8632dsu.c((Object) c4107bWm, "");
            return aRG.b.e() ? c4107bWm : graphQLHomeLolomoRepositoryImpl;
        }
    }
}
