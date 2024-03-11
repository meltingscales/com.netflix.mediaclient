package o;

import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* renamed from: o.dBj */
/* loaded from: classes5.dex */
public final class C7680dBj {
    public static /* synthetic */ Single e(dqZ dqz, drX drx, int i, Object obj) {
        if ((i & 1) != 0) {
            dqz = EmptyCoroutineContext.e;
        }
        return a(dqz, drx);
    }

    public static final <T> Single<T> a(dqZ dqz, drX<? super dwU, ? super InterfaceC8585dra<? super T>, ? extends Object> drx) {
        if (dqz.get(dxD.b) != null) {
            throw new IllegalArgumentException(("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + dqz).toString());
        }
        return c(C8769dxw.e, dqz, drx);
    }

    private static final <T> Single<T> c(final dwU dwu, final dqZ dqz, final drX<? super dwU, ? super InterfaceC8585dra<? super T>, ? extends Object> drx) {
        return Single.create(new SingleOnSubscribe() { // from class: o.dBh
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                C7680dBj.b(dwU.this, dqz, drx, singleEmitter);
            }
        });
    }

    public static final void b(dwU dwu, dqZ dqz, drX drx, SingleEmitter singleEmitter) {
        C7681dBk c7681dBk = new C7681dBk(dwP.a(dwu, dqz), singleEmitter);
        singleEmitter.setCancellable(new dAW(c7681dBk));
        c7681dBk.e(CoroutineStart.DEFAULT, (CoroutineStart) c7681dBk, (drX<? super CoroutineStart, ? super InterfaceC8585dra<? super T>, ? extends Object>) drx);
    }
}
