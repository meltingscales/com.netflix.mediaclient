package o;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.graphqlrepo.transformers.GraphQLLoMo;
import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.home.api.repository.MismatchedRowException;
import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchContinueWatchingTitles$1;
import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchGamesRow$1;
import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$getCurrentLolomo$1;
import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$getCurrentLolomoResponse$1;
import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$getQuickDrawVideoDetails$1;
import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$getQuickDrawVideoDetails$2;
import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$handleBackgroundListRefresh$1;
import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$reAdaptNewLolomo$1;
import com.netflix.mediaclient.util.ConnectivityUtils;
import dagger.Lazy;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.channels.BufferOverflow;
import o.AbstractC8997hK;
import o.C1353Yk;
import o.C1371Yv;
import o.C1387Zl;
import o.C1532aEu;
import o.C1596aHd;
import o.C2458agU;
import o.C2461agX;
import o.C2463agZ;
import o.C2520ahd;
import o.C4001bSo;
import o.C4002bSp;
import o.C4003bSq;
import o.C4105bWk;
import o.C4116bWv;
import o.C4136bXo;
import o.C4137bXp;
import o.C8572dqo;
import o.C8632dsu;
import o.C8954gU;
import o.C9083ir;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC4007bSu;
import o.InterfaceC5155btS;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.InterfaceC5241buz;
import o.YH;
import o.YK;
import o.YL;
import o.YQ;
import o.aCE;
import o.aCG;
import o.aCK;
import o.aEJ;
import o.aQS;
import o.aSC;
import o.dpR;
import o.dqE;

/* renamed from: o.bWv */
/* loaded from: classes4.dex */
public class C4116bWv implements InterfaceC4004bSr {
    public static final c a = new c(null);
    private static final IntentFilter b = new IntentFilter("RECENTLY_WATCHED_VIDEO_REMOVED_ACTION");
    private static final Set<String> d;
    private final Context e;
    private final CompositeDisposable f;
    private final bNS g;
    private final Lazy<BookmarkStore> h;
    private final Lazy<XH> i;
    private final BroadcastReceiver j;
    private Single<C4001bSo> k;
    private final String l;
    private final aDB m;
    private final aCG n;

    /* renamed from: o */
    private List<Integer> f13552o;
    private final C4132bXk p;
    private final bZD q;
    private final boolean r;
    private final Lazy<InterfaceC5606cBq> s;
    private final C4137bXp t;
    private final Scheduler u;
    private final C1567aGb v;
    private final InterfaceC8810dzj<String> w;
    private final BroadcastReceiver x;
    private final C4136bXo y;

    @AssistedFactory
    /* renamed from: o.bWv$b */
    /* loaded from: classes4.dex */
    public interface b {
        C4116bWv c(String str);
    }

    public final String g() {
        return this.l;
    }

    public final C4132bXk j() {
        return this.p;
    }

    @AssistedInject
    public C4116bWv(aCG acg, C1567aGb c1567aGb, @ApplicationContext Context context, @Assisted String str, Scheduler scheduler, bNS bns, aDB adb, Lazy<XH> lazy, Lazy<InterfaceC5606cBq> lazy2, Lazy<BookmarkStore> lazy3, bZD bzd, C4136bXo c4136bXo, C4137bXp c4137bXp, C4132bXk c4132bXk) {
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) c1567aGb, "");
        C8632dsu.c((Object) context, "");
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
        this.n = acg;
        this.v = c1567aGb;
        this.e = context;
        this.l = str;
        this.u = scheduler;
        this.g = bns;
        this.m = adb;
        this.i = lazy;
        this.s = lazy2;
        this.h = lazy3;
        this.q = bzd;
        this.y = c4136bXo;
        this.t = c4137bXp;
        this.p = c4132bXk;
        this.f = new CompositeDisposable();
        this.r = str == null || str.length() == 0;
        this.j = new d();
        this.w = C8820dzt.b(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.x = new a();
        k();
    }

    /* renamed from: o.bWv$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("GraphQLLolomoRepositoryImpl");
        }

        public final IntentFilter e() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.netflix.mediaclient.ui.home.impl.repository.graphql.intent.action.FALKOR_AGENT_TO_GRAPHQL_LIST_REFRESH");
            return intentFilter;
        }
    }

    static {
        Set<String> a2;
        a2 = dqP.a("mobileFeeds");
        d = a2;
    }

    public final Single<C4001bSo> h() {
        Single<C4001bSo> single;
        synchronized (this) {
            single = this.k;
        }
        return single;
    }

    public final void e(Single<C4001bSo> single) {
        synchronized (this) {
            this.k = single;
        }
    }

    private final Completable e() {
        return AbstractApplicationC1040Mh.getInstance().i().t();
    }

    private final aOV i() {
        return AbstractApplicationC1040Mh.getInstance().i().d();
    }

    /* renamed from: o.bWv$d */
    /* loaded from: classes4.dex */
    public static final class d extends BroadcastReceiver {
        d() {
            C4116bWv.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            C4116bWv.this.e(intent);
        }
    }

    public final void e(Intent intent) {
        String stringExtra = intent.getStringExtra("INTENT_EXTRA_LIST_ID");
        String stringExtra2 = intent.getStringExtra("INTENT_EXTRA_RENO_MESSAGE_ID");
        String stringExtra3 = intent.getStringExtra("INTENT_EXTRA_SOURCE_OF_REFRESH");
        if (C8632dsu.c((Object) this.l, (Object) "myProfile")) {
            LoMoType loMoType = LoMoType.INSTANT_QUEUE;
            if (C8632dsu.c((Object) stringExtra, (Object) loMoType.a())) {
                e(LoMoType.REMINDERS.a(), stringExtra2, stringExtra3);
            } else if (C8632dsu.c((Object) stringExtra, (Object) LoMoType.REMINDERS.a())) {
                e(loMoType.a(), stringExtra2, stringExtra3);
            }
        }
        e(stringExtra, stringExtra2, stringExtra3);
    }

    /* renamed from: o.bWv$a */
    /* loaded from: classes4.dex */
    public static final class a extends BroadcastReceiver {
        a() {
            C4116bWv.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            String stringExtra = intent.getStringExtra("INTENT_EXTRA_RECENTLY_WATCHED_REMOVED_VIDEO_ID");
            if (stringExtra == null || stringExtra.length() == 0) {
                return;
            }
            C4116bWv.this.w.a(stringExtra);
        }
    }

    private final void k() {
        boolean b2;
        b2 = C8576dqs.b((Iterable<? extends String>) d, this.l);
        if (!b2) {
            C8116deM.a(this.e, this.j, a.e());
        }
        if (C8632dsu.c((Object) this.l, (Object) "myProfile")) {
            C8116deM.a(this.e, this.x, b);
        }
    }

    private final void n() {
        C8116deM.a(this.e, this.j);
        C8116deM.a(this.e, this.x);
    }

    @Override // o.InterfaceC4004bSr
    public void b() {
        n();
        this.f.clear();
    }

    @Override // o.InterfaceC4007bSu
    /* renamed from: f */
    public InterfaceC8814dzn<String> d() {
        return dyR.e((InterfaceC8810dzj) this.w);
    }

    @Override // o.InterfaceC4004bSr
    public Single<InterfaceC5241buz> b(String str, boolean z) {
        List e2;
        C8632dsu.c((Object) str, "");
        e2 = C8566dqi.e(Integer.valueOf(Integer.parseInt(str)));
        Single e3 = aCE.d.e(this.n, new C1353Yk(e2, this.m.b()), z ? QueryMode.c : QueryMode.b, null, false, 12, null);
        final GraphQLLolomoRepositoryImpl$getQuickDrawVideoDetails$1 graphQLLolomoRepositoryImpl$getQuickDrawVideoDetails$1 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$getQuickDrawVideoDetails$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                C4116bWv.c cVar = C4116bWv.a;
            }
        };
        Single doOnError = e3.doOnError(new Consumer() { // from class: o.bWR
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4116bWv.V(drM.this, obj);
            }
        });
        final GraphQLLolomoRepositoryImpl$getQuickDrawVideoDetails$2 graphQLLolomoRepositoryImpl$getQuickDrawVideoDetails$2 = new drM<C8954gU<C1353Yk.a>, InterfaceC5241buz>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$getQuickDrawVideoDetails$2
            @Override // o.drM
            /* renamed from: b */
            public final InterfaceC5241buz invoke(C8954gU<C1353Yk.a> c8954gU) {
                C8632dsu.c((Object) c8954gU, "");
                InterfaceC5241buz c2 = aEJ.c.c((C1353Yk.a) aCK.b(c8954gU, false, 1, null));
                if (c2 != null) {
                    return c2;
                }
                throw new IllegalStateException("Invalid response received for dp lite details");
            }
        };
        Single<InterfaceC5241buz> observeOn = doOnError.map(new Function() { // from class: o.bXa
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                InterfaceC5241buz U;
                U = C4116bWv.U(drM.this, obj);
                return U;
            }
        }).observeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(observeOn, "");
        return observeOn;
    }

    public static final void V(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final InterfaceC5241buz U(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (InterfaceC5241buz) drm.invoke(obj);
    }

    @Override // o.InterfaceC4007bSu
    public Single<C4001bSo> a(final int i, final int i2, final List<Integer> list, final int i3, int i4, final String str, final String str2) {
        C8632dsu.c((Object) list, "");
        this.f13552o = list;
        final Consumer consumer = new Consumer() { // from class: o.bWL
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4116bWv.e(C4116bWv.this, i2, (C4001bSo) obj);
            }
        };
        aQS.e e2 = aQS.a.e();
        final boolean z = e2.b() && e2.a() == 0 && this.r;
        Single defer = Single.defer(new Callable() { // from class: o.bWJ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SingleSource c2;
                c2 = C4116bWv.c(C4116bWv.this, consumer, i, i2, str, list, str2, i3, z);
                return c2;
            }
        });
        C8632dsu.a(defer, "");
        Single<C4001bSo> andThen = e().andThen(defer);
        C8632dsu.a(andThen, "");
        return andThen;
    }

    public static final void e(C4116bWv c4116bWv, int i, C4001bSo c4001bSo) {
        C8632dsu.c((Object) c4116bWv, "");
        if (c4116bWv.r) {
            InterfaceC5155btS b2 = c4001bSo.b();
            aSC.a(b2 != null ? b2.getLolomoId() : null);
        }
        c4116bWv.b(c4001bSo.e(), 0, i);
        C4105bWk.c(c4001bSo, c4116bWv.n);
    }

    public static final SingleSource c(final C4116bWv c4116bWv, Consumer consumer, int i, int i2, String str, List list, String str2, int i3, final boolean z) {
        QueryMode queryMode;
        C8632dsu.c((Object) c4116bWv, "");
        C8632dsu.c((Object) consumer, "");
        C8632dsu.c((Object) list, "");
        Single<C4001bSo> single = c4116bWv.k;
        if (single != null && c4116bWv.r) {
            C8632dsu.d(single);
            return single.doOnSuccess(consumer).doAfterTerminate(new Action() { // from class: o.bWG
                @Override // io.reactivex.functions.Action
                public final void run() {
                    C4116bWv.g(C4116bWv.this);
                }
            });
        }
        YQ d2 = c4116bWv.d(i, i2, str, list, str2);
        if (i3 == 0) {
            queryMode = QueryMode.b;
        } else {
            queryMode = QueryMode.d;
        }
        Single e2 = aCE.d.e(c4116bWv.n, d2, queryMode, RequestPriority.a, false, 8, null);
        final drM<C8954gU<YQ.e>, dpR> drm = new drM<C8954gU<YQ.e>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchLolomo$fetchLolomoSingle$1$3
            {
                super(1);
            }

            public final void b(C8954gU<YQ.e> c8954gU) {
                C4116bWv.c cVar = C4116bWv.a;
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C8954gU<YQ.e> c8954gU) {
                b(c8954gU);
                return dpR.c;
            }
        };
        Single doOnSuccess = e2.doOnSuccess(new Consumer() { // from class: o.bWD
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4116bWv.c(drM.this, obj);
            }
        });
        final drM<C8954gU<YQ.e>, dpR> drm2 = new drM<C8954gU<YQ.e>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchLolomo$fetchLolomoSingle$1$4
            {
                super(1);
            }

            public final void d(C8954gU<YQ.e> c8954gU) {
                C4116bWv c4116bWv2 = C4116bWv.this;
                C8632dsu.d(c8954gU);
                c4116bWv2.e(c8954gU);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C8954gU<YQ.e> c8954gU) {
                d(c8954gU);
                return dpR.c;
            }
        };
        Single doAfterSuccess = doOnSuccess.doAfterSuccess(new Consumer() { // from class: o.bWE
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4116bWv.I(drM.this, obj);
            }
        });
        final drM<C8954gU<YQ.e>, C4001bSo> drm3 = new drM<C8954gU<YQ.e>, C4001bSo>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchLolomo$fetchLolomoSingle$1$5
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final C4001bSo invoke(C8954gU<YQ.e> c8954gU) {
                YQ.d e3;
                C2520ahd c2;
                C8632dsu.c((Object) c8954gU, "");
                C4116bWv c4116bWv2 = C4116bWv.this;
                YQ.e eVar = c8954gU.d;
                String e4 = (eVar == null || (e3 = eVar.e()) == null || (c2 = e3.c()) == null) ? null : c2.e();
                String g = C4116bWv.this.g();
                boolean c3 = C9083ir.c(c8954gU);
                c4116bWv2.e("fetchLolomo: id: " + e4 + ", genreId: " + g + ", isFromCache: " + c3);
                return C4116bWv.this.j().e((YQ.e) aCK.b(c8954gU, false, 1, null), C9083ir.c(c8954gU));
            }
        };
        Single doOnSuccess2 = doAfterSuccess.map(new Function() { // from class: o.bWC
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C4001bSo F;
                F = C4116bWv.F(drM.this, obj);
                return F;
            }
        }).doOnSuccess(consumer);
        final drM<C4001bSo, SingleSource<? extends C4001bSo>> drm4 = new drM<C4001bSo, SingleSource<? extends C4001bSo>>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchLolomo$fetchLolomoSingle$1$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final SingleSource<? extends C4001bSo> invoke(C4001bSo c4001bSo) {
                C8632dsu.c((Object) c4001bSo, "");
                if (z) {
                    return c4116bWv.c(c4001bSo);
                }
                Single just = Single.just(c4001bSo);
                C8632dsu.d(just);
                return just;
            }
        };
        return doOnSuccess2.flatMap(new Function() { // from class: o.bWF
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource E;
                E = C4116bWv.E(drM.this, obj);
                return E;
            }
        }).subscribeOn(c4116bWv.u);
    }

    public static final void g(C4116bWv c4116bWv) {
        C8632dsu.c((Object) c4116bWv, "");
        c4116bWv.k = null;
    }

    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final void I(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final C4001bSo F(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (C4001bSo) drm.invoke(obj);
    }

    public static final SingleSource E(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    @Override // o.InterfaceC4007bSu
    public Single<List<C4003bSq>> c(final InterfaceC5155btS interfaceC5155btS, final int i, final LoMo loMo, final Integer num) {
        GraphQLLoMo graphQLLoMo;
        String c2;
        C8632dsu.c((Object) interfaceC5155btS, "");
        if (!(interfaceC5155btS instanceof C1532aEu) || !(loMo instanceof GraphQLLoMo) || (c2 = (graphQLLoMo = (GraphQLLoMo) loMo).c()) == null || c2.length() == 0 || num == null || num.intValue() <= 0) {
            Single<List<C4003bSq>> error = Single.error(new IllegalStateException("Unexpected input: \nlolomoSummary = " + interfaceC5155btS + ", \nafter = " + loMo + ", \nprefetchEntities = " + num));
            C8632dsu.a(error, "");
            return error;
        }
        Single<List<C4003bSq>> defer = Single.defer(new Callable() { // from class: o.bWI
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SingleSource a2;
                a2 = C4116bWv.a(InterfaceC5155btS.this, i, num, loMo, this);
                return a2;
            }
        });
        C8632dsu.a(defer, "");
        aQS.e e2 = aQS.a.e();
        Completable e3 = e();
        if (e2.b() && this.r && e2.a() <= graphQLLoMo.getListPos() + 1) {
            defer = e(interfaceC5155btS, i, loMo, num);
        }
        Single<List<C4003bSq>> andThen = e3.andThen(defer);
        C8632dsu.a(andThen, "");
        return andThen;
    }

    public static final SingleSource a(final InterfaceC5155btS interfaceC5155btS, final int i, Integer num, final LoMo loMo, C4116bWv c4116bWv) {
        C8632dsu.c((Object) interfaceC5155btS, "");
        C8632dsu.c((Object) c4116bWv, "");
        String lolomoId = ((C1532aEu) interfaceC5155btS).getLolomoId();
        int intValue = num.intValue();
        String c2 = ((GraphQLLoMo) loMo).c();
        C8632dsu.d((Object) c2);
        boolean z = !C8151dev.f() || C8151dev.d();
        boolean z2 = C8151dev.f() || C8151dev.d();
        boolean e2 = C8171dfO.e();
        boolean b2 = C1888aRz.d.b();
        C2865aoD b3 = c4116bWv.m.b();
        C4128bXg c4128bXg = C4128bXg.d;
        Single e3 = aCE.d.e(c4116bWv.n, new YK(lolomoId, i, intValue, c2, z, z2, e2, null, false, b2, b3, c4128bXg.e(c4116bWv.i()), c4128bXg.b(c4116bWv.i()), aDB.d(c4116bWv.m, false, 0.0d, null, 7, null), aDB.e(c4116bWv.m, 0.0d, null, 3, null), c4128bXg.d(), c4128bXg.j(), c4128bXg.b(), c4128bXg.g(), c4128bXg.c(c4116bWv.i()), c4116bWv.m.i(), c4128bXg.e(), c4116bWv.m.f(), c4116bWv.m.j(), c4116bWv.m.o(), c4116bWv.m.h(), c4116bWv.m.k(), c4116bWv.m.l(), c4128bXg.c(), c4128bXg.a(), c4128bXg.f(), c4128bXg.i(), 128, null), null, RequestPriority.a, false, 10, null);
        final drM<C8954gU<YK.b>, dpR> drm = new drM<C8954gU<YK.b>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchMoreRows$fetchMoreRowsSingle$1$1
            {
                super(1);
            }

            public final void c(C8954gU<YK.b> c8954gU) {
                C4116bWv c4116bWv2 = C4116bWv.this;
                C8632dsu.d(c8954gU);
                c4116bWv2.d(c8954gU);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C8954gU<YK.b> c8954gU) {
                c(c8954gU);
                return dpR.c;
            }
        };
        Single doAfterSuccess = e3.doAfterSuccess(new Consumer() { // from class: o.bWN
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4116bWv.N(drM.this, obj);
            }
        });
        final drM<C8954gU<YK.b>, List<? extends C4003bSq>> drm2 = new drM<C8954gU<YK.b>, List<? extends C4003bSq>>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchMoreRows$fetchMoreRowsSingle$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final List<C4003bSq> invoke(C8954gU<YK.b> c8954gU) {
                C4137bXp c4137bXp;
                C8632dsu.c((Object) c8954gU, "");
                C4116bWv c4116bWv2 = C4116bWv.this;
                String lolomoId2 = ((C1532aEu) interfaceC5155btS).getLolomoId();
                boolean c3 = C9083ir.c(c8954gU);
                c4116bWv2.e("fetchMoreRows: id: " + lolomoId2 + ", isFromCache: " + c3);
                c4137bXp = C4116bWv.this.t;
                return c4137bXp.e((YK.b) aCK.b(c8954gU, false, 1, null));
            }
        };
        Single map = doAfterSuccess.map(new Function() { // from class: o.bWP
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List S;
                S = C4116bWv.S(drM.this, obj);
                return S;
            }
        });
        final drM<List<? extends C4003bSq>, dpR> drm3 = new drM<List<? extends C4003bSq>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchMoreRows$fetchMoreRowsSingle$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(List<? extends C4003bSq> list) {
                e(list);
                return dpR.c;
            }

            public final void e(List<C4003bSq> list) {
                aCG acg;
                C4116bWv.this.b(list, ((GraphQLLoMo) loMo).getListPos() + 1, i);
                acg = C4116bWv.this.n;
                C4105bWk.a(list, acg);
            }
        };
        return map.doOnSuccess(new Consumer() { // from class: o.bWV
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4116bWv.P(drM.this, obj);
            }
        }).subscribeOn(c4116bWv.u);
    }

    public static final void N(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final List S(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (List) drm.invoke(obj);
    }

    public static final void P(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final Single<List<C4003bSq>> e(final InterfaceC5155btS interfaceC5155btS, final int i, final LoMo loMo, final Integer num) {
        if (!(interfaceC5155btS instanceof C1532aEu) || num == null || num.intValue() <= 0) {
            Single<List<C4003bSq>> error = Single.error(new IllegalStateException("Unexpected input: \nlolomoSummary = " + interfaceC5155btS + ", \nafter = " + loMo + ", \nprefetchEntities = " + num));
            C8632dsu.a(error, "");
            return error;
        }
        Single defer = Single.defer(new Callable() { // from class: o.bWO
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SingleSource a2;
                a2 = C4116bWv.a(C4116bWv.this, i, interfaceC5155btS, num, loMo);
                return a2;
            }
        });
        C8632dsu.a(defer, "");
        Single<List<C4003bSq>> andThen = e().andThen(defer);
        C8632dsu.a(andThen, "");
        return andThen;
    }

    public static final SingleSource a(C4116bWv c4116bWv, final int i, final InterfaceC5155btS interfaceC5155btS, Integer num, final LoMo loMo) {
        QueryMode queryMode;
        C8632dsu.c((Object) c4116bWv, "");
        C8632dsu.c((Object) interfaceC5155btS, "");
        aQS.e e2 = aQS.a.e();
        int d2 = (e2.b() && c4116bWv.r) ? e2.d() : i;
        String lolomoId = ((C1532aEu) interfaceC5155btS).getLolomoId();
        int intValue = num.intValue();
        GraphQLLoMo graphQLLoMo = loMo instanceof GraphQLLoMo ? (GraphQLLoMo) loMo : null;
        String c2 = graphQLLoMo != null ? graphQLLoMo.c() : null;
        boolean z = !C8151dev.f() || C8151dev.d();
        boolean z2 = C8151dev.f() || C8151dev.d();
        boolean e3 = C8171dfO.e();
        boolean b2 = C1888aRz.d.b();
        C2865aoD b3 = c4116bWv.m.b();
        C4128bXg c4128bXg = C4128bXg.d;
        YH yh = new YH(lolomoId, d2, intValue, c2, z, z2, e3, null, false, b2, b3, c4128bXg.e(c4116bWv.i()), c4128bXg.b(c4116bWv.i()), aDB.d(c4116bWv.m, false, 0.0d, null, 7, null), aDB.e(c4116bWv.m, 0.0d, null, 3, null), c4128bXg.d(), c4128bXg.j(), c4128bXg.b(), c4128bXg.g(), c4128bXg.c(c4116bWv.i()), c4116bWv.m.i(), c4128bXg.e(), c4116bWv.m.f(), c4116bWv.m.j(), c4116bWv.m.o(), c4116bWv.m.h(), c4116bWv.m.k(), c4116bWv.m.l(), c4128bXg.c(), c4128bXg.a(), c4128bXg.f(), c4128bXg.i(), 128, null);
        if (e2.b() && e2.c()) {
            queryMode = QueryMode.d;
        } else {
            queryMode = QueryMode.b;
        }
        Single e4 = aCE.d.e(c4116bWv.n, yh, queryMode, RequestPriority.a, false, 8, null);
        final drM<C8954gU<YH.d>, dpR> drm = new drM<C8954gU<YH.d>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchMoreAdaptedRows$fetchMoreRowsSingle$1$1
            {
                super(1);
            }

            public final void e(C8954gU<YH.d> c8954gU) {
                C4116bWv c4116bWv2 = C4116bWv.this;
                C8632dsu.d(c8954gU);
                c4116bWv2.a(c8954gU);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C8954gU<YH.d> c8954gU) {
                e(c8954gU);
                return dpR.c;
            }
        };
        Single doAfterSuccess = e4.doAfterSuccess(new Consumer() { // from class: o.bWA
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4116bWv.H(drM.this, obj);
            }
        });
        final drM<C8954gU<YH.d>, List<? extends C4003bSq>> drm2 = new drM<C8954gU<YH.d>, List<? extends C4003bSq>>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchMoreAdaptedRows$fetchMoreRowsSingle$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final List<C4003bSq> invoke(C8954gU<YH.d> c8954gU) {
                C4137bXp c4137bXp;
                C8632dsu.c((Object) c8954gU, "");
                C4116bWv c4116bWv2 = C4116bWv.this;
                String lolomoId2 = ((C1532aEu) interfaceC5155btS).getLolomoId();
                boolean c3 = C9083ir.c(c8954gU);
                c4116bWv2.e("fetchMoreRows: id: " + lolomoId2 + ", isFromCache: " + c3);
                c4137bXp = C4116bWv.this.t;
                return c4137bXp.b((YH.d) aCK.b(c8954gU, false, 1, null));
            }
        };
        Single map = doAfterSuccess.map(new Function() { // from class: o.bWx
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List L;
                L = C4116bWv.L(drM.this, obj);
                return L;
            }
        });
        final drM<List<? extends C4003bSq>, dpR> drm3 = new drM<List<? extends C4003bSq>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchMoreAdaptedRows$fetchMoreRowsSingle$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(List<? extends C4003bSq> list) {
                a(list);
                return dpR.c;
            }

            public final void a(List<C4003bSq> list) {
                aCG acg;
                C4116bWv c4116bWv2 = C4116bWv.this;
                LoMo loMo2 = loMo;
                c4116bWv2.b(list, (loMo2 != null ? loMo2.getListPos() : 0) + 1, i);
                acg = C4116bWv.this.n;
                C4105bWk.a(list, acg);
            }
        };
        return map.doOnSuccess(new Consumer() { // from class: o.bWB
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4116bWv.J(drM.this, obj);
            }
        }).subscribeOn(c4116bWv.u);
    }

    public static final void H(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final List L(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (List) drm.invoke(obj);
    }

    public static final void J(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.InterfaceC4007bSu
    public Single<C4003bSq> c(final InterfaceC5155btS interfaceC5155btS, final int i, final int i2, final boolean z) {
        C8632dsu.c((Object) interfaceC5155btS, "");
        Single defer = Single.defer(new Callable() { // from class: o.bWz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SingleSource c2;
                c2 = C4116bWv.c(InterfaceC5155btS.this, i, i2, this, z);
                return c2;
            }
        });
        C8632dsu.a(defer, "");
        Single<C4003bSq> andThen = e().andThen(defer);
        C8632dsu.a(andThen, "");
        return andThen;
    }

    public static final SingleSource c(final InterfaceC5155btS interfaceC5155btS, final int i, final int i2, C4116bWv c4116bWv, boolean z) {
        C8632dsu.c((Object) interfaceC5155btS, "");
        C8632dsu.c((Object) c4116bWv, "");
        String lolomoId = interfaceC5155btS.getLolomoId();
        C8632dsu.a(lolomoId, "");
        boolean z2 = !C8151dev.f() || C8151dev.d();
        boolean z3 = C8151dev.f() || C8151dev.d();
        boolean e2 = C8171dfO.e();
        boolean b2 = C1888aRz.d.b();
        C2865aoD b3 = c4116bWv.m.b();
        C4128bXg c4128bXg = C4128bXg.d;
        Single e3 = aCE.d.e(c4116bWv.n, new C1371Yv(lolomoId, i, i2, z2, z3, e2, null, false, b2, b3, c4128bXg.e(c4116bWv.i()), c4128bXg.b(c4116bWv.i()), aDB.d(c4116bWv.m, false, 0.0d, null, 7, null), aDB.e(c4116bWv.m, 0.0d, null, 3, null), c4128bXg.d(), c4128bXg.j(), c4128bXg.b(), c4128bXg.g(), c4128bXg.c(c4116bWv.i()), c4116bWv.m.i(), c4128bXg.e(), c4116bWv.m.f(), c4116bWv.m.j(), c4116bWv.m.o(), c4116bWv.m.h(), c4116bWv.m.k(), c4116bWv.m.l(), c4128bXg.c(), c4128bXg.a(), c4128bXg.f(), c4128bXg.i(), 64, null), z ? QueryMode.d : QueryMode.b, RequestPriority.a, false, 8, null);
        final drM<C8954gU<C1371Yv.e>, C4003bSq> drm = new drM<C8954gU<C1371Yv.e>, C4003bSq>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchRow$fetchRowSingle$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final C4003bSq invoke(C8954gU<C1371Yv.e> c8954gU) {
                C4137bXp c4137bXp;
                C8632dsu.c((Object) c8954gU, "");
                C4116bWv c4116bWv2 = C4116bWv.this;
                String lolomoId2 = interfaceC5155btS.getLolomoId();
                int i3 = i;
                boolean c2 = C9083ir.c(c8954gU);
                c4116bWv2.e("fetchRow: lolomoId: " + lolomoId2 + ", rowPosition: " + i3 + ", isFromCache: " + c2);
                c4137bXp = C4116bWv.this.t;
                return c4137bXp.c((C1371Yv.e) aCK.e(c8954gU));
            }
        };
        Single map = e3.map(new Function() { // from class: o.bWu
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C4003bSq O;
                O = C4116bWv.O(drM.this, obj);
                return O;
            }
        });
        final drM<C4003bSq, dpR> drm2 = new drM<C4003bSq, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchRow$fetchRowSingle$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4003bSq c4003bSq) {
                c(c4003bSq);
                return dpR.c;
            }

            public final void c(C4003bSq c4003bSq) {
                aCG acg;
                C4116bWv.this.e(c4003bSq, 0, i2);
                acg = C4116bWv.this.n;
                C4105bWk.e(c4003bSq, acg);
            }
        };
        return map.doOnSuccess(new Consumer() { // from class: o.bWH
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4116bWv.Q(drM.this, obj);
            }
        }).subscribeOn(c4116bWv.u);
    }

    public static final C4003bSq O(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (C4003bSq) drm.invoke(obj);
    }

    public static final void Q(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.InterfaceC4007bSu
    public Single<List<C4002bSp>> c(final InterfaceC5155btS interfaceC5155btS, final LoMo loMo, final int i, final InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug) {
        List i2;
        C8632dsu.c((Object) interfaceC5155btS, "");
        C8632dsu.c((Object) loMo, "");
        if (!(loMo instanceof GraphQLLoMo) || ((GraphQLLoMo) loMo).getListId().length() == 0) {
            i2 = C8569dql.i();
            Single<List<C4002bSp>> just = Single.just(i2);
            C8632dsu.a(just, "");
            return just;
        }
        Single defer = Single.defer(new Callable() { // from class: o.bWw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SingleSource b2;
                b2 = C4116bWv.b(InterfaceC5155btS.this, loMo, i, interfaceC5222bug, this);
                return b2;
            }
        });
        C8632dsu.a(defer, "");
        Single<List<C4002bSp>> andThen = e().andThen(defer);
        C8632dsu.a(andThen, "");
        return andThen;
    }

    public static final SingleSource b(final InterfaceC5155btS interfaceC5155btS, final LoMo loMo, final int i, final InterfaceC5222bug interfaceC5222bug, final C4116bWv c4116bWv) {
        C8632dsu.c((Object) interfaceC5155btS, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) c4116bWv, "");
        String lolomoId = interfaceC5155btS.getLolomoId();
        C8632dsu.a(lolomoId, "");
        int listPos = ((GraphQLLoMo) loMo).getListPos();
        String mo3080getCursor = interfaceC5222bug != null ? interfaceC5222bug.mo3080getCursor() : null;
        boolean z = !C8151dev.f() || C8151dev.d();
        boolean z2 = C8151dev.f() || C8151dev.d();
        boolean e2 = C8171dfO.e();
        boolean b2 = C1888aRz.d.b();
        C2865aoD b3 = c4116bWv.m.b();
        C4128bXg c4128bXg = C4128bXg.d;
        Single e3 = aCE.d.e(c4116bWv.n, new YL(lolomoId, listPos, i, mo3080getCursor, z, z2, e2, true, b2, b3, c4128bXg.e(c4116bWv.i()), c4128bXg.b(c4116bWv.i()), aDB.d(c4116bWv.m, false, 0.0d, null, 7, null), aDB.e(c4116bWv.m, 0.0d, null, 3, null), c4128bXg.d(), c4128bXg.j(), c4128bXg.b(), c4128bXg.g(), c4128bXg.c(c4116bWv.i()), c4116bWv.m.i(), c4128bXg.e(), c4116bWv.m.f(), c4116bWv.m.j(), c4116bWv.m.o(), c4116bWv.m.h(), c4116bWv.m.k(), c4116bWv.m.l(), c4128bXg.c(), c4128bXg.a(), c4128bXg.f(), c4128bXg.i()), null, RequestPriority.a, false, 10, null);
        final drM<C8954gU<YL.b>, List<? extends C4002bSp>> drm = new drM<C8954gU<YL.b>, List<? extends C4002bSp>>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchMoreEntities$fetchMoreEntitiesSingle$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final List<C4002bSp> invoke(C8954gU<YL.b> c8954gU) {
                C4136bXo c4136bXo;
                C2458agU a2;
                C2458agU a3;
                C2458agU.c c2;
                C2461agX b4;
                C2458agU a4;
                C2458agU.c c3;
                C2461agX b5;
                C8632dsu.c((Object) c8954gU, "");
                C4116bWv c4116bWv2 = C4116bWv.this;
                String lolomoId2 = interfaceC5155btS.getLolomoId();
                int listPos2 = ((GraphQLLoMo) loMo).getListPos();
                String listContext = ((GraphQLLoMo) loMo).getListContext();
                boolean c4 = C9083ir.c(c8954gU);
                c4116bWv2.e("fetchMoreEntities: lolomoId: " + lolomoId2 + ", listPos: " + listPos2 + ", listContext: " + listContext + ", isFromCache: " + c4);
                YL.b bVar = (YL.b) aCK.b(c8954gU, false, 1, null);
                YL.a b6 = bVar.b();
                String a5 = (b6 == null || (a4 = b6.a()) == null || (c3 = a4.c()) == null || (b5 = c3.b()) == null) ? null : b5.a();
                YL.a b7 = bVar.b();
                String e4 = (b7 == null || (a3 = b7.a()) == null || (c2 = a3.c()) == null || (b4 = c2.b()) == null) ? null : b4.e();
                YL.a b8 = bVar.b();
                Integer d2 = (b8 == null || (a2 = b8.a()) == null) ? null : a2.d();
                if (C8632dsu.c((Object) ((GraphQLLoMo) loMo).getListContext(), (Object) e4)) {
                    int listPos3 = ((GraphQLLoMo) loMo).getListPos();
                    if (d2 != null && listPos3 == d2.intValue()) {
                        c4136bXo = C4116bWv.this.y;
                        return c4136bXo.a(bVar);
                    }
                }
                C4116bWv c4116bWv3 = C4116bWv.this;
                String listContext2 = ((GraphQLLoMo) loMo).getListContext();
                int listPos4 = ((GraphQLLoMo) loMo).getListPos();
                String listId = ((GraphQLLoMo) loMo).getListId();
                c4116bWv3.e("fetchMoreEntities: !!MISMATCH!!: oldListContext: " + listContext2 + ", newListContext: " + e4 + ", oldListPos: " + listPos4 + ", newListPos: " + d2 + ", oldListId: " + listId + ", newListId: " + a5);
                String logTag = C4116bWv.a.getLogTag();
                throw new MismatchedRowException("SPY-34830: Mismatched list context in " + logTag + ".fetchMoreEntities", null, 2, null);
            }
        };
        Single map = e3.map(new Function() { // from class: o.bWU
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List K;
                K = C4116bWv.K(drM.this, obj);
                return K;
            }
        });
        final drM<List<? extends C4002bSp>, dpR> drm2 = new drM<List<? extends C4002bSp>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchMoreEntities$fetchMoreEntitiesSingle$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(List<? extends C4002bSp> list) {
                a(list);
                return dpR.c;
            }

            public final void a(List<C4002bSp> list) {
                aCG acg;
                InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug2 = interfaceC5222bug;
                c4116bWv.e(new C4003bSq(loMo, list), (interfaceC5222bug2 != null ? interfaceC5222bug2.getPosition() : -1) + 1, i);
                LoMo loMo2 = loMo;
                acg = c4116bWv.n;
                C4105bWk.e(list, loMo2, acg);
            }
        };
        return map.doOnSuccess(new Consumer() { // from class: o.bWT
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4116bWv.M(drM.this, obj);
            }
        }).subscribeOn(c4116bWv.u);
    }

    public static final List K(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (List) drm.invoke(obj);
    }

    public static final void M(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.InterfaceC4007bSu
    public Completable c(final String str, final String str2, final String str3, final Integer num, final String str4, final String str5, final Integer num2) {
        boolean g;
        boolean g2;
        C8632dsu.c((Object) str3, "");
        if (str != null) {
            g = C8691duz.g(str);
            if (!g && str2 != null) {
                g2 = C8691duz.g(str2);
                if (!g2 && num2 != null) {
                    Single defer = Single.defer(new Callable() { // from class: o.bWY
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            SingleSource b2;
                            b2 = C4116bWv.b(str4, num, str, str2, str3, num2, this, str5);
                            return b2;
                        }
                    });
                    C8632dsu.a(defer, "");
                    Completable andThen = e().andThen(defer.ignoreElement());
                    C8632dsu.a(andThen, "");
                    return andThen;
                }
            }
        }
        String str6 = "refreshList: Unexpected null or blank input: lolomoId: " + str + ", listId: " + str2 + ", listContext: " + str3 + ", sourceOfRefresh: " + str5 + ", columns: " + num2;
        e(str6);
        Completable error = Completable.error(new IllegalArgumentException(str6));
        C8632dsu.a(error, "");
        return error;
    }

    public static final SingleSource b(final String str, Integer num, final String str2, final String str3, final String str4, final Integer num2, C4116bWv c4116bWv, final String str5) {
        AbstractC8997hK abstractC8997hK;
        C8632dsu.c((Object) str4, "");
        C8632dsu.c((Object) c4116bWv, "");
        if (str == null || str.length() == 0) {
            abstractC8997hK = AbstractC8997hK.e.c;
        } else {
            abstractC8997hK = new AbstractC8997hK.b(new C2983aqP(new AbstractC8997hK.b(str)));
        }
        C2980aqM c2980aqM = new C2980aqM(str2, str3, str4, true, abstractC8997hK, AbstractC8997hK.d.b(num));
        int intValue = num2.intValue();
        boolean z = !C8151dev.f() || C8151dev.d();
        boolean z2 = C8151dev.f() || C8151dev.d();
        boolean e2 = C8171dfO.e();
        boolean b2 = C1888aRz.d.b();
        C2865aoD b3 = c4116bWv.m.b();
        C4128bXg c4128bXg = C4128bXg.d;
        Single e3 = aCE.d.e(c4116bWv.n, new C1387Zl(c2980aqM, intValue, z, z2, e2, null, false, b2, b3, c4128bXg.e(c4116bWv.i()), c4128bXg.b(c4116bWv.i()), aDB.d(c4116bWv.m, false, 0.0d, null, 7, null), aDB.e(c4116bWv.m, 0.0d, null, 3, null), c4128bXg.d(), c4128bXg.j(), c4128bXg.b(), c4128bXg.g(), c4128bXg.c(c4116bWv.i()), c4116bWv.m.i(), c4128bXg.e(), c4116bWv.m.f(), c4116bWv.m.j(), c4116bWv.m.o(), c4116bWv.m.h(), c4116bWv.m.k(), c4116bWv.m.l(), c4128bXg.c(), c4128bXg.a(), c4128bXg.f(), c4128bXg.i(), 32, null), null, false, RequestPriority.a, false, 18, null);
        if (aQS.a.b() && c4116bWv.r) {
            e3 = e3.delay(200L, TimeUnit.MILLISECONDS);
        }
        final drM<C8954gU<C1387Zl.c>, C4003bSq> drm = new drM<C8954gU<C1387Zl.c>, C4003bSq>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$refreshList$refreshListGraphQLSingle$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final C4003bSq invoke(C8954gU<C1387Zl.c> c8954gU) {
                C4137bXp c4137bXp;
                boolean z3;
                C2458agU e4;
                C2458agU.c c2;
                C2461agX b4;
                C2458agU e5;
                C2458agU.c c3;
                C2461agX b5;
                C2458agU e6;
                C8632dsu.c((Object) c8954gU, "");
                C4116bWv c4116bWv2 = C4116bWv.this;
                String str6 = str2;
                String str7 = str5;
                String str8 = str3;
                String str9 = str4;
                c4116bWv2.e("refreshList: lolomoId: " + str6 + ", sourceOfRefresh: " + str7 + ", listId: " + str8 + ", listContext: " + str9);
                C1387Zl.c cVar = (C1387Zl.c) aCK.e(c8954gU);
                C1387Zl.b e7 = cVar.e();
                String e8 = (e7 == null || (e6 = e7.e()) == null) ? null : e6.e();
                C1387Zl.b e9 = cVar.e();
                String a2 = (e9 == null || (e5 = e9.e()) == null || (c3 = e5.c()) == null || (b5 = c3.b()) == null) ? null : b5.a();
                C1387Zl.b e10 = cVar.e();
                String e11 = (e10 == null || (e4 = e10.e()) == null || (c2 = e4.c()) == null || (b4 = c2.b()) == null) ? null : b4.e();
                if (C8632dsu.c((Object) str4, (Object) e11)) {
                    c4137bXp = C4116bWv.this.t;
                    C4003bSq e12 = c4137bXp.e(cVar);
                    if (e12 != null) {
                        return e12;
                    }
                    throw new IllegalStateException("Invalid response received for refresh list");
                }
                C4116bWv c4116bWv3 = C4116bWv.this;
                String str10 = str2;
                String str11 = str4;
                String str12 = str3;
                c4116bWv3.e("refreshList: !!MISMATCH!!: oldLolomoId: " + str10 + ", newLolomoId: " + e8 + ", oldListContext: " + str11 + ", newListContext: " + e11 + ", oldListId: " + str12 + ", newListId: " + a2);
                z3 = C4116bWv.this.r;
                if (z3) {
                    aSC.a(e8);
                }
                String logTag = C4116bWv.a.getLogTag();
                throw new MismatchedRowException("SPY-34830: Mismatched list context in " + logTag + ".refreshList", null, 2, null);
            }
        };
        Single map = e3.map(new Function() { // from class: o.bWS
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C4003bSq ac;
                ac = C4116bWv.ac(drM.this, obj);
                return ac;
            }
        });
        final drM<C4003bSq, dpR> drm2 = new drM<C4003bSq, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$refreshList$refreshListGraphQLSingle$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4003bSq c4003bSq) {
                e(c4003bSq);
                return dpR.c;
            }

            public final void e(C4003bSq c4003bSq) {
                Context context;
                List<C4002bSp> e4;
                int d2;
                Context context2;
                aCG acg;
                Context context3;
                context = C4116bWv.this.e;
                aSC.a(context, str4, str);
                String str6 = str4;
                if (C8632dsu.c((Object) str6, (Object) LoMoType.CONTINUE_WATCHING.a())) {
                    Intent intent = new Intent("com.netflix.mediaclient.intent.action.DETAIL_PAGE_REFRESH");
                    context3 = C4116bWv.this.e;
                    LocalBroadcastManager.getInstance(context3).sendBroadcast(intent);
                } else if (C8632dsu.c((Object) str6, (Object) LoMoType.TOP_TEN.a()) && (e4 = c4003bSq.e()) != null && (!e4.isEmpty()) && C4116bWv.this.g() == null) {
                    d2 = C8572dqo.d(e4, 10);
                    ArrayList arrayList = new ArrayList(d2);
                    for (C4002bSp c4002bSp : e4) {
                        arrayList.add(c4002bSp.a().getVideo());
                    }
                    context2 = C4116bWv.this.e;
                    aSC.c(context2, arrayList, true);
                }
                C4116bWv.this.e(c4003bSq, 0, num2.intValue());
                acg = C4116bWv.this.n;
                C4105bWk.e(c4003bSq, acg);
            }
        };
        return map.doOnSuccess(new Consumer() { // from class: o.bWX
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4116bWv.Y(drM.this, obj);
            }
        }).subscribeOn(c4116bWv.u);
    }

    public static final C4003bSq ac(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (C4003bSq) drm.invoke(obj);
    }

    public static final void Y(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final CompletableSource ab(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (CompletableSource) drm.invoke(obj);
    }

    @Override // o.InterfaceC4007bSu
    public Completable d(final String str, final int i, final int i2) {
        C8632dsu.c((Object) str, "");
        Single<InterfaceC5155btS> c2 = c();
        final drM<InterfaceC5155btS, CompletableSource> drm = new drM<InterfaceC5155btS, CompletableSource>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$refreshCollectTasteRow$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final CompletableSource invoke(InterfaceC5155btS interfaceC5155btS) {
                C8632dsu.c((Object) interfaceC5155btS, "");
                C4116bWv c4116bWv = C4116bWv.this;
                String id = interfaceC5155btS.getId();
                String str2 = str;
                String a2 = LoMoType.BULK_RATER.a();
                C8632dsu.a(a2, "");
                return c4116bWv.c(id, str2, a2, Integer.valueOf(i), null, "GQLLolomoRepo.refreshCollectTaste", Integer.valueOf(i2));
            }
        };
        Completable flatMapCompletable = c2.flatMapCompletable(new Function() { // from class: o.bWy
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                CompletableSource ab;
                ab = C4116bWv.ab(drM.this, obj);
                return ab;
            }
        });
        C8632dsu.a(flatMapCompletable, "");
        return flatMapCompletable;
    }

    public static final SingleSource d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    @Override // o.InterfaceC4007bSu
    public Single<C4003bSq> a(final int i, final int i2) {
        Single<InterfaceC5155btS> c2 = c();
        final drM<InterfaceC5155btS, SingleSource<? extends C4003bSq>> drm = new drM<InterfaceC5155btS, SingleSource<? extends C4003bSq>>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchCollectTasteTitles$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final SingleSource<? extends C4003bSq> invoke(InterfaceC5155btS interfaceC5155btS) {
                C8632dsu.c((Object) interfaceC5155btS, "");
                return InterfaceC4007bSu.b.e(C4116bWv.this, interfaceC5155btS, i, i2, false, 8, null);
            }
        };
        Single flatMap = c2.flatMap(new Function() { // from class: o.bWM
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource d2;
                d2 = C4116bWv.d(drM.this, obj);
                return d2;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    @Override // o.InterfaceC4007bSu
    public Single<Optional<C4003bSq>> b(int i, boolean z) {
        int a2 = a();
        Single<C4001bSo> o2 = o();
        final GraphQLLolomoRepositoryImpl$fetchContinueWatchingTitles$1 graphQLLolomoRepositoryImpl$fetchContinueWatchingTitles$1 = new GraphQLLolomoRepositoryImpl$fetchContinueWatchingTitles$1(this, i, a2, z);
        Single flatMap = o2.flatMap(new Function() { // from class: o.bWW
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource b2;
                b2 = C4116bWv.b(drM.this, obj);
                return b2;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    public static final SingleSource b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    @Override // o.InterfaceC4007bSu
    public Single<Optional<C4003bSq>> c(int i, boolean z) {
        int a2 = a();
        Single<C4001bSo> o2 = o();
        final GraphQLLolomoRepositoryImpl$fetchGamesRow$1 graphQLLolomoRepositoryImpl$fetchGamesRow$1 = new GraphQLLolomoRepositoryImpl$fetchGamesRow$1(this, i, a2, z);
        Single flatMap = o2.flatMap(new Function() { // from class: o.bWK
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource e2;
                e2 = C4116bWv.e(drM.this, obj);
                return e2;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    public static final SingleSource e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public static final InterfaceC5155btS R(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (InterfaceC5155btS) drm.invoke(obj);
    }

    @Override // o.InterfaceC4007bSu
    public Single<InterfaceC5155btS> c() {
        Single<C4001bSo> o2 = o();
        final GraphQLLolomoRepositoryImpl$getCurrentLolomo$1 graphQLLolomoRepositoryImpl$getCurrentLolomo$1 = new drM<C4001bSo, InterfaceC5155btS>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$getCurrentLolomo$1
            @Override // o.drM
            /* renamed from: b */
            public final InterfaceC5155btS invoke(C4001bSo c4001bSo) {
                C8632dsu.c((Object) c4001bSo, "");
                return c4001bSo.b();
            }
        };
        Single map = o2.map(new Function() { // from class: o.bWQ
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                InterfaceC5155btS R;
                R = C4116bWv.R(drM.this, obj);
                return R;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    private final Single<C4001bSo> o() {
        int c2 = c(true);
        int a2 = a();
        List<Integer> list = this.f13552o;
        if (list == null) {
            list = C8569dql.i();
        }
        Single a3 = InterfaceC4007bSu.b.a(this, c2, a2, list, 0, 0, null, null, 64, null);
        final GraphQLLolomoRepositoryImpl$getCurrentLolomoResponse$1 graphQLLolomoRepositoryImpl$getCurrentLolomoResponse$1 = new drM<C4001bSo, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$getCurrentLolomoResponse$1
            public final void a(C4001bSo c4001bSo) {
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4001bSo c4001bSo) {
                a(c4001bSo);
                return dpR.c;
            }
        };
        Single<C4001bSo> doOnSuccess = a3.doOnSuccess(new Consumer() { // from class: o.bWZ
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4116bWv.W(drM.this, obj);
            }
        });
        C8632dsu.a(doOnSuccess, "");
        return doOnSuccess;
    }

    public static final void W(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    private final void e(final String str, String str2, String str3) {
        DisposableKt.plusAssign(this.f, SubscribersKt.subscribeBy(c(str, str2, str3), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$handleFalcorAgentListRefresh$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                boolean z;
                Context context;
                Context context2;
                C8632dsu.c((Object) th, "");
                boolean z2 = C8632dsu.c((Object) str, (Object) LoMoType.CONTINUE_WATCHING.a()) || C8632dsu.c((Object) str, (Object) LoMoType.INSTANT_QUEUE.a());
                z = this.r;
                if (z && z2) {
                    context = this.e;
                    if (ConnectivityUtils.l(context)) {
                        context2 = this.e;
                        aSC.b(context2, null);
                    }
                }
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$handleFalcorAgentListRefresh$2
            public final void d() {
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                d();
                return dpR.c;
            }
        }));
    }

    public final Completable c(String str, String str2, String str3) {
        return dAZ.d(null, new GraphQLLolomoRepositoryImpl$handleBackgroundListRefresh$1(str, this, str2, str3, null), 1, null);
    }

    public final void e(C8954gU<YQ.e> c8954gU) {
        YQ.d e2;
        YQ.b d2;
        C2463agZ b2;
        if (C9083ir.c(c8954gU)) {
            YQ.e eVar = c8954gU.d;
            d((eVar == null || (e2 = eVar.e()) == null || (d2 = e2.d()) == null || (b2 = d2.b()) == null) ? null : b2.e());
        }
    }

    public final void d(C8954gU<YK.b> c8954gU) {
        YK.d b2;
        YK.c d2;
        C2463agZ d3;
        if (C9083ir.c(c8954gU)) {
            YK.b bVar = c8954gU.d;
            d((bVar == null || (b2 = bVar.b()) == null || (d2 = b2.d()) == null || (d3 = d2.d()) == null) ? null : d3.e());
        }
    }

    public final void a(C8954gU<YH.d> c8954gU) {
        YH.b b2;
        YH.c c2;
        C2463agZ a2;
        if (C9083ir.c(c8954gU)) {
            YH.d dVar = c8954gU.d;
            d((dVar == null || (b2 = dVar.b()) == null || (c2 = b2.c()) == null || (a2 = c2.a()) == null) ? null : a2.e());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0116 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:231:0x0213 -> B:232:0x0219). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r50, o.InterfaceC8585dra<? super o.C4116bWv.e> r51) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4116bWv.b(java.lang.String, o.dra):java.lang.Object");
    }

    public static /* synthetic */ YQ e(C4116bWv c4116bWv, int i, int i2, String str, List list, String str2, int i3, Object obj) {
        List i4;
        if (obj == null) {
            List list2 = list;
            if ((i3 & 8) != 0) {
                i4 = C8569dql.i();
                list2 = i4;
            }
            List list3 = list2;
            if ((i3 & 16) != 0) {
                str2 = null;
            }
            return c4116bWv.d(i, i2, str, list3, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createNewLolomoQuery");
    }

    protected final YQ d(int i, int i2, String str, List<Integer> list, String str2) {
        int d2;
        C8632dsu.c((Object) list, "");
        String str3 = this.l;
        aOV i3 = i();
        bNS bns = this.g;
        Lazy<XH> lazy = this.i;
        d2 = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d2);
        for (Number number : list) {
            arrayList.add(String.valueOf(number.intValue()));
        }
        C3004aqk e2 = C4130bXi.e(str3, str, i3, bns, lazy, arrayList, str2, this.q);
        boolean z = !C8151dev.f() || C8151dev.d();
        boolean z2 = C8151dev.f() || C8151dev.d();
        boolean e3 = C8171dfO.e();
        boolean b2 = C1888aRz.d.b();
        C2865aoD b3 = this.m.b();
        C4128bXg c4128bXg = C4128bXg.d;
        return new YQ(i, i2, e2, z, z2, e3, null, false, b2, b3, c4128bXg.e(i()), c4128bXg.b(i()), aDB.d(this.m, false, 0.0d, null, 7, null), aDB.e(this.m, 0.0d, null, 3, null), c4128bXg.d(), c4128bXg.j(), c4128bXg.b(), c4128bXg.g(), c4128bXg.c(i()), this.m.i(), c4128bXg.e(), this.m.f(), this.m.j(), this.m.o(), this.m.h(), this.m.k(), this.m.l(), c4128bXg.c(), c4128bXg.a(), c4128bXg.f(), c4128bXg.i(), 64, null);
    }

    public final void e(String str) {
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        String logTag = a.getLogTag();
        aVar.a(logTag + ": " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(List<C4003bSq> list, int i, int i2) {
        C4003bSq c4003bSq = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C4003bSq) next).b().getType() == LoMoType.CONTINUE_WATCHING) {
                    c4003bSq = next;
                    break;
                }
            }
            c4003bSq = c4003bSq;
        }
        if (c4003bSq != null) {
            e(c4003bSq, i, i2);
        }
    }

    public final void e(C4003bSq c4003bSq, int i, int i2) {
        List i3;
        if (c4003bSq == null || c4003bSq.b().getType() != LoMoType.CONTINUE_WATCHING) {
            return;
        }
        LoMo b2 = c4003bSq.b();
        List<C4002bSp> e2 = c4003bSq.e();
        if (C8153dex.H()) {
            if (e2 == null || e2.isEmpty()) {
                return;
            }
            InterfaceC5606cBq interfaceC5606cBq = this.s.get();
            ArrayList arrayList = new ArrayList();
            for (Object obj : e2) {
                if (obj instanceof InterfaceC5223buh) {
                    arrayList.add(obj);
                }
            }
            interfaceC5606cBq.b(arrayList);
            BookmarkStore bookmarkStore = this.h.get();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : e2) {
                if (obj2 instanceof InterfaceC5160btX) {
                    arrayList2.add(obj2);
                }
            }
            bookmarkStore.onPlayablesFetched(arrayList2, this.v.a());
            return;
        }
        CompositeDisposable compositeDisposable = this.f;
        Single<List<InterfaceC5222bug<? extends InterfaceC5223buh>>> d2 = new C6004cQk().d(b2, i, (i2 + i) - 1, false, "GQLLolomoRepo");
        i3 = C8569dql.i();
        Disposable subscribe = d2.onErrorResumeNext(Single.just(i3)).subscribe();
        C8632dsu.a(subscribe, "");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }

    public final Single<C4001bSo> c(final C4001bSo c4001bSo) {
        C8632dsu.c((Object) c4001bSo, "");
        Single just = Single.just(c4001bSo);
        final GraphQLLolomoRepositoryImpl$reAdaptNewLolomo$1 graphQLLolomoRepositoryImpl$reAdaptNewLolomo$1 = new drM<C4001bSo, SingleSource<? extends InterfaceC5155btS>>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$reAdaptNewLolomo$1
            @Override // o.drM
            /* renamed from: e */
            public final SingleSource<? extends InterfaceC5155btS> invoke(C4001bSo c4001bSo2) {
                C8632dsu.c((Object) c4001bSo2, "");
                if (c4001bSo2.b() == null) {
                    InterfaceC5155btS b2 = c4001bSo2.b();
                    return Single.error(new IllegalStateException("Summary is null when try to readapt, " + b2));
                }
                return Single.just(c4001bSo2.b());
            }
        };
        Single flatMap = just.flatMap(new Function() { // from class: o.bXf
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource X;
                X = C4116bWv.X(drM.this, obj);
                return X;
            }
        });
        final drM<InterfaceC5155btS, SingleSource<? extends List<? extends C4003bSq>>> drm = new drM<InterfaceC5155btS, SingleSource<? extends List<? extends C4003bSq>>>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$reAdaptNewLolomo$2
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final SingleSource<? extends List<C4003bSq>> invoke(InterfaceC5155btS interfaceC5155btS) {
                Single e2;
                C8632dsu.c((Object) interfaceC5155btS, "");
                e2 = C4116bWv.this.e(interfaceC5155btS, aQS.a.e().d(), null, Integer.valueOf(C4116bWv.this.a()));
                return e2;
            }
        };
        Single flatMap2 = flatMap.flatMap(new Function() { // from class: o.bXd
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource T;
                T = C4116bWv.T(drM.this, obj);
                return T;
            }
        });
        final drM<List<? extends C4003bSq>, C4001bSo> drm2 = new drM<List<? extends C4003bSq>, C4001bSo>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$reAdaptNewLolomo$3
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final C4001bSo invoke(List<C4003bSq> list) {
                C8632dsu.c((Object) list, "");
                return C4001bSo.e(C4001bSo.this, null, list, false, false, null, 29, null);
            }
        };
        Single<C4001bSo> map = flatMap2.map(new Function() { // from class: o.bXc
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C4001bSo Z;
                Z = C4116bWv.Z(drM.this, obj);
                return Z;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    public static final SingleSource X(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public static final SingleSource T(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public static final C4001bSo Z(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (C4001bSo) drm.invoke(obj);
    }

    public final int c(boolean z) {
        aQS.e e2 = aQS.a.e();
        if (C8632dsu.c((Object) this.l, (Object) "mobileFeeds")) {
            return 20;
        }
        if (e2.b() && this.l == null) {
            return e2.d();
        }
        return C8153dex.e(z);
    }

    public final int a() {
        return C4000bSn.b(this.e, C8632dsu.c((Object) this.l, (Object) "mobileFeeds") ? LoMoType.FEED : LoMoType.STANDARD);
    }

    /* renamed from: o.bWv$e */
    /* loaded from: classes4.dex */
    public static final class e {
        private final String a;
        private final int b;
        private final String c;
        private final String d;
        private final boolean e;

        public final boolean a() {
            return this.e;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.c;
        }

        public final int d() {
            return this.b;
        }

        public final String e() {
            return this.d;
        }

        public e(String str, String str2, int i, String str3, boolean z) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str3, "");
            this.c = str;
            this.a = str2;
            this.b = i;
            this.d = str3;
            this.e = z;
        }
    }

    @SuppressLint({"CheckResult"})
    private final void d(List<C2463agZ.d> list) {
        C2461agX b2;
        Integer f;
        C2461agX b3;
        C2458agU e2;
        C2461agX b4;
        C2458agU e3;
        C2458agU e4;
        if (this.r || list == null) {
            return;
        }
        for (C2463agZ.d dVar : list) {
            String str = null;
            final String e5 = (dVar == null || (e4 = dVar.e()) == null) ? null : e4.e();
            if (e5 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            C2458agU.c c2 = (dVar == null || (e3 = dVar.e()) == null) ? null : e3.c();
            final String e6 = (c2 == null || (b4 = c2.b()) == null) ? null : b4.e();
            Integer d2 = (dVar == null || (e2 = dVar.e()) == null) ? null : e2.d();
            if (c2 != null && (b2 = c2.b()) != null && (f = b2.f()) != null && f.intValue() > 0) {
                if (c2 != null && (b3 = c2.b()) != null) {
                    str = b3.a();
                }
                String str2 = str;
                if (str2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                if (e6 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                SubscribersKt.subscribeBy(c(e5, str2, e6, d2, null, "GraphQL.cached.data.refresh", Integer.valueOf(a())), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$handleCachedResponseListRefresh$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        e(th);
                        return dpR.c;
                    }

                    public final void e(Throwable th) {
                        Map d3;
                        Map k;
                        Throwable th2;
                        C8632dsu.c((Object) th, "");
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        String str3 = "Failed cached data refreshList for listContext: " + e6 + ", lolomoId: " + e5;
                        ErrorType errorType = ErrorType.l;
                        d3 = dqE.d();
                        k = dqE.k(d3);
                        C1596aHd c1596aHd = new C1596aHd(str3, th, errorType, false, k, false, false, 96, null);
                        ErrorType errorType2 = c1596aHd.a;
                        if (errorType2 != null) {
                            c1596aHd.e.put("errorType", errorType2.c());
                            String b5 = c1596aHd.b();
                            if (b5 != null) {
                                c1596aHd.a(errorType2.c() + " " + b5);
                            }
                        }
                        if (c1596aHd.b() != null && c1596aHd.i != null) {
                            th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                        } else if (c1596aHd.b() != null) {
                            th2 = new Throwable(c1596aHd.b());
                        } else {
                            th2 = c1596aHd.i;
                            if (th2 == null) {
                                th2 = new Throwable("Handled exception with no message");
                            } else if (th2 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        }
                        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a2 = dVar2.a();
                        if (a2 != null) {
                            a2.e(c1596aHd, th2);
                        } else {
                            dVar2.e().b(c1596aHd, th2);
                        }
                    }
                }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$handleCachedResponseListRefresh$1$2
                    public final void a() {
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        a();
                        return dpR.c;
                    }
                });
            }
        }
    }
}
