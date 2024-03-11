package com.netflix.mediaclient.common.ui;

import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.ReplaySubject;
import o.C1044Mm;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public abstract class LifecycleController<T> implements DefaultLifecycleObserver {
    private final PublishSubject<T> a;
    private boolean b;
    private Throwable e;
    private final View f;
    private final PublishSubject<T> g;
    private final ReplaySubject<dpR> h;
    private Throwable i;
    private boolean j;
    public static final c d = new c(null);
    public static final int c = 8;

    public final Observable<T> i() {
        return this.a;
    }

    public final View l() {
        return this.f;
    }

    public final Observable<T> m() {
        return this.g;
    }

    public final Observable<dpR> o() {
        return this.h;
    }

    public LifecycleController(View view) {
        C8632dsu.c((Object) view, "");
        this.f = view;
        PublishSubject<T> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.g = create;
        PublishSubject<T> create2 = PublishSubject.create();
        C8632dsu.a(create2, "");
        this.a = create2;
        ReplaySubject<dpR> create3 = ReplaySubject.create();
        C8632dsu.a(create3, "");
        this.h = create3;
        SubscribersKt.subscribeBy$default(create3, new drM<Throwable, dpR>(this) { // from class: com.netflix.mediaclient.common.ui.LifecycleController.1
            final /* synthetic */ LifecycleController<T> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.e = this;
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                e(th);
                return dpR.c;
            }

            public final void e(Throwable th) {
                C8632dsu.c((Object) th, "");
                ((LifecycleController) this.e).a.onComplete();
                ((LifecycleController) this.e).g.onComplete();
            }
        }, new drO<dpR>(this) { // from class: com.netflix.mediaclient.common.ui.LifecycleController.2
            final /* synthetic */ LifecycleController<T> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.e = this;
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                b();
                return dpR.c;
            }

            public final void b() {
                ((LifecycleController) this.e).a.onComplete();
                ((LifecycleController) this.e).g.onComplete();
            }
        }, (drM) null, 4, (Object) null);
        String simpleName = getClass().getSimpleName();
        C1044Mm.e("LifecycleController", "onCreate " + simpleName);
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    public final void b(T t) {
        C8632dsu.c((Object) t, "");
        if (this.b) {
            throw new IllegalStateException("controller already active ('Caused by' will tell you where it was last activated)", this.e);
        }
        C1044Mm.e("LifecycleController", "onActivated " + t);
        this.b = true;
        this.a.onNext(t);
    }

    public final void e(T t) {
        C8632dsu.c((Object) t, "");
        if (!this.b) {
            throw new IllegalStateException("controller already inactive. ('Caused by' will tell you where it was last deactivated)", this.i);
        }
        C1044Mm.e("LifecycleController", "onDeactivated " + t);
        this.b = false;
        this.g.onNext(t);
    }

    public final void k() {
        if (this.j) {
            throw new IllegalStateException("controller already destroyed");
        }
        String simpleName = getClass().getSimpleName();
        C1044Mm.e("LifecycleController", "onDestroy " + simpleName);
        this.j = true;
        this.h.onNext(dpR.c);
        this.h.onComplete();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        C8632dsu.c((Object) lifecycleOwner, "");
        k();
        super.onDestroy(lifecycleOwner);
    }
}
