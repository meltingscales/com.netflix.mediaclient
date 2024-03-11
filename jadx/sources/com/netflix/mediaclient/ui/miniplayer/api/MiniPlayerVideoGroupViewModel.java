package com.netflix.mediaclient.ui.miniplayer.api;

import androidx.lifecycle.ViewModel;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import dagger.Lazy;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC5100bsQ;
import o.AbstractC5271bvc;
import o.C1045Mp;
import o.C1339Xw;
import o.C1596aHd;
import o.C8153dex;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC4360bcz;
import o.dpR;
import o.dqE;
import o.drM;

@HiltViewModel
/* loaded from: classes4.dex */
public final class MiniPlayerVideoGroupViewModel extends ViewModel {
    public static final c d = new c(null);
    private Disposable a;
    private final Lazy<C1339Xw> b;
    private boolean c;
    private boolean e;
    private PlaybackExperience f;
    private Integer g;
    private boolean h;
    private int i;
    private Integer j;
    private final Map<String, AbstractC5271bvc> k;
    private AbstractC5100bsQ l;
    private final BehaviorSubject<AbstractC5100bsQ> m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final Observable<AbstractC5100bsQ> f13291o;

    public final void a(int i) {
        this.i = i;
    }

    public final void a(PlaybackExperience playbackExperience) {
        this.f = playbackExperience;
    }

    public final void a(AbstractC5100bsQ abstractC5100bsQ) {
        this.l = abstractC5100bsQ;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final void b(Integer num) {
        this.g = num;
    }

    public final Integer c() {
        return this.j;
    }

    public final void d(Integer num) {
        this.j = num;
    }

    public final void d(boolean z) {
        this.c = z;
    }

    public final boolean d() {
        return this.e;
    }

    public final int e() {
        return this.i;
    }

    public final boolean f() {
        return this.c;
    }

    public final Observable<AbstractC5100bsQ> h() {
        return this.f13291o;
    }

    public final boolean i() {
        return this.n;
    }

    public final AbstractC5100bsQ j() {
        return this.l;
    }

    public final boolean m() {
        return this.h;
    }

    @Inject
    public MiniPlayerVideoGroupViewModel(Lazy<C1339Xw> lazy) {
        C8632dsu.c((Object) lazy, "");
        this.b = lazy;
        this.k = new LinkedHashMap();
        this.n = true;
        BehaviorSubject<AbstractC5100bsQ> create = BehaviorSubject.create();
        C8632dsu.a(create, "");
        this.m = create;
        this.f13291o = create;
    }

    public final PlaybackExperience g() {
        PlaybackExperience playbackExperience = this.f;
        if (playbackExperience != null) {
            return playbackExperience;
        }
        throw new IllegalArgumentException("Please set playbackExperience on the MiniPlayerViewModel before starting playback".toString());
    }

    public final void c(AbstractC5271bvc abstractC5271bvc) {
        C8632dsu.c((Object) abstractC5271bvc, "");
        this.k.put(abstractC5271bvc.d(), abstractC5271bvc);
    }

    public final AbstractC5271bvc b(String str) {
        C8632dsu.c((Object) str, "");
        AbstractC5271bvc abstractC5271bvc = this.k.get(str);
        if (abstractC5271bvc != null) {
            return abstractC5271bvc;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final Observable<Integer> a() {
        return this.b.get().b();
    }

    public final void b() {
        this.b.get().disable();
    }

    public final void k() {
        Disposable disposable = this.a;
        if (disposable != null) {
            disposable.dispose();
        }
        Single<AbstractC5100bsQ> b = InterfaceC4360bcz.b.a().b();
        final drM<AbstractC5100bsQ, dpR> drm = new drM<AbstractC5100bsQ, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel$onStart$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC5100bsQ abstractC5100bsQ) {
                a(abstractC5100bsQ);
                return dpR.c;
            }

            public final void a(AbstractC5100bsQ abstractC5100bsQ) {
                BehaviorSubject behaviorSubject;
                MiniPlayerVideoGroupViewModel.this.a(abstractC5100bsQ);
                MiniPlayerVideoGroupViewModel.c cVar = MiniPlayerVideoGroupViewModel.d;
                if (MiniPlayerVideoGroupViewModel.this.d() && C8153dex.e()) {
                    behaviorSubject = MiniPlayerVideoGroupViewModel.this.m;
                    behaviorSubject.onNext(abstractC5100bsQ);
                }
            }
        };
        Consumer<? super AbstractC5100bsQ> consumer = new Consumer() { // from class: o.cih
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MiniPlayerVideoGroupViewModel.d(drM.this, obj);
            }
        };
        final MiniPlayerVideoGroupViewModel$onStart$2 miniPlayerVideoGroupViewModel$onStart$2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel$onStart$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                Map d2;
                Map k;
                Throwable th2;
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                String str = "Got an exception when create a videoGroup: " + th.getLocalizedMessage();
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        c1596aHd.a(errorType.c() + " " + b2);
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
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            }
        };
        this.a = b.subscribe(consumer, new Consumer() { // from class: o.cii
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MiniPlayerVideoGroupViewModel.c(drM.this, obj);
            }
        });
        this.h = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final void n() {
        Disposable disposable = this.a;
        if (disposable != null) {
            disposable.dispose();
        }
        this.a = null;
        AbstractC5100bsQ abstractC5100bsQ = this.l;
        if (abstractC5100bsQ != null) {
            abstractC5100bsQ.e();
        }
        this.l = null;
        this.h = true;
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("VideoGroupViewModel");
        }
    }
}
