package kotlinx.coroutines.rx2;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drO;
import o.drX;
import o.dyA;
import o.dyD;
import o.dyI;
import o.dyK;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class RxConvertKt$asFlow$1<T> extends SuspendLambda implements drX<dyK<? super T>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ ObservableSource<T> a;
    private /* synthetic */ Object b;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxConvertKt$asFlow$1(ObservableSource<T> observableSource, InterfaceC8585dra<? super RxConvertKt$asFlow$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = observableSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        RxConvertKt$asFlow$1 rxConvertKt$asFlow$1 = new RxConvertKt$asFlow$1(this.a, interfaceC8585dra);
        rxConvertKt$asFlow$1.b = obj;
        return rxConvertKt$asFlow$1;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dyK<? super T> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((RxConvertKt$asFlow$1) create(dyk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            dyK dyk = (dyK) this.b;
            final AtomicReference atomicReference = new AtomicReference();
            this.a.subscribe(new b(dyk, atomicReference));
            drO<dpR> dro = new drO<dpR>() { // from class: kotlinx.coroutines.rx2.RxConvertKt$asFlow$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public final void e() {
                    Disposable andSet = atomicReference.getAndSet(Disposables.disposed());
                    if (andSet != null) {
                        andSet.dispose();
                    }
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }
            };
            this.e = 1;
            if (dyD.d(dyk, dro, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }

    /* loaded from: classes5.dex */
    public static final class b implements Observer<T> {
        final /* synthetic */ AtomicReference<Disposable> d;
        final /* synthetic */ dyK<T> e;

        /* JADX WARN: Multi-variable type inference failed */
        b(dyK<? super T> dyk, AtomicReference<Disposable> atomicReference) {
            this.e = dyk;
            this.d = atomicReference;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            dyI.e.a(this.e, null, 1, null);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.d, null, disposable)) {
                return;
            }
            disposable.dispose();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            try {
                dyA.c(this.e, t);
            } catch (InterruptedException unused) {
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.e.b(th);
        }
    }
}
