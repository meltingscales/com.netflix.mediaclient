package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.mdx2.NetflixMdxController;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.ReplaySubject;
import java.util.Map;
import o.AbstractC6618cgh;
import o.AbstractC9766wb;
import o.C1332Xp;
import o.C1596aHd;
import o.C5087bsD;
import o.C6621cgk;
import o.C8153dex;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5125bsp;
import o.InterfaceC5194buE;
import o.InterfaceC5227bul;
import o.InterfaceC5238buw;
import o.InterfaceC6616cgf;
import o.dpR;
import o.dqE;

/* renamed from: o.cgk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6621cgk {
    private final Observable<AbstractC6618cgh> a;
    private ReplaySubject<InterfaceC5125bsp> c;
    private final ReplaySubject<AbstractC6618cgh> d;
    private final NetflixMdxController h;
    public static final c e = new c(null);
    public static final int b = 8;

    public final ReplaySubject<InterfaceC5125bsp> b() {
        return this.c;
    }

    public final Observable<AbstractC6618cgh> c() {
        return this.a;
    }

    public C6621cgk(NetflixMdxController netflixMdxController, NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixMdxController, "");
        C8632dsu.c((Object) netflixActivity, "");
        this.h = netflixMdxController;
        ReplaySubject<AbstractC6618cgh> create = ReplaySubject.create();
        C8632dsu.a(create, "");
        this.d = create;
        this.a = create;
        ReplaySubject<InterfaceC5125bsp> create2 = ReplaySubject.create();
        C8632dsu.a(create2, "");
        this.c = create2;
        C1645aIz.a(netflixActivity, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.MdxRepository$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                a(serviceManager);
                return dpR.c;
            }

            public final void a(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                InterfaceC5125bsp j = serviceManager.j();
                if (j != null) {
                    C6621cgk.this.b().onNext(j);
                }
            }
        });
    }

    /* renamed from: o.cgk$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("MdxRepository");
        }
    }

    public final InterfaceC5198buI e() {
        AbstractC6618cgh value = this.d.getValue();
        if (value instanceof AbstractC6618cgh.e) {
            return ((AbstractC6618cgh.e) value).a();
        }
        if (value instanceof AbstractC6618cgh.d) {
            return ((AbstractC6618cgh.d) value).e();
        }
        return null;
    }

    public final void b(AbstractC9766wb.C9774h c9774h) {
        C8632dsu.c((Object) c9774h, "");
        e.getLogTag();
        c(c9774h.b(), c9774h.c());
    }

    public final void c(AbstractC9766wb.C9772f c9772f) {
        C8632dsu.c((Object) c9772f, "");
        e.getLogTag();
        c(c9772f.c(), c9772f.b());
    }

    public final void a(AbstractC9766wb.t tVar) {
        C8632dsu.c((Object) tVar, "");
        e.getLogTag();
        d(tVar.c(), tVar.d());
    }

    public final void b(AbstractC9766wb.C9785s c9785s) {
        C8632dsu.c((Object) c9785s, "");
        e.getLogTag();
        d(c9785s.e(), c9785s.b());
    }

    public final void c(AbstractC9766wb.I i) {
        C8632dsu.c((Object) i, "");
        e.getLogTag();
        e(i.d(), i.e());
    }

    private final void c(final String str, final String str2) {
        e.getLogTag();
        Observable<InterfaceC5125bsp> takeUntil = this.c.takeUntil(this.h.o());
        C8632dsu.a(takeUntil, "");
        SubscribersKt.subscribeBy$default(takeUntil, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.MdxRepository$loadEpisode$2
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
                Map d;
                Map k;
                Throwable th2;
                ReplaySubject replaySubject;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("Unexpected error", th, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b2);
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
                replaySubject = C6621cgk.this.d;
                replaySubject.onNext(new AbstractC6618cgh.b(str, null, null, 6, null));
            }
        }, (drO) null, new drM<InterfaceC5125bsp, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.MdxRepository$loadEpisode$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(InterfaceC5125bsp interfaceC5125bsp) {
                b(interfaceC5125bsp);
                return dpR.c;
            }

            public final void b(final InterfaceC5125bsp interfaceC5125bsp) {
                if (C8153dex.p()) {
                    C1332Xp c1332Xp = C1332Xp.b;
                    ((InterfaceC6616cgf) C1332Xp.b(InterfaceC6616cgf.class)).b("(fetch episode/show)");
                }
                String str3 = str2;
                String logTag = C6621cgk.e.getLogTag();
                final String str4 = str2;
                final C6621cgk c6621cgk = this;
                final String str5 = str;
                interfaceC5125bsp.e(str3, null, true, new C5087bsD(logTag) { // from class: com.netflix.mediaclient.ui.mdx2.MdxRepository$loadEpisode$3.3
                    @Override // o.C5087bsD, o.InterfaceC5094bsK
                    public void e(InterfaceC5227bul interfaceC5227bul, Status status) {
                        ReplaySubject replaySubject;
                        Map d;
                        Map k;
                        Throwable th;
                        ReplaySubject replaySubject2;
                        super.e(interfaceC5227bul, status);
                        if (status == null || !status.j() || interfaceC5227bul == null) {
                            replaySubject = c6621cgk.d;
                            replaySubject.onNext(new AbstractC6618cgh.b(str5, status, "Error while fetching episode " + str4));
                        } else if (interfaceC5227bul.cd_() == null) {
                            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                            String str6 = "SPY-16203 - MdxRepository - episodeDetails.showId is null for " + str4;
                            d = dqE.d();
                            k = dqE.k(d);
                            C1596aHd c1596aHd = new C1596aHd(str6, null, null, true, k, false, false, 96, null);
                            ErrorType errorType = c1596aHd.a;
                            if (errorType != null) {
                                c1596aHd.e.put("errorType", errorType.c());
                                String b2 = c1596aHd.b();
                                if (b2 != null) {
                                    c1596aHd.a(errorType.c() + " " + b2);
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
                            InterfaceC1598aHf a = dVar.a();
                            if (a != null) {
                                a.e(c1596aHd, th);
                            } else {
                                dVar.e().b(c1596aHd, th);
                            }
                            replaySubject2 = c6621cgk.d;
                            replaySubject2.onNext(new AbstractC6618cgh.b(str5, status, "Error while fetching show for episode " + str4 + ", episodeDetails.showId is null"));
                        } else {
                            interfaceC5125bsp.b(interfaceC5227bul.cd_(), (String) null, new c(c6621cgk, str5, interfaceC5227bul, str4, C6621cgk.e.getLogTag()), r5);
                        }
                    }

                    /* renamed from: com.netflix.mediaclient.ui.mdx2.MdxRepository$loadEpisode$3$3$c */
                    /* loaded from: classes4.dex */
                    public static final class c extends C5087bsD {
                        final /* synthetic */ C6621cgk a;
                        final /* synthetic */ InterfaceC5227bul b;
                        final /* synthetic */ String d;
                        final /* synthetic */ String e;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        c(C6621cgk c6621cgk, String str, InterfaceC5227bul interfaceC5227bul, String str2, String str3) {
                            super(str3);
                            this.a = c6621cgk;
                            this.d = str;
                            this.b = interfaceC5227bul;
                            this.e = str2;
                        }

                        @Override // o.C5087bsD, o.InterfaceC5094bsK
                        public void e(InterfaceC5194buE interfaceC5194buE, Status status) {
                            ReplaySubject replaySubject;
                            ReplaySubject replaySubject2;
                            super.e(interfaceC5194buE, status);
                            if (status == null || !status.j() || interfaceC5194buE == null) {
                                replaySubject = this.a.d;
                                String str = this.d;
                                String str2 = this.e;
                                replaySubject.onNext(new AbstractC6618cgh.b(str, status, "Error while fetching show for episode " + str2));
                                return;
                            }
                            replaySubject2 = this.a.d;
                            replaySubject2.onNext(new AbstractC6618cgh.d(this.d, interfaceC5194buE, this.b));
                        }
                    }
                }, "MdxRepo");
            }
        }, 2, (Object) null);
    }

    private final void d(final String str, final String str2) {
        e.getLogTag();
        Observable<InterfaceC5125bsp> takeUntil = this.c.takeUntil(this.h.o());
        C8632dsu.a(takeUntil, "");
        SubscribersKt.subscribeBy$default(takeUntil, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.MdxRepository$loadMovie$2
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
                Map d;
                Map k;
                Throwable th2;
                ReplaySubject replaySubject;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("Unexpected error", th, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b2);
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
                replaySubject = C6621cgk.this.d;
                replaySubject.onNext(new AbstractC6618cgh.b(str, null, null, 6, null));
            }
        }, (drO) null, new drM<InterfaceC5125bsp, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.MdxRepository$loadMovie$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(InterfaceC5125bsp interfaceC5125bsp) {
                b(interfaceC5125bsp);
                return dpR.c;
            }

            public final void b(InterfaceC5125bsp interfaceC5125bsp) {
                if (C8153dex.p()) {
                    C1332Xp c1332Xp = C1332Xp.b;
                    ((InterfaceC6616cgf) C1332Xp.b(InterfaceC6616cgf.class)).b("(fetch movie)");
                }
                String str3 = str2;
                TaskMode taskMode = TaskMode.FROM_CACHE_OR_NETWORK;
                String logTag = C6621cgk.e.getLogTag();
                final C6621cgk c6621cgk = this;
                final String str4 = str;
                final String str5 = str2;
                interfaceC5125bsp.e(str3, null, true, taskMode, new C5087bsD(logTag) { // from class: com.netflix.mediaclient.ui.mdx2.MdxRepository$loadMovie$3.5
                    @Override // o.C5087bsD, o.InterfaceC5094bsK
                    public void d(InterfaceC5238buw interfaceC5238buw, Status status) {
                        ReplaySubject replaySubject;
                        ReplaySubject replaySubject2;
                        super.d(interfaceC5238buw, status);
                        if (status != null && status.j() && interfaceC5238buw != null) {
                            replaySubject2 = C6621cgk.this.d;
                            replaySubject2.onNext(new AbstractC6618cgh.e(str4, interfaceC5238buw));
                            return;
                        }
                        C6621cgk.e.getLogTag();
                        replaySubject = C6621cgk.this.d;
                        replaySubject.onNext(new AbstractC6618cgh.b(str4, status, null, 4, null));
                    }
                }, "MdxRepo", Boolean.FALSE);
            }
        }, 2, (Object) null);
    }

    private final void e(final String str, final String str2) {
        e.getLogTag();
        Observable<InterfaceC5125bsp> takeUntil = this.c.takeUntil(this.h.o());
        C8632dsu.a(takeUntil, "");
        SubscribersKt.subscribeBy$default(takeUntil, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.MdxRepository$loadPostPlayNextEpisode$2
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
                Map d;
                Map k;
                Throwable th2;
                ReplaySubject replaySubject;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("Unexpected error", th, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b2);
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
                replaySubject = C6621cgk.this.d;
                replaySubject.onNext(new AbstractC6618cgh.b(str, null, null, 6, null));
            }
        }, (drO) null, new drM<InterfaceC5125bsp, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.MdxRepository$loadPostPlayNextEpisode$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(InterfaceC5125bsp interfaceC5125bsp) {
                d(interfaceC5125bsp);
                return dpR.c;
            }

            public final void d(InterfaceC5125bsp interfaceC5125bsp) {
                if (C8153dex.p()) {
                    C1332Xp c1332Xp = C1332Xp.b;
                    ((InterfaceC6616cgf) C1332Xp.b(InterfaceC6616cgf.class)).b("(fetch next episode)");
                }
                String str3 = str2;
                String logTag = C6621cgk.e.getLogTag();
                final C6621cgk c6621cgk = this;
                final String str4 = str;
                final String str5 = str2;
                interfaceC5125bsp.e(str3, null, true, new C5087bsD(logTag) { // from class: com.netflix.mediaclient.ui.mdx2.MdxRepository$loadPostPlayNextEpisode$3.4
                    @Override // o.C5087bsD, o.InterfaceC5094bsK
                    public void e(InterfaceC5227bul interfaceC5227bul, Status status) {
                        ReplaySubject replaySubject;
                        ReplaySubject replaySubject2;
                        super.e(interfaceC5227bul, status);
                        if (status != null && status.j() && interfaceC5227bul != null) {
                            replaySubject2 = C6621cgk.this.d;
                            replaySubject2.onNext(new AbstractC6618cgh.c(str4, interfaceC5227bul));
                            return;
                        }
                        C6621cgk.e.getLogTag();
                        replaySubject = C6621cgk.this.d;
                        replaySubject.onNext(new AbstractC6618cgh.b(str4, status, null, 4, null));
                    }
                }, "MdxRepo.PP");
            }
        }, 2, (Object) null);
    }
}
