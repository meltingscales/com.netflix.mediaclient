package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorUi$fetchDetailsData$4;
import com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorUi$initializeLoadingComponent$3;
import com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorUi$updateSeasonData$1;
import com.netflix.mediaclient.util.ConnectivityUtils;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.AbstractC3646bFo;
import o.AbstractC3652bFu;
import o.AbstractC9672un;
import o.AbstractC9683uy;
import o.C1180Rt;
import o.C1596aHd;
import o.C3622bEr;
import o.C8054ddD;
import o.C8153dex;
import o.C8632dsu;
import o.C9935zP;
import o.InterfaceC1078Nw;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5195buF;
import o.InterfaceC5225buj;
import o.InterfaceC5227bul;
import o.InterfaceC7303ctf;
import o.InterfaceC7306cti;
import o.bDW;
import o.bDX;
import o.bFV;
import o.bFX;
import o.bFZ;
import o.dpR;
import o.dqE;

@SuppressLint({"CheckResult"})
/* renamed from: o.bEr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3622bEr implements C1180Rt.d {
    public static final b d = new b(null);
    private InterfaceC5195buF a;
    private InterfaceC7216cry b;
    private final ArrayList<InterfaceC5195buF> c;
    private int e;
    private int f;
    private final String g;
    private Integer h;
    private Integer i;
    private final Observable<dpR> j;
    private final C9935zP k;
    private boolean l;
    private boolean m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private long f13500o;
    private final bEH p;
    private final NetflixActivity q;
    private String r;
    private int s;
    private final long t;
    private final String u;
    private FrameLayout v;
    private final InterfaceC3617bEm w;
    private bFW y;

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(boolean z) {
        this.l = z;
    }

    public C3622bEr(NetflixActivity netflixActivity, ViewGroup viewGroup, ViewGroup viewGroup2, String str, C9935zP c9935zP, Observable<dpR> observable, String str2, long j, bEH beh, InterfaceC3617bEm interfaceC3617bEm) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) viewGroup2, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) interfaceC3617bEm, "");
        this.q = netflixActivity;
        this.g = str;
        this.k = c9935zP;
        this.j = observable;
        this.u = str2;
        this.t = j;
        this.p = beh;
        this.w = interfaceC3617bEm;
        this.f = -1;
        this.c = new ArrayList<>();
        this.e = -1;
        a(viewGroup2);
        e(viewGroup);
        C3609bEe c3609bEe = new C3609bEe(viewGroup2, beh);
        new C3611bEg(c3609bEe, c9935zP.d(bFZ.class));
        Observable<bFV> takeUntil = c3609bEe.v().takeUntil(observable);
        final drM<bFV, dpR> drm = new drM<bFV, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorUi$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(bFV bfv) {
                d(bfv);
                return dpR.c;
            }

            public final void d(bFV bfv) {
                C9935zP c9935zP2;
                boolean z;
                if (bfv instanceof bFX.e) {
                    z = C3622bEr.this.m;
                    if (z) {
                        C3622bEr.this.c();
                    }
                } else if (bfv instanceof bFV.c) {
                    c9935zP2 = C3622bEr.this.k;
                    C8632dsu.d(bfv);
                    c9935zP2.b(bFV.c.class, bfv);
                }
            }
        };
        takeUntil.subscribe(new Consumer() { // from class: o.bEx
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C3622bEr.f(drM.this, obj);
            }
        });
        b(viewGroup2);
        C1645aIz.a(netflixActivity, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorUi$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                e(serviceManager);
                return dpR.c;
            }

            public final void e(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                C3622bEr.this.b(false);
            }
        });
    }

    /* renamed from: o.bEr$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("EpisodesListSelectorUi");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @SuppressLint({"CheckResult"})
    private final void a(ViewGroup viewGroup) {
        new C9633uA(new C9682ux(viewGroup), this.k.d(AbstractC9683uy.class));
        C9678ut c9678ut = new C9678ut(viewGroup);
        new C9676ur(c9678ut, this.k.d(AbstractC9683uy.class));
        C1645aIz.a(this.q, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorUi$initializeLoadingComponent$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                d(serviceManager);
                return dpR.c;
            }

            public final void d(ServiceManager serviceManager) {
                NetflixActivity netflixActivity;
                C8632dsu.c((Object) serviceManager, "");
                if (serviceManager.H()) {
                    C3622bEr c3622bEr = C3622bEr.this;
                    InterfaceC7303ctf.a aVar = InterfaceC7303ctf.c;
                    netflixActivity = c3622bEr.q;
                    c3622bEr.s = aVar.a(netflixActivity).a().f();
                }
            }
        });
        Observable<AbstractC9672un> takeUntil = c9678ut.v().takeUntil(this.j);
        final drM<AbstractC9672un, dpR> drm = new drM<AbstractC9672un, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorUi$initializeLoadingComponent$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC9672un abstractC9672un) {
                b(abstractC9672un);
                return dpR.c;
            }

            public final void b(AbstractC9672un abstractC9672un) {
                NetflixActivity netflixActivity;
                NetflixActivity netflixActivity2;
                NetflixActivity netflixActivity3;
                if (abstractC9672un instanceof AbstractC9672un.d) {
                    netflixActivity = C3622bEr.this.q;
                    InterfaceC7306cti.e eVar = InterfaceC7306cti.c;
                    netflixActivity2 = C3622bEr.this.q;
                    InterfaceC7306cti e = eVar.e(netflixActivity2);
                    netflixActivity3 = C3622bEr.this.q;
                    netflixActivity.startActivity(e.d((Activity) netflixActivity3));
                } else if (abstractC9672un instanceof AbstractC9672un.e) {
                    C3622bEr.this.e();
                }
            }
        };
        Consumer<? super AbstractC9672un> consumer = new Consumer() { // from class: o.bEu
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C3622bEr.k(drM.this, obj);
            }
        };
        final EpisodesListSelectorUi$initializeLoadingComponent$3 episodesListSelectorUi$initializeLoadingComponent$3 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorUi$initializeLoadingComponent$3
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                Map d2;
                Map k;
                Throwable th2;
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
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
            }
        };
        takeUntil.subscribe(consumer, new Consumer() { // from class: o.bEA
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C3622bEr.l(drM.this, obj);
            }
        });
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @SuppressLint({"CheckResult"})
    private final void e(ViewGroup viewGroup) {
        Observable d2 = this.k.d(AbstractC3652bFu.class);
        final drM<AbstractC3652bFu, dpR> drm = new drM<AbstractC3652bFu, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorUi$setupSeasonSelector$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC3652bFu abstractC3652bFu) {
                b(abstractC3652bFu);
                return dpR.c;
            }

            public final void b(AbstractC3652bFu abstractC3652bFu) {
                if (abstractC3652bFu instanceof AbstractC3652bFu.a) {
                    C3622bEr.this.e(((AbstractC3652bFu.a) abstractC3652bFu).b());
                }
            }
        };
        d2.subscribe(new Consumer() { // from class: o.bEw
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C3622bEr.m(drM.this, obj);
            }
        });
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        this.v = frameLayout;
        viewGroup.addView(frameLayout);
        bFW bfw = new bFW(frameLayout, this.k, null, 4, null);
        this.y = bfw;
        new bFU(bfw, this.k.d(AbstractC3646bFo.class), this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    private final void f() {
        b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final void b(boolean z) {
        ServiceManager serviceManager = this.q.getServiceManager();
        if (serviceManager.c()) {
            d.getLogTag();
            Observable<bDW> observeOn = this.w.d(serviceManager, this.u, this.g, z, "EpisodeListSelector").takeUntil(this.j).observeOn(AndroidSchedulers.mainThread());
            final drM<bDW, dpR> drm = new drM<bDW, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorUi$fetchDetailsData$3
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(bDW bdw) {
                    d(bdw);
                    return dpR.c;
                }

                public final void d(bDW bdw) {
                    ArrayList arrayList;
                    int i;
                    int i2;
                    int i3;
                    C9935zP c9935zP;
                    int i4;
                    String str;
                    Map d2;
                    Map k;
                    Throwable th;
                    int i5;
                    String str2;
                    Map d3;
                    Map k2;
                    Throwable th2;
                    C9935zP c9935zP2;
                    if (bdw instanceof bDW.e) {
                        bDW.e eVar = (bDW.e) bdw;
                        C3622bEr.this.f = eVar.a();
                        c9935zP2 = C3622bEr.this.k;
                        c9935zP2.b(bFZ.class, bFZ.f.e);
                        C3622bEr.this.d(eVar.d());
                    } else if (bdw instanceof bDW.a) {
                        List<InterfaceC5195buF> b2 = ((bDW.a) bdw).b();
                        if (b2 == null) {
                            return;
                        }
                        arrayList = C3622bEr.this.c;
                        if (arrayList.size() != b2.size()) {
                            C3622bEr.this.d(b2);
                        }
                        i = C3622bEr.this.e;
                        if (i >= 0) {
                            i2 = C3622bEr.this.e;
                            if (i2 >= b2.size()) {
                                C3622bEr.this.e(b2.size() - 1);
                                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                                i4 = C3622bEr.this.e;
                                int size = b2.size();
                                str = C3622bEr.this.u;
                                String str3 = "SPY-12784: currSeasonIndex=" + i4 + " with season count=" + size + " for show " + str;
                                d2 = dqE.d();
                                k = dqE.k(d2);
                                C1596aHd c1596aHd = new C1596aHd(str3, null, null, false, k, false, false, 96, null);
                                ErrorType errorType = c1596aHd.a;
                                if (errorType != null) {
                                    c1596aHd.e.put("errorType", errorType.c());
                                    String b3 = c1596aHd.b();
                                    if (b3 != null) {
                                        c1596aHd.a(errorType.c() + " " + b3);
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
                                    return;
                                } else {
                                    dVar.e().b(c1596aHd, th);
                                    return;
                                }
                            }
                            i3 = C3622bEr.this.e;
                            c9935zP = C3622bEr.this.k;
                            c9935zP.b(bFZ.class, new bFZ.i(b2.get(i3)));
                            return;
                        }
                        InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                        i5 = C3622bEr.this.e;
                        int size2 = b2.size();
                        str2 = C3622bEr.this.u;
                        String str4 = "SPY-12784: negative currSeasonIndex=" + i5 + " with season count=" + size2 + " for show " + str2;
                        d3 = dqE.d();
                        k2 = dqE.k(d3);
                        C1596aHd c1596aHd2 = new C1596aHd(str4, null, null, true, k2, false, false, 96, null);
                        ErrorType errorType2 = c1596aHd2.a;
                        if (errorType2 != null) {
                            c1596aHd2.e.put("errorType", errorType2.c());
                            String b4 = c1596aHd2.b();
                            if (b4 != null) {
                                c1596aHd2.a(errorType2.c() + " " + b4);
                            }
                        }
                        if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                            th2 = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                        } else if (c1596aHd2.b() != null) {
                            th2 = new Throwable(c1596aHd2.b());
                        } else {
                            Throwable th3 = c1596aHd2.i;
                            if (th3 == null) {
                                th2 = new Throwable("Handled exception with no message");
                            } else if (th3 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            } else {
                                th2 = th3;
                            }
                        }
                        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a2 = dVar2.a();
                        if (a2 != null) {
                            a2.e(c1596aHd2, th2);
                        } else {
                            dVar2.e().b(c1596aHd2, th2);
                        }
                        if (!b2.isEmpty()) {
                            C3622bEr.this.e(0);
                        }
                    } else if (bdw instanceof bDW.c) {
                        C3622bEr.this.a(((bDW.c) bdw).c());
                    }
                }
            };
            Consumer<? super bDW> consumer = new Consumer() { // from class: o.bEt
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C3622bEr.i(drM.this, obj);
                }
            };
            final EpisodesListSelectorUi$fetchDetailsData$4 episodesListSelectorUi$fetchDetailsData$4 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorUi$fetchDetailsData$4
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    e(th);
                    return dpR.c;
                }

                public final void e(Throwable th) {
                    Map d2;
                    Map k;
                    Throwable th2;
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            String c = errorType.c();
                            c1596aHd.a(c + " " + b2);
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
                }
            };
            observeOn.subscribe(consumer, new Consumer() { // from class: o.bEv
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C3622bEr.g(drM.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final void d(List<? extends InterfaceC5195buF> list) {
        NetflixActivity netflixActivity = this.q;
        if (C8141del.c(netflixActivity)) {
            return;
        }
        this.c.clear();
        this.c.addAll(list);
        this.k.b(AbstractC3646bFo.class, new AbstractC3646bFo.e(list));
        if (C8168dfL.h(this.g)) {
            C1645aIz.a(netflixActivity, new EpisodesListSelectorUi$updateSeasonData$1(this));
        } else {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        if (this.e == -1 && this.f != -1) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                if (this.f == this.c.get(i).x()) {
                    this.e = i;
                    return;
                }
            }
            this.e = this.c.size() > 0 ? 0 : -1;
        }
        if (this.e < 0) {
            d.getLogTag();
            return;
        }
        d.getLogTag();
        e(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i == this.c.get(i2).x()) {
                return i2;
            }
        }
        return this.c.size() > 0 ? 0 : -1;
    }

    private final void b() {
        this.m = true;
        this.f13500o = -1L;
        this.n = 0;
        this.r = null;
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        InterfaceC5195buF interfaceC5195buF;
        if (this.q.getServiceManager().c() && (interfaceC5195buF = this.a) != null) {
            this.f13500o = System.nanoTime();
            if (this.n >= interfaceC5195buF.D_()) {
                this.m = false;
                return;
            }
            int i = this.n + 39;
            if (i >= interfaceC5195buF.D_()) {
                i = interfaceC5195buF.D_() - 1;
            }
            int i2 = i;
            String id = interfaceC5195buF.getId();
            C8632dsu.a(id, "");
            if (C8168dfL.g(id)) {
                C8128deY.b(this.u, interfaceC5195buF);
                return;
            }
            Observable<bDW> observeOn = this.w.d(id, this.f13500o, this.n, i2, this.r, this.a).takeUntil(this.j).observeOn(AndroidSchedulers.mainThread());
            final drM<bDW, dpR> drm = new drM<bDW, dpR>() { // from class: com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorUi$fetchEpisodesList$1$3
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(bDW bdw) {
                    c(bdw);
                    return dpR.c;
                }

                public final void c(bDW bdw) {
                    NetflixActivity netflixActivity;
                    long j;
                    C9935zP c9935zP;
                    String str;
                    C9935zP c9935zP2;
                    int i3;
                    C9935zP c9935zP3;
                    Integer num;
                    int i4;
                    Integer num2;
                    C9935zP c9935zP4;
                    String str2;
                    if (bdw instanceof bDW.d) {
                        netflixActivity = C3622bEr.this.q;
                        if (C8054ddD.l(netflixActivity)) {
                            return;
                        }
                        j = C3622bEr.this.f13500o;
                        bDW.d dVar = (bDW.d) bdw;
                        if (j != dVar.c()) {
                            return;
                        }
                        C3622bEr.this.m = true;
                        Status a = dVar.a();
                        if (a.i()) {
                            C3622bEr.this.m = false;
                            C3622bEr.this.a(a);
                            return;
                        }
                        List<InterfaceC5227bul> b2 = dVar.b();
                        if (b2 == null || b2.size() == 0) {
                            C3622bEr.this.m = false;
                            C3622bEr c3622bEr = C3622bEr.this;
                            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ai;
                            C8632dsu.a(netflixImmutableStatus, "");
                            c3622bEr.a(netflixImmutableStatus);
                            return;
                        }
                        if (C8153dex.F()) {
                            C3622bEr c3622bEr2 = C3622bEr.this;
                            InterfaceC5227bul interfaceC5227bul = b2.get(b2.size() - 1);
                            InterfaceC5225buj interfaceC5225buj = interfaceC5227bul instanceof InterfaceC5225buj ? (InterfaceC5225buj) interfaceC5227bul : null;
                            c3622bEr2.r = interfaceC5225buj != null ? interfaceC5225buj.at() : null;
                        }
                        int e = dVar.e();
                        if (b2.size() < (dVar.d() - e) + 1) {
                            C3622bEr.this.m = false;
                        }
                        c9935zP = C3622bEr.this.k;
                        str = C3622bEr.this.g;
                        c9935zP.b(bFZ.class, new bFZ.d(b2, e, str));
                        if (e == 0) {
                            num = C3622bEr.this.i;
                            i4 = C3622bEr.this.e;
                            if (num != null && num.intValue() == i4) {
                                num2 = C3622bEr.this.h;
                                int intValue = num2 != null ? num2.intValue() - 1 : -1;
                                c9935zP4 = C3622bEr.this.k;
                                str2 = C3622bEr.this.g;
                                c9935zP4.b(bFZ.class, new bFZ.c(intValue, str2));
                                C3622bEr c3622bEr3 = C3622bEr.this;
                                i3 = c3622bEr3.n;
                                c3622bEr3.n = i3 + b2.size();
                                c9935zP3 = C3622bEr.this.k;
                                c9935zP3.b(AbstractC9683uy.class, AbstractC9683uy.e.b);
                                C3622bEr.this.c(bDX.d.b(b2));
                            }
                        }
                        c9935zP2 = C3622bEr.this.k;
                        c9935zP2.b(bFZ.class, new bFZ.h(0, 0));
                        C3622bEr c3622bEr32 = C3622bEr.this;
                        i3 = c3622bEr32.n;
                        c3622bEr32.n = i3 + b2.size();
                        c9935zP3 = C3622bEr.this.k;
                        c9935zP3.b(AbstractC9683uy.class, AbstractC9683uy.e.b);
                        C3622bEr.this.c(bDX.d.b(b2));
                    }
                }
            };
            observeOn.subscribe(new Consumer() { // from class: o.bEy
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C3622bEr.n(drM.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    private final void j() {
        List i;
        this.k.b(AbstractC9683uy.class, new AbstractC9683uy.b(false));
        C9935zP c9935zP = this.k;
        i = C8569dql.i();
        c9935zP.b(AbstractC3646bFo.class, new AbstractC3646bFo.e(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Status status) {
        List i;
        this.k.b(AbstractC9683uy.class, new AbstractC9683uy.c(this.s > 0));
        C9935zP c9935zP = this.k;
        i = C8569dql.i();
        c9935zP.b(AbstractC3646bFo.class, new AbstractC3646bFo.e(i));
        this.k.b(bFZ.class, bFZ.b.e);
    }

    private final void b(ViewGroup viewGroup) {
        d();
        InterfaceC4208baF offlineAgentOrNull = NetflixActivity.getOfflineAgentOrNull(this.q);
        this.b = offlineAgentOrNull != null ? (InterfaceC7216cry) offlineAgentOrNull.e((InterfaceC4208baF) InterfaceC7303ctf.c.a(this.q).d(viewGroup, false)) : null;
    }

    public final void d() {
        InterfaceC4208baF offlineAgentOrNull = NetflixActivity.getOfflineAgentOrNull(this.q);
        if (offlineAgentOrNull != null) {
            offlineAgentOrNull.d(this.b);
        }
        this.b = null;
    }

    @Override // o.C1180Rt.d
    public void e() {
        j();
        g();
    }

    public String toString() {
        String obj = super.toString();
        String str = this.u;
        return obj + " : " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(int i) {
        b bVar = d;
        bVar.getLogTag();
        a();
        InterfaceC5195buF interfaceC5195buF = this.c.size() > i ? this.c.get(i) : null;
        this.a = interfaceC5195buF;
        this.e = i;
        if (interfaceC5195buF == null) {
            bVar.getLogTag();
        }
        this.k.b(AbstractC9683uy.class, new AbstractC9683uy.b(false));
        b();
        this.k.b(AbstractC3646bFo.class, new AbstractC3646bFo.b(i));
    }

    public final void a() {
        if (this.l) {
            b bVar = d;
            bVar.getLogTag();
            ServiceManager serviceManager = this.q.getServiceManager();
            if (!serviceManager.c()) {
                bVar.getLogTag();
                return;
            }
            InterfaceC5195buF interfaceC5195buF = this.a;
            if (interfaceC5195buF != null) {
                String id = interfaceC5195buF != null ? interfaceC5195buF.getId() : null;
                if (C8168dfL.g(id)) {
                    C8128deY.b(this.u, this.a);
                    return;
                } else if (ConnectivityUtils.l(serviceManager.f())) {
                    serviceManager.j().a(id, VideoType.SEASON);
                    return;
                } else {
                    return;
                }
            }
            bVar.getLogTag();
        }
    }

    private final void g() {
        d.getLogTag();
        f();
    }
}
