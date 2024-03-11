package o;

import io.reactivex.Observable;
import io.reactivex.Observer;

/* renamed from: o.tJ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9616tJ<T> extends Observable<T> {
    protected abstract T a();

    protected abstract void a(Observer<? super T> observer);

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        C8632dsu.d(observer, "");
        a(observer);
        observer.onNext(a());
    }
}
