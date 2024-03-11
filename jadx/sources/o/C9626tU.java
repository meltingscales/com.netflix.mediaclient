package o;

import android.view.View;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: o.tU  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C9626tU extends AbstractC9616tJ<Boolean> {
    private final View d;

    public C9626tU(View view) {
        C8632dsu.d(view, "");
        this.d = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC9616tJ
    /* renamed from: d */
    public Boolean a() {
        return Boolean.valueOf(this.d.hasFocus());
    }

    @Override // o.AbstractC9616tJ
    public void a(Observer<? super Boolean> observer) {
        C8632dsu.d(observer, "");
        e eVar = new e(this.d, observer);
        observer.onSubscribe(eVar);
        this.d.setOnFocusChangeListener(eVar);
    }

    /* renamed from: o.tU$e */
    /* loaded from: classes2.dex */
    static final class e extends MainThreadDisposable implements View.OnFocusChangeListener {
        private final View b;
        private final Observer<? super Boolean> e;

        public e(View view, Observer<? super Boolean> observer) {
            C8632dsu.d(view, "");
            C8632dsu.d(observer, "");
            this.b = view;
            this.e = observer;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C8632dsu.d(view, "");
            if (isDisposed()) {
                return;
            }
            this.e.onNext(Boolean.valueOf(z));
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.b.setOnFocusChangeListener(null);
        }
    }
}
