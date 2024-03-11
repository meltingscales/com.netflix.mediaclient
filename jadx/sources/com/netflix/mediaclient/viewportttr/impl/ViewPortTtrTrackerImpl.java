package com.netflix.mediaclient.viewportttr.impl;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.viewportttr.impl.EndTtrChecker;
import com.netflix.mediaclient.viewportttr.impl.ViewPortMembershipTracker;
import com.netflix.mediaclient.viewportttr.impl.ViewPortTtrTrackerImpl;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import o.C1045Mp;
import o.C8166dfJ;
import o.C8359dir;
import o.C8362diu;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.C9646uN;
import o.C9684uz;
import o.InterfaceC1270Vf;
import o.InterfaceC8357dip;
import o.InterfaceC8358diq;
import o.InterfaceC9635uC;
import o.InterfaceC9643uK;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes5.dex */
public final class ViewPortTtrTrackerImpl implements InterfaceC8358diq, DefaultLifecycleObserver {
    public static final a e = new a(null);
    private final InterfaceC1270Vf a;
    private final e b;
    private boolean c;
    private SingleEmitter<InterfaceC8358diq.c> d;
    private final InterfaceC9643uK f;
    private final List<InterfaceC8357dip> g;
    private boolean h;
    private InterfaceC8358diq.d i;
    private boolean j;
    private View k;
    private Disposable l;
    private drO<? extends View> n;

    @Inject
    public ViewPortTtrTrackerImpl(InterfaceC9643uK interfaceC9643uK, InterfaceC1270Vf interfaceC1270Vf) {
        C8632dsu.c((Object) interfaceC9643uK, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        this.f = interfaceC9643uK;
        this.a = interfaceC1270Vf;
        this.b = new e();
        this.g = new ArrayList();
    }

    /* loaded from: classes5.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("ViewPortTtrTracker");
        }
    }

    @Override // o.InterfaceC8358diq
    public Single<InterfaceC8358diq.c> d(final drO<? extends View> dro, final Lifecycle lifecycle, final InterfaceC8358diq.d dVar) {
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) lifecycle, "");
        C8166dfJ.e(null, false, 3, null);
        e.getLogTag();
        Single create = Single.create(new SingleOnSubscribe() { // from class: o.diw
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                ViewPortTtrTrackerImpl.d(ViewPortTtrTrackerImpl.this, singleEmitter);
            }
        });
        final drM<Disposable, dpR> drm = new drM<Disposable, dpR>() { // from class: com.netflix.mediaclient.viewportttr.impl.ViewPortTtrTrackerImpl$startTracking$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Disposable disposable) {
                d(disposable);
                return dpR.c;
            }

            public final void d(Disposable disposable) {
                InterfaceC9643uK interfaceC9643uK;
                ViewPortTtrTrackerImpl.e eVar;
                if (ViewPortTtrTrackerImpl.this.h) {
                    return;
                }
                ViewPortTtrTrackerImpl.this.h = true;
                ViewPortTtrTrackerImpl.this.n = dro;
                ViewPortTtrTrackerImpl.this.i = dVar;
                interfaceC9643uK = ViewPortTtrTrackerImpl.this.f;
                eVar = ViewPortTtrTrackerImpl.this.b;
                interfaceC9643uK.d(eVar);
                lifecycle.addObserver(ViewPortTtrTrackerImpl.this);
                ViewPortTtrTrackerImpl.this.e();
            }
        };
        Single<InterfaceC8358diq.c> doOnDispose = create.doOnSubscribe(new Consumer() { // from class: o.dit
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ViewPortTtrTrackerImpl.a(drM.this, obj);
            }
        }).doOnDispose(new Action() { // from class: o.diC
            @Override // io.reactivex.functions.Action
            public final void run() {
                ViewPortTtrTrackerImpl.o(ViewPortTtrTrackerImpl.this);
            }
        });
        C8632dsu.a(doOnDispose, "");
        return doOnDispose;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ViewPortTtrTrackerImpl viewPortTtrTrackerImpl, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) viewPortTtrTrackerImpl, "");
        C8632dsu.c((Object) singleEmitter, "");
        viewPortTtrTrackerImpl.d = singleEmitter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(ViewPortTtrTrackerImpl viewPortTtrTrackerImpl) {
        C8632dsu.c((Object) viewPortTtrTrackerImpl, "");
        if (viewPortTtrTrackerImpl.h) {
            viewPortTtrTrackerImpl.c(EndTtrChecker.Reason.a);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        C8632dsu.c((Object) lifecycleOwner, "");
        super.onStart(lifecycleOwner);
        e.getLogTag();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        List<InterfaceC8357dip> U;
        if (this.h && this.k == null) {
            drO<? extends View> dro = this.n;
            if (dro != null) {
                View invoke = dro.invoke();
                if (invoke != null) {
                    this.k = invoke;
                    U = C8576dqs.U(this.g);
                    for (InterfaceC8357dip interfaceC8357dip : U) {
                        interfaceC8357dip.b(invoke);
                    }
                    b();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private final void a() {
        C8166dfJ.e(null, false, 3, null);
        this.h = false;
        this.n = null;
        this.d = null;
        this.i = null;
        Disposable disposable = this.l;
        if (disposable != null) {
            disposable.dispose();
        }
        this.l = null;
        for (InterfaceC8357dip interfaceC8357dip : this.g) {
            interfaceC8357dip.a();
        }
        this.g.clear();
        this.f.e(this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        if (this.h && this.l == null) {
            Single<Long> timer = Single.timer(100L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread());
            C8632dsu.a(timer, "");
            this.l = SubscribersKt.subscribeBy$default(timer, (drM) null, new drM<Long, dpR>() { // from class: com.netflix.mediaclient.viewportttr.impl.ViewPortTtrTrackerImpl$startTimerIfNecessary$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Long l) {
                    a(l);
                    return dpR.c;
                }

                public final void a(Long l) {
                    ViewPortTtrTrackerImpl.e.getLogTag();
                    ViewPortTtrTrackerImpl.this.j = true;
                    ViewPortTtrTrackerImpl.this.b();
                }
            }, 1, (Object) null);
        }
    }

    private final void c(EndTtrChecker.Reason reason) {
        C8166dfJ.e(null, false, 3, null);
        e.getLogTag();
        if (!this.h) {
            throw new IllegalArgumentException("onTtrCompleted called when TTR wasn't being tracked".toString());
        }
        SingleEmitter<InterfaceC8358diq.c> singleEmitter = this.d;
        if (singleEmitter == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        InterfaceC8358diq.c d = EndTtrChecker.d.d(reason, this.g);
        a();
        singleEmitter.onSuccess(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        if (this.h) {
            EndTtrChecker.c a2 = EndTtrChecker.d.a(this.j, this.c, this.g);
            boolean b = a2.b();
            EndTtrChecker.Reason d = a2.d();
            if (b) {
                if (d == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                c(d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class e implements InterfaceC9635uC {
        @Override // o.InterfaceC9635uC
        public Single<C9646uN.e> b(C9646uN.b bVar, Single<C9646uN.e> single) {
            C8632dsu.c((Object) bVar, "");
            C8632dsu.c((Object) single, "");
            return single;
        }

        @Override // o.InterfaceC9635uC
        public Single<C9684uz.d> c(C9684uz.a aVar, Single<C9684uz.d> single) {
            C8632dsu.c((Object) aVar, "");
            C8632dsu.c((Object) single, "");
            return single;
        }

        public e() {
        }

        @Override // o.InterfaceC9635uC
        public Single<GetImageRequest.a> b(GetImageRequest.e eVar, Single<GetImageRequest.a> single) {
            C8632dsu.c((Object) eVar, "");
            C8632dsu.c((Object) single, "");
            C8166dfJ.e(null, false, 3, null);
            if (ViewPortTtrTrackerImpl.this.h && eVar.i()) {
                C8359dir c8359dir = new C8359dir(eVar, ViewPortTtrTrackerImpl.this.a, ViewPortTtrTrackerImpl.this.i, new ViewPortTtrTrackerImpl$GlobalTracker$trackGetImage$tracker$1(ViewPortTtrTrackerImpl.this));
                View view = ViewPortTtrTrackerImpl.this.k;
                if (view != null) {
                    c8359dir.b(view);
                }
                if (c8359dir.i() != ViewPortMembershipTracker.Membership.b) {
                    ViewPortTtrTrackerImpl.this.c();
                    ViewPortTtrTrackerImpl.this.g.add(c8359dir);
                    return c8359dir.c(single);
                }
                ViewPortTtrTrackerImpl.e.getLogTag();
                c8359dir.a();
                return single;
            }
            return single;
        }

        @Override // o.InterfaceC9635uC
        public Single<ShowImageRequest.a> b(ImageView imageView, ShowImageRequest.d dVar, Single<ShowImageRequest.a> single) {
            String m;
            boolean g;
            C8632dsu.c((Object) imageView, "");
            C8632dsu.c((Object) dVar, "");
            C8632dsu.c((Object) single, "");
            if (ViewPortTtrTrackerImpl.this.h && (m = dVar.a().m()) != null) {
                g = C8691duz.g(m);
                if (!g) {
                    C8362diu c8362diu = new C8362diu(imageView, dVar, ViewPortTtrTrackerImpl.this.a, ViewPortTtrTrackerImpl.this.i, new ViewPortTtrTrackerImpl$GlobalTracker$trackShowImage$tracker$1(ViewPortTtrTrackerImpl.this));
                    View view = ViewPortTtrTrackerImpl.this.k;
                    if (view != null) {
                        c8362diu.b(view);
                    }
                    if (c8362diu.i() != ViewPortMembershipTracker.Membership.b) {
                        ViewPortTtrTrackerImpl.this.c();
                        ViewPortTtrTrackerImpl.this.g.add(c8362diu);
                        return c8362diu.b(single);
                    }
                    ViewPortTtrTrackerImpl.e.getLogTag();
                    c8362diu.a();
                    return single;
                }
            }
            return single;
        }

        @Override // o.InterfaceC9635uC
        public void c() {
            ViewPortTtrTrackerImpl.e.getLogTag();
            ViewPortTtrTrackerImpl.this.c = true;
            ViewPortTtrTrackerImpl.this.b();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        C8632dsu.c((Object) lifecycleOwner, "");
        e.getLogTag();
        if (this.h) {
            c(EndTtrChecker.Reason.c);
        }
        super.onStop(lifecycleOwner);
    }
}
