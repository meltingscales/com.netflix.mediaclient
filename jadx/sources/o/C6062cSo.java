package o;

import android.annotation.SuppressLint;
import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.ui.search.SearchUtils;
import com.netflix.model.leafs.SearchSectionSummary;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.jvm.internal.Ref;
import o.AbstractC6078cTd;
import o.C8632dsu;
import o.InterfaceC1078Nw;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5272bvd;
import o.InterfaceC5280bvl;
import o.dpR;

/* renamed from: o.cSo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6062cSo implements InterfaceC6086cTi {
    public static final a c = new a(null);
    private final aLP e;

    @Override // o.InterfaceC6086cTi
    public Object c(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return a(this, interfaceC8585dra);
    }

    public C6062cSo(aLP alp) {
        C8632dsu.c((Object) alp, "");
        this.e = alp;
    }

    /* renamed from: o.cSo$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        public final int a(boolean z) {
            return z ? 41 : 50;
        }

        private a() {
            super("PreQuerySearchRepository");
        }
    }

    @Override // o.InterfaceC6086cTi
    public Observable<AbstractC6078cTd> a(InterfaceC5280bvl interfaceC5280bvl, final List<? extends SearchSectionSummary> list) {
        C8632dsu.c((Object) list, "");
        final Ref.IntRef intRef = new Ref.IntRef();
        Observable<AbstractC6078cTd> create = Observable.create(new ObservableOnSubscribe() { // from class: o.cSt
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C6062cSo.e(list, this, intRef, observableEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final List list, C6062cSo c6062cSo, final Ref.IntRef intRef, final ObservableEmitter observableEmitter) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c6062cSo, "");
        C8632dsu.c((Object) intRef, "");
        C8632dsu.c((Object) observableEmitter, "");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            SubscribersKt.subscribeBy$default(c6062cSo.e.e(new JK(TaskMode.FROM_CACHE_OR_NETWORK, i)), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.search.v2.FalcorSearchRepositoryImpl$fetchPreQueryVideos$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    observableEmitter.onNext(AbstractC6078cTd.C6079a.c);
                    if (intRef.b == list.size() - 1) {
                        observableEmitter.onComplete();
                    }
                    intRef.b++;
                }
            }, (drO) null, new drM<Pair<? extends InterfaceC5272bvd, ? extends Status>, dpR>() { // from class: com.netflix.mediaclient.ui.search.v2.FalcorSearchRepositoryImpl$fetchPreQueryVideos$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Pair<? extends InterfaceC5272bvd, ? extends Status> pair) {
                    e(pair);
                    return dpR.c;
                }

                public final void e(Pair<? extends InterfaceC5272bvd, ? extends Status> pair) {
                    C8632dsu.c((Object) pair, "");
                    InterfaceC5272bvd d = pair.d();
                    Status a2 = pair.a();
                    if (a2 == null || a2.i()) {
                        observableEmitter.onNext(AbstractC6078cTd.C6079a.c);
                    } else if (d != null) {
                        observableEmitter.onNext(new AbstractC6078cTd.B(d, a2));
                    }
                    if (intRef.b == list.size() - 1) {
                        observableEmitter.onComplete();
                    }
                    intRef.b++;
                }
            }, 2, (Object) null);
        }
    }

    @Override // o.InterfaceC6086cTi
    public Completable e() {
        Completable fromObservable = Completable.fromObservable(d());
        C8632dsu.a(fromObservable, "");
        return fromObservable;
    }

    private final TaskMode c() {
        if (C8153dex.i()) {
            return TaskMode.FROM_NETWORK;
        }
        return TaskMode.FROM_CACHE_OR_NETWORK;
    }

    @Override // o.InterfaceC6086cTi
    public Observable<AbstractC6078cTd> d() {
        Observable<AbstractC6078cTd> create = Observable.create(new ObservableOnSubscribe() { // from class: o.cSl
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C6062cSo.c(C6062cSo.this, observableEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C6062cSo c6062cSo, final ObservableEmitter observableEmitter) {
        C8632dsu.c((Object) c6062cSo, "");
        C8632dsu.c((Object) observableEmitter, "");
        SubscribersKt.subscribeBy$default(c6062cSo.e.e(new C1000Kt(c6062cSo.c(), 3, 51)), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.search.v2.FalcorSearchRepositoryImpl$fetchPrequeryList$1$1
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
                observableEmitter.onNext(AbstractC6078cTd.C6079a.c);
                observableEmitter.onComplete();
            }
        }, (drO) null, new drM<Pair<? extends InterfaceC5280bvl, ? extends Status>, dpR>() { // from class: com.netflix.mediaclient.ui.search.v2.FalcorSearchRepositoryImpl$fetchPrequeryList$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Pair<? extends InterfaceC5280bvl, ? extends Status> pair) {
                b(pair);
                return dpR.c;
            }

            public final void b(Pair<? extends InterfaceC5280bvl, ? extends Status> pair) {
                C8632dsu.c((Object) pair, "");
                InterfaceC5280bvl d = pair.d();
                Status a2 = pair.a();
                if (d == null || a2 == null || a2.i()) {
                    observableEmitter.onNext(AbstractC6078cTd.C6079a.c);
                    observableEmitter.onComplete();
                    return;
                }
                List<InterfaceC5272bvd> searchSections = d.getSearchSections();
                ArrayList arrayList = new ArrayList();
                for (InterfaceC5272bvd interfaceC5272bvd : searchSections) {
                    SearchSectionSummary searchSectionSummary = interfaceC5272bvd.getSearchSectionSummary();
                    if (searchSectionSummary != null) {
                        arrayList.add(searchSectionSummary);
                    }
                }
                observableEmitter.onNext(new AbstractC6078cTd.A(null, arrayList, a2, 1, null));
                observableEmitter.onComplete();
            }
        }, 2, (Object) null);
    }

    @Override // o.InterfaceC6086cTi
    @SuppressLint({"CheckResult"})
    public Observable<AbstractC6078cTd> b(final String str, final Context context, final C6087cTj c6087cTj, final boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c6087cTj, "");
        Observable<AbstractC6078cTd> create = Observable.create(new ObservableOnSubscribe() { // from class: o.cSr
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C6062cSo.e(C6062cSo.this, str, c6087cTj, context, z, observableEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C6062cSo c6062cSo, String str, C6087cTj c6087cTj, Context context, boolean z, final ObservableEmitter observableEmitter) {
        C8632dsu.c((Object) c6062cSo, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c6087cTj, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) observableEmitter, "");
        aLP alp = c6062cSo.e;
        long d = c6087cTj.d();
        int a2 = c6087cTj.a();
        int b = c6087cTj.b();
        int e = c6087cTj.e();
        int i = c6087cTj.i();
        String b2 = SearchUtils.b(context);
        C8632dsu.a(b2, "");
        SubscribersKt.subscribeBy$default(alp.e(new JL(str, d, a2, b, e, i, b2, z)), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.search.v2.FalcorSearchRepositoryImpl$fetchSearchResults$1$1
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
                observableEmitter.onNext(AbstractC6078cTd.C6079a.c);
            }
        }, (drO) null, new drM<Pair<? extends InterfaceC5280bvl, ? extends Status>, dpR>() { // from class: com.netflix.mediaclient.ui.search.v2.FalcorSearchRepositoryImpl$fetchSearchResults$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Pair<? extends InterfaceC5280bvl, ? extends Status> pair) {
                a(pair);
                return dpR.c;
            }

            public final void a(Pair<? extends InterfaceC5280bvl, ? extends Status> pair) {
                C8632dsu.c((Object) pair, "");
                if (C8632dsu.c(pair.a(), InterfaceC1078Nw.aJ)) {
                    observableEmitter.onNext(new AbstractC6078cTd.C(pair.d(), pair.a()));
                } else {
                    observableEmitter.onNext(new AbstractC6078cTd.h(pair.a()));
                }
            }
        }, 2, (Object) null);
    }

    @Override // o.InterfaceC6086cTi
    public Observable<AbstractC6078cTd> d(String str, Context context, C6087cTj c6087cTj) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c6087cTj, "");
        throw new NotImplementedError("An operation is not implemented: only implemented in graphql");
    }

    @Override // o.InterfaceC6086cTi
    public Observable<AbstractC6078cTd> b(final String str, final String str2, final long j, TaskMode taskMode, final Context context) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) taskMode, "");
        C8632dsu.c((Object) context, "");
        Observable<AbstractC6078cTd> create = Observable.create(new ObservableOnSubscribe() { // from class: o.cSm
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C6062cSo.e(C6062cSo.this, str, str2, j, context, observableEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C6062cSo c6062cSo, String str, String str2, long j, Context context, final ObservableEmitter observableEmitter) {
        C8632dsu.c((Object) c6062cSo, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) observableEmitter, "");
        aLP alp = c6062cSo.e;
        String b = SearchUtils.b(context);
        C8632dsu.a(b, "");
        SubscribersKt.subscribeBy$default(alp.e(new JL(str, str2, j, 0, 1, 0, 50, b)), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.search.v2.FalcorSearchRepositoryImpl$fetchSearchEntity$1$1
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
                observableEmitter.onNext(AbstractC6078cTd.C6079a.c);
            }
        }, (drO) null, new drM<Pair<? extends InterfaceC5280bvl, ? extends Status>, dpR>() { // from class: com.netflix.mediaclient.ui.search.v2.FalcorSearchRepositoryImpl$fetchSearchEntity$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Pair<? extends InterfaceC5280bvl, ? extends Status> pair) {
                e(pair);
                return dpR.c;
            }

            public final void e(Pair<? extends InterfaceC5280bvl, ? extends Status> pair) {
                C8632dsu.c((Object) pair, "");
                if (C8632dsu.c(pair.a(), InterfaceC1078Nw.aJ)) {
                    observableEmitter.onNext(new AbstractC6078cTd.C(pair.d(), pair.a()));
                } else {
                    observableEmitter.onNext(AbstractC6078cTd.C6079a.c);
                }
            }
        }, 2, (Object) null);
    }

    static /* synthetic */ Object a(C6062cSo c6062cSo, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Throwable th;
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        C1596aHd c1596aHd = new C1596aHd("FalcorSearchRepositoryImpl clearSearchResults shouldn't be called in Falcor", null, null, false, null, false, false, 126, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b = c1596aHd.b();
            if (b != null) {
                String c2 = errorType.c();
                c1596aHd.a(c2 + " " + b);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a2 = dVar.a();
        if (a2 != null) {
            a2.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
        return dpR.c;
    }

    @Override // o.InterfaceC6086cTi
    public Observable<AbstractC6078cTd> d(Context context, C6087cTj c6087cTj) {
        Throwable th;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c6087cTj, "");
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        C1596aHd c1596aHd = new C1596aHd("FalcorSearchRepositoryImpl fetchMoreEntitiesInSection shouldn't be called in Falcor", null, null, false, null, false, false, 126, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b = c1596aHd.b();
            if (b != null) {
                String c2 = errorType.c();
                c1596aHd.a(c2 + " " + b);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a2 = dVar.a();
        if (a2 != null) {
            a2.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
        Observable<AbstractC6078cTd> create = Observable.create(new ObservableOnSubscribe() { // from class: o.cSs
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C6062cSo.b(observableEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ObservableEmitter observableEmitter) {
        C8632dsu.c((Object) observableEmitter, "");
        AbstractC6078cTd.l lVar = AbstractC6078cTd.l.d;
    }
}
