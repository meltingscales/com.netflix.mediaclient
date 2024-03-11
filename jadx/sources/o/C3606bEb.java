package o;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C8632dsu;
import o.InterfaceC1078Nw;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5227bul;
import o.bDW;
import o.dpR;

/* renamed from: o.bEb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3606bEb implements InterfaceC3617bEm {
    public static final d c = new d(null);
    private final aLP b;

    public C3606bEb(aLP alp) {
        C8632dsu.c((Object) alp, "");
        this.b = alp;
    }

    /* renamed from: o.bEb$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("EpisodeListSelectorRepository");
        }
    }

    @Override // o.InterfaceC3617bEm
    public Observable<bDW> d(final ServiceManager serviceManager, final String str, final String str2, final boolean z, final String str3) {
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str3, "");
        Observable<bDW> create = Observable.create(new ObservableOnSubscribe() { // from class: o.bEf
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C3606bEb.d(ServiceManager.this, str, str2, z, this, str3, observableEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ServiceManager serviceManager, String str, String str2, boolean z, C3606bEb c3606bEb, String str3, ObservableEmitter observableEmitter) {
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c3606bEb, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) observableEmitter, "");
        serviceManager.j().d(str, str2, true, z ? TaskMode.FROM_NETWORK : TaskMode.FROM_CACHE_OR_NETWORK, new e(c3606bEb, observableEmitter, serviceManager), str3, Boolean.FALSE);
        serviceManager.j().b(new JZ(VideoType.SHOW, str), (InterfaceC5094bsK) null);
    }

    @Override // o.InterfaceC3617bEm
    @SuppressLint({"CheckResult"})
    public Observable<bDW> d(final String str, final long j, final int i, final int i2, String str2, InterfaceC5195buF interfaceC5195buF) {
        C8632dsu.c((Object) str, "");
        Observable<bDW> create = Observable.create(new ObservableOnSubscribe() { // from class: o.bEi
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C3606bEb.b(C3606bEb.this, str, i, i2, j, observableEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3606bEb c3606bEb, String str, final int i, final int i2, final long j, final ObservableEmitter observableEmitter) {
        C8632dsu.c((Object) c3606bEb, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) observableEmitter, "");
        SubscribersKt.subscribeBy$default(c3606bEb.b.e(new C0965Jk(str, TaskMode.FROM_CACHE_OR_NETWORK, i, i2, null, 16, null)), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorRepositoryOldImpl$fetchEpisodesList$1$1
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
                ObservableEmitter<bDW> observableEmitter2 = observableEmitter;
                ArrayList arrayList = new ArrayList();
                NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ai;
                C8632dsu.a(netflixImmutableStatus, "");
                observableEmitter2.onNext(new bDW.d(arrayList, netflixImmutableStatus, j, i, i2));
                observableEmitter.onComplete();
            }
        }, (drO) null, new drM<Pair<? extends List<InterfaceC5227bul>, ? extends Status>, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorRepositoryOldImpl$fetchEpisodesList$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Pair<? extends List<InterfaceC5227bul>, ? extends Status> pair) {
                c(pair);
                return dpR.c;
            }

            public final void c(Pair<? extends List<InterfaceC5227bul>, ? extends Status> pair) {
                C8632dsu.c((Object) pair, "");
                observableEmitter.onNext(new bDW.d(pair.d(), pair.a(), j, i, i2));
                observableEmitter.onComplete();
            }
        }, 2, (Object) null);
    }

    @Override // o.InterfaceC3617bEm
    @SuppressLint({"CheckResult"})
    public Observable<bDW> e(final String str) {
        C8632dsu.c((Object) str, "");
        Observable<bDW> create = Observable.create(new ObservableOnSubscribe() { // from class: o.bEd
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C3606bEb.e(C3606bEb.this, str, observableEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C3606bEb c3606bEb, String str, final ObservableEmitter observableEmitter) {
        C8632dsu.c((Object) c3606bEb, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) observableEmitter, "");
        SubscribersKt.subscribeBy$default(c3606bEb.b.e(new C0963Ji(str, null, 2, null)), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorRepositoryOldImpl$fetchEpisodeDetails$1$1
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
                ObservableEmitter<bDW> observableEmitter2 = observableEmitter;
                NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ai;
                C8632dsu.a(netflixImmutableStatus, "");
                observableEmitter2.onNext(new bDW.b(null, netflixImmutableStatus));
                observableEmitter.onComplete();
            }
        }, (drO) null, new drM<Pair<? extends InterfaceC5227bul, ? extends Status>, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorRepositoryOldImpl$fetchEpisodeDetails$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Pair<? extends InterfaceC5227bul, ? extends Status> pair) {
                e(pair);
                return dpR.c;
            }

            public final void e(Pair<? extends InterfaceC5227bul, ? extends Status> pair) {
                C8632dsu.c((Object) pair, "");
                observableEmitter.onNext(new bDW.b(pair.d(), pair.a()));
                observableEmitter.onComplete();
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bEb$e */
    /* loaded from: classes4.dex */
    public final class e extends C5087bsD {
        final /* synthetic */ C3606bEb a;
        private final ObservableEmitter<bDW> b;
        private final ServiceManager d;

        public final ObservableEmitter<bDW> c() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C3606bEb c3606bEb, ObservableEmitter<bDW> observableEmitter, ServiceManager serviceManager) {
            super(C3606bEb.c.getLogTag());
            C8632dsu.c((Object) observableEmitter, "");
            C8632dsu.c((Object) serviceManager, "");
            this.a = c3606bEb;
            this.b = observableEmitter;
            this.d = serviceManager;
        }

        @Override // o.C5087bsD, o.InterfaceC5094bsK
        public void a(InterfaceC5194buE interfaceC5194buE, List<? extends InterfaceC5195buF> list, Status status) {
            C8632dsu.c((Object) status, "");
            super.a(interfaceC5194buE, (List<InterfaceC5195buF>) list, status);
            if (status.i()) {
                this.b.onNext(new bDW.c(status));
                this.b.onComplete();
            } else if (interfaceC5194buE == null || !interfaceC5194buE.isAvailableToPlay()) {
                ObservableEmitter<bDW> observableEmitter = this.b;
                NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ai;
                C8632dsu.a(netflixImmutableStatus, "");
                observableEmitter.onNext(new bDW.c(netflixImmutableStatus));
                this.b.onComplete();
            } else if (list == null || list.isEmpty()) {
                this.d.j().e(interfaceC5194buE.getId(), TaskMode.FROM_NETWORK, new a(this, interfaceC5194buE, status));
            } else {
                d(interfaceC5194buE, list, status);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(InterfaceC5194buE interfaceC5194buE, List<? extends InterfaceC5195buF> list, Status status) {
            this.b.onNext(new bDW.e(interfaceC5194buE.bV_(), list));
            if (interfaceC5194buE.au() && this.d.c()) {
                InterfaceC5125bsp j = this.d.j();
                JY jy = new JY(interfaceC5194buE.getId(), false);
                ObservableEmitter<bDW> observableEmitter = this.b;
                ServiceManager serviceManager = this.d;
                int userThumbRating = interfaceC5194buE.getUserThumbRating();
                int matchPercentage = interfaceC5194buE.getMatchPercentage();
                boolean ap = interfaceC5194buE.ap();
                String Y = interfaceC5194buE.Y();
                int V = interfaceC5194buE.V();
                InterfaceC5195buF A = interfaceC5194buE.A();
                j.b(jy, new a(observableEmitter, serviceManager, userThumbRating, matchPercentage, ap, Y, V, A != null ? Integer.valueOf(A.D_()) : null));
                return;
            }
            this.b.onComplete();
        }

        /* renamed from: o.bEb$e$a */
        /* loaded from: classes4.dex */
        final class a extends AbstractC5164btb {
            final /* synthetic */ e c;
            private final Status d;
            private final InterfaceC5194buE e;

            public a(e eVar, InterfaceC5194buE interfaceC5194buE, Status status) {
                C8632dsu.c((Object) interfaceC5194buE, "");
                C8632dsu.c((Object) status, "");
                this.c = eVar;
                this.e = interfaceC5194buE;
                this.d = status;
            }

            @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
            public void k(List<? extends InterfaceC5195buF> list, Status status) {
                Map d;
                Map k;
                Throwable th;
                Map d2;
                Map k2;
                Throwable th2;
                C8632dsu.c((Object) status, "");
                super.k(list, status);
                if (status.i()) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k2 = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd("SPY-16063: Error when retrying to fetch seasons list", null, null, true, k2, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            String c = errorType.c();
                            c1596aHd.a(c + " " + b);
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
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th2);
                    } else {
                        dVar.e().b(c1596aHd, th2);
                    }
                    this.c.c().onNext(new bDW.c(status));
                    this.c.c().onComplete();
                } else if (list != null && !list.isEmpty()) {
                    this.c.d(this.e, list, this.d);
                } else {
                    InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd2 = new C1596aHd("SPY-16063: Seasons list is still empty after retry", null, null, true, k, false, false, 96, null);
                    ErrorType errorType2 = c1596aHd2.a;
                    if (errorType2 != null) {
                        c1596aHd2.e.put("errorType", errorType2.c());
                        String b2 = c1596aHd2.b();
                        if (b2 != null) {
                            String c2 = errorType2.c();
                            c1596aHd2.a(c2 + " " + b2);
                        }
                    }
                    if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                        th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                    } else if (c1596aHd2.b() != null) {
                        th = new Throwable(c1596aHd2.b());
                    } else {
                        th = c1596aHd2.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a2 = dVar2.a();
                    if (a2 != null) {
                        a2.e(c1596aHd2, th);
                    } else {
                        dVar2.e().b(c1596aHd2, th);
                    }
                    ObservableEmitter<bDW> c3 = this.c.c();
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ai;
                    C8632dsu.a(netflixImmutableStatus, "");
                    c3.onNext(new bDW.c(netflixImmutableStatus));
                    this.c.c().onComplete();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bEb$a */
    /* loaded from: classes4.dex */
    public static final class a extends C5087bsD {
        private final Integer a;
        private final ObservableEmitter<bDW> b;
        private final boolean d;
        private final int e;
        private final String f;
        private final int g;
        private final int h;
        private final ServiceManager j;

        public final ObservableEmitter<bDW> b() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ObservableEmitter<bDW> observableEmitter, ServiceManager serviceManager, int i, int i2, boolean z, String str, int i3, Integer num) {
            super(C3606bEb.c.getLogTag());
            C8632dsu.c((Object) observableEmitter, "");
            C8632dsu.c((Object) serviceManager, "");
            this.b = observableEmitter;
            this.j = serviceManager;
            this.g = i;
            this.e = i2;
            this.d = z;
            this.f = str;
            this.h = i3;
            this.a = num;
        }

        @Override // o.C5087bsD, o.InterfaceC5094bsK
        public void e(InterfaceC5194buE interfaceC5194buE, Status status) {
            C8632dsu.c((Object) status, "");
            super.e(interfaceC5194buE, status);
            if (status.i()) {
                d dVar = C3606bEb.c;
                this.b.onComplete();
            } else if (interfaceC5194buE != null) {
                if (this.e != interfaceC5194buE.getMatchPercentage() || this.g != interfaceC5194buE.getUserThumbRating() || this.d != interfaceC5194buE.ap() || !TextUtils.equals(this.f, interfaceC5194buE.Y())) {
                    ObservableEmitter<bDW> observableEmitter = this.b;
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    observableEmitter.onNext(new bDW.j(interfaceC5194buE, netflixImmutableStatus));
                }
                if (interfaceC5194buE.V() <= 0 || interfaceC5194buE.V() == this.h) {
                    this.b.onComplete();
                } else {
                    C3606bEb.c.getLogTag();
                    this.j.j().e(interfaceC5194buE.getId(), TaskMode.FROM_NETWORK, new d());
                }
                if (interfaceC5194buE.A() != null) {
                    int D_ = interfaceC5194buE.D_();
                    Integer num = this.a;
                    if (num != null && D_ == num.intValue()) {
                        return;
                    }
                    int D_2 = interfaceC5194buE.D_();
                    int i = interfaceC5194buE.D_() > 100 ? D_2 - 11 : 0;
                    InterfaceC5125bsp j = this.j.j();
                    InterfaceC5195buF A = interfaceC5194buE.A();
                    j.b(A != null ? A.getId() : null, TaskMode.FROM_NETWORK, i, D_2 - 1, null);
                }
            } else {
                C3606bEb.c.getLogTag();
                this.b.onComplete();
            }
        }

        /* renamed from: o.bEb$a$d */
        /* loaded from: classes4.dex */
        final class d extends C5087bsD {
            public d() {
                super(C3606bEb.c.getLogTag());
            }

            @Override // o.C5087bsD, o.InterfaceC5094bsK
            public void k(List<? extends InterfaceC5195buF> list, Status status) {
                C8632dsu.c((Object) status, "");
                super.k(list, status);
                if (status.i()) {
                    d dVar = C3606bEb.c;
                    a.this.b().onComplete();
                    return;
                }
                if (list != null && !list.isEmpty()) {
                    a.this.b().onNext(new bDW.a(list, status));
                }
                a.this.b().onComplete();
            }
        }
    }
}
