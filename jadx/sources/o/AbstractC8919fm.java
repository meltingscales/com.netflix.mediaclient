package o;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.airbnb.mvrx.BaseMvRxViewModel$execute$7;
import com.airbnb.mvrx.BaseMvRxViewModel$selectSubscribe$1;
import com.airbnb.mvrx.BaseMvRxViewModel$selectSubscribe$7;
import com.airbnb.mvrx.MavericksBlockExecutions;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import o.AbstractC8899fS;
import o.AbstractC8918fl;
import o.AbstractC8919fm;
import o.C8632dsu;
import o.C8927fu;
import o.C8932fz;
import o.C8971gl;
import o.InterfaceC8888fH;
import o.dpR;
import o.drM;
import o.drX;
import o.dxD;

/* renamed from: o.fm  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8919fm<S extends InterfaceC8888fH> extends AbstractC8899fS<S> {
    private final InterfaceC8554dpx a;
    private final CompositeDisposable b;
    @SuppressLint({"VisibleForTests"})
    private final LifecycleRegistry c;
    private final LifecycleOwner e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8919fm(S s) {
        super(s, null, 2, null);
        InterfaceC8554dpx b;
        C8632dsu.c((Object) s, "");
        b = dpB.b(new drO<String>(this) { // from class: com.airbnb.mvrx.BaseMvRxViewModel$tag$2
            final /* synthetic */ AbstractC8919fm<S> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.b = this;
            }

            @Override // o.drO
            /* renamed from: e */
            public final String invoke() {
                return this.b.getClass().getSimpleName();
            }
        });
        this.a = b;
        this.b = new CompositeDisposable();
        a aVar = new a(this);
        this.e = aVar;
        LifecycleRegistry createUnsafe = LifecycleRegistry.Companion.createUnsafe(aVar);
        createUnsafe.setCurrentState(Lifecycle.State.RESUMED);
        this.c = createUnsafe;
    }

    /* renamed from: o.fm$a */
    /* loaded from: classes2.dex */
    public static final class a implements LifecycleOwner {
        final /* synthetic */ AbstractC8919fm<S> a;

        a(AbstractC8919fm<S> abstractC8919fm) {
            this.a = abstractC8919fm;
        }

        @Override // androidx.lifecycle.LifecycleOwner
        public Lifecycle getLifecycle() {
            return ((AbstractC8919fm) this.a).c;
        }
    }

    @Override // o.AbstractC8899fS
    public void d() {
        super.d();
        this.b.dispose();
        this.c.setCurrentState(Lifecycle.State.DESTROYED);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Disposable b(Single<T> single, drX<? super S, ? super AbstractC8918fl<? extends T>, ? extends S> drx) {
        C8632dsu.c((Object) single, "");
        C8632dsu.c((Object) drx, "");
        Observable<T> observable = single.toObservable();
        C8632dsu.a(observable, "");
        return a(observable, new drM<T, T>() { // from class: com.airbnb.mvrx.BaseMvRxViewModel$execute$1
            @Override // o.drM
            public final T invoke(T t) {
                return t;
            }
        }, (drM) null, drx);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Disposable e(Observable<T> observable, drX<? super S, ? super AbstractC8918fl<? extends T>, ? extends S> drx) {
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) drx, "");
        return a(observable, new drM<T, T>() { // from class: com.airbnb.mvrx.BaseMvRxViewModel$execute$2
            @Override // o.drM
            public final T invoke(T t) {
                return t;
            }
        }, (drM) null, drx);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T, V> Disposable a(Observable<T> observable, final drM<? super T, ? extends V> drm, final drM<? super T, ? extends Object> drm2, final drX<? super S, ? super AbstractC8918fl<? extends V>, ? extends S> drx) {
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drx, "");
        MavericksBlockExecutions e = c().e(this);
        if (e != MavericksBlockExecutions.No) {
            if (e == MavericksBlockExecutions.WithLoading) {
                b((drM) new drM<S, S>() { // from class: com.airbnb.mvrx.BaseMvRxViewModel$execute$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX WARN: Incorrect return type in method signature: (TS;)TS; */
                    @Override // o.drM
                    /* renamed from: e */
                    public final InterfaceC8888fH invoke(InterfaceC8888fH interfaceC8888fH) {
                        C8632dsu.c((Object) interfaceC8888fH, "");
                        return (InterfaceC8888fH) drx.invoke(interfaceC8888fH, new C8932fz(null, 1, null));
                    }
                });
            }
            Disposable disposed = Disposables.disposed();
            C8632dsu.a(disposed, "");
            return disposed;
        }
        b((drM) new drM<S, S>() { // from class: com.airbnb.mvrx.BaseMvRxViewModel$execute$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (TS;)TS; */
            @Override // o.drM
            /* renamed from: c */
            public final InterfaceC8888fH invoke(InterfaceC8888fH interfaceC8888fH) {
                C8632dsu.c((Object) interfaceC8888fH, "");
                return (InterfaceC8888fH) drx.invoke(interfaceC8888fH, new C8932fz(null, 1, null));
            }
        });
        final drM<T, AbstractC8918fl<? extends V>> drm3 = new drM<T, AbstractC8918fl<? extends V>>() { // from class: com.airbnb.mvrx.BaseMvRxViewModel$execute$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final AbstractC8918fl<V> invoke(T t) {
                C8971gl c8971gl = new C8971gl(drm.invoke(t));
                drM<T, Object> drm4 = drm2;
                c8971gl.c(drm4 != null ? drm4.invoke(t) : null);
                return c8971gl;
            }
        };
        Observable<R> map = observable.map(new Function() { // from class: o.fq
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                AbstractC8918fl b;
                b = AbstractC8919fm.b(drM.this, obj);
                return b;
            }
        });
        final BaseMvRxViewModel$execute$7 baseMvRxViewModel$execute$7 = new drM<Throwable, AbstractC8918fl<? extends V>>() { // from class: com.airbnb.mvrx.BaseMvRxViewModel$execute$7
            @Override // o.drM
            /* renamed from: b */
            public final AbstractC8918fl<V> invoke(Throwable th) {
                C8632dsu.c((Object) th, "");
                return new C8927fu(th, null, 2, null);
            }
        };
        Observable onErrorReturn = map.onErrorReturn(new Function() { // from class: o.fn
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                AbstractC8918fl d;
                d = AbstractC8919fm.d(drM.this, obj);
                return d;
            }
        });
        final drM<AbstractC8918fl<? extends V>, dpR> drm4 = new drM<AbstractC8918fl<? extends V>, dpR>(this) { // from class: com.airbnb.mvrx.BaseMvRxViewModel$execute$8
            final /* synthetic */ AbstractC8919fm<S> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.b = this;
            }

            public final void c(final AbstractC8918fl<? extends V> abstractC8918fl) {
                AbstractC8899fS abstractC8899fS = this.b;
                final drX<S, AbstractC8918fl<? extends V>, S> drx2 = drx;
                abstractC8899fS.b((drM) new drM<S, S>() { // from class: com.airbnb.mvrx.BaseMvRxViewModel$execute$8.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX WARN: Incorrect return type in method signature: (TS;)TS; */
                    @Override // o.drM
                    /* renamed from: d */
                    public final InterfaceC8888fH invoke(InterfaceC8888fH interfaceC8888fH) {
                        C8632dsu.c((Object) interfaceC8888fH, "");
                        AbstractC8918fl<V> abstractC8918fl2 = abstractC8918fl;
                        C8632dsu.a(abstractC8918fl2, "");
                        return (InterfaceC8888fH) drx2.invoke(interfaceC8888fH, abstractC8918fl2);
                    }
                });
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Object obj) {
                c((AbstractC8918fl) obj);
                return dpR.c;
            }
        };
        Disposable subscribe = onErrorReturn.subscribe(new Consumer() { // from class: o.fo
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC8919fm.h(drM.this, obj);
            }
        });
        C8632dsu.a(subscribe, "");
        return b(subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC8918fl b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        return (AbstractC8918fl) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC8918fl d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        return (AbstractC8918fl) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final <A> Disposable c(dtE<S, ? extends A> dte, drM<? super A, dpR> drm) {
        C8632dsu.c((Object) dte, "");
        C8632dsu.c((Object) drm, "");
        return c(C8960ga.c(this, null, dte, null, new BaseMvRxViewModel$selectSubscribe$1(drm, null), 4, null));
    }

    public final <A, B, C> Disposable c(dtE<S, ? extends A> dte, dtE<S, ? extends B> dte2, dtE<S, ? extends C> dte3, InterfaceC8612dsa<? super A, ? super B, ? super C, dpR> interfaceC8612dsa) {
        C8632dsu.c((Object) dte, "");
        C8632dsu.c((Object) dte2, "");
        C8632dsu.c((Object) dte3, "");
        C8632dsu.c((Object) interfaceC8612dsa, "");
        return c(C8960ga.d(this, null, dte, dte2, dte3, null, new BaseMvRxViewModel$selectSubscribe$7(interfaceC8612dsa, null), 16, null));
    }

    public final Disposable b(Disposable disposable) {
        C8632dsu.c((Object) disposable, "");
        this.b.add(disposable);
        return disposable;
    }

    private final Disposable c(final dxD dxd) {
        Disposable fromAction = Disposables.fromAction(new Action() { // from class: o.fp
            @Override // io.reactivex.functions.Action
            public final void run() {
                AbstractC8919fm.b(dxD.this);
            }
        });
        C8632dsu.a(fromAction, "");
        return fromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(dxD dxd) {
        C8632dsu.c((Object) dxd, "");
        dxD.b.b(dxd, null, 1, null);
    }
}
