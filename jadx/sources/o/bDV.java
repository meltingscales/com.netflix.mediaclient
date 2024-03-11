package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import o.C8632dsu;
import o.InterfaceC1078Nw;
import o.InterfaceC5194buE;
import o.InterfaceC5195buF;
import o.InterfaceC5227bul;
import o.InterfaceC8366diy;
import o.bDV;
import o.bDW;
import o.dpR;

/* loaded from: classes4.dex */
public class bDV implements InterfaceC3617bEm {
    private static final List<String> b;
    public static final e d = new e(null);
    private final aLP c;

    public bDV(aLP alp) {
        C8632dsu.c((Object) alp, "");
        this.c = alp;
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("EpisodeListSelectorRepositoryImpl");
        }
    }

    static {
        List<String> j;
        j = C8569dql.j("summary", "detail", "bookmark", "timeCodes", "synopsisDP", "offlineAvailable", "advisories");
        b = j;
    }

    @Override // o.InterfaceC3617bEm
    @SuppressLint({"CheckResult"})
    public Observable<bDW> d(ServiceManager serviceManager, final String str, final String str2, final boolean z, final String str3) {
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str3, "");
        Observable<bDW> create = Observable.create(new ObservableOnSubscribe() { // from class: o.bDZ
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                bDV.a(bDV.this, str, str2, z, str3, observableEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final bDV bdv, String str, String str2, boolean z, String str3, final ObservableEmitter observableEmitter) {
        C8632dsu.c((Object) bdv, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) observableEmitter, "");
        SubscribersKt.subscribeBy$default(bdv.c.e(new JQ(str, bdv.a(str2), bdv.a(), z ? TaskMode.FROM_NETWORK : TaskMode.FROM_CACHE_OR_NETWORK, false, null, str3, 48, null)), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorRepositoryImpl$fetchData$1$1
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
                C8632dsu.c((Object) th, "");
                bDV.d.getLogTag();
                ObservableEmitter<bDW> observableEmitter2 = observableEmitter;
                NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ai;
                C8632dsu.a(netflixImmutableStatus, "");
                observableEmitter2.onNext(new bDW.c(netflixImmutableStatus));
                observableEmitter.onComplete();
            }
        }, (drO) null, new drM<Pair<? extends List<? extends InterfaceC5195buF>, ? extends InterfaceC5194buE>, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorRepositoryImpl$fetchData$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Pair<? extends List<? extends InterfaceC5195buF>, ? extends InterfaceC5194buE> pair) {
                e(pair);
                return dpR.c;
            }

            public final void e(Pair<? extends List<? extends InterfaceC5195buF>, ? extends InterfaceC5194buE> pair) {
                C8632dsu.c((Object) pair, "");
                List<? extends InterfaceC5195buF> d2 = pair.d();
                InterfaceC5194buE a = pair.a();
                if (a != null && a.isAvailableToPlay()) {
                    if (d2.isEmpty()) {
                        bDV.d.getLogTag();
                        bDV bdv2 = bdv;
                        ObservableEmitter<bDW> observableEmitter2 = observableEmitter;
                        C8632dsu.a(observableEmitter2, "");
                        bdv2.b(observableEmitter2, a);
                        return;
                    }
                    bDV.d.getLogTag();
                    bDV bdv3 = bdv;
                    ObservableEmitter<bDW> observableEmitter3 = observableEmitter;
                    C8632dsu.a(observableEmitter3, "");
                    bdv3.a(observableEmitter3, a, d2);
                    return;
                }
                bDV.d.getLogTag();
                ObservableEmitter<bDW> observableEmitter4 = observableEmitter;
                NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ai;
                C8632dsu.a(netflixImmutableStatus, "");
                observableEmitter4.onNext(new bDW.c(netflixImmutableStatus));
                observableEmitter.onComplete();
            }
        }, 2, (Object) null);
    }

    @Override // o.InterfaceC3617bEm
    @SuppressLint({"CheckResult"})
    public Observable<bDW> e(final String str) {
        C8632dsu.c((Object) str, "");
        Observable<bDW> create = Observable.create(new ObservableOnSubscribe() { // from class: o.bEc
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                bDV.e(bDV.this, str, observableEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(bDV bdv, String str, final ObservableEmitter observableEmitter) {
        List e2;
        C8632dsu.c((Object) bdv, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) observableEmitter, "");
        aLP alp = bdv.c;
        e2 = C8566dqi.e(IE.b(b));
        SubscribersKt.subscribeBy$default(alp.e(new C0963Ji(str, e2)), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorRepositoryImpl$fetchEpisodeDetails$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                C8632dsu.c((Object) th, "");
                bDV.d.getLogTag();
                ObservableEmitter<bDW> observableEmitter2 = observableEmitter;
                NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ai;
                C8632dsu.a(netflixImmutableStatus, "");
                observableEmitter2.onNext(new bDW.b(null, netflixImmutableStatus));
                observableEmitter.onComplete();
            }
        }, (drO) null, new drM<Pair<? extends InterfaceC5227bul, ? extends Status>, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorRepositoryImpl$fetchEpisodeDetails$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Pair<? extends InterfaceC5227bul, ? extends Status> pair) {
                b(pair);
                return dpR.c;
            }

            public final void b(Pair<? extends InterfaceC5227bul, ? extends Status> pair) {
                C8632dsu.c((Object) pair, "");
                bDV.d.getLogTag();
                observableEmitter.onNext(new bDW.b(pair.d(), pair.a()));
                observableEmitter.onComplete();
            }
        }, 2, (Object) null);
    }

    @Override // o.InterfaceC3617bEm
    @SuppressLint({"CheckResult"})
    public Observable<bDW> d(final String str, final long j, final int i, final int i2, String str2, InterfaceC5195buF interfaceC5195buF) {
        C8632dsu.c((Object) str, "");
        Observable<bDW> create = Observable.create(new ObservableOnSubscribe() { // from class: o.bEa
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                bDV.d(bDV.this, str, i, i2, j, observableEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(bDV bdv, String str, final int i, final int i2, final long j, final ObservableEmitter observableEmitter) {
        List e2;
        C8632dsu.c((Object) bdv, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) observableEmitter, "");
        aLP alp = bdv.c;
        TaskMode taskMode = TaskMode.FROM_CACHE_OR_NETWORK;
        e2 = C8566dqi.e(IE.b(b));
        SubscribersKt.subscribeBy$default(alp.e(new C0965Jk(str, taskMode, i, i2, e2)), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorRepositoryImpl$fetchEpisodesList$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                C8632dsu.c((Object) th, "");
                bDV.d.getLogTag();
                ObservableEmitter<bDW> observableEmitter2 = observableEmitter;
                ArrayList arrayList = new ArrayList();
                NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ai;
                C8632dsu.a(netflixImmutableStatus, "");
                observableEmitter2.onNext(new bDW.d(arrayList, netflixImmutableStatus, j, i, i2));
                observableEmitter.onComplete();
            }
        }, (drO) null, new drM<Pair<? extends List<InterfaceC5227bul>, ? extends Status>, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorRepositoryImpl$fetchEpisodesList$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Pair<? extends List<InterfaceC5227bul>, ? extends Status> pair) {
                d(pair);
                return dpR.c;
            }

            public final void d(Pair<? extends List<InterfaceC5227bul>, ? extends Status> pair) {
                C8632dsu.c((Object) pair, "");
                bDV.d.getLogTag();
                observableEmitter.onNext(new bDW.d(pair.d(), pair.a(), j, i, i2));
                observableEmitter.onComplete();
            }
        }, 2, (Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
        if (r9 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<o.InterfaceC1242Ud> a(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 6
            o.Ud[] r0 = new o.InterfaceC1242Ud[r0]
            java.lang.String r1 = "summary"
            java.lang.String r2 = "detail"
            java.lang.String[] r3 = new java.lang.String[]{r1, r2}
            java.util.List r3 = o.C8570dqm.b(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            o.Ud r3 = o.IE.b(r3)
            java.lang.String r4 = ""
            o.C8632dsu.a(r3, r4)
            r5 = 0
            r0[r5] = r3
            r3 = 3
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r7 = "episodes"
            r6[r5] = r7
            java.lang.String r8 = "current"
            if (r12 == 0) goto L30
            boolean r9 = o.C8684dus.a(r12)
            if (r9 == 0) goto L31
        L30:
            r12 = r8
        L31:
            r9 = 1
            r6[r9] = r12
            java.util.List<java.lang.String> r12 = o.bDV.b
            r10 = 2
            r6[r10] = r12
            o.Ud r6 = o.IE.b(r6)
            o.C8632dsu.a(r6, r4)
            r0[r9] = r6
            java.lang.String r6 = "seasons"
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r1}
            o.Ud r1 = o.IE.b(r1)
            o.C8632dsu.a(r1, r4)
            r0[r10] = r1
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r8, r2}
            o.Ud r1 = o.IE.b(r1)
            o.C8632dsu.a(r1, r4)
            r0[r3] = r1
            java.lang.String r1 = "latest"
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r1, r2}
            o.Ud r1 = o.IE.b(r1)
            o.C8632dsu.a(r1, r4)
            r2 = 4
            r0[r2] = r1
            r1 = 39
            java.util.Map r1 = o.IE.a(r5, r1)
            java.lang.Object[] r12 = new java.lang.Object[]{r6, r8, r7, r1, r12}
            o.Ud r12 = o.IE.b(r12)
            o.C8632dsu.a(r12, r4)
            r1 = 5
            r0[r1] = r12
            java.util.List r12 = o.C8570dqm.b(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bDV.a(java.lang.String):java.util.List");
    }

    private final InterfaceC1242Ud a() {
        InterfaceC1242Ud b2 = IE.b("seasons", IE.a(39), "detail");
        C8632dsu.a(b2, "");
        return b2;
    }

    @SuppressLint({"CheckResult"})
    public void b(final ObservableEmitter<bDW> observableEmitter, final InterfaceC5194buE interfaceC5194buE) {
        C8632dsu.c((Object) observableEmitter, "");
        C8632dsu.c((Object) interfaceC5194buE, "");
        aLP alp = this.c;
        String id = interfaceC5194buE.getId();
        C8632dsu.a(id, "");
        SubscribersKt.subscribeBy$default(alp.e(new JO(id, TaskMode.FROM_NETWORK)), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorRepositoryImpl$retryFetchSeasonsListFromNetwork$1
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
                C8632dsu.c((Object) th, "");
                bDV.d.getLogTag();
                ObservableEmitter<bDW> observableEmitter2 = observableEmitter;
                NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ai;
                C8632dsu.a(netflixImmutableStatus, "");
                observableEmitter2.onNext(new bDW.c(netflixImmutableStatus));
                observableEmitter.onComplete();
            }
        }, (drO) null, new drM<List<? extends InterfaceC5195buF>, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorRepositoryImpl$retryFetchSeasonsListFromNetwork$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(List<? extends InterfaceC5195buF> list) {
                b(list);
                return dpR.c;
            }

            public final void b(List<? extends InterfaceC5195buF> list) {
                C8632dsu.c((Object) list, "");
                if (list.isEmpty()) {
                    bDV.d.getLogTag();
                    ObservableEmitter<bDW> observableEmitter2 = observableEmitter;
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ai;
                    C8632dsu.a(netflixImmutableStatus, "");
                    observableEmitter2.onNext(new bDW.c(netflixImmutableStatus));
                    observableEmitter.onComplete();
                    return;
                }
                bDV.d.getLogTag();
                this.a(observableEmitter, interfaceC5194buE, list);
            }
        }, 2, (Object) null);
    }

    public final void a(ObservableEmitter<bDW> observableEmitter, InterfaceC5194buE interfaceC5194buE, List<? extends InterfaceC5195buF> list) {
        C8632dsu.c((Object) observableEmitter, "");
        C8632dsu.c((Object) interfaceC5194buE, "");
        C8632dsu.c((Object) list, "");
        observableEmitter.onNext(new bDW.e(interfaceC5194buE.bV_(), list));
        if (interfaceC5194buE.au()) {
            e(observableEmitter, interfaceC5194buE);
        } else {
            observableEmitter.onComplete();
        }
    }

    @SuppressLint({"CheckResult"})
    private final void e(final ObservableEmitter<bDW> observableEmitter, final InterfaceC5194buE interfaceC5194buE) {
        aLP alp = this.c;
        String id = interfaceC5194buE.getId();
        C8632dsu.a(id, "");
        SubscribersKt.subscribeBy$default(alp.e(new C0969Jo(id, d(), TaskMode.FROM_NETWORK, false, null, "EpisodesListSelector:VolatileNodes", 24, null)), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorRepositoryImpl$fetchVolatileNodesTask$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                C8632dsu.c((Object) th, "");
                bDV.d.getLogTag();
                observableEmitter.onComplete();
            }
        }, (drO) null, new drM<InterfaceC8366diy, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorRepositoryImpl$fetchVolatileNodesTask$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(InterfaceC8366diy interfaceC8366diy) {
                e(interfaceC8366diy);
                return dpR.c;
            }

            public final void e(InterfaceC8366diy interfaceC8366diy) {
                C8632dsu.c((Object) interfaceC8366diy, "");
                if (interfaceC8366diy.V() <= 0 || interfaceC8366diy.V() == InterfaceC5194buE.this.V()) {
                    observableEmitter.onComplete();
                } else {
                    bDV.d.getLogTag();
                    this.a(observableEmitter, interfaceC8366diy);
                }
                InterfaceC5195buF A = interfaceC8366diy.A();
                if (A != null) {
                    InterfaceC5194buE interfaceC5194buE2 = InterfaceC5194buE.this;
                    bDV bdv = this;
                    InterfaceC5195buF A2 = interfaceC5194buE2.A();
                    if (A2 == null || interfaceC8366diy.D_() != A2.D_()) {
                        int D_ = interfaceC8366diy.D_();
                        int i = interfaceC8366diy.D_() > 100 ? D_ - 11 : 0;
                        String id2 = A.getId();
                        C8632dsu.a(id2, "");
                        bdv.e(id2, i, D_ - 1);
                    }
                }
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final void a(final ObservableEmitter<bDW> observableEmitter, InterfaceC5194buE interfaceC5194buE) {
        aLP alp = this.c;
        String id = interfaceC5194buE.getId();
        C8632dsu.a(id, "");
        SubscribersKt.subscribeBy$default(alp.e(new JO(id, TaskMode.FROM_NETWORK)), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorRepositoryImpl$fetchSeasonsFromNetworkUponVolatileNodeRefresh$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                C8632dsu.c((Object) th, "");
                bDV.d.getLogTag();
                observableEmitter.onComplete();
            }
        }, (drO) null, new drM<List<? extends InterfaceC5195buF>, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorRepositoryImpl$fetchSeasonsFromNetworkUponVolatileNodeRefresh$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(List<? extends InterfaceC5195buF> list) {
                b(list);
                return dpR.c;
            }

            public final void b(List<? extends InterfaceC5195buF> list) {
                C8632dsu.c((Object) list, "");
                if (!list.isEmpty()) {
                    bDV.d.getLogTag();
                    ObservableEmitter<bDW> observableEmitter2 = observableEmitter;
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    observableEmitter2.onNext(new bDW.a(list, netflixImmutableStatus));
                }
                observableEmitter.onComplete();
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final void e(String str, int i, int i2) {
        List e2;
        aLP alp = this.c;
        TaskMode taskMode = TaskMode.FROM_NETWORK;
        e2 = C8566dqi.e(IE.b(b));
        alp.e(new C0965Jk(str, taskMode, i, i2, e2)).subscribe();
    }

    private final List<InterfaceC1242Ud> d() {
        List j;
        List<InterfaceC1242Ud> j2;
        j = C8569dql.j("summary", "detail");
        InterfaceC1242Ud b2 = IE.b(j);
        C8632dsu.a(b2, "");
        List<String> list = b;
        InterfaceC1242Ud b3 = IE.b("episodes", "current", list);
        C8632dsu.a(b3, "");
        InterfaceC1242Ud b4 = IE.b("seasons", "summary");
        C8632dsu.a(b4, "");
        InterfaceC1242Ud b5 = IE.b("seasons", "current", "detail");
        C8632dsu.a(b5, "");
        InterfaceC1242Ud b6 = IE.b("seasons", "latest", "detail");
        C8632dsu.a(b6, "");
        InterfaceC1242Ud b7 = IE.b("seasons", "latest", "episodes", IE.a(0, 99), list);
        C8632dsu.a(b7, "");
        j2 = C8569dql.j(b2, b3, b4, b5, b6, b7);
        return j2;
    }
}
