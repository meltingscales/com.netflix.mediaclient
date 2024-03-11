package o;

import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes5.dex */
public final class dAZ {
    public static /* synthetic */ Completable d(dqZ dqz, drX drx, int i, Object obj) {
        if ((i & 1) != 0) {
            dqz = EmptyCoroutineContext.e;
        }
        return e(dqz, drx);
    }

    public static final Completable e(dqZ dqz, drX<? super dwU, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        if (dqz.get(dxD.b) != null) {
            throw new IllegalArgumentException(("Completable context cannot contain job in it. Its lifecycle should be managed via Disposable handle. Had " + dqz).toString());
        }
        return e(C8769dxw.e, dqz, drx);
    }

    private static final Completable e(final dwU dwu, final dqZ dqz, final drX<? super dwU, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return Completable.create(new CompletableOnSubscribe() { // from class: o.dAY
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(CompletableEmitter completableEmitter) {
                dAZ.b(dwU.this, dqz, drx, completableEmitter);
            }
        });
    }

    public static final void b(dwU dwu, dqZ dqz, drX drx, CompletableEmitter completableEmitter) {
        C7671dBa c7671dBa = new C7671dBa(dwP.a(dwu, dqz), completableEmitter);
        completableEmitter.setCancellable(new dAW(c7671dBa));
        c7671dBa.e(CoroutineStart.DEFAULT, (CoroutineStart) c7671dBa, (drX<? super CoroutineStart, ? super InterfaceC8585dra<? super T>, ? extends Object>) drx);
    }
}
