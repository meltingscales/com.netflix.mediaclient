package o;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* renamed from: o.dBe */
/* loaded from: classes5.dex */
public final class C7675dBe {
    public static /* synthetic */ Observable e(dqZ dqz, drX drx, int i, Object obj) {
        if ((i & 1) != 0) {
            dqz = EmptyCoroutineContext.e;
        }
        return c(dqz, drx);
    }

    public static final <T> Observable<T> c(dqZ dqz, drX<? super dyK<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        if (dqz.get(dxD.b) != null) {
            throw new IllegalArgumentException(("Observable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + dqz).toString());
        }
        return c(C8769dxw.e, dqz, drx);
    }

    private static final <T> Observable<T> c(final dwU dwu, final dqZ dqz, final drX<? super dyK<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return Observable.create(new ObservableOnSubscribe() { // from class: o.dBf
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C7675dBe.c(dwU.this, dqz, drx, observableEmitter);
            }
        });
    }

    public static final void c(dwU dwu, dqZ dqz, drX drx, ObservableEmitter observableEmitter) {
        C7674dBd c7674dBd = new C7674dBd(dwP.a(dwu, dqz), observableEmitter);
        observableEmitter.setCancellable(new dAW(c7674dBd));
        c7674dBd.e(CoroutineStart.DEFAULT, (CoroutineStart) c7674dBd, (drX<? super CoroutineStart, ? super InterfaceC8585dra<? super T>, ? extends Object>) drx);
    }
}
