package o;

import android.view.View;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.tQ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9622tQ extends Observable<dpR> {
    private final boolean c;
    private final View e;

    public C9622tQ(View view, boolean z) {
        C8632dsu.d(view, "");
        this.e = view;
        this.c = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super dpR> observer) {
        C8632dsu.d(observer, "");
        if (C9617tL.c(observer)) {
            d dVar = new d(this.e, this.c, observer);
            observer.onSubscribe(dVar);
            this.e.addOnAttachStateChangeListener(dVar);
        }
    }

    /* renamed from: o.tQ$d */
    /* loaded from: classes2.dex */
    static final class d extends MainThreadDisposable implements View.OnAttachStateChangeListener {
        private final View b;
        private final Observer<? super dpR> d;
        private final boolean e;

        public d(View view, boolean z, Observer<? super dpR> observer) {
            C8632dsu.d(view, "");
            C8632dsu.d(observer, "");
            this.b = view;
            this.e = z;
            this.d = observer;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C8632dsu.d(view, "");
            if (!this.e || isDisposed()) {
                return;
            }
            this.d.onNext(dpR.c);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C8632dsu.d(view, "");
            if (this.e || isDisposed()) {
                return;
            }
            this.d.onNext(dpR.c);
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.b.removeOnAttachStateChangeListener(this);
        }
    }
}
