package o;

import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.vn */
/* loaded from: classes2.dex */
public final class C9725vn {
    private static final drM<Object, dpR> e = new drM<Object, dpR>() { // from class: com.netflix.android.kotlinx.AutoDisposableKt$onNextStub$1
        public final void e(Object obj) {
            C8632dsu.c(obj, "");
        }

        @Override // o.drM
        public /* synthetic */ dpR invoke(Object obj) {
            e(obj);
            return dpR.c;
        }
    };
    private static final drM<Throwable, dpR> b = new drM<Throwable, dpR>() { // from class: com.netflix.android.kotlinx.AutoDisposableKt$onErrorStub$1
        public final void e(Throwable th) {
            C8632dsu.c((Object) th, "");
            RxJavaPlugins.onError(new OnErrorNotImplementedException(th));
        }

        @Override // o.drM
        public /* synthetic */ dpR invoke(Throwable th) {
            e(th);
            return dpR.c;
        }
    };
    private static final drO<dpR> c = new drO<dpR>() { // from class: com.netflix.android.kotlinx.AutoDisposableKt$onCompleteStub$1
        public final void e() {
        }

        @Override // o.drO
        public /* synthetic */ dpR invoke() {
            e();
            return dpR.c;
        }
    };

    public static /* synthetic */ Disposable a(ObservableSubscribeProxy observableSubscribeProxy, drM drm, drO dro, drM drm2, int i, Object obj) {
        if ((i & 1) != 0) {
            drm = b;
        }
        if ((i & 2) != 0) {
            dro = c;
        }
        if ((i & 4) != 0) {
            drm2 = e;
        }
        return c(observableSubscribeProxy, drm, dro, drm2);
    }

    public static final <T> Disposable c(ObservableSubscribeProxy<T> observableSubscribeProxy, final drM<? super Throwable, dpR> drm, final drO<dpR> dro, final drM<? super T, dpR> drm2) {
        C8632dsu.c((Object) observableSubscribeProxy, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drm2, "");
        if (drm == b && dro == c) {
            Disposable e2 = observableSubscribeProxy.e(new Consumer() { // from class: o.vm
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C9725vn.f(drM.this, obj);
                }
            });
            C8632dsu.d(e2);
            return e2;
        }
        Disposable a = observableSubscribeProxy.a(new Consumer() { // from class: o.vp
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9725vn.l(drM.this, obj);
            }
        }, new Consumer() { // from class: o.vl
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9725vn.t(drM.this, obj);
            }
        }, new Action() { // from class: o.vr
            @Override // io.reactivex.functions.Action
            public final void run() {
                C9725vn.c(drO.this);
            }
        });
        C8632dsu.d(a);
        return a;
    }

    public static final void f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final void c(drO dro) {
        C8632dsu.c((Object) dro, "");
        dro.invoke();
    }

    public static final void l(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final void t(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static /* synthetic */ Disposable c(SingleSubscribeProxy singleSubscribeProxy, drM drm, drM drm2, int i, Object obj) {
        if ((i & 1) != 0) {
            drm = b;
        }
        if ((i & 2) != 0) {
            drm2 = e;
        }
        return d(singleSubscribeProxy, drm, drm2);
    }

    public static final <T> Disposable d(SingleSubscribeProxy<T> singleSubscribeProxy, final drM<? super Throwable, dpR> drm, final drM<? super T, dpR> drm2) {
        C8632dsu.c((Object) singleSubscribeProxy, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drm2, "");
        if (drm == b) {
            Disposable a = singleSubscribeProxy.a(new Consumer() { // from class: o.vw
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C9725vn.s(drM.this, obj);
                }
            });
            C8632dsu.d(a);
            return a;
        }
        Disposable c2 = singleSubscribeProxy.c(new Consumer() { // from class: o.vx
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9725vn.q(drM.this, obj);
            }
        }, new Consumer() { // from class: o.vv
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9725vn.n(drM.this, obj);
            }
        });
        C8632dsu.d(c2);
        return c2;
    }

    public static final void s(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final void n(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final void q(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static /* synthetic */ Disposable d(MaybeSubscribeProxy maybeSubscribeProxy, drM drm, drO dro, drM drm2, int i, Object obj) {
        if ((i & 1) != 0) {
            drm = b;
        }
        if ((i & 2) != 0) {
            dro = c;
        }
        if ((i & 4) != 0) {
            drm2 = e;
        }
        return d(maybeSubscribeProxy, drm, dro, drm2);
    }

    public static final <T> Disposable d(MaybeSubscribeProxy<T> maybeSubscribeProxy, final drM<? super Throwable, dpR> drm, final drO<dpR> dro, final drM<? super T, dpR> drm2) {
        C8632dsu.c((Object) maybeSubscribeProxy, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drm2, "");
        if (drm == b && dro == c) {
            Disposable b2 = maybeSubscribeProxy.b(new Consumer() { // from class: o.vu
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C9725vn.k(drM.this, obj);
                }
            });
            C8632dsu.d(b2);
            return b2;
        }
        Disposable e2 = maybeSubscribeProxy.e(new Consumer() { // from class: o.vs
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9725vn.o(drM.this, obj);
            }
        }, new Consumer() { // from class: o.vt
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9725vn.m(drM.this, obj);
            }
        }, new Action() { // from class: o.vq
            @Override // io.reactivex.functions.Action
            public final void run() {
                C9725vn.a(drO.this);
            }
        });
        C8632dsu.d(e2);
        return e2;
    }

    public static final void k(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final void a(drO dro) {
        C8632dsu.c((Object) dro, "");
        dro.invoke();
    }

    public static final void m(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final void o(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
