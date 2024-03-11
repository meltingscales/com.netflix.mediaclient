package o;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: o.vM  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9698vM {
    public static /* synthetic */ Single e(Single single, int i, long j, drM drm, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            drm = null;
        }
        return d(single, i, j, drm);
    }

    public static final <T> Single<T> d(Single<T> single, int i, long j, drM<? super Integer, dpR> drm) {
        C8632dsu.c((Object) single, "");
        Observable<T> observable = single.toObservable();
        C8632dsu.a(observable, "");
        Single<T> fromObservable = Single.fromObservable(C9693vH.b(observable, i, j, drm));
        C8632dsu.a(fromObservable, "");
        return fromObservable;
    }

    public static final <T> Single<T> e(final drM<? super C9707vV<T>, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        Single<T> create = Single.create(new SingleOnSubscribe() { // from class: o.vN
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                C9698vM.e(drM.this, singleEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) singleEmitter, "");
        drm.invoke(new C9707vV(singleEmitter));
    }
}
