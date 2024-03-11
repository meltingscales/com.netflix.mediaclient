package o;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;

/* renamed from: o.dBb */
/* loaded from: classes5.dex */
public final class C7672dBb {
    public static final <T> dyS<T> d(ObservableSource<T> observableSource) {
        return dyR.c((drX) new RxConvertKt$asFlow$1(observableSource, null));
    }

    public static final <T> Observable<T> d(final dyS<? extends T> dys, final dqZ dqz) {
        return Observable.create(new ObservableOnSubscribe() { // from class: o.dBc
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C7672dBb.c(dqZ.this, dys, observableEmitter);
            }
        });
    }

    public static /* synthetic */ Observable d(dyS dys, dqZ dqz, int i, Object obj) {
        if ((i & 1) != 0) {
            dqz = EmptyCoroutineContext.e;
        }
        return d(dys, dqz);
    }

    public static final void c(dqZ dqz, dyS dys, ObservableEmitter observableEmitter) {
        observableEmitter.setCancellable(new dAW(C8738dws.c(C8769dxw.e, C8752dxf.e().plus(dqz), CoroutineStart.ATOMIC, new RxConvertKt$asObservable$1$job$1(dys, observableEmitter, null))));
    }
}
