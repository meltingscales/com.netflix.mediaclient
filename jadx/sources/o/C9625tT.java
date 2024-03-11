package o;

import android.view.View;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.tT  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9625tT extends Observable<Integer> {
    private final View c;

    public C9625tT(View view) {
        C8632dsu.d(view, "");
        this.c = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Integer> observer) {
        C8632dsu.d(observer, "");
        if (C9617tL.c(observer)) {
            b bVar = new b(this.c, observer);
            observer.onSubscribe(bVar);
            this.c.setOnSystemUiVisibilityChangeListener(bVar);
        }
    }

    /* renamed from: o.tT$b */
    /* loaded from: classes2.dex */
    static final class b extends MainThreadDisposable implements View.OnSystemUiVisibilityChangeListener {
        private final Observer<? super Integer> a;
        private final View e;

        public b(View view, Observer<? super Integer> observer) {
            C8632dsu.d(view, "");
            C8632dsu.d(observer, "");
            this.e = view;
            this.a = observer;
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if (isDisposed()) {
                return;
            }
            this.a.onNext(Integer.valueOf(i));
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.e.setOnSystemUiVisibilityChangeListener(null);
        }
    }
}
