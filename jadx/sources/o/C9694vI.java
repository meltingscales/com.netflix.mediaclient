package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.concurrent.CancellationException;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.vI  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9694vI {

    /* renamed from: o.vI$d */
    /* loaded from: classes2.dex */
    public static final class d<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner b;

        public d(LifecycleOwner lifecycleOwner) {
            this.b = lifecycleOwner;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            LifecycleOwner lifecycleOwner = this.b;
            if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                observableEmitter.onNext(dpR.c);
                observableEmitter.onComplete();
                return;
            }
            this.b.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.android.kotlinx.LifecycleOwnerKt$createDestroyObservable$1$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner2) {
                    C8632dsu.c((Object) lifecycleOwner2, "");
                    if (!observableEmitter.isDisposed()) {
                        observableEmitter.onNext(dpR.c);
                        try {
                            observableEmitter.onComplete();
                        } catch (CancellationException unused) {
                        }
                    }
                    super.onDestroy(lifecycleOwner2);
                }
            });
        }
    }

    public static final Observable<dpR> a(LifecycleOwner lifecycleOwner) {
        Observable<dpR> subscribeOn = Observable.create(new d(lifecycleOwner)).subscribeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(subscribeOn, "");
        return subscribeOn;
    }
}
