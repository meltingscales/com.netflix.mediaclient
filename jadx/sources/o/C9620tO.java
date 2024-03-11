package o;

import android.view.View;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.tO  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9620tO extends Observable<dpR> {
    private final View e;

    public C9620tO(View view) {
        C8632dsu.d(view, "");
        this.e = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super dpR> observer) {
        C8632dsu.d(observer, "");
        if (C9617tL.c(observer)) {
            a aVar = new a(this.e, observer);
            observer.onSubscribe(aVar);
            this.e.setOnClickListener(aVar);
        }
    }

    /* renamed from: o.tO$a */
    /* loaded from: classes2.dex */
    static final class a extends MainThreadDisposable implements View.OnClickListener {
        private final View a;
        private final Observer<? super dpR> e;

        public a(View view, Observer<? super dpR> observer) {
            C8632dsu.d(view, "");
            C8632dsu.d(observer, "");
            this.a = view;
            this.e = observer;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C8632dsu.d(view, "");
            if (isDisposed()) {
                return;
            }
            this.e.onNext(dpR.c);
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.a.setOnClickListener(null);
        }
    }
}
